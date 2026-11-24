package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class kdh0 implements iqg {
    public static final jdh0 Companion = new jdh0();
    public static final a8z[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18108a;
    public final List b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final String g;

    static {
        wez wezVar = wez.f39042a;
        h = new a8z[]{maz.a(wezVar, new yxg0((byte) 25)), maz.a(wezVar, new yxg0((byte) 26)), null, null, maz.a(wezVar, new yxg0((byte) 27)), maz.a(wezVar, new yxg0((byte) 28)), null};
    }

    public /* synthetic */ kdh0(int i, List list, List list2, String str, String str2, List list3, List list4, String str3) {
        if ((i & 1) == 0) {
            this.f18108a = null;
        } else {
            this.f18108a = list;
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
            this.e = list3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdh0)) {
            return false;
        }
        kdh0 kdh0Var = (kdh0) obj;
        return Intrinsics.d(this.f18108a, kdh0Var.f18108a) && Intrinsics.d(this.b, kdh0Var.b) && Intrinsics.d(this.c, kdh0Var.c) && Intrinsics.d(this.d, kdh0Var.d) && Intrinsics.d(this.e, kdh0Var.e) && Intrinsics.d(this.f, kdh0Var.f) && Intrinsics.d(this.g, kdh0Var.g);
    }

    public final int hashCode() {
        List list = this.f18108a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list3 = this.e;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.f;
        int iHashCode6 = (iHashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str3 = this.g;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("SeaBattleResponse(playerOneShipsStr=", ", playerTwoShipsStr=", this.f18108a, ", playerOneScore=", this.b);
        f140.v(sbT, this.c, ", playerTwoScore=", this.d, ", playerOneShotsStr=");
        b1j.y(", playerTwoShotsStr=", ", playerTurn=", sbT, this.e, this.f);
        return axq.n(sbT, this.g, Separators.RPAREN);
    }

    public kdh0() {
        this.f18108a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
