package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fsw0 extends mew0 {
    private static final fsw0 zzj;
    private static volatile yfw0 zzk;
    private int zzb;
    private int zze;
    private xew0 zzf;
    private xew0 zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        fsw0 fsw0Var = new fsw0();
        zzj = fsw0Var;
        mew0.m(fsw0.class, fsw0Var);
    }

    public fsw0() {
        bgw0 bgw0Var = bgw0.e;
        this.zzf = bgw0Var;
        this.zzg = bgw0Var;
    }

    public final void A(int i, jsw0 jsw0Var) {
        xew0 xew0VarJ = this.zzg;
        if (!((kdw0) xew0VarJ).f18126a) {
            xew0VarJ = esw0.j(xew0VarJ);
            this.zzg = xew0VarJ;
        }
        xew0VarJ.set(i, jsw0Var);
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zze", "zzf", ssw0.class, "zzg", jsw0.class, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new fsw0();
        }
        if (i2 == 4) {
            return new dsw0(zzj);
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
        synchronized (fsw0.class) {
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

    public final boolean r() {
        return (this.zzb & 1) != 0;
    }

    public final int s() {
        return this.zze;
    }

    public final List t() {
        return this.zzf;
    }

    public final int u() {
        return this.zzf.size();
    }

    public final ssw0 v(int i) {
        return (ssw0) this.zzf.get(i);
    }

    public final xew0 w() {
        return this.zzg;
    }

    public final int x() {
        return this.zzg.size();
    }

    public final jsw0 y(int i) {
        return (jsw0) this.zzg.get(i);
    }

    public final void z(int i, ssw0 ssw0Var) {
        xew0 xew0VarJ = this.zzf;
        if (!((kdw0) xew0VarJ).f18126a) {
            xew0VarJ = esw0.j(xew0VarJ);
            this.zzf = xew0VarJ;
        }
        xew0VarJ.set(i, ssw0Var);
    }
}
