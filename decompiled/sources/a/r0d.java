package a;

/* JADX INFO: loaded from: classes.dex */
public final class r0d extends zje {
    public ibe0 i;
    public o1x j;
    public String k;
    public odd l;
    public /* synthetic */ Object m;
    public final /* synthetic */ s0d n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0d(s0d s0dVar, zje zjeVar) {
        super(zjeVar);
        this.n = s0dVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, this);
    }
}
