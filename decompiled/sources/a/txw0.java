package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class txw0 extends mew0 {
    private static final txw0 zzh;
    private static volatile yfw0 zzi;
    private wew0 zzb;
    private wew0 zze;
    private xew0 zzf;
    private xew0 zzg;

    static {
        txw0 txw0Var = new txw0();
        zzh = txw0Var;
        mew0.m(txw0.class, txw0Var);
    }

    public txw0() {
        dfw0 dfw0Var = dfw0.e;
        this.zzb = dfw0Var;
        this.zze = dfw0Var;
        bgw0 bgw0Var = bgw0.e;
        this.zzf = bgw0Var;
        this.zzg = bgw0Var;
    }

    public static txw0 A() {
        return zzh;
    }

    public static rxw0 z() {
        return (rxw0) zzh.h();
    }

    public final void B(Iterable iterable) {
        List list = this.zzb;
        boolean z = ((kdw0) list).f18126a;
        List list2 = list;
        if (!z) {
            dfw0 dfw0Var = (dfw0) list;
            int i = dfw0Var.c;
            dfw0 dfw0VarZzg = dfw0Var.zzg(i + i);
            this.zzb = dfw0VarZzg;
            list2 = dfw0VarZzg;
        }
        iew0.b(iterable, list2);
    }

    public final void C() {
        this.zzb = dfw0.e;
    }

    public final void D(List list) {
        List list2 = this.zze;
        boolean z = ((kdw0) list2).f18126a;
        List list3 = list2;
        if (!z) {
            dfw0 dfw0Var = (dfw0) list2;
            int i = dfw0Var.c;
            dfw0 dfw0VarZzg = dfw0Var.zzg(i + i);
            this.zze = dfw0VarZzg;
            list3 = dfw0VarZzg;
        }
        iew0.b(list, list3);
    }

    public final void E() {
        this.zze = dfw0.e;
    }

    public final void F(ArrayList arrayList) {
        xew0 xew0VarJ = this.zzf;
        if (!((kdw0) xew0VarJ).f18126a) {
            xew0VarJ = esw0.j(xew0VarJ);
            this.zzf = xew0VarJ;
        }
        iew0.b(arrayList, xew0VarJ);
    }

    public final void G() {
        this.zzf = bgw0.e;
    }

    public final void H(Iterable iterable) {
        xew0 xew0VarJ = this.zzg;
        if (!((kdw0) xew0VarJ).f18126a) {
            xew0VarJ = esw0.j(xew0VarJ);
            this.zzg = xew0VarJ;
        }
        iew0.b(iterable, xew0VarJ);
    }

    public final void I() {
        this.zzg = bgw0.e;
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzh, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", pww0.class, "zzg", wxw0.class});
        }
        if (i2 == 3) {
            return new txw0();
        }
        if (i2 == 4) {
            return new rxw0(zzh);
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
        synchronized (txw0.class) {
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

    public final List r() {
        return this.zzb;
    }

    public final int s() {
        return ((dfw0) this.zzb).size();
    }

    public final List t() {
        return this.zze;
    }

    public final int u() {
        return ((dfw0) this.zze).size();
    }

    public final xew0 v() {
        return this.zzf;
    }

    public final int w() {
        return this.zzf.size();
    }

    public final xew0 x() {
        return this.zzg;
    }

    public final int y() {
        return this.zzg.size();
    }
}
