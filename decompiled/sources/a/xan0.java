package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xan0 implements yan0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40566a;
    public final a4x b;
    public final boolean c;

    public xan0(a4x a4xVar, boolean z, boolean z2) {
        a4xVar.getClass();
        this.f40566a = z;
        this.b = a4xVar;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xan0)) {
            return false;
        }
        xan0 xan0Var = (xan0) obj;
        return this.f40566a == xan0Var.f40566a && Intrinsics.d(this.b, xan0Var.b) && this.c == xan0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cs0.b(this.b, Boolean.hashCode(this.f40566a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowTopLineGames(needScrollTop=");
        sb.append(this.f40566a);
        sb.append(", eventCardList=");
        sb.append(this.b);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
