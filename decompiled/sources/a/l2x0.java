package a;

/* JADX INFO: loaded from: classes2.dex */
public final class l2x0 extends mew0 {
    private static final l2x0 zzl;
    private static volatile yfw0 zzm;
    private int zzb;
    private String zze = "";
    private qdw0 zzf = qdw0.b;
    private String zzg = "";
    private xew0 zzh;
    private xew0 zzi;
    private boolean zzj;
    private long zzk;

    static {
        l2x0 l2x0Var = new l2x0();
        zzl = l2x0Var;
        mew0.m(l2x0.class, l2x0Var);
    }

    public l2x0() {
        bgw0 bgw0Var = bgw0.e;
        this.zzh = bgw0Var;
        this.zzi = bgw0Var;
    }

    public static i2x0 x() {
        return (i2x0) zzl.h();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final void B(q2x0 q2x0Var) {
        xew0 xew0VarJ = this.zzh;
        if (!((kdw0) xew0VarJ).f18126a) {
            xew0VarJ = esw0.j(xew0VarJ);
            this.zzh = xew0VarJ;
        }
        xew0VarJ.add(q2x0Var);
    }

    public final void C(String str) {
        str.getClass();
        xew0 xew0VarJ = this.zzi;
        if (!((kdw0) xew0VarJ).f18126a) {
            xew0VarJ = esw0.j(xew0VarJ);
            this.zzi = xew0VarJ;
        }
        xew0VarJ.add(str);
    }

    public final /* synthetic */ void D(boolean z) {
        this.zzb |= 8;
        this.zzj = z;
    }

    public final /* synthetic */ void E(long j) {
        this.zzb |= 16;
        this.zzk = j;
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzl, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"zzb", "zzg", "zze", "zzf", "zzh", q2x0.class, "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new l2x0();
        }
        if (i2 == 4) {
            return new i2x0(zzl);
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
        synchronized (l2x0.class) {
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

    public final String r() {
        return this.zze;
    }

    public final boolean s() {
        return (this.zzb & 2) != 0;
    }

    public final qdw0 t() {
        return this.zzf;
    }

    public final String u() {
        return this.zzg;
    }

    public final xew0 v() {
        return this.zzh;
    }

    public final long w() {
        return this.zzk;
    }

    public final /* synthetic */ void y(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void z(pdw0 pdw0Var) {
        pdw0Var.getClass();
        this.zzb |= 2;
        this.zzf = pdw0Var;
    }
}
