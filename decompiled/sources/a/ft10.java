package a;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class ft10 extends zje {
    public String[] i;
    public String[] j;
    public Collection k;
    public Collection l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ ot10 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft10(ot10 ot10Var, zje zjeVar) {
        super(zjeVar);
        this.p = ot10Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.k(this);
    }
}
