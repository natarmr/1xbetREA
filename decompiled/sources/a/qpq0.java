package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qpq0 implements rpq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mpq0 f29132a;

    public qpq0(mpq0 mpq0Var) {
        this.f29132a = mpq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qpq0) && this.f29132a.equals(((qpq0) obj).f29132a);
    }

    public final int hashCode() {
        return this.f29132a.hashCode();
    }

    public final String toString() {
        return "Success(tirageCategoryTableUiModel=" + this.f29132a + Separators.RPAREN;
    }
}
