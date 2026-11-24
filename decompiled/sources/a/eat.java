package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class eat implements hat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7485a;
    public final List b;
    public final List c;

    public eat(List list, List list2, List list3) {
        b1j.B(list, list2, list3);
        this.f7485a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eat)) {
            return false;
        }
        eat eatVar = (eat) obj;
        return Intrinsics.d(this.f7485a, eatVar.f7485a) && Intrinsics.d(this.b, eatVar.b) && Intrinsics.d(this.c, eatVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f7485a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(w6x.t("Favorites(liveGames=", ", lineGames=", this.f7485a, ", resultGames=", this.b), this.c, Separators.RPAREN);
    }
}
