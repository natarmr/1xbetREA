package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class knb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18577a;
    public final String b;
    public final String c;

    public knb0(boolean z, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f18577a = z;
        this.b = str;
        this.c = str2;
    }

    public static knb0 a(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return new knb0(z, str, str2);
    }

    public static /* synthetic */ knb0 b(knb0 knb0Var, boolean z, String str, int i) {
        if ((i & 1) != 0) {
            z = knb0Var.f18577a;
        }
        if ((i & 2) != 0) {
            str = knb0Var.b;
        }
        String str2 = (i & 4) != 0 ? knb0Var.c : "";
        knb0Var.getClass();
        return a(str, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knb0)) {
            return false;
        }
        knb0 knb0Var = (knb0) obj;
        return this.f18577a == knb0Var.f18577a && Intrinsics.d(this.b, knb0Var.b) && Intrinsics.d(this.c, knb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Boolean.hashCode(this.f18577a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(axq.q("PossibleWinStateModel(isVisible=", ", title=", this.b, this.f18577a, ", value="), this.c, Separators.RPAREN);
    }
}
