package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class v8h {
    public static final u8h Companion = new u8h();
    public static final a8z[] g = {null, null, null, null, null, maz.a(wez.f39042a, new x3h(21))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f36982a;
    public final Long b;
    public final String c;
    public final String d;
    public final Integer e;
    public final List f;

    public /* synthetic */ v8h(int i, Integer num, Long l, String str, String str2, Integer num2, List list) {
        if ((i & 1) == 0) {
            this.f36982a = null;
        } else {
            this.f36982a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8h)) {
            return false;
        }
        v8h v8hVar = (v8h) obj;
        return Intrinsics.d(this.f36982a, v8hVar.f36982a) && Intrinsics.d(this.b, v8hVar.b) && Intrinsics.d(this.c, v8hVar.c) && Intrinsics.d(this.d, v8hVar.d) && Intrinsics.d(this.e, v8hVar.e) && Intrinsics.d(this.f, v8hVar.f);
    }

    public final int hashCode() {
        Integer num = this.f36982a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.f;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = h97.m(this.f36982a, this.b, "CyberMatchesStatisticTeamResponse(id=", ", feedId=", ", name=");
        f140.v(sbM, this.c, ", image=", this.d, ", rank=");
        sbM.append(this.e);
        sbM.append(", players=");
        sbM.append(this.f);
        sbM.append(Separators.RPAREN);
        return sbM.toString();
    }
}
