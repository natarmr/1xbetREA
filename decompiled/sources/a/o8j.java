package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o8j implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24831a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final List h;
    public final List i;
    public final j9j j;
    public final n9j k;

    public o8j(int i, int i2, int i3, int i4, int i5, int i6, int i7, List list, List list2, j9j j9jVar, n9j n9jVar) {
        list.getClass();
        list2.getClass();
        this.f24831a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = list;
        this.i = list2;
        this.j = j9jVar;
        this.k = n9jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8j)) {
            return false;
        }
        o8j o8jVar = (o8j) obj;
        return this.f24831a == o8jVar.f24831a && this.b == o8jVar.b && this.c == o8jVar.c && this.d == o8jVar.d && this.e == o8jVar.e && this.f == o8jVar.f && this.g == o8jVar.g && Intrinsics.d(this.h, o8jVar.h) && Intrinsics.d(this.i, o8jVar.i) && this.j == o8jVar.j && this.k == o8jVar.k;
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + dw9.a(dw9.a(twn.a(this.g, twn.a(this.f, twn.a(this.e, twn.a(this.d, twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f24831a) * 31, 31), 31), 31), 31), 31), 31), 31, this.h), 31, this.i)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("DartsLiveModel(roundNumber=", this.f24831a, ", firstPlayerTotal=", ", secondPlayerTotal=", this.b);
        axq.r(this.c, this.d, ", firstPlayerNumberOfThrow=", ", secondPlayerNumberOfThrow=", sbT);
        axq.r(this.e, this.f, ", firstPlayerSumOfThrows=", ", secondPlayerSumOfThrows=", sbT);
        ohs0.v(this.g, ", firstPlayerThrows=", ", secondPlayerThrows=", sbT, this.h);
        sbT.append(this.i);
        sbT.append(", move=");
        sbT.append(this.j);
        sbT.append(", winner=");
        sbT.append(this.k);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
