package a;

/* JADX INFO: loaded from: classes3.dex */
public final class rpw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30905a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public rpw(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.f30905a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpw)) {
            return false;
        }
        rpw rpwVar = (rpw) obj;
        return this.f30905a.equals(rpwVar.f30905a) && this.b.equals(rpwVar.b) && this.c.equals(rpwVar.c) && this.d.equals(rpwVar.d) && this.e.equals(rpwVar.e) && this.f.equals(rpwVar.f) && this.g.equals(rpwVar.g) && this.h.equals(rpwVar.h) && this.i.equals(rpwVar.i) && this.j.equals(rpwVar.j);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f30905a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("HorsesParamsModel(id=", this.f30905a, ", gender=", this.b, ", name=");
        f140.v(sbN, this.c, ", damAndSire=", this.d, ", distance=");
        f140.v(sbN, this.e, ", jockeyAndTrainer=", this.f, ", place=");
        f140.v(sbN, this.g, ", position=", this.h, ", weight=");
        return ua80.m(sbN, this.i, ", yearAndAge=", this.j, ", selected=true)");
    }
}
