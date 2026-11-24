package a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class hmb0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ pmb0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hmb0(pmb0 pmb0Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = pmb0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        pmb0 pmb0Var = this.k;
        switch (b) {
            case 0:
                return new hmb0(pmb0Var, yjeVar, (byte) 0);
            case 1:
                return new hmb0(pmb0Var, yjeVar, (byte) 1);
            case 2:
                return new hmb0(pmb0Var, yjeVar, (byte) 2);
            case 3:
                return new hmb0(pmb0Var, yjeVar, (byte) 3);
            case 4:
                return new hmb0(pmb0Var, yjeVar, (byte) 4);
            case 5:
                return new hmb0(pmb0Var, yjeVar, (byte) 5);
            case 6:
                return new hmb0(pmb0Var, yjeVar, (byte) 6);
            default:
                return new hmb0(pmb0Var, yjeVar, (byte) 7);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return ((hmb0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        olb0 olb0Var;
        Object objA2;
        Object objA3;
        byte b = this.i;
        pmb0 pmb0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    oqx oqxVar = pmb0Var.o0;
                    List list = ((olb0) pmb0Var.D()).k.f;
                    this.j = true;
                    objA = oqxVar.a(list, this);
                    if (objA == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                boolean zR = ((Boolean) objA).booleanValue() ? pmb0Var.B.f27342a.d().r(fk60.POPULAR_PERSONALIZATION_TOP) : false;
                int i = pmb0.D0;
                p7m0 p7m0Var = pmb0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    olb0Var = (olb0) value;
                    pmb0Var.f.getClass();
                } while (!p7m0Var.m(value, olb0.a(olb0Var, null, null, null, false, false, null, 0L, 0L, false, c9x.J(olb0Var.j, fdb0.f9352a, zR), null, null, 7679)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    sd60 sd60Var = pmb0Var.H;
                    this.j = true;
                    if (sd60Var.i("", this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    this.j = true;
                    int i2 = pmb0.D0;
                    if (pmb0Var.Q(this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    oqx oqxVar2 = pmb0Var.o0;
                    List list2 = ((olb0) pmb0Var.D()).k.f;
                    this.j = true;
                    objA2 = oqxVar2.a(list2, this);
                    if (objA2 == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = obj;
                }
                boolean zBooleanValue = ((Boolean) objA2).booleanValue();
                hou houVar = pmb0Var.g0;
                boolean zA = houVar.b.a();
                boolean zA2 = houVar.f13410a.a();
                boolean zA3 = houVar.c.a();
                boolean zA4 = houVar.d.a();
                gx3 gx3Var = new gx3(0);
                gx3Var.put(jib0.d, Boolean.valueOf(zA));
                gx3Var.put(jib0.b, Boolean.valueOf(zA3));
                gx3Var.put(jib0.c, Boolean.valueOf(zA2));
                if (zBooleanValue) {
                    gx3Var.put(jib0.f16566a, Boolean.valueOf(zA4));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(gx3Var.c));
                for (Map.Entry entry : (ax3) gx3Var.entrySet()) {
                    Object key = entry.getKey();
                    key.getClass();
                    linkedHashMap.put(w9x.Q((jib0) key), entry.getValue());
                }
                if (!gx3Var.isEmpty()) {
                    nw20 nw20Var = pmb0Var.h0;
                    nw20Var.getClass();
                    ArrayList arrayList = new ArrayList(gx3Var.c);
                    for (Map.Entry entry2 : (ax3) gx3Var.entrySet()) {
                        arrayList.add(((jib0) entry2.getKey()).a(((Boolean) entry2.getValue()).booleanValue()));
                    }
                    if (!arrayList.isEmpty()) {
                        ((kt2) nw20Var.f24215a).a("user_popular_settings", wp20.b(new Pair("option", arrayList)));
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    dq00 dq00Var = pmb0Var.i0;
                    dq00Var.getClass();
                    ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        arrayList2.add(((lib0) entry3.getKey()).a(((Boolean) entry3.getValue()).booleanValue()));
                    }
                    if (!arrayList2.isEmpty()) {
                        s1p s1pVar = (s1p) dq00Var.b;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : arrayList2) {
                            if (((String) obj2).length() > 0) {
                                arrayList3.add(obj2);
                            }
                        }
                        b1j.v(CollectionsKt.b0(arrayList3, ", ", null, null, null, 62), s1pVar, 11160L);
                    }
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    rou rouVar = pmb0Var.W;
                    this.j = true;
                    objA3 = rouVar.a(true, this);
                    if (objA3 == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA3 = obj;
                }
                pmb0Var.t.d(new zga0(objA3, (Object) pmb0Var, (byte) 18));
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    if (((olb0) pmb0Var.D()).b == amb0.AGGREGATOR) {
                        ytt yttVar = pmb0Var.R;
                        aue0 aue0Var = aue0.d;
                        this.j = true;
                        if (yttVar.a(aue0Var, this) == wneVar6) {
                            return wneVar6;
                        }
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i1w0 i1w0Var = pmb0Var.t;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                c8d c8dVar = new c8d(y7d.f42146a, n0w0.f22721a);
                ListIterator listIterator = cs0.h(copyOnWriteArrayListQ, c8dVar, c8dVar, i1w0Var, copyOnWriteArrayListQ).listIterator(0);
                while (true) {
                    paw pawVar = (paw) listIterator;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    sd60 sd60Var2 = pmb0Var.H;
                    this.j = true;
                    if (sd60Var2.i("", this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    if (((olb0) pmb0Var.D()).b == amb0.AGGREGATOR) {
                        ytt yttVar2 = pmb0Var.R;
                        aue0 aue0Var2 = aue0.d;
                        this.j = true;
                        if (yttVar2.a(aue0Var2, this) == wneVar8) {
                            return wneVar8;
                        }
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i1w0 i1w0Var2 = pmb0Var.t;
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                c8d c8dVar2 = new c8d(y7d.f42146a, o0w0.f24450a);
                ListIterator listIterator2 = cs0.h(copyOnWriteArrayListQ2, c8dVar2, c8dVar2, i1w0Var2, copyOnWriteArrayListQ2).listIterator(0);
                while (true) {
                    paw pawVar2 = (paw) listIterator2;
                    if (!pawVar2.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var2.a((oe50) pawVar2.next());
                }
                break;
        }
    }
}
