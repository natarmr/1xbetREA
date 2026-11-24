package a;

/* JADX INFO: loaded from: classes4.dex */
public final class tit extends zje {
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ zri l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tit(zri zriVar, zje zjeVar) {
        super(zjeVar);
        this.l = zriVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.i(0, this);
    }
}
