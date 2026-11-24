package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a4l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229a;
    public final String b;
    public final long c;

    public a4l(String str, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.f229a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4l)) {
            return false;
        }
        a4l a4lVar = (a4l) obj;
        if (!Intrinsics.d(this.f229a, a4lVar.f229a) || !Intrinsics.d(this.b, a4lVar.b)) {
            return false;
        }
        long j = a4lVar.c;
        int i = y3d.h;
        return h2t0.a(this.c, j);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f229a.hashCode() * 31, 31, this.b);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + iB;
    }

    public final String toString() {
        return axq.n(b1j.n("DotaHeroIndicatorValueUiModel(firstValue=", this.f229a, ", secondValue=", this.b, ", raceColor="), y3d.i(this.c), Separators.RPAREN);
    }
}
