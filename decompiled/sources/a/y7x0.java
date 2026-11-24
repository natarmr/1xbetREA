package a;

/* JADX INFO: loaded from: classes2.dex */
public final class y7x0 extends mew0 {
    private static final y7x0 zzj;
    private static volatile yfw0 zzk;
    private int zzb;
    private long zzh;
    private String zze = "";
    private qdw0 zzf = qdw0.b;
    private String zzg = "";
    private xew0 zzi = bgw0.e;

    static {
        y7x0 y7x0Var = new y7x0();
        zzj = y7x0Var;
        mew0.m(y7x0.class, y7x0Var);
    }

    public static w7x0 x() {
        return (w7x0) zzj.h();
    }

    public static y7x0 y() {
        return zzj;
    }

    public final /* synthetic */ void A(qdw0 qdw0Var) {
        qdw0Var.getClass();
        this.zzb |= 2;
        this.zzf = qdw0Var;
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void C(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final void D(a8x0 a8x0Var) {
        xew0 xew0VarJ = this.zzi;
        if (!((kdw0) xew0VarJ).f18126a) {
            xew0VarJ = esw0.j(xew0VarJ);
            this.zzi = xew0VarJ;
        }
        xew0VarJ.add(a8x0Var);
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", a8x0.class});
        }
        if (i2 == 3) {
            return new y7x0();
        }
        if (i2 == 4) {
            return new w7x0(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        yfw0 yfw0Var = zzk;
        if (yfw0Var != null) {
            return yfw0Var;
        }
        synchronized (y7x0.class) {
            try {
                jew0Var = zzk;
                if (jew0Var == null) {
                    jew0Var = new jew0(zzj);
                    zzk = jew0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jew0Var;
    }

    public final String r() {
        return this.zze;
    }

    public final qdw0 s() {
        return this.zzf;
    }

    public final String t() {
        return this.zzg;
    }

    public final long u() {
        return this.zzh;
    }

    public final xew0 v() {
        return this.zzi;
    }

    public final int w() {
        return this.zzi.size();
    }

    public final /* synthetic */ void z(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }
}
