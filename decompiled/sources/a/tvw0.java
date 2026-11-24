package a;

/* JADX INFO: loaded from: classes2.dex */
public final class tvw0 extends mew0 {
    private static final tvw0 zzi;
    private static volatile yfw0 zzj;
    private int zzb;
    private int zze;
    private txw0 zzf;
    private txw0 zzg;
    private boolean zzh;

    static {
        tvw0 tvw0Var = new tvw0();
        zzi = tvw0Var;
        mew0.m(tvw0.class, tvw0Var);
    }

    public static svw0 y() {
        return (svw0) zzi.h();
    }

    public final /* synthetic */ void A(txw0 txw0Var) {
        this.zzf = txw0Var;
        this.zzb |= 2;
    }

    public final /* synthetic */ void B(txw0 txw0Var) {
        this.zzg = txw0Var;
        this.zzb |= 4;
    }

    public final /* synthetic */ void C(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new tvw0();
        }
        if (i2 == 4) {
            return new svw0(zzi);
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
        synchronized (tvw0.class) {
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

    public final int s() {
        return this.zze;
    }

    public final txw0 t() {
        txw0 txw0Var = this.zzf;
        return txw0Var == null ? txw0.A() : txw0Var;
    }

    public final boolean u() {
        return (this.zzb & 4) != 0;
    }

    public final txw0 v() {
        txw0 txw0Var = this.zzg;
        return txw0Var == null ? txw0.A() : txw0Var;
    }

    public final boolean w() {
        return (this.zzb & 8) != 0;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final /* synthetic */ void z(int i) {
        this.zzb |= 1;
        this.zze = i;
    }
}
