package a;

/* JADX INFO: loaded from: classes2.dex */
public final class f2x0 extends mew0 {
    private static final f2x0 zzg;
    private static volatile yfw0 zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        f2x0 f2x0Var = new f2x0();
        zzg = f2x0Var;
        mew0.m(f2x0.class, f2x0Var);
    }

    public static d2x0 r() {
        return (d2x0) zzg.h();
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new f2x0();
        }
        if (i2 == 4) {
            return new d2x0(zzg);
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
        synchronized (f2x0.class) {
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

    public final /* synthetic */ void s(int i) {
        this.zze = i - 2;
        this.zzb |= 1;
    }

    public final /* synthetic */ void t(int i) {
        if (i == 1) {
            jf4.o("Can't get the number of an unknown enum value.");
        } else {
            this.zzf = i - 2;
            this.zzb |= 2;
        }
    }
}
