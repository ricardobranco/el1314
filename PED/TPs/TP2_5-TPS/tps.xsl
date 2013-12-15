<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="1.0">
    
    <xsl:template match="/">
        <html>
            <head>
                <link rel="stylesheet" type="text/css" href="style.css"/>
            </head>
            <body>
                <xsl:apply-templates select="trabalhos"/>
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="trabalhos">
        <div class="index">
            <ol>
                <xsl:apply-templates select="grupo" mode="index"/>
            </ol> 
        </div>
        <div class="workgroups">
            <xsl:apply-templates select="/trabalhos/grupo" mode="body"/> 
         </div>
    </xsl:template>
    
    <xsl:template mode="index" match="grupo" >
        <li>
            <a href="#{concat(aluno1/numero1,aluno2/numero2,aluno3/numero3)}">
                <xsl:apply-templates select="aluno1|aluno2|aluno3" mode="index"/>
            </a>
           
        </li>
    </xsl:template>
    
    <xsl:template match="aluno1|aluno2|aluno3" mode="index">
        
        <xsl:apply-templates select="numero1|numero2|numero3" mode="index"/>
    </xsl:template>
    <xsl:template match="numero1|numero2|numero3" mode="index">
        <xsl:if test="string-length(.) &gt; 0">
            <xsl:if test="not(name()='numero1')">
                -
            </xsl:if>
            <xsl:value-of select="."/>
        </xsl:if>
       
    </xsl:template>
  
    <xsl:template match="grupo" mode="body">
        <a name="{concat(aluno1/numero1,aluno2/numero2,aluno3/numero3)}"/>
        <xsl:variable name="currentCount">
            <xsl:number/>
        </xsl:variable>
        <h1>
            Grupo <xsl:value-of select="$currentCount"/> 
        </h1>
        <h2>Identificação</h2>
        <xsl:if test="aluno1|aluno2|aluno3">
            <xsl:apply-templates select="aluno1|aluno2|aluno3" mode="body" />
        </xsl:if>
        <h2>Trabalho</h2>
        Título: <xsl:value-of select="titulo"/><br/>
        Data: <xsl:value-of select="data"/><br/>
        Ficheiro: <xsl:if test="file-env">
            <a href="{file-env}"><xsl:value-of select="file"/></a>
        </xsl:if>
        <xsl:if test="not(file-env)">
            <xsl:value-of select="file"/>
        </xsl:if>
    </xsl:template>
    
    <xsl:template mode="body" match="aluno1|aluno2|aluno3">
        <xsl:apply-templates mode="body"/>
        <br/>
    </xsl:template>
    
    <xsl:template mode="body" match="numero1|numero2|numero3">
        <xsl:if test="string-length(.) &gt; 0">
            Número: <xsl:value-of select="."/><br/>
        </xsl:if>
    </xsl:template>
    
    <xsl:template mode="body" match="curso1|curso2|curso3">
        <xsl:if test="string-length(.) &gt; 0">
            Curso: <xsl:value-of select="."/><br/>
        </xsl:if>
    </xsl:template>
    
    <xsl:template mode="body" match="nome1|nom2|nome3">
        <xsl:if test="string-length(.) &gt; 0">
            Nome: <xsl:value-of select="."/><br/>
        </xsl:if>
    </xsl:template>
    
</xsl:stylesheet>
