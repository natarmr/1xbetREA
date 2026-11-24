package a;

/* JADX INFO: loaded from: classes2.dex */
public final class zdt0 {
    public static wdt0 a(Object obj) {
        jjt jjtVar = (jjt) obj;
        wdt0 wdt0Var = jjtVar.unknownFields;
        if (wdt0Var != wdt0.f) {
            return wdt0Var;
        }
        wdt0 wdt0VarC = wdt0.c();
        jjtVar.unknownFields = wdt0VarC;
        return wdt0VarC;
    }

    public static boolean b(Object obj, hu5 hu5Var) throws xnx, ynx {
        int i = hu5Var.b;
        oyc oycVar = (oyc) hu5Var.e;
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            hu5Var.W(0);
            ((wdt0) obj).d(i2 << 3, Long.valueOf(oycVar.v()));
            return true;
        }
        if (i3 == 1) {
            hu5Var.W(1);
            ((wdt0) obj).d((i2 << 3) | 1, Long.valueOf(oycVar.s()));
            return true;
        }
        if (i3 == 2) {
            ((wdt0) obj).d((i2 << 3) | 2, hu5Var.o());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw ynx.d();
            }
            hu5Var.W(5);
            ((wdt0) obj).d((i2 << 3) | 5, Integer.valueOf(oycVar.r()));
            return true;
        }
        wdt0 wdt0VarC = wdt0.c();
        int i4 = i2 << 3;
        int i5 = i4 | 4;
        while (hu5Var.e() != Integer.MAX_VALUE && b(wdt0VarC, hu5Var)) {
        }
        if (i5 != hu5Var.b) {
            throw new ynx("Protocol message end-group tag did not match expected tag.");
        }
        wdt0VarC.e = false;
        ((wdt0) obj).d(i4 | 3, wdt0VarC);
        return true;
    }
}
