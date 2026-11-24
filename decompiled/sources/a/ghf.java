package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class ghf {
    public static final fhf Companion = new fhf();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11295a;
    public final List b;
    public final Map c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new x5f((byte) 15)), maz.a(wezVar, new x5f((byte) 16)), maz.a(wezVar, new x5f((byte) 17))};
    }

    public /* synthetic */ ghf(int i, List list, List list2, Map map) {
        if ((i & 1) == 0) {
            this.f11295a = null;
        } else {
            this.f11295a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghf)) {
            return false;
        }
        ghf ghfVar = (ghf) obj;
        return Intrinsics.d(this.f11295a, ghfVar.f11295a) && Intrinsics.d(this.b, ghfVar.b) && Intrinsics.d(this.c, ghfVar.c);
    }

    public final int hashCode() {
        List list = this.f11295a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map map = this.c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("CrystalRoundResponse(gameField=", ", winCombos=", this.f11295a, ", newItems=", this.b);
        sbT.append(this.c);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
