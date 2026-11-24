package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class uzn extends zje {
    public qpg0 i;
    public Iterator j;
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ wti m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzn(wti wtiVar, zje zjeVar) {
        super(zjeVar);
        this.m = wtiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.D(null, null, this);
    }
}
