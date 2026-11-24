package a;

/* JADX INFO: loaded from: classes2.dex */
public final class pww0 extends mew0 {
    private static final pww0 zzg;
    private static volatile yfw0 zzh;
    private int zzb;
    private int zze;
    private long zzf;

    static {
        pww0 pww0Var = new pww0();
        zzg = pww0Var;
        mew0.m(pww0.class, pww0Var);
    }

    public static mww0 v() {
        return (mww0) zzg.h();
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new pww0();
        }
        if (i2 == 4) {
            return new mww0(zzg);
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
        synchronized (pww0.class) {
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

    public final boolean r() {
        return (this.zzb & 1) != 0;
    }

    public final int s() {
        return this.zze;
    }

    public final boolean t() {
        return (this.zzb & 2) != 0;
    }

    public final long u() {
        return this.zzf;
    }

    public final /* synthetic */ void w(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final /* synthetic */ void x(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }
}
