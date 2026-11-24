package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class udm0 implements vdm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35487a;
    public final String b;
    public final String c;
    public final mom0 d;

    public udm0(String str, String str2, String str3, mom0 mom0Var) {
        brm0.B(str, str2, str3);
        this.f35487a = str;
        this.b = str2;
        this.c = str3;
        this.d = mom0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udm0)) {
            return false;
        }
        udm0 udm0Var = (udm0) obj;
        return Intrinsics.d(this.f35487a, udm0Var.f35487a) && Intrinsics.d(this.b, udm0Var.b) && Intrinsics.d(this.c, udm0Var.c) && this.d.equals(udm0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f35487a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TwoLinesSolo(eventTitle=", this.f35487a, ", logo=", this.b, ", title=");
        sbN.append(this.c);
        sbN.append(", gameStatusUiModel=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
