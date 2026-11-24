package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wue implements zue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qu6 f39789a;
    public final m97 b;
    public final String c;
    public final q4f d;
    public final String e;
    public final iv10 f;
    public final iwm0 g;
    public final p5t h;
    public final fho i;
    public final String j;

    static {
        k97 k97Var = m97.Companion;
    }

    public wue(qu6 qu6Var, m97 m97Var, String str, q4f q4fVar, String str2, iv10 iv10Var, iwm0 iwm0Var, p5t p5tVar, fho fhoVar, String str3) {
        m97Var.getClass();
        q4fVar.getClass();
        str3.getClass();
        this.f39789a = qu6Var;
        this.b = m97Var;
        this.c = str;
        this.d = q4fVar;
        this.e = str2;
        this.f = iv10Var;
        this.g = iwm0Var;
        this.h = p5tVar;
        this.i = fhoVar;
        this.j = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wue)) {
            return false;
        }
        wue wueVar = (wue) obj;
        return this.f39789a.equals(wueVar.f39789a) && Intrinsics.d(this.b, wueVar.b) && this.c.equals(wueVar.c) && this.d == wueVar.d && this.e.equals(wueVar.e) && this.f.equals(wueVar.f) && this.g.equals(wueVar.g) && Intrinsics.d(this.h, wueVar.h) && this.i == wueVar.i && Intrinsics.d(this.j, wueVar.j);
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ((this.f.hashCode() + ua80.b(vqd.b(this.d, ua80.b((this.b.hashCode() + (this.f39789a.hashCode() * 31)) * 31, 31, this.c), 31), 31, this.e)) * 31)) * 31;
        p5t p5tVar = this.h;
        return this.j.hashCode() + ((this.i.hashCode() + ((iHashCode + (p5tVar == null ? 0 : p5tVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "CouponConfiguredModel(betEvent=" + this.f39789a + ", betInfo=" + this.b + ", sportName=" + this.c + ", couponTypeModel=" + this.d + ", previousCoef=" + this.e + ", previousMainGameScoresModel=" + this.f + ", previousSubGameScoresModel=" + this.g + ", gamesForCouponModel=" + this.h + ", eventSpecialBetType=" + this.i + ", makeBetError=" + this.j + Separators.RPAREN;
    }
}
