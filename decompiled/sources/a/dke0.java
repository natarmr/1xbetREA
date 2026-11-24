package a;

import android.javax.sip.message.Response;
import android.net.Uri;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dke0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6226a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dke0(mkg0 mkg0Var) {
        this.f6226a = (byte) 21;
        this.b = mkg0Var;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001f  */
    private final Object a(Object obj, Object obj2) {
        qsg0 qsg0Var = (qsg0) this.b;
        int iIntValue = ((Integer) obj).intValue();
        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
        kotlin.coroutines.f key = element.getKey();
        CoroutineContext.Element element2 = qsg0Var.j.get(key);
        if (key == gqw0.o1) {
            bby bbyVar = (bby) element2;
            bby parent = (bby) element;
            while (true) {
                if (parent != null) {
                    if (parent == bbyVar || !(parent instanceof a3h0)) {
                        break;
                    }
                    fac facVar = (fac) defpackage.a.f0a.getObjectVolatile((a3h0) parent, pby.f26732a);
                    parent = facVar != null ? facVar.getParent() : null;
                } else {
                    parent = null;
                    break;
                }
            }
            if (parent != bbyVar) {
                ohq.o("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of ", parent, ", expected child of ", bbyVar, ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'");
                return null;
            }
            if (bbyVar != null) {
                iIntValue++;
            }
        } else if (element != element2) {
            iIntValue = Integer.MIN_VALUE;
        } else {
            iIntValue++;
        }
        return Integer.valueOf(iIntValue);
    }

    private final Object b(Object obj, Object obj2) {
        slh0 slh0Var = (slh0) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        cge0 cge0Var = slh0.O1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            pz40 pz40VarY = ((i3t0) slh0Var.G0()).y(fetVar);
            k3t0 k3t0VarG0 = slh0Var.G0();
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            boolean zI = fetVar.i(slh0Var);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                jjh0 jjh0Var = new jjh0(1, slh0Var, slh0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/security/impl/presentation/compose/secret_question/models/SecretQuestionSideEffect;)V", 0, (byte) 3);
                fetVar.o0(jjh0Var);
                objP2 = jjh0Var;
            }
            Function1 function1 = (Function1) ((jhy) objP2);
            Unit unit = Unit.f46060a;
            boolean zI2 = fetVar.i(vneVar) | fetVar.i(k3t0VarG0) | fetVar.g(function1) | fetVar.g(null);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == cl5Var) {
                objP3 = new ggc0(vneVar, k3t0VarG0, function1, (byte) 7);
                fetVar.o0(objP3);
            }
            m0x0.o(unit, (Function1) objP3, fetVar);
            boolean zI3 = fetVar.i(slh0Var);
            Object objP4 = fetVar.P();
            if (zI3 || objP4 == cl5Var) {
                objP4 = new qlh0(slh0Var, (byte) 3);
                fetVar.o0(objP4);
            }
            Function0 function0 = (Function0) objP4;
            boolean zI4 = fetVar.i(slh0Var);
            Object objP5 = fetVar.P();
            if (zI4 || objP5 == cl5Var) {
                objP5 = new qlh0(slh0Var, (byte) 4);
                fetVar.o0(objP5);
            }
            v3c.A(function0, (Function0) objP5, null, fetVar, 0, 4);
            nmh0 nmh0Var = (nmh0) pz40VarY.getValue();
            k3t0 k3t0VarG1 = slh0Var.G0();
            boolean zI5 = fetVar.i(k3t0VarG1);
            Object objP6 = fetVar.P();
            if (zI5 || objP6 == cl5Var) {
                jjh0 jjh0Var2 = new jjh0(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 4);
                fetVar.o0(jjh0Var2);
                objP6 = jjh0Var2;
            }
            x4d0.T(null, nmh0Var, (Function1) ((jhy) objP6), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2) {
        Object value;
        Object value2;
        qmh0 qmh0Var = (qmh0) this.b;
        oyg0 oyg0Var = qmh0Var.f;
        ocj ocjVar = qmh0Var.i;
        Throwable th = (Throwable) obj;
        String str = (String) obj2;
        th.getClass();
        str.getClass();
        if (th instanceof byf) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value2, mmh0.a((mmh0) value2, null, null, false, 0, null, null, ((byf) th).g, false, null, 447)));
        } else {
            qmh0Var.G(new jmh0(str));
        }
        p7m0 p7m0Var2 = ocjVar.f25029a;
        do {
            value = p7m0Var2.getValue();
            value.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var2.m(value, mmh0.a((mmh0) value, null, null, false, 0, null, null, null, false, null, 507)));
        return Unit.f46060a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        Object value2;
        pz40 pz40Var;
        float f;
        byte b = this.f6226a;
        byte b2 = 8;
        byte b3 = 14;
        byte b4 = 7;
        ohk0 ohk0Var = null;
        boolean z = false;
        boolean z2 = false;
        cl5 cl5Var = ukd.f35823a;
        byte b5 = 2;
        byte b6 = 3;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                kiu0 kiu0Var = ((gke0) obj3).N1;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                eke0 eke0Var = gke0.P1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qke0 qke0Var = (qke0) kiu0Var.getValue();
                    int i = qke0.u;
                    pz40 pz40VarY = qke0Var.y(fetVar);
                    qke0 qke0Var2 = (qke0) kiu0Var.getValue();
                    boolean zI = fetVar.i(qke0Var2);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        d8e0 d8e0Var = new d8e0(1, qke0Var2, qke0.class, "onAction", "onAction(Lorg/xplatform/statistic/player/impl/referee/referee_team/presentation/model/RefereeTeamsAction;)V", 0, (byte) 9);
                        fetVar.o0(d8e0Var);
                        objP = d8e0Var;
                    }
                    rq8.w(pz40VarY, (Function1) ((jhy) objP), fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                qke0 qke0Var3 = (qke0) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var = qke0Var3.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    qke0Var3.f.getClass();
                } while (!p7m0Var.m(value, new ike0(false, true, ((ike0) value).c)));
                return Unit.f46060a;
            case 2:
                a8z a8zVar = ((ile0) obj3).N1;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                gle0 gle0Var = ile0.P1;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dme0 dme0Var = (dme0) ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar2).getValue();
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI2 = fetVar2.i(k3t0Var);
                    Object objP2 = fetVar2.P();
                    if (zI2 || objP2 == cl5Var) {
                        d8e0 d8e0Var2 = new d8e0(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 10);
                        fetVar2.o0(d8e0Var2);
                        objP2 = d8e0Var2;
                    }
                    uc9.G(dme0Var, (Function1) ((jhy) objP2), fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 3:
                gme0 gme0Var = (gme0) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var2 = gme0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    gme0Var.f.getClass();
                } while (!p7m0Var2.m(value2, new yle0(false, true, false, null)));
                return Unit.f46060a;
            case 4:
                a8z a8zVar2 = ((nme0) obj3).P1;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                lme0 lme0Var = nme0.Q1;
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    pz40 pz40VarY2 = ((i3t0) ((k3t0) a8zVar2.getValue())).y(fetVar3);
                    k3t0 k3t0Var2 = (k3t0) a8zVar2.getValue();
                    boolean zI3 = fetVar3.i(k3t0Var2);
                    Object objP3 = fetVar3.P();
                    if (zI3 || objP3 == cl5Var) {
                        d8e0 d8e0Var3 = new d8e0(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 11);
                        fetVar3.o0(d8e0Var3);
                        objP3 = d8e0Var3;
                    }
                    ny9.C(pz40VarY2, (Function1) ((jhy) objP3), fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 5:
                q1f0 q1f0Var = (q1f0) obj3;
                aye0 aye0Var = (aye0) obj2;
                ((oyg0) obj).getClass();
                aye0Var.getClass();
                return aye0.a(aye0Var, false, false, false, null, null, null, null, null, null, null, null, null, false, q1f0Var.g, q1f0Var.v, q1f0Var.h, q1f0Var.c, q1f0Var.o, q1f0Var.d, q1f0Var.u, null, 2080899069);
            case 6:
                r1f0 r1f0Var = (r1f0) obj3;
                u4f0 u4f0Var = (u4f0) obj2;
                ((oyg0) obj).getClass();
                u4f0Var.getClass();
                return u4f0.a(u4f0Var, false, false, null, null, null, null, null, null, null, null, null, false, null, false, r1f0Var.g, r1f0Var.v, r1f0Var.h, r1f0Var.c, r1f0Var.o, r1f0Var.d, r1f0Var.u, null, 1007157245);
            case 7:
                p1f0 p1f0Var = (p1f0) obj3;
                mbf0 mbf0Var = (mbf0) obj2;
                ((oyg0) obj).getClass();
                mbf0Var.getClass();
                return mbf0.a(mbf0Var, false, false, null, null, null, null, null, null, null, null, null, null, null, false, p1f0Var.g, p1f0Var.v, p1f0Var.h, p1f0Var.c, p1f0Var.o, p1f0Var.d, p1f0Var.u, null, 1007157245);
            case 8:
                u0h0 u0h0Var = (u0h0) obj3;
                azg0 azg0Var = (azg0) obj;
                pz40 pz40Var2 = (pz40) obj2;
                if (!(pz40Var2 instanceof fgk0)) {
                    jf4.o("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                    return null;
                }
                fgk0 fgk0Var = (fgk0) pz40Var2;
                Object objA = u0h0Var.a(azg0Var, fgk0Var.getValue());
                if (objA == null) {
                    return null;
                }
                igk0 igk0VarD = fgk0Var.d();
                igk0VarD.getClass();
                return androidx.compose.runtime.e.d(objA, igk0VarD);
            case 9:
                lgf0 lgf0Var = (lgf0) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                gle0 gle0Var2 = lgf0.N1;
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    pz40 pz40VarY3 = ((i3t0) lgf0Var.G0()).y(fetVar4);
                    k3t0 k3t0VarG0 = lgf0Var.G0();
                    boolean zI4 = fetVar4.i(lgf0Var);
                    Object objP4 = fetVar4.P();
                    if (zI4 || objP4 == cl5Var) {
                        qye0 qye0Var = new qye0(1, lgf0Var, lgf0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/feature/office/test_section/impl/presentation/remote_config_test/models/RemoteConfigTestSideEffect;)V", 0, (byte) 25);
                        fetVar4.o0(qye0Var);
                        objP4 = qye0Var;
                    }
                    clz clzVar = (clz) fetVar4.k(or00.f25714a);
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP4), fetVar4);
                    boolean zI5 = fetVar4.i(k3t0VarG0) | fetVar4.i(clzVar) | fetVar4.e(3) | fetVar4.g(pz40VarF);
                    Object objP5 = fetVar4.P();
                    if (zI5 || objP5 == cl5Var) {
                        kc70 kc70Var = new kc70(k3t0VarG0, clzVar, pz40VarF, null, (byte) 14);
                        fetVar4.o0(kc70Var);
                        objP5 = kc70Var;
                    }
                    m0x0.t(fetVar4, clzVar, (Function2) objP5);
                    k3t0 k3t0VarG1 = lgf0Var.G0();
                    boolean zI6 = fetVar4.i(k3t0VarG1);
                    Object objP6 = fetVar4.P();
                    if (zI6 || objP6 == cl5Var) {
                        qye0 qye0Var2 = new qye0(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 26);
                        fetVar4.o0(qye0Var2);
                        objP6 = qye0Var2;
                    }
                    saj.G(pz40VarY3, (Function1) ((jhy) objP6), fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 10:
                bif0 bif0Var = (bif0) obj3;
                a8z a8zVar3 = bif0Var.M1;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                lme0 lme0Var2 = bif0.N1;
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    k3t0 k3t0Var3 = (k3t0) a8zVar3.getValue();
                    Object objP7 = fetVar5.P();
                    if (objP7 == cl5Var) {
                        objP7 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar5);
                        fetVar5.o0(objP7);
                    }
                    vne vneVar = (vne) objP7;
                    boolean zI7 = fetVar5.i(bif0Var);
                    Object objP8 = fetVar5.P();
                    if (zI7 || objP8 == cl5Var) {
                        aif0 aif0Var = new aif0(1, bif0Var, bif0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/pin_code/impl/presentation/remove/compose/models/RemovePinCodeSideEffect;)V", 0, (byte) 0);
                        fetVar5.o0(aif0Var);
                        objP8 = aif0Var;
                    }
                    Function1 function1 = (Function1) ((jhy) objP8);
                    Unit unit = Unit.f46060a;
                    boolean zI8 = fetVar5.i(vneVar) | fetVar5.i(k3t0Var3) | fetVar5.g(function1) | fetVar5.g(null);
                    Object objP9 = fetVar5.P();
                    if (zI8 || objP9 == cl5Var) {
                        objP9 = new ggc0(vneVar, k3t0Var3, function1, (byte) 6);
                        fetVar5.o0(objP9);
                    }
                    m0x0.o(unit, (Function1) objP9, fetVar5);
                    hif0 hif0Var = (hif0) ((i3t0) ((k3t0) a8zVar3.getValue())).y(fetVar5).getValue();
                    k3t0 k3t0Var4 = (k3t0) a8zVar3.getValue();
                    boolean zI9 = fetVar5.i(k3t0Var4);
                    Object objP10 = fetVar5.P();
                    if (zI9 || objP10 == cl5Var) {
                        aif0 aif0Var2 = new aif0(1, k3t0Var4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 1);
                        fetVar5.o0(aif0Var2);
                        objP10 = aif0Var2;
                    }
                    qjj.G(null, hif0Var, (Function1) ((jhy) objP10), fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 11:
                String str = (String) obj2;
                b1j.z(str, (Throwable) obj);
                ((gjf0) obj3).j.f(new ajf0(str));
                return Unit.f46060a;
            case 12:
                y5g0 y5g0Var = (y5g0) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                gle0 gle0Var3 = y5g0.Q1;
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    pz40 pz40VarY4 = ((i3t0) y5g0Var.H0()).y(fetVar6);
                    k3t0 k3t0VarH0 = y5g0Var.H0();
                    boolean zI10 = fetVar6.i(y5g0Var);
                    Object objP11 = fetVar6.P();
                    if (zI10 || objP11 == cl5Var) {
                        aif0 aif0Var3 = new aif0(1, y5g0Var, y5g0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/special_event/impl/results/presentation/model/ResultsSideEffect;)V", 0, (byte) 11);
                        fetVar6.o0(aif0Var3);
                        objP11 = aif0Var3;
                    }
                    lkz lkzVar2 = lkz.f20223a;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) ((jhy) objP11), fetVar6);
                    boolean zI11 = fetVar6.i(k3t0VarH0) | fetVar6.i(y5g0Var) | fetVar6.e(3) | fetVar6.g(pz40VarF2);
                    Object objP12 = fetVar6.P();
                    if (zI11 || objP12 == cl5Var) {
                        pz40Var = pz40VarY4;
                        nu80 nu80Var = new nu80(k3t0VarH0, y5g0Var, pz40VarF2, null, (byte) 18);
                        fetVar6.o0(nu80Var);
                        objP12 = nu80Var;
                    } else {
                        pz40Var = pz40VarY4;
                    }
                    m0x0.t(fetVar6, y5g0Var, (Function2) objP12);
                    boolean zI12 = fetVar6.i(y5g0Var);
                    Object objP13 = fetVar6.P();
                    Object obj4 = objP13;
                    if (zI12 || objP13 == cl5Var) {
                        w5g0 w5g0Var = new w5g0(y5g0Var, b5);
                        fetVar6.o0(w5g0Var);
                        obj4 = w5g0Var;
                    }
                    Function0 function0 = (Function0) obj4;
                    boolean zI13 = fetVar6.i(y5g0Var);
                    Object objP14 = fetVar6.P();
                    Object obj5 = objP14;
                    if (zI13 || objP14 == cl5Var) {
                        w5g0 w5g0Var2 = new w5g0(y5g0Var, b6);
                        fetVar6.o0(w5g0Var2);
                        obj5 = w5g0Var2;
                    }
                    v3c.A(function0, (Function0) obj5, null, fetVar6, 0, 4);
                    k3t0 k3t0VarH1 = y5g0Var.H0();
                    boolean zI14 = fetVar6.i(k3t0VarH1);
                    Object objP15 = fetVar6.P();
                    if (zI14 || objP15 == cl5Var) {
                        aif0 aif0Var4 = new aif0(1, k3t0VarH1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 12);
                        fetVar6.o0(aif0Var4);
                        objP15 = aif0Var4;
                    }
                    ahy.J(pz40Var, (Function1) ((jhy) objP15), fetVar6, 0);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 13:
                x6g0 x6g0Var = (x6g0) obj3;
                a8z a8zVar4 = x6g0Var.P1;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                lme0 lme0Var3 = x6g0.Q1;
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    pz40 pz40VarY5 = ((i3t0) ((k3t0) a8zVar4.getValue())).y(fetVar7);
                    k3t0 k3t0Var5 = (k3t0) a8zVar4.getValue();
                    boolean zI15 = fetVar7.i(x6g0Var);
                    Object objP16 = fetVar7.P();
                    if (zI15 || objP16 == cl5Var) {
                        aif0 aif0Var5 = new aif0(1, x6g0Var, x6g0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/statistic/stat_results/impl/results_grid/presentation/model/ResultsGridSideEffect;)V", 0, (byte) 13);
                        fetVar7.o0(aif0Var5);
                        objP16 = aif0Var5;
                    }
                    clz clzVar2 = (clz) fetVar7.k(or00.f25714a);
                    lkz lkzVar3 = lkz.f20223a;
                    pz40 pz40VarF3 = androidx.compose.runtime.e.f((Function1) ((jhy) objP16), fetVar7);
                    boolean zI16 = fetVar7.i(k3t0Var5) | fetVar7.i(clzVar2) | fetVar7.e(3) | fetVar7.g(pz40VarF3);
                    Object objP17 = fetVar7.P();
                    if (zI16 || objP17 == cl5Var) {
                        kc70 kc70Var2 = new kc70(k3t0Var5, clzVar2, pz40VarF3, null, (byte) 15);
                        fetVar7.o0(kc70Var2);
                        objP17 = kc70Var2;
                    }
                    m0x0.t(fetVar7, clzVar2, (Function2) objP17);
                    k3t0 k3t0Var6 = (k3t0) a8zVar4.getValue();
                    boolean zI17 = fetVar7.i(k3t0Var6);
                    Object objP18 = fetVar7.P();
                    if (zI17 || objP18 == cl5Var) {
                        aif0 aif0Var6 = new aif0(1, k3t0Var6, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 14);
                        fetVar7.o0(aif0Var6);
                        objP18 = aif0Var6;
                    }
                    knx.J(pz40VarY5, (Function1) ((jhy) objP18), fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 14:
                a8z a8zVar5 = ((c7g0) obj3).O1;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                gne0 gne0Var = c7g0.P1;
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    pz40 pz40VarY6 = ((i3t0) ((k3t0) a8zVar5.getValue())).y(fetVar8);
                    k3t0 k3t0Var7 = (k3t0) a8zVar5.getValue();
                    boolean zI18 = fetVar8.i(k3t0Var7);
                    Object objP19 = fetVar8.P();
                    if (zI18 || objP19 == cl5Var) {
                        aif0 aif0Var7 = new aif0(1, k3t0Var7, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 15);
                        fetVar8.o0(aif0Var7);
                        objP19 = aif0Var7;
                    }
                    d7g0.c(pz40VarY6, (Function1) ((jhy) objP19), fetVar8, 0);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                d7g0.b((kx50) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                m8g0 m8g0Var = (m8g0) obj3;
                Throwable th = (Throwable) obj;
                th.getClass();
                ((String) obj2).getClass();
                if (th instanceof ff5) {
                    m8g0Var.H(new vtf0(b4));
                } else {
                    m8g0Var.H(new vtf0(b2));
                }
                return Unit.f46060a;
            case 17:
                pbg0 pbg0Var = (pbg0) obj3;
                String str2 = (String) obj2;
                ((Throwable) obj).getClass();
                str2.getClass();
                sac.V(jiu0.a(pbg0Var), new wtf0((byte) 10), null, pbg0Var.c.f22085a, new tye0(pbg0Var, new nbg0(sa10.b(pbg0Var.g, pb10.g, R.string.data_retrieval_error, 0, null, 28), str2), z ? 1 : 0, b3), 10);
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                l8x.J((vfg0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                x8x.g((zfg0) obj3, (fet) obj, x8x.L(9));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                x9x.u((jgg0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                mkg0 mkg0Var = (mkg0) obj3;
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    w6k w6kVar = (w6k) fetVar9.k(bmd.h);
                    long jB = ((yez) ((rhv0) fetVar9.k(bmd.u))).b();
                    Object objP20 = fetVar9.P();
                    Object obj6 = objP20;
                    if (objP20 == cl5Var) {
                        pz40 pz40VarE = androidx.compose.runtime.e.e(new qkx(0L));
                        fetVar9.o0(pz40VarE);
                        obj6 = pz40VarE;
                    }
                    pz40 pz40Var3 = (pz40) obj6;
                    boolean zF = fetVar9.f(jB) | fetVar9.g(w6kVar);
                    Object objP21 = fetVar9.P();
                    Object obj7 = objP21;
                    if (zF || objP21 == cl5Var) {
                        ujv0 ujv0Var = new ujv0(((int) (jB >> 32)) / w6kVar.getDensity(), ((int) (jB & 4294967295L)) / w6kVar.getDensity());
                        fetVar9.o0(ujv0Var);
                        obj7 = ujv0Var;
                    }
                    ujv0 ujv0Var2 = (ujv0) obj7;
                    boolean zF2 = fetVar9.f(((qkx) pz40Var3.getValue()).f28908a) | fetVar9.g(ujv0Var2);
                    Object objP22 = fetVar9.P();
                    if (zF2 || objP22 == cl5Var) {
                        long j = ((qkx) pz40Var3.getValue()).f28908a;
                        w6kVar.getClass();
                        ujv0Var2.getClass();
                        int i2 = (int) (4294967295L & j);
                        float fR0 = w6kVar.r0(i2);
                        float fR1 = w6kVar.r0((int) (j >> 32));
                        zcl zclVar = qmk.f28987a;
                        boolean zA = ujv0Var2.a(Response.BUSY_EVERYWHERE);
                        int i3 = ujv0Var2.f35801a;
                        if (zA) {
                            f = ((ycl) idd.e(new ycl(i3 * 0.9f), new ycl(80.0f))).f42389a;
                        } else {
                            f = ujv0Var2.a(360) ? ((ycl) idd.e(new ycl(i3 * 0.9f), new ycl(56.0f))).f42389a : ((ycl) idd.e(new ycl(i3 * 0.9f), new ycl(56.0f))).f42389a;
                        }
                        float f2 = f;
                        float f3 = i2;
                        objP22 = new nkg0(i2 != 0, xp20.f(new Pair(gjg0.f11394a, new gig0()), new Pair(fjg0.f9639a, new gig0(250, 3000L)), new Pair(ejg0.f7909a, new gig0())), fR0, fR1, f2, fR0 * 0.71f, f3 * 0.42f, f3 * 0.38f, fR0 * 0.28f, fR1 * 0.034f, fR1 * 0.17f, fR0 * 0.42f, fR0 * 0.13f, fR0 * 0.62f);
                        fetVar9.o0(objP22);
                    }
                    nkg0 nkg0Var = (nkg0) objP22;
                    boolean zG = fetVar9.g(nkg0Var);
                    Object objP23 = fetVar9.P();
                    Object obj8 = objP23;
                    if (zG || objP23 == cl5Var) {
                        jig0 jig0Var = new jig0(mkg0Var, nkg0Var);
                        fetVar9.o0(jig0Var);
                        obj8 = jig0Var;
                    }
                    jig0 jig0Var2 = (jig0) obj8;
                    l7m0 l7m0Var = jig0Var2.c;
                    boolean zG2 = fetVar9.g(jig0Var2) | fetVar9.g(mkg0Var);
                    Object objP24 = fetVar9.P();
                    Object obj9 = objP24;
                    if (zG2 || objP24 == cl5Var) {
                        k6d0 k6d0Var = new k6d0((Object) jig0Var2, (Object) mkg0Var, (yje) (z2 ? 1 : 0), (byte) 22);
                        fetVar9.o0(k6d0Var);
                        obj9 = k6d0Var;
                    }
                    m0x0.t(fetVar9, mkg0Var, (Function2) obj9);
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarJ = lgb.J(mm40VarD, vgg0.a(16.0f));
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar9.T);
                    bh90 bh90VarM = fetVar9.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar9, mm40VarJ);
                    mkd.c0.getClass();
                    fetVar9.i0();
                    if (fetVar9.S) {
                        fetVar9.l(e7z.u1);
                    } else {
                        fetVar9.r0();
                    }
                    jpm0.o(fetVar9, tj30VarC, gqw0.x);
                    jpm0.o(fetVar9, bh90VarM, gqw0.w);
                    jpm0.o(fetVar9, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar9);
                    jpm0.o(fetVar9, mm40VarC0, gqw0.v);
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    Object objP25 = fetVar9.P();
                    Object obj10 = objP25;
                    if (objP25 == cl5Var) {
                        ryc0 ryc0Var = new ryc0(pz40Var3, b2);
                        fetVar9.o0(ryc0Var);
                        obj10 = ryc0Var;
                    }
                    k7x.a("https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Tablet.png", null, fre0.Y(mm40VarD2, (Function1) obj10), gqw0.Z, null, fetVar9, 1573302, 1976);
                    if (nkg0Var.f23679a) {
                        fetVar9.e0(544436628);
                        hgk0 hgk0Var = (hgk0) l7m0Var;
                        Boolean boolValueOf = Boolean.valueOf(((mig0) hgk0Var.getValue()).h);
                        Object objP26 = fetVar9.P();
                        Object obj11 = objP26;
                        if (objP26 == cl5Var) {
                            wtf0 wtf0Var = new wtf0((byte) 21);
                            fetVar9.o0(wtf0Var);
                            obj11 = wtf0Var;
                        }
                        ay3.f(boolValueOf, null, (Function1) obj11, null, null, null, u1c.M(1632077197, new d2s(nkg0Var, hgk0Var, (byte) 19), fetVar9), fetVar9, 1573248, 58);
                        fetVar9.r(false);
                    } else {
                        fetVar9.e0(544989203);
                        fetVar9.r(false);
                    }
                    fetVar9.r(true);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                vvw.j((ckg0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 23:
                String str3 = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                zie0 zie0Var = bmg0.Z1;
                str3.getClass();
                mog0 mog0VarH0 = ((bmg0) obj3).H0();
                if (zBooleanValue) {
                    mog0VarH0.y(new bog0(str3));
                } else {
                    au0 au0Var = mog0VarH0.l;
                    gg5 gg5Var = mog0VarH0.k;
                    u58 u58Var = mog0VarH0.i;
                    if (kotlin.text.c.x(str3, "tel:", false)) {
                        u58Var.f35083a.a("information_contacts_call", wp20.b(new Pair("point", "phone")));
                        gg5Var.o();
                        mog0VarH0.y(new cog0(Uri.parse(str3)));
                    } else if (StringsKt.O(str3, "tg://resolve?domain", false)) {
                        u58Var.f35083a.a("information_contacts_call", wp20.b(new Pair("point", "telegram")));
                        gg5Var.s();
                        mog0VarH0.y(new dog0(str3));
                    } else if (StringsKt.O(str3, "viber://chat?number", false)) {
                        i8i.D("point", "viber", u58Var.f35083a, "information_contacts_call");
                        gg5Var.f11237a.a(cui0.b(new j1p("viber", (byte) 0)), 3080L);
                        mog0VarH0.y(new dog0(str3));
                    } else if (StringsKt.O(str3, "facebook.com", false) || StringsKt.O(str3, "instagram.com", false)) {
                        if (StringsKt.O(str3, "facebook.com", false)) {
                            ohk0Var = ohk0.FACEBOOK;
                        } else if (StringsKt.O(str3, "instagram.com", false)) {
                            ohk0Var = ohk0.INSTAGRAM;
                        }
                        if (ohk0Var != null) {
                            i8i.D("social_media", ohk0Var.f25269a, mog0VarH0.j.f809a, "information_smm_call");
                            au0Var.p(ohk0Var);
                        }
                        mog0VarH0.y(new dog0(str3));
                    } else if (StringsKt.O(str3, "twitter.com", false)) {
                        au0Var.p(ohk0.TWITTER);
                        mog0VarH0.y(new dog0(str3));
                    } else if (kotlin.text.c.x(str3, "mailto", false)) {
                        mog0VarH0.y(new eog0(str3));
                    } else {
                        mog0VarH0.n.d(new dff0(mog0VarH0, str3, (byte) 20));
                    }
                }
                return Unit.f46060a;
            case 24:
                ong0 ong0Var = (ong0) obj2;
                ((oyg0) obj).getClass();
                ong0Var.getClass();
                tlg0 tlg0Var = ((aog0) obj3).o;
                String str4 = (String) tlg0Var.f34143a.b.get("TITLE_KEY");
                String str5 = str4 == null ? "" : str4;
                ysw yswVar = new ysw(null, 15);
                clg0 clg0Var = clg0.DEFAULT;
                ykg0 ykg0Var = new ykg0(true, str5, yswVar, yswVar, clg0Var);
                String str6 = (String) tlg0Var.f34143a.b.get("DESCRIPTION_KEY");
                String str7 = str6 == null ? "" : str6;
                ysw yswVar2 = new ysw(null, 15);
                return ong0.a(ong0Var, null, q3d.j(ykg0Var, new ykg0(false, str7, yswVar2, yswVar2, clg0Var)), null, false, 947);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return a(obj, obj2);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return b(obj, obj2);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                mmh0 mmh0Var = (mmh0) obj2;
                ((oyg0) obj).getClass();
                mmh0Var.getClass();
                int i4 = ((kkh0) obj3).f18440a.f46923a;
                int i5 = mmh0Var.d;
                return mmh0.a(mmh0Var, null, null, false, i4, i4 != i5 ? "" : mmh0Var.e, i4 == i5 ? mmh0Var.f : "", "", false, null, 135);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return c(obj, obj2);
            default:
                joh0 joh0Var = (joh0) obj3;
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                eke0 eke0Var2 = joh0.N1;
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    iph0 iph0VarH0 = joh0Var.H0();
                    boolean zI19 = fetVar10.i(iph0VarH0);
                    Object objP27 = fetVar10.P();
                    if (zI19 || objP27 == cl5Var) {
                        b0c0 b0c0Var = new b0c0(0, iph0VarH0, iph0.class, "onBackClick", "onBackClick()V", 0, (byte) 27);
                        fetVar10.o0(b0c0Var);
                        objP27 = b0c0Var;
                    }
                    jhy jhyVar = (jhy) objP27;
                    iph0 iph0VarH1 = joh0Var.H0();
                    boolean zI20 = fetVar10.i(iph0VarH1);
                    Object objP28 = fetVar10.P();
                    if (zI20 || objP28 == cl5Var) {
                        b0c0 b0c0Var2 = new b0c0(0, iph0VarH1, iph0.class, "onRefreshData", "onRefreshData()V", 0, (byte) 28);
                        fetVar10.o0(b0c0Var2);
                        objP28 = b0c0Var2;
                    }
                    jhy jhyVar2 = (jhy) objP28;
                    iph0 iph0VarH2 = joh0Var.H0();
                    boolean zI21 = fetVar10.i(iph0VarH2);
                    Object objP29 = fetVar10.P();
                    if (zI21 || objP29 == cl5Var) {
                        b0c0 b0c0Var3 = new b0c0(0, iph0VarH2, iph0.class, "onReceiveGiftClicked", "onReceiveGiftClicked()V", 0, (byte) 29);
                        fetVar10.o0(b0c0Var3);
                        objP29 = b0c0Var3;
                    }
                    pz40 pz40VarQ = gkb.Q((n7m0) joh0Var.H0().L.getValue(), null, fetVar10, 0, 7);
                    pz40 pz40VarQ2 = gkb.Q((n7m0) joh0Var.H0().M.getValue(), null, fetVar10, 0, 7);
                    Function0 function2 = (Function0) jhyVar;
                    Function0 function3 = (Function0) jhyVar2;
                    Function0 function4 = (Function0) ((jhy) objP29);
                    boolean zI22 = fetVar10.i(joh0Var);
                    Object objP30 = fetVar10.P();
                    if (zI22 || objP30 == cl5Var) {
                        objP30 = new gwg0(joh0Var, b3);
                        fetVar10.o0(objP30);
                    }
                    unh0.b0(function2, function3, function4, (Function1) objP30, pz40VarQ, pz40VarQ2, fetVar10, 0);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ dke0(Object obj, byte b) {
        this.f6226a = b;
        this.b = obj;
    }

    public /* synthetic */ dke0(Object obj, int i, byte b) {
        this.f6226a = b;
        this.b = obj;
    }
}
