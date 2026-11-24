package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s5u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t73 f31673a;
    public final ghn b;

    public s5u0(t73 t73Var, ghn ghnVar) {
        this.f31673a = t73Var;
        this.b = ghnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5u0)) {
            return false;
        }
        s5u0 s5u0Var = (s5u0) obj;
        return Intrinsics.d(this.f31673a, s5u0Var.f31673a) && Intrinsics.d(this.b, s5u0Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.b.hashCode() + (this.f31673a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f31673a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
