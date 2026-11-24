package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ibh implements qbh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14486a;

    public ibh(List list) {
        this.f14486a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ibh) && this.f14486a.equals(((ibh) obj).f14486a);
    }

    public final int hashCode() {
        return this.f14486a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f14486a, "OnGamesLoaded(games=", Separators.RPAREN);
    }
}
