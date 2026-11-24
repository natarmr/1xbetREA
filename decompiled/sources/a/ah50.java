package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ah50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f857a;
    public final String b;
    public final String c;

    public ah50(long j, String str, String str2) {
        this.f857a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah50)) {
            return false;
        }
        ah50 ah50Var = (ah50) obj;
        return this.f857a == ah50Var.f857a && this.b.equals(ah50Var.b) && this.c.equals(ah50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f857a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f857a, "NearestGameDetailsOppModel(id=", ", name=", this.b), ", image=", this.c, Separators.RPAREN);
    }
}
