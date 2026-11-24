package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jww0 extends mew0 {
    private static final jww0 zze;
    private static volatile yfw0 zzf;
    private xew0 zzb = bgw0.e;

    static {
        jww0 jww0Var = new jww0();
        zze = jww0Var;
        mew0.m(jww0.class, jww0Var);
    }

    public static vvw0 s() {
        return (vvw0) zze.h();
    }

    public static jww0 t() {
        return zze;
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", eww0.class});
        }
        if (i2 == 3) {
            return new jww0();
        }
        if (i2 == 4) {
            return new vvw0(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        yfw0 yfw0Var = zzf;
        if (yfw0Var != null) {
            return yfw0Var;
        }
        synchronized (jww0.class) {
            try {
                jew0Var = zzf;
                if (jew0Var == null) {
                    jew0Var = new jew0(zze);
                    zzf = jew0Var;
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

    public final void u(ArrayList arrayList) {
        xew0 xew0VarJ = this.zzb;
        if (!((kdw0) xew0VarJ).f18126a) {
            xew0VarJ = esw0.j(xew0VarJ);
            this.zzb = xew0VarJ;
        }
        iew0.b(arrayList, xew0VarJ);
    }
}
