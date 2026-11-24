package a;

/* JADX INFO: loaded from: classes4.dex */
public final class w5w0 extends zje {
    public zg40 i;
    public b6w0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ b6w0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5w0(b6w0 b6w0Var, zje zjeVar) {
        super(zjeVar);
        this.l = b6w0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
