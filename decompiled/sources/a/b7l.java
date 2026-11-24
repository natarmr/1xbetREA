package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class b7l implements e7l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wus f2115a;

    public final boolean equals(Object obj) {
        if (obj instanceof b7l) {
            return this.f2115a.equals(((b7l) obj).f2115a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2115a.hashCode();
    }

    public final String toString() {
        return "SendGameToolbarSideEffect(value=" + this.f2115a + Separators.RPAREN;
    }
}
