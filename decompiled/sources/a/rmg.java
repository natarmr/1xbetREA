package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class rmg {
    public static final qmg Companion = new qmg();
    public static final a8z[] k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f30743a;
    public final Integer b;
    public final v8h c;
    public final v8h d;
    public final String e;
    public final Integer f;
    public final Integer g;
    public final String h;
    public final Long i;
    public final List j;

    static {
        u8h u8hVar = v8h.Companion;
        k = new a8z[]{null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new jcg((byte) 27))};
    }

    public /* synthetic */ rmg(int i, Integer num, Integer num2, v8h v8hVar, v8h v8hVar2, String str, Integer num3, Integer num4, String str2, Long l, List list) {
        if ((i & 1) == 0) {
            this.f30743a = null;
        } else {
            this.f30743a = num;
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
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = l;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmg)) {
            return false;
        }
        rmg rmgVar = (rmg) obj;
        return Intrinsics.d(this.f30743a, rmgVar.f30743a) && Intrinsics.d(this.b, rmgVar.b) && Intrinsics.d(this.c, rmgVar.c) && Intrinsics.d(this.d, rmgVar.d) && Intrinsics.d(this.e, rmgVar.e) && Intrinsics.d(this.f, rmgVar.f) && Intrinsics.d(this.g, rmgVar.g) && Intrinsics.d(this.h, rmgVar.h) && Intrinsics.d(this.i, rmgVar.i) && Intrinsics.d(this.j, rmgVar.j);
    }

    public final int hashCode() {
        Integer num = this.f30743a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        v8h v8hVar = this.c;
        int iHashCode3 = (iHashCode2 + (v8hVar == null ? 0 : v8hVar.hashCode())) * 31;
        v8h v8hVar2 = this.d;
        int iHashCode4 = (iHashCode3 + (v8hVar2 == null ? 0 : v8hVar2.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.f;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.g;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.i;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        List list = this.j;
        return iHashCode9 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("CyberDotaMatchesStatisticResponse(id=", this.f30743a, ", tournamentId=", this.b, ", teamOne=");
        sbQ.append(this.c);
        sbQ.append(", teamTwo=");
        sbQ.append(this.d);
        sbQ.append(", type=");
        axq.x(this.f, this.e, ", teamOneScore=", ", teamTwoScore=", sbQ);
        b1j.u(this.g, ", startTime=", this.h, ", startTimestamp=", sbQ);
        sbQ.append(this.i);
        sbQ.append(", matches=");
        sbQ.append(this.j);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
