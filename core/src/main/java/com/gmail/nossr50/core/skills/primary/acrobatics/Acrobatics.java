package com.gmail.nossr50.core.skills.primary.acrobatics;

import com.gmail.nossr50.config.experience.ExperienceConfig;
import com.gmail.nossr50.core.config.AdvancedConfig;
import com.gmail.nossr50.core.config.Config;

public final class Acrobatics {
    public static double dodgeDamageModifier = AdvancedConfig.getInstance().getDodgeDamageModifier();
    public static int dodgeXpModifier = ExperienceConfig.getInstance().getDodgeXPModifier();
    public static boolean dodgeLightningDisabled = Config.getInstance().getDodgeLightningDisabled();

    private Acrobatics() {
    }

    protected static double calculateModifiedDodgeDamage(double damage, double damageModifier) {
        return Math.max(damage / damageModifier, 1.0);
    }
}