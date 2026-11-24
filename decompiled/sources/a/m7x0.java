package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class m7x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f21341a;
    public final Class b;

    public m7x0(Class cls, Class cls2) {
        this.f21341a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m7x0)) {
            return false;
        }
        m7x0 m7x0Var = (m7x0) obj;
        return m7x0Var.f21341a.equals(this.f21341a) && m7x0Var.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.f21341a, this.b);
    }

    public final String toString() {
        return kng0.l(this.f21341a.getSimpleName(), " with primitive type: ", this.b.getSimpleName());
    }
}
