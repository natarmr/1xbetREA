package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ekb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7944a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public ekb(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6) {
        this.f7944a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekb)) {
            return false;
        }
        ekb ekbVar = (ekb) obj;
        return this.f7944a.equals(ekbVar.f7944a) && this.b.equals(ekbVar.b) && this.c == ekbVar.c && this.d == ekbVar.d && this.e == ekbVar.e && this.f == ekbVar.f && this.g == ekbVar.g && this.h == ekbVar.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + twn.a(this.g, twn.a(this.f, twn.a(this.e, twn.a(this.d, twn.a(this.c, ua80.b(this.f7944a.hashCode() * 31, 31, this.b), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ChampionshipPlayerStatisticModel(playerId=", this.f7944a, ", name=", this.b, ", number=");
        axq.r(this.c, this.d, ", age=", ", gamesCount=", sbN);
        axq.r(this.e, this.f, ", goalsCount=", ", yellowCardsCount=", sbN);
        return w6x.o(this.g, this.h, ", redCardsCount=", Separators.RPAREN, sbN);
    }
}
