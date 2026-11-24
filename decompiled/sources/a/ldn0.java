package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ldn0 implements mdn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19859a;
    public final i4 b;
    public final boolean c;

    public ldn0(boolean z, i4 i4Var, boolean z2) {
        i4Var.getClass();
        this.f19859a = z;
        this.b = i4Var;
        this.c = z2;
    }

    @Override // a.mdn0
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldn0)) {
            return false;
        }
        ldn0 ldn0Var = (ldn0) obj;
        return this.f19859a == ldn0Var.f19859a && Intrinsics.d(this.b, ldn0Var.b) && this.c == ldn0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f140.c(this.b, brm0.e(Boolean.hashCode(false) * 31, 31, this.f19859a), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowTopLineGames(isRefreshing=false, needScrollTop=");
        sb.append(this.f19859a);
        sb.append(", eventCardList=");
        sb.append(this.b);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
