package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class oy50 implements az50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zia f26046a;

    public final boolean equals(Object obj) {
        if (obj instanceof oy50) {
            return this.f26046a.equals(((oy50) obj).f26046a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26046a.hashCode();
    }

    public final String toString() {
        return "OnCardIndicatorClick(model=" + this.f26046a + Separators.RPAREN;
    }
}
