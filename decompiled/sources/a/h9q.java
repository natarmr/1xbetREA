package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class h9q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12689a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final db8 f;

    public h9q(String str, String str2, String str3, String str4, String str5, db8 db8Var) {
        cs0.x(str, str2, str3, str4);
        this.f12689a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = db8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9q)) {
            return false;
        }
        h9q h9qVar = (h9q) obj;
        return Intrinsics.d(this.f12689a, h9qVar.f12689a) && Intrinsics.d(this.b, h9qVar.b) && Intrinsics.d(this.c, h9qVar.c) && Intrinsics.d(this.d, h9qVar.d) && this.e.equals(h9qVar.e) && this.f == h9qVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(this.f12689a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("FinBetsBoardUIModel(startLevel=", this.f12689a, ", currentLevel=", this.b, ", statusTradeText=");
        f140.v(sbN, this.c, ", tradeClosingValue=", this.d, ", deltaPercentText=");
        sbN.append(this.e);
        sbN.append(", deltaPercentState=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
