package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gkh0 implements okh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xlh0 f11444a;

    public gkh0(xlh0 xlh0Var) {
        this.f11444a = xlh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gkh0) && this.f11444a.equals(((gkh0) obj).f11444a);
    }

    public final int hashCode() {
        return 1627244838;
    }

    public final String toString() {
        return "OnCellItemClick(secretQuestionItem=" + this.f11444a + Separators.RPAREN;
    }
}
