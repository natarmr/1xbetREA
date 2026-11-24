package a;

/* JADX INFO: loaded from: classes.dex */
public final class ko00 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ pyu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko00(pyu pyuVar, zje zjeVar) {
        super(zjeVar);
        this.j = pyuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.h(null, this);
    }
}
