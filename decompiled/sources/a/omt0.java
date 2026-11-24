package a;

/* JADX INFO: loaded from: classes2.dex */
public final class omt0 extends zje {
    public aja i;
    public /* synthetic */ Object j;
    public final /* synthetic */ afm0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omt0(afm0 afm0Var, zje zjeVar) {
        super(zjeVar);
        this.k = afm0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.m(0L, 0L, this);
    }
}
