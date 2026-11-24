package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mnb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22081a;
    public final String b;
    public final String c;

    public mnb0(boolean z, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f22081a = z;
        this.b = str;
        this.c = str2;
    }

    public static mnb0 a(mnb0 mnb0Var, boolean z, String str, String str2, int i) {
        if ((i & 1) != 0) {
            z = mnb0Var.f22081a;
        }
        if ((i & 2) != 0) {
            str = mnb0Var.b;
        }
        if ((i & 4) != 0) {
            str2 = mnb0Var.c;
        }
        mnb0Var.getClass();
        str.getClass();
        str2.getClass();
        return new mnb0(z, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnb0)) {
            return false;
        }
        mnb0 mnb0Var = (mnb0) obj;
        return this.f22081a == mnb0Var.f22081a && Intrinsics.d(this.b, mnb0Var.b) && Intrinsics.d(this.c, mnb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Boolean.hashCode(this.f22081a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(axq.q("PossibleWinStateModel(isVisible=", ", title=", this.b, this.f22081a, ", value="), this.c, Separators.RPAREN);
    }
}
