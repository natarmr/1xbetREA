package a;

/* JADX INFO: loaded from: classes3.dex */
public final class lnt0 extends zje {
    public sd60 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ sd60 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnt0(sd60 sd60Var, zje zjeVar) {
        super(zjeVar);
        this.k = sd60Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.h(this);
    }
}
