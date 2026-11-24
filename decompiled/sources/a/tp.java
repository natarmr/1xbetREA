package a;

/* JADX INFO: loaded from: classes4.dex */
public final class tp extends zje {
    public m0k0 i;
    public lvj0 j;
    public gwe k;
    public ic9 l;
    public int m;
    public boolean n;
    public /* synthetic */ Object o;
    public final /* synthetic */ chf0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp(chf0 chf0Var, zje zjeVar) {
        super(zjeVar);
        this.p = chf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.O(null, null, 0, null, false, null, this);
    }
}
