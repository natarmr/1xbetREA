package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wbb0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38869a;
    public final /* synthetic */ ccb0 b;

    public /* synthetic */ wbb0(ccb0 ccb0Var, byte b) {
        this.f38869a = b;
        this.b = ccb0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = 2;
        boolean z = false;
        boolean z2 = false;
        byte b2 = 1;
        switch (this.f38869a) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                mi70 mi70Var = ccb0.X1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zfn zfnVar = nhb0.f23524a;
                    ccb0 ccb0Var = this.b;
                    androidx.fragment.app.e eVarC = ccb0Var.C();
                    eVarC.getClass();
                    obc.d(zfnVar.a(eVarC), u1c.M(155701388, new wbb0(ccb0Var, b2), fetVar), fetVar, 48);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                mi70 mi70Var2 = ccb0.X1;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Unit unit = Unit.f46060a;
                    ccb0 ccb0Var2 = this.b;
                    boolean zI = fetVar2.i(ccb0Var2);
                    Object objP = fetVar2.P();
                    byte b3 = 3;
                    cl5 cl5Var = ukd.f35823a;
                    Object obj3 = objP;
                    if (zI || objP == cl5Var) {
                        ybb0 ybb0Var = new ybb0(ccb0Var2, b3);
                        fetVar2.o0(ybb0Var);
                        obj3 = ybb0Var;
                    }
                    m0x0.o(unit, (Function1) obj3, fetVar2);
                    boolean zI2 = fetVar2.i(ccb0Var2);
                    Object objP2 = fetVar2.P();
                    Object obj4 = objP2;
                    if (zI2 || objP2 == cl5Var) {
                        xbb0 xbb0Var = new xbb0(ccb0Var2, b2);
                        fetVar2.o0(xbb0Var);
                        obj4 = xbb0Var;
                    }
                    Function0 function0 = (Function0) obj4;
                    boolean zI3 = fetVar2.i(ccb0Var2);
                    Object objP3 = fetVar2.P();
                    Object obj5 = objP3;
                    if (zI3 || objP3 == cl5Var) {
                        xbb0 xbb0Var2 = new xbb0(ccb0Var2, b);
                        fetVar2.o0(xbb0Var2);
                        obj5 = xbb0Var2;
                    }
                    v3c.A(function0, (Function0) obj5, null, fetVar2, 0, 4);
                    boolean zI4 = fetVar2.i(ccb0Var2);
                    Object objP4 = fetVar2.P();
                    Object obj6 = objP4;
                    if (zI4 || objP4 == cl5Var) {
                        xbb0 xbb0Var3 = new xbb0(ccb0Var2, b3);
                        fetVar2.o0(xbb0Var3);
                        obj6 = xbb0Var3;
                    }
                    Function0 function1 = (Function0) obj6;
                    boolean zI5 = fetVar2.i(ccb0Var2);
                    Object objP5 = fetVar2.P();
                    byte b4 = 4;
                    Object obj7 = objP5;
                    if (zI5 || objP5 == cl5Var) {
                        xbb0 xbb0Var4 = new xbb0(ccb0Var2, b4);
                        fetVar2.o0(xbb0Var4);
                        obj7 = xbb0Var4;
                    }
                    v3c.z(function1, (Function0) obj7, null, fetVar2, 0, 4);
                    pz40 pz40VarY = ((i3t0) ccb0Var2.I0()).y(fetVar2);
                    Object[] objArr = new Object[0];
                    boolean zG = fetVar2.g(pz40VarY);
                    Object objP6 = fetVar2.P();
                    Object obj8 = objP6;
                    if (zG || objP6 == cl5Var) {
                        wda0 wda0Var = new wda0(pz40VarY, (byte) 6);
                        fetVar2.o0(wda0Var);
                        obj8 = wda0Var;
                    }
                    l7m0 l7m0VarY = v3c.Y(objArr, (Function0) obj8, fetVar2);
                    ib50 ib50Var = ccb0Var2.Q1;
                    if (ib50Var == null) {
                        Intrinsics.h("navDestinations");
                        throw null;
                    }
                    rzg0 rzg0VarI = tfx.I(ib50Var, fetVar2);
                    boolean zI6 = fetVar2.i(ccb0Var2);
                    Object objP7 = fetVar2.P();
                    Object obj9 = objP7;
                    if (zI6 || objP7 == cl5Var) {
                        ybb0 ybb0Var2 = new ybb0(ccb0Var2, z ? 1 : 0);
                        fetVar2.o0(ybb0Var2);
                        obj9 = ybb0Var2;
                    }
                    Function1 function2 = (Function1) obj9;
                    boolean zI7 = fetVar2.i(ccb0Var2);
                    Object objP8 = fetVar2.P();
                    Object obj10 = objP8;
                    if (zI7 || objP8 == cl5Var) {
                        ybb0 ybb0Var3 = new ybb0(ccb0Var2, b2);
                        fetVar2.o0(ybb0Var3);
                        obj10 = ybb0Var3;
                    }
                    Function1 function3 = (Function1) obj10;
                    boolean zG2 = fetVar2.g(pz40VarY);
                    Object objP9 = fetVar2.P();
                    Object obj11 = objP9;
                    if (zG2 || objP9 == cl5Var) {
                        ufp ufpVar = new ufp(pz40VarY, (byte) 21);
                        fetVar2.o0(ufpVar);
                        obj11 = ufpVar;
                    }
                    pv40 pv40VarG = p7x.G(rzg0VarI, function2, function3, (Function1) obj11, fetVar2, 0);
                    k3t0 k3t0VarI0 = ccb0Var2.I0();
                    boolean zI8 = fetVar2.i(ccb0Var2) | fetVar2.g(pv40VarG);
                    Object objP10 = fetVar2.P();
                    byte b5 = 15;
                    Object obj12 = objP10;
                    if (zI8 || objP10 == cl5Var) {
                        zga0 zga0Var = new zga0(ccb0Var2, pv40VarG, b5);
                        fetVar2.o0(zga0Var);
                        obj12 = zga0Var;
                    }
                    clz clzVar = (clz) fetVar2.k(or00.f25714a);
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) obj12, fetVar2);
                    boolean zI9 = fetVar2.i(k3t0VarI0) | fetVar2.i(clzVar) | fetVar2.e(3) | fetVar2.g(pz40VarF);
                    Object objP11 = fetVar2.P();
                    if (zI9 || objP11 == cl5Var) {
                        kc70 kc70Var = new kc70(k3t0VarI0, clzVar, pz40VarF, null, (byte) 3);
                        fetVar2.o0(kc70Var);
                        objP11 = kc70Var;
                    }
                    m0x0.t(fetVar2, clzVar, (Function2) objP11);
                    Object[] objArr2 = new Object[0];
                    boolean zG3 = fetVar2.g(pz40VarY);
                    Object objP12 = fetVar2.P();
                    Object obj13 = objP12;
                    if (zG3 || objP12 == cl5Var) {
                        wda0 wda0Var2 = new wda0(pz40VarY, (byte) 10);
                        fetVar2.o0(wda0Var2);
                        obj13 = wda0Var2;
                    }
                    l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) obj13, fetVar2);
                    Object objP13 = fetVar2.P();
                    Object obj14 = objP13;
                    if (objP13 == cl5Var) {
                        if (ccb0Var2.L1 == null) {
                            Intrinsics.h("tipsDialogFeature");
                            throw null;
                        }
                        roq0 roq0Var = new roq0();
                        fetVar2.o0(roq0Var);
                        obj14 = roq0Var;
                    }
                    roq0 roq0Var2 = (roq0) obj14;
                    lme0 lme0Var = ccb0Var2.M1;
                    if (lme0Var == null) {
                        Intrinsics.h("responsibleGameDialogFactory");
                        throw null;
                    }
                    boolean zI10 = fetVar2.i(ccb0Var2);
                    Object objP14 = fetVar2.P();
                    Object obj15 = objP14;
                    if (zI10 || objP14 == cl5Var) {
                        ybb0 ybb0Var4 = new ybb0(ccb0Var2, b4);
                        fetVar2.o0(ybb0Var4);
                        obj15 = ybb0Var4;
                    }
                    Function1 function4 = (Function1) obj15;
                    boolean zI11 = fetVar2.i(ccb0Var2);
                    Object objP15 = fetVar2.P();
                    Object obj16 = objP15;
                    if (zI11 || objP15 == cl5Var) {
                        xbb0 xbb0Var5 = new xbb0(ccb0Var2, b5);
                        fetVar2.o0(xbb0Var5);
                        obj16 = xbb0Var5;
                    }
                    Function0 function5 = (Function0) obj16;
                    boolean zI12 = fetVar2.i(ccb0Var2);
                    Object objP16 = fetVar2.P();
                    Object obj17 = objP16;
                    if (zI12 || objP16 == cl5Var) {
                        xbb0 xbb0Var6 = new xbb0(ccb0Var2, z2 ? 1 : 0);
                        fetVar2.o0(xbb0Var6);
                        obj17 = xbb0Var6;
                    }
                    d9x.r(ccb0Var2, l7m0VarY2, roq0Var2, lme0Var, function4, function5, (Function0) obj17, fetVar2, 0);
                    mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                    Object objP17 = fetVar2.P();
                    Object obj18 = objP17;
                    if (objP17 == cl5Var) {
                        kma0 kma0Var = new kma0((byte) 28);
                        fetVar2.o0(kma0Var);
                        obj18 = kma0Var;
                    }
                    mm40 mm40VarK = rq8.K(mm40VarD, (Function1) obj18);
                    k3t0 k3t0VarI1 = ccb0Var2.I0();
                    boolean zI13 = fetVar2.i(k3t0VarI1);
                    Object objP18 = fetVar2.P();
                    if (zI13 || objP18 == cl5Var) {
                        e9b0 e9b0Var = new e9b0(1, k3t0VarI1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 2);
                        fetVar2.o0(e9b0Var);
                        objP18 = e9b0Var;
                    }
                    k9x.n(mm40VarK, pz40VarY, (Function1) ((jhy) objP18), u1c.M(391294821, new x2g((Object) pz40VarY, (Object) ccb0Var2, (Object) l7m0VarY, (Object) pv40VarG, (byte) 26), fetVar2), fetVar2, 3072);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
        }
    }
}
