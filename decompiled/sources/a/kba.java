package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18004a;
    public final a4x b;
    public final long c;
    public final String d;
    public final a4x e;
    public final long f;
    public final String g;

    public kba(String str, a4x a4xVar, long j, String str2, a4x a4xVar2, long j2, String str3) {
        str.getClass();
        a4xVar.getClass();
        str2.getClass();
        a4xVar2.getClass();
        str3.getClass();
        this.f18004a = str;
        this.b = a4xVar;
        this.c = j;
        this.d = str2;
        this.e = a4xVar2;
        this.f = j2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kba)) {
            return false;
        }
        kba kbaVar = (kba) obj;
        if (!Intrinsics.d(this.f18004a, kbaVar.f18004a) || !Intrinsics.d(this.b, kbaVar.b)) {
            return false;
        }
        long j = kbaVar.c;
        int i = y3d.h;
        return h2t0.a(this.c, j) && Intrinsics.d(this.d, kbaVar.d) && Intrinsics.d(this.e, kbaVar.e) && h2t0.a(this.f, kbaVar.f) && Intrinsics.d(this.g, kbaVar.g);
    }

    public final int hashCode() {
        int iB = cs0.b(this.b, this.f18004a.hashCode() * 31, 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.g.hashCode() + rw2.b(cs0.b(this.e, ua80.b(rw2.b(iB, 31, this.c), 31, this.d), 31), 31, this.f);
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        String strI2 = y3d.i(this.f);
        StringBuilder sbU = kng0.u("CardBasketballQuarterUiModel(title=", this.f18004a, ", firstPlayerCards=", this.b, ", firstPlayerColor=");
        f140.v(sbU, strI, ", firstPlayerScore=", this.d, ", secondPlayerCards=");
        sbU.append(this.e);
        sbU.append(", secondPlayerColor=");
        sbU.append(strI2);
        sbU.append(", secondPlayerScore=");
        return axq.n(sbU, this.g, Separators.RPAREN);
    }
}
