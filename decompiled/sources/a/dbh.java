package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dbh implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5804a;
    public final /* synthetic */ k3t0 b;

    public /* synthetic */ dbh(k3t0 k3t0Var, byte b) {
        this.f5804a = b;
        this.b = k3t0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f5804a;
        qqd0 qqd0Var = qqd0.f29162a;
        sqd0 sqd0Var = sqd0.f32625a;
        k3t0 k3t0Var = this.b;
        switch (b) {
            case 0:
                k3t0Var.x(mbh.f21508a);
                break;
            case 1:
                k3t0Var.x(lbh.f19754a);
                break;
            case 2:
                k3t0Var.x(fgw.f9514a);
                break;
            case 3:
                k3t0Var.x(dgw.f6062a);
                break;
            case 4:
                k3t0Var.x(tjh.f34048a);
                break;
            case 5:
                k3t0Var.x(jcr.f16291a);
                break;
            case 6:
                k3t0Var.x(shv.f32233a);
                break;
            case 7:
                k3t0Var.x(rhv.f30507a);
                break;
            case 8:
                k3t0Var.x(vpw.f37828a);
                break;
            case 9:
                k3t0Var.x(qqd0Var);
                break;
            case 10:
                k3t0Var.x(sqd0Var);
                break;
            case 11:
                k3t0Var.x(xi60.f40930a);
                break;
            case 12:
                k3t0Var.x(u380.f34984a);
                break;
            case 13:
                k3t0Var.x(r380.f29774a);
                break;
            case 14:
                k3t0Var.x(qqd0Var);
                break;
            case 15:
                k3t0Var.x(sqd0Var);
                break;
            case 16:
                k3t0Var.x(odb0.f25067a);
                break;
            case 17:
                k3t0Var.x(mdb0.f21588a);
                break;
            case 18:
                k3t0Var.x(tdf0.f33767a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                k3t0Var.x(qdf0.f28532a);
                break;
            case 20:
                k3t0Var.x(llj0.f20250a);
                break;
            case 21:
                k3t0Var.x(glj0.f11494a);
                break;
            case 22:
                k3t0Var.x(klj0.f18492a);
                break;
            case 23:
                k3t0Var.x(u3k0.f35002a);
                break;
            case 24:
                k3t0Var.x(t3k0.f33273a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                y2m0 y2m0Var = tun0.P1;
                k3t0Var.x(hvn0.f13734a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                k3t0Var.x(eeo0.f7682a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                k3t0Var.x(qqd0Var);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                k3t0Var.x(sqd0Var);
                break;
            default:
                j6m0 j6m0Var = v9r0.O1;
                k3t0Var.x(g9r0.f10931a);
                break;
        }
        return Unit.f46060a;
    }
}
