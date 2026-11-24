package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class dxl implements fxl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6851a;

    public dxl(String str) {
        this.f6851a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dxl) && this.f6851a.equals(((dxl) obj).f6851a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_glyph_category_new) + (this.f6851a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(R.drawable.ic_glyph_category_new, "ByUrlWithDrawableRes(url=", this.f6851a, ", error=", Separators.RPAREN);
    }
}
