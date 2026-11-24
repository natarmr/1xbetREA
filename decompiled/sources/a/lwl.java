package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class lwl implements nwl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20769a;

    public lwl(String str) {
        this.f20769a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lwl) && this.f20769a.equals(((lwl) obj).f20769a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_glyph_category_new) + (this.f20769a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(R.drawable.ic_glyph_category_new, "ByUrlWithDrawableRes(url=", this.f20769a, ", error=", Separators.RPAREN);
    }
}
