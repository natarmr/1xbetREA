package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class z16 extends zje {
    public qpg0 i;
    public Iterator j;
    public /* synthetic */ Object k;
    public final /* synthetic */ tdg0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z16(tdg0 tdg0Var, zje zjeVar) {
        super(zjeVar);
        this.l = tdg0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.h(null, this);
    }
}
