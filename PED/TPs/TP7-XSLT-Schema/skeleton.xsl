<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
    
    
    
    <xsl:template match="/">
        <html>
            <head>
                <script type="text/javascript" src="assets/jquery.js"></script>
                <script type="text/javascript" src="assets/form.js"></script>
            </head>
            <body>
                <xsl:apply-templates/>
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="/xs:schema/xs:element[@name='supervision']">
        <form action="add-{@name}.php" method="post">
            <fieldset id="supervision1" ><legend>Supervision</legend>
            <xsl:apply-templates/>
            <br/>
            </fieldset>
            <a id="addSupervision" style="color:#a23;">Adicionar supervisão</a>
            <a id="rmSupervision" style="color:#a23;">Remover supervisão</a>
            <input type="hidden" name="supcount" id="supcount" value="1"/>
            <input type="submit"/>
        </form>
    </xsl:template>
    
    <xsl:template match="/xs:schema/xs:element[@name='supervisions']">
        
    </xsl:template>
    
    <xsl:template match="xs:element[count(./*)=0]" priority="-1">
        
            <xsl:value-of  select="@name"></xsl:value-of>
            <input type="text" name="{@name}1"/>
    </xsl:template>
    
    <xsl:template match="xs:element[not(count(./*)=0)]" priority="-1">
        
        <fieldset>
            <legend><xsl:value-of select="@name"/></legend>
            <xsl:apply-templates/>
        </fieldset>
    </xsl:template>
    
   
    
</xsl:stylesheet>