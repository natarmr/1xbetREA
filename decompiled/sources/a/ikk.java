package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ikk implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14930a;
    public final List b;
    public final List c;
    public final List d;
    public final hkk e;
    public final String f;
    public final String g;

    public ikk(List list, List list2, List list3, List list4, hkk hkkVar, String str, String str2) {
        hne.C(list, list2, list3, list4);
        this.f14930a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = hkkVar;
        this.f = str;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikk)) {
            return false;
        }
        ikk ikkVar = (ikk) obj;
        return Intrinsics.d(this.f14930a, ikkVar.f14930a) && Intrinsics.d(this.b, ikkVar.b) && Intrinsics.d(this.c, ikkVar.c) && Intrinsics.d(this.d, ikkVar.d) && this.e == ikkVar.e && this.f.equals(ikkVar.f) && this.g.equals(ikkVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b((this.e.hashCode() + dw9.a(dw9.a(dw9.a(this.f14930a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("DicePokerModel(playerOneDice=", ", playerOneCombination=", this.f14930a, ", playerTwoDice=", this.b);
        b1j.y(", playerTwoCombination=", ", gameState=", sbT, this.c, this.d);
        sbT.append(this.e);
        sbT.append(", playerOneResult=");
        sbT.append(this.f);
        sbT.append(", playerTwoResult=");
        return axq.n(sbT, this.g, Separators.RPAREN);
    }
}
