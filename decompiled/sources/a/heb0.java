package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class heb0 implements oeb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f12915a;
    public final lq5 b;
    public final boolean c;
    public final String d;

    public heb0(lq5 lq5Var, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f12915a = a4xVar;
        this.b = lq5Var;
        this.c = z;
        this.d = z ? "BannerCollectionShimmer" : "BannerCollection";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof heb0)) {
            return false;
        }
        heb0 heb0Var = (heb0) obj;
        return Intrinsics.d(this.f12915a, heb0Var.f12915a) && this.b.equals(heb0Var.b) && this.c == heb0Var.c;
    }

    @Override // a.oeb0
    public final String getKey() {
        return this.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f12915a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BannerCollection(banners=");
        sb.append(this.f12915a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", isLoading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
