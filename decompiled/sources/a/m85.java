package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class m85 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21353a;
    public final String b;
    public final wui0 c;
    public final boolean d;

    public m85(int i, String str, wui0 wui0Var, boolean z) {
        str.getClass();
        this.f21353a = i;
        this.b = str;
        this.c = wui0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m85)) {
            return false;
        }
        m85 m85Var = (m85) obj;
        return this.f21353a == m85Var.f21353a && Intrinsics.d(this.b, m85Var.b) && this.c == m85Var.c && this.d == m85Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + rw2.c(this.c, ua80.b(Integer.hashCode(this.f21353a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f21353a, "AvailableReasonValueUiModel(id=", ", selfExcludeReason=", this.b, ", position=");
        sbR.append(this.c);
        sbR.append(", selected=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
