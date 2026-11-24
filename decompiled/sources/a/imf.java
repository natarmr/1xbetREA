package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class imf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final orf f15022a;

    public final boolean equals(Object obj) {
        if (obj instanceof imf) {
            return this.f15022a.equals(((imf) obj).f15022a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15022a.hashCode();
    }

    public final String toString() {
        return "SecondPlayer(value=" + this.f15022a + Separators.RPAREN;
    }
}
