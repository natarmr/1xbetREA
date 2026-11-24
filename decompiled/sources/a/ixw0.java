package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ixw0 extends mew0 {
    private static final ixw0 zzi;
    private static volatile yfw0 zzj;
    private int zzb;
    private xew0 zze = bgw0.e;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        ixw0 ixw0Var = new ixw0();
        zzi = ixw0Var;
        mew0.m(ixw0.class, ixw0Var);
    }

    public static exw0 y() {
        return (exw0) zzi.h();
    }

    public static exw0 z(ixw0 ixw0Var) {
        iew0 iew0VarH = zzi.h();
        iew0VarH.f(ixw0Var);
        return (exw0) iew0VarH;
    }

    public final /* synthetic */ void A(int i, mxw0 mxw0Var) {
        G();
        this.zze.set(i, mxw0Var);
    }

    public final /* synthetic */ void B(mxw0 mxw0Var) {
        G();
        this.zze.add(mxw0Var);
    }

    public final void C(ArrayList arrayList) {
        G();
        iew0.b(arrayList, this.zze);
    }

    public final void D() {
        this.zze = bgw0.e;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }

    public final void G() {
        xew0 xew0Var = this.zze;
        if (((kdw0) xew0Var).f18126a) {
            return;
        }
        this.zze = esw0.j(xew0Var);
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", mxw0.class, "zzf", "zzg", "zzh", edw0.k});
        }
        if (i2 == 3) {
            return new ixw0();
        }
        if (i2 == 4) {
            return new exw0(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        yfw0 yfw0Var = zzj;
        if (yfw0Var != null) {
            return yfw0Var;
        }
        synchronized (ixw0.class) {
            try {
                jew0Var = zzj;
                if (jew0Var == null) {
                    jew0Var = new jew0(zzi);
                    zzj = jew0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jew0Var;
    }

    public final List r() {
        return this.zze;
    }

    public final int s() {
        return this.zze.size();
    }

    public final mxw0 t(int i) {
        return (mxw0) this.zze.get(i);
    }

    public final boolean u() {
        return (this.zzb & 1) != 0;
    }

    public final String v() {
        return this.zzf;
    }

    public final boolean w() {
        return (this.zzb & 2) != 0;
    }

    public final String x() {
        return this.zzg;
    }
}
