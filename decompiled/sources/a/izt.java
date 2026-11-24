package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class izt extends zje {
    public boolean A;
    public int B;
    public int Y;
    public int Z;
    public /* synthetic */ Object f1;
    public final /* synthetic */ daf g1;
    public int h1;
    public List i;
    public List j;
    public List k;
    public List l;
    public q4f m;
    public String n;
    public List o;
    public Map p;
    public Collection q;
    public Iterator r;
    public hf6 s;
    public ArrayList t;
    public List u;
    public Collection v;
    public List w;
    public ArrayList x;
    public daf y;
    public Collection z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izt(daf dafVar, zje zjeVar) {
        super(zjeVar);
        this.g1 = dafVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.f1 = obj;
        this.h1 |= Integer.MIN_VALUE;
        return this.g1.H(null, null, null, null, null, null, null, false, null, null, this);
    }
}
