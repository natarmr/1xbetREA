package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ag5 implements iqg {
    public static final zf5 Companion = new zf5();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f812a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;

    static {
        wez wezVar = wez.f39042a;
        f = new a8z[]{maz.a(wezVar, new o85((byte) 4)), maz.a(wezVar, new o85((byte) 5)), null, null, null};
    }

    public /* synthetic */ ag5(int i, String str, String str2, String str3, List list, List list2) {
        if ((i & 1) == 0) {
            this.f812a = null;
        } else {
            this.f812a = list;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag5)) {
            return false;
        }
        ag5 ag5Var = (ag5) obj;
        return Intrinsics.d(this.f812a, ag5Var.f812a) && Intrinsics.d(this.b, ag5Var.b) && Intrinsics.d(this.c, ag5Var.c) && Intrinsics.d(this.d, ag5Var.d) && Intrinsics.d(this.e, ag5Var.e);
    }

    public final int hashCode() {
        List list = this.f812a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("BakkaraResponse(playerOneCardList=", ", playerTwoCardList=", this.f812a, ", playerOneBatchScore=", this.b);
        f140.v(sbT, this.c, ", playerTwoBatchScore=", this.d, ", matchState=");
        return axq.n(sbT, this.e, Separators.RPAREN);
    }

    public ag5() {
        this.f812a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
