package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xx8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41644a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;

    public xx8(String str, String str2, String str3, boolean z, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f41644a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx8)) {
            return false;
        }
        xx8 xx8Var = (xx8) obj;
        return Intrinsics.d(this.f41644a, xx8Var.f41644a) && this.b == xx8Var.b && Intrinsics.d(this.c, xx8Var.c) && Intrinsics.d(this.d, xx8Var.d) && Intrinsics.d(this.e, xx8Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(brm0.e(this.f41644a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("NavigationBarState(navigationBarTitle=", this.f41644a, ", isSearchActive=", this.b, ", searchFieldQuery=");
        f140.v(sbU, this.c, ", filterQuery=", this.d, ", navigationBarPlaceholder=");
        return axq.n(sbU, this.e, Separators.RPAREN);
    }
}
