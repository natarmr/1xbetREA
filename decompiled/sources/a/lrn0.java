package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lrn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ern0 f20542a;
    public final String b;

    public lrn0(ern0 ern0Var, String str) {
        ern0Var.getClass();
        str.getClass();
        this.f20542a = ern0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrn0)) {
            return false;
        }
        lrn0 lrn0Var = (lrn0) obj;
        return Intrinsics.d(this.f20542a, lrn0Var.f20542a) && Intrinsics.d(this.b, lrn0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20542a.hashCode() * 31);
    }

    public final String toString() {
        return "SwipeXTipsItem(screen=" + this.f20542a + ", image=" + this.b + Separators.RPAREN;
    }
}
