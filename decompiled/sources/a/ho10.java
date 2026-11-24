package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ho10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13371a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;

    public ho10(int i, String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f13371a = i;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho10)) {
            return false;
        }
        ho10 ho10Var = (ho10) obj;
        return this.f13371a == ho10Var.f13371a && this.b == ho10Var.b && Intrinsics.d(this.c, ho10Var.c) && Intrinsics.d(this.d, ho10Var.d) && this.e == ho10Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(ua80.b(brm0.e(Integer.hashCode(this.f13371a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbL = h97.l(this.f13371a, "LuckyWheelResultState(iconResId=", ", isWin=", ", title=", this.b);
        f140.v(sbL, this.c, ", description=", this.d, ", showActivateButton=");
        return rw2.p(sbL, this.e, Separators.RPAREN);
    }
}
