package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ssp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32735a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final iuj0 l;
    public final nfv m;

    public ssp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, iuj0 iuj0Var, nfv nfvVar) {
        str.getClass();
        iuj0Var.getClass();
        nfvVar.getClass();
        this.f32735a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = iuj0Var;
        this.m = nfvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssp)) {
            return false;
        }
        ssp sspVar = (ssp) obj;
        return Intrinsics.d(this.f32735a, sspVar.f32735a) && this.b.equals(sspVar.b) && this.c.equals(sspVar.c) && this.d.equals(sspVar.d) && this.e.equals(sspVar.e) && this.f.equals(sspVar.f) && this.g.equals(sspVar.g) && this.h.equals(sspVar.h) && this.i.equals(sspVar.i) && this.j.equals(sspVar.j) && this.k.equals(sspVar.k) && Intrinsics.d(this.l, sspVar.l) && Intrinsics.d(this.m, sspVar.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + ((this.l.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f32735a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("FightOpponentModel(id=", this.f32735a, ", nickname=", this.b, ", country=");
        f140.v(sbN, this.c, ", record=", this.d, ", knockout=");
        f140.v(sbN, this.e, ", painTechniques=", this.f, ", judgment=");
        f140.v(sbN, this.g, ", height=", this.h, ", weight=");
        f140.v(sbN, this.i, ", armSpan=", this.j, ", legSpan=");
        sbN.append(this.k);
        sbN.append(", significantHits=");
        sbN.append(this.l);
        sbN.append(", grappling=");
        sbN.append(this.m);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
