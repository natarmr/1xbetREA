package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lnf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20342a;
    public final int b;

    public lnf0(String str, int i) {
        this.f20342a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnf0)) {
            return false;
        }
        lnf0 lnf0Var = (lnf0) obj;
        return this.f20342a.equals(lnf0Var.f20342a) && this.b == lnf0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + twn.a(22, ua80.b(brm0.e(twn.a(1357, Integer.hashCode(1) * 31, 31), 31, true), 31, this.f20342a), 31);
    }

    public final String toString() {
        return dw9.n(this.b, "RequestParamsValues(refId=1, groupId=1357, partnerGroup=true, language=", this.f20342a, ", whence=22, fcountryId=", Separators.RPAREN);
    }
}
