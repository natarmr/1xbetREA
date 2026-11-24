package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class vls0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lxs0 f37644a;
    public final pz40 b = androidx.compose.runtime.e.e(null);
    public final /* synthetic */ oms0 c;

    public vls0(oms0 oms0Var, lxs0 lxs0Var, String str) {
        this.c = oms0Var;
        this.f37644a = lxs0Var;
    }

    public final uls0 a(Function1 function1, Object obj, t73 t73Var, Function1 function2) {
        pz40 pz40Var = this.b;
        uls0 uls0Var = (uls0) ((hgk0) pz40Var).getValue();
        oms0 oms0Var = this.c;
        if (uls0Var == null) {
            Object objInvoke = function2.invoke(oms0Var.f25519a.y0());
            Object objInvoke2 = function2.invoke(oms0Var.f25519a.y0());
            lxs0 lxs0Var = this.f37644a;
            t73 t73Var2 = (t73) lxs0Var.f20832a.invoke(objInvoke2);
            t73Var2.d();
            cms0 cms0Var = new cms0(oms0Var, objInvoke, t73Var2, lxs0Var);
            uls0Var = new uls0(this, cms0Var, function1, function2);
            ((hgk0) pz40Var).setValue(uls0Var);
            oms0Var.j.add(cms0Var);
        }
        uls0Var.c = function2;
        uls0Var.b = function1;
        uls0Var.b(oms0Var.f(), obj, t73Var);
        return uls0Var;
    }
}
