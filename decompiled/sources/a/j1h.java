package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j1h implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1h f15733a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final i1h f;
    public final i1h g;
    public final float h;
    public final float i;
    public final boolean j;

    public j1h(h1h h1hVar, String str, String str2, String str3, String str4, i1h i1hVar, i1h i1hVar2, float f, float f2, boolean z) {
        cs0.x(str, str2, str3, str4);
        this.f15733a = h1hVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i1hVar;
        this.g = i1hVar2;
        this.h = f;
        this.i = f2;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1h)) {
            return false;
        }
        j1h j1hVar = (j1h) obj;
        return this.f15733a.equals(j1hVar.f15733a) && Intrinsics.d(this.b, j1hVar.b) && Intrinsics.d(this.c, j1hVar.c) && Intrinsics.d(this.d, j1hVar.d) && Intrinsics.d(this.e, j1hVar.e) && this.f.equals(j1hVar.f) && this.g.equals(j1hVar.g) && Float.compare(this.h, j1hVar.h) == 0 && Float.compare(this.i, j1hVar.i) == 0 && this.j == j1hVar.j;
    }

    @Override // a.p6t0
    public final String getKey() {
        return "HIGHER_VS_LOWER_KEY";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + defpackage.c.a(defpackage.c.a((this.g.hashCode() + ((this.f.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b((this.f15733a.hashCode() - 1400673135) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31, this.h, 31), this.i, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberHigherVsLowerUiModel(key=HIGHER_VS_LOWER_KEY, matchDescription=");
        sb.append(this.f15733a);
        sb.append(", firstPlayerName=");
        sb.append(this.b);
        sb.append(", secondPlayerName=");
        f140.v(sb, this.c, ", firstPlayerScore=", this.d, ", secondPlayerScore=");
        sb.append(this.e);
        sb.append(", firstPlayerRound=");
        sb.append(this.f);
        sb.append(", secondPlayerRound=");
        sb.append(this.g);
        sb.append(", firstPlayerOpacity=");
        sb.append(this.h);
        sb.append(", secondPlayerOpacity=");
        sb.append(this.i);
        sb.append(", supportRtl=");
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
