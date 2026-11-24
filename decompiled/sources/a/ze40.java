package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ze40 implements ef40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vbj f44236a;

    public ze40(vbj vbjVar) {
        this.f44236a = vbjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ze40) && this.f44236a.equals(((ze40) obj).f44236a);
    }

    @Override // a.ef40
    public final String getKey() {
        return "GUEST_RECOMMENDED_KEY";
    }

    @Override // a.ef40
    public final vbj getState() {
        return this.f44236a;
    }

    public final int hashCode() {
        return this.f44236a.hashCode();
    }

    public final String toString() {
        return "TopGames(state=" + this.f44236a + Separators.RPAREN;
    }
}
