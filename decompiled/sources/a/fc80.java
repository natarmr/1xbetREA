package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class fc80 implements hc80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9299a;

    public fc80(List list) {
        this.f9299a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fc80) && this.f9299a.equals(((fc80) obj).f9299a);
    }

    public final int hashCode() {
        return this.f9299a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f9299a, "RecommendedGames(games=", Separators.RPAREN);
    }
}
