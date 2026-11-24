package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class glb implements jlb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kjl f11482a;

    public glb(kjl kjlVar) {
        this.f11482a = kjlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof glb) && this.f11482a.equals(((glb) obj).f11482a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return String.valueOf(this.f11482a);
    }

    public final int hashCode() {
        return this.f11482a.f18391a.hashCode();
    }

    public final String toString() {
        return "ChampionshipAddButtonUiModel(model=" + this.f11482a + Separators.RPAREN;
    }
}
