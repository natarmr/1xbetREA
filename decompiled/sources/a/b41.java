package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1935a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final n0x f;

    public b41(String str, String str2, String str3, String str4, String str5, n0x n0xVar) {
        cs0.x(str, str3, str4, str5);
        this.f1935a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = n0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b41)) {
            return false;
        }
        b41 b41Var = (b41) obj;
        return Intrinsics.d(this.f1935a, b41Var.f1935a) && this.b.equals(b41Var.b) && Intrinsics.d(this.c, b41Var.c) && Intrinsics.d(this.d, b41Var.d) && Intrinsics.d(this.e, b41Var.e) && this.f.equals(b41Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(this.f1935a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AggregatorJackpotBottomSheetUiState(title=", this.f1935a, ", amount=", this.b, ", description=");
        f140.v(sbN, this.c, ", primaryButtonText=", this.d, ", secondaryButtonText=");
        sbN.append(this.e);
        sbN.append(", image=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
