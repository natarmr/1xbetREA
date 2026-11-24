package a;

/* JADX INFO: loaded from: classes.dex */
public final class z230 extends zje {
    public aw20 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ pyu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z230(pyu pyuVar, zje zjeVar) {
        super(zjeVar);
        this.k = pyuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.o(null, this);
    }
}
