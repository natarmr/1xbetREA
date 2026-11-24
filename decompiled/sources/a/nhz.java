package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nhz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final epe f23559a;
    public final rqm b;
    public final boolean c;

    public nhz(epe epeVar, rqm rqmVar, boolean z) {
        this.f23559a = epeVar;
        this.b = rqmVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhz)) {
            return false;
        }
        nhz nhzVar = (nhz) obj;
        return this.f23559a == nhzVar.f23559a && this.b.equals(nhzVar.b) && this.c == nhzVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f23559a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeaderboardTeamsTypeItemsUiModel(type=");
        sb.append(this.f23559a);
        sb.append(", settingCell=");
        sb.append(this.b);
        sb.append(", lastItem=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
