package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class me80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21632a;
    public final boolean b;

    public me80(String str, boolean z) {
        str.getClass();
        this.f21632a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me80)) {
            return false;
        }
        me80 me80Var = (me80) obj;
        return Intrinsics.d(this.f21632a, me80Var.f21632a) && this.b == me80Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f21632a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("OutcomesSelectionNavBarUiModel(navBarTitle=", this.f21632a, ", clearAllButtonEnabled=", this.b, Separators.RPAREN);
    }
}
