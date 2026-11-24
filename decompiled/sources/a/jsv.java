package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jsv implements ksv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17071a;

    public final boolean equals(Object obj) {
        if (obj instanceof jsv) {
            return this.f17071a == ((jsv) obj).f17071a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17071a);
    }

    public final String toString() {
        return ua80.e(this.f17071a, "TextColor(value=", Separators.RPAREN);
    }
}
