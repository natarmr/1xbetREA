package a;

/* JADX INFO: loaded from: classes2.dex */
public final class s3x0 extends mew0 {
    private static final s3x0 zzf;
    private static volatile yfw0 zzg;
    private int zzb;
    private boolean zze;

    static {
        s3x0 s3x0Var = new s3x0();
        zzf = s3x0Var;
        mew0.m(s3x0.class, s3x0Var);
    }

    public static s3x0 s() {
        return zzf;
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzf, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new s3x0();
        }
        if (i2 == 4) {
            return new nsw0(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        yfw0 yfw0Var = zzg;
        if (yfw0Var != null) {
            return yfw0Var;
        }
        synchronized (s3x0.class) {
            try {
                jew0Var = zzg;
                if (jew0Var == null) {
                    jew0Var = new jew0(zzf);
                    zzg = jew0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jew0Var;
    }

    public final boolean r() {
        return this.zze;
    }
}
