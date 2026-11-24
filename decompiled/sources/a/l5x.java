package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l5x implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19480a;
    public final List b;
    public final String c;
    public final String d;
    public final k5x e;

    public l5x(List list, List list2, String str, String str2, k5x k5xVar) {
        list.getClass();
        list2.getClass();
        this.f19480a = list;
        this.b = list2;
        this.c = str;
        this.d = str2;
        this.e = k5xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5x)) {
            return false;
        }
        l5x l5xVar = (l5x) obj;
        return Intrinsics.d(this.f19480a, l5xVar.f19480a) && Intrinsics.d(this.b, l5xVar.b) && this.c.equals(l5xVar.c) && this.d.equals(l5xVar.d) && this.e == l5xVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(dw9.a(this.f19480a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("IndianPokerModel(playerOneCardList=", ", playerTwoCardList=", this.f19480a, ", playerOneCombination=", this.b);
        f140.v(sbT, this.c, ", playerTwoCombination=", this.d, ", matchState=");
        sbT.append(this.e);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
