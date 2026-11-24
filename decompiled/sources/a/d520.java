package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class d520 implements l520 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ynd0 f5484a;

    public final boolean equals(Object obj) {
        if (obj instanceof d520) {
            return this.f5484a.equals(((d520) obj).f5484a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5484a.hashCode();
    }

    public final String toString() {
        return "QuickBetClick(quickBetValue=" + this.f5484a + Separators.RPAREN;
    }
}
