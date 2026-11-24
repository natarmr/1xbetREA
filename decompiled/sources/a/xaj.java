package a;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class xaj extends zje {
    public Serializable i;
    public Iterator j;
    public /* synthetic */ Object k;
    public final /* synthetic */ kwd l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xaj(kwd kwdVar, zje zjeVar) {
        super(zjeVar);
        this.l = kwdVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.f(null, null, this);
    }
}
