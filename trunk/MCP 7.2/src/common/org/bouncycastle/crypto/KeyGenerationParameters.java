package org.bouncycastle.crypto;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import java.security.SecureRandom;

@SideOnly(Side.CLIENT)
public class KeyGenerationParameters
{
    private SecureRandom field_71845_a;
    private int field_71844_b;

    public KeyGenerationParameters(SecureRandom par1SecureRandom, int par2)
    {
        this.field_71845_a = par1SecureRandom;
        this.field_71844_b = par2;
    }

    public SecureRandom func_71843_a()
    {
        return this.field_71845_a;
    }

    public int func_71842_b()
    {
        return this.field_71844_b;
    }
}
