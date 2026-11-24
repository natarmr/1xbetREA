package a;

/* JADX INFO: loaded from: classes2.dex */
public final class zsw0 extends mew0 {
    private static final zsw0 zzg;
    private static volatile yfw0 zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        zsw0 zsw0Var = new zsw0();
        zzg = zsw0Var;
        mew0.m(zsw0.class, zsw0Var);
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            edw0 edw0Var = edw0.f;
            return new cgw0(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", edw0Var, "zzf", edw0Var});
        }
        if (i2 == 3) {
            return new zsw0();
        }
        if (i2 == 4) {
            return new nsw0(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        yfw0 yfw0Var = zzh;
        if (yfw0Var != null) {
            return yfw0Var;
        }
        synchronized (zsw0.class) {
            try {
                jew0Var = zzh;
                if (jew0Var == null) {
                    jew0Var = new jew0(zzg);
                    zzh = jew0Var;
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
        int iQ = yum0.q(this.zzf);
        if (iQ == 0) {
            return 1;
        }
        return iQ;
    }
}
