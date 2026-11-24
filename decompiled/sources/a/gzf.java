package a;

/* JADX INFO: loaded from: classes2.dex */
public final class gzf extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ jzf j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzf(jzf jzfVar, zje zjeVar) {
        super(zjeVar);
        this.j = jzfVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(this);
    }
}
