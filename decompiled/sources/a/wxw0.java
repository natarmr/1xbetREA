package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class wxw0 extends mew0 {
    private static final wxw0 zzg;
    private static volatile yfw0 zzh;
    private int zzb;
    private int zze;
    private wew0 zzf = dfw0.e;

    static {
        wxw0 wxw0Var = new wxw0();
        zzg = wxw0Var;
        mew0.m(wxw0.class, wxw0Var);
    }

    public static vxw0 w() {
        return (vxw0) zzg.h();
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new wxw0();
        }
        if (i2 == 4) {
            return new vxw0(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        yfw0 yfw0Var = zzh;
        if (yfw0Var != null) {
            return yfw0Var;
        }
        synchronized (wxw0.class) {
            try {
                jew0Var = zzh;
                if (jew0Var == null) {
                    jew0Var = new jew0(zzg);
                    zzh = jew0Var;
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
        return ((dfw0) this.zzf).size();
    }

    public final long v(int i) {
        return ((dfw0) this.zzf).c(i);
    }

    public final /* synthetic */ void x(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final void y(List list) {
        List list2 = this.zzf;
        boolean z = ((kdw0) list2).f18126a;
        List list3 = list2;
        if (!z) {
            dfw0 dfw0Var = (dfw0) list2;
            int i = dfw0Var.c;
            dfw0 dfw0VarZzg = dfw0Var.zzg(i + i);
            this.zzf = dfw0VarZzg;
            list3 = dfw0VarZzg;
        }
        iew0.b(list, list3);
    }
}
