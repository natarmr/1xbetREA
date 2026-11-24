package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class dpw0 extends hpw0 implements Serializable {
    public static final dpw0 b = new dpw0(0);
    public static final dpw0 c = new dpw0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6486a;

    public /* synthetic */ dpw0(byte b2) {
        this.f6486a = b2;
    }

    @Override // a.hpw0
    public final hpw0 a() {
        switch (this.f6486a) {
            case 0:
                return c;
            default:
                return b;
        }
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.f6486a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f6486a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
