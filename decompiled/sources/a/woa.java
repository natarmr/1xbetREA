package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class woa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39484a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final voa h;

    public woa(String str, String str2, String str3, String str4, String str5, String str6, String str7, voa voaVar) {
        this.f39484a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = voaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof woa)) {
            return false;
        }
        woa woaVar = (woa) obj;
        return this.f39484a.equals(woaVar.f39484a) && this.b.equals(woaVar.b) && this.c.equals(woaVar.c) && this.d.equals(woaVar.d) && this.e.equals(woaVar.e) && this.f.equals(woaVar.f) && this.g.equals(woaVar.g) && this.h == woaVar.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f39484a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CardWeatherModel(location=", this.f39484a, ", locationCity=", this.b, ", locationCountry=");
        f140.v(sbN, this.c, ", temperature=", this.d, ", windSpeed=");
        f140.v(sbN, this.e, ", pressure=", this.f, ", humidity=");
        sbN.append(this.g);
        sbN.append(", weatherIconType=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
