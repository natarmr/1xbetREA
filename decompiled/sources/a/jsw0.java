package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jsw0 extends mew0 {
    private static final jsw0 zzm;
    private static volatile yfw0 zzn;
    private int zzb;
    private int zze;
    private String zzf = "";
    private xew0 zzg = bgw0.e;
    private boolean zzh;
    private qsw0 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        jsw0 jsw0Var = new jsw0();
        zzm = jsw0Var;
        mew0.m(jsw0.class, jsw0Var);
    }

    public static hsw0 D() {
        return (hsw0) zzm.h();
    }

    public final boolean A() {
        return this.zzk;
    }

    public final boolean B() {
        return (this.zzb & 64) != 0;
    }

    public final boolean C() {
        return this.zzl;
    }

    public final /* synthetic */ void E(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void F(int i, lsw0 lsw0Var) {
        xew0 xew0VarJ = this.zzg;
        if (!((kdw0) xew0VarJ).f18126a) {
            xew0VarJ = esw0.j(xew0VarJ);
            this.zzg = xew0VarJ;
        }
        xew0VarJ.set(i, lsw0Var);
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", lsw0.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new jsw0();
        }
        if (i2 == 4) {
            return new hsw0(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        yfw0 yfw0Var = zzn;
        if (yfw0Var != null) {
            return yfw0Var;
        }
        synchronized (jsw0.class) {
            try {
                jew0Var = zzn;
                if (jew0Var == null) {
                    jew0Var = new jew0(zzm);
                    zzn = jew0Var;
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

    public final String t() {
        return this.zzf;
    }

    public final List u() {
        return this.zzg;
    }

    public final int v() {
        return this.zzg.size();
    }

    public final lsw0 w(int i) {
        return (lsw0) this.zzg.get(i);
    }

    public final boolean x() {
        return (this.zzb & 8) != 0;
    }

    public final qsw0 y() {
        qsw0 qsw0Var = this.zzi;
        return qsw0Var == null ? qsw0.A() : qsw0Var;
    }

    public final boolean z() {
        return this.zzj;
    }
}
