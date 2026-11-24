package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f3w implements h3w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8883a;
    public final String b;
    public final String c;
    public final String d;
    public final e3w e;

    public f3w(String str, String str2, String str3, String str4, e3w e3wVar) {
        cs0.x(str, str2, str3, str4);
        this.f8883a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = e3wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3w)) {
            return false;
        }
        f3w f3wVar = (f3w) obj;
        return Intrinsics.d(this.f8883a, f3wVar.f8883a) && Intrinsics.d(this.b, f3wVar.b) && Intrinsics.d(this.c, f3wVar.c) && Intrinsics.d(this.d, f3wVar.d) && this.e == f3wVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f8883a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("HistoryItemAmountTextUiModel(amountKey=", this.f8883a, ", titleText=", this.b, ", descriptionText=");
        f140.v(sbN, this.c, ", currency=", this.d, ", historyItemAmountState=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
