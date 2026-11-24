package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zh90 implements Iterator, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44382a;
    public final ai90 b;

    public zh90(uh90 uh90Var, byte b) {
        this.f44382a = b;
        switch (b) {
            case 1:
                this.b = new ai90(uh90Var.d, uh90Var.f, (byte) 0);
                break;
            case 2:
                this.b = new ai90(uh90Var.d, uh90Var.f, (byte) 0);
                break;
            default:
                this.b = new ai90(uh90Var.d, uh90Var.f, (byte) 0);
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.f44382a;
        ai90 ai90Var = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return ai90Var.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.f44382a;
        ai90 ai90Var = this.b;
        switch (b) {
            case 0:
                return new oo20(ai90Var.b, ai90Var.a().f38853a, (byte) 1);
            case 1:
                Object obj = ai90Var.b;
                ai90Var.a();
                return obj;
            default:
                return ai90Var.a().f38853a;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f44382a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
