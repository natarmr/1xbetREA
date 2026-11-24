package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class g1s implements v1s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dja f10531a;

    public g1s(dja djaVar) {
        this.f10531a = djaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1s) && this.f10531a == ((g1s) obj).f10531a;
    }

    public final int hashCode() {
        return this.f10531a.hashCode();
    }

    public final String toString() {
        return "CardInfoSelect(infoGameType=" + this.f10531a + Separators.RPAREN;
    }
}
