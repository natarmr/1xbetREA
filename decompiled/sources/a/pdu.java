package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class pdu extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public boolean j;
    public final /* synthetic */ wdu k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;
    public /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdu(wdu wduVar, boolean z, boolean z2, String str, boolean z3, boolean z4, yje yjeVar) {
        super(2, yjeVar);
        this.k = wduVar;
        this.l = z;
        this.m = z2;
        this.p = str;
        this.n = z3;
        this.o = z4;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new pdu(this.k, this.l, this.m, (String) this.p, this.n, this.o, yjeVar);
            default:
                pdu pduVar = new pdu(this.k, this.l, this.m, this.n, this.o, yjeVar);
                pduVar.p = obj;
                return pduVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((pdu) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v21, types: [a.g0g0] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws zhi0 {
        Object objF;
        wdu wduVar;
        Object objA;
        Object arrayList;
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    String str = (String) this.p;
                    this.j = true;
                    objF = this.k.F(this.l, this.m, str, this.n, this.o, this);
                    if (objF == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objF = ((j0g0) obj).f15681a;
                }
                return new j0g0(objF);
            default:
                vne vneVar = (vne) this.p;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                wdu wduVar2 = this.k;
                if (!z2) {
                    z1x.P(obj);
                    boolean zA = ((j1q0) wduVar2.f).f15748a.a();
                    String strA = ((ntu) wduVar2.i).a();
                    String strA2 = ((xoc) wduVar2.h).a(true);
                    wduVar = wduVar2;
                    yje yjeVar = null;
                    jzj[] jzjVarArr = {qjj.M(vneVar, null, new ndu(wduVar, zA, strA, this.m, this.n, null), 3), qjj.M(vneVar, null, new odu(wduVar, zA, strA, strA2, this.m, this.n, yjeVar, (byte) 0), 3), qjj.M(vneVar, null, new pdu(wduVar, this.l, this.o, strA, this.m, this.n, null), 3), qjj.M(vneVar, null, new odu(wduVar, zA, strA, strA2, this.m, this.n, yjeVar, (byte) 1), 3)};
                    this.p = null;
                    this.j = true;
                    objA = new ja5(jzjVarArr).a(this);
                    if (objA == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                    wduVar = wduVar2;
                }
                List list = (List) objA;
                Object obj2 = ((j0g0) list.get(0)).f15681a;
                Object obj3 = ((j0g0) list.get(1)).f15681a;
                Object obj4 = ((j0g0) list.get(2)).f15681a;
                Object obj5 = ((j0g0) list.get(3)).f15681a;
                if ((obj2 instanceof g0g0) && (obj3 instanceof g0g0) && (obj5 instanceof g0g0) && ((obj4 instanceof g0g0) || !this.l)) {
                    Throwable thA = j0g0.a(obj2);
                    if (thA == null) {
                        thA = new zhi0();
                    }
                    arrayList = new g0g0(thA);
                } else {
                    e0g0 e0g0Var = j0g0.b;
                    wdu wduVar3 = wduVar;
                    j8b j8bVarB = wdu.b(wduVar3, s0s.ONE_X_LIVE_AGGREGATOR, obj2, 75L, 20);
                    s0s s0sVar = s0s.POPULAR;
                    nw80 nw80Var = nw80.f24223a;
                    List listJ = q3d.j(j8bVarB, wdu.b(wduVar3, s0sVar, obj3, 17L, 16), wdu.b(wduVar3, s0s.RECOMMENDED, obj4, -1L, 4), wdu.b(wduVar3, s0s.LIVE_AGGREGATOR, obj5, 17L, 20));
                    arrayList = new ArrayList();
                    for (Object obj6 : listJ) {
                        if (!((j8b) obj6).g) {
                            arrayList.add(obj6);
                        }
                    }
                }
                return new j0g0(arrayList);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdu(wdu wduVar, boolean z, boolean z2, boolean z3, boolean z4, yje yjeVar) {
        super(2, yjeVar);
        this.k = wduVar;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = z4;
    }
}
