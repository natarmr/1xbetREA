package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l0v0 implements n0v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f19220a;
    public final imm b;

    public l0v0(mdm mdmVar, imm immVar) {
        mdmVar.getClass();
        immVar.getClass();
        this.f19220a = mdmVar;
        this.b = immVar;
    }

    @Override // a.n0v0
    public final imm a() {
        return this.b;
    }

    @Override // a.n0v0
    public final mtl b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0v0)) {
            return false;
        }
        l0v0 l0v0Var = (l0v0) obj;
        return Intrinsics.d(this.f19220a, l0v0Var.f19220a) && Intrinsics.d(this.b, l0v0Var.b);
    }

    public final int hashCode() {
        return h97.a(this.b, this.f19220a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Error(emptyConfig=" + this.f19220a + ", navigationBarUiModel=" + this.b + ", bottomBarModel=null)";
    }
}
