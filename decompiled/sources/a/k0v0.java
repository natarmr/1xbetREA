package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k0v0 implements n0v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17487a;
    public final boolean b;
    public final imm c;
    public final mtl d;

    public k0v0(List list, boolean z, imm immVar, mtl mtlVar) {
        list.getClass();
        immVar.getClass();
        this.f17487a = list;
        this.b = z;
        this.c = immVar;
        this.d = mtlVar;
    }

    @Override // a.n0v0
    public final imm a() {
        return this.c;
    }

    @Override // a.n0v0
    public final mtl b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0v0)) {
            return false;
        }
        k0v0 k0v0Var = (k0v0) obj;
        return Intrinsics.d(this.f17487a, k0v0Var.f17487a) && this.b == k0v0Var.b && Intrinsics.d(this.c, k0v0Var.c) && Intrinsics.d(this.d, k0v0Var.d);
    }

    public final int hashCode() {
        int iA = h97.a(this.c, brm0.e(this.f17487a.hashCode() * 31, 31, this.b), 31);
        mtl mtlVar = this.d;
        return iA + (mtlVar == null ? 0 : mtlVar.f22376a.hashCode());
    }

    public final String toString() {
        return "Content(items=" + this.f17487a + ", isRefreshing=" + this.b + ", navigationBarUiModel=" + this.c + ", bottomBarModel=" + this.d + Separators.RPAREN;
    }
}
