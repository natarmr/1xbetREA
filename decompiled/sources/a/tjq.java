package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class tjq extends zje {
    public ArrayList i;
    public ArrayList j;
    public /* synthetic */ Object k;
    public final /* synthetic */ vjq l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjq(vjq vjqVar, zje zjeVar) {
        super(zjeVar);
        this.l = vjqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(this);
    }
}
