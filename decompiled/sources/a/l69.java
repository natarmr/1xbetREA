package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class l69 implements ky90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cgk0 f19495a;
    public final /* synthetic */ dfu0 b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ pz40 d;

    public l69(cgk0 cgk0Var, dfu0 dfu0Var, pz40 pz40Var, pz40 pz40Var2) {
        this.f19495a = cgk0Var;
        this.b = dfu0Var;
        this.c = pz40Var;
        this.d = pz40Var2;
    }

    @Override // a.ky90
    public final void G(dlo dloVar) {
        dloVar.getClass();
        int i = dloVar.f6293a;
        boolean zContains = xx90.f41646a.contains(Integer.valueOf(i));
        pz40 pz40Var = this.c;
        if (!zContains) {
            ay90 ay90Var = (ay90) pz40Var.getValue();
            pz40Var.setValue(new ay90((ay90Var != null ? ay90Var.f1661a : 0) + 1, i == 1002));
        } else {
            this.b.f6017a = 0;
            pz40Var.setValue(null);
            ((Function0) this.d.getValue()).invoke();
        }
    }

    @Override // a.ky90
    public final void f(int i) {
        this.f19495a.m(i);
    }
}
