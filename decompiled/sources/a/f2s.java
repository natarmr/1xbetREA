package a;

import android.content.res.Configuration;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f2s implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8828a;
    public final /* synthetic */ j2s b;

    public /* synthetic */ f2s(j2s j2sVar, byte b) {
        this.f8828a = b;
        this.b = j2sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f8828a;
        j2s j2sVar = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                xak xakVar = j2s.b2;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j2s j2sVar2 = this.b;
                    k3t0 k3t0VarJ0 = j2sVar2.J0();
                    boolean zI = fetVar.i(j2sVar2);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zI || objP == cl5Var) {
                        pop popVar = new pop(1, j2sVar2, j2s.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/sportgame/classic/impl/presentation/GameClassicSideEffect;)V", 0, (byte) 29);
                        fetVar.o0(popVar);
                        objP = popVar;
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                    boolean zI2 = fetVar.i(k3t0VarJ0) | fetVar.i(j2sVar2) | fetVar.e(3) | fetVar.g(pz40VarF);
                    Object objP2 = fetVar.P();
                    yje yjeVar = null;
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new bio(k3t0VarJ0, j2sVar2, pz40VarF, null, (byte) 8);
                        fetVar.o0(objP2);
                    }
                    m0x0.t(fetVar, j2sVar2, (Function2) objP2);
                    pz40 pz40VarY = ((i3t0) j2sVar2.J0()).y(fetVar);
                    Object[] objArr = new Object[0];
                    boolean zG = fetVar.g(pz40VarY);
                    Object objP3 = fetVar.P();
                    if (zG || objP3 == cl5Var) {
                        objP3 = new zwp((l7m0) pz40VarY, (byte) 21);
                        fetVar.o0(objP3);
                    }
                    l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP3, fetVar);
                    Object[] objArr2 = new Object[0];
                    boolean zG2 = fetVar.g(pz40VarY);
                    Object objP4 = fetVar.P();
                    byte b2 = 23;
                    if (zG2 || objP4 == cl5Var) {
                        objP4 = new zwp(pz40VarY, b2);
                        fetVar.o0(objP4);
                    }
                    l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP4, fetVar);
                    Object[] objArr3 = new Object[0];
                    boolean zG3 = fetVar.g(pz40VarY);
                    Object objP5 = fetVar.P();
                    if (zG3 || objP5 == cl5Var) {
                        objP5 = new zwp((l7m0) pz40VarY, (byte) 24);
                        fetVar.o0(objP5);
                    }
                    l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP5, fetVar);
                    Object[] objArr4 = new Object[0];
                    boolean zG4 = fetVar.g(pz40VarY);
                    Object objP6 = fetVar.P();
                    if (zG4 || objP6 == cl5Var) {
                        objP6 = new zwp((l7m0) pz40VarY, (byte) 25);
                        fetVar.o0(objP6);
                    }
                    l7m0 l7m0VarY4 = v3c.Y(objArr4, (Function0) objP6, fetVar);
                    Object[] objArr5 = new Object[0];
                    boolean zG5 = fetVar.g(pz40VarY);
                    Object objP7 = fetVar.P();
                    if (zG5 || objP7 == cl5Var) {
                        objP7 = new zwp((l7m0) pz40VarY, (byte) 14);
                        fetVar.o0(objP7);
                    }
                    l7m0 l7m0VarY5 = v3c.Y(objArr5, (Function0) objP7, fetVar);
                    Object[] objArr6 = new Object[0];
                    boolean zG6 = fetVar.g(l7m0VarY4);
                    Object objP8 = fetVar.P();
                    if (zG6 || objP8 == cl5Var) {
                        objP8 = new zwp(l7m0VarY4, (byte) 15);
                        fetVar.o0(objP8);
                    }
                    l7m0 l7m0VarY6 = v3c.Y(objArr6, (Function0) objP8, fetVar);
                    Object[] objArr7 = new Object[0];
                    boolean zG7 = fetVar.g(pz40VarY);
                    Object objP9 = fetVar.P();
                    if (zG7 || objP9 == cl5Var) {
                        objP9 = new zwp((l7m0) pz40VarY, (byte) 16);
                        fetVar.o0(objP9);
                    }
                    l7m0 l7m0VarY7 = v3c.Y(objArr7, (Function0) objP9, fetVar);
                    Object[] objArr8 = new Object[0];
                    boolean zG8 = fetVar.g(pz40VarY);
                    Object objP10 = fetVar.P();
                    if (zG8 || objP10 == cl5Var) {
                        objP10 = new zwp((l7m0) pz40VarY, (byte) 17);
                        fetVar.o0(objP10);
                    }
                    l7m0 l7m0VarY8 = v3c.Y(objArr8, (Function0) objP10, fetVar);
                    Configuration configuration = (Configuration) fetVar.k(dy2.f6873a);
                    xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                    xcz xczVarA2 = ddz.a(0, 0, fetVar, 0, 3);
                    Object objP11 = fetVar.P();
                    if (objP11 == cl5Var) {
                        objP11 = xf0.c(0.0f);
                        fetVar.o0(objP11);
                    }
                    t33 t33Var = (t33) objP11;
                    Object objP12 = fetVar.P();
                    if (objP12 == cl5Var) {
                        objP12 = xf0.c(0.0f);
                        fetVar.o0(objP12);
                    }
                    t33 t33Var2 = (t33) objP12;
                    Object[] objArr9 = new Object[0];
                    Object objP13 = fetVar.P();
                    if (objP13 == cl5Var) {
                        objP13 = new s9r((byte) 23);
                        fetVar.o0(objP13);
                    }
                    agk0 agk0Var = (agk0) e9x.Q(objArr9, (Function0) objP13, fetVar, 48);
                    Object objP14 = fetVar.P();
                    if (objP14 == cl5Var) {
                        objP14 = androidx.compose.runtime.e.e(null);
                        fetVar.o0(objP14);
                    }
                    pz40 pz40Var = (pz40) objP14;
                    Object objP15 = fetVar.P();
                    if (objP15 == cl5Var) {
                        objP15 = androidx.compose.runtime.e.e(Boolean.FALSE);
                        fetVar.o0(objP15);
                    }
                    pz40 pz40Var2 = (pz40) objP15;
                    Object objP16 = fetVar.P();
                    if (objP16 == cl5Var) {
                        objP16 = androidx.compose.runtime.e.e(Boolean.FALSE);
                        fetVar.o0(objP16);
                    }
                    pz40 pz40Var3 = (pz40) objP16;
                    zcl zclVar = qmk.f28987a;
                    float fB = pkd.b(90.0f, fetVar);
                    float fB2 = pkd.b(((ycl) l1e0.h(new ycl((configuration.smallestScreenWidthDp - (qmk.a(fetVar).d + qmk.a(fetVar).d)) * 0.5625f), new ycl(210.0f), new ycl(344.0f))).f42389a, fetVar);
                    Object objP17 = fetVar.P();
                    if (objP17 == cl5Var) {
                        objP17 = androidx.compose.runtime.e.a(fB2);
                        fetVar.o0(objP17);
                    }
                    agk0 agk0Var2 = (agk0) objP17;
                    boolean zG9 = fetVar.g(xczVarA) | fetVar.g(xczVarA2) | fetVar.g(t33Var) | fetVar.g(t33Var2) | fetVar.g(agk0Var) | fetVar.d(fB);
                    Object objP18 = fetVar.P();
                    if (zG9 || objP18 == cl5Var) {
                        objP18 = new o2s(xczVarA, xczVarA2, t33Var, t33Var2, agk0Var, pz40Var, pz40Var2, pz40Var3, agk0Var2, fB);
                        fetVar.o0(objP18);
                    }
                    o2s o2sVar = (o2s) objP18;
                    Object[] objArr10 = new Object[0];
                    boolean zG10 = fetVar.g(pz40VarY);
                    Object objP19 = fetVar.P();
                    if (zG10 || objP19 == cl5Var) {
                        objP19 = new zwp((l7m0) pz40VarY, (byte) 18);
                        fetVar.o0(objP19);
                    }
                    l7m0 l7m0VarY9 = v3c.Y(objArr10, (Function0) objP19, fetVar);
                    Object[] objArr11 = new Object[0];
                    boolean zG11 = fetVar.g(pz40VarY);
                    Object objP20 = fetVar.P();
                    if (zG11 || objP20 == cl5Var) {
                        objP20 = new zwp((l7m0) pz40VarY, (byte) 19);
                        fetVar.o0(objP20);
                    }
                    l7m0 l7m0VarY10 = v3c.Y(objArr11, (Function0) objP20, fetVar);
                    Object[] objArr12 = new Object[0];
                    boolean zG12 = fetVar.g(l7m0VarY4);
                    Object objP21 = fetVar.P();
                    if (zG12 || objP21 == cl5Var) {
                        objP21 = new zwp(l7m0VarY4, (byte) 22);
                        fetVar.o0(objP21);
                    }
                    l7m0 l7m0VarY11 = v3c.Y(objArr12, (Function0) objP21, fetVar);
                    Object value = l7m0VarY11.getValue();
                    boolean zI3 = fetVar.i(j2sVar2) | fetVar.g(l7m0VarY11);
                    Object objP22 = fetVar.P();
                    if (zI3 || objP22 == cl5Var) {
                        objP22 = new j0s(j2sVar2, l7m0VarY11, yjeVar, (byte) 1);
                        fetVar.o0(objP22);
                    }
                    m0x0.t(fetVar, value, (Function2) objP22);
                    w9x.m(u1c.M(263553180, new pej(o2sVar, l7m0VarY6, l7m0VarY4, j2sVar2, l7m0VarY8, l7m0VarY10, l7m0VarY5, l7m0VarY7, l7m0VarY9, l7m0VarY3, l7m0VarY2, l7m0VarY), fetVar), fetVar, 48);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                long jLongValue = ((Long) obj).longValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                xak xakVar2 = j2s.b2;
                j2sVar.J0().x(new j1s(zBooleanValue, jLongValue));
                break;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                List list = (List) obj2;
                xak xakVar3 = j2s.b2;
                list.getClass();
                j2sVar.J0().x(new o1s(iIntValue2, list));
                break;
        }
        return Unit.f46060a;
    }
}
