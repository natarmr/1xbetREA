package a;

/* JADX INFO: loaded from: classes2.dex */
public final class qvw0 extends mew0 {
    private static final qvw0 zzl;
    private static volatile yfw0 zzm;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        qvw0 qvw0Var = new qvw0();
        zzl = qvw0Var;
        mew0.m(qvw0.class, qvw0Var);
    }

    public static ovw0 y() {
        return (ovw0) zzl.h();
    }

    public static qvw0 z() {
        return zzl;
    }

    public final /* synthetic */ void A(boolean z) {
        this.zzb |= 1;
        this.zze = z;
    }

    public final /* synthetic */ void B(boolean z) {
        this.zzb |= 2;
        this.zzf = z;
    }

    public final /* synthetic */ void C(boolean z) {
        this.zzb |= 4;
        this.zzg = z;
    }

    public final /* synthetic */ void D(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    public final /* synthetic */ void E(boolean z) {
        this.zzb |= 16;
        this.zzi = z;
    }

    public final /* synthetic */ void F(boolean z) {
        this.zzb |= 32;
        this.zzj = z;
    }

    public final /* synthetic */ void G(boolean z) {
        this.zzb |= 64;
        this.zzk = z;
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new qvw0();
        }
        if (i2 == 4) {
            return new ovw0(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        yfw0 yfw0Var = zzm;
        if (yfw0Var != null) {
            return yfw0Var;
        }
        synchronized (qvw0.class) {
            try {
                jew0Var = zzm;
                if (jew0Var == null) {
                    jew0Var = new jew0(zzl);
                    zzm = jew0Var;
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

    public final boolean s() {
        return this.zzf;
    }

    public final boolean t() {
        return this.zzg;
    }

    public final boolean u() {
        return this.zzh;
    }

    public final boolean v() {
        return this.zzi;
    }

    public final boolean w() {
        return this.zzj;
    }

    public final boolean x() {
        return this.zzk;
    }
}
