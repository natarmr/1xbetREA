package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class g550 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ d650 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g550(d650 d650Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = d650Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        d650 d650Var = this.k;
        switch (b) {
            case 0:
                return new g550(d650Var, yjeVar, (byte) 0);
            case 1:
                return new g550(d650Var, yjeVar, (byte) 1);
            case 2:
                return new g550(d650Var, yjeVar, (byte) 2);
            case 3:
                return new g550(d650Var, yjeVar, (byte) 3);
            case 4:
                return new g550(d650Var, yjeVar, (byte) 4);
            case 5:
                return new g550(d650Var, yjeVar, (byte) 5);
            case 6:
                g550 g550Var = new g550(d650Var, yjeVar, (byte) 6);
                g550Var.j = ((Boolean) obj).booleanValue();
                return g550Var;
            default:
                return new g550(d650Var, yjeVar, (byte) 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((g550) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((g550) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((g550) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((g550) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((g550) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((g550) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((g550) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((g550) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:201:0x0507  */
    /* JADX WARN: Code duplicated, block: B:203:0x050d  */
    /* JADX WARN: Code duplicated, block: B:205:0x0516  */
    /* JADX WARN: Code duplicated, block: B:206:0x0559  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws zhi0 {
        Object value;
        ArrayList arrayList;
        Object objA;
        d650 d650Var;
        te40 te40Var;
        vbj vbjVar;
        Object objN;
        Object value2;
        ArrayList arrayList2;
        Object objO;
        Object value3;
        ArrayList arrayList3;
        Object objA2;
        Object value4;
        ArrayList arrayList4;
        Object objR;
        Object value5;
        ArrayList arrayList5;
        Object objB;
        Object value6;
        ArrayList arrayList6;
        Object objC;
        Object value7;
        ArrayList arrayList7;
        byte b = this.i;
        vbj qbjVar = nbj.f23243a;
        boolean z = false;
        int i = 10;
        d650 d650Var2 = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    p7m0 p7m0Var = d650Var2.g1;
                    do {
                        value = p7m0Var.getValue();
                        Iterable<ef40> iterable = (Iterable) d650Var2.g1.getValue();
                        arrayList = new ArrayList(r3d.q(iterable, 10));
                        for (ef40 we40Var : iterable) {
                            if (we40Var instanceof we40) {
                                vbj vbjVar2 = ((we40) we40Var).f39002a;
                                if (vbjVar2 instanceof qbj) {
                                    we40Var = new we40(new qbj(new sh10(true, ((sh10) ((qbj) vbjVar2).f28448a).b), false));
                                }
                            }
                            arrayList.add(we40Var);
                        }
                    } while (!p7m0Var.m(value, arrayList));
                    lrc lrcVar = d650Var2.T;
                    String strA = d650Var2.U.a();
                    this.j = true;
                    objA = ((qi10) lrcVar.b).a(strA, this);
                    if (objA == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                ri10 ri10Var = (ri10) objA;
                p7m0 p7m0Var2 = d650Var2.g1;
                ctf0 ctf0Var = d650Var2.M;
                while (true) {
                    Object value8 = p7m0Var2.getValue();
                    Iterable iterable2 = (Iterable) d650Var2.g1.getValue();
                    ArrayList arrayList8 = new ArrayList(r3d.q(iterable2, i));
                    Iterator it = iterable2.iterator();
                    while (it.hasNext()) {
                        Object te40Var2 = (ef40) it.next();
                        if (te40Var2 instanceof we40) {
                            vbj vbjVar3 = ((we40) te40Var2).f39002a;
                            if (vbjVar3 instanceof qbj) {
                                d650Var = d650Var2;
                                te40Var2 = new we40(new qbj(new sh10(z, wi10.a(((sh10) ((qbj) vbjVar3).f28448a).b, ri10Var.f30517a, ri10Var.b, ri10Var.c, ri10Var.e)), z));
                            } else {
                                d650Var = d650Var2;
                                if (te40Var2 instanceof te40) {
                                    te40Var = (te40) te40Var2;
                                    vbjVar = te40Var.b;
                                    if (vbjVar instanceof qbj) {
                                        Object obj2 = ((qbj) vbjVar).f28448a;
                                        te40Var2 = new te40(te40Var.f33801a, new qbj(new zh10(((zh10) obj2).f44370a, yh10.a(((zh10) obj2).b, wi10.a(((zh10) obj2).b.c, ri10Var.f30517a, ri10Var.b, ri10Var.c, ri10Var.e))), false));
                                    }
                                }
                            }
                        } else {
                            d650Var = d650Var2;
                            if (te40Var2 instanceof te40) {
                                te40Var = (te40) te40Var2;
                                vbjVar = te40Var.b;
                                if (vbjVar instanceof qbj) {
                                    Object obj3 = ((qbj) vbjVar).f28448a;
                                    te40Var2 = new te40(te40Var.f33801a, new qbj(new zh10(((zh10) obj3).f44370a, yh10.a(((zh10) obj3).b, wi10.a(((zh10) obj3).b.c, ri10Var.f30517a, ri10Var.b, ri10Var.c, ri10Var.e))), false));
                                }
                            }
                        }
                        arrayList8.add(te40Var2);
                        it = it;
                        d650Var2 = d650Var;
                        z = false;
                    }
                    d650 d650Var3 = d650Var2;
                    if (p7m0Var2.m(value8, arrayList8)) {
                        ol60 ol60Var = d650Var3.h1;
                        String strA2 = ctf0Var.b.a(R.string.success, Arrays.copyOf(new Object[0], 0));
                        pn40 pn40Var = pn40.f27267a;
                        ol60Var.f(new u450(new DialogFields((CharSequence) strA2, (CharSequence) ctf0Var.b.a(R.string.loyalty_program_cashback_claim_success_description_v2, Arrays.copyOf(new Object[]{kng0.l(pn40.c(ri10Var.d, p3u0.c), Separators.SP, ri10Var.e.f33941a)}, 1)), (CharSequence) ctf0Var.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.c, false, 1528)));
                        return Unit.f46060a;
                    }
                    d650Var2 = d650Var3;
                    z = false;
                    i = 10;
                }
                break;
            case 1:
                p7m0 p7m0Var3 = d650Var2.g1;
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    f7u f7uVar = d650Var2.p0;
                    this.j = true;
                    sff0 sff0VarA = ((pru) f7uVar.e).a();
                    objN = ((yr) f7uVar.b).f43098a.n(this, ((ntu) f7uVar.c).a(), ((iqt) f7uVar.d).f15225a.a(), sff0VarA.b.N);
                    if (objN == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objN = obj;
                }
                List list = (List) objN;
                if (list.size() >= 9) {
                    qbjVar = new qbj(list, false);
                }
                do {
                    value2 = p7m0Var3.getValue();
                    Iterable<Object> iterable3 = (Iterable) p7m0Var3.getValue();
                    arrayList2 = new ArrayList(r3d.q(iterable3, 10));
                    for (Object re40Var : iterable3) {
                        if (re40Var instanceof re40) {
                            re40Var = new re40(qbjVar);
                        }
                        arrayList2.add(re40Var);
                    }
                } while (!p7m0Var3.m(value2, arrayList2));
                return Unit.f46060a;
            case 2:
                p7m0 p7m0Var4 = d650Var2.g1;
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    dgu dguVar = d650Var2.o0;
                    this.j = true;
                    sff0 sff0VarA2 = ((pru) dguVar.d).a();
                    objO = ((yr) dguVar.f6058a).f43098a.o(this, ((ntu) dguVar.b).a(), ((iqt) dguVar.c).f15225a.a(), sff0VarA2.b.N);
                    if (objO == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objO = obj;
                }
                List list2 = (List) objO;
                vbj qbjVar2 = !list2.isEmpty() ? new qbj(CollectionsKt.D0(list2, 12), false) : qbjVar;
                if (list2.size() >= 9) {
                    qbjVar = new qbj(list2, false);
                }
                vbj vbjVar4 = qbjVar;
                do {
                    value3 = p7m0Var4.getValue();
                    Iterable<Object> iterable4 = (Iterable) p7m0Var4.getValue();
                    arrayList3 = new ArrayList(r3d.q(iterable4, 10));
                    for (Object re40Var2 : iterable4) {
                        if (re40Var2 != null) {
                            if (re40Var2 instanceof ze40) {
                                re40Var2 = new ze40(qbjVar2);
                            } else if (re40Var2 instanceof re40) {
                                re40Var2 = new re40(vbjVar4);
                            }
                        }
                        arrayList3.add(re40Var2);
                    }
                } while (!p7m0Var4.m(value3, arrayList3));
                return Unit.f46060a;
            case 3:
                p7m0 p7m0Var5 = d650Var2.g1;
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    rou rouVar = d650Var2.g0;
                    this.j = true;
                    objA2 = rouVar.a(false, this);
                    if (objA2 == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = obj;
                }
                m2c0 m2c0Var = (m2c0) objA2;
                do {
                    value4 = p7m0Var5.getValue();
                    Iterable<ef40> iterable5 = (Iterable) p7m0Var5.getValue();
                    arrayList4 = new ArrayList(r3d.q(iterable5, 10));
                    for (ef40 bf40Var : iterable5) {
                        if (bf40Var instanceof bf40) {
                            bf40Var = new bf40(new rbj(m2c0Var));
                        }
                        arrayList4.add(bf40Var);
                    }
                } while (!p7m0Var5.m(value4, arrayList4));
                return Unit.f46060a;
            case 4:
                p7m0 p7m0Var6 = d650Var2.g1;
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    this.j = true;
                    objR = d650Var2.h0.r(new z7b[0], this);
                    if (objR == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objR = obj;
                }
                ArrayList arrayList9 = ((a3b) objR).f163a;
                ArrayList arrayList10 = new ArrayList();
                for (Object obj4 : arrayList9) {
                    long j = ((vh0) obj4).f;
                    if (j == 2 || j == 0) {
                        arrayList10.add(obj4);
                    }
                }
                ArrayList arrayList11 = new ArrayList(r3d.q(arrayList10, 10));
                Iterator it2 = arrayList10.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    pbj pbjVar = pbj.f26710a;
                    if (!zHasNext) {
                        ArrayList arrayList12 = new ArrayList(arrayList11);
                        if (!arrayList12.isEmpty()) {
                            arrayList12.add(0, new qe40(new p4t(8), pbjVar));
                        }
                        do {
                            value5 = p7m0Var6.getValue();
                            Iterable iterable6 = (Iterable) p7m0Var6.getValue();
                            arrayList5 = new ArrayList();
                            for (Object obj5 : iterable6) {
                                ef40 ef40Var = (ef40) obj5;
                                if (!(ef40Var instanceof qe40) || !(((qe40) ef40Var).f28565a instanceof u4t)) {
                                    arrayList5.add(obj5);
                                }
                            }
                        } while (!p7m0Var6.m(value5, CollectionsKt.q0(arrayList5, arrayList12)));
                        return Unit.f46060a;
                    }
                    vh0 vh0Var = (vh0) it2.next();
                    arrayList11.add(new qe40(new r4t(vh0Var.f37408a, vh0Var.b), pbjVar));
                }
                break;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    ahu ahuVar = d650Var2.z0;
                    bm5 bm5Var = bm5.e;
                    this.j = true;
                    objB = ahuVar.b(bm5Var, this);
                    if (objB == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                ql5 ql5Var = (ql5) objB;
                d650Var2.A0.l(bm5.e, ql5Var);
                d650Var2.t = ql5Var.f28916a;
                d650Var2.a1.getClass();
                d650Var2.g.f(k7k.MyAggregator);
                d650Var2.n.b("my_aggregator", d650Var2.s.g());
                i1w0 i1w0VarC = d650Var2.h.c();
                if (i1w0VarC != null) {
                    d650Var2.d.a(i1w0VarC, true, d650Var2.t);
                }
                return Unit.f46060a;
            case 6:
                boolean z8 = this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                if (z8) {
                    int i2 = d650.k1;
                    d650Var2.d0();
                }
                return Unit.f46060a;
            default:
                p7m0 p7m0Var7 = d650Var2.g1;
                wne wneVar8 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    do {
                        value6 = p7m0Var7.getValue();
                        Iterable<ef40> iterable7 = (Iterable) p7m0Var7.getValue();
                        arrayList6 = new ArrayList(r3d.q(iterable7, 10));
                        for (ef40 we40Var2 : iterable7) {
                            if (we40Var2 instanceof we40) {
                                vbj vbjVar5 = ((we40) we40Var2).f39002a;
                                if (vbjVar5 instanceof qbj) {
                                    we40Var2 = new we40(new qbj(new sh10(true, ((sh10) ((qbj) vbjVar5).f28448a).b), false));
                                }
                            }
                            arrayList6.add(we40Var2);
                        }
                    } while (!p7m0Var7.m(value6, arrayList6));
                    xfu xfuVar = d650Var2.S;
                    String strA3 = d650Var2.U.a();
                    this.j = true;
                    objC = ((qi10) xfuVar.f40810a).c(strA3, this);
                    if (objC == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objC = obj;
                }
                wi10 wi10Var = (wi10) objC;
                do {
                    value7 = p7m0Var7.getValue();
                    Iterable<ef40> iterable8 = (Iterable) p7m0Var7.getValue();
                    arrayList7 = new ArrayList(r3d.q(iterable8, 10));
                    for (ef40 te40Var3 : iterable8) {
                        if ((te40Var3 instanceof we40) && (((we40) te40Var3).f39002a instanceof qbj)) {
                            te40Var3 = new we40(new qbj(new sh10(false, wi10Var), false));
                        } else if (te40Var3 instanceof te40) {
                            te40 te40Var4 = (te40) te40Var3;
                            vbj vbjVar6 = te40Var4.b;
                            if (vbjVar6 instanceof qbj) {
                                Object obj6 = ((qbj) vbjVar6).f28448a;
                                te40Var3 = new te40(te40Var4.f33801a, new qbj(new zh10(((zh10) obj6).f44370a, yh10.a(((zh10) obj6).b, wi10Var)), false));
                            }
                        }
                        arrayList7.add(te40Var3);
                    }
                } while (!p7m0Var7.m(value7, arrayList7));
                return Unit.f46060a;
        }
    }
}
