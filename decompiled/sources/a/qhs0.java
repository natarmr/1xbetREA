package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qhs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28755a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public qhs0(String str, String str2, String str3, String str4, String str5, String str6) {
        brm0.B(str2, str3, str6);
        this.f28755a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhs0)) {
            return false;
        }
        qhs0 qhs0Var = (qhs0) obj;
        return this.f28755a.equals(qhs0Var.f28755a) && Intrinsics.d(this.b, qhs0Var.b) && Intrinsics.d(this.c, qhs0Var.c) && this.d.equals(qhs0Var.d) && this.e.equals(qhs0Var.e) && Intrinsics.d(this.f, qhs0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(this.f28755a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TransferPlayerCardUiModel(dateString=", this.f28755a, ", teamOneName=", this.b, ", teamTwoName=");
        f140.v(sbN, this.c, ", teamOneImage=", this.d, ", teamTwoImage=");
        return ua80.m(sbN, this.e, ", transferType=", this.f, Separators.RPAREN);
    }
}
