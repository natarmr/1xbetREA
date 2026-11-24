package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zhw implements ciw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44413a;
    public final lq5 b;
    public final a4x c;

    public zhw(String str, lq5 lq5Var, a4x a4xVar) {
        a4xVar.getClass();
        this.f44413a = str;
        this.b = lq5Var;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhw)) {
            return false;
        }
        zhw zhwVar = (zhw) obj;
        return this.f44413a.equals(zhwVar.f44413a) && this.b.equals(zhwVar.b) && Intrinsics.d(this.c, zhwVar.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f44413a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f44413a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(key=");
        sb.append(this.f44413a);
        sb.append(", bannerCollectionStyle=");
        sb.append(this.b);
        sb.append(", banners=");
        return cs0.n(sb, this.c, Separators.RPAREN);
    }
}
