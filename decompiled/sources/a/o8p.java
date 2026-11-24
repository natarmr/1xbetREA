package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o8p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24842a;
    public final List b;
    public final List c;
    public final boolean d;
    public final boolean e;

    public o8p(List list, List list2, List list3, boolean z, boolean z2) {
        b1j.B(list, list2, list3);
        this.f24842a = list;
        this.b = list2;
        this.c = list3;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8p)) {
            return false;
        }
        o8p o8pVar = (o8p) obj;
        return Intrinsics.d(this.f24842a, o8pVar.f24842a) && Intrinsics.d(this.b, o8pVar.b) && Intrinsics.d(this.c, o8pVar.c) && this.d == o8pVar.d && this.e == o8pVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(dw9.a(dw9.a(this.f24842a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("FavoriteGamesByStatusModel(liveGames=", ", lineGames=", this.f24842a, ", resultGames=", this.b);
        rz4.z(sbT, ", hasNetworkError=", this.c, ", allRequiredFavoriteGamesFailed=", this.d);
        return rw2.p(sbT, this.e, Separators.RPAREN);
    }
}
