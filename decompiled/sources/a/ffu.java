package a;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class ffu extends zje {
    public Collection i;
    public Iterator j;
    public /* synthetic */ Object k;
    public final /* synthetic */ a6u l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffu(a6u a6uVar, zje zjeVar) {
        super(zjeVar);
        this.l = a6uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(this);
    }
}
