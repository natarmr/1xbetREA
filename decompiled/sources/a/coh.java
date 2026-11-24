package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class coh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4700a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ coh(i4 i4Var, Function0 function0, Function0 function1) {
        this.f4700a = (byte) 11;
        this.b = i4Var;
        this.d = function0;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4700a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                wwb.e((mm40) obj5, (n0x) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                qzb.j((mm40) obj5, (moh) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                v3c.e((mm40) obj5, (a4x) obj4, (a4x) obj3, (fet) obj, x8x.L(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                lmc.b((mm40) obj5, (a4x) obj4, (cqh) obj3, (fet) obj, x8x.L(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                bfb.d((v3i) obj5, (String) obj4, (Function1) obj3, (fet) obj, x8x.L(385));
                break;
            case 5:
                ((Integer) obj2).getClass();
                lgb.t((mm40) obj5, (m0x) obj4, (qge) obj3, (fet) obj, x8x.L(3073));
                break;
            case 6:
                ((Integer) obj2).getClass();
                vzb.x((mm40) obj5, (String) obj4, (z1n) obj3, (fet) obj, x8x.L(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                obb.x((mm40) obj5, (g9n) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                jar0.q((s9n) obj5, (Function1) obj4, (Function0) obj3, (fet) obj, x8x.L(385));
                break;
            case 9:
                ((Integer) obj2).getClass();
                zjb.d((mm40) obj5, (hjm) obj4, (String) obj3, (fet) obj, x8x.L(1));
                break;
            case 10:
                ldj ldjVar = (ldj) obj5;
                ApplicationActivity applicationActivity = (ApplicationActivity) obj4;
                glz glzVar = (glz) obj3;
                blz blzVar = (blz) obj2;
                ((clz) obj).getClass();
                blzVar.getClass();
                q7x0 q7x0Var = ldjVar.f19853a;
                if (q7x0Var != null) {
                    applicationActivity.unregisterReceiver(q7x0Var);
                }
                ldjVar.f19853a = null;
                glzVar.f(blzVar);
                ldjVar.b = null;
                break;
            case 11:
                a4x a4xVar = (a4x) obj5;
                Function0 function0 = (Function0) obj3;
                Function0 function1 = (Function0) obj4;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                byte b2 = 2;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    vxl vxlVar = vxl.b;
                    tyl tylVar = tyl.f34760a;
                    syl sylVar = syl.f33027a;
                    jyl jylVar = new jyl(null, null, null, 127);
                    zcl zclVar = qmk.f28987a;
                    lh80 lh80VarT = s5x0.t(8.0f, 0.0f, 2);
                    boolean zG = fetVar.g(function0) | fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new yhd(function0, function1, b2);
                        fetVar.o0(objP);
                    }
                    lcc.b(null, a4xVar, vxlVar, tylVar, sylVar, jylVar, lh80VarT, false, (Function1) objP, null, fetVar, 224640, 641);
                } else {
                    fetVar.X();
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                dub.F((i8m) obj5, (xcz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                sac.m((mm40) obj5, (prk) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                lgb.h((mm40) obj5, (lkl) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                zgc.o((mm40) obj5, (okl) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                j2e.r((mm40) obj5, (rkl) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                o2e.t((mm40) obj5, (ukl) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                tke.v((mm40) obj5, (xkl) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                ozb.r((String) obj5, (bpl) obj4, (Function0) obj3, (fet) obj, x8x.L(7));
                break;
            case 20:
                ((Integer) obj2).getClass();
                qbc.y((mm40) obj5, (String) obj4, (sql) obj3, (fet) obj, x8x.L(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                ieb.H((String) obj5, (ny1) obj4, (String) obj3, (fet) obj, x8x.L(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                ulb.a(x8x.L(1), (ugd) obj3, (xdr) obj5, (xdr) obj4, (fet) obj);
                break;
            case 23:
                ((Integer) obj2).getClass();
                ju70.j((mm40) obj5, (cvl) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                vdb.i((mm40) obj5, (u6n) obj4, (String) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                xia0.s((mm40) obj5, (o0x) obj4, (Function0) obj3, (fet) obj, x8x.L(7));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                xia0.M((mm40) obj5, (n0x) obj4, (m0x) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                bfb.p((mm40) obj5, (t4m) obj4, (rah0) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                tlb.E((e8n) obj5, (Function0) obj3, (Function0) obj4, (fet) obj, x8x.L(1));
                break;
            default:
                ((Integer) obj2).getClass();
                dub.K((mm40) obj5, (q7m) obj4, (a4x) obj3, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ coh(ldj ldjVar, ApplicationActivity applicationActivity, glz glzVar) {
        this.f4700a = (byte) 10;
        this.b = ldjVar;
        this.c = applicationActivity;
        this.d = glzVar;
    }

    public /* synthetic */ coh(e8n e8nVar, Function0 function0, Function0 function1, int i) {
        this.f4700a = (byte) 28;
        this.b = e8nVar;
        this.d = function0;
        this.c = function1;
    }

    public /* synthetic */ coh(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.f4700a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
