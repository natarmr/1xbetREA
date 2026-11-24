package a;

/* JADX INFO: loaded from: classes2.dex */
public final class a8x0 extends mew0 {
    private static final a8x0 zzh;
    private static volatile yfw0 zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        a8x0 a8x0Var = new a8x0();
        zzh = a8x0Var;
        mew0.m(a8x0.class, a8x0Var);
    }

    public static z7x0 x() {
        return (z7x0) zzh.h();
    }

    public final /* synthetic */ void A(boolean z) {
        this.zze = 3;
        this.zzf = Boolean.valueOf(z);
    }

    public final /* synthetic */ void B(double d) {
        this.zze = 4;
        this.zzf = Double.valueOf(d);
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zze = 5;
        this.zzf = str;
    }

    public final /* synthetic */ void D(qdw0 qdw0Var) {
        qdw0Var.getClass();
        this.zze = 6;
        this.zzf = qdw0Var;
    }

    public final int E() {
        int i = this.zze;
        if (i == 0) {
            return 6;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i != 5) {
            return i != 6 ? 0 : 5;
        }
        return 4;
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzh, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u00025\u0000\u0003:\u0000\u00043\u0000\u0005;\u0000\u0006=\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i2 == 3) {
            return new a8x0();
        }
        if (i2 == 4) {
            return new z7x0(zzh);
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
        synchronized (a8x0.class) {
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

    public final String r() {
        return this.zzg;
    }

    public final long s() {
        if (this.zze == 2) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    public final boolean t() {
        if (this.zze == 3) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final double u() {
        if (this.zze == 4) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    public final String v() {
        return this.zze == 5 ? (String) this.zzf : "";
    }

    public final qdw0 w() {
        return this.zze == 6 ? (qdw0) this.zzf : qdw0.b;
    }

    public final /* synthetic */ void y(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    public final /* synthetic */ void z(long j) {
        this.zze = 2;
        this.zzf = Long.valueOf(j);
    }
}
