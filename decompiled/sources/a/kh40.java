package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kh40 implements uh40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uss f18272a;

    public final boolean equals(Object obj) {
        if (obj instanceof kh40) {
            return this.f18272a.equals(((kh40) obj).f18272a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18272a.hashCode();
    }

    public final String toString() {
        return "OnGameStreamAction(value=" + this.f18272a + Separators.RPAREN;
    }
}
