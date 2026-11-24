package a;

/* JADX INFO: loaded from: classes5.dex */
public final class swc extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ twc j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swc(twc twcVar, zje zjeVar) {
        super(zjeVar);
        this.j = twcVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0, this);
    }
}
