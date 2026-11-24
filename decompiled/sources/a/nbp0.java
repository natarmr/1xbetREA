package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nbp0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23253a;
    public final bhh b;

    public nbp0(String str, bhh bhhVar) {
        this.f23253a = str;
        this.b = bhhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbp0)) {
            return false;
        }
        nbp0 nbp0Var = (nbp0) obj;
        return this.f23253a.equals(nbp0Var.f23253a) && this.b.equals(nbp0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f23253a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23253a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamDetailsTeamInfoUiModel(key=" + this.f23253a + ", teamCard=" + this.b + Separators.RPAREN;
    }
}
