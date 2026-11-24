package a;

/* JADX INFO: loaded from: classes5.dex */
public final class tib extends zje {
    public boolean i;
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ajb l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tib(ajb ajbVar, zje zjeVar) {
        super(zjeVar);
        this.l = ajbVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.M(this);
    }
}
