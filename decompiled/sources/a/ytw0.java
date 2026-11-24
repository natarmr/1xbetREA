package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ytw0 extends mew0 {
    private static final ytw0 zzi;
    private static volatile yfw0 zzj;
    private int zzb;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        ytw0 ytw0Var = new ytw0();
        zzi = ytw0Var;
        mew0.m(ytw0.class, ytw0Var);
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new ytw0();
        }
        if (i2 == 4) {
            return new utw0(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        yfw0 yfw0Var = zzj;
        if (yfw0Var != null) {
            return yfw0Var;
        }
        synchronized (ytw0.class) {
            try {
                jew0Var = zzj;
                if (jew0Var == null) {
                    jew0Var = new jew0(zzi);
                    zzj = jew0Var;
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

    public final boolean s() {
        return (this.zzb & 2) != 0;
    }

    public final boolean t() {
        return this.zzf;
    }

    public final boolean u() {
        return (this.zzb & 4) != 0;
    }

    public final boolean v() {
        return this.zzg;
    }

    public final boolean w() {
        return (this.zzb & 8) != 0;
    }

    public final int x() {
        return this.zzh;
    }

    public final /* synthetic */ void y(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }
}
