package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class weq extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39031a;
    public final /* synthetic */ zeq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ weq(zeq zeqVar, byte b) {
        super(0);
        this.f39031a = b;
        this.b = zeqVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39031a;
        byte b2 = 8;
        byte b3 = 0;
        zeq zeqVar = this.b;
        switch (b) {
            case 0:
                return new op(zeqVar.k.f("adb_enabled"));
            case 1:
                return new c12(zeqVar.k.h("alarm_alert"));
            case 2:
                Object objE = c3x.E(3000L, new rg80(zeqVar.j, (byte) 0));
                iun iunVar = iun.f15405a;
                e0g0 e0g0Var = j0g0.b;
                if (objE instanceof g0g0) {
                    objE = iunVar;
                }
                return new av3((List) objE);
            case 3:
                Object objE2 = c3x.E(1000L, new fhk(zeqVar.l, b3));
                String[] strArr = new String[0];
                e0g0 e0g0Var2 = j0g0.b;
                if (objE2 instanceof g0g0) {
                    objE2 = strArr;
                }
                return new i85(tx3.g0((String[]) objE2));
            case 4:
                Object objE3 = c3x.E(1000L, new ab6(zeqVar.e, (byte) 1));
                e0g0 e0g0Var3 = j0g0.b;
                return new xa6((String) (objE3 instanceof g0g0 ? "" : objE3));
            case 5:
                Object objE4 = c3x.E(1000L, new ab6(zeqVar.e, (byte) 1));
                e0g0 e0g0Var4 = j0g0.b;
                return new ya6((String) (objE4 instanceof g0g0 ? "" : objE4));
            case 6:
                Object objE5 = c3x.E(1000L, new ab6(zeqVar.e, (byte) 0));
                e0g0 e0g0Var5 = j0g0.b;
                return new za6((String) (objE5 instanceof g0g0 ? "" : objE5));
            case 7:
                Object objE6 = c3x.E(1000L, new vut0(zeqVar.f, b2));
                iun iunVar2 = iun.f15405a;
                e0g0 e0g0Var6 = j0g0.b;
                if (objE6 instanceof g0g0) {
                    objE6 = iunVar2;
                }
                return new y0a((List) objE6);
            case 8:
                Object objE7 = c3x.E(1000L, new sz2(zeqVar.h, (byte) 6));
                List list = iun.f15405a;
                e0g0 e0g0Var7 = j0g0.b;
                if (objE7 instanceof g0g0) {
                    objE7 = list;
                }
                List list2 = (List) objE7;
                if (list2 != null) {
                    list = list2;
                }
                return new gyc(list);
            case 9:
                return new fbj(zeqVar.k.f("data_roaming"));
            case 10:
                return new qdj(zeqVar.k.h("date_format"));
            case 11:
                return new avj(zeqVar.k.g("default_input_method"));
            case 12:
                return new ngk(zeqVar.k.f("development_settings_enabled"));
            case 13:
                Object objE8 = c3x.E(1000L, new nhk(zeqVar.i, b3));
                e0g0 e0g0Var8 = j0g0.b;
                return new ywn((String) (objE8 instanceof g0g0 ? "" : objE8));
            case 14:
                return new zwn(zeqVar.k.h("end_button_behavior"));
            case 15:
                Object objE9 = c3x.E(1000L, new sz2(zeqVar.m, (byte) 8));
                jeq jeqVar = jeq.UNKNOWN;
                e0g0 e0g0Var9 = j0g0.b;
                if (objE9 instanceof g0g0) {
                    objE9 = jeqVar;
                }
                return new keq(((jeq) objE9).f16387a);
            case 16:
                return new ksq(zeqVar.k.h("font_scale"));
            case 17:
                return (za6) zeqVar.w.getValue();
            case 18:
                return (xa6) zeqVar.x.getValue();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (ya6) zeqVar.y.getValue();
            case 20:
                return (y0a) zeqVar.z.getValue();
            case 21:
                return (q7v) zeqVar.A.getValue();
            case 22:
                return (q) zeqVar.B.getValue();
            case 23:
                return (bne) zeqVar.C.getValue();
            case 24:
                return (leq) zeqVar.D.getValue();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (y23) zeqVar.E.getValue();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (vch0) zeqVar.F.getValue();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (eo20) zeqVar.n.getValue();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (pjy) zeqVar.G.getValue();
            default:
                return (ywn) zeqVar.H.getValue();
        }
    }
}
