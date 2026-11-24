package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class vvk0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ iwk0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vvk0(iwk0 iwk0Var, yje yjeVar, byte b) {
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
                vvk0 vvk0Var = new vvk0(iwk0Var, yjeVar, (byte) 0);
                vvk0Var.j = obj;
                return vvk0Var;
            case 1:
                vvk0 vvk0Var2 = new vvk0(iwk0Var, yjeVar, (byte) 1);
                vvk0Var2.j = obj;
                return vvk0Var2;
            case 2:
                vvk0 vvk0Var3 = new vvk0(iwk0Var, yjeVar, (byte) 2);
                vvk0Var3.j = obj;
                return vvk0Var3;
            case 3:
                vvk0 vvk0Var4 = new vvk0(iwk0Var, yjeVar, (byte) 3);
                vvk0Var4.j = obj;
                return vvk0Var4;
            case 4:
                vvk0 vvk0Var5 = new vvk0(iwk0Var, yjeVar, (byte) 4);
                vvk0Var5.j = obj;
                return vvk0Var5;
            case 5:
                vvk0 vvk0Var6 = new vvk0(iwk0Var, yjeVar, (byte) 5);
                vvk0Var6.j = obj;
                return vvk0Var6;
            case 6:
                vvk0 vvk0Var7 = new vvk0(iwk0Var, yjeVar, (byte) 6);
                vvk0Var7.j = obj;
                return vvk0Var7;
            case 7:
                vvk0 vvk0Var8 = new vvk0(iwk0Var, yjeVar, (byte) 7);
                vvk0Var8.j = obj;
                return vvk0Var8;
            case 8:
                vvk0 vvk0Var9 = new vvk0(iwk0Var, yjeVar, (byte) 8);
                vvk0Var9.j = obj;
                return vvk0Var9;
            case 9:
                vvk0 vvk0Var10 = new vvk0(iwk0Var, yjeVar, (byte) 9);
                vvk0Var10.j = obj;
                return vvk0Var10;
            case 10:
                vvk0 vvk0Var11 = new vvk0(iwk0Var, yjeVar, (byte) 10);
                vvk0Var11.j = obj;
                return vvk0Var11;
            case 11:
                vvk0 vvk0Var12 = new vvk0(iwk0Var, yjeVar, (byte) 11);
                vvk0Var12.j = obj;
                return vvk0Var12;
            case 12:
                vvk0 vvk0Var13 = new vvk0(iwk0Var, yjeVar, (byte) 12);
                vvk0Var13.j = obj;
                return vvk0Var13;
            default:
                vvk0 vvk0Var14 = new vvk0(iwk0Var, yjeVar, (byte) 13);
                vvk0Var14.j = obj;
                return vvk0Var14;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((vvk0) create((dqk0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((vvk0) create((dqk0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((vvk0) create((dqk0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((vvk0) create((dqk0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((vvk0) create((dqk0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((vvk0) create((dqk0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((vvk0) create((dqk0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((vvk0) create((dqk0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((vvk0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((vvk0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((vvk0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((vvk0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((vvk0) create((ktk0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((vvk0) create((dqk0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        wsk0 wsk0Var = wsk0.f39697a;
        ysk0 ysk0Var = ysk0.f43172a;
        vsk0 vsk0Var = vsk0.f37956a;
        yje yjeVar = null;
        iwk0 iwk0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                dqk0 dqk0Var = (dqk0) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (dqk0Var != null) {
                    if (dqk0Var instanceof bqk0) {
                        wrk0 wrk0Var = new wrk0(wsk0Var, null);
                        int i = iwk0.X0;
                        iwk0Var.W(wrk0Var);
                    } else if (dqk0Var instanceof cqk0) {
                        Object obj3 = ((cqk0) dqk0Var).f4798a;
                        if (obj3 instanceof m0) {
                            wrk0 wrk0Var2 = new wrk0(vsk0Var, null);
                            int i2 = iwk0.X0;
                            iwk0Var.W(wrk0Var2);
                        } else {
                            wrk0 wrk0Var3 = new wrk0(ysk0Var, (o0) obj3);
                            int i3 = iwk0.X0;
                            iwk0Var.W(wrk0Var3);
                        }
                    }
                    v3c.N(iwk0Var.H0);
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 1:
                dqk0 dqk0Var2 = (dqk0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (dqk0Var2 != null) {
                    if (dqk0Var2 instanceof bqk0) {
                        yrk0 yrk0Var = new yrk0(wsk0Var, iun.f15405a);
                        int i4 = iwk0.X0;
                        iwk0Var.W(yrk0Var);
                    } else if (dqk0Var2 instanceof cqk0) {
                        List list = (List) ((cqk0) dqk0Var2).f4798a;
                        if (list.isEmpty()) {
                            yrk0 yrk0Var2 = new yrk0(vsk0Var, iun.f15405a);
                            int i5 = iwk0.X0;
                            iwk0Var.W(yrk0Var2);
                        } else {
                            yrk0 yrk0Var3 = new yrk0(ysk0Var, list);
                            int i6 = iwk0.X0;
                            iwk0Var.W(yrk0Var3);
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 2:
                dqk0 dqk0Var3 = (dqk0) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (dqk0Var3 != null) {
                    if (dqk0Var3 instanceof bqk0) {
                        zrk0 zrk0Var = new zrk0(wsk0Var, iun.f15405a);
                        int i7 = iwk0.X0;
                        iwk0Var.W(zrk0Var);
                    } else if (dqk0Var3 instanceof cqk0) {
                        List list2 = (List) ((cqk0) dqk0Var3).f4798a;
                        if (list2.isEmpty()) {
                            zrk0 zrk0Var2 = new zrk0(vsk0Var, iun.f15405a);
                            int i8 = iwk0.X0;
                            iwk0Var.W(zrk0Var2);
                        } else {
                            zrk0 zrk0Var3 = new zrk0(ysk0Var, list2);
                            int i9 = iwk0.X0;
                            iwk0Var.W(zrk0Var3);
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 3:
                dqk0 dqk0Var4 = (dqk0) obj2;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (dqk0Var4 != null) {
                    if (dqk0Var4 instanceof bqk0) {
                        ask0 ask0Var = new ask0(wsk0Var, iun.f15405a);
                        int i10 = iwk0.X0;
                        iwk0Var.W(ask0Var);
                    } else if (dqk0Var4 instanceof cqk0) {
                        List list3 = (List) ((cqk0) dqk0Var4).f4798a;
                        if (list3.isEmpty()) {
                            ask0 ask0Var2 = new ask0(vsk0Var, iun.f15405a);
                            int i11 = iwk0.X0;
                            iwk0Var.W(ask0Var2);
                        } else {
                            ask0 ask0Var3 = new ask0(ysk0Var, list3);
                            int i12 = iwk0.X0;
                            iwk0Var.W(ask0Var3);
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 4:
                dqk0 dqk0Var5 = (dqk0) obj2;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                if (dqk0Var5 != null) {
                    if (dqk0Var5 instanceof bqk0) {
                        bsk0 bsk0Var = new bsk0(wsk0Var, iun.f15405a);
                        int i13 = iwk0.X0;
                        iwk0Var.W(bsk0Var);
                    } else if (dqk0Var5 instanceof cqk0) {
                        List list4 = (List) ((cqk0) dqk0Var5).f4798a;
                        if (list4.isEmpty()) {
                            bsk0 bsk0Var2 = new bsk0(vsk0Var, iun.f15405a);
                            int i14 = iwk0.X0;
                            iwk0Var.W(bsk0Var2);
                        } else {
                            bsk0 bsk0Var3 = new bsk0(ysk0Var, list4);
                            int i15 = iwk0.X0;
                            iwk0Var.W(bsk0Var3);
                        }
                    }
                    v3c.N(iwk0Var.F0);
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 5:
                dqk0 dqk0Var6 = (dqk0) obj2;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                if (dqk0Var6 != null) {
                    if (dqk0Var6 instanceof bqk0) {
                        fsk0 fsk0Var = new fsk0(wsk0Var, iun.f15405a);
                        int i16 = iwk0.X0;
                        iwk0Var.W(fsk0Var);
                    } else if (dqk0Var6 instanceof cqk0) {
                        List list5 = (List) ((cqk0) dqk0Var6).f4798a;
                        if (list5.isEmpty()) {
                            fsk0 fsk0Var2 = new fsk0(vsk0Var, iun.f15405a);
                            int i17 = iwk0.X0;
                            iwk0Var.W(fsk0Var2);
                        } else {
                            fsk0 fsk0Var3 = new fsk0(ysk0Var, list5);
                            int i18 = iwk0.X0;
                            iwk0Var.W(fsk0Var3);
                        }
                    }
                    v3c.N(iwk0Var.G0);
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 6:
                dqk0 dqk0Var7 = (dqk0) obj2;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                if (dqk0Var7 != null) {
                    if (dqk0Var7 instanceof bqk0) {
                        gsk0 gsk0Var = new gsk0(wsk0Var, iun.f15405a);
                        int i19 = iwk0.X0;
                        iwk0Var.W(gsk0Var);
                    } else if (dqk0Var7 instanceof cqk0) {
                        List list6 = (List) ((cqk0) dqk0Var7).f4798a;
                        if (list6.isEmpty()) {
                            gsk0 gsk0Var2 = new gsk0(vsk0Var, iun.f15405a);
                            int i20 = iwk0.X0;
                            iwk0Var.W(gsk0Var2);
                        } else {
                            gsk0 gsk0Var3 = new gsk0(ysk0Var, list6);
                            int i21 = iwk0.X0;
                            iwk0Var.W(gsk0Var3);
                        }
                    }
                    v3c.N(iwk0Var.J0);
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 7:
                dqk0 dqk0Var8 = (dqk0) obj2;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                if (dqk0Var8 != null) {
                    if (dqk0Var8 instanceof bqk0) {
                        jsk0 jsk0Var = new jsk0(wsk0Var, iun.f15405a);
                        int i22 = iwk0.X0;
                        iwk0Var.W(jsk0Var);
                    } else if (dqk0Var8 instanceof cqk0) {
                        List list7 = (List) ((cqk0) dqk0Var8).f4798a;
                        if (list7.isEmpty()) {
                            jsk0 jsk0Var2 = new jsk0(vsk0Var, iun.f15405a);
                            int i23 = iwk0.X0;
                            iwk0Var.W(jsk0Var2);
                        } else {
                            jsk0 jsk0Var3 = new jsk0(ysk0Var, list7);
                            int i24 = iwk0.X0;
                            iwk0Var.W(jsk0Var3);
                        }
                    }
                    v3c.N(iwk0Var.I0);
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 8:
                List list8 = (List) obj2;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                ArrayList arrayList = new ArrayList(r3d.q(list8, 10));
                Iterator it = list8.iterator();
                while (it.hasNext()) {
                    axq.t(((rfp0) it.next()).b, arrayList);
                }
                int i25 = iwk0.X0;
                v3c.N(iwk0Var.O0);
                boolean z = ((dvk0) iwk0Var.D()).j.f20453a.f39554a instanceof atk0;
                xsk0 xsk0Var = xsk0.f41421a;
                if (z) {
                    iwk0Var.W(new esk0(xsk0Var, iun.f15405a));
                }
                iwk0Var.O0 = i3t0.L(iwk0Var, new fnq(iwk0Var.B.a(), new hwk0(iwk0Var, arrayList, yjeVar, (byte) 2), (byte) 4), null, null, 3);
                v3c.N(iwk0Var.P0);
                if (((dvk0) iwk0Var.D()).j.b.f37816a instanceof atk0) {
                    iwk0Var.W(new dsk0(xsk0Var, iun.f15405a));
                }
                iwk0Var.P0 = i3t0.L(iwk0Var, new fnq(iwk0Var.C.d(), new hwk0(iwk0Var, arrayList, yjeVar, (byte) 1), (byte) 4), null, null, 3);
                v3c.N(iwk0Var.Q0);
                if (((dvk0) iwk0Var.D()).j.c.f25654a instanceof atk0) {
                    iwk0Var.W(new csk0(xsk0Var, iun.f15405a, xun.f41520a));
                }
                iwk0Var.Q0 = i3t0.L(iwk0Var, new fnq(iwk0Var.D.a(n0w.f22720a), new hwk0(iwk0Var, arrayList, yjeVar, (byte) 0), (byte) 4), null, null, 3);
                if (list8.isEmpty()) {
                    iwk0Var.W(new psk0(vsk0Var, iun.f15405a));
                } else {
                    iwk0Var.W(new psk0(ysk0Var, list8));
                }
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                iwk0Var.E.b((Throwable) obj2, new awk0(iwk0Var, (byte) 3));
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                kv80 kv80Var = new kv80((List) obj2, (byte) 12);
                int i26 = iwk0.X0;
                iwk0Var.H(kv80Var);
                return Unit.f46060a;
            case 11:
                List list9 = (List) obj2;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                ArrayList arrayList2 = new ArrayList(r3d.q(list9, 10));
                Iterator it2 = list9.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((ftk0) it2.next()).f10116a);
                }
                mo1 mo1Var = new mo1(arrayList2, (byte) 5);
                int i27 = iwk0.X0;
                iwk0Var.H(mo1Var);
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                edk0 edk0Var = new edk0((ktk0) obj2, (byte) 5);
                int i28 = iwk0.X0;
                iwk0Var.H(edk0Var);
                return Unit.f46060a;
            default:
                dqk0 dqk0Var9 = (dqk0) obj2;
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                if (dqk0Var9 != null) {
                    if (dqk0Var9 instanceof bqk0) {
                        iwk0Var.E.b(((bqk0) dqk0Var9).f3036a, new awk0(iwk0Var, (byte) 9));
                    } else if (dqk0Var9 instanceof cqk0) {
                        List list10 = (List) ((cqk0) dqk0Var9).f4798a;
                        if (list10.isEmpty()) {
                            tsk0 tsk0Var = new tsk0(vsk0Var, iun.f15405a);
                            int i29 = iwk0.X0;
                            iwk0Var.W(tsk0Var);
                        } else {
                            tsk0 tsk0Var2 = new tsk0(ysk0Var, list10);
                            int i30 = iwk0.X0;
                            iwk0Var.W(tsk0Var2);
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
