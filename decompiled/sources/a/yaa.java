package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yaa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42284a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final wnq0 g;
    public final String h;
    public final String i;
    public final String j;
    public final zaa k;

    public yaa(String str, String str2, String str3, String str4, String str5, String str6, wnq0 wnq0Var, String str7, String str8, String str9, zaa zaaVar) {
        ohs0.z(str, str3, str4, str6, str8);
        str9.getClass();
        this.f42284a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = wnq0Var;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = zaaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yaa)) {
            return false;
        }
        yaa yaaVar = (yaa) obj;
        return Intrinsics.d(this.f42284a, yaaVar.f42284a) && this.b.equals(yaaVar.b) && Intrinsics.d(this.c, yaaVar.c) && Intrinsics.d(this.d, yaaVar.d) && this.e.equals(yaaVar.e) && Intrinsics.d(this.f, yaaVar.f) && this.g.equals(yaaVar.g) && this.h.equals(yaaVar.h) && Intrinsics.d(this.i, yaaVar.i) && Intrinsics.d(this.j, yaaVar.j) && this.k == yaaVar.k;
    }

    public final int hashCode() {
        return this.k.hashCode() + ua80.b(ua80.b(ua80.b((this.g.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f42284a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CardBasketballGameInfoUiModel(firstPlayerName=", this.f42284a, ", firstPlayerImage=", this.b, ", firstPlayerScore=");
        f140.v(sbN, this.c, ", secondPlayerName=", this.d, ", secondPlayerImage=");
        f140.v(sbN, this.e, ", secondPlayerScore=", this.f, ", timer=");
        sbN.append(this.g);
        sbN.append(", timerImage=");
        sbN.append(this.h);
        sbN.append(", typefacePath=");
        f140.v(sbN, this.i, ", description=", this.j, ", gameState=");
        sbN.append(this.k);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
