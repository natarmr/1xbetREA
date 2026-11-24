package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qdm0 implements vdm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28542a;
    public final String b;
    public final mom0 c;

    public qdm0(String str, String str2, mom0 mom0Var) {
        str.getClass();
        str2.getClass();
        this.f28542a = str;
        this.b = str2;
        this.c = mom0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdm0)) {
            return false;
        }
        qdm0 qdm0Var = (qdm0) obj;
        return Intrinsics.d(this.f28542a, qdm0Var.f28542a) && Intrinsics.d(this.b, qdm0Var.b) && this.c.equals(qdm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f28542a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Description(eventTitle=", this.f28542a, ", description=", this.b, ", gameStatusUiModel=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
