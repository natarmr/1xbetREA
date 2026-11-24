package a;

/* JADX INFO: loaded from: classes2.dex */
public final class wss0 extends zje {
    public String i;
    public ouu j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ouu n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wss0(ouu ouuVar, zje zjeVar) {
        super(zjeVar);
        this.n = ouuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.A(null, this);
    }
}
