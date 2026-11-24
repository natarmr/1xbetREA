package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dfm implements hfm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6007a;
    public final long b;
    public final a4x c;

    public dfm(long j, long j2, a4x a4xVar) {
        zcl zclVar = qmk.f28987a;
        a4xVar.getClass();
        this.f6007a = j;
        this.b = j2;
        this.c = a4xVar;
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

    @Override // a.ifm
    public final long e() {
        return this.f6007a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfm)) {
            return false;
        }
        dfm dfmVar = (dfm) obj;
        return this.f6007a == dfmVar.f6007a && this.b == dfmVar.b && Intrinsics.d(this.c, dfmVar.c) && ycl.b(2.0f, 2.0f);
    }

    public final int hashCode() {
        return Float.hashCode(2.0f) + cs0.b(this.c, rw2.b(Long.hashCode(this.f6007a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        String strC = ycl.c(2.0f);
        StringBuilder sbQ = kng0.q(this.f6007a, "MarketDefault(betGameId=", ", marketGroupId=");
        sbQ.append(this.b);
        sbQ.append(", marketList=");
        sbQ.append(this.c);
        return rw2.o(sbQ, ", marketsBottomPadding=", strC, Separators.RPAREN);
    }
}
