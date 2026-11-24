package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vl7 extends zje {
    public List i;
    public List j;
    public List k;
    public boolean l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ fm7 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl7(fm7 fm7Var, zje zjeVar) {
        super(zjeVar);
        this.o = fm7Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.P(this);
    }
}
