package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class duw0 extends mew0 {
    private static final duw0 zzw;
    private static volatile yfw0 zzx;
    private int zzb;
    private long zze;
    private String zzf = "";
    private int zzg;
    private xew0 zzh;
    private xew0 zzi;
    private xew0 zzj;
    private String zzk;
    private boolean zzl;
    private xew0 zzm;
    private xew0 zzn;
    private String zzo;
    private String zzp;
    private otw0 zzq;
    private luw0 zzr;
    private wuw0 zzs;
    private nuw0 zzt;
    private huw0 zzu;
    private sew0 zzv;

    static {
        duw0 duw0Var = new duw0();
        zzw = duw0Var;
        mew0.m(duw0.class, duw0Var);
    }

    public duw0() {
        bgw0 bgw0Var = bgw0.e;
        this.zzh = bgw0Var;
        this.zzi = bgw0Var;
        this.zzj = bgw0Var;
        this.zzk = "";
        this.zzm = bgw0Var;
        this.zzn = bgw0Var;
        this.zzo = "";
        this.zzp = "";
        this.zzv = oew0.e;
    }

    public static ztw0 I() {
        return (ztw0) zzw.h();
    }

    public static duw0 J() {
        return zzw;
    }

    public final int A() {
        return this.zzm.size();
    }

    public final xew0 B() {
        return this.zzn;
    }

    public final String C() {
        return this.zzo;
    }

    public final boolean D() {
        return (this.zzb & 128) != 0;
    }

    public final otw0 E() {
        otw0 otw0Var = this.zzq;
        return otw0Var == null ? otw0.x() : otw0Var;
    }

    public final boolean F() {
        return (this.zzb & 512) != 0;
    }

    public final wuw0 G() {
        wuw0 wuw0Var = this.zzs;
        return wuw0Var == null ? wuw0.t() : wuw0Var;
    }

    public final sew0 H() {
        return this.zzv;
    }

    public final void K(int i, ytw0 ytw0Var) {
        xew0 xew0VarJ = this.zzi;
        if (!((kdw0) xew0VarJ).f18126a) {
            xew0VarJ = esw0.j(xew0VarJ);
            this.zzi = xew0VarJ;
        }
        xew0VarJ.set(i, ytw0Var);
    }

    public final void L() {
        this.zzj = bgw0.e;
    }

    public final void M() {
        this.zzm = bgw0.e;
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzw, "\u0004\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0006\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b\u0014+", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", suw0.class, "zzi", ytw0.class, "zzj", fsw0.class, "zzk", "zzl", "zzm", nyw0.class, "zzn", stw0.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
        }
        if (i2 == 3) {
            return new duw0();
        }
        if (i2 == 4) {
            return new ztw0(zzw);
        }
        if (i2 == 5) {
            return zzw;
        }
        if (i2 != 6) {
            throw null;
        }
        yfw0 yfw0Var = zzx;
        if (yfw0Var != null) {
            return yfw0Var;
        }
        synchronized (duw0.class) {
            try {
                jew0Var = zzx;
                if (jew0Var == null) {
                    jew0Var = new jew0(zzw);
                    zzx = jew0Var;
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

    public final boolean t() {
        return (this.zzb & 2) != 0;
    }

    public final String u() {
        return this.zzf;
    }

    public final xew0 v() {
        return this.zzh;
    }

    public final int w() {
        return this.zzi.size();
    }

    public final ytw0 x(int i) {
        return (ytw0) this.zzi.get(i);
    }

    public final List y() {
        return this.zzj;
    }

    public final xew0 z() {
        return this.zzm;
    }
}
