package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ku1 implements lu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vr1 f18892a;

    public ku1(vr1 vr1Var) {
        this.f18892a = vr1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ku1) && this.f18892a.equals(((ku1) obj).f18892a);
    }

    public final int hashCode() {
        return this.f18892a.hashCode();
    }

    public final String toString() {
        return "ResultUiModel(tournamentCardModel=" + this.f18892a + Separators.RPAREN;
    }
}
