package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g7t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10833a;
    public final String b;

    public g7t0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f10833a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7t0)) {
            return false;
        }
        g7t0 g7t0Var = (g7t0) obj;
        return Intrinsics.d(this.f10833a, g7t0Var.f10833a) && Intrinsics.d(this.b, g7t0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10833a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("UnAuthorizationUiModel(loginTitle=", this.f10833a, ", registrationTitle=", this.b, Separators.RPAREN);
    }
}
