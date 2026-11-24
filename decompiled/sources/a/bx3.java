package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bx3 implements Iterator, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3357a;
    public int b;
    public boolean c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bx3(gx3 gx3Var, byte b) {
        this(gx3Var.c);
        this.d = b;
        switch (b) {
            case 1:
                this.e = gx3Var;
                this(gx3Var.c);
                break;
            default:
                this.e = gx3Var;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.f3357a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            itt0.a();
            return null;
        }
        int i = this.b;
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                objF = ((gx3) obj).f(i);
                break;
            case 1:
                objF = ((gx3) obj).j(i);
                break;
            default:
                objF = ((lx3) obj).b[i];
                break;
        }
        this.b++;
        this.c = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            jf4.n("Call next() before removing an element.");
            return;
        }
        int i = this.b - 1;
        this.b = i;
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((gx3) obj).g(i);
                break;
            case 1:
                ((gx3) obj).g(i);
                break;
            default:
                ((lx3) obj).b(i);
                break;
        }
        this.f3357a--;
        this.c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bx3(lx3 lx3Var) {
        this(lx3Var.c);
        this.d = (byte) 2;
        this.e = lx3Var;
    }

    public bx3(int i) {
        this.f3357a = i;
    }
}
