package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class jdu0 implements iqg {
    public static final idu0 Companion = new idu0();
    public static final a8z[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16346a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final Long f;
    public final Integer g;

    static {
        wez wezVar = wez.f39042a;
        h = new a8z[]{maz.a(wezVar, new o1u0((byte) 12)), maz.a(wezVar, new o1u0((byte) 13)), null, null, null, null, null};
    }

    public /* synthetic */ jdu0(int i, List list, List list2, String str, String str2, String str3, Long l, Integer num) {
        if ((i & 1) == 0) {
            this.f16346a = null;
        } else {
            this.f16346a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
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
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdu0)) {
            return false;
        }
        jdu0 jdu0Var = (jdu0) obj;
        return Intrinsics.d(this.f16346a, jdu0Var.f16346a) && Intrinsics.d(this.b, jdu0Var.b) && Intrinsics.d(this.c, jdu0Var.c) && Intrinsics.d(this.d, jdu0Var.d) && Intrinsics.d(this.e, jdu0Var.e) && Intrinsics.d(this.f, jdu0Var.f) && Intrinsics.d(this.g, jdu0Var.g);
    }

    public final int hashCode() {
        List list = this.f16346a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.f;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.g;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("VictoryFormulaLiveResponse(playerOneNumbers=", ", playerTwoNumbers=", this.f16346a, ", formulaPlayerOne=", this.b);
        f140.v(sbT, this.c, ", formulaPlayerTwo=", this.d, ", gameStatus=");
        h97.w(this.f, this.e, ", timer=", ", timerDecrease=", sbT);
        return dw9.q(sbT, this.g, Separators.RPAREN);
    }

    public jdu0() {
        this.f16346a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
