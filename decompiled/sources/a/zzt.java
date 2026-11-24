package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzt extends zje {
    public ArrayList i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ nr l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(nr nrVar, zje zjeVar) {
        super(zjeVar);
        this.l = nrVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.t(this);
    }
}
