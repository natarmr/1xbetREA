package a;

/* JADX INFO: loaded from: classes.dex */
public final class snf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o55 f32492a;
    public final ito0 b;
    public final wu9 c;
    public final wu9 d;
    public final tu9 e;
    public final tu9 f;
    public boolean g = false;
    public boolean h = false;
    public qbb i;

    public snf0(o55 o55Var, ito0 ito0Var) {
        this.f32492a = o55Var;
        this.b = ito0Var;
        tu9 tu9Var = new tu9();
        tu9Var.c = new msf0();
        wu9 wu9Var = new wu9(tu9Var);
        tu9Var.b = wu9Var;
        try {
            this.e = tu9Var;
            tu9Var.f34540a = "CaptureCompleteFuture";
        } catch (Exception e) {
            wu9Var.b(e);
        }
        this.c = wu9Var;
        tu9 tu9Var2 = new tu9();
        tu9Var2.c = new msf0();
        wu9 wu9Var2 = new wu9(tu9Var2);
        tu9Var2.b = wu9Var2;
        try {
            this.f = tu9Var2;
            tu9Var2.f34540a = "RequestCompleteFuture";
        } catch (Exception e2) {
            wu9Var2.b(e2);
        }
        this.d = wu9Var2;
    }

    public final void a() {
        o55 o55Var = this.f32492a;
        boolean z = o55Var.j;
        if (!z || o55Var.a()) {
            if (!z) {
                z1x.y("The callback can only complete once.", !this.d.b.isDone());
            }
            this.f.b(null);
        }
    }
}
