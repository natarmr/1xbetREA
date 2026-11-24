package a;

/* JADX INFO: loaded from: classes.dex */
public final class rb5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ye50 f30168a;
    public final jg60 b;

    public rb5(ye50 ye50Var, jg60 jg60Var) {
        this.f30168a = ye50Var;
        this.b = jg60Var;
        if ((ye50Var == null ? jg60Var : ye50Var) != null) {
            return;
        }
        jf4.o("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    public final void a(c2 c2Var) {
        ye50 ye50Var = this.f30168a;
        if (ye50Var != null) {
            ye50.a(ye50Var, (qb5) c2Var.b);
            return;
        }
        jg60 jg60Var = this.b;
        if (jg60Var != null) {
            jg60Var.b((v62) c2Var.f3600a);
        } else {
            jf4.n("Unreachable");
        }
    }

    public final void b(c2 c2Var) {
        if (this.f30168a != null) {
            ((qb5) c2Var.b).h();
        } else if (this.b != null) {
            ((v62) c2Var.f3600a).e();
        } else {
            jf4.n("Unreachable");
        }
    }
}
