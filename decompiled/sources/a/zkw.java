package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zkw extends mbb {
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
                f7m0Var.c(it.next()).g();
            }
        }
        k3e k3eVar = null;
        k3e k3eVar2 = null;
        for (Object obj : arrayList) {
            k3e k3eVarC = f7m0Var.c(obj);
            if (k3eVar2 == null) {
                Object obj2 = this.N;
                if (obj2 != null) {
                    k3eVarC.o(obj2);
                    k3eVarC.k(this.l).m(this.r);
                } else {
                    Object obj3 = this.O;
                    if (obj3 != null) {
                        k3eVarC.k0 = 6;
                        k3eVarC.O = obj3;
                        k3eVarC.k(this.l).m(this.r);
                    } else {
                        Object obj4 = this.J;
                        if (obj4 != null) {
                            k3eVarC.o(obj4);
                            k3eVarC.k(this.j).m(this.p);
                        } else {
                            Object obj5 = this.K;
                            if (obj5 != null) {
                                k3eVarC.k0 = 6;
                                k3eVarC.O = obj5;
                                k3eVarC.k(this.j).m(this.p);
                            } else {
                                String string = k3eVarC.f17612a.toString();
                                k3eVarC.o(0);
                                k3eVarC.l(Float.valueOf(w(string))).n(Float.valueOf(v(string)));
                            }
                        }
                    }
                }
                k3eVar2 = k3eVarC;
            }
            if (k3eVar != null) {
                String string2 = k3eVar.f17612a.toString();
                String string3 = k3eVarC.f17612a.toString();
                Object obj6 = k3eVarC.f17612a;
                k3eVar.k0 = 7;
                k3eVar.P = obj6;
                k3eVar.l(Float.valueOf(u(string2))).n(Float.valueOf(t(string2)));
                Object obj7 = k3eVar.f17612a;
                k3eVarC.k0 = 6;
                k3eVarC.O = obj7;
                k3eVarC.l(Float.valueOf(w(string3))).n(Float.valueOf(v(string3)));
            }
            String string4 = obj.toString();
            HashMap map = this.p0;
            float fFloatValue = map.containsKey(string4) ? ((Float) map.get(string4)).floatValue() : -1.0f;
            if (fFloatValue != -1.0f) {
                k3eVarC.f = fFloatValue;
            }
            k3eVar = k3eVarC;
        }
        if (k3eVar != null) {
            Object obj8 = this.P;
            if (obj8 != null) {
                k3eVar.k0 = 7;
                k3eVar.P = obj8;
                k3eVar.k(this.m).m(this.s);
            } else {
                Object obj9 = this.Q;
                if (obj9 != null) {
                    k3eVar.i(obj9);
                    k3eVar.k(this.m).m(this.s);
                } else {
                    Object obj10 = this.L;
                    if (obj10 != null) {
                        k3eVar.k0 = 7;
                        k3eVar.P = obj10;
                        k3eVar.k(this.k).m(this.q);
                    } else {
                        Object obj11 = this.M;
                        if (obj11 != null) {
                            k3eVar.i(obj11);
                            k3eVar.k(this.k).m(this.q);
                        } else {
                            String string5 = k3eVar.f17612a.toString();
                            k3eVar.i(0);
                            k3eVar.l(Float.valueOf(u(string5))).n(Float.valueOf(t(string5)));
                        }
                    }
                }
            }
        }
        if (k3eVar2 == null) {
            return;
        }
        float f = this.o0;
        if (f != 0.5f) {
            k3eVar2.h = f;
        }
        int iOrdinal = this.u0.ordinal();
        if (iOrdinal == 0) {
            k3eVar2.d = (byte) 0;
        } else if (iOrdinal == 1) {
            k3eVar2.d = (byte) 1;
        } else {
            if (iOrdinal != 2) {
                return;
            }
            k3eVar2.d = (byte) 2;
        }
    }
}
