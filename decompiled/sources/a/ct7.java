package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ct7 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final et7 f4921a;

    public final boolean equals(Object obj) {
        if (obj instanceof ct7) {
            return this.f4921a.equals(((ct7) obj).f4921a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4921a.hashCode();
    }

    public final String toString() {
        return "BetsOnFavoriteState(value=" + this.f4921a + Separators.RPAREN;
    }
}
