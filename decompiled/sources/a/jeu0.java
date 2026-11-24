package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class jeu0 implements ky90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f16394a;
    public final /* synthetic */ pz40 b;

    public jeu0(Function0 function0, pz40 pz40Var) {
        this.f16394a = function0;
        this.b = pz40Var;
    }

    @Override // a.ky90
    public final void a(qfu0 qfu0Var) {
        qfu0Var.getClass();
        this.b.setValue(qfu0Var);
    }

    @Override // a.ky90
    public final void f(int i) {
        if (i == 3) {
            this.f16394a.invoke();
        }
    }
}
