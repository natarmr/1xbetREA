package a;

import androidx.viewpager.widget.ViewPager;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xd80 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40682a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xd80(Object obj, Object obj2, byte b) {
        this.f40682a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f40682a;
        cl5 cl5Var = ukd.f35823a;
        yje yjeVar = null;
        byte b2 = 2;
        byte b3 = 1;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                q0x.a((mm40) obj4, (xm6) obj3, (fet) obj, x8x.L(1));
                break;
            case 1:
                jie0 jie0Var = (jie0) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                jie0Var.f16571a += ((u8z) obj3).b.a(fFloatValue - jie0Var.f16571a);
                break;
            case 2:
                gn80 gn80Var = (gn80) obj4;
                pz40 pz40Var = (pz40) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                mi70 mi70Var = gn80.N1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    cy2.o((tn80) gn80Var.M1.getValue(), (ln80) pz40Var.getValue(), fetVar, 8);
                } else {
                    fetVar.X();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                cy2.o((tn80) obj4, (ln80) obj3, (fet) obj, x8x.L(9));
                break;
            case 4:
                ((Integer) obj2).getClass();
                d9x.o((mm40) obj4, (pw80) obj3, (fet) obj, x8x.L(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                t9x.l((mm40) obj4, (cx80) obj3, (fet) obj, x8x.L(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                bdx.M((zx80) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 7:
                b190 b190Var = (b190) obj4;
                ViewPager viewPager = (ViewPager) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                fl70 fl70Var = b190.V1;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    pz40 pz40VarQ = gkb.Q(vtb.N(b190Var.H0().t), null, fetVar2, 0, 7);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(jm40.b, 16.0f, 16.0f, 16.0f, 0.0f, 8);
                    a4x a4xVar = ((m190) pz40VarQ.getValue()).b;
                    dxh0 dxh0Var = ((m190) pz40VarQ.getValue()).f20996a;
                    boolean zG = fetVar2.g(pz40VarQ);
                    Object objP = fetVar2.P();
                    if (zG || objP == cl5Var) {
                        objP = new rip(pz40VarQ, (byte) 18);
                        fetVar2.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zI = fetVar2.i(viewPager) | fetVar2.i(b190Var);
                    Object objP2 = fetVar2.P();
                    if (zI || objP2 == cl5Var) {
                        objP2 = new ka70(viewPager, b190Var, (byte) 11);
                        fetVar2.o0(objP2);
                    }
                    ibc.n(mm40VarN, a4xVar, gxh0.f12078a, dxh0Var, false, function0, (Function1) objP2, fetVar2, 384, 16);
                } else {
                    fetVar2.X();
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                nh70 nh70Var = l590.Y1;
                ((l590) obj4).G0((Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 9:
                p990 p990Var = (p990) obj4;
                b1j.z((String) obj2, (Throwable) obj);
                vd1 vd1Var = p990Var.k;
                String strJ = sre0.f32672a.b(((Throwable) obj3).getClass()).J();
                Map mapB = wp20.b(new Pair("error", strJ != null ? strJ : ""));
                vd1Var.getClass();
                mapB.getClass();
                vd1Var.f37210a.a("dep_load_url_crash", mapB);
                sac.V(jiu0.a(p990Var), new ev80((byte) 17), null, null, new z210(p990Var, yjeVar, (byte) 26), 14);
                break;
            case 10:
                db90 db90Var = (db90) obj4;
                b1j.z((String) obj2, (Throwable) obj);
                vd1 vd1Var2 = db90Var.y;
                String strJ2 = sre0.f32672a.b(((Throwable) obj3).getClass()).J();
                Map mapB2 = wp20.b(new Pair("error", strJ2 != null ? strJ2 : ""));
                vd1Var2.getClass();
                mapB2.getClass();
                vd1Var2.f37210a.a("dep_load_url_crash", mapB2);
                db90Var.G(y990.f42234a);
                break;
            case 11:
                ((Integer) obj2).getClass();
                ufx.l((mm40) obj4, (kb90) obj3, (fet) obj, x8x.L(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                cww.g((mm40) obj4, (nc90) obj3, (fet) obj, x8x.L(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                fww.h((mm40) obj4, (mc90) obj3, (fet) obj, x8x.L(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                q8x.m((mm40) obj4, (bq90) obj3, (fet) obj, x8x.L(1));
                break;
            case 15:
                du90 du90Var = (du90) obj4;
                Function1 function1 = (Function1) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mm40 mm40VarE0 = o2e.e0(jm40.b, "KEYBOARD_BUTTON_ROWS");
                    ngv ngvVar = new ngv(3);
                    zcl zclVar2 = qmk.f28987a;
                    qw3 qw3Var = new qw3(40.0f, true, new jf4((byte) 14));
                    qw3 qw3Var2 = new qw3(16.0f, true, new jf4((byte) 14));
                    boolean zG2 = fetVar3.g(du90Var) | fetVar3.g(function1);
                    Object objP3 = fetVar3.P();
                    if (zG2 || objP3 == cl5Var) {
                        objP3 = new ka70(du90Var, function1, (byte) 19);
                        fetVar3.o0(objP3);
                    }
                    g8x.i(ngvVar, mm40VarE0, null, null, qw3Var2, qw3Var, null, false, null, (Function1) objP3, fetVar3, 48, 924);
                } else {
                    fetVar3.X();
                }
                break;
            case 16:
                ((Integer) obj2).getClass();
                rq8.x((mm40) obj4, (ehm0) obj3, (fet) obj, x8x.L(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                o2e.l((mm40) obj4, (iva) obj3, (fet) obj, x8x.L(65));
                break;
            case 18:
                ((Integer) obj2).getClass();
                xvw.h((mm40) obj4, (t0a0) obj3, (fet) obj, x8x.L(1));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                xww.i((mm40) obj4, (q2a0) obj3, (fet) obj, x8x.L(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                x8f.u((o3a0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                x8f.T((hyl) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                x8f.s((q3a0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                x8f.r((p3a0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                s0x.p((nea0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                x0x.m((mm40) obj4, (deo0) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                x1x.i((mm40) obj4, (szy) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                h6a0 h6a0Var = (h6a0) obj4;
                xdr xdrVar = (xdr) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean z = h6a0Var.c;
                    boolean zG3 = fetVar4.g(xdrVar) | fetVar4.i(h6a0Var);
                    Object objP4 = fetVar4.P();
                    if (zG3 || objP4 == cl5Var) {
                        objP4 = new f6a0(xdrVar, h6a0Var, b3);
                        fetVar4.o0(objP4);
                    }
                    q7x.j(0, fetVar4, null, (Function0) objP4, z);
                } else {
                    fetVar4.X();
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                h6a0 h6a0Var2 = (h6a0) obj4;
                Function2 function2 = (Function2) obj3;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    zb zbVar = new zb(null, null, 7);
                    boolean z2 = h6a0Var2.d;
                    boolean zG4 = fetVar5.g(function2) | fetVar5.i(h6a0Var2);
                    Object objP5 = fetVar5.P();
                    if (zG4 || objP5 == cl5Var) {
                        objP5 = new e6a0(function2, h6a0Var2, b2);
                        fetVar5.o0(objP5);
                    }
                    acb.n(zbVar, z2, (Function0) objP5, null, fetVar5, 0, 8);
                } else {
                    fetVar5.X();
                }
                break;
            default:
                mm40 mm40Var = (mm40) obj4;
                c7a0 c7a0Var = (c7a0) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    b8k0.l(mm40Var, ((a7a0) c7a0Var).f357a, fetVar6, 0);
                } else {
                    fetVar6.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ xd80(Object obj, Object obj2, int i, byte b) {
        this.f40682a = b;
        this.b = obj;
        this.c = obj2;
    }
}
