package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ob60 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ soc j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob60(soc socVar, zje zjeVar) {
        super(zjeVar);
        this.j = socVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this, null, false, false);
    }
}
