package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sah implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31887a;
    public final String b;
    public final String c;
    public final float d;
    public final float e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final List l;
    public final List m;
    public final ArrayList n;
    public final boolean o;

    public sah(String str, String str2, String str3, float f, float f2, String str4, String str5, int i, int i2, int i3, int i4, List list, List list2, ArrayList arrayList, boolean z) {
        ohs0.z(str, str2, str3, str4, str5);
        list.getClass();
        list2.getClass();
        this.f31887a = str;
        this.b = str2;
        this.c = str3;
        this.d = f;
        this.e = f2;
        this.f = str4;
        this.g = str5;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = list;
        this.m = list2;
        this.n = arrayList;
        this.o = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sah)) {
            return false;
        }
        sah sahVar = (sah) obj;
        return Intrinsics.d(this.f31887a, sahVar.f31887a) && Intrinsics.d(this.b, sahVar.b) && Intrinsics.d(this.c, sahVar.c) && Float.compare(this.d, sahVar.d) == 0 && Float.compare(this.e, sahVar.e) == 0 && Intrinsics.d(this.f, sahVar.f) && Intrinsics.d(this.g, sahVar.g) && this.h == sahVar.h && this.i == sahVar.i && this.j == sahVar.j && this.k == sahVar.k && Intrinsics.d(this.l, sahVar.l) && Intrinsics.d(this.m, sahVar.m) && this.n.equals(sahVar.n) && this.o == sahVar.o;
    }

    @Override // a.p6t0
    public final String getKey() {
        return "POKER_KEY";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.o) + twn.g(this.n, dw9.a(dw9.a(twn.a(this.k, twn.a(this.j, twn.a(this.i, twn.a(this.h, ua80.b(ua80.b(defpackage.c.a(defpackage.c.a(ua80.b(ua80.b(ua80.b(1516436039, 31, this.f31887a), 31, this.b), 31, this.c), this.d, 31), this.e, 31), 31, this.f), 31, this.g), 31), 31), 31), 31), 31, this.l), 31, this.m), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberPokerUiModel(key=POKER_KEY, matchDescription=", this.f31887a, ", firstPlayerName=", this.b, ", secondPlayerName=");
        sbN.append(this.c);
        sbN.append(", firstPlayerPrimeOpacity=");
        sbN.append(this.d);
        sbN.append(", secondPlayerPrimeOpacity=");
        sbN.append(this.e);
        sbN.append(", firstPlayerCombination=");
        sbN.append(this.f);
        sbN.append(", secondPlayerCombination=");
        twn.w(this.h, this.g, ", firstPlayerFirstCard=", ", firstPlayerSecondCard=", sbN);
        axq.r(this.i, this.j, ", secondPlayerFirstCard=", ", secondPlayerSecondCard=", sbN);
        ohs0.v(this.k, ", firstPlayerCombinationCardList=", ", secondPlayerCombinationCardList=", sbN, this.l);
        sbN.append(this.m);
        sbN.append(", cardOnTableList=");
        sbN.append(this.n);
        sbN.append(", supportRtl=");
        return rw2.p(sbN, this.o, Separators.RPAREN);
    }
}
