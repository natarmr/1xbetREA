package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class or20 implements gy20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uv20 f25717a;
    public final bh b;
    public final String c;

    public or20(uv20 uv20Var, bh bhVar, String str) {
        str.getClass();
        this.f25717a = uv20Var;
        this.b = bhVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or20)) {
            return false;
        }
        or20 or20Var = (or20) obj;
        return this.f25717a.equals(or20Var.f25717a) && this.b.equals(or20Var.b) && Intrinsics.d(this.c, or20Var.c);
    }

    @Override // a.gy20
    public final String getKey() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f25717a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketAccuracyGroupUiModel(header=");
        sb.append(this.f25717a);
        sb.append(", accuracyContentUiModel=");
        sb.append(this.b);
        sb.append(", key=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
