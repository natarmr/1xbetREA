package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cf40 implements ef40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vbj f4241a;

    public cf40(vbj vbjVar) {
        this.f4241a = vbjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cf40) && this.f4241a.equals(((cf40) obj).f4241a);
    }

    @Override // a.ef40
    public final vbj getState() {
        return this.f4241a;
    }

    public final int hashCode() {
        return this.f4241a.hashCode();
    }

    public final String toString() {
        return "UserTournaments(state=" + this.f4241a + Separators.RPAREN;
    }
}
