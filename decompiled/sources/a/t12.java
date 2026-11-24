package a;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class t12 extends hvv {
    public final /* synthetic */ byte o0;
    public float p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t12(f7m0 f7m0Var, int i, byte b) {
        super(f7m0Var, i);
        this.o0 = b;
    }

    @Override // a.hvv, a.k3e, a.vme0, a.vuo
    public final void apply() {
        byte b = this.o0;
        f7m0 f7m0Var = this.l0;
        ArrayList arrayList = this.n0;
        switch (b) {
            case 0:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    k3e k3eVarC = f7m0Var.c(it.next());
                    k3eVarC.g();
                    Object obj = this.N;
                    if (obj != null) {
                        k3eVarC.o(obj);
                    } else {
                        Object obj2 = this.O;
                        if (obj2 != null) {
                            k3eVarC.k0 = 6;
                            k3eVarC.O = obj2;
                        } else {
                            k3eVarC.o(0);
                        }
                    }
                    Object obj3 = this.P;
                    if (obj3 != null) {
                        k3eVarC.k0 = 7;
                        k3eVarC.P = obj3;
                    } else {
                        Object obj4 = this.Q;
                        if (obj4 != null) {
                            k3eVarC.i(obj4);
                        } else {
                            k3eVarC.i(0);
                        }
                    }
                    float f = this.p0;
                    if (f != 0.5f) {
                        k3eVarC.h = f;
                    }
                }
                break;
            default:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    k3e k3eVarC2 = f7m0Var.c(it2.next());
                    k3eVarC2.h();
                    Object obj5 = this.R;
                    if (obj5 != null) {
                        k3eVarC2.p(obj5);
                    } else {
                        Object obj6 = this.S;
                        if (obj6 != null) {
                            k3eVarC2.k0 = 10;
                            k3eVarC2.S = obj6;
                        } else {
                            k3eVarC2.p(0);
                        }
                    }
                    Object obj7 = this.U;
                    if (obj7 != null) {
                        k3eVarC2.k0 = 12;
                        k3eVarC2.U = obj7;
                    } else {
                        Object obj8 = this.V;
                        if (obj8 != null) {
                            k3eVarC2.e(obj8);
                        } else {
                            k3eVarC2.e(0);
                        }
                    }
                    float f2 = this.p0;
                    if (f2 != 0.5f) {
                        k3eVarC2.i = f2;
                    }
                }
                break;
        }
    }
}
