package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pd50 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26792a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ pd50(w2d w2dVar, pl7 pl7Var, Function1 function1, l7m0 l7m0Var) {
        this.f26792a = (byte) 8;
        this.b = w2dVar;
        this.c = pl7Var;
        this.d = function1;
        this.e = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26792a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                zvw.j((zsv) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                lv00.t((mm40) obj6, (zo50) obj5, (xdr) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                lv00.n((mm40) obj6, (yo5) obj5, (Function1) obj4, (xdr) obj3, (fet) obj, x8x.L(65));
                break;
            case 3:
                ((Integer) obj2).getClass();
                lv00.I((mm40) obj6, (w2d) obj5, (cp50) obj4, (Function1) obj3, (fet) obj, x8x.L(71));
                break;
            case 4:
                ((Integer) obj2).getClass();
                i120.h((mm40) obj6, (vo5) obj5, (Function1) obj4, (xdr) obj3, (fet) obj, x8x.L(65));
                break;
            case 5:
                ((Integer) obj2).getClass();
                j120.q((mm40) obj6, (String) obj5, (mq50) obj4, (Function1) obj3, (fet) obj, x8x.L(7));
                break;
            case 6:
                ((Integer) obj2).getClass();
                gq80.h((dw50) obj6, (w2d) obj3, (Function0) obj5, (Function0) obj4, (fet) obj, x8x.L(65));
                break;
            case 7:
                ((Integer) obj2).getClass();
                gq80.G((String) obj6, (Function0) obj5, (Function0) obj4, (mm40) obj3, (fet) obj, x8x.L(1));
                break;
            case 8:
                w2d w2dVar = (w2d) obj6;
                pl7 pl7Var = (pl7) obj5;
                Function1 function1 = (Function1) obj4;
                l7m0 l7m0Var = (l7m0) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                byte b2 = 2;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, jm40.b);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    agc.y(null, w2dVar, u1c.M(62578518, new xbd(pl7Var, function1, b2), fetVar), u1c.M(-1837337961, new dr50((Object) function1, (Object) l7m0Var, (Object) pl7Var, (byte) 6), fetVar), fetVar, 3520);
                    mbc.o(zfi0.f44303a, null, false, fetVar, 6, 6);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                oja0.y((g960) obj6, (String) obj5, (e960) obj4, (nrq) obj3, (fet) obj, x8x.L(3585));
                break;
            case 10:
                ((Integer) obj2).getClass();
                qxw.h((mm40) obj6, (jv60) obj5, (xcz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                rsr0.G((d9z) obj6, (l7m0) obj5, (Function1) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                g1x.g((mm40) obj6, (v370) obj5, (xcz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                epv0.z((mm40) obj6, (pz40) obj5, (bdz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                s0x.m((mm40) obj6, (fe80) obj4, (Function0) obj5, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                cy2.m((Map) obj6, (v9c) obj5, (l7m0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                idx.i((mm40) obj6, (k090) obj5, (cqq) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                vdx.o((mm40) obj6, (l090) obj5, (cqq) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                wdx.r((mm40) obj6, (m090) obj5, (cqq) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                r7x.f((mm40) obj6, (vl90) obj5, (cqq) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                u7x.h((mm40) obj6, (wl90) obj5, (cqq) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                a8k0.g((mm40) obj6, (yl90) obj5, (cqq) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                j47.e0((mm40) obj6, (du90) obj4, (Function0) obj5, (Function1) obj3, (fet) obj, x8x.L(7));
                break;
            case 23:
                ((Integer) obj2).getClass();
                rq8.q((mm40) obj6, (nz30) obj5, (wui0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                g2a0.a((mm40) obj6, (x2a0) obj5, (Function1) obj4, (ugd) obj3, (fet) obj, x8x.L(3073));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                m7x.h((mm40) obj6, (h6a0) obj5, (Function2) obj4, (xdr) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                r8x.r((mm40) obj6, (deo0) obj5, (a4x) obj4, (ucr0) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                ju70.B((mm40) obj6, (nua0) obj5, (zcz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                gq80.L((mm40) obj6, (l7m0) obj5, (Function1) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            default:
                ((Integer) obj2).getClass();
                bdx.t((mm40) obj6, (b8c0) obj5, (Function1) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ pd50(byte b, int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f26792a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ pd50(mm40 mm40Var, Object obj, Function0 function0, Function1 function1, int i, byte b) {
        this.f26792a = b;
        this.b = mm40Var;
        this.d = obj;
        this.c = function0;
        this.e = function1;
    }

    public /* synthetic */ pd50(dw50 dw50Var, w2d w2dVar, Function0 function0, Function0 function1, int i) {
        this.f26792a = (byte) 6;
        this.b = dw50Var;
        this.e = w2dVar;
        this.c = function0;
        this.d = function1;
    }
}
