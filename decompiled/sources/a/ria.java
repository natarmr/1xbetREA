package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ria implements bja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nsw f30531a;
    public final imo b;
    public final ao8 c;

    public ria(nsw nswVar, imo imoVar, ao8 ao8Var) {
        dja djaVar = dja.PENALTY;
        this.f30531a = nswVar;
        this.b = imoVar;
        this.c = ao8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ria)) {
            return false;
        }
        ria riaVar = (ria) obj;
        dja djaVar = dja.PENALTY;
        return this.f30531a.equals(riaVar.f30531a) && this.b.equals(riaVar.b) && this.c.equals(riaVar.c);
    }

    @Override // a.bja
    public final dja getType() {
        return dja.HOSTS_AND_GUESTS;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.f30531a.hashCode() + (dja.HOSTS_AND_GUESTS.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CardHostVsGuestUiModel(type=" + dja.HOSTS_AND_GUESTS + ", hostsVsGuestsStatistic=" + this.f30531a + ", btnUiModel=" + this.b + ", bottomInfoUiModel=" + this.c + Separators.RPAREN;
    }
}
