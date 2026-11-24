package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class whz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xhz f39190a;
    public final rqm b;
    public final boolean c;

    public whz(xhz xhzVar, rqm rqmVar, boolean z) {
        this.f39190a = xhzVar;
        this.b = rqmVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whz)) {
            return false;
        }
        whz whzVar = (whz) obj;
        return this.f39190a == whzVar.f39190a && this.b.equals(whzVar.b) && this.c == whzVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f39190a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeaderboardTypeItemsUiModel(type=");
        sb.append(this.f39190a);
        sb.append(", settingCell=");
        sb.append(this.b);
        sb.append(", lastItem=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
