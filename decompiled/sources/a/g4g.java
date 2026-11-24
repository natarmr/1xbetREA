package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class g4g {
    public static final f4g Companion = new f4g();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f10664a;
    public final Integer b;
    public final v8h c;
    public final v8h d;
    public final List e;

    static {
        u8h u8hVar = v8h.Companion;
        f = new a8z[]{null, null, null, null, maz.a(wez.f39042a, new dpf((byte) 23))};
    }

    public /* synthetic */ g4g(int i, Integer num, Integer num2, v8h v8hVar, v8h v8hVar2, List list) {
        if ((i & 1) == 0) {
            this.f10664a = null;
        } else {
            this.f10664a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = v8hVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = v8hVar2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4g)) {
            return false;
        }
        g4g g4gVar = (g4g) obj;
        return Intrinsics.d(this.f10664a, g4gVar.f10664a) && Intrinsics.d(this.b, g4gVar.b) && Intrinsics.d(this.c, g4gVar.c) && Intrinsics.d(this.d, g4gVar.d) && Intrinsics.d(this.e, g4gVar.e);
    }

    public final int hashCode() {
        Integer num = this.f10664a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        v8h v8hVar = this.c;
        int iHashCode3 = (iHashCode2 + (v8hVar == null ? 0 : v8hVar.hashCode())) * 31;
        v8h v8hVar2 = this.d;
        int iHashCode4 = (iHashCode3 + (v8hVar2 == null ? 0 : v8hVar2.hashCode())) * 31;
        List list = this.e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("CyberCSMatchesStatisticResponse(id=", this.f10664a, ", tournamentId=", this.b, ", teamOne=");
        sbQ.append(this.c);
        sbQ.append(", teamTwo=");
        sbQ.append(this.d);
        sbQ.append(", matches=");
        return dw9.r(sbQ, this.e, Separators.RPAREN);
    }
}
