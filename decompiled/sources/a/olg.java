package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class olg implements plg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25453a;

    public olg(long j) {
        this.f25453a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof olg) && this.f25453a == ((olg) obj).f25453a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25453a);
    }

    public final String toString() {
        return axq.h(this.f25453a, "OnChampLiveGamesClick(champId=", Separators.RPAREN);
    }
}
