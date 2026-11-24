package a;

/* JADX INFO: loaded from: classes.dex */
public final class hzk extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ jzk k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzk(jzk jzkVar, zje zjeVar) {
        super(zjeVar);
        this.k = jzkVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
