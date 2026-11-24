package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ha1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12702a;
    public final String b;
    public final wul c;
    public final wul d;

    public ha1(String str, String str2, wul wulVar, wul wulVar2) {
        str.getClass();
        str2.getClass();
        this.f12702a = str;
        this.b = str2;
        this.c = wulVar;
        this.d = wulVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha1)) {
            return false;
        }
        ha1 ha1Var = (ha1) obj;
        return Intrinsics.d(this.f12702a, ha1Var.f12702a) && Intrinsics.d(this.b, ha1Var.b) && this.c.equals(ha1Var.c) && this.d.equals(ha1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + i8i.a(this.c, ua80.b(this.f12702a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AggregatorPlayForRealUiState(title=", this.f12702a, ", description=", this.b, ", firstButtonUiModel=");
        sbN.append(this.c);
        sbN.append(", secondButtonUiModel=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
