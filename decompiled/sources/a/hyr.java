package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hyr implements lyr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13872a;

    public final boolean equals(Object obj) {
        if (obj instanceof hyr) {
            return this.f13872a.equals(((hyr) obj).f13872a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13872a.hashCode();
    }

    public final String toString() {
        return kng0.l("Information(value=", this.f13872a, Separators.RPAREN);
    }
}
