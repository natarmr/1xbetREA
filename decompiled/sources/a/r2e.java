package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r2e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29728a;

    public r2e(Object obj) {
        this.f29728a = obj;
    }

    public wsy a(ym40 ym40Var) {
        ym40Var.getClass();
        return ((t83) this.f29728a).getType();
    }

    public Object b() {
        return this.f29728a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Object objB = b();
        r2e r2eVar = obj instanceof r2e ? (r2e) obj : null;
        return Intrinsics.d(objB, r2eVar != null ? r2eVar.b() : null);
    }

    public final int hashCode() {
        Object objB = b();
        if (objB != null) {
            return objB.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
