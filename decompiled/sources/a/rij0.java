package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class rij0 implements iqg {
    public static final qij0 Companion = new qij0();
    public static final a8z[] g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30545a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;

    static {
        wez wezVar = wez.f39042a;
        g = new a8z[]{maz.a(wezVar, new hwi0((byte) 7)), maz.a(wezVar, new hwi0((byte) 8)), null, null, null, null};
    }

    public /* synthetic */ rij0(int i, List list, List list2, String str, String str2, String str3, Integer num) {
        if ((i & 1) == 0) {
            this.f30545a = null;
        } else {
            this.f30545a = list;
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
            this.f = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rij0)) {
            return false;
        }
        rij0 rij0Var = (rij0) obj;
        return Intrinsics.d(this.f30545a, rij0Var.f30545a) && Intrinsics.d(this.b, rij0Var.b) && Intrinsics.d(this.c, rij0Var.c) && Intrinsics.d(this.d, rij0Var.d) && Intrinsics.d(this.e, rij0Var.e) && Intrinsics.d(this.f, rij0Var.f);
    }

    public final int hashCode() {
        List list = this.f30545a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("SettoeMezzoResponse(playerOneCardList=", ", playerTwoCardList=", this.f30545a, ", matchState=", this.b);
        f140.v(sbT, this.c, ", playerScore=", this.d, ", dealerScore=");
        return vqd.l(this.f, this.e, ", champType=", Separators.RPAREN, sbT);
    }

    public rij0() {
        this.f30545a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
