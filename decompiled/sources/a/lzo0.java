package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class lzo0 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ jvn j;
    public final /* synthetic */ Integer k;
    public final /* synthetic */ int l;
    public final /* synthetic */ String m;
    public final /* synthetic */ long n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ long p;
    public final /* synthetic */ n660 q;
    public final /* synthetic */ sip r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzo0(jvn jvnVar, Integer num, int i, String str, long j, boolean z, long j2, n660 n660Var, sip sipVar, boolean z2, long j3, yje yjeVar) {
        super(2, yjeVar);
        this.j = jvnVar;
        this.k = num;
        this.l = i;
        this.m = str;
        this.n = j;
        this.o = z;
        this.p = j2;
        this.q = n660Var;
        this.r = sipVar;
        this.s = z2;
        this.t = j3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new lzo0(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((lzo0) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        sip sipVar = this.r;
        n660 n660Var = this.q;
        if (!z) {
            z1x.P(obj);
            jo20 jo20Var = new jo20();
            jo20Var.put("cfView", Integer.valueOf(this.j.getId()));
            Integer num = this.k;
            if (num != null) {
                jo20Var.put("country", num);
            }
            jo20Var.put("fcountry", Integer.valueOf(this.l));
            jo20Var.put("gr", 1357);
            jo20Var.put("lng", this.m);
            jo20Var.put("oppId", Long.valueOf(this.n));
            jo20Var.put("ref", 1);
            if (this.o) {
                jo20Var.put("userId", Long.valueOf(this.p));
            }
            TreeMap treeMap = new TreeMap(w6x.j(22, jo20Var, "whence"));
            roi0 roi0Var = (roi0) n660Var.f22981a;
            this.i = true;
            obj = roi0Var.j(sipVar, treeMap, this);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(g7x.a0((su10) it.next(), sipVar, this.t));
        }
        g090 g090Var = (g090) n660Var.b;
        ((ir30) (this.s ? g090Var.f10448a : g090Var.b)).d(arrayList);
        return arrayList;
    }
}
