package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class kmk0 implements pld, Iterable, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q9k0 f18544a;
    public final int b;
    public final aff0 c;

    public kmk0(q9k0 q9k0Var, int i, het hetVar, aff0 aff0Var) {
        this.f18544a = q9k0Var;
        this.b = i;
        this.c = aff0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kmk0)) {
            return false;
        }
        kmk0 kmk0Var = (kmk0) obj;
        return kmk0Var.b == this.b && kmk0Var.f18544a == this.f18544a && kmk0Var.c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.f18544a.hashCode() + (this.b * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new jmk0(this.f18544a, this.b, null, this.c);
    }
}
