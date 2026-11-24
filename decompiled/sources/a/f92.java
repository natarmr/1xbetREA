package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e92 f9134a;
    public final z82 b;
    public final y72 c;
    public final hyl d;
    public final q4i0 e;
    public final boolean f;

    public f92(e92 e92Var, z82 z82Var, y72 y72Var, hyl hylVar, q4i0 q4i0Var, boolean z) {
        e92Var.getClass();
        z82Var.getClass();
        y72Var.getClass();
        q4i0Var.getClass();
        this.f9134a = e92Var;
        this.b = z82Var;
        this.c = y72Var;
        this.d = hylVar;
        this.e = q4i0Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f92)) {
            return false;
        }
        f92 f92Var = (f92) obj;
        return Intrinsics.d(this.f9134a, f92Var.f9134a) && Intrinsics.d(this.b, f92Var.b) && Intrinsics.d(this.c, f92Var.c) && Intrinsics.d(this.d, f92Var.d) && Intrinsics.d(this.e, f92Var.e) && this.f == f92Var.f;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f9134a.f7400a.hashCode() * 31)) * 31)) * 31;
        hyl hylVar = this.d;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((iHashCode + (hylVar == null ? 0 : hylVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "AltDesignLSpecialEventMainUiState(toolbar=" + this.f9134a + ", headerBackground=" + this.b + ", header=" + this.c + ", chips=" + this.d + ", selectedTabContent=" + this.e + ", rtlSupport=" + this.f + Separators.RPAREN;
    }
}
