package a;

/* JADX INFO: loaded from: classes.dex */
public final class c04 extends zje {
    public f04 i;
    public ll80 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ d04 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c04(d04 d04Var, zje zjeVar) {
        super(zjeVar);
        this.l = d04Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(null, this);
    }
}
