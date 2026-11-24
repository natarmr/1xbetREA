package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ji90 extends c3 {
    public final Object[] d;
    public final lqs0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji90(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2, (byte) 0);
        objArr.getClass();
        objArr2.getClass();
        this.d = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.e = new lqs0(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            itt0.a();
            return null;
        }
        lqs0 lqs0Var = this.e;
        if (lqs0Var.hasNext()) {
            this.b++;
            return lqs0Var.next();
        }
        int i = this.b;
        this.b = i + 1;
        return this.d[i - lqs0Var.c];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            itt0.a();
            return null;
        }
        int i = this.b;
        lqs0 lqs0Var = this.e;
        int i2 = lqs0Var.c;
        if (i <= i2) {
            this.b = i - 1;
            return lqs0Var.previous();
        }
        int i3 = i - 1;
        this.b = i3;
        return this.d[i3 - i2];
    }
}
