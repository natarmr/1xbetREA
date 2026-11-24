package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qyr implements ryr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29549a;

    public final boolean equals(Object obj) {
        if (obj instanceof qyr) {
            return this.f29549a.equals(((qyr) obj).f29549a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29549a.hashCode();
    }

    public final String toString() {
        return kng0.l("GameTitle(value=", this.f29549a, Separators.RPAREN);
    }
}
