package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class usu0 extends zje {
    public String i;
    public cmt0 j;
    public usu0 k;
    public Throwable l;
    public long m;
    public long n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ cmt0 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usu0(cmt0 cmt0Var, zje zjeVar) {
        super(zjeVar);
        this.s = cmt0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        Serializable serializableB = this.s.b(null, this);
        return serializableB == wne.f39444a ? serializableB : new j0g0(serializableB);
    }
}
