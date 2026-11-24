package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class sgz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qgz f32184a;
    public final rqm b;
    public final boolean c;

    public sgz(qgz qgzVar, rqm rqmVar, boolean z) {
        this.f32184a = qgzVar;
        this.b = rqmVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgz)) {
            return false;
        }
        sgz sgzVar = (sgz) obj;
        return this.f32184a == sgzVar.f32184a && this.b.equals(sgzVar.b) && this.c == sgzVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f32184a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeaderboardRegionsItemsUiModel(type=");
        sb.append(this.f32184a);
        sb.append(", settingCell=");
        sb.append(this.b);
        sb.append(", lastItem=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
