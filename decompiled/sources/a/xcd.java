package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class xcd extends ia80 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l13 f40641a;

    public xcd(l13 l13Var) {
        this.f40641a = l13Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f40641a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof xcd) && this.f40641a == ((xcd) obj).f40641a;
    }

    public final int hashCode() {
        return this.f40641a.hashCode();
    }

    public final String toString() {
        return this.f40641a.toString();
    }
}
