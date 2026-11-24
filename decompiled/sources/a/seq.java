package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class seq extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32085a;
    public final /* synthetic */ zeq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ seq(zeq zeqVar, byte b) {
        super(0);
        this.f32085a = b;
        this.b = zeqVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f32085a;
        zeq zeqVar = this.b;
        switch (b) {
            case 0:
                return (mqx) zeqVar.e0.getValue();
            case 1:
                return (keq) zeqVar.f0.getValue();
            case 2:
                return (stw) zeqVar.O.getValue();
            case 3:
                return (gcg0) zeqVar.g0.getValue();
            case 4:
                return (i85) zeqVar.h0.getValue();
            case 5:
                return (pse0) zeqVar.i0.getValue();
            case 6:
                return (eoq0) zeqVar.k0.getValue();
            case 7:
                return (nvj) zeqVar.j0.getValue();
            case 8:
                return (ims0) zeqVar.P.getValue();
            case 9:
                return (ihv0) zeqVar.Q.getValue();
            case 10:
                return (fbj) zeqVar.R.getValue();
            case 11:
                return (q6) zeqVar.S.getValue();
            case 12:
                return (avj) zeqVar.T.getValue();
            case 13:
                return (vkg0) zeqVar.U.getValue();
            case 14:
                return (ngr0) zeqVar.p.getValue();
            case 15:
                return (mgr0) zeqVar.q.getValue();
            case 16:
                return (jyb0) zeqVar.r.getValue();
            case 17:
                return (ofi0) zeqVar.t.getValue();
            case 18:
                return (qex) zeqVar.u.getValue();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (xa6) zeqVar.x.getValue();
            case 20:
                return (za6) zeqVar.w.getValue();
            case 21:
                return (q7v) zeqVar.A.getValue();
            case 22:
                return (q) zeqVar.B.getValue();
            case 23:
                return (bne) zeqVar.C.getValue();
            case 24:
                return (eo20) zeqVar.n.getValue();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (y0a) zeqVar.z.getValue();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (eo20) zeqVar.n.getValue();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (im40) zeqVar.o.getValue();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (ngr0) zeqVar.p.getValue();
            default:
                return (mgr0) zeqVar.q.getValue();
        }
    }
}
