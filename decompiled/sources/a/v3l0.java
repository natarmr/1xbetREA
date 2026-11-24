package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class v3l0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ pz40 k;
    public final /* synthetic */ xcz l;
    public final /* synthetic */ ngk0 m;
    public final /* synthetic */ xdr n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3l0(pz40 pz40Var, xcz xczVar, ngk0 ngk0Var, xdr xdrVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = pz40Var;
        this.l = xczVar;
        this.m = ngk0Var;
        this.n = xdrVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new v3l0(this.k, this.l, this.m, this.n, yjeVar, (byte) 0);
            case 1:
                return new v3l0(this.k, this.l, this.m, this.n, yjeVar, (byte) 1);
            case 2:
                return new v3l0(this.k, this.l, this.m, this.n, yjeVar, (byte) 2);
            case 3:
                return new v3l0(this.k, this.l, this.m, this.n, yjeVar, (byte) 3);
            default:
                return new v3l0(this.k, this.l, this.m, this.n, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((v3l0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        xdr xdrVar = this.n;
        final xcz xczVar = this.l;
        final pz40 pz40Var = this.k;
        final ngk0 ngk0Var = this.m;
        final byte b2 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    final byte b3 = 0;
                    vsg0 vsg0VarV = ydx.V(null, new Function0() { // from class: a.t3l0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b4 = b3;
                            ngk0 ngk0Var2 = ngk0Var;
                            xcz xczVar2 = xczVar;
                            pz40 pz40Var2 = pz40Var;
                            switch (b4) {
                                case 0:
                                    Object value = pz40Var2.getValue();
                                    List list = xczVar2.j().l;
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        j6z j6zVar = (j6z) ngk0Var2.get(((ncz) it.next()).l);
                                        if (j6zVar != null) {
                                            arrayList.add(j6zVar);
                                        }
                                    }
                                    return new Pair(value, arrayList);
                                case 1:
                                    Object value2 = pz40Var2.getValue();
                                    List list2 = xczVar2.j().l;
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        j6z j6zVar2 = (j6z) ngk0Var2.get(((ncz) it2.next()).l);
                                        if (j6zVar2 != null) {
                                            arrayList2.add(j6zVar2);
                                        }
                                    }
                                    return new Pair(value2, arrayList2);
                                case 2:
                                    Object value3 = pz40Var2.getValue();
                                    List list3 = xczVar2.j().l;
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it3 = list3.iterator();
                                    while (it3.hasNext()) {
                                        j6z j6zVar3 = (j6z) ngk0Var2.get(((ncz) it3.next()).l);
                                        if (j6zVar3 != null) {
                                            arrayList3.add(j6zVar3);
                                        }
                                    }
                                    return new Pair(value3, arrayList3);
                                case 3:
                                    Object value4 = pz40Var2.getValue();
                                    List list4 = xczVar2.j().l;
                                    ArrayList arrayList4 = new ArrayList();
                                    Iterator it4 = list4.iterator();
                                    while (it4.hasNext()) {
                                        j6z j6zVar4 = (j6z) ngk0Var2.get(((ncz) it4.next()).l);
                                        if (j6zVar4 != null) {
                                            arrayList4.add(j6zVar4);
                                        }
                                    }
                                    return new Pair(value4, arrayList4);
                                default:
                                    Object value5 = pz40Var2.getValue();
                                    List list5 = xczVar2.j().l;
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it5 = list5.iterator();
                                    while (it5.hasNext()) {
                                        j6z j6zVar5 = (j6z) ngk0Var2.get(((ncz) it5.next()).l);
                                        if (j6zVar5 != null) {
                                            arrayList5.add(j6zVar5);
                                        }
                                    }
                                    return new Pair(value5, arrayList5);
                            }
                        }
                    });
                    u3l0 u3l0Var = new u3l0(xdrVar, (byte) 0);
                    this.j = true;
                    if (vsg0VarV.c(u3l0Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    vsg0 vsg0VarV2 = ydx.V(null, new Function0() { // from class: a.t3l0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b4 = b2;
                            ngk0 ngk0Var2 = ngk0Var;
                            xcz xczVar2 = xczVar;
                            pz40 pz40Var2 = pz40Var;
                            switch (b4) {
                                case 0:
                                    Object value = pz40Var2.getValue();
                                    List list = xczVar2.j().l;
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        j6z j6zVar = (j6z) ngk0Var2.get(((ncz) it.next()).l);
                                        if (j6zVar != null) {
                                            arrayList.add(j6zVar);
                                        }
                                    }
                                    return new Pair(value, arrayList);
                                case 1:
                                    Object value2 = pz40Var2.getValue();
                                    List list2 = xczVar2.j().l;
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        j6z j6zVar2 = (j6z) ngk0Var2.get(((ncz) it2.next()).l);
                                        if (j6zVar2 != null) {
                                            arrayList2.add(j6zVar2);
                                        }
                                    }
                                    return new Pair(value2, arrayList2);
                                case 2:
                                    Object value3 = pz40Var2.getValue();
                                    List list3 = xczVar2.j().l;
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it3 = list3.iterator();
                                    while (it3.hasNext()) {
                                        j6z j6zVar3 = (j6z) ngk0Var2.get(((ncz) it3.next()).l);
                                        if (j6zVar3 != null) {
                                            arrayList3.add(j6zVar3);
                                        }
                                    }
                                    return new Pair(value3, arrayList3);
                                case 3:
                                    Object value4 = pz40Var2.getValue();
                                    List list4 = xczVar2.j().l;
                                    ArrayList arrayList4 = new ArrayList();
                                    Iterator it4 = list4.iterator();
                                    while (it4.hasNext()) {
                                        j6z j6zVar4 = (j6z) ngk0Var2.get(((ncz) it4.next()).l);
                                        if (j6zVar4 != null) {
                                            arrayList4.add(j6zVar4);
                                        }
                                    }
                                    return new Pair(value4, arrayList4);
                                default:
                                    Object value5 = pz40Var2.getValue();
                                    List list5 = xczVar2.j().l;
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it5 = list5.iterator();
                                    while (it5.hasNext()) {
                                        j6z j6zVar5 = (j6z) ngk0Var2.get(((ncz) it5.next()).l);
                                        if (j6zVar5 != null) {
                                            arrayList5.add(j6zVar5);
                                        }
                                    }
                                    return new Pair(value5, arrayList5);
                            }
                        }
                    });
                    u3l0 u3l0Var2 = new u3l0(xdrVar, (byte) 1);
                    this.j = true;
                    if (vsg0VarV2.c(u3l0Var2, this) == wneVar2) {
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
                    final byte b4 = 2;
                    vsg0 vsg0VarV3 = ydx.V(null, new Function0() { // from class: a.t3l0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b5 = b4;
                            ngk0 ngk0Var2 = ngk0Var;
                            xcz xczVar2 = xczVar;
                            pz40 pz40Var2 = pz40Var;
                            switch (b5) {
                                case 0:
                                    Object value = pz40Var2.getValue();
                                    List list = xczVar2.j().l;
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        j6z j6zVar = (j6z) ngk0Var2.get(((ncz) it.next()).l);
                                        if (j6zVar != null) {
                                            arrayList.add(j6zVar);
                                        }
                                    }
                                    return new Pair(value, arrayList);
                                case 1:
                                    Object value2 = pz40Var2.getValue();
                                    List list2 = xczVar2.j().l;
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        j6z j6zVar2 = (j6z) ngk0Var2.get(((ncz) it2.next()).l);
                                        if (j6zVar2 != null) {
                                            arrayList2.add(j6zVar2);
                                        }
                                    }
                                    return new Pair(value2, arrayList2);
                                case 2:
                                    Object value3 = pz40Var2.getValue();
                                    List list3 = xczVar2.j().l;
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it3 = list3.iterator();
                                    while (it3.hasNext()) {
                                        j6z j6zVar3 = (j6z) ngk0Var2.get(((ncz) it3.next()).l);
                                        if (j6zVar3 != null) {
                                            arrayList3.add(j6zVar3);
                                        }
                                    }
                                    return new Pair(value3, arrayList3);
                                case 3:
                                    Object value4 = pz40Var2.getValue();
                                    List list4 = xczVar2.j().l;
                                    ArrayList arrayList4 = new ArrayList();
                                    Iterator it4 = list4.iterator();
                                    while (it4.hasNext()) {
                                        j6z j6zVar4 = (j6z) ngk0Var2.get(((ncz) it4.next()).l);
                                        if (j6zVar4 != null) {
                                            arrayList4.add(j6zVar4);
                                        }
                                    }
                                    return new Pair(value4, arrayList4);
                                default:
                                    Object value5 = pz40Var2.getValue();
                                    List list5 = xczVar2.j().l;
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it5 = list5.iterator();
                                    while (it5.hasNext()) {
                                        j6z j6zVar5 = (j6z) ngk0Var2.get(((ncz) it5.next()).l);
                                        if (j6zVar5 != null) {
                                            arrayList5.add(j6zVar5);
                                        }
                                    }
                                    return new Pair(value5, arrayList5);
                            }
                        }
                    });
                    u3l0 u3l0Var3 = new u3l0(xdrVar, (byte) 2);
                    this.j = true;
                    if (vsg0VarV3.c(u3l0Var3, this) == wneVar3) {
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
                    final byte b5 = 3;
                    vsg0 vsg0VarV4 = ydx.V(null, new Function0() { // from class: a.t3l0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b6 = b5;
                            ngk0 ngk0Var2 = ngk0Var;
                            xcz xczVar2 = xczVar;
                            pz40 pz40Var2 = pz40Var;
                            switch (b6) {
                                case 0:
                                    Object value = pz40Var2.getValue();
                                    List list = xczVar2.j().l;
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        j6z j6zVar = (j6z) ngk0Var2.get(((ncz) it.next()).l);
                                        if (j6zVar != null) {
                                            arrayList.add(j6zVar);
                                        }
                                    }
                                    return new Pair(value, arrayList);
                                case 1:
                                    Object value2 = pz40Var2.getValue();
                                    List list2 = xczVar2.j().l;
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        j6z j6zVar2 = (j6z) ngk0Var2.get(((ncz) it2.next()).l);
                                        if (j6zVar2 != null) {
                                            arrayList2.add(j6zVar2);
                                        }
                                    }
                                    return new Pair(value2, arrayList2);
                                case 2:
                                    Object value3 = pz40Var2.getValue();
                                    List list3 = xczVar2.j().l;
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it3 = list3.iterator();
                                    while (it3.hasNext()) {
                                        j6z j6zVar3 = (j6z) ngk0Var2.get(((ncz) it3.next()).l);
                                        if (j6zVar3 != null) {
                                            arrayList3.add(j6zVar3);
                                        }
                                    }
                                    return new Pair(value3, arrayList3);
                                case 3:
                                    Object value4 = pz40Var2.getValue();
                                    List list4 = xczVar2.j().l;
                                    ArrayList arrayList4 = new ArrayList();
                                    Iterator it4 = list4.iterator();
                                    while (it4.hasNext()) {
                                        j6z j6zVar4 = (j6z) ngk0Var2.get(((ncz) it4.next()).l);
                                        if (j6zVar4 != null) {
                                            arrayList4.add(j6zVar4);
                                        }
                                    }
                                    return new Pair(value4, arrayList4);
                                default:
                                    Object value5 = pz40Var2.getValue();
                                    List list5 = xczVar2.j().l;
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it5 = list5.iterator();
                                    while (it5.hasNext()) {
                                        j6z j6zVar5 = (j6z) ngk0Var2.get(((ncz) it5.next()).l);
                                        if (j6zVar5 != null) {
                                            arrayList5.add(j6zVar5);
                                        }
                                    }
                                    return new Pair(value5, arrayList5);
                            }
                        }
                    });
                    u3l0 u3l0Var4 = new u3l0(xdrVar, (byte) 3);
                    this.j = true;
                    if (vsg0VarV4.c(u3l0Var4, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    final byte b6 = 4;
                    vsg0 vsg0VarV5 = ydx.V(null, new Function0() { // from class: a.t3l0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b7 = b6;
                            ngk0 ngk0Var2 = ngk0Var;
                            xcz xczVar2 = xczVar;
                            pz40 pz40Var2 = pz40Var;
                            switch (b7) {
                                case 0:
                                    Object value = pz40Var2.getValue();
                                    List list = xczVar2.j().l;
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        j6z j6zVar = (j6z) ngk0Var2.get(((ncz) it.next()).l);
                                        if (j6zVar != null) {
                                            arrayList.add(j6zVar);
                                        }
                                    }
                                    return new Pair(value, arrayList);
                                case 1:
                                    Object value2 = pz40Var2.getValue();
                                    List list2 = xczVar2.j().l;
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        j6z j6zVar2 = (j6z) ngk0Var2.get(((ncz) it2.next()).l);
                                        if (j6zVar2 != null) {
                                            arrayList2.add(j6zVar2);
                                        }
                                    }
                                    return new Pair(value2, arrayList2);
                                case 2:
                                    Object value3 = pz40Var2.getValue();
                                    List list3 = xczVar2.j().l;
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it3 = list3.iterator();
                                    while (it3.hasNext()) {
                                        j6z j6zVar3 = (j6z) ngk0Var2.get(((ncz) it3.next()).l);
                                        if (j6zVar3 != null) {
                                            arrayList3.add(j6zVar3);
                                        }
                                    }
                                    return new Pair(value3, arrayList3);
                                case 3:
                                    Object value4 = pz40Var2.getValue();
                                    List list4 = xczVar2.j().l;
                                    ArrayList arrayList4 = new ArrayList();
                                    Iterator it4 = list4.iterator();
                                    while (it4.hasNext()) {
                                        j6z j6zVar4 = (j6z) ngk0Var2.get(((ncz) it4.next()).l);
                                        if (j6zVar4 != null) {
                                            arrayList4.add(j6zVar4);
                                        }
                                    }
                                    return new Pair(value4, arrayList4);
                                default:
                                    Object value5 = pz40Var2.getValue();
                                    List list5 = xczVar2.j().l;
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it5 = list5.iterator();
                                    while (it5.hasNext()) {
                                        j6z j6zVar5 = (j6z) ngk0Var2.get(((ncz) it5.next()).l);
                                        if (j6zVar5 != null) {
                                            arrayList5.add(j6zVar5);
                                        }
                                    }
                                    return new Pair(value5, arrayList5);
                            }
                        }
                    });
                    r980 r980Var = new r980(xdrVar, ngk0Var, (byte) 23);
                    this.j = true;
                    if (vsg0VarV5.c(r980Var, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
