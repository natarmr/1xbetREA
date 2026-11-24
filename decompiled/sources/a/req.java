package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class req extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30348a;
    public final /* synthetic */ zeq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ req(zeq zeqVar, byte b) {
        super(0);
        this.f30348a = b;
        this.b = zeqVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f30348a;
        zeq zeqVar = this.b;
        switch (b) {
            case 0:
                return (ewr0) zeqVar.V.getValue();
            case 1:
                return (c12) zeqVar.W.getValue();
            case 2:
                return (qdj) zeqVar.X.getValue();
            case 3:
                return (zwn) zeqVar.Y.getValue();
            case 4:
                return (ksq) zeqVar.Z.getValue();
            case 5:
                return (s7h0) zeqVar.a0.getValue();
            case 6:
                return (a3q0) zeqVar.b0.getValue();
            case 7:
                return (z2q0) zeqVar.c0.getValue();
            case 8:
                return (ogq0) zeqVar.d0.getValue();
            case 9:
                return (mqx) zeqVar.e0.getValue();
            case 10:
                return (op) zeqVar.M.getValue();
            case 11:
                return (keq) zeqVar.f0.getValue();
            case 12:
                return (gcg0) zeqVar.g0.getValue();
            case 13:
                return (i85) zeqVar.h0.getValue();
            case 14:
                return (op) zeqVar.M.getValue();
            case 15:
                return (ngk) zeqVar.N.getValue();
            case 16:
                return (stw) zeqVar.O.getValue();
            case 17:
                return (ims0) zeqVar.P.getValue();
            case 18:
                return (ihv0) zeqVar.Q.getValue();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (fbj) zeqVar.R.getValue();
            case 20:
                return (q6) zeqVar.S.getValue();
            case 21:
                return (ngk) zeqVar.N.getValue();
            case 22:
                return (avj) zeqVar.T.getValue();
            case 23:
                return (ewr0) zeqVar.V.getValue();
            case 24:
                return (c12) zeqVar.W.getValue();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (qdj) zeqVar.X.getValue();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (zwn) zeqVar.Y.getValue();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (ksq) zeqVar.Z.getValue();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (s7h0) zeqVar.a0.getValue();
            default:
                return (ogq0) zeqVar.d0.getValue();
        }
    }
}
