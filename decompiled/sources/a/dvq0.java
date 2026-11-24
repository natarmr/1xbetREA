package a;

import android.os.Build;
import android.view.autofill.AutofillValue;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class dvq0 extends htc {
    public boolean n1;
    public Function1 o1;
    public final h3q0 p1;

    public dvq0(boolean z, gy40 gy40Var, boolean z2, ucg0 ucg0Var, Function1 function1) {
        super(gy40Var, null, false, z2, null, ucg0Var, new fya(function1, z, (byte) 3));
        this.n1 = z;
        this.o1 = function1;
        this.p1 = new h3q0(this, (byte) 21);
    }

    @Override // a.s1
    public final void c1(abi0 abi0Var) {
        yai0.i(abi0Var, this.n1 ? evq0.f8484a : evq0.b);
        jy2 jy2Var = rv00.j;
        zai0 zai0Var = xai0.s;
        iiy[] iiyVarArr = yai0.f42300a;
        iiy iiyVar = iiyVarArr[9];
        zai0Var.getClass();
        abi0Var.b(zai0Var, jy2Var);
        ez2 ez2Var = Build.VERSION.SDK_INT >= 26 ? new ez2(AutofillValue.forToggle(this.n1)) : null;
        if (ez2Var != null) {
            zai0 zai0Var2 = xai0.t;
            iiy iiyVar2 = iiyVarArr[10];
            zai0Var2.getClass();
            abi0Var.b(zai0Var2, ez2Var);
        }
        abi0Var.b(mai0.h, new m6(null, new kac(abi0Var, (byte) 1)));
    }
}
