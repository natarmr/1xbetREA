package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class kb90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18003a;
    public final String b;
    public final String c;

    public kb90(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f18003a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb90)) {
            return false;
        }
        kb90 kb90Var = (kb90) obj;
        return Intrinsics.d(this.f18003a, kb90Var.f18003a) && Intrinsics.d(this.b, kb90Var.b) && this.c.equals(kb90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f18003a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("PayoutSummaryUiModel(titleText=", this.f18003a, ", betSum=", this.b, ", currency="), this.c, Separators.RPAREN);
    }
}
