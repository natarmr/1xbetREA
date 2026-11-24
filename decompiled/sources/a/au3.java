package a;

/* JADX INFO: loaded from: classes3.dex */
public final class au3 extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ zu3 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au3(zu3 zu3Var, zje zjeVar) {
        super(zjeVar);
        this.k = zu3Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.x(false, false, this);
    }
}
