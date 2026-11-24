package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.app_update.api.presentation.AppUpdateScreenParams;
import org.xplatform.app_update.impl.navigation.AppUpdateScreenFactoryImpl$getAppUpdateScreen$1;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class bdj0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ odj0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bdj0(odj0 odj0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = odj0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        odj0 odj0Var = this.k;
        switch (b) {
            case 0:
                return new bdj0(odj0Var, yjeVar, (byte) 0);
            case 1:
                return new bdj0(odj0Var, yjeVar, (byte) 1);
            case 2:
                return new bdj0(odj0Var, yjeVar, (byte) 2);
            case 3:
                return new bdj0(odj0Var, yjeVar, (byte) 3);
            case 4:
                return new bdj0(odj0Var, yjeVar, (byte) 4);
            case 5:
                return new bdj0(odj0Var, yjeVar, (byte) 5);
            case 6:
                return new bdj0(odj0Var, yjeVar, (byte) 6);
            case 7:
                return new bdj0(odj0Var, yjeVar, (byte) 7);
            case 8:
                return new bdj0(odj0Var, yjeVar, (byte) 8);
            case 9:
                return new bdj0(odj0Var, yjeVar, (byte) 9);
            case 10:
                bdj0 bdj0Var = new bdj0(odj0Var, yjeVar, (byte) 10);
                bdj0Var.j = ((Boolean) obj).booleanValue();
                return bdj0Var;
            default:
                return new bdj0(odj0Var, yjeVar, (byte) 11);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((bdj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((bdj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((bdj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((bdj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((bdj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((bdj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((bdj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((bdj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((bdj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((bdj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((bdj0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((bdj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objE;
        Object objN;
        Object objF;
        m2c0 m2c0VarC;
        Object objA2;
        Object objN2;
        Object objA3;
        Object objA4;
        Object objI;
        Object objI2;
        Object value;
        Object objN3;
        byte b = this.i;
        Object[] objArr = 0;
        odj0 odj0Var = this.k;
        yje yjeVar = null;
        byte b2 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    odj0Var.k0.a();
                    rou rouVar = odj0Var.L;
                    this.j = true;
                    objA = rouVar.a(false, this);
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
                if (((m2c0) objA).m0) {
                    int i = odj0.V0;
                    odj0Var.G(pcj0.f26763a);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    a6u a6uVar = odj0Var.v0;
                    this.j = true;
                    objE = a6uVar.E(true, this);
                    if (objE == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objE = obj;
                }
                odj0Var.G(new xbj0(nsm0.l((String) objE, odj0Var.T.a())));
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    ieu ieuVar = odj0Var.u;
                    boolean z4 = !((tcj0) odj0Var.D()).B;
                    this.j = true;
                    objN = ieu.n(ieuVar, z4, this);
                    if (objN == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objN = obj;
                }
                ql5 ql5Var = (ql5) objN;
                fv60 fv60Var = new fv60(ql5Var.m, ql5Var, (byte) 1);
                int i2 = odj0.V0;
                odj0Var.H(fv60Var);
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    nhf0 nhf0Var = odj0Var.C0;
                    this.j = true;
                    objF = nhf0Var.f(true, false, this);
                    if (objF == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objF = obj;
                }
                gm3 gm3Var = (gm3) objF;
                rek0 rek0Var = odj0Var.D0;
                AppUpdateScreenParams appUpdateScreenParams = new AppUpdateScreenParams(gm3Var.f11523a, gm3Var.b, gm3Var.c);
                rek0Var.getClass();
                AppUpdateScreenFactoryImpl$getAppUpdateScreen$1 appUpdateScreenFactoryImpl$getAppUpdateScreen$1 = new AppUpdateScreenFactoryImpl$getAppUpdateScreen$1(appUpdateScreenParams);
                i1w0 i1w0Var = odj0Var.z;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                if (appUpdateScreenFactoryImpl$getAppUpdateScreen$1 instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) appUpdateScreenFactoryImpl$getAppUpdateScreen$1)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(appUpdateScreenFactoryImpl$getAppUpdateScreen$1)));
                }
                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    if (odj0Var.h0.f15225a.a()) {
                        rou rouVar2 = odj0Var.L;
                        this.j = true;
                        objA2 = rouVar2.a(false, this);
                        if (objA2 == wneVar5) {
                            return wneVar5;
                        }
                    } else {
                        m2c0VarC = u7x.C();
                    }
                    int i3 = odj0.V0;
                    sac.V(jiu0.a(odj0Var), new wvi0((byte) 22), null, odj0Var.F.c, new kbh0(m2c0VarC, odj0Var, yjeVar, (byte) 6), 10);
                    return Unit.f46060a;
                }
                if (!z6) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objA2 = obj;
                m2c0VarC = (m2c0) objA2;
                int i4 = odj0.V0;
                sac.V(jiu0.a(odj0Var), new wvi0((byte) 22), null, odj0Var.F.c, new kbh0(m2c0VarC, odj0Var, yjeVar, (byte) 6), 10);
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    ieu ieuVar2 = odj0Var.u;
                    boolean z8 = !((tcj0) odj0Var.D()).B;
                    this.j = true;
                    objN2 = ieu.n(ieuVar2, z8, this);
                    if (objN2 == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objN2 = obj;
                }
                ql5 ql5Var2 = (ql5) objN2;
                ot otVar = odj0Var.M0;
                bm5 bm5Var = bm5.g;
                otVar.a(bm5Var, ql5Var2);
                jyg0 jyg0Var = odj0Var.N0;
                long j = ql5Var2.f28916a;
                jyg0Var.getClass();
                jyg0Var.f17359a.z(bm5Var, j);
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    rou rouVar3 = odj0Var.L;
                    this.j = true;
                    objA3 = rouVar3.a(false, this);
                    if (objA3 == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA3 = obj;
                }
                odj0Var.E0.f6892a.f42100a.f("DELETED_ACCOUNT_ID_KEY", ((m2c0) objA3).S);
                odj0Var.G(vbj0.f37144a);
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z10 = this.j;
                odj0 odj0Var2 = this.k;
                if (!z10) {
                    z1x.P(obj);
                    nou nouVar = odj0Var2.p0;
                    this.j = true;
                    objA4 = nouVar.a(tl5.c, this);
                    if (objA4 == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA4 = obj;
                }
                ql5 ql5Var3 = (ql5) objA4;
                sac.V(jiu0.a(odj0Var2), new vcj0(odj0Var2, b2), null, odj0Var2.F.b, new zcj0(odj0Var2, ql5Var3.f28916a, ((tcj0) odj0Var2.D()).R == hh5.f13045a, null), 10);
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    cmt cmtVar = odj0Var.Y;
                    this.j = true;
                    objI = ((j910) cmtVar.b).i(this);
                    if (objI == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objI = obj;
                }
                acj0 acj0Var = new acj0(((kf3) objI).f18179a);
                int i5 = odj0.V0;
                odj0Var.G(acj0Var);
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    ieu ieuVar3 = odj0Var.J;
                    this.j = true;
                    objI2 = ieuVar3.i(this);
                    if (objI2 == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objI2 = obj;
                }
                String strO = i4w0.O((elt) objI2, odj0Var.R.l(), odj0Var.K.f6956a.a(), odj0Var.E);
                p7m0 p7m0Var = odj0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, tcj0.a((tcj0) value, false, false, strO, null, null, null, false, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, null, false, false, 0, -9, 2097151)));
                odj0Var.G(new ccj0(strO));
                return Unit.f46060a;
            case 10:
                boolean z13 = this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                int i6 = odj0.V0;
                byte b3 = 3;
                odj0Var.H(new cxi0((byte) 3, z13));
                p7m0 p7m0Var2 = odj0Var.i.f25029a;
                while (true) {
                    Object value2 = p7m0Var2.getValue();
                    value2.getClass();
                    boolean z14 = z13;
                    if (p7m0Var2.m(value2, tcj0.a((tcj0) value2, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, z14, 0, false, null, false, false, 0, -268435457, 2097151))) {
                        sac.V(jiu0.a(odj0Var), new vcj0(odj0Var, b3), new wcj0(odj0Var, (byte) 0), null, new fdj0(odj0Var, yjeVar, objArr == true ? 1 : 0), 12);
                        return Unit.f46060a;
                    }
                    z13 = z14;
                }
                break;
            default:
                wne wneVar12 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    ieu ieuVar4 = odj0Var.u;
                    boolean z16 = !((tcj0) odj0Var.D()).B;
                    this.j = true;
                    objN3 = ieu.n(ieuVar4, z16, this);
                    if (objN3 == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objN3 = obj;
                }
                String str = ((ql5) objN3).f;
                int i7 = odj0.V0;
                baj0 baj0Var = new baj0(odj0Var.u0.a(), str, ((tcj0) odj0Var.D()).K ? false : odj0Var.s0.g());
                p7m0 p7m0Var3 = odj0Var.i.f25029a;
                while (true) {
                    Object value3 = p7m0Var3.getValue();
                    value3.getClass();
                    baj0 baj0Var2 = baj0Var;
                    if (p7m0Var3.m(value3, tcj0.a((tcj0) value3, false, false, null, null, null, null, false, null, false, false, null, baj0Var2, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, null, false, false, 0, -16385, 2097151))) {
                        return Unit.f46060a;
                    }
                    baj0Var = baj0Var2;
                }
                break;
        }
    }
}
