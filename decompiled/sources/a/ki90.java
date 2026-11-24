package a;

/* JADX INFO: loaded from: classes.dex */
public final class ki90 extends c3 {
    public final Object[] d;
    public final mqs0 e;

    public ki90(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2, (byte) 1);
        this.d = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.e = new mqs0(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            itt0.a();
            return null;
        }
        mqs0 mqs0Var = this.e;
        if (mqs0Var.hasNext()) {
            this.b++;
            return mqs0Var.next();
        }
        int i = this.b;
        this.b = i + 1;
        return this.d[i - mqs0Var.c];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            itt0.a();
            return null;
        }
        int i = this.b;
        mqs0 mqs0Var = this.e;
        int i2 = mqs0Var.c;
        if (i <= i2) {
            this.b = i - 1;
            return mqs0Var.previous();
        }
        int i3 = i - 1;
        this.b = i3;
        return this.d[i3 - i2];
    }
}
