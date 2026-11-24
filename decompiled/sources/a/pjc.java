package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pjc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27082a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public pjc(String str, String str2, String str3, String str4, String str5) {
        this.f27082a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjc)) {
            return false;
        }
        pjc pjcVar = (pjc) obj;
        return this.f27082a.equals(pjcVar.f27082a) && this.b.equals(pjcVar.b) && this.c.equals(pjcVar.c) && this.d.equals(pjcVar.d) && this.e.equals(pjcVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f27082a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CircuitsModel(name=", this.f27082a, ", length=", this.b, ", turns=");
        f140.v(sbN, this.c, ", raceLapRecord=", this.d, ", surface=");
        return axq.n(sbN, this.e, Separators.RPAREN);
    }
}
