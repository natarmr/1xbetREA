package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qz3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29561a;
    public final fz3 b;
    public final gbe0 c;

    public qz3(Object obj, fz3 fz3Var, gbe0 gbe0Var) {
        this.f29561a = obj;
        this.b = fz3Var;
        this.c = gbe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz3)) {
            return false;
        }
        qz3 qz3Var = (qz3) obj;
        fz3 fz3Var = qz3Var.b;
        fz3 fz3Var2 = this.b;
        return Intrinsics.d(fz3Var2, fz3Var) && fz3Var2.a(this.f29561a, qz3Var.f29561a) && this.c == qz3Var.c;
    }

    public final int hashCode() {
        fz3 fz3Var = this.b;
        return this.c.hashCode() + ((fz3Var.b(this.f29561a) + (fz3Var.hashCode() * 31)) * 31);
    }
}
