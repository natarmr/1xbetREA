package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class yw4 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ gr00 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ long l;
    public final /* synthetic */ List m;
    public final /* synthetic */ long n;
    public final /* synthetic */ long o;
    public final /* synthetic */ s77 p;
    public final /* synthetic */ String q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ List s;
    public final /* synthetic */ List t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw4(gr00 gr00Var, int i, long j, List list, long j2, long j3, s77 s77Var, String str, boolean z, List list2, List list3, boolean z2, boolean z3, boolean z4, yje yjeVar) {
        super(2, yjeVar);
        this.j = gr00Var;
        this.k = i;
        this.l = j;
        this.m = list;
        this.n = j2;
        this.o = j3;
        this.p = s77Var;
        this.q = str;
        this.r = z;
        this.s = list2;
        this.t = list3;
        this.u = z2;
        this.v = z3;
        this.w = z4;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new yw4(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((yw4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws zhi0 {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        gr00 gr00Var = this.j;
        if (!z) {
            z1x.P(obj);
            peg0 peg0Var = (peg0) gr00Var.b;
            String strA = ((btt0) gr00Var.e).a();
            mqt mqtVar = new mqt(((knf0) gr00Var.d).c(), this.k, new Long(this.l), this.m, this.n, this.o);
            this.i = true;
            obj = ((sw4) ((zm) peg0Var.b).invoke()).a(strA, mqtVar, this);
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
        List listA = ((sg7) obj).a();
        m0w m0wVar = (m0w) gr00Var.c;
        m0wVar.getClass();
        ArrayList arrayList = m0wVar.c;
        arrayList.clear();
        arrayList.addAll(listA);
        ArrayList arrayList2 = new ArrayList(r3d.q(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList2.add(bkb.r0((rg7) it.next(), this.p, this.q, this.r, this.s, this.t, this.u, iun.f15405a, this.v, this.w));
        }
        return arrayList2;
    }
}
