package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bu5 extends zje {
    public List i;
    public String j;
    public String k;
    public cu5 l;
    public int m;
    public boolean n;
    public /* synthetic */ Object o;
    public final /* synthetic */ cu5 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu5(cu5 cu5Var, zje zjeVar) {
        super(zjeVar);
        this.p = cu5Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.t(null, 0, null, false, this);
    }
}
