package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class vob0 implements yob0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37758a;

    public final boolean equals(Object obj) {
        if (obj instanceof vob0) {
            return this.f37758a.equals(((vob0) obj).f37758a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37758a.hashCode();
    }

    public final String toString() {
        return kng0.l("MakeBetErrorModel(errorMessage=", this.f37758a, Separators.RPAREN);
    }
}
