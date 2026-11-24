package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bfm implements cfm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2509a;
    public final long b;
    public final a4x c;
    public final mfm d;

    public bfm(long j, long j2, a4x a4xVar, mfm mfmVar) {
        zcl zclVar = qmk.f28987a;
        a4xVar.getClass();
        this.f2509a = j;
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
        return 8.0f;
    }

    @Override // a.ifm
    public final a4x c() {
        return this.c;
    }

    @Override // a.cfm
    public final float d() {
        return 4.0f;
    }

    @Override // a.ifm
    public final long e() {
        return this.f2509a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfm)) {
            return false;
        }
        bfm bfmVar = (bfm) obj;
        return this.f2509a == bfmVar.f2509a && this.b == bfmVar.b && Intrinsics.d(this.c, bfmVar.c) && this.d.equals(bfmVar.d) && ycl.b(8.0f, 8.0f) && ycl.b(4.0f, 4.0f);
    }

    @Override // a.cfm
    public final mfm getHeader() {
        return this.d;
    }

    public final int hashCode() {
        return Float.hashCode(4.0f) + defpackage.c.a((this.d.hashCode() + cs0.b(this.c, rw2.b(Long.hashCode(this.f2509a) * 31, 31, this.b), 31)) * 31, 8.0f, 31);
    }

    public final String toString() {
        String strC = ycl.c(8.0f);
        String strC2 = ycl.c(4.0f);
        StringBuilder sbQ = kng0.q(this.f2509a, "MarketV3(betGameId=", ", marketGroupId=");
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
