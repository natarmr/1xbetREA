package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class iwn0 implements lwn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fzc f15499a;

    public final boolean equals(Object obj) {
        if (obj instanceof iwn0) {
            return this.f15499a == ((iwn0) obj).f15499a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15499a.hashCode();
    }

    public final String toString() {
        return "CoefColor(coefColorType=" + this.f15499a + Separators.RPAREN;
    }
}
