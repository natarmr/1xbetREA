package a;

/* JADX INFO: loaded from: classes2.dex */
public final class x5t extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ uyn j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5t(uyn uynVar, zje zjeVar) {
        super(zjeVar);
        this.j = uynVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(null, this);
    }
}
