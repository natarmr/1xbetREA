package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class c1o implements f1o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3582a;

    public c1o(String str) {
        this.f3582a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1o) && this.f3582a.equals(((c1o) obj).f3582a);
    }

    public final int hashCode() {
        return this.f3582a.hashCode();
    }

    public final String toString() {
        return kng0.l("BetExistsError(errorMessage=", this.f3582a, Separators.RPAREN);
    }
}
