package a;

/* JADX INFO: loaded from: classes4.dex */
public final class jbu extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ lbu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbu(lbu lbuVar, zje zjeVar) {
        super(zjeVar);
        this.j = lbuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(this);
    }
}
