package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ac5 implements t7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m7h0 f613a;

    public ac5(m7h0 m7h0Var) {
        this.f613a = m7h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ac5) && Intrinsics.d(this.f613a, ((ac5) obj).f613a);
    }

    public final int hashCode() {
        m7h0 m7h0Var = this.f613a;
        if (m7h0Var == null) {
            return 0;
        }
        return m7h0Var.hashCode();
    }

    public final String toString() {
        return "BackTo(screen=" + this.f613a + ')';
    }
}
