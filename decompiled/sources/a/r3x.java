package a;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r3x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f29807a;
    public int b;
    public boolean c;

    public r3x(int i) {
        e3c.s(i, "initialCapacity");
        this.f29807a = new Object[i];
        this.b = 0;
    }

    public static int e(int i, int i2) {
        if (i2 < 0) {
            jf4.o("cannot store more than Integer.MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public r3x a(Object obj) {
        b(obj);
        return this;
    }

    public final void b(Object obj) {
        obj.getClass();
        d(1);
        Object[] objArr = this.f29807a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public final void c(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            d(collection.size());
            if (collection instanceof s3x) {
                this.b = ((s3x) collection).e(this.b, this.f29807a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final void d(int i) {
        Object[] objArr = this.f29807a;
        int iE = e(objArr.length, this.b + i);
        if (iE > objArr.length || this.c) {
            this.f29807a = Arrays.copyOf(this.f29807a, iE);
            this.c = false;
        }
    }
}
