package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class qte implements ute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29296a;

    public final boolean equals(Object obj) {
        if (obj instanceof qte) {
            return this.f29296a == ((qte) obj).f29296a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29296a);
    }

    public final String toString() {
        return ua80.e(this.f29296a, "TagColor(value=", Separators.RPAREN);
    }
}
