package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ld5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19833a;
    public final int b;

    public ld5(String str, int i) {
        str.getClass();
        this.f19833a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld5)) {
            return false;
        }
        ld5 ld5Var = (ld5) obj;
        return Intrinsics.d(this.f19833a, ld5Var.f19833a) && this.b == ld5Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f19833a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "BackgroundStateModel(backgroundImageUrl=", this.f19833a, ", placeholderRes=", Separators.RPAREN);
    }
}
