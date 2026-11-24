package a;

/* JADX INFO: loaded from: classes2.dex */
public final class g2x0 extends mew0 {
    private static final g2x0 zzh;
    private static volatile yfw0 zzi;
    private int zzb;
    private f2x0 zzf;
    private String zze = "";
    private String zzg = "";

    static {
        g2x0 g2x0Var = new g2x0();
        zzh = g2x0Var;
        mew0.m(g2x0.class, g2x0Var);
    }

    public static b2x0 s() {
        return (b2x0) zzh.h();
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new g2x0();
        }
        if (i2 == 4) {
            return new b2x0(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        yfw0 yfw0Var = zzi;
        if (yfw0Var != null) {
            return yfw0Var;
        }
        synchronized (g2x0.class) {
            try {
                jew0Var = zzi;
                if (jew0Var == null) {
                    jew0Var = new jew0(zzh);
                    zzi = jew0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jew0Var;
    }

    public final String r() {
        return this.zze;
    }

    public final /* synthetic */ void t(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void u(f2x0 f2x0Var) {
        this.zzf = f2x0Var;
        this.zzb |= 2;
    }

    public final /* synthetic */ void v(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }
}
