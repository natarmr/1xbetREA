package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z890 implements c990 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f43956a;

    public z890(ra10 ra10Var) {
        ra10Var.getClass();
        this.f43956a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z890) && Intrinsics.d(this.f43956a, ((z890) obj).f43956a);
    }

    public final int hashCode() {
        return this.f43956a.hashCode();
    }

    public final String toString() {
        return h97.k("ShowError(lottieConfig=", this.f43956a, Separators.RPAREN);
    }
}
