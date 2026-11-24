package a;

/* JADX INFO: loaded from: classes.dex */
public final class zbj extends zje {
    public Object i;
    public Object j;
    public Object k;
    public mie0 l;
    public ncj m;
    public /* synthetic */ Object n;
    public final /* synthetic */ acj o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbj(acj acjVar, zje zjeVar) {
        super(zjeVar);
        this.o = acjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(null, this);
    }
}
