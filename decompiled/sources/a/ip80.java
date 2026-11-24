package a;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class ip80 extends lm40 implements v6z, vld {
    public vhv0 o;

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        pfx pfxVarI;
        pj30Var.getClass();
        int iB = this.o.b(vj30Var);
        if (iB <= 0) {
            View view = (View) mbc.R(this, dy2.f);
            WeakHashMap weakHashMap = rgu0.f30456a;
            xiv0 xiv0VarA = jgu0.a(view);
            iB = (xiv0VarA == null || (pfxVarI = xiv0VarA.f40966a.i(2)) == null) ? 0 : pfxVarI.d;
        }
        pu90 pu90VarS = pj30Var.S(r4e.i(0, -iB, j));
        return vj30.x(vj30Var, pu90VarS.f27604a, r4e.f(pu90VarS.b + iB, j), new cam(pu90VarS, (byte) 17));
    }
}
