package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class r9r {
    public static final q9r Companion = new q9r();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f30098a;
    public final v9r b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new v9q((byte) 28)), null, maz.a(wezVar, new v9q((byte) 29))};
    }

    public /* synthetic */ r9r(int i, Map map, v9r v9rVar, List list) {
        if ((i & 1) == 0) {
            this.f30098a = null;
        } else {
            this.f30098a = map;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = v9rVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9r)) {
            return false;
        }
        r9r r9rVar = (r9r) obj;
        return Intrinsics.d(this.f30098a, r9rVar.f30098a) && Intrinsics.d(this.b, r9rVar.b) && Intrinsics.d(this.c, r9rVar.c);
    }

    public final int hashCode() {
        Map map = this.f30098a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        v9r v9rVar = this.b;
        int iHashCode2 = (iHashCode + (v9rVar == null ? 0 : v9rVar.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FruitBlastResultResponse(coeffInfo=");
        sb.append(this.f30098a);
        sb.append(", lastStepInfo=");
        sb.append(this.b);
        sb.append(", bonuses=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
