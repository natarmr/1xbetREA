package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yem implements cfm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42493a;
    public final long b;
    public final a4x c;
    public final mfm d;

    public yem(long j, long j2, a4x a4xVar, mfm mfmVar) {
        zcl zclVar = qmk.f28987a;
        a4xVar.getClass();
        this.f42493a = j;
        this.b = j2;
        this.c = a4xVar;
        this.d = mfmVar;
    }

    @Override // a.ifm
    public final long a() {
        return this.b;
    }

    @Override // a.ifm
    public final float b() {
        return 2.0f;
    }

    @Override // a.ifm
    public final a4x c() {
        return this.c;
    }

    @Override // a.cfm
    public final float d() {
        return 0.0f;
    }

    @Override // a.ifm
    public final long e() {
        return this.f42493a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yem)) {
            return false;
        }
        yem yemVar = (yem) obj;
        return this.f42493a == yemVar.f42493a && this.b == yemVar.b && Intrinsics.d(this.c, yemVar.c) && this.d.equals(yemVar.d) && ycl.b(2.0f, 2.0f) && ycl.b(0.0f, 0.0f);
    }

    @Override // a.cfm
    public final mfm getHeader() {
        return this.d;
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + defpackage.c.a((this.d.hashCode() + cs0.b(this.c, rw2.b(Long.hashCode(this.f42493a) * 31, 31, this.b), 31)) * 31, 2.0f, 31);
    }

    public final String toString() {
        String strC = ycl.c(2.0f);
        String strC2 = ycl.c(0.0f);
        StringBuilder sbQ = kng0.q(this.f42493a, "MarketDefault(betGameId=", ", marketGroupId=");
        sbQ.append(this.b);
        sbQ.append(", marketList=");
        sbQ.append(this.c);
        sbQ.append(", header=");
        sbQ.append(this.d);
        sbQ.append(", marketsBottomPadding=");
        sbQ.append(strC);
        return rw2.o(sbQ, ", headerHorizontalPadding=", strC2, Separators.RPAREN);
    }
}
