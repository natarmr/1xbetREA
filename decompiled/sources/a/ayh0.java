package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ayh0 implements iqg {
    public static final zxh0 Companion = new zxh0();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1669a;
    public final List b;
    public final String c;
    public final rxh0 d;

    static {
        wez wezVar = wez.f39042a;
        e = new a8z[]{maz.a(wezVar, new igh0((byte) 17)), maz.a(wezVar, new igh0((byte) 18)), null, null};
    }

    public /* synthetic */ ayh0(int i, List list, List list2, String str, rxh0 rxh0Var) {
        if ((i & 1) == 0) {
            this.f1669a = null;
        } else {
            this.f1669a = list;
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
            this.d = rxh0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayh0)) {
            return false;
        }
        ayh0 ayh0Var = (ayh0) obj;
        return Intrinsics.d(this.f1669a, ayh0Var.f1669a) && Intrinsics.d(this.b, ayh0Var.b) && Intrinsics.d(this.c, ayh0Var.c) && this.d == ayh0Var.d;
    }

    public final int hashCode() {
        List list = this.f1669a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        rxh0 rxh0Var = this.d;
        return iHashCode3 + (rxh0Var != null ? rxh0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("SekaResponse(playerOneCardList=", ", playerTwoCardList=", this.f1669a, ", matchStatusText=", this.b);
        sbT.append(this.c);
        sbT.append(", matchState=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }

    public ayh0() {
        this.f1669a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
