package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class oba implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yaa f24969a;
    public final xaa b;
    public final jba c;

    public oba(yaa yaaVar, xaa xaaVar, jba jbaVar) {
        this.f24969a = yaaVar;
        this.b = xaaVar;
        this.c = jbaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oba)) {
            return false;
        }
        oba obaVar = (oba) obj;
        return this.f24969a.equals(obaVar.f24969a) && this.b.equals(obaVar.b) && this.c.equals(obaVar.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "CARD_BASKETBALL_KEY";
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.f24969a.hashCode() + 687268268) * 31)) * 31);
    }

    public final String toString() {
        return "CardBasketballUiModel(key=CARD_BASKETBALL_KEY, gameInfo=" + this.f24969a + ", gameField=" + this.b + ", quarterInfo=" + this.c + Separators.RPAREN;
    }
}
