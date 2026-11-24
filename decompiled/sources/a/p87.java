package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p87 extends zje {
    public List i;
    public List j;
    public List k;
    public boolean l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ f97 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p87(f97 f97Var, zje zjeVar) {
        super(zjeVar);
        this.o = f97Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.V(this);
    }
}
