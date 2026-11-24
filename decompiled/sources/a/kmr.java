package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kmr implements umr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dja f18555a;

    public final boolean equals(Object obj) {
        if (obj instanceof kmr) {
            return this.f18555a == ((kmr) obj).f18555a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18555a.hashCode();
    }

    public final String toString() {
        return "CardInfoSelect(infoGameType=" + this.f18555a + Separators.RPAREN;
    }
}
