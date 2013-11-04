<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
    
    <xsl:template match="/">
        <html>
            <head>
                <link rel="stylesheet" type="text/css" href="style.css"/>
            </head>
            <body>
                <div class="header">
                    <h1><xsl:value-of select="sip/meta/title"/></h1>
                    <xsl:apply-templates select="/sip/meta/subtitle"/>
                </div>
                
                <div class="metadata">
                    
                    <div class="content">
                        <div class="col2">
                            <h3>Information</h3>
                            <ul>
                                <xsl:apply-templates select="/sip/meta/keyname"/>
                                <xsl:apply-templates select="/sip/meta/course"/>
                                <xsl:apply-templates select="/sip/meta/class"/>
                            </ul>
                            <xsl:apply-templates select="/sip/meta/sdate"/>
                            <xsl:apply-templates select="/sip/meta/edate"/>
                        </div>
                        <div class="col2">
                            <xsl:apply-templates select="sip/meta/supervisors "/>
                        </div>
                        <div style="clear: both"></div> 
                    </div>
                    <div class="content">
                        <xsl:apply-templates select="/sip/meta/workteam"/>
                        <div style="clear: both"></div> 
                    </div>
                    <div class="content">
                        <h3>Abstract</h3>
                        <xsl:apply-templates select="/sip/abstract"/>
                        <div style="clear: both"></div> 
                    </div>
                    <div class="content">
                        <h3>Files</h3>
                        <xsl:apply-templates select="/sip/files"/>
                        <div style="clear: both"></div> 
                    </div>
                </div> 
                <div class="footer">
                    <h6>Processamento Estruturado de Documentos :: Engenharia de Linguagens :: Mestrado em Engenharia Informática</h6>
                    <h6>Departamento de Informática :: Universidade do Minho :: 2013</h6>
                </div>
            </body>
        </html>
    </xsl:template>
    
    <!-- meta xsl:templates -->
    
    <xsl:template match="/sip/meta/keyname">
        <li>Keyname: <xsl:apply-templates/></li>
    </xsl:template>
    
    <xsl:template match="/sip/meta/course">
        <li>Course: <xsl:apply-templates/></li>
    </xsl:template>
    
    <xsl:template match="/sip/meta/class">
        <li>Class: <xsl:apply-templates/></li>
    </xsl:template>
    
    <xsl:template match="/sip/meta/sdate">
        Development Period: Since <xsl:apply-templates/>
    </xsl:template>
    
    <xsl:template match="/sip/meta/edate">
         until <xsl:apply-templates/>
    </xsl:template>

    <!-- supervisors and workteam xsl:templates -->
    
    <xsl:template match="/sip/meta/supervisors/supervisor">
        <h3>Supervisors</h3>
        <xsl:apply-templates/>
    </xsl:template>    
    
    <xsl:template match="/sip/meta/workteam">
        <h3>Workteam</h3>
        <xsl:apply-templates select="member"/>
    </xsl:template>
    
    <xsl:template match="/sip/meta/workteam/member">
        <div class="team-member">
            <xsl:apply-templates select="photo"/>
            <div class="member-info"><xsl:apply-templates select="*[not(local-name() = 'photo')]"/></div>
        </div>
    </xsl:template>
    
    <xsl:template match="//name">
        <p>Name: <xsl:apply-templates/></p>
    </xsl:template>
    
    <xsl:template match="//email">
        <p>Email: <a href="mailto:{.}"><xsl:apply-templates/></a></p>
    </xsl:template>
    
    <xsl:template match="//webpage">
        <p>Webpage: <a href="{.}" target="_blank"><xsl:apply-templates/></a></p>
    </xsl:template>
    
    <xsl:template match="/sip/meta/workteam/member/id">
        <p>ID: <xsl:apply-templates/></p>
    </xsl:template>
    
    <xsl:template match="/sip/meta/workteam/member/photo">
        <div class="photo" style="background: url({.}); background-size:cover;"> </div>
    </xsl:template>
     
    <!-- abstract xsl:template -->
  
    <xsl:template match="/sip/abstract/p">
        <p><xsl:apply-templates/></p>
    </xsl:template>
   
    <xsl:template match="/sip/abstract/p/acr">
        <acronym title='{desc}'><xsl:value-of select="abv"/></acronym>
    </xsl:template>
     
    <xsl:template match="/sip/abstract/p/xref">
        <a href="{@uri}" target="_blank"><xsl:apply-templates/></a>
    </xsl:template> 
    
    <!-- Since these elements can be recursive we used the wildcard selector (//) -->
            
    <xsl:template match="//i">
        <i><xsl:apply-templates/></i>
    </xsl:template>
    
    <xsl:template match="//b">
        <b><xsl:apply-templates/></b>
    </xsl:template>
    
    <xsl:template match="//u">
        <u><xsl:apply-templates/></u>
    </xsl:template>    
            
    <!-- files xsl:templates -->
    
    <xsl:template match="/sip/files">
        <ul><xsl:apply-templates select="file"/></ul>
    </xsl:template>
    
    <xsl:template match="/sip/files/file">
        <li> <a href="{@path}" target="_blank"><xsl:value-of select="." /></a><xsl:apply-templates select="@format|@checksum"/></li>
    </xsl:template>
    
    <!-- files xsl:templates for optional attributes  -->
    
    <xsl:template match="/sip/files/file/@format">
        :: Format: <xsl:value-of select="." />
    </xsl:template> 
    
    <xsl:template match="/sip/files/file/@checksum">
        :: Checksum: <xsl:value-of select="." />
    </xsl:template> 
   
   <!-- Handles opcional subtitle element -->
    
    <xsl:template match="/sip/meta/subtitle">
        <h2><xsl:value-of select="."/></h2>
    </xsl:template> 
   
</xsl:stylesheet>
