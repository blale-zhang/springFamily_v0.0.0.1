<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<!-- TODO: Auto-generated template -->
	</xsl:template>


	<xsl:template match="//links/link">
		<xsl:for-each select=".">
			<link>
				<xsl:attribute name="rel">
					<xsl:value-of select="./rel"></xsl:value-of>
				</xsl:attribute>

				<xsl:attribute name="type">
					<xsl:value-of select="./type"></xsl:value-of>
				</xsl:attribute>

				<xsl:attribute name="src">
					<xsl:value-of select="./src"></xsl:value-of>
				</xsl:attribute>
			</link>
		</xsl:for-each>





	</xsl:template>
</xsl:stylesheet>