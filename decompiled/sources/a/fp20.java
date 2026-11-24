package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fp20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9909a;
    public final String b;
    public final String c;
    public final long d;

    public fp20(long j, String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.f9909a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp20)) {
            return false;
        }
        fp20 fp20Var = (fp20) obj;
        if (!this.f9909a.equals(fp20Var.f9909a) || !Intrinsics.d(this.b, fp20Var.b) || !Intrinsics.d(this.c, fp20Var.c)) {
            return false;
        }
        long j = fp20Var.d;
        int i = y3d.h;
        return h2t0.a(this.d, j);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(this.f9909a.hashCode() * 31, 31, this.b), 31, this.c);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.d) + iB;
    }

    public final String toString() {
        return ua80.m(b1j.n("MapInSeriesTeamUiModel(image=", this.f9909a, ", name=", this.b, ", score="), this.c, ", scoreColor=", y3d.i(this.d), Separators.RPAREN);
    }
}
