package a;

/* JADX INFO: loaded from: classes.dex */
public final class mi90 extends c3 {
    public final ii90 d;
    public int e;
    public mqs0 f;
    public int g;

    public mi90(ii90 ii90Var, int i) {
        super(i, ii90Var.h, (byte) 1);
        this.d = ii90Var;
        this.e = ii90Var.h();
        this.g = -1;
        b();
    }

    public final void a() {
        if (this.e == this.d.h()) {
            return;
        }
        jf4.e();
    }

    @Override // a.c3, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.b;
        ii90 ii90Var = this.d;
        ii90Var.add(i, obj);
        this.b++;
        this.c = ii90Var.b();
        this.e = ii90Var.h();
        this.g = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        ii90 ii90Var = this.d;
        Object[] objArr = ii90Var.f;
        if (objArr == null) {
            this.f = null;
            return;
        }
        int i = (ii90Var.h - 1) & (-32);
        int i2 = this.b;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (ii90Var.d / 5) + 1;
        mqs0 mqs0Var = this.f;
        if (mqs0Var == null) {
            this.f = new mqs0(objArr, i2, i, i3);
            return;
        }
        mqs0Var.b = i2;
        mqs0Var.c = i;
        mqs0Var.d = i3;
        Object[] objArr2 = mqs0Var.e;
        if (objArr2.length < i3) {
            objArr2 = new Object[i3];
            mqs0Var.e = objArr2;
        }
        objArr2[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        mqs0Var.f = r0;
        mqs0Var.b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            itt0.a();
            return null;
        }
        int i = this.b;
        this.g = i;
        mqs0 mqs0Var = this.f;
        ii90 ii90Var = this.d;
        if (mqs0Var == null) {
            Object[] objArr = ii90Var.g;
            this.b = i + 1;
            return objArr[i];
        }
        if (mqs0Var.hasNext()) {
            this.b++;
            return mqs0Var.next();
        }
        Object[] objArr2 = ii90Var.g;
        int i2 = this.b;
        this.b = i2 + 1;
        return objArr2[i2 - mqs0Var.c];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            itt0.a();
            return null;
        }
        int i = this.b;
        this.g = i - 1;
        mqs0 mqs0Var = this.f;
        ii90 ii90Var = this.d;
        if (mqs0Var == null) {
            Object[] objArr = ii90Var.g;
            int i2 = i - 1;
            this.b = i2;
            return objArr[i2];
        }
        int i3 = mqs0Var.c;
        if (i <= i3) {
            this.b = i - 1;
            return mqs0Var.previous();
        }
        Object[] objArr2 = ii90Var.g;
        int i4 = i - 1;
        this.b = i4;
        return objArr2[i4 - i3];
    }

    @Override // a.c3, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.g;
        if (i == -1) {
            v4i0.e();
            return;
        }
        ii90 ii90Var = this.d;
        ii90Var.e(i);
        int i2 = this.g;
        if (i2 < this.b) {
            this.b = i2;
        }
        this.c = ii90Var.b();
        this.e = ii90Var.h();
        this.g = -1;
        b();
    }

    @Override // a.c3, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.g;
        if (i == -1) {
            v4i0.e();
            return;
        }
        ii90 ii90Var = this.d;
        ii90Var.set(i, obj);
        this.e = ii90Var.h();
        b();
    }
}
