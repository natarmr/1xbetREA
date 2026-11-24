package a;

/* JADX INFO: loaded from: classes.dex */
public final class h99 extends c3 {
    public final /* synthetic */ byte d = 1;
    public final Object e;

    public h99(Object[] objArr, int i, int i2) {
        super(i, i2, (byte) 1);
        this.e = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case 0:
                if (!hasNext()) {
                    itt0.a();
                    return null;
                }
                Object[] objArr = (Object[]) this.e;
                int i = this.b;
                this.b = i + 1;
                return objArr[i];
            default:
                if (hasNext()) {
                    this.b++;
                    return this.e;
                }
                itt0.a();
                return null;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.d) {
            case 0:
                if (!hasPrevious()) {
                    itt0.a();
                    return null;
                }
                Object[] objArr = (Object[]) this.e;
                int i = this.b - 1;
                this.b = i;
                return objArr[i];
            default:
                if (hasPrevious()) {
                    this.b--;
                    return this.e;
                }
                itt0.a();
                return null;
        }
    }

    public h99(Object obj, int i) {
        super(i, 1, (byte) 1);
        this.e = obj;
    }
}
