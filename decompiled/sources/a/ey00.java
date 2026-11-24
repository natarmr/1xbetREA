package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ey00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8603a;
    public final boolean b;

    public ey00(String str, boolean z) {
        str.getClass();
        this.f8603a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey00)) {
            return false;
        }
        ey00 ey00Var = (ey00) obj;
        return Intrinsics.d(this.f8603a, ey00Var.f8603a) && this.b == ey00Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f8603a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("LogoutUiState(message=", this.f8603a, ", isButtonsEnable=", this.b, Separators.RPAREN);
    }
}
