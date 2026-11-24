package a;

/* JADX INFO: loaded from: classes4.dex */
public final class oiu extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ yot k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oiu(yot yotVar, yje yjeVar) {
        super(yjeVar);
        this.k = yotVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
