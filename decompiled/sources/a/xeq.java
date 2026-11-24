package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class xeq extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40754a;
    public final /* synthetic */ zeq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xeq(zeq zeqVar, byte b) {
        super(0);
        this.f40754a = b;
        this.b = zeqVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40754a;
        zeq zeqVar = this.b;
        switch (b) {
            case 0:
                return (gyc) zeqVar.I.getValue();
            case 1:
                return (lsh0) zeqVar.J.getValue();
            case 2:
                return (av3) zeqVar.K.getValue();
            case 3:
                return (z8o0) zeqVar.L.getValue();
            case 4:
                return (op) zeqVar.M.getValue();
            case 5:
                return (ngk) zeqVar.N.getValue();
            case 6:
                return (stw) zeqVar.O.getValue();
            case 7:
                return (ims0) zeqVar.P.getValue();
            case 8:
                return (im40) zeqVar.o.getValue();
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
                return (ewr0) zeqVar.V.getValue();
            case 15:
                return (c12) zeqVar.W.getValue();
            case 16:
                return (qdj) zeqVar.X.getValue();
            case 17:
                return (zwn) zeqVar.Y.getValue();
            case 18:
                return (ksq) zeqVar.Z.getValue();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (ngr0) zeqVar.p.getValue();
            case 20:
                return (s7h0) zeqVar.a0.getValue();
            case 21:
                return (a3q0) zeqVar.b0.getValue();
            case 22:
                return (z2q0) zeqVar.c0.getValue();
            case 23:
                return (ogq0) zeqVar.d0.getValue();
            case 24:
                return (mqx) zeqVar.e0.getValue();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (keq) zeqVar.f0.getValue();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (gcg0) zeqVar.g0.getValue();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (i85) zeqVar.h0.getValue();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (pse0) zeqVar.i0.getValue();
            default:
                return (nvj) zeqVar.j0.getValue();
        }
    }
}
