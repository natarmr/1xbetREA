package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nfv {
    public static final nfv e = new nfv("", "", "", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23456a;
    public final String b;
    public final String c;
    public final String d;

    public nfv(String str, String str2, String str3, String str4) {
        this.f23456a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfv)) {
            return false;
        }
        nfv nfvVar = (nfv) obj;
        return this.f23456a.equals(nfvVar.f23456a) && this.b.equals(nfvVar.b) && this.c.equals(nfvVar.c) && this.d.equals(nfvVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f23456a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("GrapplingModel(takedownAveraged=", this.f23456a, ", takedownAccuracy=", this.b, ", takedownProtection="), this.c, ", freeDefeat=", this.d, Separators.RPAREN);
    }
}
