package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hlb implements jlb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m5p f13250a;
    public final zrm b;

    public hlb(m5p m5pVar, zrm zrmVar) {
        this.f13250a = m5pVar;
        this.b = zrmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlb)) {
            return false;
        }
        hlb hlbVar = (hlb) obj;
        return this.f13250a.equals(hlbVar.f13250a) && this.b.equals(hlbVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return String.valueOf(this.f13250a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13250a.hashCode() * 31);
    }

    public final String toString() {
        return "ChampionshipDataUiModel(champ=" + this.f13250a + ", cellStyle=" + this.b + Separators.RPAREN;
    }
}
