package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.app_update.api.presentation.AppUpdateScreenParams;
import org.xplatform.app_update.impl.navigation.AppUpdateScreenFactoryImpl$getAppUpdateScreen$1;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class jxi0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ xxi0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jxi0(xxi0 xxi0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xxi0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        xxi0 xxi0Var = this.k;
        switch (b) {
            case 0:
                return new jxi0(xxi0Var, yjeVar, (byte) 0);
            case 1:
                return new jxi0(xxi0Var, yjeVar, (byte) 1);
            case 2:
                return new jxi0(xxi0Var, yjeVar, (byte) 2);
            case 3:
                return new jxi0(xxi0Var, yjeVar, (byte) 3);
            case 4:
                return new jxi0(xxi0Var, yjeVar, (byte) 4);
            case 5:
                return new jxi0(xxi0Var, yjeVar, (byte) 5);
            case 6:
                return new jxi0(xxi0Var, yjeVar, (byte) 6);
            case 7:
                return new jxi0(xxi0Var, yjeVar, (byte) 7);
            case 8:
                return new jxi0(xxi0Var, yjeVar, (byte) 8);
            case 9:
                return new jxi0(xxi0Var, yjeVar, (byte) 9);
            case 10:
                return new jxi0(xxi0Var, yjeVar, (byte) 10);
            case 11:
                jxi0 jxi0Var = new jxi0(xxi0Var, yjeVar, (byte) 11);
                jxi0Var.j = ((Boolean) obj).booleanValue();
                return jxi0Var;
            case 12:
                return new jxi0(xxi0Var, yjeVar, (byte) 12);
            default:
                return new jxi0(xxi0Var, yjeVar, (byte) 13);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((jxi0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((jxi0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((jxi0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((jxi0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((jxi0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((jxi0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((jxi0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((jxi0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((jxi0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((jxi0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((jxi0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((jxi0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((jxi0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((jxi0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objE;
        Object value;
        Object objF;
        m2c0 m2c0VarC;
        Object objA2;
        Object objA3;
        Object objA4;
        Object objI;
        Object objI2;
        Object value2;
        Object objB;
        byte b = this.i;
        byte b2 = 6;
        xxi0 xxi0Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    xxi0Var.m0.a();
                    rou rouVar = xxi0Var.L;
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
                    int i = xxi0.Y0;
                    xxi0Var.G(l1j0.f19257a);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (z2) {
                    if (z2) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                rou rouVar2 = xxi0Var.L;
                boolean z3 = xxi0Var.N0.r0 || ((twi0) xxi0Var.D()).Q;
                this.j = true;
                Object objA5 = rouVar2.a(z3, this);
                return objA5 == wneVar2 ? wneVar2 : objA5;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (z4) {
                    if (z4) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                tsu tsuVar = xxi0Var.i0;
                boolean z5 = ((twi0) xxi0Var.D()).Q;
                this.j = true;
                Enum enumT = tsuVar.f34479a.t(z5, this);
                return enumT == wneVar3 ? wneVar3 : enumT;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    a6u a6uVar = xxi0Var.z0;
                    this.j = true;
                    objE = a6uVar.E(true, this);
                    if (objE == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objE = obj;
                }
                xxi0Var.G(new u0j0(nsm0.l((String) objE, xxi0Var.U.a())));
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    boolean zA = xxi0Var.j0.f15225a.a();
                    xxi0Var.H(new cxi0((byte) 0, zA));
                    if (zA) {
                        this.j = true;
                        if (xxi0Var.N(this) == wneVar5) {
                            return wneVar5;
                        }
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i2 = xxi0.Y0;
                if (xxi0Var.N0.N.i) {
                    xxi0Var.H(new exi0(xxi0Var.e0.c(), (byte) 0));
                }
                xxi0Var.M(false);
                int iA = xxi0Var.x0.a();
                p7m0 p7m0Var = xxi0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, twi0.a((twi0) value, false, false, null, null, null, null, null, null, null, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, iA, false, false, 0, -1, 2096895)));
                xxi0Var.G(new o0j0(false));
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    nhf0 nhf0Var = xxi0Var.F0;
                    this.j = true;
                    objF = nhf0Var.f(true, false, this);
                    if (objF == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objF = obj;
                }
                gm3 gm3Var = (gm3) objF;
                rek0 rek0Var = xxi0Var.G0;
                AppUpdateScreenParams appUpdateScreenParams = new AppUpdateScreenParams(gm3Var.f11523a, gm3Var.b, gm3Var.c);
                rek0Var.getClass();
                FragmentScreen appUpdateScreenFactoryImpl$getAppUpdateScreen$1 = new AppUpdateScreenFactoryImpl$getAppUpdateScreen$1(appUpdateScreenParams);
                i1w0 i1w0Var = xxi0Var.A;
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
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    if (xxi0Var.j0.f15225a.a()) {
                        rou rouVar3 = xxi0Var.L;
                        this.j = true;
                        objA2 = rouVar3.a(false, this);
                        if (objA2 == wneVar7) {
                            return wneVar7;
                        }
                    } else {
                        m2c0VarC = u7x.C();
                    }
                    int i3 = xxi0.Y0;
                    sac.V(jiu0.a(xxi0Var), new wvi0((byte) 6), null, xxi0Var.H.c, new kbh0(m2c0VarC, xxi0Var, yjeVar, (byte) 2), 10);
                    return Unit.f46060a;
                }
                if (!z9) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objA2 = obj;
                m2c0VarC = (m2c0) objA2;
                int i4 = xxi0.Y0;
                sac.V(jiu0.a(xxi0Var), new wvi0((byte) 6), null, xxi0Var.H.c, new kbh0(m2c0VarC, xxi0Var, yjeVar, (byte) 2), 10);
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    rou rouVar4 = xxi0Var.L;
                    this.j = true;
                    objA3 = rouVar4.a(false, this);
                    if (objA3 == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA3 = obj;
                }
                xxi0Var.H0.f6892a.f42100a.f("DELETED_ACCOUNT_ID_KEY", ((m2c0) objA3).S);
                xxi0Var.G(s0j0.f31411a);
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z11 = this.j;
                xxi0 xxi0Var2 = this.k;
                if (!z11) {
                    z1x.P(obj);
                    nou nouVar = xxi0Var2.s0;
                    this.j = true;
                    objA4 = nouVar.a(tl5.c, this);
                    if (objA4 == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA4 = obj;
                }
                ql5 ql5Var = (ql5) objA4;
                sac.V(jiu0.a(xxi0Var2), new ywi0(xxi0Var2, b2), null, xxi0Var2.H.b, new hxi0(xxi0Var2, ql5Var.f28916a, xxi0Var2.Q0 == fxi0.f10312a, null), 10);
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    cmt cmtVar = xxi0Var.Z;
                    this.j = true;
                    objI = ((j910) cmtVar.b).i(this);
                    if (objI == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objI = obj;
                }
                x0j0 x0j0Var = new x0j0(((kf3) objI).f18179a);
                int i5 = xxi0.Y0;
                xxi0Var.G(x0j0Var);
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    ieu ieuVar = xxi0Var.t0;
                    this.j = true;
                    objI2 = ieuVar.i(this);
                    if (objI2 == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objI2 = obj;
                }
                String strO = i4w0.O((elt) objI2, xxi0Var.S.l(), xxi0Var.v.f6956a.a(), xxi0Var.F);
                p7m0 p7m0Var2 = xxi0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, twi0.a((twi0) value2, false, false, strO, null, null, null, null, null, null, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, false, 0, -9, 2097151)));
                xxi0Var.G(new z0j0(strO));
                return Unit.f46060a;
            case 11:
                boolean z14 = this.j;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                int i6 = xxi0.Y0;
                xxi0Var.H(new obg((byte) 28, z14));
                if (!((twi0) xxi0Var.D()).B && z14) {
                    xxi0Var.R();
                }
                p7m0 p7m0Var3 = xxi0Var.i.f25029a;
                while (true) {
                    Object value3 = p7m0Var3.getValue();
                    value3.getClass();
                    boolean z15 = z14;
                    if (p7m0Var3.m(value3, twi0.a((twi0) value3, false, false, null, null, null, null, null, null, null, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, z15, 0, false, false, 0, -268435457, 2097151))) {
                        return Unit.f46060a;
                    }
                    z14 = z15;
                }
                break;
            case 12:
                wne wneVar13 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    sd60 sd60VarI = ((uii) xxi0Var.G.f43005a).I();
                    this.j = true;
                    if (sd60VarI.i("", this) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar14 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    ahu ahuVar = xxi0Var.u;
                    this.j = true;
                    objB = ahuVar.b(bm5.f2822a, this);
                    if (objB == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                String str = ((ql5) objB).f;
                int i7 = xxi0.Y0;
                baj0 baj0Var = new baj0(xxi0Var.y0.a(), str, xxi0Var.P0 ? false : xxi0Var.w0.g());
                p7m0 p7m0Var4 = xxi0Var.i.f25029a;
                while (true) {
                    Object value4 = p7m0Var4.getValue();
                    value4.getClass();
                    baj0 baj0Var2 = baj0Var;
                    if (p7m0Var4.m(value4, twi0.a((twi0) value4, false, false, null, null, null, null, null, null, null, null, false, false, null, baj0Var2, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, false, 0, -16385, 2097151))) {
                        return Unit.f46060a;
                    }
                    baj0Var = baj0Var2;
                }
                break;
        }
    }
}
