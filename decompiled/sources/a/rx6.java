package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rx6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ux6 f31248a;
    public final String b;
    public final kx6 c;

    public rx6(ux6 ux6Var, String str, kx6 kx6Var) {
        str.getClass();
        this.f31248a = ux6Var;
        this.b = str;
        this.c = kx6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx6)) {
            return false;
        }
        rx6 rx6Var = (rx6) obj;
        return this.f31248a.equals(rx6Var.f31248a) && Intrinsics.d(this.b, rx6Var.b) && this.c == rx6Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f31248a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "BetFieldUiState(fieldValueUiState=" + this.f31248a + ", supportingTextState=" + this.b + ", betFieldStyle=" + this.c + Separators.RPAREN;
    }
}
