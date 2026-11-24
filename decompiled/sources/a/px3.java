package a;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class px3 extends b3 implements RandomAccess {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    public /* synthetic */ px3(Object obj, byte b) {
        this.b = b;
        this.c = obj;
    }

    @Override // a.u1
    public final int b() {
        switch (this.b) {
            case 0:
                return ((int[]) this.c).length;
            default:
                return ((long[]) this.c).length;
        }
    }

    @Override // a.u1, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        byte b = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                if (!(obj instanceof Integer)) {
                    return false;
                }
                return tx3.w((int[]) obj2, ((Number) obj).intValue());
            default:
                if (!(obj instanceof Long)) {
                    return false;
                }
                return tx3.x((long[]) obj2, ((Number) obj).longValue());
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                return Integer.valueOf(((int[]) obj)[i]);
            default:
                return Long.valueOf(((long[]) obj)[i]);
        }
    }

    @Override // a.b3, java.util.List
    public final int indexOf(Object obj) {
        byte b = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                if (!(obj instanceof Integer)) {
                    return -1;
                }
                return tx3.I((int[]) obj2, ((Number) obj).intValue());
            default:
                if (!(obj instanceof Long)) {
                    return -1;
                }
                return tx3.J((long[]) obj2, ((Number) obj).longValue());
        }
    }

    @Override // a.u1, java.util.Collection
    public final boolean isEmpty() {
        switch (this.b) {
            case 0:
                return ((int[]) this.c).length == 0;
            default:
                return ((long[]) this.c).length == 0;
        }
    }

    @Override // a.b3, java.util.List
    public final int lastIndexOf(Object obj) {
        byte b = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                if (!(obj instanceof Integer)) {
                    return -1;
                }
                int iIntValue = ((Number) obj).intValue();
                int[] iArr = (int[]) obj2;
                iArr.getClass();
                int length = iArr.length - 1;
                if (length < 0) {
                    return -1;
                }
                while (true) {
                    int i = length - 1;
                    if (iIntValue == iArr[length]) {
                        return length;
                    }
                    if (i < 0) {
                        return -1;
                    }
                    length = i;
                }
                break;
            default:
                if (!(obj instanceof Long)) {
                    return -1;
                }
                long jLongValue = ((Number) obj).longValue();
                long[] jArr = (long[]) obj2;
                jArr.getClass();
                int length2 = jArr.length - 1;
                if (length2 < 0) {
                    return -1;
                }
                while (true) {
                    int i2 = length2 - 1;
                    if (jLongValue == jArr[length2]) {
                        return length2;
                    }
                    if (i2 < 0) {
                        return -1;
                    }
                    length2 = i2;
                }
                break;
        }
    }
}
