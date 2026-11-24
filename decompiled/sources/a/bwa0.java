package a;

/* JADX INFO: loaded from: classes.dex */
public final class bwa0 extends awa0 {
    public final Object c;

    public bwa0(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // a.awa0
    public final Object a() {
        Object objA;
        synchronized (this.c) {
            objA = super.a();
        }
        return objA;
    }

    @Override // a.awa0
    public final boolean c(Object obj) {
        boolean zC;
        synchronized (this.c) {
            zC = super.c(obj);
        }
        return zC;
    }
}
