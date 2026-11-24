package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class o4k0 implements p4k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24641a;

    public o4k0(String str) {
        this.f24641a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o4k0) && this.f24641a.equals(((o4k0) obj).f24641a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.icon_globe_empty) + (this.f24641a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(R.drawable.icon_globe_empty, "TeamImage(url=", this.f24641a, ", placeHolder=", Separators.RPAREN);
    }
}
