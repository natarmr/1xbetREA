package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zj3 extends zje {
    public String i;
    public LinkedHashMap j;
    public /* synthetic */ Object k;
    public final /* synthetic */ lhf0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj3(lhf0 lhf0Var, zje zjeVar) {
        super(zjeVar);
        this.l = lhf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.L(null, null, this);
    }
}
