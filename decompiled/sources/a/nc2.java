package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nc2 implements uc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jtl f23270a;

    public final boolean equals(Object obj) {
        if (obj instanceof nc2) {
            return this.f23270a.equals(((nc2) obj).f23270a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23270a.hashCode();
    }

    public final String toString() {
        return "OnBottomBarClick(values=" + this.f23270a + Separators.RPAREN;
    }
}
