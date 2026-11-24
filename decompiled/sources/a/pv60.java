package a;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pv60 extends uv60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nrv f27649a;
    public final String b;
    public final ArrayList c;
    public final ArrayList d;

    public pv60(nrv nrvVar, String str, ArrayList arrayList, ArrayList arrayList2) {
        str.getClass();
        this.f27649a = nrvVar;
        this.b = str;
        this.c = arrayList;
        this.d = arrayList2;
    }

    @Override // a.uv60
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv60)) {
            return false;
        }
        pv60 pv60Var = (pv60) obj;
        return this.f27649a.equals(pv60Var.f27649a) && Intrinsics.d(this.b, pv60Var.b) && this.c.equals(pv60Var.c) && this.d.equals(pv60Var.d);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof pv60) && (p6t0Var2 instanceof pv60)) {
            return Intrinsics.d(((pv60) p6t0Var).b, ((pv60) p6t0Var2).b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.d.hashCode() + twn.g(this.c, ua80.b(this.f27649a.hashCode() * 31, 31, this.b), 31)) * 31) + 63217467;
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return iun.f15405a;
    }

    public final String toString() {
        return "CategoryUiModel(headerModel=" + this.f27649a + ", categoryId=" + this.b + ", gameList=" + this.c + ", gameCollection=" + this.d + ", collectionItemViewType=largeSquares)";
    }
}
