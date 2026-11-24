package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class o1s0 implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rqm f24498a;
    public final v12 b;

    public o1s0(rqm rqmVar, v12 v12Var) {
        this.f24498a = rqmVar;
        this.b = v12Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1s0)) {
            return false;
        }
        o1s0 o1s0Var = (o1s0) obj;
        return this.f24498a.equals(o1s0Var.f24498a) && this.b == o1s0Var.b;
    }

    @Override // a.hvk0
    public final Object getKey() {
        return o1s0.class;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24498a.hashCode() * 31);
    }

    public final String toString() {
        return "TournamentGridCellUiModel(style=" + this.f24498a + ", alignmentInSection=" + this.b + Separators.RPAREN;
    }
}
