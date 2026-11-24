package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xit0 extends zje {
    public List i;
    public Collection j;
    public Iterator k;
    public ArrayList l;
    public Collection m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ vit0 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xit0(vit0 vit0Var, zje zjeVar) {
        super(zjeVar);
        this.s = vit0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.c(null, null, false, this);
    }
}
