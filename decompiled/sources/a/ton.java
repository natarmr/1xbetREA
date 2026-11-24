package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ton implements uon {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j4n f34293a;

    public ton(j4n j4nVar) {
        this.f34293a = j4nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ton) && this.f34293a.equals(((ton) obj).f34293a);
    }

    public final int hashCode() {
        return this.f34293a.hashCode();
    }

    public final String toString() {
        return "Loading(dsSportMarketsRowUiModel=" + this.f34293a + Separators.RPAREN;
    }
}
