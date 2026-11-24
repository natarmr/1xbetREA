package a;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class uiv0 {
    public static final xiv0 b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xiv0 f35752a;

    static {
        liv0 fiv0Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            fiv0Var = new kiv0();
        } else if (i >= 35) {
            fiv0Var = new jiv0();
        } else if (i >= 34) {
            fiv0Var = new iiv0();
        } else if (i >= 31) {
            fiv0Var = new hiv0();
        } else if (i >= 30) {
            fiv0Var = new giv0();
        } else {
            fiv0Var = i >= 29 ? new fiv0() : new eiv0();
        }
        b = fiv0Var.b().f40966a.a().f40966a.b().f40966a.c();
    }

    public uiv0(xiv0 xiv0Var) {
        this.f35752a = xiv0Var;
    }

    public xiv0 a() {
        return this.f35752a;
    }

    public xiv0 b() {
        return this.f35752a;
    }

    public xiv0 c() {
        return this.f35752a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uiv0)) {
            return false;
        }
        uiv0 uiv0Var = (uiv0) obj;
        return t() == uiv0Var.t() && s() == uiv0Var.s() && Objects.equals(n(), uiv0Var.n()) && Objects.equals(l(), uiv0Var.l()) && Objects.equals(h(), uiv0Var.h());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public List<Rect> g(int i) {
        return Collections.EMPTY_LIST;
    }

    public vvk h() {
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(t()), Boolean.valueOf(s()), n(), l(), h());
    }

    public pfx i(int i) {
        return pfx.e;
    }

    public pfx j(int i) {
        if ((i & 8) == 0) {
            return pfx.e;
        }
        jf4.o("Unable to query the maximum insets for IME");
        return null;
    }

    public pfx k() {
        return n();
    }

    public pfx l() {
        return pfx.e;
    }

    public pfx m() {
        return n();
    }

    public pfx n() {
        return pfx.e;
    }

    public pfx o() {
        return n();
    }

    public xiv0 r(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public boolean u(int i) {
        return true;
    }

    public void q() {
    }

    public void A(int i) {
    }

    public void B(Rect[][] rectArr) {
    }

    public void C(Rect[][] rectArr) {
    }

    public void d(View view) {
    }

    public void e(xiv0 xiv0Var) {
    }

    public void p(View view) {
    }

    public void v(awk awkVar) {
    }

    public void w(pfx[] pfxVarArr) {
    }

    public void x(pfx pfxVar) {
    }

    public void y(xiv0 xiv0Var) {
    }

    public void z(pfx pfxVar) {
    }
}
