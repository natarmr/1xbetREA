package a;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class inw0 extends hpw0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f15093a;

    public inw0(Comparator comparator) {
        comparator.getClass();
        this.f15093a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f15093a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof inw0) {
            return this.f15093a.equals(((inw0) obj).f15093a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15093a.hashCode();
    }

    public final String toString() {
        return this.f15093a.toString();
    }
}
