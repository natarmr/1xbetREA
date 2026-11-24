package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class n550 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ d650 k;
    public final /* synthetic */ byte l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ n550(d650 d650Var, int i, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = d650Var;
        this.l = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        byte b2 = this.l;
        d650 d650Var = this.k;
        switch (b) {
            case 0:
                return new n550(d650Var, b2, yjeVar, (byte) 0);
            case 1:
                return new n550(d650Var, b2, yjeVar, (byte) 1);
            case 2:
                return new n550(d650Var, b2, yjeVar, (byte) 2);
            default:
                return new n550(d650Var, b2, yjeVar, (byte) 3);
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
        }
        return ((n550) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws zhi0 {
        Object objR;
        Object value;
        ArrayList arrayList;
        Object objC;
        Object value2;
        ArrayList arrayList2;
        Object objR2;
        Object value3;
        ArrayList arrayList3;
        Object objA;
        Object value4;
        ArrayList arrayList4;
        byte b = this.i;
        nbj nbjVar = nbj.f23243a;
        d650 d650Var = this.k;
        switch (b) {
            case 0:
                p7m0 p7m0Var = d650Var.g1;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    phf0 phf0Var = d650Var.z;
                    s0s s0sVar = s0s.ONE_X_LIVE_AGGREGATOR;
                    List listC = kotlin.collections.a.c(String.valueOf(17L));
                    this.j = true;
                    objR = phf0Var.r(nw80.f24223a.getId(), listC, this.l, this);
                    if (objR == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objR = obj;
                }
                List list = (List) objR;
                do {
                    value = p7m0Var.getValue();
                    Iterable<ef40> iterable = (Iterable) p7m0Var.getValue();
                    arrayList = new ArrayList(r3d.q(iterable, 10));
                    for (ef40 qe40Var : iterable) {
                        if (qe40Var instanceof qe40) {
                            x4t x4tVar = ((qe40) qe40Var).f28565a;
                            if (x4tVar instanceof i4t) {
                                qe40Var = new qe40(x4tVar, !list.isEmpty() ? new qbj(list, false) : nbjVar);
                            }
                        }
                        arrayList.add(qe40Var);
                    }
                } while (!p7m0Var.m(value, arrayList));
                return Unit.f46060a;
            case 1:
                p7m0 p7m0Var2 = d650Var.g1;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    ouu ouuVar = d650Var.B;
                    s0s s0sVar2 = s0s.ONE_X_LIVE_AGGREGATOR;
                    List listC2 = kotlin.collections.a.c(String.valueOf(17L));
                    this.j = true;
                    objC = ouuVar.C(this.l, this, listC2);
                    if (objC == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objC = obj;
                }
                List list2 = (List) objC;
                do {
                    value2 = p7m0Var2.getValue();
                    Iterable<ef40> iterable2 = (Iterable) p7m0Var2.getValue();
                    arrayList2 = new ArrayList(r3d.q(iterable2, 10));
                    for (ef40 qe40Var2 : iterable2) {
                        if (qe40Var2 instanceof qe40) {
                            x4t x4tVar2 = ((qe40) qe40Var2).f28565a;
                            if (x4tVar2 instanceof l4t) {
                                qe40Var2 = new qe40(x4tVar2, !list2.isEmpty() ? new qbj(list2, false) : nbjVar);
                            }
                        }
                        arrayList2.add(qe40Var2);
                    }
                } while (!p7m0Var2.m(value2, arrayList2));
                return Unit.f46060a;
            case 2:
                p7m0 p7m0Var3 = d650Var.g1;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    phf0 phf0Var2 = d650Var.z;
                    long id = nw80.k.getId();
                    s0s s0sVar3 = s0s.ONE_X_LIVE_AGGREGATOR;
                    List listC3 = kotlin.collections.a.c(String.valueOf(17L));
                    this.j = true;
                    objR2 = phf0Var2.r(id, listC3, this.l, this);
                    if (objR2 == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objR2 = obj;
                }
                List list3 = (List) objR2;
                do {
                    value3 = p7m0Var3.getValue();
                    Iterable<ef40> iterable3 = (Iterable) p7m0Var3.getValue();
                    arrayList3 = new ArrayList(r3d.q(iterable3, 10));
                    for (ef40 qe40Var3 : iterable3) {
                        if (qe40Var3 instanceof qe40) {
                            x4t x4tVar3 = ((qe40) qe40Var3).f28565a;
                            if (x4tVar3 instanceof o4t) {
                                qe40Var3 = new qe40(x4tVar3, !list3.isEmpty() ? new qbj(list3, false) : nbjVar);
                            }
                        }
                        arrayList3.add(qe40Var3);
                    }
                } while (!p7m0Var3.m(value3, arrayList3));
                return Unit.f46060a;
            default:
                p7m0 p7m0Var4 = d650Var.g1;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    nr nrVar = d650Var.A;
                    long id2 = nw80.t.getId();
                    this.j = true;
                    objA = ((moc) nrVar.b).a(this.l, id2, this, ((ntu) nrVar.c).a(), ((pru) nrVar.d).a().b.N);
                    if (objA == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                List list4 = (List) objA;
                do {
                    value4 = p7m0Var4.getValue();
                    Iterable<ef40> iterable4 = (Iterable) p7m0Var4.getValue();
                    arrayList4 = new ArrayList(r3d.q(iterable4, 10));
                    for (ef40 qe40Var4 : iterable4) {
                        if (qe40Var4 instanceof qe40) {
                            x4t x4tVar4 = ((qe40) qe40Var4).f28565a;
                            if (x4tVar4 instanceof v4t) {
                                qe40Var4 = new qe40(x4tVar4, !list4.isEmpty() ? new qbj(list4, false) : nbjVar);
                            }
                        }
                        arrayList4.add(qe40Var4);
                    }
                } while (!p7m0Var4.m(value4, arrayList4));
                return Unit.f46060a;
        }
    }
}
