package a;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class zcb extends zje {
    public LinkedHashMap i;
    public ArrayList j;
    public /* synthetic */ Object k;
    public final /* synthetic */ khf0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zcb(khf0 khf0Var, zje zjeVar) {
        super(zjeVar);
        this.l = khf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.q(null, this);
    }
}
