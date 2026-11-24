package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xet0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40760a;
    public final String b;

    public xet0(String str, String str2) {
        this.f40760a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xet0)) {
            return false;
        }
        xet0 xet0Var = (xet0) obj;
        return this.f40760a.equals(xet0Var.f40760a) && this.b.equals(xet0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40760a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("UnregisterResult(unregistrationGuid=", this.f40760a, ", secret=", this.b, Separators.RPAREN);
    }
}
