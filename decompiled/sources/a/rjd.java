package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rjd implements sjd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30586a;

    public rjd(int i) {
        this.f30586a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rjd) && this.f30586a == ((rjd) obj).f30586a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30586a);
    }

    public final String toString() {
        return ua80.e(this.f30586a, "ShowOnFavoriteBtnClickWarning(message=", Separators.RPAREN);
    }
}
