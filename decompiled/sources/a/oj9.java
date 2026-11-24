package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class oj9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7d0 f25349a;
    public final vby b;
    public final n0o0 c;

    public oj9(vby vbyVar, q7d0 q7d0Var) {
        this.f25349a = q7d0Var;
        this.b = vbyVar;
        q7m0.a(Boolean.FALSE);
        this.c = maz.b(new vb8((Object) this, (byte) 24));
        roj0.b(0, 1, i99.b, 1);
    }

    public static boolean b(m97 m97Var, m97 m97Var2) {
        if (m97Var != m97Var2) {
            return m97Var.f21398a == m97Var2.f21398a && m97Var.h == m97Var2.h && m97Var.f == m97Var2.f && m97Var.j == m97Var2.j;
        }
        return true;
    }

    public final qz40 a() {
        return (qz40) this.c.getValue();
    }

    public final void c(List list) {
        this.f25349a.g("track_events_json", this.b.d(new zw3(pbs0.Companion.serializer(), (byte) 0), list));
    }
}
