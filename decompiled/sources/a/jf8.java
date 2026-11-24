package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jf8 extends zje {
    public ArrayList i;
    public List j;
    public /* synthetic */ Object k;
    public final /* synthetic */ lf8 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf8(lf8 lf8Var, zje zjeVar) {
        super(zjeVar);
        this.l = lf8Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.R(null, null, this);
    }
}
