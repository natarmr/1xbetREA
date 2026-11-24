package a;

/* JADX INFO: loaded from: classes2.dex */
public final class g99 extends c3 {
    public final /* synthetic */ byte d = 1;
    public final Object e;

    public g99(Object obj, int i) {
        super(i, 1, (byte) 0);
        this.e = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                if (!hasNext()) {
                    itt0.a();
                    return null;
                }
                int i = this.b;
                this.b = i + 1;
                return ((Object[]) obj)[i];
            default:
                if (hasNext()) {
                    this.b++;
                    return obj;
                }
                itt0.a();
                return null;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                if (!hasPrevious()) {
                    itt0.a();
                    return null;
                }
                int i = this.b - 1;
                this.b = i;
                return ((Object[]) obj)[i];
            default:
                if (hasPrevious()) {
                    this.b--;
                    return obj;
                }
                itt0.a();
                return null;
        }
    }

    public g99(Object[] objArr, int i, int i2) {
        super(i, i2, (byte) 0);
        this.e = objArr;
    }
}
