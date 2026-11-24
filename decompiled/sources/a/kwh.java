package a;

/* JADX INFO: loaded from: classes6.dex */
public final class kwh extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ lwh j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kwh(lwh lwhVar, zje zjeVar) {
        super(zjeVar);
        this.j = lwhVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.M(this);
    }
}
