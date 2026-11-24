package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class nzn0 extends zje {
    public ArrayList i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ frc m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzn0(frc frcVar, zje zjeVar) {
        super(zjeVar);
        this.m = frcVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(this);
    }
}
