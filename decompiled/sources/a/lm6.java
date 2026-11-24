package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lm6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20281a;
    public final boolean b;
    public final boolean c;

    public lm6(String str, boolean z, boolean z2) {
        tf6 tf6Var = tf6.f33852a;
        str.getClass();
        this.f20281a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm6)) {
            return false;
        }
        lm6 lm6Var = (lm6) obj;
        if (!Intrinsics.d(this.f20281a, lm6Var.f20281a) || this.b != lm6Var.b || this.c != lm6Var.c) {
            return false;
        }
        tf6 tf6Var = tf6.f33852a;
        return true;
    }

    public final int hashCode() {
        return tf6.f33852a.hashCode() + brm0.e(brm0.e(this.f20281a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        tf6 tf6Var = tf6.f33852a;
        StringBuilder sbU = brm0.u("BetBuilderUiModel(label=", this.f20281a, ", isExpanded=", this.b, ", isBadgeVisible=");
        sbU.append(this.c);
        sbU.append(", variant=");
        sbU.append(tf6Var);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
