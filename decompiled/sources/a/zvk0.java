package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.special_event.impl.special_event_tab.presentation.model.SpecialEventTabScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final class zvk0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ iwk0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zvk0(iwk0 iwk0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = iwk0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        iwk0 iwk0Var = this.k;
        switch (b) {
            case 0:
                return new zvk0(iwk0Var, yjeVar, (byte) 0);
            case 1:
                return new zvk0(iwk0Var, yjeVar, (byte) 1);
            case 2:
                return new zvk0(iwk0Var, yjeVar, (byte) 2);
            case 3:
                return new zvk0(iwk0Var, yjeVar, (byte) 3);
            case 4:
                return new zvk0(iwk0Var, yjeVar, (byte) 4);
            case 5:
                return new zvk0(iwk0Var, yjeVar, (byte) 5);
            default:
                zvk0 zvk0Var = new zvk0(iwk0Var, yjeVar, (byte) 6);
                zvk0Var.j = ((Boolean) obj).booleanValue();
                return zvk0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((zvk0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((zvk0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((zvk0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((zvk0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((zvk0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((zvk0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((zvk0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objA2;
        Object objD0;
        Object objA3;
        Object objD1;
        Object objA4;
        Object value;
        xsk0 xsk0Var;
        byte b;
        gmq eu4Var;
        gmq eu4Var2;
        byte b2;
        gmq eu4Var3;
        gmq eu4Var4;
        char c;
        gmq eu4Var5;
        byte b3 = this.i;
        wsk0 wsk0Var = wsk0.f39697a;
        ysk0 ysk0Var = ysk0.f43172a;
        vsk0 vsk0Var = vsk0.f37956a;
        iwk0 iwk0Var = this.k;
        yje yjeVar = null;
        byte b4 = 1;
        switch (b3) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    fxt fxtVar = iwk0Var.L;
                    int i = iwk0Var.p.f46974a;
                    this.j = true;
                    objA = fxtVar.a(i, this);
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
                List list = (List) objA;
                if (list.isEmpty()) {
                    hsk0 hsk0Var = new hsk0(vsk0Var, iun.f15405a);
                    int i2 = iwk0.X0;
                    iwk0Var.W(hsk0Var);
                } else {
                    hsk0 hsk0Var2 = new hsk0(ysk0Var, list);
                    int i3 = iwk0.X0;
                    iwk0Var.W(hsk0Var2);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    iuu iuuVar = iwk0Var.t;
                    List listA = iwk0Var.A.f20692a.a();
                    ArrayList arrayList = new ArrayList(r3d.q(listA, 10));
                    Iterator it = listA.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((lok0) it.next()).f20396a));
                    }
                    int iIndexOf = arrayList.indexOf(Integer.valueOf(iwk0Var.p.f46974a));
                    ArrayList arrayList2 = new ArrayList(r3d.q(listA, 10));
                    Iterator it2 = listA.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Integer.valueOf(((lok0) it2.next()).q));
                    }
                    int iIntValue = ((Number) arrayList2.get(iIndexOf)).intValue();
                    this.j = true;
                    objA2 = iuuVar.a(iIntValue, this);
                    if (objA2 == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = obj;
                }
                List list2 = (List) objA2;
                if (list2.isEmpty()) {
                    ksk0 ksk0Var = new ksk0(vsk0Var, iun.f15405a);
                    int i4 = iwk0.X0;
                    iwk0Var.W(ksk0Var);
                } else {
                    ksk0 ksk0Var2 = new ksk0(ysk0Var, list2);
                    int i5 = iwk0.X0;
                    iwk0Var.W(ksk0Var2);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    hnu hnuVar = iwk0Var.f0;
                    int i6 = iwk0Var.p.f46974a;
                    this.j = true;
                    w1e0 w1e0Var = (w1e0) hnuVar.f13365a;
                    objD0 = qjj.d0(w1e0Var.f38394a.b, new v1e0(w1e0Var, i6, null), this);
                    if (objD0 == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD0 = obj;
                }
                dqk0 dqk0Var = (dqk0) objD0;
                if (dqk0Var != null) {
                    if (dqk0Var instanceof bqk0) {
                        lsk0 lsk0Var = new lsk0(wsk0Var, iun.f15405a);
                        int i7 = iwk0.X0;
                        iwk0Var.W(lsk0Var);
                    } else if (dqk0Var instanceof cqk0) {
                        List list3 = (List) ((cqk0) dqk0Var).f4798a;
                        if (list3.isEmpty()) {
                            lsk0 lsk0Var2 = new lsk0(vsk0Var, iun.f15405a);
                            int i8 = iwk0.X0;
                            iwk0Var.W(lsk0Var2);
                        } else {
                            lsk0 lsk0Var3 = new lsk0(ysk0Var, list3);
                            int i9 = iwk0.X0;
                            iwk0Var.W(lsk0Var3);
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    xsu xsuVar = iwk0Var.H;
                    int i10 = iwk0Var.p.f46974a;
                    this.j = true;
                    objA3 = ((ggm0) xsuVar.f41434a).a(i10, this);
                    if (objA3 == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA3 = obj;
                }
                List list4 = (List) objA3;
                if (list4.isEmpty()) {
                    nsk0 nsk0Var = new nsk0(vsk0Var, iun.f15405a);
                    int i11 = iwk0.X0;
                    iwk0Var.W(nsk0Var);
                } else {
                    ArrayList arrayList3 = new ArrayList(r3d.q(list4, 10));
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        axq.t(((wwl0) it3.next()).f39890a, arrayList3);
                    }
                    int i12 = iwk0.X0;
                    iwk0Var.P(arrayList3);
                    iwk0Var.W(new nsk0(ysk0Var, list4));
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    fzu fzuVar = iwk0Var.F;
                    int i13 = iwk0Var.p.f46974a;
                    this.j = true;
                    dhm0 dhm0Var = fzuVar.f10428a;
                    objD1 = qjj.d0(dhm0Var.f6098a.b, new chm0(dhm0Var, i13, yjeVar, (byte) 0), this);
                    if (objD1 == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD1 = obj;
                }
                cxq0 cxq0Var = (cxq0) objD1;
                h3r0 h3r0Var = cxq0Var.b;
                List list5 = cxq0Var.f5135a;
                if (h3r0Var.f12400a.isEmpty() || list5.isEmpty()) {
                    iun iunVar = iun.f15405a;
                    qsk0 qsk0Var = new qsk0(vsk0Var, iunVar, iunVar, iunVar);
                    int i14 = iwk0.X0;
                    iwk0Var.W(qsk0Var);
                } else {
                    qsk0 qsk0Var2 = new qsk0(ysk0Var, ((u3r0) h3r0Var.f12400a.get(0)).c, h3r0Var.b, list5);
                    int i15 = iwk0.X0;
                    iwk0Var.W(qsk0Var2);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    xsu xsuVar2 = iwk0Var.H;
                    int i16 = iwk0Var.p.f46974a;
                    this.j = true;
                    objA4 = ((ggm0) xsuVar2.f41434a).a(i16, this);
                    if (objA4 == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA4 = obj;
                }
                List list6 = (List) objA4;
                if (list6.isEmpty()) {
                    ssk0 ssk0Var = new ssk0(vsk0Var, iun.f15405a);
                    int i17 = iwk0.X0;
                    iwk0Var.W(ssk0Var);
                } else {
                    ArrayList arrayList4 = new ArrayList(r3d.q(list6, 10));
                    Iterator it4 = list6.iterator();
                    while (it4.hasNext()) {
                        axq.t(((wwl0) it4.next()).f39890a, arrayList4);
                    }
                    int i18 = iwk0.X0;
                    iwk0Var.P(arrayList4);
                    iwk0Var.W(new ssk0(ysk0Var, list6));
                }
                return Unit.f46060a;
            default:
                boolean z7 = this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                oyg0 oyg0Var = iwk0Var.f;
                ocj ocjVar = iwk0Var.i;
                SpecialEventTabScreenParams specialEventTabScreenParams = iwk0Var.p;
                dvk0 dvk0Var = (dvk0) iwk0Var.D();
                if (z7) {
                    cmt cmtVar = iwk0Var.k0;
                    boolean z8 = specialEventTabScreenParams.d;
                    byte b5 = 7;
                    byte b6 = 14;
                    byte b7 = 4;
                    xsk0 xsk0Var2 = xsk0.f41421a;
                    if (z8) {
                        c4m0 c4m0Var = iwk0Var.x0;
                        if (c4m0Var == null || !c4m0Var.isActive()) {
                            if (!g7x.O(((dvk0) iwk0Var.D()).d.f32047a)) {
                                iun iunVar2 = iun.f15405a;
                                iwk0Var.W(new xrk0(xsk0Var2, iunVar2, iunVar2, iunVar2, false));
                            }
                            qgd qgdVar = iwk0Var.t0;
                            iwk0Var.x0 = i3t0.L(iwk0Var, new p6d(new fnq(dub.f0(((e1u) qgdVar.b).a(), ((n4u) qgdVar.c).d(), ((f4u) qgdVar.d).a(n0w.f22720a), new fl9(qgdVar, yjeVar, b7)), new j0s(qgdVar, yjeVar, b6), (byte) 4), ((jtk0) ((dpi0) cmtVar.b).f6468a).f17105a, new p4b0(iwk0Var, yjeVar, b5), (byte) 1), null, null, 3);
                        } else {
                            xsk0Var2 = xsk0Var2;
                        }
                        iwk0Var.O();
                        edu eduVar = iwk0Var.o0;
                        v8l0 v8l0Var = (v8l0) ((ani0) eduVar.c).f1155a;
                        i3t0.L(iwk0Var, new p6d(new p6d(new qaf0(v8l0Var.f, (byte) 6), v8l0Var.e, new fe0((Object) eduVar, yjeVar, (byte) 8), (byte) 1), iwk0Var.p0.a(), new ib60(iwk0Var, yjeVar, b6), (byte) 1), null, null, 3);
                        fhj fhjVar = iwk0Var.r0;
                        i3t0.L(iwk0Var, new fnq(new p6d(new i89(((gl9) ((ok50) fhjVar.b).f25390a).d, (byte) 3), new h2c(((jtk0) ((dpi0) fhjVar.f9543a).f6468a).f17105a, (byte) 21), new yno(3, null, (byte) 1), (byte) 1), new vvk0(iwk0Var, yjeVar, (byte) 11), (byte) 4), null, null, 3);
                        i3t0.L(iwk0Var, new fnq(((jtk0) ((dpi0) cmtVar.b).f6468a).f17105a, new vvk0(iwk0Var, yjeVar, (byte) 12), (byte) 4), null, null, 3);
                    } else {
                        xsk0Var2 = xsk0Var2;
                    }
                    mtk0 mtk0Var = mtk0.f22375a;
                    p7m0 p7m0Var = ocjVar.f25029a;
                    while (true) {
                        Object value2 = p7m0Var.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                        if (p7m0Var.m(value2, dvk0.a((dvk0) value2, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, mtk0Var, 939524095))) {
                            mne mneVar = iwk0Var.r;
                            dvk0 dvk0Var2 = (dvk0) iwk0Var.D();
                            dvk0Var2.getClass();
                            List list7 = dvk0Var2.e;
                            ArrayList<quk0> arrayList5 = new ArrayList();
                            for (Object obj2 : list7) {
                                if (obj2 instanceof quk0) {
                                    arrayList5.add(obj2);
                                }
                            }
                            for (quk0 quk0Var : arrayList5) {
                                if (quk0Var != null) {
                                    if (quk0Var instanceof juk0) {
                                        v3c.N(iwk0Var.D0);
                                        if (g7x.O(((dvk0) iwk0Var.D()).m.f10220a)) {
                                            xsk0Var = xsk0Var2;
                                        } else {
                                            iun iunVar3 = iun.f15405a;
                                            xsk0Var = xsk0Var2;
                                            iwk0Var.W(new qsk0(xsk0Var, iunVar3, iunVar3, iunVar3));
                                        }
                                        iwk0Var.D0 = sac.g0(jiu0.a(iwk0Var), iwk0.class.getSimpleName().concat(".loadTopPlayers"), mneVar.f22085a, new rvk0(iwk0Var, (byte) 10), new zvk0(iwk0Var, yjeVar, b7), 80);
                                    } else {
                                        xsk0Var = xsk0Var2;
                                        if (quk0Var instanceof huk0) {
                                            iwk0Var.O();
                                        } else {
                                            byte b8 = 2;
                                            if (quk0Var instanceof cuk0) {
                                                v3c.N(iwk0Var.E0);
                                                if (!g7x.O(((dvk0) iwk0Var.D()).o.f25833a)) {
                                                    iwk0Var.W(new hsk0(xsk0Var, iun.f15405a));
                                                }
                                                iwk0Var.E0 = sac.g0(jiu0.a(iwk0Var), iwk0.class.getSimpleName().concat(".loadMedalsTable"), mneVar.f22085a, new rvk0(iwk0Var, (byte) 2), new zvk0(iwk0Var, yjeVar, (byte) 0), 80);
                                            } else {
                                                byte b9 = 5;
                                                if (quk0Var instanceof ztk0) {
                                                    bby bbyVar = iwk0Var.z0;
                                                    if (bbyVar != null) {
                                                        v3c.N(bbyVar);
                                                    }
                                                    if (!g7x.O(((dvk0) iwk0Var.D()).k.f27666a)) {
                                                        iwk0Var.W(new ssk0(xsk0Var, iun.f15405a));
                                                    }
                                                    iwk0Var.z0 = sac.g0(jiu0.a(iwk0Var), iwk0.class.getSimpleName().concat(".loadVenues"), mneVar.f22085a, new rvk0(iwk0Var, (byte) 11), new zvk0(iwk0Var, yjeVar, b9), 80);
                                                } else {
                                                    byte b10 = 9;
                                                    if (quk0Var instanceof iuk0) {
                                                        c4m0 c4m0Var2 = iwk0Var.y0;
                                                        if (c4m0Var2 == null || c4m0Var2.isActive() != b4) {
                                                            if (!g7x.O(((dvk0) iwk0Var.D()).i.f8473a)) {
                                                                iwk0Var.W(new psk0(xsk0Var, iun.f15405a));
                                                            }
                                                            iwk0Var.y0 = sac.T(new fnq(bkb.j0(iwk0Var.s.a(specialEventTabScreenParams.f46974a), iwk0.class.getSimpleName().concat(".loadTeams"), null, 56), new vvk0(iwk0Var, yjeVar, (byte) 8), (byte) 4), d5c.S(jiu0.a(iwk0Var), mneVar.f22085a), new vvk0(iwk0Var, yjeVar, b10));
                                                        }
                                                    } else {
                                                        byte b11 = 13;
                                                        if (quk0Var instanceof kuk0) {
                                                            v3c.N(iwk0Var.R0);
                                                            if (!g7x.O(((dvk0) iwk0Var.D()).p.f17256a)) {
                                                                iwk0Var.W(new tsk0(xsk0Var, iun.f15405a));
                                                            }
                                                            iwk0Var.R0 = i3t0.L(iwk0Var, new fnq(iwk0Var.N.a(), new vvk0(iwk0Var, yjeVar, b11), (byte) 4), null, null, 3);
                                                        } else if (quk0Var instanceof euk0) {
                                                            bby bbyVar2 = iwk0Var.A0;
                                                            if (bbyVar2 == null || bbyVar2.isActive() != b4) {
                                                                if (!g7x.O(((dvk0) iwk0Var.D()).l.f31083a)) {
                                                                    iwk0Var.W(new ksk0(xsk0Var, iun.f15405a));
                                                                }
                                                                iwk0Var.A0 = sac.g0(jiu0.a(iwk0Var), iwk0.class.getSimpleName().concat(".loadPromotions"), mneVar.f22085a, new rvk0(iwk0Var, b4), new zvk0(iwk0Var, yjeVar, b4), 80);
                                                            }
                                                        } else if (quk0Var instanceof muk0) {
                                                            iwk0Var.W(isk0.f15308a);
                                                        } else if (quk0Var instanceof nuk0) {
                                                            iwk0Var.W(osk0.f25787a);
                                                        } else if (quk0Var instanceof ouk0) {
                                                            iwk0Var.W(rsk0.f31036a);
                                                        } else if (quk0Var instanceof ytk0) {
                                                            if (((dvk0) iwk0Var.D()).C.d != 40) {
                                                                iwk0Var.W(new bsk0(wsk0Var, iun.f15405a));
                                                            } else {
                                                                v3c.N(iwk0Var.F0);
                                                                if (!g7x.O(((dvk0) iwk0Var.D()).r.f11886a)) {
                                                                    iwk0Var.W(new bsk0(xsk0Var, iun.f15405a));
                                                                }
                                                                o6u o6uVar = iwk0Var.R;
                                                                int i19 = specialEventTabScreenParams.f46974a;
                                                                iwk0Var.F0 = i3t0.L(iwk0Var, new fnq(new fc4(o6uVar.f24756a.a(), (byte) 16), new vvk0(iwk0Var, yjeVar, b7), (byte) 4), null, null, 3);
                                                            }
                                                        } else if (!(quk0Var instanceof auk0)) {
                                                            if (quk0Var instanceof utk0) {
                                                                v3c.N(iwk0Var.H0);
                                                                if (!g7x.O(((dvk0) iwk0Var.D()).q.f11738a)) {
                                                                    iwk0Var.W(new wrk0(xsk0Var, null));
                                                                }
                                                                es esVar = iwk0Var.Q;
                                                                int i20 = specialEventTabScreenParams.f46974a;
                                                                long j = ((dvk0) iwk0Var.D()).C.e;
                                                                if (j == 1) {
                                                                    eu4Var5 = new fc4(((g6u) esVar.b).f10785a.a(), (byte) 14);
                                                                } else {
                                                                    if (j == 2) {
                                                                        eu4Var5 = new fc4(((cju) esVar.f8305a).f4476a.a(), (byte) 22);
                                                                    } else if (j == 46) {
                                                                        c = '\b';
                                                                        eu4Var5 = new fc4(((out) esVar.c).f25893a.a(), (byte) 8);
                                                                    } else {
                                                                        c = '\b';
                                                                        esVar.getClass();
                                                                        eu4Var5 = new eu4(new bqk0(new IllegalStateException("sub sport not found")), (byte) 12);
                                                                    }
                                                                    iwk0Var.H0 = sac.T(new fnq(eu4Var5, new vvk0(iwk0Var, yjeVar, (byte) 0), (byte) 4), d5c.S(jiu0.a(iwk0Var), mneVar.c), wvk0.h);
                                                                }
                                                                c = '\b';
                                                                iwk0Var.H0 = sac.T(new fnq(eu4Var5, new vvk0(iwk0Var, yjeVar, (byte) 0), (byte) 4), d5c.S(jiu0.a(iwk0Var), mneVar.c), wvk0.h);
                                                            } else if (quk0Var instanceof xtk0) {
                                                                v3c.N(iwk0Var.L0);
                                                                if (!g7x.O(((dvk0) iwk0Var.D()).t.f8380a)) {
                                                                    iwk0Var.W(new ask0(xsk0Var, iun.f15405a));
                                                                }
                                                                phf0 phf0Var = iwk0Var.X;
                                                                int i21 = specialEventTabScreenParams.f46974a;
                                                                long j2 = ((dvk0) iwk0Var.D()).C.e;
                                                                if (j2 == 46) {
                                                                    eu4Var4 = new fc4(((zut) phf0Var.f26994a).f45025a.a(), (byte) 12);
                                                                } else if (j2 == 1) {
                                                                    eu4Var4 = new fc4(((v6u) phf0Var.b).f36892a.a(), (byte) 18);
                                                                } else if (j2 == 2) {
                                                                    eu4Var4 = new fc4(((oju) phf0Var.c).f25378a.a(), (byte) 26);
                                                                } else {
                                                                    phf0Var.getClass();
                                                                    eu4Var4 = new eu4(new bqk0(new IllegalStateException("sub sport not found")), (byte) 12);
                                                                }
                                                                iwk0Var.L0 = sac.T(new fnq(eu4Var4, new vvk0(iwk0Var, yjeVar, (byte) 3), (byte) 4), d5c.S(jiu0.a(iwk0Var), mneVar.c), new xvk0(iwk0Var, yjeVar, b8));
                                                                xsk0Var = xsk0Var;
                                                            } else if (quk0Var instanceof duk0) {
                                                                v3c.N(iwk0Var.I0);
                                                                if (g7x.O(((dvk0) iwk0Var.D()).u.f29303a)) {
                                                                    xsk0Var = xsk0Var;
                                                                } else {
                                                                    xsk0Var = xsk0Var;
                                                                    iwk0Var.W(new jsk0(xsk0Var, iun.f15405a));
                                                                }
                                                                lhf0 lhf0Var = iwk0Var.T;
                                                                int i22 = specialEventTabScreenParams.f46974a;
                                                                long j3 = ((dvk0) iwk0Var.D()).C.e;
                                                                if (j3 == 1) {
                                                                    eu4Var3 = new fc4(((r6u) lhf0Var.c).f29951a.a(), (byte) 17);
                                                                } else {
                                                                    if (j3 == 2) {
                                                                        eu4Var3 = new fc4(((lju) lhf0Var.b).f20168a.a(), (byte) 25);
                                                                    } else if (j3 == 46) {
                                                                        eu4Var3 = new fc4(((wut) lhf0Var.d).f39806a.a(), (byte) 11);
                                                                    } else {
                                                                        lhf0Var.getClass();
                                                                        eu4Var3 = new eu4(new bqk0(new IllegalStateException("sub sport not found")), (byte) 12);
                                                                    }
                                                                    iwk0Var.I0 = sac.T(new fnq(eu4Var3, new vvk0(iwk0Var, yjeVar, (byte) 7), (byte) 4), d5c.S(jiu0.a(iwk0Var), mneVar.c), bwk0.h);
                                                                    b = 7;
                                                                }
                                                                iwk0Var.I0 = sac.T(new fnq(eu4Var3, new vvk0(iwk0Var, yjeVar, (byte) 7), (byte) 4), d5c.S(jiu0.a(iwk0Var), mneVar.c), bwk0.h);
                                                                b = 7;
                                                            } else {
                                                                xsk0Var = xsk0Var;
                                                                b = 7;
                                                                if (quk0Var instanceof buk0) {
                                                                    if (((dvk0) iwk0Var.D()).C.d != 40) {
                                                                        iwk0Var.W(new gsk0(wsk0Var, iun.f15405a));
                                                                    } else if (((dvk0) iwk0Var.D()).C.d != 40) {
                                                                        iwk0Var.W(new gsk0(wsk0Var, iun.f15405a));
                                                                        b2 = 6;
                                                                    } else {
                                                                        v3c.N(iwk0Var.J0);
                                                                        if (!g7x.O(((dvk0) iwk0Var.D()).v.f24105a)) {
                                                                            iwk0Var.W(new gsk0(xsk0Var, iun.f15405a));
                                                                        }
                                                                        tut tutVar = iwk0Var.U;
                                                                        int i23 = specialEventTabScreenParams.f46974a;
                                                                        b2 = 6;
                                                                        iwk0Var.J0 = sac.T(new fnq(new fc4(tutVar.f34567a.a(), (byte) 10), new vvk0(iwk0Var, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(iwk0Var), mneVar.c), yvk0.h);
                                                                    }
                                                                } else if (quk0Var instanceof wtk0) {
                                                                    v3c.N(iwk0Var.K0);
                                                                    if (!g7x.O(((dvk0) iwk0Var.D()).w.f6659a)) {
                                                                        iwk0Var.W(new zrk0(xsk0Var, iun.f15405a));
                                                                    }
                                                                    oif0 oif0Var = iwk0Var.V;
                                                                    int i24 = specialEventTabScreenParams.f46974a;
                                                                    long j4 = ((dvk0) iwk0Var.D()).C.e;
                                                                    if (j4 == 1) {
                                                                        eu4Var2 = new fc4(((z6u) oif0Var.b).f43887a.a(), (byte) 19);
                                                                    } else if (j4 == 2) {
                                                                        eu4Var2 = new fc4(((rju) oif0Var.c).f30614a.a(), (byte) 27);
                                                                    } else if (j4 == 46) {
                                                                        eu4Var2 = new fc4(((cvt) oif0Var.d).f5046a.a(), (byte) 13);
                                                                    } else {
                                                                        oif0Var.getClass();
                                                                        eu4Var2 = new eu4(new bqk0(new IllegalStateException("sub sport not found")), (byte) 12);
                                                                    }
                                                                    iwk0Var.K0 = sac.T(new fnq(eu4Var2, new vvk0(iwk0Var, yjeVar, b8), (byte) 4), d5c.S(jiu0.a(iwk0Var), mneVar.c), new xvk0(iwk0Var, yjeVar, (byte) 1));
                                                                    xsk0Var = xsk0Var;
                                                                } else if (quk0Var instanceof guk0) {
                                                                    v3c.N(iwk0Var.M0);
                                                                    if (g7x.O(((dvk0) iwk0Var.D()).x.f1530a)) {
                                                                        xsk0Var = xsk0Var;
                                                                    } else {
                                                                        xsk0Var = xsk0Var;
                                                                        iwk0Var.W(new msk0(xsk0Var, iun.f15405a));
                                                                    }
                                                                    iwk0Var.M0 = sac.V(jiu0.a(iwk0Var), new rvk0(iwk0Var, (byte) 3), null, mneVar.c, new xvk0(iwk0Var, yjeVar, (byte) 3), 10);
                                                                } else {
                                                                    xsk0Var = xsk0Var;
                                                                    if (quk0Var instanceof vtk0) {
                                                                        v3c.N(iwk0Var.N0);
                                                                        if (!g7x.O(((dvk0) iwk0Var.D()).y.f4942a)) {
                                                                            iwk0Var.W(new yrk0(xsk0Var, iun.f15405a));
                                                                        }
                                                                        lhf0 lhf0Var2 = iwk0Var.Z;
                                                                        int i25 = specialEventTabScreenParams.f46974a;
                                                                        long j5 = ((dvk0) iwk0Var.D()).C.e;
                                                                        if (j5 == 46) {
                                                                            eu4Var = new fc4(((oh9) ((a7q) lhf0Var2.b).f384a).a(), (byte) 9);
                                                                        } else if (j5 == 1) {
                                                                            eu4Var = new fc4(((j6u) lhf0Var2.c).f16006a.a(), (byte) 15);
                                                                        } else {
                                                                            if (j5 == 2) {
                                                                                eu4Var = new fc4(((fju) lhf0Var2.d).f9660a.a(), (byte) 23);
                                                                            } else {
                                                                                lhf0Var2.getClass();
                                                                                eu4Var = new eu4(new bqk0(new IllegalStateException("sub sport not found")), (byte) 12);
                                                                            }
                                                                            iwk0Var.N0 = sac.T(new fnq(eu4Var, new vvk0(iwk0Var, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(iwk0Var), mneVar.c), new xvk0(iwk0Var, yjeVar, (byte) 0));
                                                                        }
                                                                        iwk0Var.N0 = sac.T(new fnq(eu4Var, new vvk0(iwk0Var, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(iwk0Var), mneVar.c), new xvk0(iwk0Var, yjeVar, (byte) 0));
                                                                    } else if (quk0Var instanceof fuk0) {
                                                                        v3c.N(iwk0Var.S0);
                                                                        if (!g7x.O(((dvk0) iwk0Var.D()).z.f32777a)) {
                                                                            iwk0Var.W(new lsk0(xsk0Var, iun.f15405a));
                                                                        }
                                                                        iwk0Var.S0 = sac.V(jiu0.a(iwk0Var), new rvk0(iwk0Var, (byte) 5), null, mneVar.c, new zvk0(iwk0Var, yjeVar, b8), 10);
                                                                    }
                                                                }
                                                            }
                                                            b = 7;
                                                        } else if (((dvk0) iwk0Var.D()).C.d != 40) {
                                                            iwk0Var.W(new fsk0(wsk0Var, iun.f15405a));
                                                        } else {
                                                            v3c.N(iwk0Var.G0);
                                                            if (!g7x.O(((dvk0) iwk0Var.D()).s.f20633a)) {
                                                                iwk0Var.W(new fsk0(xsk0Var, iun.f15405a));
                                                            }
                                                            iju ijuVar = iwk0Var.S;
                                                            int i26 = specialEventTabScreenParams.f46974a;
                                                            iwk0Var.G0 = i3t0.L(iwk0Var, new fnq(new fc4(ijuVar.f14894a.a(), (byte) 24), new vvk0(iwk0Var, yjeVar, b9), (byte) 4), null, null, 3);
                                                        }
                                                    }
                                                    b = 7;
                                                }
                                                xsk0Var2 = xsk0Var;
                                                b5 = b;
                                                b4 = 1;
                                            }
                                        }
                                    }
                                    b = b5;
                                    xsk0Var2 = xsk0Var;
                                    b5 = b;
                                    b4 = 1;
                                }
                                t9f.b();
                                return null;
                            }
                        }
                        b4 = 1;
                    }
                } else if (g7x.N(dvk0Var) && !g7x.M(dvk0Var)) {
                    iwk0Var.N();
                    mtk0 mtk0Var2 = mtk0.b;
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value, dvk0.a((dvk0) value, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, mtk0Var2, 939524095)));
                }
                return Unit.f46060a;
        }
    }
}
