package a;

/* JADX INFO: loaded from: classes4.dex */
public final class j1q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1q0 f15748a;

    public j1q0(m1q0 m1q0Var) {
        m1q0Var.getClass();
        this.f15748a = m1q0Var;
    }

    public final boolean a(ygp ygpVar) {
        ygpVar.getClass();
        return this.f15748a.d(ygpVar);
    }

    public final rhi0 b() {
        m1q0 m1q0Var = this.f15748a;
        return (m1q0Var.o() || m1q0Var.p() || m1q0Var.g()) ? rhi0.b : rhi0.f30492a;
    }

    public final void c(cre creVar) {
        m1q0 m1q0Var = this.f15748a;
        m1q0Var.getClass();
        m1q0Var.e.o(null, creVar);
        int i = creVar.f4842a;
        q7d0 q7d0Var = m1q0Var.f21021a;
        q7d0Var.e(i, "FAKE_ID");
        String str = creVar.c;
        str.getClass();
        q7d0Var.g("FAKE_CODE", str);
        String str2 = creVar.b;
        str2.getClass();
        q7d0Var.g("FAKE_NAME", str2);
    }

    public final void d(boolean z) {
        m1q0 m1q0Var = this.f15748a;
        boolean z2 = z;
        m1q0Var.f21021a.d("LUXURY_TEST_SERVER", z2);
        p7m0 p7m0Var = m1q0Var.b;
        while (true) {
            Object value = p7m0Var.getValue();
            if (p7m0Var.m(value, ghp.a((ghp) value, false, false, z2, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 1048571))) {
                return;
            } else {
                z2 = z;
            }
        }
    }

    public final void e(boolean z) {
        m1q0 m1q0Var = this.f15748a;
        boolean z2 = z;
        m1q0Var.f21021a.d("SIP_CRM_TEST", z2);
        p7m0 p7m0Var = m1q0Var.b;
        while (true) {
            Object value = p7m0Var.getValue();
            if (p7m0Var.m(value, ghp.a((ghp) value, false, false, false, false, false, false, false, false, z2, false, false, false, false, false, false, false, false, false, false, 1048319))) {
                return;
            } else {
                z2 = z;
            }
        }
    }

    public final void f(boolean z) {
        m1q0 m1q0Var = this.f15748a;
        boolean z2 = z;
        m1q0Var.f21021a.d("SIP_CRM_V2_TEST", z2);
        p7m0 p7m0Var = m1q0Var.b;
        while (true) {
            Object value = p7m0Var.getValue();
            if (p7m0Var.m(value, ghp.a((ghp) value, false, false, false, false, false, false, false, false, false, z2, false, false, false, false, false, false, false, false, false, 1048063))) {
                return;
            } else {
                z2 = z;
            }
        }
    }

    public final void g(boolean z) {
        m1q0 m1q0Var;
        m1q0 m1q0Var2 = this.f15748a;
        m1q0Var2.f21021a.d("TEST_REMOTE_CONFIG_ENABLED", z);
        p7m0 p7m0Var = m1q0Var2.b;
        while (true) {
            Object value = p7m0Var.getValue();
            p7m0 p7m0Var2 = p7m0Var;
            m1q0Var = m1q0Var2;
            if (p7m0Var2.m(value, ghp.a((ghp) value, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, z, false, false, 917503))) {
                break;
            }
            p7m0Var = p7m0Var2;
            m1q0Var2 = m1q0Var;
        }
        if (z) {
            m1q0Var.f21021a.f("TEST_REMOTE_CONFIG_LAST_ACTION_TIME", System.currentTimeMillis());
        }
    }

    public final void h(boolean z) {
        m1q0 m1q0Var = this.f15748a;
        boolean z2 = z;
        m1q0Var.f21021a.d("TEST_SERVER", z2);
        p7m0 p7m0Var = m1q0Var.b;
        while (true) {
            Object value = p7m0Var.getValue();
            if (p7m0Var.m(value, ghp.a((ghp) value, z2, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 1048574))) {
                return;
            } else {
                z2 = z;
            }
        }
    }

    public final void i(boolean z) {
        m1q0 m1q0Var = this.f15748a;
        boolean z2 = z;
        m1q0Var.f21021a.d("SECOND_TEST_SERVER", z2);
        p7m0 p7m0Var = m1q0Var.b;
        while (true) {
            Object value = p7m0Var.getValue();
            if (p7m0Var.m(value, ghp.a((ghp) value, false, z2, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 1048573))) {
                return;
            } else {
                z2 = z;
            }
        }
    }

    public final cre j() {
        return (cre) this.f15748a.e.getValue();
    }
}
