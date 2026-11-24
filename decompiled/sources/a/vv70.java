package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class vv70 extends zje {
    public bqu i;
    public List j;
    public /* synthetic */ Object k;
    public final /* synthetic */ wv70 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv70(wv70 wv70Var, zje zjeVar) {
        super(zjeVar);
        this.l = wv70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.o(this);
    }
}
