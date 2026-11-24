package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class icm0 implements jcm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9m0 f14543a;
    public final zdm0 b;
    public final boolean c;
    public final ArrayList d;

    public icm0(j9m0 j9m0Var, zdm0 zdm0Var, boolean z, ArrayList arrayList) {
        this.f14543a = j9m0Var;
        this.b = zdm0Var;
        this.c = z;
        this.d = arrayList;
    }

    @Override // a.jcm0
    public final boolean a() {
        return this.c;
    }

    @Override // a.jcm0
    public final zdm0 c() {
        return this.b;
    }

    @Override // a.jcm0
    public final j9m0 d() {
        return this.f14543a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icm0)) {
            return false;
        }
        icm0 icm0Var = (icm0) obj;
        return this.f14543a.equals(icm0Var.f14543a) && this.b.equals(icm0Var.b) && this.c == icm0Var.c && this.d.equals(icm0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(kng0.a(this.b, this.f14543a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "Success(backgroundUiModel=" + this.f14543a + ", statisticHeaderUiModel=" + this.b + ", rtlSupport=" + this.c + ", menuList=" + this.d + Separators.RPAREN;
    }
}
