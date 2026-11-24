package a;

/* JADX INFO: loaded from: classes2.dex */
public final class pv0 extends i3t0 {
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        gv0 gv0Var = (gv0) obj;
        gv0Var.getClass();
        if (gv0Var instanceof ev0) {
            String str = ((mv0) D()).f22435a;
            int length = str.length();
            if (4 > length || length >= 10 || !((mv0) D()).d.g(str)) {
                return;
            }
            G(new lv0(((mv0) D()).f22435a));
            return;
        }
        boolean z = gv0Var instanceof fv0;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        boolean z2 = false;
        if (!z) {
            if (!gv0Var.equals(dv0.f6720a)) {
                if (gv0Var.equals(cv0.f5010a)) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value, mv0.a((mv0) value, null, false, 13)));
            return;
        }
        String strL = ttm0.L(9, ((fv0) gv0Var).f10190a);
        int length2 = strL.length();
        if (4 <= length2 && length2 < 10 && ((mv0) D()).d.g(strL)) {
            z2 = true;
        }
        boolean z3 = z2;
        p7m0 p7m0Var2 = ocjVar.f25029a;
        do {
            value2 = p7m0Var2.getValue();
            value2.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var2.m(value2, mv0.a((mv0) value2, strL, z3, 10)));
    }
}
