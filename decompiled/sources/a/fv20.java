package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fv20 implements gy20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uv20 f10194a;
    public final a4x b;
    public final String c;

    public fv20(uv20 uv20Var, a4x a4xVar, String str) {
        a4xVar.getClass();
        str.getClass();
        this.f10194a = uv20Var;
        this.b = a4xVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv20)) {
            return false;
        }
        fv20 fv20Var = (fv20) obj;
        return this.f10194a.equals(fv20Var.f10194a) && Intrinsics.d(this.b, fv20Var.b) && Intrinsics.d(this.c, fv20Var.c);
    }

    @Override // a.gy20
    public final String getKey() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + cs0.b(this.b, this.f10194a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGroupUiModel(header=");
        sb.append(this.f10194a);
        sb.append(", rows=");
        sb.append(this.b);
        sb.append(", key=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
