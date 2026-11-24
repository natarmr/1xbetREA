package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class tow implements vow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f34304a;

    public tow(mdm mdmVar) {
        this.f34304a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tow) && this.f34304a.equals(((tow) obj).f34304a);
    }

    public final int hashCode() {
        return this.f34304a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f34304a, Separators.RPAREN);
    }
}
