package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class q76 implements t76 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4i f28235a;

    public final boolean equals(Object obj) {
        if (obj instanceof q76) {
            return this.f28235a.equals(((q76) obj).f28235a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28235a.hashCode();
    }

    public final String toString() {
        return "LargeCardWatermark(model=" + this.f28235a + Separators.RPAREN;
    }
}
