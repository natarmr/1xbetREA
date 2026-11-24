package a;

/* JADX INFO: loaded from: classes2.dex */
public final class c1j extends i3t0 {
    public b4j o;
    public je p;

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        q0j q0jVar;
        t0j t0jVar = (t0j) obj;
        je jeVar = this.p;
        b4j b4jVar = this.o;
        t0jVar.getClass();
        super.x(t0jVar);
        if (t0jVar instanceof p0j) {
            E();
            return;
        }
        if (t0jVar instanceof q0j) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
                q0jVar = (q0j) t0jVar;
            } while (!p7m0Var.m(value, new z0j(q0jVar.b, q0jVar.c, q0jVar.f27901a)));
            return;
        }
        if (t0jVar instanceof r0j) {
            b4jVar.e(((z0j) D()).c, "onboard_more");
            jeVar.c(((z0j) D()).c, "onboard_more");
            G(new x0j(((z0j) D()).b, ((z0j) D()).c, ((z0j) D()).f43569a));
            return;
        }
        if (!(t0jVar instanceof s0j)) {
            t9f.b();
            return;
        }
        i8i.D("position", "button", b4jVar.f1961a, "dchallenge_section_more_close");
        b1j.v("button", jeVar.f16351a, 10936L);
        G(w0j.f38350a);
    }
}
