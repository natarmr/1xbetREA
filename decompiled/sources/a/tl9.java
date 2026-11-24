package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tl9 extends zje {
    public List i;
    public o4g j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ul9 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl9(ul9 ul9Var, zje zjeVar) {
        super(zjeVar);
        this.l = ul9Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.g(null, this);
    }
}
