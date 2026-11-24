package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class szz implements yzz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wrz f33091a;

    public final boolean equals(Object obj) {
        if (obj instanceof szz) {
            return this.f33091a.equals(((szz) obj).f33091a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33091a.hashCode();
    }

    public final String toString() {
        return "OnMoneyLimitClick(limitType=" + this.f33091a + Separators.RPAREN;
    }
}
