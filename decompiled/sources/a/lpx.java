package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class lpx extends zje {
    public g0f i;
    public Iterator j;
    public q88 k;
    public double l;
    public /* synthetic */ Object m;
    public final /* synthetic */ dgu n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpx(dgu dguVar, zje zjeVar) {
        super(zjeVar);
        this.n = dguVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.z(null, this);
    }
}
