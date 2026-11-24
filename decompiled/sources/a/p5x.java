package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class p5x implements iqg {
    public static final o5x Companion = new o5x();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f26425a;
    public final List b;
    public final String c;
    public final String d;
    public final i5x e;

    static {
        wez wezVar = wez.f39042a;
        f = new a8z[]{maz.a(wezVar, new kdw((byte) 22)), maz.a(wezVar, new kdw((byte) 23)), null, null, null};
    }

    public /* synthetic */ p5x(int i, List list, List list2, String str, String str2, i5x i5xVar) {
        if ((i & 1) == 0) {
            this.f26425a = null;
        } else {
            this.f26425a = list;
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
            this.e = i5xVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5x)) {
            return false;
        }
        p5x p5xVar = (p5x) obj;
        return Intrinsics.d(this.f26425a, p5xVar.f26425a) && Intrinsics.d(this.b, p5xVar.b) && Intrinsics.d(this.c, p5xVar.c) && Intrinsics.d(this.d, p5xVar.d) && this.e == p5xVar.e;
    }

    public final int hashCode() {
        List list = this.f26425a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        i5x i5xVar = this.e;
        return iHashCode4 + (i5xVar != null ? i5xVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("IndianPokerResponse(playerOneCardList=", ", playerTwoCardList=", this.f26425a, ", playerOneCombination=", this.b);
        f140.v(sbT, this.c, ", playerTwoCombination=", this.d, ", matchState=");
        sbT.append(this.e);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }

    public p5x() {
        this.f26425a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
