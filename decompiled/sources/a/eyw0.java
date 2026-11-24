package a;

/* JADX INFO: loaded from: classes2.dex */
public final class eyw0 extends mew0 {
    private static final eyw0 zzk;
    private static volatile yfw0 zzl;
    private int zzb;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        eyw0 eyw0Var = new eyw0();
        zzk = eyw0Var;
        mew0.m(eyw0.class, eyw0Var);
    }

    public static dyw0 C() {
        return (dyw0) zzk.h();
    }

    public final boolean A() {
        return (this.zzb & 32) != 0;
    }

    public final double B() {
        return this.zzj;
    }

    public final /* synthetic */ void D(long j) {
        this.zzb |= 1;
        this.zze = j;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void F(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void G() {
        this.zzb &= -5;
        this.zzg = zzk.zzg;
    }

    public final /* synthetic */ void H(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final /* synthetic */ void I() {
        this.zzb &= -9;
        this.zzh = 0L;
    }

    public final /* synthetic */ void J(double d) {
        this.zzb |= 32;
        this.zzj = d;
    }

    public final /* synthetic */ void K() {
        this.zzb &= -33;
        this.zzj = 0.0d;
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new eyw0();
        }
        if (i2 == 4) {
            return new dyw0(zzk);
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
        synchronized (eyw0.class) {
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

    public final long s() {
        return this.zze;
    }

    public final String t() {
        return this.zzf;
    }

    public final boolean u() {
        return (this.zzb & 4) != 0;
    }

    public final String v() {
        return this.zzg;
    }

    public final boolean w() {
        return (this.zzb & 8) != 0;
    }

    public final long x() {
        return this.zzh;
    }

    public final boolean y() {
        return (this.zzb & 16) != 0;
    }

    public final float z() {
        return this.zzi;
    }
}
