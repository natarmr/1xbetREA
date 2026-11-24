package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class jhi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f16528a;
    public final Class b;

    public jhi0(Class cls, Class cls2) {
        this.f16528a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jhi0)) {
            return false;
        }
        jhi0 jhi0Var = (jhi0) obj;
        return jhi0Var.f16528a.equals(this.f16528a) && jhi0Var.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.f16528a, this.b);
    }

    public final String toString() {
        return this.f16528a.getSimpleName() + " with serialization type: " + this.b.getSimpleName();
    }
}
