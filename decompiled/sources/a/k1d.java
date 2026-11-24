package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k1d implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0x f17517a;
    public final x640 b;
    public final j1d c;

    public k1d(g0x g0xVar, x640 x640Var, j1d j1dVar) {
        x640Var.getClass();
        this.f17517a = g0xVar;
        this.b = x640Var;
        this.c = j1dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1d)) {
            return false;
        }
        k1d k1dVar = (k1d) obj;
        return this.f17517a.equals(k1dVar.f17517a) && Intrinsics.d(this.b, k1dVar.b) && this.c == k1dVar.c;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof k1d) && (p6t0Var2 instanceof k1d)) {
            return ((k1d) p6t0Var).f17517a.equals(((k1d) p6t0Var2).f17517a);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f17517a.hashCode() * 31)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return xun.f41520a;
    }

    public final String toString() {
        return "CollageItemUiItem(imageInfoUiModel=" + this.f17517a + ", status=" + this.b + ", cellType=" + this.c + Separators.RPAREN;
    }
}
