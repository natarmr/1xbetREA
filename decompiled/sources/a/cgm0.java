package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cgm0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4319a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cgm0(Object obj, Object obj2, Object obj3, byte b) {
        this.f4319a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4319a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                zdm0 zdm0Var = (zdm0) obj5;
                f9m0 f9m0Var = (f9m0) obj4;
                j9m0 j9m0Var = (j9m0) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fetVar.X();
                } else if ((zdm0Var.a() == eme.f8041a || zdm0Var.a() == eme.b) && !f9m0Var.d) {
                    fetVar.e0(-1106401078);
                    ffb0.C(zdm0Var, j9m0Var, fetVar, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1106211761);
                    fetVar.r(false);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                qim0.d((mm40) obj5, (a0z) obj4, (Function1) obj3, (fet) obj, x8x.L(385));
                break;
            case 2:
                ((Integer) obj2).getClass();
                unh0.c0((mm40) obj5, (u2n0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                rsr0.P((l7m0) obj5, (Function1) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                jpm0.e((mm40) obj5, (t3q) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ltt0.e((mm40) obj5, (hao0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                epv0.J((mm40) obj5, (wdo0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                hew0.D((mm40) obj5, (t89) obj4, (Function0) obj3, (fet) obj, x8x.L(49));
                break;
            case 8:
                ((Integer) obj2).getClass();
                y0x0.B((mm40) obj5, (mno0) obj4, (ugd) obj3, (fet) obj, x8x.L(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                cy2.h((mm40) obj5, (c0p0) obj4, (Function0) obj3, (fet) obj, x8x.L(7));
                break;
            case 10:
                ((Integer) obj2).getClass();
                xf0.C((mm40) obj5, (l4p0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                xf0.D((mm40) obj5, (mhe) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                j5n0.i((mm40) obj5, (y4p0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                rsm0.h((mm40) obj5, (ixp0) obj4, (xdr) obj3, (fet) obj, x8x.L(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                a4n0.a((mm40) obj5, (k9q0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                u4n0.h((mm40) obj5, (l9q0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                j5n0.k((mm40) obj5, (m9q0) obj4, (Function1) obj3, (fet) obj, x8x.L(7));
                break;
            case 17:
                ((Integer) obj2).getClass();
                ewm0.h(x8x.L(1), (v3n) obj3, (fet) obj, (mm40) obj5, (String) obj4);
                break;
            case 18:
                cp cpVar = (cp) obj5;
                usq0 usq0Var = (usq0) obj4;
                cym0 cym0Var = (cym0) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    gy30 gy30Var = ((i140) cpVar.u()).d;
                    boolean zG = fetVar2.g(usq0Var) | fetVar2.i(cpVar);
                    Object objP = fetVar2.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zG || objP == cl5Var) {
                        objP = new yip0((Object) usq0Var, (Object) cpVar, (byte) 16);
                        fetVar2.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zG2 = fetVar2.g(cym0Var);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new h3q0(cym0Var, (byte) 20);
                        fetVar2.o0(objP2);
                    }
                    jiq0.y(null, gy30Var, function0, null, (Function0) objP2, fetVar2, 0, 9);
                } else {
                    fetVar2.X();
                }
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                k7n0.k((mm40) obj5, (irq0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                dem0.f((mm40) obj5, (f4r0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                fem0.d((mm40) obj5, (h4r0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                qem0.h((mm40) obj5, (i5r0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                s7r0.a((mm40) obj5, (t7r0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                wgm0.m((mm40) obj5, (d8r0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                knm0.d((mm40) obj5, (adr0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                xnm0.e((mm40) obj5, (bdr0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                osm0.c((mm40) obj5, (hyl) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                gq80.P((mm40) obj5, (lcb0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            default:
                ((Integer) obj2).getClass();
                gq80.q((mm40) obj5, (gij) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ cgm0(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.f4319a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
