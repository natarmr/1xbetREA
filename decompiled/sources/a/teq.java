package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class teq extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33833a;
    public final /* synthetic */ zeq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ teq(zeq zeqVar, byte b) {
        super(0);
        this.f33833a = b;
        this.b = zeqVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f33833a;
        zeq zeqVar = this.b;
        switch (b) {
            case 0:
                return (jyb0) zeqVar.r.getValue();
            case 1:
                return (kyb0) zeqVar.s.getValue();
            case 2:
                return (ofi0) zeqVar.t.getValue();
            case 3:
                return (qex) zeqVar.u.getValue();
            case 4:
                return (rex) zeqVar.v.getValue();
            case 5:
                return (im40) zeqVar.o.getValue();
            case 6:
                return (za6) zeqVar.w.getValue();
            case 7:
                return (xa6) zeqVar.x.getValue();
            case 8:
                return (y0a) zeqVar.z.getValue();
            case 9:
                return (q7v) zeqVar.A.getValue();
            case 10:
                return (q) zeqVar.B.getValue();
            case 11:
                return (bne) zeqVar.C.getValue();
            case 12:
                return (ngr0) zeqVar.p.getValue();
            case 13:
                return (mgr0) zeqVar.q.getValue();
            case 14:
                return (jyb0) zeqVar.r.getValue();
            case 15:
                return (ofi0) zeqVar.t.getValue();
            case 16:
                return (qex) zeqVar.u.getValue();
            case 17:
                return (eo20) zeqVar.n.getValue();
            case 18:
                return (im40) zeqVar.o.getValue();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (av3) zeqVar.K.getValue();
            case 20:
                return (av3) zeqVar.K.getValue();
            case 21:
                return (z8o0) zeqVar.L.getValue();
            case 22:
                return (leq) zeqVar.D.getValue();
            case 23:
                return (y23) zeqVar.E.getValue();
            case 24:
                return (vch0) zeqVar.F.getValue();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (pjy) zeqVar.G.getValue();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (ywn) zeqVar.H.getValue();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (lsh0) zeqVar.J.getValue();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (gyc) zeqVar.I.getValue();
            default:
                return new q6(zeqVar.k.g("accessibility_enabled"));
        }
    }
}
