<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
    
    <xsl:key name="cidades" match="cidade" use="@id"/>
    
    <xsl:template match="/">
        
        <!-- Geração da página de índice --> 
        <xsl:result-document href="mapa/index.html">
            <head>
                <link rel="stylesheet" type="text/css" href="style.css"/>
            </head>
            <body>
                <header>
            <h3>Índice de Cidades</h3></header>
            <section class="indice"><ul>
                <xsl:apply-templates select="//cidades" mode="indice">
                    <xsl:sort select="nome"/>
                </xsl:apply-templates>
            </ul></section></body>
        </xsl:result-document>
        
        <!-- Geração das páginas das cidades -->        
        <xsl:apply-templates select="mapa/cidades"/>
        
    </xsl:template>
    
    <!-- Página de cidade -->
    <xsl:template match="cidade">
        <xsl:result-document href="mapa/{@id}.html">
            <xsl:variable name="c" select="@id"/>
            <head>
                <link rel="stylesheet" type="text/css" href="style.css"/>
            </head>
            <body>
                <header>
                <h3>
                    <xsl:value-of select="nome"/>
                </h3>
                <p><b>Descrição: </b> <xsl:value-of select="descricao"/></p>
                <p><b>População: </b> <xsl:value-of select="populacao"/></p>
                </header>
                <nav>
                    <a href="index.html">Voltar ao índice</a>
                </nav>
                <section>
                    <h4>Ligações</h4>
                    <ul>
                        <xsl:apply-templates select="/mapa/ligacoes/ligacao[origem/@cidade=$c]" mode="lig_directas"/>
                    </ul>
                </section>
                <section class="inversas">
                    <h4>Ligações inversas</h4>
                    <ul>
                        <xsl:apply-templates select="/mapa/ligacoes/ligacao[destino/@cidade=$c]" mode="lig_inversas"/>
                        <br/>
                    </ul>            
                </section>
            </body>
        </xsl:result-document>
    </xsl:template>
    
    <!-- Ligações -->
    <xsl:template match="ligacao" mode="lig_directas">
        <li>
            <b>Cidade: </b> 
            <a href="{destino/@cidade}.html">
                <xsl:value-of select="key('cidades', destino/@cidade)/nome"/>
            </a>
            <br/><br/>
            <center><b>Distância: </b> <xsl:value-of select="distancia"></xsl:value-of></center>
            <br/>
        </li>
    </xsl:template>
    <xsl:template match="ligacao" mode="lig_inversas">
        <li>
            <b>Cidade: </b> 
            <a href="{origem/@cidade}.html">
                <xsl:value-of select="key('cidades', origem/@cidade)/nome"/>
            </a>
            <br/><br/>
            <center><b>Distância: </b> <xsl:value-of select="distancia"></xsl:value-of> km</center>
            <br/>
        </li>
    </xsl:template>
    
    <!-- Índice -->    
    <xsl:template match="cidade" mode="indice">
        <li>
            <a href="{@id}.html">
                <xsl:value-of select="nome"/>
            </a>
        </li>
    </xsl:template>
    
</xsl:stylesheet>
