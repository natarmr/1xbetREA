package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rlm implements tlm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30704a;
    public final String b;
    public final long c;
    public final long d;
    public final ga50 e;

    public rlm(String str, String str2, long j, long j2, ga50 ga50Var) {
        str.getClass();
        str2.getClass();
        this.f30704a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = ga50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlm)) {
            return false;
        }
        rlm rlmVar = (rlm) obj;
        if (!Intrinsics.d(this.f30704a, rlmVar.f30704a) || !Intrinsics.d(this.b, rlmVar.b)) {
            return false;
        }
        long j = rlmVar.c;
        int i = y3d.h;
        return h2t0.a(this.c, j) && h2t0.a(this.d, rlmVar.d) && this.e.equals(rlmVar.e);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f30704a.hashCode() * 31, 31, this.b);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.e.hashCode() + rw2.b(rw2.b(iB, 31, this.c), 31, this.d);
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        String strI2 = y3d.i(this.d);
        StringBuilder sbN = b1j.n("TitleSubtitle(title=", this.f30704a, ", subTitle=", this.b, ", titleColor=");
        f140.v(sbN, strI, ", subtitleColor=", strI2, ", options=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
