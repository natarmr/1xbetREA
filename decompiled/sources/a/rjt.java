package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class rjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30612a;
    public final vmu0 b;

    public rjt(int i, vmu0 vmu0Var) {
        vmu0Var.getClass();
        this.f30612a = i;
        this.b = vmu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rjt)) {
            return false;
        }
        rjt rjtVar = (rjt) obj;
        return this.f30612a == rjtVar.f30612a && Intrinsics.d(this.b, rjtVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f30612a) * 31);
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.f30612a + ", hint=" + this.b + ')';
    }
}
