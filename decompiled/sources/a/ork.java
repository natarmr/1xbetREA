package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ork implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25737a;
    public final b8m b;
    public final j9m c;

    public ork(String str, b8m b8mVar, j9m j9mVar) {
        this.f25737a = str;
        this.b = b8mVar;
        this.c = j9mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ork)) {
            return false;
        }
        ork orkVar = (ork) obj;
        return this.f25737a.equals(orkVar.f25737a) && this.b.equals(orkVar.b) && this.c.equals(orkVar.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f25737a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f25737a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DisciplineDetailsIconFocusActiveTeamsUiModel(key=" + this.f25737a + ", header=" + this.b + ", activeTeams=" + this.c + Separators.RPAREN;
    }
}
