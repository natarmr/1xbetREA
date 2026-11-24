package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class iqb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dqb0 f15203a;

    public iqb0(dqb0 dqb0Var) {
        this.f15203a = dqb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iqb0) && this.f15203a.equals(((iqb0) obj).f15203a);
    }

    public final int hashCode() {
        return this.f15203a.hashCode();
    }

    public final String toString() {
        return "PowerOfPowerTableCell(contentType=" + this.f15203a + Separators.RPAREN;
    }
}
