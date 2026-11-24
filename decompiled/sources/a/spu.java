package a;

/* JADX INFO: loaded from: classes6.dex */
public final class spu extends zje {
    public byte i;
    public int j;
    public short k;
    public pou l;
    public /* synthetic */ Object m;
    public final /* synthetic */ dgu n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spu(dgu dguVar, zje zjeVar) {
        super(zjeVar);
        this.n = dguVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.q(0, 0, 0L, this);
    }
}
