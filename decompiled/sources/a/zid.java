package a;

/* JADX INFO: loaded from: classes3.dex */
public final class zid extends zje {
    public d0t i;
    public ctc j;
    public aud k;
    public /* synthetic */ Object l;
    public final /* synthetic */ hjd m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zid(hjd hjdVar, zje zjeVar) {
        super(zjeVar);
        this.m = hjdVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.i(null, null, null, null, this);
    }
}
