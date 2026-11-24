package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ugn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35634a;
    public final String b;
    public final String c;

    public ugn0(String str, String str2, String str3) {
        str.getClass();
        this.f35634a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugn0)) {
            return false;
        }
        ugn0 ugn0Var = (ugn0) obj;
        return Intrinsics.d(this.f35634a, ugn0Var.f35634a) && this.b.equals(ugn0Var.b) && this.c.equals(ugn0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f35634a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("SuccessBetInfoHeaderUiModel(betType=", this.f35634a, ", betNumber=", this.b, ", shareButtonName="), this.c, Separators.RPAREN);
    }
}
