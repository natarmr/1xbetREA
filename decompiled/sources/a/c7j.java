package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class c7j implements d7j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1s0 f3865a;
    public final String b;

    public c7j(y1s0 y1s0Var, String str) {
        this.f3865a = y1s0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7j)) {
            return false;
        }
        c7j c7jVar = (c7j) obj;
        return this.f3865a.equals(c7jVar.f3865a) && this.b.equals(c7jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3865a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateTournamentItemModel(tournamentItemModel=" + this.f3865a + ", imageUrl=" + this.b + Separators.RPAREN;
    }
}
