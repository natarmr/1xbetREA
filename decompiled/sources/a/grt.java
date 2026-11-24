package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class grt extends zje {
    public ed5 i;
    public iy3 j;
    public oe5 k;
    public ArrayList l;
    public /* synthetic */ Object m;
    public final /* synthetic */ wti n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grt(wti wtiVar, zje zjeVar) {
        super(zjeVar);
        this.n = wtiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.o(null, null, this);
    }
}
