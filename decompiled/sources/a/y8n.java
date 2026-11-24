package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y8n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42204a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final boolean h;
    public final unm i;

    public y8n(String str, String str2, String str3, long j, long j2, long j3, long j4, boolean z, unm unmVar) {
        str.getClass();
        this.f42204a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = z;
        this.i = unmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8n)) {
            return false;
        }
        y8n y8nVar = (y8n) obj;
        if (!Intrinsics.d(this.f42204a, y8nVar.f42204a) || !this.b.equals(y8nVar.b) || !Intrinsics.d(this.c, y8nVar.c)) {
            return false;
        }
        long j = y8nVar.d;
        int i = y3d.h;
        return h2t0.a(this.d, j) && h2t0.a(this.e, y8nVar.e) && h2t0.a(this.f, y8nVar.f) && h2t0.a(this.g, y8nVar.g) && this.h == y8nVar.h && this.i.equals(y8nVar.i);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f42204a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.i.hashCode() + brm0.e(rw2.b(rw2.b(rw2.b(rw2.b(iHashCode, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        String strI = y3d.i(this.d);
        String strI2 = y3d.i(this.e);
        String strI3 = y3d.i(this.f);
        String strI4 = y3d.i(this.g);
        StringBuilder sbN = b1j.n("DsWagerProgressUiModel(title=", this.f42204a, ", firstLabel=", this.b, ", secondLabel=");
        f140.v(sbN, this.c, ", backgroundColor=", strI, ", titleColor=");
        f140.v(sbN, strI2, ", firstLabelColor=", strI3, ", secondLabelColor=");
        brm0.C(strI4, ", hasSeparator=", ", progressIndicator=", sbN, this.h);
        sbN.append(this.i);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
