package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hb40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12754a;
    public final List b;
    public final int c;
    public final String d;
    public final int e;

    public hb40(int i, int i2, long j, String str, List list) {
        list.getClass();
        this.f12754a = j;
        this.b = list;
        this.c = i;
        this.d = str;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb40)) {
            return false;
        }
        hb40 hb40Var = (hb40) obj;
        return this.f12754a == hb40Var.f12754a && Intrinsics.d(this.b, hb40Var.b) && this.c == hb40Var.c && this.d.equals(hb40Var.d) && this.e == hb40Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ua80.b(twn.a(this.c, dw9.a(Long.hashCode(this.f12754a) * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = cs0.p(this.f12754a, "MetaHeroesEventOpponentModel(id=", ", icons=", this.b);
        w6x.w(this.c, ", score=", ", winCoef=", this.d, sbP);
        return vqd.p(sbP, ", totalGameWin=", this.e, Separators.RPAREN);
    }
}
