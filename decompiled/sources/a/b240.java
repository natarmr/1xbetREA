package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b240 implements f240 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f1838a;
    public final boolean b;
    public final r040 c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;

    public b240(int i, iz30 iz30Var, r040 r040Var, String str, String str2, String str3, boolean z) {
        r040Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f1838a = iz30Var;
        this.b = z;
        this.c = r040Var;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    @Override // a.f240
    public final boolean K() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b240)) {
            return false;
        }
        b240 b240Var = (b240) obj;
        return this.f1838a == b240Var.f1838a && this.b == b240Var.b && this.c == b240Var.c && this.d == b240Var.d && Intrinsics.d(this.e, b240Var.e) && Intrinsics.d(this.f, b240Var.f) && Intrinsics.d(this.g, b240Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(ua80.b(twn.a(this.d, w6x.f(this.c, brm0.e(this.f1838a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f);
    }

    @Override // a.f240
    public final iz30 m() {
        return this.f1838a;
    }

    @Override // a.f240
    public final r040 n() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sbS = w6x.s("UfcEndIconMenuUiItem(menuItemModel=", this.f1838a, ", isBadgeVisible=", this.b, ", menuSectionType=");
        f140.t(sbS, this.c, ", icon=", this.d, ", title=");
        f140.v(sbS, this.e, ", subtitle=", this.f, ", endIconUrl=");
        return axq.n(sbS, this.g, Separators.RPAREN);
    }
}
