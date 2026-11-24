package a;

import android.os.Build;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class yeq extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42500a;
    public final /* synthetic */ zeq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yeq(zeq zeqVar, byte b) {
        super(0);
        this.f42500a = b;
        this.b = zeqVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f42500a;
        byte b2 = 10;
        byte b3 = 1;
        zeq zeqVar = this.b;
        switch (b) {
            case 0:
                return (mgr0) zeqVar.q.getValue();
            case 1:
                return (eoq0) zeqVar.k0.getValue();
            case 2:
                return (jyb0) zeqVar.r.getValue();
            case 3:
                return (kyb0) zeqVar.s.getValue();
            case 4:
                return (ofi0) zeqVar.t.getValue();
            case 5:
                return (qex) zeqVar.u.getValue();
            case 6:
                return (rex) zeqVar.v.getValue();
            case 7:
                Object objE = c3x.E(1000L, new sz2(zeqVar.g, (byte) 10));
                e0g0 e0g0Var = j0g0.b;
                return new q7v((String) (objE instanceof g0g0 ? "" : objE));
            case 8:
                return new stw(zeqVar.k.f("http_proxy"));
            case 9:
                Object objE2 = c3x.E(1000L, new sz2(zeqVar.d, (byte) 12));
                iun iunVar = iun.f15405a;
                e0g0 e0g0Var2 = j0g0.b;
                if (objE2 instanceof g0g0) {
                    objE2 = iunVar;
                }
                return new qex((List) objE2);
            case 10:
                Object objE3 = c3x.E(1000L, new sz2(zeqVar.d, (byte) 12));
                iun iunVar2 = iun.f15405a;
                e0g0 e0g0Var3 = j0g0.b;
                if (objE3 instanceof g0g0) {
                    objE3 = iunVar2;
                }
                return new rex((List) objE3);
            case 11:
                Object objE4 = c3x.E(1000L, new nhk(zeqVar.i, b3));
                Boolean bool = Boolean.FALSE;
                e0g0 e0g0Var4 = j0g0.b;
                if (objE4 instanceof g0g0) {
                    objE4 = bool;
                }
                return new mqx(((Boolean) objE4).booleanValue());
            case 12:
                Object objE5 = c3x.E(1000L, new vut0((Object) zeqVar.f44265a, (byte) 9));
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                e0g0 e0g0Var5 = j0g0.b;
                if (objE5 instanceof g0g0) {
                    objE5 = lunVar;
                }
                return new jyb0((Map) objE5);
            case 13:
                Object objE6 = c3x.E(1000L, new vut0(zeqVar.f44265a, b2));
                v7f v7fVar = v7f.c;
                e0g0 e0g0Var6 = j0g0.b;
                if (objE6 instanceof g0g0) {
                    objE6 = v7fVar;
                }
                return new kyb0((v7f) objE6);
            case 14:
                Object objE7 = c3x.E(1000L, new fhk(zeqVar.l, b3));
                e0g0 e0g0Var7 = j0g0.b;
                return new pse0((String) (objE7 instanceof g0g0 ? "" : objE7));
            case 15:
                Object objE8 = c3x.E(1000L, new fhk(zeqVar.l, (byte) 2));
                e0g0 e0g0Var8 = j0g0.b;
                return new gcg0((String) (objE8 instanceof g0g0 ? "" : objE8));
            case 16:
                return new vkg0(Build.VERSION.SDK_INT >= 28 ? zeqVar.k.g("rtt_calling_mode") : "");
            case 17:
                return new s7h0(zeqVar.k.h("screen_off_timeout"));
            case 18:
                Object objE9 = c3x.E(1000L, new sz2(zeqVar.c, (byte) 20));
                iun iunVar3 = iun.f15405a;
                e0g0 e0g0Var9 = j0g0.b;
                if (objE9 instanceof g0g0) {
                    objE9 = iunVar3;
                }
                return new ofi0((List) objE9);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Object objE10 = c3x.E(3000L, new rg80(zeqVar.j, (byte) 1));
                iun iunVar4 = iun.f15405a;
                e0g0 e0g0Var10 = j0g0.b;
                if (objE10 instanceof g0g0) {
                    objE10 = iunVar4;
                }
                return new z8o0((List) objE10);
            case 20:
                return new z2q0(zeqVar.k.h("auto_punctuate"));
            case 21:
                return new a3q0(zeqVar.k.h("auto_replace"));
            case 22:
                return new ogq0(zeqVar.k.h("time_12_24"));
            case 23:
                Object objE11 = c3x.E(1000L, new qq30(zeqVar.b, (byte) 0));
                e0g0 e0g0Var11 = j0g0.b;
                if (objE11 instanceof g0g0) {
                    objE11 = 0L;
                }
                return new mgr0(((Number) objE11).longValue());
            case 24:
                Object objE12 = c3x.E(1000L, new qq30(zeqVar.b, b3));
                e0g0 e0g0Var12 = j0g0.b;
                if (objE12 instanceof g0g0) {
                    objE12 = 0L;
                }
                return new ngr0(((Number) objE12).longValue());
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new ewr0(zeqVar.k.g("touch_exploration_enabled"));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new ims0(zeqVar.k.f("transition_animation_scale"));
            default:
                return new ihv0(zeqVar.k.f("window_animation_scale"));
        }
    }
}
