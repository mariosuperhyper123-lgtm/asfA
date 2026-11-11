package dev.nova.client.util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;

/**
 * Alle Stellen, an denen sich die Minecraft-API zwischen Versionen gern ändert, an einem Ort.
 * Seit 26.2 liegen Bildschirme in {@code Minecraft.gui}.
 */
public final class Compat {
    private Compat() {}

    public static Minecraft mc() {
        return Minecraft.getInstance();
    }

    public static Screen screen() {
        return mc().gui.screen();
    }

    public static void setScreen(Screen screen) {
        mc().gui.setScreen(screen);
    }

    public static float guiScale() {
        return (float) mc().getWindow().getGuiScale();
    }
}
