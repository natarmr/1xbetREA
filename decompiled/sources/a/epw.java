package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class epw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8207a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;

    public epw(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        this.f8207a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = z;
    }

    public static epw a(epw epwVar, boolean z) {
        String str = epwVar.f8207a;
        String str2 = epwVar.b;
        String str3 = epwVar.c;
        String str4 = epwVar.d;
        String str5 = epwVar.e;
        String str6 = epwVar.f;
        String str7 = epwVar.g;
        String str8 = epwVar.h;
        String str9 = epwVar.i;
        String str10 = epwVar.j;
        epwVar.getClass();
        return new epw(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epw)) {
            return false;
        }
        epw epwVar = (epw) obj;
        return this.f8207a.equals(epwVar.f8207a) && this.b.equals(epwVar.b) && this.c.equals(epwVar.c) && this.d.equals(epwVar.d) && this.e.equals(epwVar.e) && this.f.equals(epwVar.f) && this.g.equals(epwVar.g) && this.h.equals(epwVar.h) && this.i.equals(epwVar.i) && this.j.equals(epwVar.j) && this.k == epwVar.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f8207a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("HorseRunnerInfoStateModel(id=", this.f8207a, ", gender=", this.b, ", name=");
        f140.v(sbN, this.c, ", damAndSire=", this.d, ", distance=");
        f140.v(sbN, this.e, ", jockeyAndTrainer=", this.f, ", place=");
        f140.v(sbN, this.g, ", position=", this.h, ", weight=");
        f140.v(sbN, this.i, ", yearAndAge=", this.j, ", selected=");
        return rw2.p(sbN, this.k, Separators.RPAREN);
    }
}
