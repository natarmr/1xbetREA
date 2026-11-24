package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h280 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12320a;
    public final int b;
    public final List c;

    public h280(String str, List list, int i) {
        list.getClass();
        this.f12320a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h280)) {
            return false;
        }
        h280 h280Var = (h280) obj;
        return this.f12320a.equals(h280Var.f12320a) && this.b == h280Var.b && Intrinsics.d(this.c, h280Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f12320a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw9.r(kng0.p(this.b, "OpponentModel(fullName=", this.f12320a, ", countryId=", ", opps="), this.c, Separators.RPAREN);
    }
}
