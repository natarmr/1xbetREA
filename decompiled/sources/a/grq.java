package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class grq implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11793a;
    public final String b;
    public final String c;

    public grq(int i, String str, String str2) {
        str.getClass();
        this.f11793a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grq)) {
            return false;
        }
        grq grqVar = (grq) obj;
        return this.f11793a == grqVar.f11793a && Intrinsics.d(this.b, grqVar.b) && this.c.equals(grqVar.c);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_glyph_language_seconary) + ua80.b(ua80.b(Integer.hashCode(this.f11793a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return brm0.j(R.drawable.ic_glyph_language_seconary, this.c, ", noCountryImageRes=", Separators.RPAREN, vqd.r(this.f11793a, "FollowedCountryUiItem(countryId=", ", countryName=", this.b, ", countryImage="));
    }
}
