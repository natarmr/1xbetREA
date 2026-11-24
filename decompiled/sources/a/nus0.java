package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class nus0 implements iqg {
    public static final mus0 Companion = new mus0();
    public static final a8z[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24160a;
    public final List b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    static {
        wez wezVar = wez.f39042a;
        h = new a8z[]{null, maz.a(wezVar, new xns0((byte) 3)), maz.a(wezVar, new xns0((byte) 4)), null, null, null, null};
    }

    public /* synthetic */ nus0(int i, String str, List list, List list2, String str2, String str3, String str4, String str5) {
        if ((i & 1) == 0) {
            this.f24160a = null;
        } else {
            this.f24160a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
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
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nus0)) {
            return false;
        }
        nus0 nus0Var = (nus0) obj;
        return Intrinsics.d(this.f24160a, nus0Var.f24160a) && Intrinsics.d(this.b, nus0Var.b) && Intrinsics.d(this.c, nus0Var.c) && Intrinsics.d(this.d, nus0Var.d) && Intrinsics.d(this.e, nus0Var.e) && Intrinsics.d(this.f, nus0Var.f) && Intrinsics.d(this.g, nus0Var.g);
    }

    public final int hashCode() {
        String str = this.f24160a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("TwentyOneResponse(gameType=", this.f24160a, ", playerOneCardList=", this.b, ", playerTwoCardList=");
        h97.y(", playerOneBatchScore=", this.d, ", playerTwoBatchScore=", sbF, this.c);
        f140.v(sbF, this.e, ", matchState=", this.f, ", matchStateWithRound=");
        return axq.n(sbF, this.g, Separators.RPAREN);
    }

    public nus0() {
        this.f24160a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
