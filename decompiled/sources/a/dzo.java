package a;

/* JADX INFO: loaded from: classes4.dex */
public final class dzo extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ abk j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzo(abk abkVar, yje yjeVar) {
        super(yjeVar);
        this.j = abkVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(false, this);
    }
}
