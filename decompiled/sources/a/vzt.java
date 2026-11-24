package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class vzt extends zje {
    public long i;
    public boolean j;
    public boolean k;
    public q4f l;
    public List m;
    public /* synthetic */ Object n;
    public final /* synthetic */ phf0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vzt(phf0 phf0Var, zje zjeVar) {
        super(zjeVar);
        this.o = phf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.s(0L, false, false, this);
    }
}
