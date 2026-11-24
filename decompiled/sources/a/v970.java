package a;

/* JADX INFO: loaded from: classes4.dex */
public final class v970 extends i3t0 {
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        String str;
        String str2;
        m970 m970Var = (m970) obj;
        m970Var.getClass();
        super.x(m970Var);
        if (m970Var instanceof i970) {
            G(o970.f24866a);
            return;
        }
        if (m970Var instanceof k970) {
            G(n970.f23126a);
            return;
        }
        if (!(m970Var instanceof j970)) {
            if (m970Var instanceof l970) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        boolean z = ((j970) m970Var).f16124a;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            q970 q970Var = (q970) value;
            this.f.getClass();
            str = q970Var.f28335a;
            str2 = q970Var.b;
            str.getClass();
            str2.getClass();
        } while (!p7m0Var.m(value, new q970(str, str2, z)));
    }
}
