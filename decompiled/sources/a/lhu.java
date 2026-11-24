package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class lhu extends zje {
    public ucq i;
    public ArrayList j;
    public ArrayList k;
    public /* synthetic */ Object l;
    public final /* synthetic */ mhu m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhu(mhu mhuVar, zje zjeVar) {
        super(zjeVar);
        this.m = mhuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, null, this);
    }
}
