package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class htm implements ltm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13641a;
    public final String b;
    public final a4x c;
    public final a4x d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;

    public htm(String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        this.f13641a = str;
        this.b = str2;
        this.c = a4xVar;
        this.d = a4xVar2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = z;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htm)) {
            return false;
        }
        htm htmVar = (htm) obj;
        return Intrinsics.d(this.f13641a, htmVar.f13641a) && Intrinsics.d(this.b, htmVar.b) && Intrinsics.d(this.c, htmVar.c) && Intrinsics.d(this.d, htmVar.d) && this.e.equals(htmVar.e) && Intrinsics.d(this.f, htmVar.f) && Intrinsics.d(this.g, htmVar.g) && Intrinsics.d(this.h, htmVar.h) && this.i == htmVar.i && this.j == htmVar.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(cs0.b(this.d, cs0.b(this.c, ua80.b(this.f13641a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("V1(firstOpponentLabel=", this.f13641a, ", secondOpponentLabel=", this.b, ", firstOpponentCardList=");
        hne.y(sbN, this.c, ", secondOpponentCardList=", this.d, ", infoLabel=");
        f140.v(sbN, this.e, ", gameLabel=", this.f, ", firstResultScore=");
        f140.v(sbN, this.g, ", secondResultScore=", this.h, ", firstResultScoreChanged=");
        return ohs0.p(", secondResultScoreChanged=", ", enableEventStatusIndicator=true)", sbN, this.i, this.j);
    }
}
