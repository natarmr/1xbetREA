package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ngm0 implements pgm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23494a;
    public final String b;
    public final String c;
    public final long d;

    public ngm0(long j, String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.f23494a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngm0)) {
            return false;
        }
        ngm0 ngm0Var = (ngm0) obj;
        if (!Intrinsics.d(this.f23494a, ngm0Var.f23494a) || !this.b.equals(ngm0Var.b) || !Intrinsics.d(this.c, ngm0Var.c)) {
            return false;
        }
        long j = ngm0Var.d;
        int i = y3d.h;
        return h2t0.a(this.d, j);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(this.f23494a.hashCode() * 31, 31, this.b), 31, this.c);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.d) + iB;
    }

    public final String toString() {
        return ua80.m(b1j.n("HeaderParams(teamName=", this.f23494a, ", teamImage=", this.b, ", tagText="), this.c, ", tableTeamColor=", y3d.i(this.d), Separators.RPAREN);
    }
}
