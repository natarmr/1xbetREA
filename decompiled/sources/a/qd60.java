package a;

/* JADX INFO: loaded from: classes4.dex */
public final class qd60 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ i5u k;
    public kmq l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd60(i5u i5uVar, yje yjeVar) {
        super(yjeVar);
        this.k = i5uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
