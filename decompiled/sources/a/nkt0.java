package a;

/* JADX INFO: loaded from: classes3.dex */
public final class nkt0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ dhu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nkt0(dhu dhuVar, zje zjeVar) {
        super(zjeVar);
        this.j = dhuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this, null, false);
    }
}
