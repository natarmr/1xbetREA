package a;

/* JADX INFO: loaded from: classes.dex */
public final class kox extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ lox j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kox(lox loxVar, zje zjeVar) {
        super(zjeVar);
        this.j = loxVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
