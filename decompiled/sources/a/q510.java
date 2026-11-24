package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class q510 {
    public static final p510 Companion = new p510();
    public static final a8z[] k = {null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new t010((byte) 18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f28127a;
    public final Long b;
    public final u510 c;
    public final u510 d;
    public final String e;
    public final Integer f;
    public final Integer g;
    public final String h;
    public final Long i;
    public final List j;

    public /* synthetic */ q510(int i, Integer num, Long l, u510 u510Var, u510 u510Var2, String str, Integer num2, Integer num3, String str2, Long l2, List list) {
        if ((i & 1) == 0) {
            this.f28127a = null;
        } else {
            this.f28127a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = u510Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = u510Var2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = l2;
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
        if (!(obj instanceof q510)) {
            return false;
        }
        q510 q510Var = (q510) obj;
        return Intrinsics.d(this.f28127a, q510Var.f28127a) && Intrinsics.d(this.b, q510Var.b) && Intrinsics.d(this.c, q510Var.c) && Intrinsics.d(this.d, q510Var.d) && Intrinsics.d(this.e, q510Var.e) && Intrinsics.d(this.f, q510Var.f) && Intrinsics.d(this.g, q510Var.g) && Intrinsics.d(this.h, q510Var.h) && Intrinsics.d(this.i, q510Var.i) && Intrinsics.d(this.j, q510Var.j);
    }

    public final int hashCode() {
        Integer num = this.f28127a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        u510 u510Var = this.c;
        int iHashCode3 = (iHashCode2 + (u510Var == null ? 0 : u510Var.hashCode())) * 31;
        u510 u510Var2 = this.d;
        int iHashCode4 = (iHashCode3 + (u510Var2 == null ? 0 : u510Var2.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.g;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.i;
        int iHashCode9 = (iHashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List list = this.j;
        return iHashCode9 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = h97.m(this.f28127a, this.b, "LolStatisticMatchesResponse(id=", ", tournamentId=", ", teamOne=");
        sbM.append(this.c);
        sbM.append(", teamTwo=");
        sbM.append(this.d);
        sbM.append(", type=");
        axq.x(this.f, this.e, ", teamOneScore=", ", teamTwoScore=", sbM);
        b1j.u(this.g, ", startTime=", this.h, ", startTimestamp=", sbM);
        sbM.append(this.i);
        sbM.append(", matches=");
        sbM.append(this.j);
        sbM.append(Separators.RPAREN);
        return sbM.toString();
    }
}
