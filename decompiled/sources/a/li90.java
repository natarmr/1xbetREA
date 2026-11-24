package a;

/* JADX INFO: loaded from: classes2.dex */
public final class li90 extends c3 {
    public final hi90 d;
    public int e;
    public lqs0 f;
    public int g;

    public li90(hi90 hi90Var, int i) {
        super(i, hi90Var.f, (byte) 0);
        this.d = hi90Var;
        this.e = hi90Var.h();
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
        hi90 hi90Var = this.d;
        hi90Var.add(i, obj);
        this.b++;
        this.c = hi90Var.b();
        this.e = hi90Var.h();
        this.g = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        hi90 hi90Var = this.d;
        Object[] objArr = hi90Var.d;
        if (objArr == null) {
            this.f = null;
            return;
        }
        int i = (hi90Var.f - 1) & (-32);
        int i2 = this.b;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (hi90Var.f13103a / 5) + 1;
        lqs0 lqs0Var = this.f;
        if (lqs0Var == null) {
            this.f = new lqs0(objArr, i2, i, i3);
            return;
        }
        lqs0Var.b = i2;
        lqs0Var.c = i;
        lqs0Var.d = i3;
        Object[] objArr2 = lqs0Var.e;
        if (objArr2.length < i3) {
            objArr2 = new Object[i3];
            lqs0Var.e = objArr2;
        }
        objArr2[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        lqs0Var.f = r0;
        lqs0Var.b(i2 - r0, 1);
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
        lqs0 lqs0Var = this.f;
        hi90 hi90Var = this.d;
        if (lqs0Var == null) {
            Object[] objArr = hi90Var.e;
            this.b = i + 1;
            return objArr[i];
        }
        if (lqs0Var.hasNext()) {
            this.b++;
            return lqs0Var.next();
        }
        Object[] objArr2 = hi90Var.e;
        int i2 = this.b;
        this.b = i2 + 1;
        return objArr2[i2 - lqs0Var.c];
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
        lqs0 lqs0Var = this.f;
        hi90 hi90Var = this.d;
        if (lqs0Var == null) {
            Object[] objArr = hi90Var.e;
            int i2 = i - 1;
            this.b = i2;
            return objArr[i2];
        }
        int i3 = lqs0Var.c;
        if (i <= i3) {
            this.b = i - 1;
            return lqs0Var.previous();
        }
        Object[] objArr2 = hi90Var.e;
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
        hi90 hi90Var = this.d;
        hi90Var.e(i);
        int i2 = this.g;
        if (i2 < this.b) {
            this.b = i2;
        }
        this.c = hi90Var.b();
        this.e = hi90Var.h();
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
        hi90 hi90Var = this.d;
        hi90Var.set(i, obj);
        this.e = hi90Var.h();
        b();
    }
}
