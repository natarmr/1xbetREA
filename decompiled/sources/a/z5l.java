package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class z5l implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43822a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;

    public z5l(String str, String str2, String str3, boolean z, String str4) {
        this.f43822a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5l)) {
            return false;
        }
        z5l z5lVar = (z5l) obj;
        return this.f43822a.equals(z5lVar.f43822a) && this.b.equals(z5lVar.b) && this.c.equals(z5lVar.c) && this.d.equals(z5lVar.d) && this.e == z5lVar.e;
    }

    @Override // a.hvk0
    public final Object getKey() {
        return this.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(ua80.b(ua80.b(twn.a(R.drawable.ic_dota2_placeholder, this.f43822a.hashCode() * 31, 31), 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(R.drawable.ic_dota2_placeholder, "DotaPopularHeroContentUiModel(icon=", this.f43822a, ", placeHolderIcon=", ", name=");
        f140.v(sbP, this.b, ", picks=", this.c, ", wins=");
        return defpackage.c.c(this.d, ", isLastItem=", Separators.RPAREN, sbP, this.e);
    }
}
