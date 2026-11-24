package a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zgf0 extends zje {
    public List i;
    public Iterator j;
    public /* synthetic */ Object k;
    public final /* synthetic */ wdu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgf0(wdu wduVar, zje zjeVar) {
        super(zjeVar);
        this.l = wduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.d(null, this);
    }
}
