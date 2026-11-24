package a;

/* JADX INFO: loaded from: classes3.dex */
public final class w2u extends zje {
    public int i;
    public int j;
    public cyu k;
    public /* synthetic */ Object l;
    public final /* synthetic */ hsj m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2u(hsj hsjVar, zje zjeVar) {
        super(zjeVar);
        this.m = hsjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.n(0, this);
    }
}
