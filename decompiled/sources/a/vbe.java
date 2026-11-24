package a;

import android.gov.nist.core.Separators;
import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
public final class vbe implements xbe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f37138a;

    public vbe(Uri uri) {
        this.f37138a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vbe) && this.f37138a.equals(((vbe) obj).f37138a);
    }

    public final int hashCode() {
        return this.f37138a.hashCode();
    }

    public final String toString() {
        return "OnHyperlinkClick(uri=" + this.f37138a + Separators.RPAREN;
    }
}
