package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ryk0 extends zje {
    public List i;
    public tyk0 j;
    public boolean k;
    public boolean l;
    public double m;
    public /* synthetic */ Object n;
    public final /* synthetic */ tyk0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryk0(tyk0 tyk0Var, zje zjeVar) {
        super(zjeVar);
        this.o = tyk0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.A(null, this);
    }
}
