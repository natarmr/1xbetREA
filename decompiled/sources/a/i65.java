package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class i65 {
    public static final h65 Companion = new h65();
    public static final a8z[] b = {maz.a(wez.f39042a, new a04(26))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14224a;

    public /* synthetic */ i65(int i, List list) {
        if ((i & 1) == 0) {
            this.f14224a = null;
        } else {
            this.f14224a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i65) && Intrinsics.d(this.f14224a, ((i65) obj).f14224a);
    }

    public final int hashCode() {
        List list = this.f14224a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f14224a, "AvailableBonusesDataResponse(bonusesList=", Separators.RPAREN);
    }
}
