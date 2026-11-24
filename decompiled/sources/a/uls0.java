package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class uls0 implements l7m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cms0 f35890a;
    public Function1 b;
    public Function1 c;
    public final /* synthetic */ vls0 d;

    public uls0(vls0 vls0Var, cms0 cms0Var, Function1 function1, Function1 function2) {
        this.d = vls0Var;
        this.f35890a = cms0Var;
        this.b = function1;
        this.c = function2;
    }

    public final void b(ams0 ams0Var, Object obj, t73 t73Var) {
        Object objInvoke = this.c.invoke(ams0Var.b());
        boolean zH = this.d.c.h();
        cms0 cms0Var = this.f35890a;
        if (zH) {
            cms0Var.g(this.c.invoke(ams0Var.d()), objInvoke, (cfq) this.b.invoke(ams0Var));
        } else {
            cms0Var.h(objInvoke, (cfq) this.b.invoke(ams0Var), obj, t73Var);
        }
    }

    @Override // a.l7m0
    public final Object getValue() {
        b(this.d.c.f(), null, null);
        return ((hgk0) this.f35890a.j).getValue();
    }
}
