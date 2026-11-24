package a;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gdd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final edd f11100a = new edd();
    public static final fdd b = new fdd(-1);
    public static final fdd c = new fdd(1);

    public gdd a(int i, int i2) {
        return edd.f(Integer.compare(i, i2));
    }

    public gdd b(Object obj, Object obj2, Comparator comparator) {
        return edd.f(comparator.compare(obj, obj2));
    }

    public gdd c(boolean z, boolean z2) {
        return edd.f(Boolean.compare(z, z2));
    }

    public gdd d(boolean z, boolean z2) {
        return edd.f(Boolean.compare(z2, z));
    }

    public int e() {
        return 0;
    }
}
