package a;

/* JADX INFO: loaded from: classes.dex */
public final class zw9 extends zje {
    public String i;
    public jzj j;
    public /* synthetic */ Object k;
    public final /* synthetic */ cx9 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw9(cx9 cx9Var, zje zjeVar) {
        super(zjeVar);
        this.l = cx9Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
