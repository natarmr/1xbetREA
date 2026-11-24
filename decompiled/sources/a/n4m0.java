package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class n4m0 implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rqm f22905a;
    public final v12 b;

    public n4m0(rqm rqmVar, v12 v12Var) {
        this.f22905a = rqmVar;
        this.b = v12Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4m0)) {
            return false;
        }
        n4m0 n4m0Var = (n4m0) obj;
        return this.f22905a.equals(n4m0Var.f22905a) && this.b == n4m0Var.b;
    }

    @Override // a.hvk0
    public final Object getKey() {
        return n4m0.class;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22905a.hashCode() * 31);
    }

    public final String toString() {
        return "StandingsUiModel(style=" + this.f22905a + ", alignmentInSection=" + this.b + Separators.RPAREN;
    }
}
