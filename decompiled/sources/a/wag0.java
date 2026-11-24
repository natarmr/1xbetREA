package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class wag0 extends ia80 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia80 f38824a;

    public wag0(ia80 ia80Var) {
        this.f38824a = ia80Var;
    }

    @Override // a.ia80
    public final ia80 a() {
        return this.f38824a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f38824a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wag0) {
            return this.f38824a.equals(((wag0) obj).f38824a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f38824a.hashCode();
    }

    public final String toString() {
        return this.f38824a + ".reverse()";
    }
}
