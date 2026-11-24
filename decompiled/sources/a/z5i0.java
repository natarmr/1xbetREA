package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z5i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43818a;
    public final int b;
    public final String c;
    public final List d;
    public final List e;

    public z5i0(int i, String str, String str2, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f43818a = str;
        this.b = i;
        this.c = str2;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5i0)) {
            return false;
        }
        z5i0 z5i0Var = (z5i0) obj;
        return this.f43818a.equals(z5i0Var.f43818a) && this.b == z5i0Var.b && this.c.equals(z5i0Var.c) && Intrinsics.d(this.d, z5i0Var.d) && Intrinsics.d(this.e, z5i0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dw9.a(ua80.b(twn.a(this.b, this.f43818a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "SelectorTabModel(title=", this.f43818a, ", titleRefType=", ", titleRefId=");
        cs0.y(this.c, ", tables=", ", selectors=", sbP, this.d);
        return dw9.r(sbP, this.e, Separators.RPAREN);
    }
}
