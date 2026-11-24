package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class uv70 extends zje {
    public int i;
    public Function1 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ wv70 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv70(wv70 wv70Var, zje zjeVar) {
        super(zjeVar);
        this.l = wv70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.n(0, this);
    }
}
