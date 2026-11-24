package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class wh90 implements Iterator, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39156a;
    public final xh90 b;

    public wh90(vh90 vh90Var, byte b) {
        this.f39156a = b;
        switch (b) {
            case 1:
                this.b = new xh90(vh90Var.b, vh90Var);
                break;
            case 2:
                this.b = new xh90(vh90Var.b, vh90Var);
                break;
            default:
                this.b = new xh90(vh90Var.b, vh90Var);
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.f39156a;
        xh90 xh90Var = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return xh90Var.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.f39156a;
        xh90 xh90Var = this.b;
        switch (b) {
            case 0:
                return new my40(xh90Var.b, xh90Var.c, xh90Var.next());
            case 1:
                xh90Var.next();
                return xh90Var.c;
            default:
                return xh90Var.next().f38853a;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.f39156a;
        xh90 xh90Var = this.b;
        switch (b) {
            case 0:
                xh90Var.remove();
                break;
            case 1:
                xh90Var.remove();
                break;
            default:
                xh90Var.remove();
                break;
        }
    }
}
