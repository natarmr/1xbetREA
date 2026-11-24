package a;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class xh90 implements Iterator, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f40879a;
    public final vh90 b;
    public Object c = ujn.k;
    public boolean d;
    public int e;
    public int f;

    public xh90(Object obj, vh90 vh90Var) {
        this.f40879a = obj;
        this.b = vh90Var;
        this.e = vh90Var.d.f;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wb00 next() {
        gh90 gh90Var = this.b.d;
        if (gh90Var.f != this.e) {
            jf4.e();
            return null;
        }
        if (!hasNext()) {
            itt0.a();
            return null;
        }
        Object obj = this.f40879a;
        this.c = obj;
        this.d = true;
        this.f++;
        Object obj2 = gh90Var.get(obj);
        if (obj2 != null) {
            wb00 wb00Var = (wb00) obj2;
            this.f40879a = wb00Var.c;
            return wb00Var;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.f40879a + ") has changed after it was added to the persistent map.");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f < this.b.d.c();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            v4i0.e();
            return;
        }
        Object obj = this.c;
        vh90 vh90Var = this.b;
        zys0.c(vh90Var).remove(obj);
        this.c = null;
        this.d = false;
        this.e = vh90Var.d.f;
        this.f--;
    }
}
