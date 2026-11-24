package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class txl implements eyl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wyl f34705a;

    public txl(wyl wylVar) {
        wylVar.getClass();
        this.f34705a = wylVar;
        uwl uwlVar = uwl.f36398a;
    }

    @Override // a.eyl
    public final uwl a() {
        return uwl.f36398a;
    }

    @Override // a.eyl
    public final boolean c(eyl eylVar, eyl eylVar2) {
        return (eylVar instanceof txl) && (eylVar2 instanceof txl);
    }

    @Override // a.eyl
    public final boolean d(eyl eylVar, eyl eylVar2) {
        return eylVar.equals(eylVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof txl) && this.f34705a == ((txl) obj).f34705a;
    }

    public final int hashCode() {
        return this.f34705a.hashCode();
    }

    public final String toString() {
        return "DsChipShimmerItemModel(style=" + this.f34705a + Separators.RPAREN;
    }
}
