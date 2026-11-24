package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class kcj extends zje {
    public boolean i;
    public Object j;
    public mie0 k;
    public Serializable l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ ncj o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcj(ncj ncjVar, zje zjeVar) {
        super(zjeVar);
        this.o = ncjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.h(false, this);
    }
}
