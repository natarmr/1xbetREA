package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o7f extends zje {
    public ArrayList i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ r7f l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7f(r7f r7fVar, zje zjeVar) {
        super(zjeVar);
        this.l = r7fVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.s0(this, null, false);
    }
}
