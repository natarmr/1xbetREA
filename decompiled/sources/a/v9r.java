package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class v9r {
    public static final u9r Companion = new u9r();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37048a;
    public final Map b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new s9r((byte) 0)), maz.a(wezVar, new s9r((byte) 1)), maz.a(wezVar, new s9r((byte) 2))};
    }

    public /* synthetic */ v9r(int i, List list, List list2, Map map) {
        if ((i & 1) == 0) {
            this.f37048a = null;
        } else {
            this.f37048a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = map;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9r)) {
            return false;
        }
        v9r v9rVar = (v9r) obj;
        return Intrinsics.d(this.f37048a, v9rVar.f37048a) && Intrinsics.d(this.b, v9rVar.b) && Intrinsics.d(this.c, v9rVar.c);
    }

    public final int hashCode() {
        List list = this.f37048a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Map map = this.b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        List list2 = this.c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FruitBlastStepInfoResponse(gameField=");
        sb.append(this.f37048a);
        sb.append(", newFruitInfo=");
        sb.append(this.b);
        sb.append(", wins=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
