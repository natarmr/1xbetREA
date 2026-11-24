package a;

/* JADX INFO: loaded from: classes2.dex */
public final class lsw0 extends mew0 {
    private static final lsw0 zzi;
    private static volatile yfw0 zzj;
    private int zzb;
    private vsw0 zze;
    private qsw0 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        lsw0 lsw0Var = new lsw0();
        zzi = lsw0Var;
        mew0.m(lsw0.class, lsw0Var);
    }

    public static lsw0 z() {
        return zzi;
    }

    public final /* synthetic */ void A(String str) {
        this.zzb |= 8;
        this.zzh = str;
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new lsw0();
        }
        if (i2 == 4) {
            return new ksw0(zzi);
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
        synchronized (lsw0.class) {
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

    public final boolean r() {
        return (this.zzb & 1) != 0;
    }

    public final vsw0 s() {
        vsw0 vsw0Var = this.zze;
        return vsw0Var == null ? vsw0.y() : vsw0Var;
    }

    public final boolean t() {
        return (this.zzb & 2) != 0;
    }

    public final qsw0 u() {
        qsw0 qsw0Var = this.zzf;
        return qsw0Var == null ? qsw0.A() : qsw0Var;
    }

    public final boolean v() {
        return (this.zzb & 4) != 0;
    }

    public final boolean w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zzb & 8) != 0;
    }

    public final String y() {
        return this.zzh;
    }
}
