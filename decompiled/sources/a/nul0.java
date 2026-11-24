package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class nul0 implements cfq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f24154a;
    public final float b;
    public final Object c;

    public /* synthetic */ nul0(Object obj, int i) {
        this(1.0f, 1500.0f, (i & 4) != 0 ? null : obj);
    }

    @Override // a.j73
    public final l5u0 a(lxs0 lxs0Var) {
        Object obj = this.c;
        return new x5u0(this.f24154a, this.b, obj == null ? null : (t73) lxs0Var.f20832a.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nul0) {
            nul0 nul0Var = (nul0) obj;
            if (nul0Var.f24154a == this.f24154a && nul0Var.b == this.b && Intrinsics.d(nul0Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + defpackage.c.a((obj != null ? obj.hashCode() : 0) * 31, this.f24154a, 31);
    }

    public nul0(float f, float f2, Object obj) {
        this.f24154a = f;
        this.b = f2;
        this.c = obj;
    }

    @Override // a.cfq, a.j73
    public final p5u0 a(lxs0 lxs0Var) {
        Object obj = this.c;
        return new x5u0(this.f24154a, this.b, obj == null ? null : (t73) lxs0Var.f20832a.invoke(obj));
    }
}
