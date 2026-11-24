package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class az80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1705a;
    public final j0g0 b;
    public final List c;
    public final Map d;

    public az80(boolean z, j0g0 j0g0Var, List list, Map map) {
        list.getClass();
        this.f1705a = z;
        this.b = j0g0Var;
        this.c = list;
        this.d = map;
    }

    public static az80 a(az80 az80Var, boolean z, j0g0 j0g0Var, List list, LinkedHashMap linkedHashMap, int i) {
        if ((i & 1) != 0) {
            z = az80Var.f1705a;
        }
        if ((i & 2) != 0) {
            j0g0Var = az80Var.b;
        }
        if ((i & 4) != 0) {
            list = az80Var.c;
        }
        Map map = linkedHashMap;
        if ((i & 8) != 0) {
            map = az80Var.d;
        }
        az80Var.getClass();
        list.getClass();
        return new az80(z, j0g0Var, list, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az80)) {
            return false;
        }
        az80 az80Var = (az80) obj;
        return this.f1705a == az80Var.f1705a && Intrinsics.d(this.b, az80Var.b) && Intrinsics.d(this.c, az80Var.c) && this.d.equals(az80Var.d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f1705a) * 31;
        j0g0 j0g0Var = this.b;
        return this.d.hashCode() + dw9.a((iHashCode + (j0g0Var == null ? 0 : j0g0.b(j0g0Var.f15681a))) * 31, 31, this.c);
    }

    public final String toString() {
        return "PartnersTeamsStateModel(connected=" + this.f1705a + ", infoModelsResult=" + this.b + ", partnersSelectedNames=" + this.c + ", partnerGames=" + this.d + Separators.RPAREN;
    }
}
