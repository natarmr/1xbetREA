package a;

import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
public final class d8w0 extends zje {
    public Request.Builder i;
    public Request.Builder j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ owp0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8w0(owp0 owp0Var, zje zjeVar) {
        super(zjeVar);
        this.m = owp0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.f(null, 0, 0, null, 0L, null, 0, 0, null, this);
    }
}
