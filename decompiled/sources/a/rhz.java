package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rhz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30512a;
    public final rqm b;
    public final boolean c;

    public rhz(int i, rqm rqmVar, boolean z) {
        this.f30512a = i;
        this.b = rqmVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhz)) {
            return false;
        }
        rhz rhzVar = (rhz) obj;
        return this.f30512a == rhzVar.f30512a && this.b.equals(rhzVar.b) && this.c == rhzVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Integer.hashCode(this.f30512a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeaderboardTimeFilterUiModel(id=");
        sb.append(this.f30512a);
        sb.append(", settingCell=");
        sb.append(this.b);
        sb.append(", lastItem=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
