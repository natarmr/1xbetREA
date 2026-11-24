package a;

/* JADX INFO: loaded from: classes.dex */
public final class a5d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f266a;
    public static final float[] b;
    public static final phs0 c;
    public static final phs0 d;
    public static final ubg0 e;
    public static final ubg0 f;
    public static final ubg0 g;
    public static final ubg0 h;
    public static final ubg0 i;
    public static final ubg0 j;
    public static final ubg0 k;
    public static final ubg0 l;
    public static final ubg0 m;
    public static final ubg0 n;
    public static final ubg0 o;
    public static final ubg0 p;
    public static final ubg0 q;
    public static final ubg0 r;
    public static final tty s;
    public static final tty t;
    public static final ubg0 u;
    public static final ubg0 v;
    public static final ubg0 w;
    public static final rf60 x;
    public static final y4d[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f266a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        phs0 phs0Var = new phs0(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        phs0 phs0Var2 = new phs0(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        phs0 phs0Var3 = new phs0(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = phs0Var3;
        phs0 phs0Var4 = new phs0(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = phs0Var4;
        nav0 nav0Var = j47.s;
        ubg0 ubg0Var = new ubg0("sRGB IEC61966-2.1", fArr, nav0Var, phs0Var, 0);
        e = ubg0Var;
        ubg0 ubg0Var2 = new ubg0("sRGB IEC61966-2.1 (Linear)", fArr, nav0Var, 1.0d, 0.0f, 1.0f, 1);
        f = ubg0Var2;
        ubg0 ubg0Var3 = new ubg0("scRGB-nl IEC 61966-2-2:2003", fArr, nav0Var, null, new c99((byte) 15), new c99((byte) 16), -0.799f, 2.399f, phs0Var, 2);
        g = ubg0Var3;
        ubg0 ubg0Var4 = new ubg0("scRGB IEC 61966-2-2:2003", fArr, nav0Var, 1.0d, -0.5f, 7.499f, 3);
        h = ubg0Var4;
        ubg0 ubg0Var5 = new ubg0("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, nav0Var, new phs0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = ubg0Var5;
        ubg0 ubg0Var6 = new ubg0("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, nav0Var, new phs0(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = ubg0Var6;
        ubg0 ubg0Var7 = new ubg0("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new nav0(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = ubg0Var7;
        ubg0 ubg0Var8 = new ubg0("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, nav0Var, phs0Var, 7);
        l = ubg0Var8;
        double d2 = 0.2222222222222222d;
        double d3 = 0.081d;
        double d4 = 2.2222222222222223d;
        double d5 = 0.9099181073703367d;
        double d6 = 0.09008189262966333d;
        ubg0 ubg0Var9 = new ubg0("NTSC (1953)", fArr2, j47.p, new phs0(d4, d5, d6, d2, d3), 8);
        m = ubg0Var9;
        ubg0 ubg0Var10 = new ubg0("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, nav0Var, new phs0(d4, d5, d6, d2, d3), 9);
        n = ubg0Var10;
        ubg0 ubg0Var11 = new ubg0("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, nav0Var, 2.2d, 0.0f, 1.0f, 10);
        o = ubg0Var11;
        ubg0 ubg0Var12 = new ubg0("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, j47.q, new phs0(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = ubg0Var12;
        nav0 nav0Var2 = j47.r;
        ubg0 ubg0Var13 = new ubg0("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, nav0Var2, 1.0d, -65504.0f, 65504.0f, 12);
        q = ubg0Var13;
        ubg0 ubg0Var14 = new ubg0("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, nav0Var2, 1.0d, -65504.0f, 65504.0f, 13);
        r = ubg0Var14;
        tty ttyVar = new tty("Generic XYZ", 12884901889L, 14, (byte) 1);
        s = ttyVar;
        tty ttyVar2 = new tty("Generic L*a*b*", 12884901890L, 15, (byte) 0);
        t = ttyVar2;
        ubg0 ubg0Var15 = new ubg0("None", fArr, nav0Var, phs0Var2, 16);
        u = ubg0Var15;
        ubg0 ubg0Var16 = new ubg0("Hybrid Log Gamma encoding", fArr3, nav0Var, null, new c99((byte) 17), new c99((byte) 18), 0.0f, 1.0f, phs0Var3, 17);
        v = ubg0Var16;
        ubg0 ubg0Var17 = new ubg0("Perceptual Quantizer encoding", fArr3, nav0Var, null, new c99((byte) 19), new c99((byte) 20), 0.0f, 1.0f, phs0Var4, 18);
        w = ubg0Var17;
        rf60 rf60Var = new rf60("Oklab", 12884901890L, 19);
        x = rf60Var;
        y = new y4d[]{ubg0Var, ubg0Var2, ubg0Var3, ubg0Var4, ubg0Var5, ubg0Var6, ubg0Var7, ubg0Var8, ubg0Var9, ubg0Var10, ubg0Var11, ubg0Var12, ubg0Var13, ubg0Var14, ttyVar, ttyVar2, ubg0Var15, ubg0Var16, ubg0Var17, rf60Var};
    }

    public static double a(phs0 phs0Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = phs0Var.b;
        double d6 = phs0Var.c;
        double d7 = phs0Var.d;
        double d8 = phs0Var.e;
        double d9 = phs0Var.f;
        double d10 = d5 * d4;
        return (phs0Var.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(phs0 phs0Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / phs0Var.b;
        double d5 = 1.0d / phs0Var.c;
        double d6 = 1.0d / phs0Var.d;
        double d7 = phs0Var.e;
        double d8 = phs0Var.f;
        double d9 = (d2 * d3) / (phs0Var.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(phs0 phs0Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = phs0Var.b;
        double d6 = phs0Var.d;
        double dPow = (Math.pow(d4, d6) * phs0Var.c) + d5;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d4, d6) * phs0Var.f) + phs0Var.e), phs0Var.g) * d3;
    }

    public static double d(phs0 phs0Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -phs0Var.b;
        double d6 = phs0Var.e;
        double d7 = 1.0d / phs0Var.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-phs0Var.f)) + phs0Var.c), 1.0d / phs0Var.d) * d3;
    }
}
