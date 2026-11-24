package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class tja0 implements vja0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9m0 f34039a;

    public tja0(j9m0 j9m0Var) {
        this.f34039a = j9m0Var;
    }

    @Override // a.vja0
    public final j9m0 d() {
        return this.f34039a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tja0) && this.f34039a.equals(((tja0) obj).f34039a);
    }

    public final int hashCode() {
        return this.f34039a.hashCode();
    }

    public final String toString() {
        return "Loading(backgroundUiModel=" + this.f34039a + Separators.RPAREN;
    }
}
