package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class sia implements cja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final osw f32252a;
    public final mmo b;
    public final bo8 c;

    public sia(osw oswVar, mmo mmoVar, bo8 bo8Var) {
        dja djaVar = dja.PENALTY;
        this.f32252a = oswVar;
        this.b = mmoVar;
        this.c = bo8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sia)) {
            return false;
        }
        sia siaVar = (sia) obj;
        dja djaVar = dja.PENALTY;
        return this.f32252a.equals(siaVar.f32252a) && this.b.equals(siaVar.b) && this.c.equals(siaVar.c);
    }

    @Override // a.cja
    public final dja getType() {
        return dja.HOSTS_AND_GUESTS;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.f32252a.hashCode() + (dja.HOSTS_AND_GUESTS.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CardHostVsGuestUiModel(type=" + dja.HOSTS_AND_GUESTS + ", hostsVsGuestsStatistic=" + this.f32252a + ", btnUiModel=" + this.b + ", bottomInfoUiModel=" + this.c + Separators.RPAREN;
    }
}
