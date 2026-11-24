package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c19 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lq5 f3564a;
    public final a4x b;
    public final boolean c;

    public c19(lq5 lq5Var, a4x a4xVar, boolean z) {
        lq5Var.getClass();
        a4xVar.getClass();
        this.f3564a = lq5Var;
        this.b = a4xVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c19)) {
            return false;
        }
        c19 c19Var = (c19) obj;
        return Intrinsics.d(this.f3564a, c19Var.f3564a) && Intrinsics.d(this.b, c19Var.b) && this.c == c19Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cs0.b(this.b, this.f3564a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrandsListBannersUiState(style=");
        sb.append(this.f3564a);
        sb.append(", bannersList=");
        sb.append(this.b);
        sb.append(", isLoading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
