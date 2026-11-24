package a;

/* JADX INFO: loaded from: classes3.dex */
public final class mou extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ nou j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mou(nou nouVar, yje yjeVar) {
        super(yjeVar);
        this.j = nouVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
