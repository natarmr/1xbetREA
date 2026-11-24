package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gkk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11449a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    public final nkk f;

    public gkk(String str, String str2, String str3, List list, List list2, nkk nkkVar) {
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        this.f11449a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
        this.f = nkkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gkk)) {
            return false;
        }
        gkk gkkVar = (gkk) obj;
        return this.f11449a.equals(gkkVar.f11449a) && Intrinsics.d(this.b, gkkVar.b) && Intrinsics.d(this.c, gkkVar.c) && Intrinsics.d(this.d, gkkVar.d) && Intrinsics.d(this.e, gkkVar.e) && this.f == gkkVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + dw9.a(dw9.a(ua80.b(ua80.b(this.f11449a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("DicePokerMatchResultUiModel(matchResultText=", this.f11449a, ", firstPlayerCombination=", this.b, ", secondPlayerCombination=");
        cs0.y(this.c, ", firstPlayerCombinationSelected=", ", secondPlayerCombinationSelected=", sbN, this.d);
        sbN.append(this.e);
        sbN.append(", resultState=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
