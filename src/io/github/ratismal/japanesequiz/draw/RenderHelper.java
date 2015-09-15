package io.github.ratismal.japanesequiz.draw;

import org.lwjgl.opengl.GL11;
import org.newdawn.slick.*;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

import java.awt.*;
import java.awt.Color;
import java.awt.Font;

/**
 * Created by Ratismal on 2015-09-15.
 */

public class RenderHelper {

    private static Texture texture;
    private static TrueTypeFont font;

    public void initTexture(String resource) {

        try {
            texture = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("src/resources/" + resource + ".png"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void initFont(String resource, int style, int size ) {
        Font awtFont = new Font(resource, style, size);
        font = new TrueTypeFont(awtFont, false);
    }

    public void renderQuad(String resource, int x, int y) {
        org.newdawn.slick.Color.white.bind();
        initTexture(resource);
        texture.bind();

        GL11.glBegin(GL11.GL_QUADS);
        GL11.glTexCoord2f(0,0);
        GL11.glVertex2f(x,y);
        GL11.glTexCoord2f(1,0);
        GL11.glVertex2f(x+texture.getTextureWidth(),y);
        GL11.glTexCoord2f(1,1);
        GL11.glVertex2f(x+texture.getTextureWidth(),y+texture.getTextureHeight());
        GL11.glTexCoord2f(0, 1);
        GL11.glVertex2f(x, y + texture.getTextureHeight());
        GL11.glEnd();

    }

    public void renderQuad(String resource, int x, int y, String text, String fontResource, int style, int size, org.newdawn.slick.Color colour) {
        org.newdawn.slick.Color.white.bind();
        initTexture(resource);
        initFont(fontResource, style, size);
        texture.bind();

        GL11.glBegin(GL11.GL_QUADS);
        GL11.glTexCoord2f(0, 0);
        GL11.glVertex2f(x, y);
        GL11.glTexCoord2f(1, 0);
        GL11.glVertex2f(x + texture.getTextureWidth(), y);
        GL11.glTexCoord2f(1, 1);
        GL11.glVertex2f(x + texture.getTextureWidth(), y + texture.getTextureHeight());
        GL11.glTexCoord2f(0, 1);
        GL11.glVertex2f(x, y + texture.getTextureHeight());
        GL11.glEnd();

        renderString(text, x + texture.getTextureWidth()/2 - font.getWidth(text)/2, y + texture.getTextureHeight()/2 - font.getHeight(text)/2, colour);

    }

    public void renderQuad(String resource, int x, int y, String text, org.newdawn.slick.Color colour) {
        org.newdawn.slick.Color.white.bind();
        initTexture(resource);
        texture.bind();

        GL11.glBegin(GL11.GL_QUADS);
        GL11.glTexCoord2f(0, 0);
        GL11.glVertex2f(x, y);
        GL11.glTexCoord2f(1, 0);
        GL11.glVertex2f(x + texture.getTextureWidth(), y);
        GL11.glTexCoord2f(1, 1);
        GL11.glVertex2f(x + texture.getTextureWidth(), y + texture.getTextureHeight());
        GL11.glTexCoord2f(0, 1);
        GL11.glVertex2f(x, y + texture.getTextureHeight());
        GL11.glEnd();
        //System.out.println(texture.getTextureWidth());
        renderString(text, x + texture.getTextureWidth()/2 - font.getWidth(text)/2, y + texture.getTextureHeight()/2 - font.getHeight(text)/2, colour);

    }

    public void renderString(String text, int x, int y, org.newdawn.slick.Color colour) {
        font.drawString(x, y, text, colour);
    }
}
