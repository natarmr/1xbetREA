package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pqs0 implements Iterator, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27430a;
    public Object[] b;
    public int c;
    public int d;

    public pqs0(byte b) {
        this.f27430a = b;
        switch (b) {
            case 1:
                this.b = oqs0.e.d;
                break;
            default:
                this.b = nqs0.e.d;
                break;
        }
    }

    public void a(Object[] objArr, int i, int i2) {
        this.b = objArr;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f27430a) {
            case 0:
                return this.d < this.c;
            default:
                return this.d < this.c;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f27430a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
