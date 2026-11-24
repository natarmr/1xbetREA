package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class w9y {
    public static final w9y d = new w9y(zlf0.STRICT, 6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zlf0 f38802a;
    public final fty b;
    public final zlf0 c;

    public w9y(zlf0 zlf0Var, int i) {
        this(zlf0Var, (i & 2) != 0 ? new fty(1, 0, 0) : null, zlf0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9y)) {
            return false;
        }
        w9y w9yVar = (w9y) obj;
        return this.f38802a == w9yVar.f38802a && Intrinsics.d(this.b, w9yVar.b) && this.c == w9yVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.f38802a.hashCode() * 31;
        fty ftyVar = this.b;
        return this.c.hashCode() + ((iHashCode + (ftyVar == null ? 0 : ftyVar.d)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f38802a + ", sinceVersion=" + this.b + ", reportLevelAfter=" + this.c + ')';
    }

    public w9y(zlf0 zlf0Var, fty ftyVar, zlf0 zlf0Var2) {
        this.f38802a = zlf0Var;
        this.b = ftyVar;
        this.c = zlf0Var2;
    }
}
