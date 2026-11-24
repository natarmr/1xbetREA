package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sww0 extends mew0 {
    private static final sww0 zzm;
    private static volatile yfw0 zzn;
    private int zzb;
    private xew0 zze = bgw0.e;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    static {
        sww0 sww0Var = new sww0();
        zzm = sww0Var;
        mew0.m(sww0.class, sww0Var);
    }

    public static qww0 H() {
        return (qww0) zzm.h();
    }

    public final long A() {
        return this.zzh;
    }

    public final boolean B() {
        return (this.zzb & 8) != 0;
    }

    public final int C() {
        return this.zzi;
    }

    public final boolean D() {
        return (this.zzb & 32) != 0;
    }

    public final long E() {
        return this.zzk;
    }

    public final boolean F() {
        return (this.zzb & 64) != 0;
    }

    public final long G() {
        return this.zzl;
    }

    public final /* synthetic */ void I(int i, yww0 yww0Var) {
        s();
        this.zze.set(i, yww0Var);
    }

    public final /* synthetic */ void J(yww0 yww0Var) {
        yww0Var.getClass();
        s();
        this.zze.add(yww0Var);
    }

    public final void K(Iterable iterable) {
        s();
        iew0.b(iterable, this.zze);
    }

    public final void L() {
        this.zze = bgw0.e;
    }

    public final /* synthetic */ void M(int i) {
        s();
        this.zze.remove(i);
    }

    public final /* synthetic */ void N(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void O(long j) {
        this.zzb |= 2;
        this.zzg = j;
    }

    public final /* synthetic */ void P(long j) {
        this.zzb |= 4;
        this.zzh = j;
    }

    public final /* synthetic */ void Q(long j) {
        this.zzb |= 16;
        this.zzj = j;
    }

    public final /* synthetic */ void R(long j) {
        this.zzb |= 32;
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
            return new cgw0(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzb", "zze", yww0.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new sww0();
        }
        if (i2 == 4) {
            return new qww0(zzm);
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
        synchronized (sww0.class) {
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

    public final /* synthetic */ void r(long j) {
        this.zzb |= 64;
        this.zzl = j;
    }

    public final void s() {
        xew0 xew0Var = this.zze;
        if (((kdw0) xew0Var).f18126a) {
            return;
        }
        this.zze = esw0.j(xew0Var);
    }

    public final List t() {
        return this.zze;
    }

    public final int u() {
        return this.zze.size();
    }

    public final yww0 v(int i) {
        return (yww0) this.zze.get(i);
    }

    public final String w() {
        return this.zzf;
    }

    public final boolean x() {
        return (this.zzb & 2) != 0;
    }

    public final long y() {
        return this.zzg;
    }

    public final boolean z() {
        return (this.zzb & 4) != 0;
    }
}
