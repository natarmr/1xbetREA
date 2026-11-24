package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public abstract class uva {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f36339a;

    static {
        zcl zclVar = qmk.f28987a;
        f36339a = 14.0f;
    }

    public static final void a(mm40 mm40Var, ArrayList arrayList, fet fetVar, int i) {
        fetVar.g0(1249556147);
        int i2 = (fetVar.g(arrayList) ? 32 : 16) | i;
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = tva.f34590a;
                fetVar.o0(objP);
            }
            sv40 sv40Var = (sv40) objP;
            ugd ugdVarE = l7x.E(arrayList);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new tv40(sv40Var);
                fetVar.o0(objP2);
            }
            tj30 tj30Var = (tj30) objP2;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            twn.v(0, ugdVarE, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rva(mm40Var, arrayList, i, b);
        }
    }
}
