package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fgz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9518a;
    public final rqm b;
    public final boolean c;

    public fgz(long j, rqm rqmVar, boolean z) {
        this.f9518a = j;
        this.b = rqmVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgz)) {
            return false;
        }
        fgz fgzVar = (fgz) obj;
        return this.f9518a == fgzVar.f9518a && this.b.equals(fgzVar.b) && this.c == fgzVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.f9518a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeaderboardDisciplineFilterItemsUiModel(subSportId=");
        sb.append(this.f9518a);
        sb.append(", settingCell=");
        sb.append(this.b);
        return f140.n(sb, ", lastItem=", this.c, Separators.RPAREN);
    }
}
