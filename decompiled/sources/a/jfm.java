package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class jfm implements mfm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16434a;
    public final xfm b;
    public final boolean c;

    public jfm(String str, xfm xfmVar, boolean z) {
        this.f16434a = str;
        this.b = xfmVar;
        this.c = z;
    }

    @Override // a.mfm
    public final dgm a() {
        return this.b;
    }

    @Override // a.mfm
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfm)) {
            return false;
        }
        jfm jfmVar = (jfm) obj;
        return this.f16434a.equals(jfmVar.f16434a) && this.b.equals(jfmVar.b) && this.c == jfmVar.c;
    }

    @Override // a.mfm
    public final String getHeader() {
        return this.f16434a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + twn.a(R.drawable.ic_glyph_chevron_down_small, (this.b.hashCode() + brm0.e(this.f16434a.hashCode() * 31, 31, false)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(header=");
        sb.append(this.f16434a);
        sb.append(", isPopular=false, style=");
        sb.append(this.b);
        sb.append(", accordionIcon=");
        return ohs0.k(R.drawable.ic_glyph_chevron_down_small, ", expanded=", Separators.RPAREN, sb, this.c);
    }
}
