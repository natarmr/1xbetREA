package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class nl60 extends zje {
    public kmq i;
    public Iterator j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ol60 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl60(ol60 ol60Var, yje yjeVar) {
        super(yjeVar);
        this.l = ol60Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        this.l.c(null, this);
        return wne.f39444a;
    }
}
