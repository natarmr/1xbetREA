package a;

/* JADX INFO: loaded from: classes.dex */
public final class rtt extends zje {
    public int i;
    public hf6 j;
    public float k;
    public /* synthetic */ Object l;
    public final /* synthetic */ rq m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtt(rq rqVar, zje zjeVar) {
        super(zjeVar);
        this.m = rqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(0, this);
    }
}
