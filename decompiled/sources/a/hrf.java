package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hrf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hpf f13527a;
    public final ipf b;

    public hrf(hpf hpfVar, ipf ipfVar) {
        this.f13527a = hpfVar;
        this.b = ipfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hrf)) {
            return false;
        }
        hrf hrfVar = (hrf) obj;
        return this.f13527a.equals(hrfVar.f13527a) && this.b.equals(hrfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13527a.hashCode() * 31);
    }

    public final String toString() {
        return "Cs2SplitsModel(bounds=" + this.f13527a + ", offset=" + this.b + Separators.RPAREN;
    }
}
