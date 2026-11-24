package a;

/* JADX INFO: loaded from: classes3.dex */
public final class loi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h03 f20392a;

    public /* synthetic */ loi0(h03 h03Var) {
        this.f20392a = h03Var;
    }

    public void a(m97 m97Var) {
        Object obj;
        m97Var.getClass();
        nb7 nb7Var = (nb7) this.f20392a.b;
        nb7Var.getClass();
        m97 m97VarA = m97Var;
        nb7Var.b = m97VarA.d;
        p7m0 p7m0Var = nb7Var.f23225a;
        while (true) {
            Object value = p7m0Var.getValue();
            m97 m97Var2 = (m97) value;
            if (m97Var2 == null) {
                obj = value;
            } else {
                String str = m97Var2.p;
                m97VarA = m97.a(m97VarA, null, false, m97Var2.i, 0.0d, null, m97Var2.o, str, null, 0.0d, null, 67059455);
                obj = value;
            }
            if (p7m0Var.m(obj, m97VarA)) {
                return;
            } else {
                m97VarA = m97Var;
            }
        }
    }
}
