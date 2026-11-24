package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dwq implements t7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m7h0 f6811a;

    public dwq(m7h0 m7h0Var) {
        m7h0Var.getClass();
        this.f6811a = m7h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dwq) && Intrinsics.d(this.f6811a, ((dwq) obj).f6811a);
    }

    public final int hashCode() {
        return this.f6811a.hashCode();
    }

    public final String toString() {
        return "Forward(screen=" + this.f6811a + ')';
    }
}
