package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.presentation.player_transfers.PlayerTransfersScreenParams;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l3a0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19349a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l3a0(Object obj, byte b) {
        this.f19349a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f19349a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(((o3a0) obj).c);
            case 1:
                return Integer.valueOf(((q3a0) obj).c);
            case 2:
                return Integer.valueOf(((p3a0) obj).c);
            case 3:
                return (o4a0) ((gii0) ((g090) obj).f10448a).b(sre0.f32672a.b(o4a0.class));
            case 4:
                mi70 mi70Var = r5a0.S1;
                fiu0 fiu0Var = ((r5a0) obj).Q1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 5:
                return (h7a0) ((gii0) ((j910) obj).b).b(sre0.f32672a.b(h7a0.class));
            case 6:
                fl70 fl70Var = q7a0.P1;
                fiu0 fiu0Var2 = ((q7a0) obj).M1;
                if (fiu0Var2 != null) {
                    return fiu0Var2;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 7:
                return (a8a0) ((gii0) ((zn00) obj).f44650a).b(sre0.f32672a.b(a8a0.class));
            case 8:
                return (zca0) ((gii0) ((kd30) obj).f18086a).b(sre0.f32672a.b(zca0.class));
            case 9:
                return ((uda0) obj).f35468a;
            case 10:
                return new zda0((PlayerTransfersScreenParams) obj, null);
            case 11:
                return (wea0) ((gii0) ((nw20) obj).f24215a).b(sre0.f32672a.b(wea0.class));
            case 12:
                return Integer.valueOf(((hga0) obj).d.size());
            case 13:
                xi70 xi70Var = cha0.P1;
                fiu0 fiu0Var3 = ((cha0) obj).L1;
                if (fiu0Var3 != null) {
                    return fiu0Var3;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 14:
                return Integer.valueOf(((uja0) obj).d);
            case 15:
                fiu0 fiu0Var4 = ((tha0) obj).k2;
                if (fiu0Var4 != null) {
                    return fiu0Var4;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 16:
                return (qha0) ((gii0) ((dq00) obj).b).b(sre0.f32672a.b(qha0.class));
            case 17:
                fiu0 fiu0Var5 = ((kia0) obj).k2;
                if (fiu0Var5 != null) {
                    return fiu0Var5;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 18:
                cu cuVar = (cu) obj;
                iun iunVar = iun.f15405a;
                String strB = ((mrc) cuVar.b).b();
                return new lia0(((t1u) cuVar.d).a(((mrc) cuVar.c).a(strB), strB).f18397a, iunVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                foi foiVar = ((tia0) obj).M1;
                if (foiVar != null) {
                    return new q0h0(foiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 20:
                fiu0 fiu0Var6 = ((uia0) obj).k2;
                if (fiu0Var6 != null) {
                    return fiu0Var6;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 21:
                return (oha0) ((gii0) ((g090) obj).f10448a).b(sre0.f32672a.b(oha0.class));
            case 22:
                fiu0 fiu0Var7 = ((lja0) obj).k2;
                if (fiu0Var7 != null) {
                    return fiu0Var7;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 23:
                nh70 nh70Var = vka0.R1;
                fiu0 fiu0Var8 = ((vka0) obj).M1;
                if (fiu0Var8 != null) {
                    return fiu0Var8;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 24:
                mi70 mi70Var2 = ala0.O1;
                fiu0 fiu0Var9 = ((ala0) obj).L1;
                if (fiu0Var9 != null) {
                    return fiu0Var9;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new bla0(((f7u) obj).q().c);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Integer.valueOf(((ola0) obj).e);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                joi joiVar = ((ema0) obj).L1;
                if (joiVar != null) {
                    return new q0h0(joiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Integer.valueOf(((sma0) obj).e);
            default:
                return new nsa0(true, new mn00(), new mn00(), new mn00(), new mn00(), false, null, false, iun.f15405a, ocl.b((ocl) obj, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 0L, 0L, 862));
        }
    }
}
