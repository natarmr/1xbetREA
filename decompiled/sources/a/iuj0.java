package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class iuj0 {
    public static final iuj0 e = new iuj0("", "", "", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15400a;
    public final String b;
    public final String c;
    public final String d;

    public iuj0(String str, String str2, String str3, String str4) {
        this.f15400a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iuj0)) {
            return false;
        }
        iuj0 iuj0Var = (iuj0) obj;
        return this.f15400a.equals(iuj0Var.f15400a) && this.b.equals(iuj0Var.b) && this.c.equals(iuj0Var.c) && this.d.equals(iuj0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f15400a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("SignificantHitsModel(hitsPerMinute=", this.f15400a, ", hitsAccuracy=", this.b, ", hitsReceivedPerMinute="), this.c, ", hitsProtection=", this.d, Separators.RPAREN);
    }
}
