package a;

/* JADX INFO: loaded from: classes4.dex */
public final class sdn0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ y3v j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sdn0(y3v y3vVar, zje zjeVar) {
        super(zjeVar);
        this.j = y3vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.y(this);
    }
}
