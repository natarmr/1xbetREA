package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class yww0 extends mew0 {
    private static final yww0 zzk;
    private static volatile yfw0 zzl;
    private int zzb;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private xew0 zzj = bgw0.e;

    static {
        yww0 yww0Var = new yww0();
        zzk = yww0Var;
        mew0.m(yww0.class, yww0Var);
    }

    public static www0 D() {
        return (www0) zzk.h();
    }

    public final double A() {
        return this.zzi;
    }

    public final xew0 B() {
        return this.zzj;
    }

    public final int C() {
        return this.zzj.size();
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void G() {
        this.zzb &= -3;
        this.zzf = zzk.zzf;
    }

    public final /* synthetic */ void H(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void I() {
        this.zzb &= -5;
        this.zzg = 0L;
    }

    public final /* synthetic */ void J(double d) {
        this.zzb |= 16;
        this.zzi = d;
    }

    public final /* synthetic */ void K() {
        this.zzb &= -17;
        this.zzi = 0.0d;
    }

    public final void L(yww0 yww0Var) {
        xew0 xew0VarJ = this.zzj;
        if (!((kdw0) xew0VarJ).f18126a) {
            xew0VarJ = esw0.j(xew0VarJ);
            this.zzj = xew0VarJ;
        }
        xew0VarJ.add(yww0Var);
    }

    public final void M(ArrayList arrayList) {
        xew0 xew0VarJ = this.zzj;
        if (!((kdw0) xew0VarJ).f18126a) {
            xew0VarJ = esw0.j(xew0VarJ);
            this.zzj = xew0VarJ;
        }
        iew0.b(arrayList, xew0VarJ);
    }

    public final void N() {
        this.zzj = bgw0.e;
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", yww0.class});
        }
        if (i2 == 3) {
            return new yww0();
        }
        if (i2 == 4) {
            return new www0(zzk);
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
        synchronized (yww0.class) {
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

    public final String s() {
        return this.zze;
    }

    public final boolean t() {
        return (this.zzb & 2) != 0;
    }

    public final String u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zzb & 4) != 0;
    }

    public final long w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zzb & 8) != 0;
    }

    public final float y() {
        return this.zzh;
    }

    public final boolean z() {
        return (this.zzb & 16) != 0;
    }
}
