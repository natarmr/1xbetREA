package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t3r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f33284a;
    public final int b;

    public t3r0(i4 i4Var, int i) {
        i4Var.getClass();
        this.f33284a = i4Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3r0)) {
            return false;
        }
        t3r0 t3r0Var = (t3r0) obj;
        return Intrinsics.d(this.f33284a, t3r0Var.f33284a) && this.b == t3r0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f33284a.hashCode() * 31);
    }

    public final String toString() {
        return "TopEventSportFilterUiModel(items=" + this.f33284a + ", selectedIndex=" + this.b + Separators.RPAREN;
    }
}
