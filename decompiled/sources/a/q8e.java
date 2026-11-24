package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class q8e extends zje {
    public pei0 i;
    public gxb j;
    public ArrayList k;
    public Collection l;
    public Iterator m;
    public /* synthetic */ Object n;
    public final /* synthetic */ g45 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8e(g45 g45Var, zje zjeVar) {
        super(zjeVar);
        this.o = g45Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.O(null, null, this);
    }
}
