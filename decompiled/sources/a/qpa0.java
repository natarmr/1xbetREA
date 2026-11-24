package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class qpa0 implements iqg {
    public static final ppa0 Companion = new ppa0();
    public static final a8z[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29107a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;

    static {
        wez wezVar = wez.f39042a;
        i = new a8z[]{null, null, null, maz.a(wezVar, new npa0((byte) 0)), maz.a(wezVar, new npa0((byte) 1)), maz.a(wezVar, new npa0((byte) 2)), maz.a(wezVar, new npa0((byte) 3)), maz.a(wezVar, new npa0((byte) 4))};
    }

    public /* synthetic */ qpa0(int i2, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5) {
        if ((i2 & 1) == 0) {
            this.f29107a = null;
        } else {
            this.f29107a = str;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = list3;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = list4;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = list5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpa0)) {
            return false;
        }
        qpa0 qpa0Var = (qpa0) obj;
        return Intrinsics.d(this.f29107a, qpa0Var.f29107a) && Intrinsics.d(this.b, qpa0Var.b) && Intrinsics.d(this.c, qpa0Var.c) && Intrinsics.d(this.d, qpa0Var.d) && Intrinsics.d(this.e, qpa0Var.e) && Intrinsics.d(this.f, qpa0Var.f) && Intrinsics.d(this.g, qpa0Var.g) && Intrinsics.d(this.h, qpa0Var.h);
    }

    public final int hashCode() {
        String str = this.f29107a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.g;
        int iHashCode7 = (iHashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.h;
        return iHashCode7 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PokerResponse(matchState=", this.f29107a, ", playerOneCombination=", this.b, ", playerTwoCombination=");
        cs0.y(this.c, ", playerOneCards=", ", playerTwoCards=", sbN, this.d);
        b1j.y(", playerOneCombinationCards=", ", playerTwoCombinationCards=", sbN, this.e, this.f);
        return kng0.n(", cardsOnTable=", Separators.RPAREN, sbN, this.g, this.h);
    }

    public qpa0() {
        this.f29107a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }
}
