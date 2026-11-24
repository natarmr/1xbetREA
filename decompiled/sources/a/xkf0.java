package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xkf0 implements t7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m7h0 f41027a;

    public xkf0(m7h0 m7h0Var) {
        m7h0Var.getClass();
        this.f41027a = m7h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xkf0) && Intrinsics.d(this.f41027a, ((xkf0) obj).f41027a);
    }

    public final int hashCode() {
        return this.f41027a.hashCode();
    }

    public final String toString() {
        return "Replace(screen=" + this.f41027a + ')';
    }
}
