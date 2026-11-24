package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u9v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35301a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;

    public u9v(long j, long j2, String str, String str2, String str3, String str4, String str5) {
        str2.getClass();
        this.f35301a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = j2;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9v)) {
            return false;
        }
        u9v u9vVar = (u9v) obj;
        if (!this.f35301a.equals(u9vVar.f35301a) || !Intrinsics.d(this.b, u9vVar.b)) {
            return false;
        }
        long j = u9vVar.c;
        int i = y3d.h;
        return h2t0.a(this.c, j) && this.d.equals(u9vVar.d) && this.e.equals(u9vVar.e) && h2t0.a(this.f, u9vVar.f) && this.g.equals(u9vVar.g);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f35301a.hashCode() * 31, 31, this.b);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.g.hashCode() + rw2.b(ua80.b(ua80.b(rw2.b(iB, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        String strI2 = y3d.i(this.f);
        StringBuilder sbN = b1j.n("GoldRushCoordinatesGameInfoUiModel(background=", this.f35301a, ", text=", this.b, ", textColor=");
        f140.v(sbN, strI, ", bonusIcon=", this.d, ", filledBackground=");
        f140.v(sbN, this.e, ", filledTextColor=", strI2, ", filledIcon=");
        return axq.n(sbN, this.g, Separators.RPAREN);
    }
}
