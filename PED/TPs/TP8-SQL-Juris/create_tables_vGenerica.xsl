<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
    
    <xsl:output method="text"/>
    <xsl:strip-space elements="*"/>
    
    <xsl:key name="elements" match="xs:element" use="@name"/>
    
    <xsl:template match="/xs:schema/xs:element">
            CREATE TABLE <xsl:value-of select="@name"/>s (
            <xsl:apply-templates/>
            ID INTEGER PRIMARY KEY   AUTOINCREMENT
            );
    </xsl:template>
    
    <xsl:template match="xs:element">
        <xsl:value-of select="@name"/> &#160; <xsl:choose>
            <xsl:when test="@type = 'xs:string'">TEXT</xsl:when>
            <xsl:when test="@type = 'xs:date'">TEXT</xsl:when>
            <xsl:when test="@type = 'xs:ID'">INTEGER</xsl:when>
            <xsl:when test="@type = 'xs:anyURI'">TEXT</xsl:when>
        </xsl:choose>,
            </xsl:template>
    
    <xsl:template match="//xs:extension/xs:attribute">
        <xsl:value-of select="@name"/> &#160; <xsl:choose>
            <xsl:when test="@type = 'xs:string'">TEXT</xsl:when>
            <xsl:when test="@type = 'xs:date'">TEXT</xsl:when>
            <xsl:when test="@type = 'xs:ID'">INTEGER</xsl:when>
            <xsl:when test="@type = 'xs:anyURI'">TEXT</xsl:when>
        </xsl:choose>,
            </xsl:template>
    
        <xsl:template match="//xs:simpleType">
            CREATE TABLE <xsl:value-of select="@name"/> (
            <xsl:value-of select="@name"/> &#160; <xsl:choose>
            <xsl:when test="xs:restriction/@base = 'xs:string'">TEXT</xsl:when>
            <xsl:when test="xs:restriction/@base = 'xs:date'">TEXT</xsl:when>
            <xsl:when test="xs:restriction/@base = 'xs:ID'">INTEGER</xsl:when>
            <xsl:when test="xs:restriction/@base = 'xs:anyURI'">TEXT</xsl:when>
            </xsl:choose>,
            
            ID INTEGER PRIMARY KEY   AUTOINCREMENT
            );
        </xsl:template>

</xsl:stylesheet>