package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fwp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10269a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final gwp i;
    public final int j;

    public fwp(int i, long j, String str, String str2, String str3, String str4, String str5, int i2, gwp gwpVar, int i3) {
        this.f10269a = i;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = i2;
        this.i = gwpVar;
        this.j = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwp)) {
            return false;
        }
        fwp fwpVar = (fwp) obj;
        return this.f10269a == fwpVar.f10269a && this.b == fwpVar.b && this.c.equals(fwpVar.c) && this.d.equals(fwpVar.d) && this.e.equals(fwpVar.e) && this.f.equals(fwpVar.f) && this.g.equals(fwpVar.g) && this.h == fwpVar.h && this.i.equals(fwpVar.i) && this.j == fwpVar.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + ((this.i.hashCode() + twn.a(this.h, ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(rw2.b(Integer.hashCode(this.f10269a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f10269a, this.b, "FighterModel(fighterID=", ", feedId=");
        f140.v(sbQ, ", name=", this.c, ", firstName=", this.d);
        f140.v(sbQ, ", lastName=", this.e, ", nickname=", this.f);
        axq.s(this.h, ", imageUrl=", this.g, ", position=", sbQ);
        sbQ.append(", record=");
        sbQ.append(this.i);
        sbQ.append(", rankChange=");
        sbQ.append(this.j);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
