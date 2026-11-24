package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public abstract class p470 {
    public static final void a(mm40 mm40Var, v8r0 v8r0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40VarL;
        v8r0Var.getClass();
        f3v0 f3v0Var = v8r0Var.f37002a;
        function1.getClass();
        fetVar.g0(1460131840);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(v8r0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (f3v0Var.equals(b3v0.f1928a)) {
                fetVar.e0(-640897558);
                fetVar.r(false);
                mm40VarL = mm40Var;
            } else {
                fetVar.e0(-640865938);
                zcl zclVar = qmk.f28987a;
                mm40VarL = s5x0.L(mm40Var, qmk.a(fetVar).c, 0.0f, 2);
                fetVar.r(false);
            }
            bbn bbnVar = v8r0Var.b;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new x6s(function1, (byte) 26);
                fetVar.o0(objP);
            }
            Function2 function2 = (Function2) objP;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ju60(function1, (byte) 25);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean z3 = i3 == 256;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new ju60(function1, (byte) 26);
                fetVar.o0(objP3);
            }
            n4c.o(mm40VarL, f3v0Var, bbnVar, null, null, function2, null, function0, (Function0) objP3, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dr50(mm40Var, v8r0Var, function1, i, (byte) 17);
        }
    }
}
