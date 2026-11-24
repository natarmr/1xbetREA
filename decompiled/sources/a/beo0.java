package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class beo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2461a;
    public final boolean b;
    public final int c;

    public beo0(String str, int i, boolean z) {
        str.getClass();
        this.f2461a = str;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof beo0)) {
            return false;
        }
        beo0 beo0Var = (beo0) obj;
        return Intrinsics.d(this.f2461a, beo0Var.f2461a) && this.b == beo0Var.b && this.c == beo0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + brm0.e(this.f2461a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, brm0.u("TabTitleUiModel(tabTitle=", this.f2461a, ", isSelected=", this.b, ", statePositionInList="));
    }
}
