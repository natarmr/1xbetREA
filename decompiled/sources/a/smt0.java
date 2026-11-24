package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class smt0 implements vmt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f32464a;

    public smt0(Throwable th) {
        this.f32464a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof smt0) && this.f32464a.equals(((smt0) obj).f32464a);
    }

    public final int hashCode() {
        return this.f32464a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Error(throwable=", Separators.RPAREN, this.f32464a);
    }
}
