package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mtz implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22389a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mtz(Object obj, Object obj2, Object obj3, byte b) {
        this.f22389a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22389a;
        cl5 cl5Var = ukd.f35823a;
        boolean z = false;
        final byte b2 = 2;
        final byte b3 = 1;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                oja0.P((mm40) obj5, (utz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                ffb0.G((mm40) obj5, (hvz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                ro4.T((mm40) obj5, (vwz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                x4d0.U((mm40) obj5, (syz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                unh0.d0((mm40) obj5, (f100) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                ccq0.M((mm40) obj5, (p400) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                hew0.u((vby) obj5, (xd10) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                q0x.h((mm40) obj5, (vf10) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                q0x.i((mm40) obj5, (tf10) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                m7x.f((mm40) obj5, (l4b) obj4, (nv10) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                p7x.b((k3t0) obj5, (llm0) obj4, (Function0) obj3, (fet) obj, x8x.L(9));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                r7x.b((mm40) obj5, (eb10) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 12:
                hx4 hx4Var = (hx4) obj5;
                on20 on20Var = (on20) obj4;
                a820 a820Var = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var.getClass();
                knb0 knb0Var = hx4Var.e;
                return a820.a(a820Var, null, null, null, null, null, hx4.a(hx4Var, null, null, null, null, knb0.a(on20Var.h0(false, null), (String) obj3, on20Var.r0()), false, 47), null, false, null, 0.0f, false, null, 0, false, false, false, 262079);
            case 13:
                ((Integer) obj2).getClass();
                ep20.d((mm40) obj5, (fp20) obj4, (fp20) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                l7x.c((mm40) obj5, (kfm) obj4, (cem) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                pz40 pz40Var = (pz40) obj5;
                a830 a830Var = (a830) obj4;
                final w430 w430Var = (w430) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                u430 u430Var = w430.Y1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarQ = qjj.Q(jm40.b);
                    w730 w730Var = (w730) a830Var;
                    udl0 udl0Var = w730Var.f38652a;
                    boolean z2 = w730Var.b;
                    boolean zI = fetVar.i(w430Var);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        objP = new r430(w430Var, (byte) 1);
                        fetVar.o0(objP);
                    }
                    Function1 function1 = (Function1) objP;
                    boolean zI2 = fetVar.i(w430Var);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new r430(w430Var, (byte) 2);
                        fetVar.o0(objP2);
                    }
                    Function1 function2 = (Function1) objP2;
                    boolean zI3 = fetVar.i(w430Var);
                    Object objP3 = fetVar.P();
                    if (zI3 || objP3 == cl5Var) {
                        objP3 = new xdr() { // from class: a.s430
                            @Override // a.xdr
                            public final Object F(Object obj6, Object obj7, Object obj8) {
                                byte b4 = b3;
                                w430 w430Var2 = w430Var;
                                Long l = (Long) obj6;
                                switch (b4) {
                                    case 0:
                                        long jLongValue = l.longValue();
                                        String str = (String) obj7;
                                        boolean zBooleanValue = ((Boolean) obj8).booleanValue();
                                        u430 u430Var2 = w430.Y1;
                                        str.getClass();
                                        w430Var2.G0().x(new ky20(new jv20(str, jLongValue, zBooleanValue)));
                                        break;
                                    case 1:
                                        long jLongValue2 = l.longValue();
                                        long jLongValue3 = ((Long) obj7).longValue();
                                        double dDoubleValue = ((Double) obj8).doubleValue();
                                        u430 u430Var3 = w430.Y1;
                                        w430Var2.G0().x(new jy20(new f130(dDoubleValue, jLongValue2, jLongValue3)));
                                        break;
                                    default:
                                        long jLongValue4 = l.longValue();
                                        String str2 = (String) obj7;
                                        boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                                        u430 u430Var4 = w430.Y1;
                                        str2.getClass();
                                        w430Var2.G0().x(new ky20(new iv20(str2, jLongValue4, zBooleanValue2)));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar.o0(objP3);
                    }
                    xdr xdrVar = (xdr) objP3;
                    boolean zI4 = fetVar.i(w430Var);
                    Object objP4 = fetVar.P();
                    if (zI4 || objP4 == cl5Var) {
                        objP4 = new xdr() { // from class: a.s430
                            @Override // a.xdr
                            public final Object F(Object obj6, Object obj7, Object obj8) {
                                byte b4 = b2;
                                w430 w430Var2 = w430Var;
                                Long l = (Long) obj6;
                                switch (b4) {
                                    case 0:
                                        long jLongValue = l.longValue();
                                        String str = (String) obj7;
                                        boolean zBooleanValue = ((Boolean) obj8).booleanValue();
                                        u430 u430Var2 = w430.Y1;
                                        str.getClass();
                                        w430Var2.G0().x(new ky20(new jv20(str, jLongValue, zBooleanValue)));
                                        break;
                                    case 1:
                                        long jLongValue2 = l.longValue();
                                        long jLongValue3 = ((Long) obj7).longValue();
                                        double dDoubleValue = ((Double) obj8).doubleValue();
                                        u430 u430Var3 = w430.Y1;
                                        w430Var2.G0().x(new jy20(new f130(dDoubleValue, jLongValue2, jLongValue3)));
                                        break;
                                    default:
                                        long jLongValue4 = l.longValue();
                                        String str2 = (String) obj7;
                                        boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                                        u430 u430Var4 = w430.Y1;
                                        str2.getClass();
                                        w430Var2.G0().x(new ky20(new iv20(str2, jLongValue4, zBooleanValue2)));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar.o0(objP4);
                    }
                    xdr xdrVar2 = (xdr) objP4;
                    boolean zI5 = fetVar.i(w430Var);
                    Object objP5 = fetVar.P();
                    if (zI5 || objP5 == cl5Var) {
                        final byte b4 = z ? (byte) 1 : (byte) 0;
                        objP5 = new xdr() { // from class: a.s430
                            @Override // a.xdr
                            public final Object F(Object obj6, Object obj7, Object obj8) {
                                byte b5 = b4;
                                w430 w430Var2 = w430Var;
                                Long l = (Long) obj6;
                                switch (b5) {
                                    case 0:
                                        long jLongValue = l.longValue();
                                        String str = (String) obj7;
                                        boolean zBooleanValue = ((Boolean) obj8).booleanValue();
                                        u430 u430Var2 = w430.Y1;
                                        str.getClass();
                                        w430Var2.G0().x(new ky20(new jv20(str, jLongValue, zBooleanValue)));
                                        break;
                                    case 1:
                                        long jLongValue2 = l.longValue();
                                        long jLongValue3 = ((Long) obj7).longValue();
                                        double dDoubleValue = ((Double) obj8).doubleValue();
                                        u430 u430Var3 = w430.Y1;
                                        w430Var2.G0().x(new jy20(new f130(dDoubleValue, jLongValue2, jLongValue3)));
                                        break;
                                    default:
                                        long jLongValue4 = l.longValue();
                                        String str2 = (String) obj7;
                                        boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                                        u430 u430Var4 = w430.Y1;
                                        str2.getClass();
                                        w430Var2.G0().x(new ky20(new iv20(str2, jLongValue4, zBooleanValue2)));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar.o0(objP5);
                    }
                    xdr xdrVar3 = (xdr) objP5;
                    k3t0 k3t0VarG0 = w430Var.G0();
                    boolean zI6 = fetVar.i(k3t0VarG0);
                    Object objP6 = fetVar.P();
                    if (zI6 || objP6 == cl5Var) {
                        du20 du20Var = new du20(1, k3t0VarG0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 4);
                        fetVar.o0(du20Var);
                        objP6 = du20Var;
                    }
                    idx.d(mm40VarQ, pz40Var, udl0Var, z2, null, function1, function2, xdrVar, xdrVar2, xdrVar3, (Function1) ((jhy) objP6), fetVar, 0, 0, 16);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 16:
                xk80 xk80Var = (xk80) obj5;
                Map map = (Map) obj4;
                qd30 qd30Var = (qd30) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    q5x.e(xk80Var, null, null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(-1760151587, new d2s(map, qd30Var, (byte) 10), fetVar2), fetVar2, 100663296, 24576, 16126);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                ay3.w((mm40) obj5, (vo30) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                j47.Y((mm40) obj5, (sfl0) obj4, (hhv) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                p8a.y((mm40) obj5, (l240) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                g1x.e((ia40) obj5, (d39) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                z1x.g((mm40) obj5, (ma40) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                o2e.G((g2v) obj5, (wk40) obj4, (Function0) obj3, (fet) obj, x8x.L(65));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                q0x.n((xcz) obj5, (ll7) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                bdx.m((mm40) obj5, (z250) obj4, (Function1) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                eeq.N((mm40) obj5, (c8r0) obj4, (Function1) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                idx.e((mm40) obj5, (q850) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                xvw.e((mm40) obj5, (kc50) obj4, (Function0) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                w2d w2dVar = (w2d) obj5;
                cp50 cp50Var = (cp50) obj4;
                Function1 function3 = (Function1) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zG = fetVar3.g(function3);
                    Object objP7 = fetVar3.P();
                    if (zG || objP7 == cl5Var) {
                        objP7 = new nc40(function3, b2);
                        fetVar3.o0(objP7);
                    }
                    xdr xdrVar4 = (xdr) objP7;
                    boolean zG2 = fetVar3.g(function3);
                    Object objP8 = fetVar3.P();
                    if (zG2 || objP8 == cl5Var) {
                        objP8 = new nc40(function3, (byte) 3);
                        fetVar3.o0(objP8);
                    }
                    xdr xdrVar5 = (xdr) objP8;
                    boolean zG3 = fetVar3.g(function3);
                    Object objP9 = fetVar3.P();
                    if (zG3 || objP9 == cl5Var) {
                        objP9 = new x6s(function3, (byte) 18);
                        fetVar3.o0(objP9);
                    }
                    Function2 function4 = (Function2) objP9;
                    boolean zG4 = fetVar3.g(function3);
                    Object objP10 = fetVar3.P();
                    if (zG4 || objP10 == cl5Var) {
                        objP10 = new w250(function3, (byte) 14);
                        fetVar3.o0(objP10);
                    }
                    Function0 function0 = (Function0) objP10;
                    boolean zG5 = fetVar3.g(function3);
                    Object objP11 = fetVar3.P();
                    if (zG5 || objP11 == cl5Var) {
                        objP11 = new rp30(function3, (byte) 19);
                        fetVar3.o0(objP11);
                    }
                    Function1 function5 = (Function1) objP11;
                    boolean zG6 = fetVar3.g(function3);
                    Object objP12 = fetVar3.P();
                    if (zG6 || objP12 == cl5Var) {
                        objP12 = new rp30(function3, (byte) 20);
                        fetVar3.o0(objP12);
                    }
                    Function1 function6 = (Function1) objP12;
                    boolean zG7 = fetVar3.g(function3);
                    Object objP13 = fetVar3.P();
                    if (zG7 || objP13 == cl5Var) {
                        objP13 = new w250(function3, (byte) 12);
                        fetVar3.o0(objP13);
                    }
                    lv00.J(w2dVar, cp50Var, xdrVar4, xdrVar5, function4, function0, function5, function6, (Function0) objP13, fetVar3, 8);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                i120.D((mm40) obj5, (rp50) obj4, (Function1) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ mtz(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.f22389a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }
}
