package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ul00 extends zje {
    public List i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ vl00 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul00(vl00 vl00Var, zje zjeVar) {
        super(zjeVar);
        this.l = vl00Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(this, null, false);
    }
}
