package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dav implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5770a;
    public final List b;
    public final aav c;
    public final int d;
    public final int e;
    public final int f;
    public final fav g;
    public final int h;
    public final int i;
    public final List j;
    public final List k;

    public dav(List list, List list2, aav aavVar, int i, int i2, int i3, fav favVar, int i4, int i5, List list3, List list4) {
        hne.C(list, list2, list3, list4);
        this.f5770a = list;
        this.b = list2;
        this.c = aavVar;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = favVar;
        this.h = i4;
        this.i = i5;
        this.j = list3;
        this.k = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dav)) {
            return false;
        }
        dav davVar = (dav) obj;
        return Intrinsics.d(this.f5770a, davVar.f5770a) && Intrinsics.d(this.b, davVar.b) && this.c == davVar.c && this.d == davVar.d && this.e == davVar.e && this.f == davVar.f && this.g == davVar.g && this.h == davVar.h && this.i == davVar.i && Intrinsics.d(this.j, davVar.j) && Intrinsics.d(this.k, davVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + dw9.a(twn.a(this.i, twn.a(this.h, (this.g.hashCode() + twn.a(this.f, twn.a(this.e, twn.a(this.d, (this.c.hashCode() + dw9.a(this.f5770a.hashCode() * 31, 31, this.b)) * 31, 31), 31), 31)) * 31, 31), 31), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("GoldRushModel(firstPlayersFields=", ", secondPlayersFields=", this.f5770a, ", gameState=", this.b);
        sbT.append(this.c);
        sbT.append(", previousRoundCount=");
        sbT.append(this.d);
        sbT.append(", firstPlayerPosition=");
        axq.r(this.e, this.f, ", secondPlayerPosition=", ", playerTurn=", sbT);
        sbT.append(this.g);
        sbT.append(", cubeCount=");
        sbT.append(this.h);
        sbT.append(", dopCubeValue=");
        ohs0.v(this.i, ", firstPlayerActivatedField=", ", secondPlayerActivatedField=", sbT, this.j);
        return dw9.r(sbT, this.k, Separators.RPAREN);
    }
}
