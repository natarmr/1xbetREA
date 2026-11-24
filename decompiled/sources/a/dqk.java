package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dqk implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6520a;
    public final j9m b;
    public final m3g c;

    public dqk(String str, j9m j9mVar, m3g m3gVar) {
        this.f6520a = str;
        this.b = j9mVar;
        this.c = m3gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqk)) {
            return false;
        }
        dqk dqkVar = (dqk) obj;
        return this.f6520a.equals(dqkVar.f6520a) && this.b.equals(dqkVar.b) && this.c.equals(dqkVar.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f6520a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f6520a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DisciplineDetailsEventFocusActiveTeamsUiModel(key=" + this.f6520a + ", partnersList=" + this.b + ", buttonBlockState=" + this.c + Separators.RPAREN;
    }
}
