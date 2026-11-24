package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ihi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f14781a;
    public final sg9 b;

    public ihi0(Class cls, sg9 sg9Var) {
        this.f14781a = cls;
        this.b = sg9Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ihi0)) {
            return false;
        }
        ihi0 ihi0Var = (ihi0) obj;
        return ihi0Var.f14781a.equals(this.f14781a) && ihi0Var.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.f14781a, this.b);
    }

    public final String toString() {
        return this.f14781a.getSimpleName() + ", object identifier: " + this.b;
    }
}
