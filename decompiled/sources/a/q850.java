package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class q850 implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rqm f28283a;
    public final v12 b;

    public q850(rqm rqmVar, v12 v12Var) {
        this.f28283a = rqmVar;
        this.b = v12Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q850)) {
            return false;
        }
        q850 q850Var = (q850) obj;
        return this.f28283a.equals(q850Var.f28283a) && this.b == q850Var.b;
    }

    @Override // a.hvk0
    public final Object getKey() {
        return q850.class;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28283a.hashCode() * 31);
    }

    public final String toString() {
        return "MyBetsHistoryUiModel(style=" + this.f28283a + ", alignmentInSection=" + this.b + Separators.RPAREN;
    }
}
