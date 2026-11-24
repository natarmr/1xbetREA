package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ogn0 implements pgn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25230a;

    public final boolean equals(Object obj) {
        if (obj instanceof ogn0) {
            return this.f25230a.equals(((ogn0) obj).f25230a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25230a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowShareError(message=", this.f25230a, Separators.RPAREN);
    }
}
