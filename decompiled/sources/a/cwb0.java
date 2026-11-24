package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class cwb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f5073a;
    public final Class b;

    public cwb0(Class cls, Class cls2) {
        this.f5073a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cwb0)) {
            return false;
        }
        cwb0 cwb0Var = (cwb0) obj;
        return cwb0Var.f5073a.equals(this.f5073a) && cwb0Var.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.f5073a, this.b);
    }

    public final String toString() {
        return this.f5073a.getSimpleName() + " with primitive type: " + this.b.getSimpleName();
    }
}
