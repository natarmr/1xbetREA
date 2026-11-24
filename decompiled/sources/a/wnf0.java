package a;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class wnf0 extends zje {
    public Iterator i;
    public Map.Entry j;
    public rei0 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ vpc m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnf0(vpc vpcVar, zje zjeVar) {
        super(zjeVar);
        this.m = vpcVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(this);
    }
}
