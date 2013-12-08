<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
    
    <xsl:output method="text"/>
    <xsl:strip-space elements="*"/>
    
    <xsl:key name="elements" match="xs:element" use="@name"/>
    
    <xsl:template match="/">
        <xsl:apply-templates/>
            CREATE TABLE insts (
                inst TEXT,
                id INTEGER PRIMARY KEY
            );
    </xsl:template>
    
    <xsl:template match="//xs:element">
        <xsl:if test="not(@type) and not(./xs:complexType/xs:simpleContent)">
            CREATE TABLE <xsl:value-of select="@name"/>s (
            <xsl:for-each select="key('elements', @name)/xs:complexType/xs:sequence/xs:element">
            <xsl:if test="not(@type) and not(./xs:complexType/xs:simpleContent)">
                <xsl:value-of select="@name"/>_id &#160; INTEGER,
            </xsl:if>
                
            <xsl:if test="not(@type) and ./xs:complexType/xs:simpleContent">
                <xsl:apply-templates/>
            </xsl:if>
                
            <xsl:if test="@type">
                <xsl:if test="@name='id'">_<xsl:value-of select="@name"/></xsl:if>
                <xsl:if test="@name!='id'"><xsl:value-of select="@name"/></xsl:if>
                <xsl:if test="@name!='inst'">&#160; <xsl:choose>
                    <xsl:when test="@type = 'xs:string'">TEXT</xsl:when>
                    <xsl:when test="@type = 'xs:date'">TEXT</xsl:when>
                    <xsl:when test="@type = 'xs:ID'">INTEGER</xsl:when>
                    <xsl:when test="@type = 'xs:anyURI'">TEXT</xsl:when>
                </xsl:choose>,
            </xsl:if>
                <xsl:if test="@name='inst'">_id &#160; INTEGER, 
            </xsl:if>
            </xsl:if>
            </xsl:for-each>
            
            <xsl:for-each select="key('elements', @name)/xs:complexType/xs:attribute">
                <xsl:value-of select="@name"/>_id &#160; INTEGER, 
            </xsl:for-each>
            id INTEGER PRIMARY KEY
            );
            <xsl:apply-templates/>
        </xsl:if>
        
    </xsl:template>
    
    <xsl:template match="//xs:extension/xs:attribute">
        <xsl:value-of select="../../../../@name"/> &#160; <xsl:choose>
            <xsl:when test="@type = 'xs:string'">TEXT</xsl:when>
            <xsl:when test="@type = 'xs:date'">TEXT</xsl:when>
            <xsl:when test="@type = 'xs:ID'">INTEGER</xsl:when>
            <xsl:when test="@type = 'xs:anyURI'">TEXT</xsl:when>
        </xsl:choose>,
            </xsl:template>
    
        <xsl:template match="//xs:simpleType">
            CREATE TABLE <xsl:value-of select="@name"/>s (
            <xsl:value-of select="@name"/> &#160; <xsl:choose>
            <xsl:when test="xs:restriction/@base = 'xs:string'">TEXT</xsl:when>
            <xsl:when test="xs:restriction/@base = 'xs:date'">TEXT</xsl:when>
            <xsl:when test="xs:restriction/@base = 'xs:ID'">INTEGER</xsl:when>
            <xsl:when test="xs:restriction/@base = 'xs:anyURI'">TEXT</xsl:when>
            </xsl:choose>,
            
            id INTEGER PRIMARY KEY
            );
        </xsl:template>

</xsl:stylesheet>