package a;

/* JADX INFO: loaded from: classes2.dex */
public final class fzx extends eet0 {
    public final Object b;
    public boolean c;

    public fzx(Object obj) {
        super((byte) 0);
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c) {
            itt0.a();
            return null;
        }
        this.c = true;
        return this.b;
    }
}
