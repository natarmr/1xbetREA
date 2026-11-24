package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class cu30 implements bv30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0z f4969a;

    public final boolean equals(Object obj) {
        if (obj instanceof cu30) {
            return this.f4969a.equals(((cu30) obj).f4969a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4969a.hashCode();
    }

    public final String toString() {
        return "OnLastGameItemClick(lastGameUiModel=" + this.f4969a + Separators.RPAREN;
    }
}
