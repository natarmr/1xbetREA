package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class w5w extends zje {
    public Function1 i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ x5w l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5w(x5w x5wVar, zje zjeVar) {
        super(zjeVar);
        this.l = x5wVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.j(null, this);
    }
}
