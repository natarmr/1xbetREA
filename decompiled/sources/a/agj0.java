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
public final class agj0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ngj0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ agj0(ngj0 ngj0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ngj0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ngj0 ngj0Var = this.k;
        switch (b) {
            case 0:
                return new agj0(ngj0Var, yjeVar, (byte) 0);
            case 1:
                return new agj0(ngj0Var, yjeVar, (byte) 1);
            case 2:
                return new agj0(ngj0Var, yjeVar, (byte) 2);
            case 3:
                return new agj0(ngj0Var, yjeVar, (byte) 3);
            case 4:
                return new agj0(ngj0Var, yjeVar, (byte) 4);
            case 5:
                return new agj0(ngj0Var, yjeVar, (byte) 5);
            case 6:
                return new agj0(ngj0Var, yjeVar, (byte) 6);
            case 7:
                return new agj0(ngj0Var, yjeVar, (byte) 7);
            case 8:
                return new agj0(ngj0Var, yjeVar, (byte) 8);
            case 9:
                return new agj0(ngj0Var, yjeVar, (byte) 9);
            case 10:
                agj0 agj0Var = new agj0(ngj0Var, yjeVar, (byte) 10);
                agj0Var.j = ((Boolean) obj).booleanValue();
                return agj0Var;
            case 11:
                return new agj0(ngj0Var, yjeVar, (byte) 11);
            default:
                return new agj0(ngj0Var, yjeVar, (byte) 12);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((agj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((agj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((agj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((agj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((agj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((agj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((agj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((agj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((agj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((agj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((agj0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((agj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((agj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
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
        ngj0 ngj0Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    ngj0Var.n0.a();
                    rou rouVar = ngj0Var.M;
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
                    int i = ngj0.Y0;
                    ngj0Var.G(l1j0.f19257a);
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
                rou rouVar2 = ngj0Var.M;
                boolean z3 = ngj0Var.N0.r0 || ((pfj0) ngj0Var.D()).O;
                this.j = true;
                Object objA5 = rouVar2.a(z3, this);
                return objA5 == wneVar2 ? wneVar2 : objA5;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    a6u a6uVar = ngj0Var.z0;
                    this.j = true;
                    objE = a6uVar.E(true, this);
                    if (objE == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objE = obj;
                }
                ngj0Var.G(new u0j0(nsm0.l((String) objE, ngj0Var.V.a())));
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    boolean zA = ngj0Var.k0.f15225a.a();
                    ngj0Var.H(new cxi0((byte) 15, zA));
                    if (zA) {
                        this.j = true;
                        if (ngj0Var.N(this) == wneVar4) {
                            return wneVar4;
                        }
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i2 = ngj0.Y0;
                if (ngj0Var.N0.N.i) {
                    ngj0Var.H(new exi0(ngj0Var.f0.c(), (byte) 2));
                }
                ngj0Var.M(false);
                int iA = ngj0Var.x0.a();
                p7m0 p7m0Var = ngj0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, pfj0.a((pfj0) value, false, false, null, null, null, null, null, null, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, iA, false, false, 0, -1, 1048447)));
                ngj0Var.G(new o0j0(false));
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    nhf0 nhf0Var = ngj0Var.F0;
                    this.j = true;
                    objF = nhf0Var.f(true, false, this);
                    if (objF == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objF = obj;
                }
                gm3 gm3Var = (gm3) objF;
                rek0 rek0Var = ngj0Var.G0;
                AppUpdateScreenParams appUpdateScreenParams = new AppUpdateScreenParams(gm3Var.f11523a, gm3Var.b, gm3Var.c);
                rek0Var.getClass();
                FragmentScreen appUpdateScreenFactoryImpl$getAppUpdateScreen$1 = new AppUpdateScreenFactoryImpl$getAppUpdateScreen$1(appUpdateScreenParams);
                i1w0 i1w0Var = ngj0Var.B;
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
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    if (ngj0Var.k0.f15225a.a()) {
                        rou rouVar3 = ngj0Var.M;
                        this.j = true;
                        objA2 = rouVar3.a(false, this);
                        if (objA2 == wneVar6) {
                            return wneVar6;
                        }
                    } else {
                        m2c0VarC = u7x.C();
                    }
                    int i3 = ngj0.Y0;
                    sac.V(jiu0.a(ngj0Var), new wvi0((byte) 28), null, ngj0Var.I.c, new kbh0(m2c0VarC, ngj0Var, yjeVar, (byte) 10), 10);
                    return Unit.f46060a;
                }
                if (!z7) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objA2 = obj;
                m2c0VarC = (m2c0) objA2;
                int i4 = ngj0.Y0;
                sac.V(jiu0.a(ngj0Var), new wvi0((byte) 28), null, ngj0Var.I.c, new kbh0(m2c0VarC, ngj0Var, yjeVar, (byte) 10), 10);
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    rou rouVar4 = ngj0Var.M;
                    this.j = true;
                    objA3 = rouVar4.a(false, this);
                    if (objA3 == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA3 = obj;
                }
                ngj0Var.H0.f6892a.f42100a.f("DELETED_ACCOUNT_ID_KEY", ((m2c0) objA3).S);
                ngj0Var.G(s0j0.f31411a);
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z9 = this.j;
                ngj0 ngj0Var2 = this.k;
                if (!z9) {
                    z1x.P(obj);
                    nou nouVar = ngj0Var2.t0;
                    this.j = true;
                    objA4 = nouVar.a(tl5.c, this);
                    if (objA4 == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA4 = obj;
                }
                ql5 ql5Var = (ql5) objA4;
                sac.V(jiu0.a(ngj0Var2), new tfj0(ngj0Var2, (byte) 8), null, ngj0Var2.I.b, new yfj0(ngj0Var2, ql5Var.f28916a, ngj0Var2.Q0 == wfj0.f39075a, null), 10);
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    cmt cmtVar = ngj0Var.a0;
                    this.j = true;
                    objI = ((j910) cmtVar.b).i(this);
                    if (objI == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objI = obj;
                }
                x0j0 x0j0Var = new x0j0(((kf3) objI).f18179a);
                int i5 = ngj0.Y0;
                ngj0Var.G(x0j0Var);
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    ieu ieuVar = ngj0Var.w;
                    this.j = true;
                    objI2 = ieuVar.i(this);
                    if (objI2 == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objI2 = obj;
                }
                String strO = i4w0.O((elt) objI2, ngj0Var.T.l(), ngj0Var.x.f6956a.a(), ngj0Var.G);
                p7m0 p7m0Var2 = ngj0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, pfj0.a((pfj0) value2, false, false, strO, null, null, null, null, null, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, false, 0, -9, 1048575)));
                ngj0Var.G(new z0j0(strO));
                return Unit.f46060a;
            case 10:
                boolean z12 = this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                int i6 = ngj0.Y0;
                ngj0Var.H(new cxi0((byte) 12, z12));
                if (!((pfj0) ngj0Var.D()).A && z12) {
                    ngj0Var.R();
                }
                p7m0 p7m0Var3 = ngj0Var.i.f25029a;
                while (true) {
                    Object value3 = p7m0Var3.getValue();
                    value3.getClass();
                    boolean z13 = z12;
                    if (p7m0Var3.m(value3, pfj0.a((pfj0) value3, false, false, null, null, null, null, null, null, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, z13, 0, false, false, 0, -134217729, 1048575))) {
                        return Unit.f46060a;
                    }
                    z12 = z13;
                }
                break;
            case 11:
                wne wneVar12 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    sd60 sd60VarI = ((uii) ngj0Var.H.f43005a).I();
                    this.j = true;
                    if (sd60VarI.i("", this) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar13 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    ahu ahuVar = ngj0Var.u;
                    this.j = true;
                    objB = ahuVar.b(bm5.f2822a, this);
                    if (objB == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                String str = ((ql5) objB).f;
                int i7 = ngj0.Y0;
                baj0 baj0Var = new baj0(ngj0Var.y0.a(), str, ngj0Var.P0 ? false : ngj0Var.w0.g());
                p7m0 p7m0Var4 = ngj0Var.i.f25029a;
                while (true) {
                    Object value4 = p7m0Var4.getValue();
                    value4.getClass();
                    baj0 baj0Var2 = baj0Var;
                    if (p7m0Var4.m(value4, pfj0.a((pfj0) value4, false, false, null, null, null, null, null, null, null, false, false, null, baj0Var2, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, false, 0, -8193, 1048575))) {
                        return Unit.f46060a;
                    }
                    baj0Var = baj0Var2;
                }
                break;
        }
    }
}
