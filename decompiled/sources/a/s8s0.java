package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class s8s0 {
    public static final r8s0 Companion = new r8s0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31818a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;

    public /* synthetic */ s8s0(int i, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2) {
        if ((i & 1) == 0) {
            this.f31818a = null;
        } else {
            this.f31818a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8s0)) {
            return false;
        }
        s8s0 s8s0Var = (s8s0) obj;
        return Intrinsics.d(this.f31818a, s8s0Var.f31818a) && Intrinsics.d(this.b, s8s0Var.b) && Intrinsics.d(this.c, s8s0Var.c) && Intrinsics.d(this.d, s8s0Var.d) && Intrinsics.d(this.e, s8s0Var.e) && Intrinsics.d(this.f, s8s0Var.f);
    }

    public final int hashCode() {
        String str = this.f31818a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f;
        return iHashCode5 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TournamentValorantFeedStatisticMapResponse(name=", this.f31818a, ", imageS3=", this.b, ", games=");
        rz4.y(sbN, this.c, ", rounds=", this.d, ", defenceRoundWins=");
        return ua80.l(sbN, this.e, ", attackRoundWins=", this.f, Separators.RPAREN);
    }
}
