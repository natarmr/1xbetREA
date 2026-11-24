package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ay60 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ dy60 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ay60(dy60 dy60Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dy60Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        dy60 dy60Var = this.k;
        switch (b) {
            case 0:
                ay60 ay60Var = new ay60(dy60Var, yjeVar, (byte) 0);
                ay60Var.j = obj;
                return ay60Var;
            default:
                ay60 ay60Var2 = new ay60(dy60Var, yjeVar, (byte) 1);
                ay60Var2.j = obj;
                return ay60Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((ay60) create(pair, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object g0g0Var;
        Object value;
        Object value2;
        byte b = this.i;
        dy60 dy60Var = this.k;
        Pair pair = (Pair) this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                pat patVar = (pat) pair.f46059a;
                pat patVar2 = (pat) pair.b;
                boolean z = ((qx60) dy60Var.D()).d;
                dun dunVar = dun.f6704a;
                if (!z) {
                    return dunVar;
                }
                try {
                    e0g0 e0g0Var = j0g0.b;
                    patVar.getClass();
                    patVar2.getClass();
                    if ((patVar instanceof oat) || (patVar2 instanceof oat)) {
                        throw new sq60();
                    }
                    if ((patVar instanceof mat) || (patVar2 instanceof mat)) {
                        throw new vub0();
                    }
                    if ((patVar instanceof lat) || (patVar2 instanceof lat)) {
                        throw new bun();
                    }
                    g0g0Var = dy60Var.r.p(true);
                    Throwable thA = j0g0.a(g0g0Var);
                    if (thA != null) {
                        dy60Var.M(thA);
                    }
                    return g0g0Var instanceof g0g0 ? dunVar : g0g0Var;
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                List list = (List) pair.f46059a;
                List list2 = (List) pair.b;
                oyg0 oyg0Var = dy60Var.f;
                ocj ocjVar = dy60Var.i;
                if (!((qx60) dy60Var.D()).d) {
                    return Unit.f46060a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (((pbv) obj2).q) {
                        arrayList.add(obj2);
                    }
                }
                int iA = wp20.a(r3d.q(arrayList, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (Object obj3 : arrayList) {
                    linkedHashMap.put(new Long(((pbv) obj3).f26728a), obj3);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    pbv pbvVar = (pbv) linkedHashMap.get(new Long(((i8p) it.next()).f14350a));
                    if (pbvVar != null) {
                        arrayList2.add(pbvVar);
                    }
                }
                if (!list2.isEmpty()) {
                    if (!list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                pbv pbvVar2 = (pbv) it2.next();
                                if (pbvVar2.p || !pbvVar2.q) {
                                }
                            }
                        }
                    }
                    sq60 sq60Var = new sq60();
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value2, qx60.a((qx60) value2, null, null, false, false, false, sq60Var, 127)));
                    ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        axq.t(((pbv) it3.next()).f26728a, arrayList3);
                    }
                    dy60Var.R(arrayList3);
                    return Unit.f46060a;
                }
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                } while (!p7m0Var2.m(value, qx60.a((qx60) value, null, new cfp(arrayList2, list), false, false, false, null, 123)));
                nn60 nn60Var = dy60Var.D;
                ArrayList arrayList4 = new ArrayList(r3d.q(list, 10));
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    axq.t(((i8p) it4.next()).f14350a, arrayList4);
                }
                i3t0.B(dy60Var, nn60Var, new en60[]{new xm60(arrayList4)});
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : list2) {
                    pbv pbvVar3 = (pbv) obj4;
                    if (pbvVar3.p || !pbvVar3.q) {
                        arrayList5.add(obj4);
                    }
                }
                ArrayList arrayList6 = new ArrayList(r3d.q(arrayList5, 10));
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    axq.t(((pbv) it5.next()).f26728a, arrayList6);
                }
                if (!arrayList6.isEmpty()) {
                    dy60Var.R(arrayList6);
                }
                return Unit.f46060a;
        }
    }
}
