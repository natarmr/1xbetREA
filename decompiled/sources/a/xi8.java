package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xi8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40932a;
    public final String b;
    public final String c;
    public final int d;

    public xi8(String str, String str2, String str3, int i) {
        brm0.B(str, str2, str3);
        this.f40932a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi8)) {
            return false;
        }
        xi8 xi8Var = (xi8) obj;
        return Intrinsics.d(this.f40932a, xi8Var.f40932a) && Intrinsics.d(this.b, xi8Var.b) && Intrinsics.d(this.c, xi8Var.c) && this.d == xi8Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ua80.b(ua80.b(this.f40932a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return brm0.j(this.d, this.c, ", imageResId=", Separators.RPAREN, b1j.n("BonusesInfoBottomSheetItemState(id=", this.f40932a, ", title=", this.b, ", label="));
    }
}
