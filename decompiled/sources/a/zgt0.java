package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class zgt0 extends zje {
    public wdr i;
    public Function0 j;
    public float k;
    public /* synthetic */ Object l;
    public final /* synthetic */ aht0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgt0(aht0 aht0Var, zje zjeVar) {
        super(zjeVar);
        this.m = aht0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, null, this);
    }
}
