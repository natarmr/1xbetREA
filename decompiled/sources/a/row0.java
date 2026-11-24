package a;

/* JADX INFO: loaded from: classes2.dex */
public final class row0 extends eet0 {
    public static final Object c = new Object();
    public Object b;

    public row0(Object obj) {
        super((byte) 3);
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            this.b = obj2;
            return obj;
        }
        itt0.a();
        return null;
    }
}
