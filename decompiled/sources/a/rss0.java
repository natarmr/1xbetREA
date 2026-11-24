package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rss0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31048a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public rss0(String str, String str2, String str3, String str4, String str5, long j) {
        str4.getClass();
        this.f31048a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rss0)) {
            return false;
        }
        rss0 rss0Var = (rss0) obj;
        if (!this.f31048a.equals(rss0Var.f31048a) || !this.b.equals(rss0Var.b) || !this.c.equals(rss0Var.c) || !Intrinsics.d(this.d, rss0Var.d) || !this.e.equals(rss0Var.e)) {
            return false;
        }
        long j = rss0Var.f;
        int i = y3d.h;
        return h2t0.a(this.f, j);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(ua80.b(ua80.b(this.f31048a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f) + iB;
    }

    public final String toString() {
        String strI = y3d.i(this.f);
        StringBuilder sbN = b1j.n("TvBetJackpotItemUiModel(id=", this.f31048a, ", date=", this.b, ", name=");
        f140.v(sbN, this.c, ", win=", this.d, ", currency=");
        return ua80.m(sbN, this.e, ", background=", strI, Separators.RPAREN);
    }
}
