package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qyo0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2n f29544a;
    public final boolean b;

    public qyo0(a2n a2nVar, boolean z) {
        this.f29544a = a2nVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyo0)) {
            return false;
        }
        qyo0 qyo0Var = (qyo0) obj;
        return this.f29544a.equals(qyo0Var.f29544a) && this.b == qyo0Var.b;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f29544a.getKey();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f29544a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamBetEventCardUiItem(model=" + this.f29544a + ", supportRtl=" + this.b + Separators.RPAREN;
    }
}
