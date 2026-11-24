package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m0v0 implements n0v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f20974a;
    public final mtl b;

    public m0v0(imm immVar, mtl mtlVar) {
        immVar.getClass();
        this.f20974a = immVar;
        this.b = mtlVar;
    }

    @Override // a.n0v0
    public final imm a() {
        return this.f20974a;
    }

    @Override // a.n0v0
    public final mtl b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0v0)) {
            return false;
        }
        m0v0 m0v0Var = (m0v0) obj;
        return Intrinsics.d(this.f20974a, m0v0Var.f20974a) && Intrinsics.d(this.b, m0v0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f20974a.hashCode() * 31;
        mtl mtlVar = this.b;
        return iHashCode + (mtlVar == null ? 0 : mtlVar.f22376a.hashCode());
    }

    public final String toString() {
        return "Loading(navigationBarUiModel=" + this.f20974a + ", bottomBarModel=" + this.b + Separators.RPAREN;
    }
}
