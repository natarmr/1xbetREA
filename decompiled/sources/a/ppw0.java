package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ppw0 extends hpw0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hpw0 f27392a;

    public ppw0(hpw0 hpw0Var) {
        this.f27392a = hpw0Var;
    }

    @Override // a.hpw0
    public final hpw0 a() {
        return this.f27392a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f27392a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ppw0) {
            return this.f27392a.equals(((ppw0) obj).f27392a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f27392a.hashCode();
    }

    public final String toString() {
        return this.f27392a.toString().concat(".reverse()");
    }
}
