package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w85 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38705a;
    public final String b;
    public final String c;

    public w85(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f38705a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w85)) {
            return false;
        }
        w85 w85Var = (w85) obj;
        return this.f38705a == w85Var.f38705a && Intrinsics.d(this.b, w85Var.b) && Intrinsics.d(this.c, w85Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f38705a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(vqd.r(this.f38705a, "AvailableValueModel(value=", ", measure=", this.b, ", valueView="), this.c, Separators.RPAREN);
    }
}
