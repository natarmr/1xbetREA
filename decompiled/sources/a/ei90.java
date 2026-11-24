package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ei90 extends ai90 {
    public final di90 e;
    public Object f;
    public boolean g;
    public int h;

    /* JADX WARN: Illegal instructions before constructor call */
    public ei90(di90 di90Var) {
        Object obj = di90Var.b;
        gh90 gh90Var = di90Var.d;
        super(obj, gh90Var, (byte) 1);
        this.e = di90Var;
        this.h = gh90Var.e;
    }

    @Override // a.ai90, java.util.Iterator
    public final Object next() {
        if (this.e.d.e != this.h) {
            jf4.e();
            return null;
        }
        Object next = super.next();
        this.f = next;
        this.g = true;
        return next;
    }

    @Override // a.ai90, java.util.Iterator
    public final void remove() {
        if (!this.g) {
            v4i0.e();
            return;
        }
        Object obj = this.f;
        di90 di90Var = this.e;
        zys0.a(di90Var).remove(obj);
        this.f = null;
        this.g = false;
        this.h = di90Var.d.e;
        this.d--;
    }
}
