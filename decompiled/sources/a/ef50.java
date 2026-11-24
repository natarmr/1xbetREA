package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ef50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ye50 f7705a;
    public boolean b;

    public final void a() {
        ye50 ye50Var = this.f7705a;
        if (ye50Var == null) {
            return;
        }
        if (!this.b) {
            ye50Var.e(this, null);
        }
        ye50Var.d();
        if (ye50Var.i()) {
            ff50 ff50Var = ye50Var.e;
            viq viqVarF = ye50Var.f();
            ye50Var.g();
            ff50Var.getClass();
            if (equals(ff50Var.h) && -1 == ff50Var.g) {
                af50 af50VarC = ff50Var.f;
                if (af50VarC == null) {
                    af50VarC = ff50Var.c(-1);
                }
                ff50Var.f = null;
                ff50Var.g = 0;
                ff50Var.h = null;
                hf50 hf50Var = hf50.f12957a;
                if (af50VarC != null) {
                    af50VarC.d = hf50Var;
                    af50VarC.d();
                } else if (viqVarF != null) {
                    ((jg60) viqVarF.b).f16466a.run();
                }
                ff50Var.f9435a.o(null, hf50Var);
            }
        }
        this.b = false;
    }

    public void d() {
    }

    public void b(boolean z) {
    }

    public void c(boolean z) {
    }
}
