package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class hcu0 extends mbb {
    @Override // a.hvv, a.k3e, a.vme0, a.vuo
    public final void apply() {
        f7m0 f7m0Var;
        ArrayList arrayList = this.n0;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            f7m0Var = this.l0;
            if (!zHasNext) {
                break;
            } else {
                f7m0Var.c(it.next()).h();
            }
        }
        k3e k3eVar = null;
        k3e k3eVar2 = null;
        for (Object obj : arrayList) {
            k3e k3eVarC = f7m0Var.c(obj);
            if (k3eVar2 == null) {
                Object obj2 = this.R;
                if (obj2 != null) {
                    k3eVarC.p(obj2);
                    k3eVarC.k(this.n).m(this.t);
                } else {
                    Object obj3 = this.S;
                    if (obj3 != null) {
                        k3eVarC.k0 = 10;
                        k3eVarC.S = obj3;
                        k3eVarC.k(this.n).m(this.t);
                    } else {
                        String string = k3eVarC.f17612a.toString();
                        k3eVarC.p(0);
                        k3eVarC.l(Float.valueOf(w(string))).n(Float.valueOf(v(string)));
                    }
                }
                k3eVar2 = k3eVarC;
            }
            if (k3eVar != null) {
                String string2 = k3eVar.f17612a.toString();
                String string3 = k3eVarC.f17612a.toString();
                Object obj4 = k3eVarC.f17612a;
                k3eVar.k0 = 12;
                k3eVar.U = obj4;
                k3eVar.l(Float.valueOf(u(string2))).n(Float.valueOf(t(string2)));
                Object obj5 = k3eVar.f17612a;
                k3eVarC.k0 = 10;
                k3eVarC.S = obj5;
                k3eVarC.l(Float.valueOf(w(string3))).n(Float.valueOf(v(string3)));
            }
            String string4 = obj.toString();
            HashMap map = this.p0;
            float fFloatValue = map.containsKey(string4) ? ((Float) map.get(string4)).floatValue() : -1.0f;
            if (fFloatValue != -1.0f) {
                k3eVarC.g = fFloatValue;
            }
            k3eVar = k3eVarC;
        }
        if (k3eVar != null) {
            Object obj6 = this.U;
            if (obj6 != null) {
                k3eVar.k0 = 12;
                k3eVar.U = obj6;
                k3eVar.k(this.o).m(this.u);
            } else {
                Object obj7 = this.V;
                if (obj7 != null) {
                    k3eVar.e(obj7);
                    k3eVar.k(this.o).m(this.u);
                } else {
                    String string5 = k3eVar.f17612a.toString();
                    k3eVar.e(0);
                    k3eVar.l(Float.valueOf(u(string5))).n(Float.valueOf(t(string5)));
                }
            }
        }
        if (k3eVar2 == null) {
            return;
        }
        float f = this.o0;
        if (f != 0.5f) {
            k3eVar2.i = f;
        }
        int iOrdinal = this.u0.ordinal();
        if (iOrdinal == 0) {
            k3eVar2.e = (byte) 0;
        } else if (iOrdinal == 1) {
            k3eVar2.e = (byte) 1;
        } else {
            if (iOrdinal != 2) {
                return;
            }
            k3eVar2.e = (byte) 2;
        }
    }
}
