package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ssw0 extends mew0 {
    private static final ssw0 zzk;
    private static volatile yfw0 zzl;
    private int zzb;
    private int zze;
    private String zzf = "";
    private lsw0 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        ssw0 ssw0Var = new ssw0();
        zzk = ssw0Var;
        mew0.m(ssw0.class, ssw0Var);
    }

    public static rsw0 z() {
        return (rsw0) zzk.h();
    }

    public final /* synthetic */ void A(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new ssw0();
        }
        if (i2 == 4) {
            return new rsw0(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        yfw0 yfw0Var = zzl;
        if (yfw0Var != null) {
            return yfw0Var;
        }
        synchronized (ssw0.class) {
            try {
                jew0Var = zzl;
                if (jew0Var == null) {
                    jew0Var = new jew0(zzk);
                    zzl = jew0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jew0Var;
    }

    public final boolean r() {
        return (this.zzb & 1) != 0;
    }

    public final int s() {
        return this.zze;
    }

    public final String t() {
        return this.zzf;
    }

    public final lsw0 u() {
        lsw0 lsw0Var = this.zzg;
        return lsw0Var == null ? lsw0.z() : lsw0Var;
    }

    public final boolean v() {
        return this.zzh;
    }

    public final boolean w() {
        return this.zzi;
    }

    public final boolean x() {
        return (this.zzb & 32) != 0;
    }

    public final boolean y() {
        return this.zzj;
    }
}
