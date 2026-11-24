package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class h2g0 implements j2g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12332a;

    public h2g0(int i) {
        this.f12332a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2g0) && this.f12332a == ((h2g0) obj).f12332a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12332a);
    }

    public final String toString() {
        return ua80.e(this.f12332a, "ShowOnFavoriteBtnClickWarning(message=", Separators.RPAREN);
    }
}
