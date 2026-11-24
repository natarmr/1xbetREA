package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c1f extends bnn0 implements Function2 {
    public final /* synthetic */ boolean A;
    public boolean i;
    public final /* synthetic */ String j;
    public final /* synthetic */ Integer k;
    public final /* synthetic */ g45 l;
    public final /* synthetic */ Boolean m;
    public final /* synthetic */ long n;
    public final /* synthetic */ long o;
    public final /* synthetic */ int p;
    public final /* synthetic */ long q;
    public final /* synthetic */ List r;
    public final /* synthetic */ int s;
    public final /* synthetic */ String t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ List v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ byte z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c1f(String str, Integer num, g45 g45Var, Boolean bool, long j, long j2, int i, long j3, List list, int i2, String str2, boolean z, List list2, boolean z2, boolean z3, boolean z4, int i3, boolean z5, yje yjeVar) {
        super(2, yjeVar);
        this.j = str;
        this.k = num;
        this.l = g45Var;
        this.m = bool;
        this.n = j;
        this.o = j2;
        this.p = i;
        this.q = j3;
        this.r = list;
        this.s = i2;
        this.t = str2;
        this.u = z;
        this.v = list2;
        this.w = z2;
        this.x = z3;
        this.y = z4;
        this.z = i3;
        this.A = z5;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new c1f(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objF;
        g45 g45Var = this.l;
        knf0 knf0Var = (knf0) g45Var.h;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            String str = this.j;
            if (str == null) {
                str = "0";
            }
            String str2 = str;
            Integer num = this.k;
            int iIntValue = num != null ? num.intValue() : knf0Var.b();
            Boolean boolValueOf = Boolean.valueOf(Intrinsics.d(this.m, Boolean.TRUE));
            List list = this.r;
            list.getClass();
            String str3 = this.t;
            str3.getClass();
            List list2 = this.v;
            list2.getClass();
            String strA = knf0Var.a();
            String strC = knf0Var.c();
            knf0Var.getClass();
            knf0Var.getClass();
            strA.getClass();
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ro4.i0((ru6) it.next()));
            }
            iit0 iit0Var = new iit0(this.n, this.o, strA, this.p, this.q, strC, arrayList, this.s, str2, str3, this.u, boolValueOf.equals(Boolean.TRUE), list2, this.w, this.x, this.y, iIntValue, this.z);
            ehf0 ehf0Var = (ehf0) g45Var.d;
            this.i = true;
            objF = ((vre) ((jwd) ehf0Var.c).invoke()).f(iit0Var, this);
            if (objF == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objF = obj;
        }
        return xnm0.m((oit0) ((q16) objF).a(), this.A, ((ave) g45Var.c).f1521a);
    }
}
