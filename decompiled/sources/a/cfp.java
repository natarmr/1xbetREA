package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cfp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4274a;
    public final List b;

    public cfp(List list, List list2) {
        list2.getClass();
        this.f4274a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfp)) {
            return false;
        }
        cfp cfpVar = (cfp) obj;
        return Intrinsics.d(this.f4274a, cfpVar.f4274a) && Intrinsics.d(this.b, cfpVar.b);
    }

    public final int hashCode() {
        List list = this.f4274a;
        return this.b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return cs0.l("FavoritesGamesState(gamesList=", ", favoritesList=", this.f4274a, Separators.RPAREN, this.b);
    }
}
