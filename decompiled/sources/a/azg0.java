package a;

/* JADX INFO: loaded from: classes.dex */
public final class azg0 implements jff0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u0h0 f1716a;
    public fzg0 b;
    public String c;
    public Object d;
    public Object[] e;
    public ezg0 f;
    public final a7g0 g = new a7g0(this, 9);

    public azg0(u0h0 u0h0Var, fzg0 fzg0Var, String str, Object obj, Object[] objArr) {
        this.f1716a = u0h0Var;
        this.b = fzg0Var;
        this.c = str;
        this.d = obj;
        this.e = objArr;
    }

    public final void a() throws NoSuchMethodException, ClassNotFoundException {
        String strL;
        fzg0 fzg0Var = this.b;
        ezg0 ezg0Var = this.f;
        if (ezg0Var != null) {
            e9d0.u(ezg0Var, ") is not null", "entry(");
            return;
        }
        if (fzg0Var != null) {
            a7g0 a7g0Var = this.g;
            Object objInvoke = a7g0Var.invoke();
            if (objInvoke == null || fzg0Var.d(objInvoke)) {
                this.f = fzg0Var.a(this.c, a7g0Var);
                return;
            }
            if (objInvoke instanceof fgk0) {
                fgk0 fgk0Var = (fgk0) objInvoke;
                strL = (fgk0Var.d() == m2a.v || fgk0Var.d() == rek0.c || fgk0Var.d() == ujn.A) ? f140.k(fgk0Var.getValue(), "MutableState containing ", " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().") : "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            } else {
                strL = e9x.L(objInvoke);
            }
            throw new IllegalArgumentException(strL);
        }
    }

    @Override // a.jff0
    public final void c() throws NoSuchMethodException, ClassNotFoundException {
        a();
    }

    @Override // a.jff0
    public final void f() {
        ezg0 ezg0Var = this.f;
        if (ezg0Var != null) {
            ((nvu) ezg0Var).W();
        }
    }

    @Override // a.jff0
    public final void g() {
        ezg0 ezg0Var = this.f;
        if (ezg0Var != null) {
            ((nvu) ezg0Var).W();
        }
    }
}
