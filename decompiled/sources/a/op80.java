package a;

import android.view.View;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class op80 extends lm40 implements v6z, vld {
    public vhv0 o;
    public Function1 p;

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        pfx pfxVarI;
        pj30Var.getClass();
        int iD = this.o.d(vj30Var);
        if (iD <= 0) {
            View view = (View) mbc.R(this, dy2.f);
            WeakHashMap weakHashMap = rgu0.f30456a;
            xiv0 xiv0VarA = jgu0.a(view);
            iD = (xiv0VarA == null || (pfxVarI = xiv0VarA.f40966a.i(1)) == null) ? 0 : pfxVarI.b;
        }
        Function1 function1 = this.p;
        if (function1 != null) {
            function1.invoke(new ycl(vj30Var.r0(iD)));
        }
        pu90 pu90VarS = pj30Var.S(r4e.i(0, -iD, j));
        return vj30.x(vj30Var, pu90VarS.f27604a, r4e.f(pu90VarS.b + iD, j), new n7(pu90VarS, iD, (byte) 15));
    }
}
