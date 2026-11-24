package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ykb implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjm f42780a;
    public final woh b;

    public ykb(hjm hjmVar, woh wohVar) {
        this.f42780a = hjmVar;
        this.b = wohVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykb)) {
            return false;
        }
        ykb ykbVar = (ykb) obj;
        return this.f42780a.equals(ykbVar.f42780a) && this.b.equals(ykbVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "STADIUM_INFO";
    }

    public final int hashCode() {
        return this.b.hashCode() + hne.e(this.f42780a, -517617104, 31);
    }

    public final String toString() {
        return "ChampionshipStadiumInfoUiModel(key=STADIUM_INFO, dsModel=" + this.f42780a + ", uiModel=" + this.b + Separators.RPAREN;
    }
}
