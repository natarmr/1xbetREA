package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wbv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38899a;
    public final int b;
    public final String c;
    public final chl0 d;
    public final Integer e;
    public final v12 f;

    public wbv0(String str, int i, String str2, chl0 chl0Var, Integer num, v12 v12Var) {
        this.f38899a = str;
        this.b = i;
        this.c = str2;
        this.d = chl0Var;
        this.e = num;
        this.f = v12Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbv0)) {
            return false;
        }
        wbv0 wbv0Var = (wbv0) obj;
        return this.f38899a.equals(wbv0Var.f38899a) && this.b == wbv0Var.b && this.c.equals(wbv0Var.c) && this.d.equals(wbv0Var.d) && Intrinsics.d(this.e, wbv0Var.e) && this.f == wbv0Var.f;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ua80.b(twn.a(this.b, this.f38899a.hashCode() * 31, 31), 31, this.c)) * 31;
        Integer num = this.e;
        return this.f.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "WhoWinCellDefaultUiModel(key=", this.f38899a, ", id=", ", opponentImage=");
        sbP.append(this.c);
        sbP.append(", sportMarketDsModel=");
        sbP.append(this.d);
        sbP.append(", gameId=");
        sbP.append(this.e);
        sbP.append(", alignmentInSection=");
        sbP.append(this.f);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
