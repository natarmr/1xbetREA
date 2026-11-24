package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ve20 extends zje {
    public long i;
    public double j;
    public double k;
    public boolean l;
    public ArrayList m;
    public /* synthetic */ Object n;
    public final /* synthetic */ qg20 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve20(qg20 qg20Var, zje zjeVar) {
        super(zjeVar);
        this.o = qg20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.F(0L, 0.0d, 0.0d, false, null, this);
    }
}
