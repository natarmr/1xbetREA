package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class uad implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35322a;
    public int b;
    public int c;
    public final /* synthetic */ xad d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ xad f;

    public uad(xad xadVar, byte b) {
        this.e = b;
        this.f = xadVar;
        this.d = xadVar;
        this.f35322a = xadVar.e;
        this.b = xadVar.isEmpty() ? -1 : 0;
        this.c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object wadVar;
        xad xadVar = this.d;
        if (xadVar.e != this.f35322a) {
            jf4.e();
            return null;
        }
        if (!hasNext()) {
            itt0.a();
            return null;
        }
        int i = this.b;
        this.c = i;
        byte b = this.e;
        xad xadVar2 = this.f;
        switch (b) {
            case 0:
                wadVar = xadVar2.k()[i];
                break;
            case 1:
                wadVar = new wad(xadVar2, i);
                break;
            default:
                wadVar = xadVar2.l()[i];
                break;
        }
        int i2 = this.b + 1;
        if (i2 >= xadVar.f) {
            i2 = -1;
        }
        this.b = i2;
        return wadVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        xad xadVar = this.d;
        if (xadVar.e != this.f35322a) {
            jf4.e();
            return;
        }
        x0x.J("no calls to next() since the last call to remove()", this.c >= 0);
        this.f35322a += 32;
        int i = this.c;
        Object obj = xad.j;
        xadVar.remove(xadVar.k()[i]);
        this.b--;
        this.c = -1;
    }
}
