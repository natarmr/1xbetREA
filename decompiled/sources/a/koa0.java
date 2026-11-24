package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class koa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f18623a;
    public final j83 b;
    public final String c;

    public koa0(j83 j83Var, j83 j83Var2, String str) {
        str.getClass();
        this.f18623a = j83Var;
        this.b = j83Var2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof koa0)) {
            return false;
        }
        koa0 koa0Var = (koa0) obj;
        return this.f18623a.equals(koa0Var.f18623a) && this.b.equals(koa0Var.b) && Intrinsics.d(this.c, koa0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.f(this.b, this.f18623a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointCellUiModel(teamOneScore=");
        sb.append((Object) this.f18623a);
        sb.append(", teamTwoScore=");
        sb.append((Object) this.b);
        sb.append(", cellTitle=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
