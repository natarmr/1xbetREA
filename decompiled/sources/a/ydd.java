package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ydd implements aed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mim0 f42429a;
    public final rvf b;

    public ydd(mim0 mim0Var, rvf rvfVar) {
        this.f42429a = mim0Var;
        this.b = rvfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydd)) {
            return false;
        }
        ydd yddVar = (ydd) obj;
        return this.f42429a.equals(yddVar.f42429a) && this.b.equals(yddVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42429a.hashCode() * 31);
    }

    public final String toString() {
        return "CompletedMatchDataUiModel(card=" + this.f42429a + ", model=" + this.b + Separators.RPAREN;
    }
}
