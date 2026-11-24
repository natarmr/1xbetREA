package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aak0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f530a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ aak0(Object obj, Object obj2, wdr wdrVar, byte b) {
        this.f530a = b;
        this.c = obj;
        this.d = obj2;
        this.b = wdrVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f530a;
        jm40 jm40Var = jm40.b;
        pcy pcyVar = e7z.u1;
        Object obj3 = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                dak0.b((String) obj5, (String) obj4, (nrq) obj3, (fet) obj, x8x.L(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                dak0.c((e960) obj5, (g960) obj4, (nrq) obj3, (fet) obj, x8x.L(393));
                break;
            case 2:
                ((Integer) obj2).getClass();
                w9x.w((mm40) obj5, (ddk0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                tfx.o((mm40) obj5, (lik0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ufx.o((mm40) obj5, (fjk0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                vvw.l((mm40) obj5, (hjk0) obj4, (Function1) obj3, (fet) obj, x8x.L(7));
                break;
            case 6:
                ((Integer) obj2).getClass();
                uvw.l((mm40) obj5, (gjk0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                zvw.u((mm40) obj5, (uzb0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                b5x.q((mm40) obj5, (eok0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                o2e.U((mm40) obj5, (f1l0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                h8x.p(x8x.L(1), (y3d) obj4, (fet) obj, (mm40) obj3, (String) obj5);
                break;
            case 11:
                ((Integer) obj2).getClass();
                eeq.n((mm40) obj5, (usm) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                wdx.E((mm40) obj5, (y5l0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                zdx.b((mm40) obj5, (o6l0) obj4, (mpo) obj3, (fet) obj, x8x.L(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                cjx.G((mm40) obj5, (s8l0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                ufx.p((mm40) obj5, (mer0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                uvw.m((mm40) obj5, (i9l0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                qxw.p((mm40) obj5, (j83) obj4, (pz40) obj3, (fet) obj, x8x.L(1));
                break;
            case 18:
                mm40 mm40Var = (mm40) obj5;
                hal0 hal0Var = (hal0) obj4;
                Function2 function2 = (Function2) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    yx7 yx7Var = gqw0.k;
                    zcl zclVar = qmk.f28987a;
                    thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    zfn zfnVar = bmd.n;
                    float f = fetVar.k(zfnVar) == k6z.f17794a ? 12.0f : 0.0f;
                    float f2 = fetVar.k(zfnVar) == k6z.b ? 12.0f : 0.0f;
                    jm40 jm40Var2 = jm40.b;
                    h8x.l(s5x0.N(jm40Var2, f, 0.0f, f2, 0.0f, 10), hal0Var.b, hal0Var.c, w6n.h, function2, fetVar, 0);
                    eal0.a(0, fetVar, s5x0.N(o7k0.d(jm40Var2, 1.0f), 12.0f, 0.0f, 0.0f, 0.0f, 14), hal0Var.f12729a);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                mm40 mm40Var2 = (mm40) obj5;
                ial0 ial0Var = (ial0) obj4;
                Function2 function3 = (Function2) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    yx7 yx7Var2 = gqw0.k;
                    zcl zclVar2 = qmk.f28987a;
                    thg0 thg0VarA2 = shg0.a(new qw3(16.0f, true, new jf4((byte) 14)), yx7Var2, fetVar2, 48);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40Var2);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                    c3x.m(ial0Var.b, w6n.h, function3, fetVar2, 384, 1);
                    eal0.a(6, fetVar2, o7k0.d(jm40Var, 1.0f), ial0Var.f14444a);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            case 20:
                lal0 lal0Var = (lal0) obj5;
                w6n w6nVar = (w6n) obj4;
                Function2 function4 = (Function2) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    zcl zclVar3 = qmk.f28987a;
                    thg0 thg0VarA3 = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar3, 0);
                    int iHashCode3 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM3 = fetVar3.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar3, jm40Var);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, thg0VarA3, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC2, gqw0.v);
                    h8x.l(null, lal0Var.b, lal0Var.c, w6nVar, function4, fetVar3, 1);
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                break;
            case 21:
                ((Integer) obj2).getClass();
                kcx.v((mm40) obj5, (wll0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                i120.y((mm40) obj5, (ofh0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                j120.D((mm40) obj5, (kpl0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                o050.e((mm40) obj5, (mtl) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                n7x.n((mm40) obj5, (qxl0) obj4, (Function2) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                q8x.u((mm40) obj5, (n4m0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                db00 db00Var = (db00) obj5;
                Function1 function1 = (Function1) obj4;
                Function1 function5 = (Function1) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    va00 va00Var = (va00) db00Var;
                    boolean zG = fetVar4.g(function5);
                    Object objP = fetVar4.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zG || objP == cl5Var) {
                        objP = new elk0(function5, (byte) 27);
                        fetVar4.o0(objP);
                    }
                    Function1 function6 = (Function1) objP;
                    boolean zG2 = fetVar4.g(function5);
                    Object objP2 = fetVar4.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new elk0(function5, (byte) 28);
                        fetVar4.o0(objP2);
                    }
                    Function1 function7 = (Function1) objP2;
                    boolean zG3 = fetVar4.g(function5);
                    Object objP3 = fetVar4.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new yhl0(function5, (byte) 24);
                        fetVar4.o0(objP3);
                    }
                    t9x.z(va00Var, function1, function6, function7, (Function0) objP3, fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                nia0.U((mm40) obj5, (fbm0) obj4, (jbm0) obj3, (fet) obj, x8x.L(385));
                break;
            default:
                ((Integer) obj2).getClass();
                xia0.W((mm40) obj5, (gbm0) obj4, (jbm0) obj3, (fet) obj, x8x.L(385));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ aak0(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.f530a = b;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }
}
