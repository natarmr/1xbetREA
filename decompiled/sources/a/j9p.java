package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class j9p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final die f16148a;
    public final zpv b;
    public final boolean c;
    public final boolean d;

    public j9p(die dieVar, zpv zpvVar, boolean z, boolean z2) {
        this.f16148a = dieVar;
        this.b = zpvVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9p)) {
            return false;
        }
        j9p j9pVar = (j9p) obj;
        return this.f16148a.equals(j9pVar.f16148a) && this.b.equals(j9pVar.b) && this.c == j9pVar.c && this.d == j9pVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e((this.b.hashCode() + (this.f16148a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FavoriteGamesUiState(contentState=");
        sb.append(this.f16148a);
        sb.append(", headerActionsState=");
        sb.append(this.b);
        sb.append(", refreshing=");
        return ohs0.p(", scrollTop=", Separators.RPAREN, sb, this.c, this.d);
    }
}
