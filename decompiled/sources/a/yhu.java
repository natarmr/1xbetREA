package a;

/* JADX INFO: loaded from: classes2.dex */
public final class yhu extends zje {
    public boolean i;
    public boolean j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ diu m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhu(diu diuVar, zje zjeVar) {
        super(zjeVar);
        this.m = diuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(false, false, false, this);
    }
}
