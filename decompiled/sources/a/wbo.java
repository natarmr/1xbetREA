package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wbo implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38889a;
    public final k8m b;
    public final m3g c;

    public wbo(String str, k8m k8mVar, m3g m3gVar) {
        this.f38889a = str;
        this.b = k8mVar;
        this.c = m3gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbo)) {
            return false;
        }
        wbo wboVar = (wbo) obj;
        return this.f38889a.equals(wboVar.f38889a) && this.b.equals(wboVar.b) && this.c.equals(wboVar.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f38889a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f38889a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "EventFocusDisciplineListUiModel(key=" + this.f38889a + ", disciplineList=" + this.b + ", cyberButtonBlockState=" + this.c + Separators.RPAREN;
    }
}
