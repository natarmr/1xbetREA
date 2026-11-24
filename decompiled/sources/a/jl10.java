package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jl10 implements vl10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final csr f16695a;

    public jl10(csr csrVar) {
        this.f16695a = csrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jl10) && this.f16695a.equals(((jl10) obj).f16695a);
    }

    public final int hashCode() {
        return this.f16695a.hashCode();
    }

    public final String toString() {
        return "OnPrizeClick(bonus=" + this.f16695a + Separators.RPAREN;
    }
}
