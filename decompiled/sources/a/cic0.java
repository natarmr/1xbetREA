package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cic0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uhc0 f4406a;
    public final List b;

    public cic0(uhc0 uhc0Var, List list) {
        uhc0Var.getClass();
        list.getClass();
        this.f4406a = uhc0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cic0)) {
            return false;
        }
        cic0 cic0Var = (cic0) obj;
        return Intrinsics.d(this.f4406a, cic0Var.f4406a) && Intrinsics.d(this.b, cic0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4406a.hashCode() * 31);
    }

    public final String toString() {
        return "PromoEntitiesWithFavoritesModel(promoEntitiesModel=" + this.f4406a + ", favoritesGameIdList=" + this.b + Separators.RPAREN;
    }
}
