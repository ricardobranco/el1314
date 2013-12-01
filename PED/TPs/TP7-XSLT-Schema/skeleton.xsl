<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
    
    
    
    <xsl:template match="/">
        <html>
            <head></head>
            <body>
                <xsl:apply-templates/>
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="/xs:schema/xs:element[@name='supervision']">
        <form action="add-{@name}.php">
            <xsl:apply-templates/>
            <br/>
            <input type="submit"/>
        </form>
    </xsl:template>
    
    <xsl:template match="/xs:schema/xs:element[@name='supervisions']">
        
    </xsl:template>
    
    <xsl:template match="xs:element[count(./*)=0]" priority="-1">
        
            <xsl:value-of  select="@name"></xsl:value-of>
            <input type="text" name="{@name}"/>
    </xsl:template>
    
    <xsl:template match="xs:element[not(count(./*)=0)]" priority="-1">
        
        <fieldset>
            <legend><xsl:value-of select="@name"/></legend>
            <xsl:apply-templates/>
        </fieldset>
    </xsl:template>
    
   
    
</xsl:stylesheet>