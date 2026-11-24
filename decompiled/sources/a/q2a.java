package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q2a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0a f27991a;
    public final p15 b;

    public q2a(r0a r0aVar) {
        this.f27991a = r0aVar;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2a)) {
            return false;
        }
        q2a q2aVar = (q2a) obj;
        return this.f27991a == q2aVar.f27991a && Intrinsics.d(this.b, q2aVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f27991a.hashCode() * 31;
        p15 p15Var = this.b;
        return iHashCode + (p15Var == null ? 0 : p15Var.hashCode());
    }

    public final String toString() {
        return "CombinedCameraState(state=" + this.f27991a + ", error=" + this.b + ')';
    }

    public q2a(r0a r0aVar, p15 p15Var) {
        this.f27991a = r0aVar;
        this.b = p15Var;
    }
}
