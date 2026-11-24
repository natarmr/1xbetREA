package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xif {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40942a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;

    public xif(String str, String str2, String str3, String str4, String str5, long j) {
        this.f40942a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xif)) {
            return false;
        }
        xif xifVar = (xif) obj;
        return this.f40942a.equals(xifVar.f40942a) && this.b.equals(xifVar.b) && this.c == xifVar.c && this.d.equals(xifVar.d) && this.e.equals(xifVar.e) && this.f.equals(xifVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(rw2.b(ua80.b(this.f40942a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Cs2CompositionPlayerModel(id=", this.f40942a, ", name=", this.b, ", playerClId=");
        kng0.z(sbN, this.c, ", shortName=", this.d);
        f140.v(sbN, ", countryImage=", this.e, ", image=", this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
