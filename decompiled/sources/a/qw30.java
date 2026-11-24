package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qw30 extends zje {
    public lv30 i;
    public List j;
    public /* synthetic */ Object k;
    public final /* synthetic */ xw30 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw30(xw30 xw30Var, zje zjeVar) {
        super(zjeVar);
        this.l = xw30Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
