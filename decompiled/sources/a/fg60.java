package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class fg60 extends df50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eg60 f9478a;
    public final clz b;

    public fg60(clz clzVar, eg60 eg60Var) {
        eg60Var.getClass();
        this.f9478a = eg60Var;
        this.b = clzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg60)) {
            return false;
        }
        fg60 fg60Var = (fg60) obj;
        return Intrinsics.d(this.f9478a, fg60Var.f9478a) && Intrinsics.d(this.b, fg60Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f9478a.hashCode() * 31;
        clz clzVar = this.b;
        return iHashCode + (clzVar == null ? 0 : clzVar.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f9478a + ", owner=" + this.b + ')';
    }
}
