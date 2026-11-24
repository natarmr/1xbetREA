package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gqk implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11737a;
    public final b8m b;
    public final vb90 c;
    public final m3g d;

    public gqk(String str, b8m b8mVar, vb90 vb90Var, m3g m3gVar) {
        this.f11737a = str;
        this.b = b8mVar;
        this.c = vb90Var;
        this.d = m3gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqk)) {
            return false;
        }
        gqk gqkVar = (gqk) obj;
        return this.f11737a.equals(gqkVar.f11737a) && this.b.equals(gqkVar.b) && this.c.equals(gqkVar.c) && this.d.equals(gqkVar.d);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f11737a;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f11737a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DisciplineDetailsEventFocusGameEventsUiModel(key=" + this.f11737a + ", header=" + this.b + ", gameCardUiModel=" + this.c + ", buttonBlockState=" + this.d + Separators.RPAREN;
    }
}
