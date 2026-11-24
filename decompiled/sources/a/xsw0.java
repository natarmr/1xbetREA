package a;

/* JADX INFO: loaded from: classes2.dex */
public final class xsw0 extends mew0 {
    private static final xsw0 zzh;
    private static volatile yfw0 zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        xsw0 xsw0Var = new xsw0();
        zzh = xsw0Var;
        mew0.m(xsw0.class, xsw0Var);
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", edw0.f, "zzf", edw0.e, "zzg", edw0.g});
        }
        if (i2 == 3) {
            return new xsw0();
        }
        if (i2 == 4) {
            return new nsw0(zzh);
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
        synchronized (xsw0.class) {
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

    public final int r() {
        int iQ = yum0.q(this.zze);
        if (iQ == 0) {
            return 1;
        }
        return iQ;
    }

    public final int s() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int t() {
        int i;
        int i2 = this.zzg;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
