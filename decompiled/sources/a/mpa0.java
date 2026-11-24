package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mpa0 implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22169a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;

    public mpa0(String str, String str2, String str3, List list, List list2, List list3, List list4, List list5) {
        rz4.B(list, list2, list3, list4, list5);
        this.f22169a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
        this.f = list3;
        this.g = list4;
        this.h = list5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpa0)) {
            return false;
        }
        mpa0 mpa0Var = (mpa0) obj;
        return this.f22169a.equals(mpa0Var.f22169a) && this.b.equals(mpa0Var.b) && this.c.equals(mpa0Var.c) && Intrinsics.d(this.d, mpa0Var.d) && Intrinsics.d(this.e, mpa0Var.e) && Intrinsics.d(this.f, mpa0Var.f) && Intrinsics.d(this.g, mpa0Var.g) && Intrinsics.d(this.h, mpa0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + dw9.a(dw9.a(dw9.a(dw9.a(ua80.b(ua80.b(this.f22169a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PokerModel(matchState=", this.f22169a, ", playerOneCombination=", this.b, ", playerTwoCombination=");
        cs0.y(this.c, ", playerOneCardList=", ", playerTwoCardList=", sbN, this.d);
        b1j.y(", playerOneCombinationCardList=", ", playerTwoCombinationCardList=", sbN, this.e, this.f);
        return kng0.n(", cardOnTableList=", Separators.RPAREN, sbN, this.g, this.h);
    }
}
