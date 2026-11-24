package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public abstract class s7r0 {
    public static final void a(mm40 mm40Var, t7r0 t7r0Var, Function1 function1, fet fetVar, int i) {
        t7r0Var.getClass();
        function1.getClass();
        fetVar.g0(-741365288);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(t7r0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jjm jjmVar = t7r0Var.c;
            kjm kjmVar = kjm.f18392a;
            int i3 = i2 & 896;
            int i4 = i2 & 112;
            boolean z = (i3 == 256) | (i4 == 32);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new r7r0(function1, t7r0Var);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = (i4 == 32) | (i3 == 256);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new r7r0(t7r0Var, function1);
                fetVar.o0(objP2);
            }
            nkb.h(mm40Var, jjmVar, kjmVar, null, function0, (Function0) objP2, fetVar, i2 & 14, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var, t7r0Var, function1, i, (byte) 23);
        }
    }
}
