package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class s950 extends ia80 implements Serializable {
    public static final s950 b = new s950(0);
    public static final s950 c = new s950(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31838a;

    public /* synthetic */ s950(byte b2) {
        this.f31838a = b2;
    }

    @Override // a.ia80
    public final ia80 a() {
        switch (this.f31838a) {
            case 0:
                return c;
            default:
                return b;
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f31838a) {
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
        switch (this.f31838a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
