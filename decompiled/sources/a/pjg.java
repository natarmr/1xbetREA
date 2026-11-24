package a;

/* JADX INFO: loaded from: classes4.dex */
public final class pjg extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ qjg j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjg(qjg qjgVar, zje zjeVar) {
        super(zjeVar);
        this.j = qjgVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, 0, 0, null, this);
    }
}
