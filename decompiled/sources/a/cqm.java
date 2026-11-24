package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class cqm implements eqm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4801a;
    public final y3d b;

    public cqm(int i, y3d y3dVar) {
        this.f4801a = i;
        this.b = y3dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqm)) {
            return false;
        }
        cqm cqmVar = (cqm) obj;
        return this.f4801a == cqmVar.f4801a && this.b.equals(cqmVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f4801a) * 31;
        long j = this.b.f41946a;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(j) + iHashCode;
    }

    public final String toString() {
        return "IconScoreCell(iconResId=" + this.f4801a + ", tintColor=" + this.b + Separators.RPAREN;
    }
}
