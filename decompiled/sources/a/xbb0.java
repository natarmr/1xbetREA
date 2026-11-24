package a;

import android.hardware.SensorManager;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xbb0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40594a;
    public final /* synthetic */ ccb0 b;

    public /* synthetic */ xbb0(ccb0 ccb0Var, byte b) {
        this.f40594a = b;
        this.b = ccb0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String string;
        byte b = this.f40594a;
        byte b2 = 0;
        ccb0 ccb0Var = this.b;
        switch (b) {
            case 0:
                mi70 mi70Var = ccb0.X1;
                ccb0Var.I0().x(jxa0.f17296a);
                return Unit.f46060a;
            case 1:
                mi70 mi70Var2 = ccb0.X1;
                ccb0Var.C().u0("TAX_INFO_DIALOG_RESULT_KEY", ccb0Var, new zbb0(ccb0Var, b2));
                ccb0Var.I0().x(oxa0.f26003a);
                return Unit.f46060a;
            case 2:
                mi70 mi70Var3 = ccb0.X1;
                ccb0Var.C().g("TAX_INFO_DIALOG_RESULT_KEY");
                ccb0Var.I0().x(pxa0.f27745a);
                return Unit.f46060a;
            case 3:
                mi70 mi70Var4 = ccb0.X1;
                ccb0Var.I0().x(ixa0.f15533a);
                ccb0Var.I0().x(rxa0.f31256a);
                return Unit.f46060a;
            case 4:
                mi70 mi70Var5 = ccb0.X1;
                SensorManager sensorManager = (SensorManager) ccb0Var.V1.getValue();
                if (sensorManager != null) {
                    sensorManager.unregisterListener((gkv) ccb0Var.U1.getValue());
                }
                return Unit.f46060a;
            case 5:
                hpi hpiVar = ccb0Var.K1;
                if (hpiVar != null) {
                    return new q0h0(hpiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 6:
                mi70 mi70Var6 = ccb0.X1;
                ccb0Var.I0().x(uxa0.f36431a);
                return Unit.f46060a;
            case 7:
                mi70 mi70Var7 = ccb0.X1;
                ccb0Var.I0().x(txa0.f34687a);
                return Unit.f46060a;
            case 8:
                mi70 mi70Var8 = ccb0.X1;
                ccb0Var.I0().x(vxa0.f38192a);
                return Unit.f46060a;
            case 9:
                mi70 mi70Var9 = ccb0.X1;
                ccb0Var.I0().x(wxa0.f39923a);
                return Unit.f46060a;
            case 10:
                mi70 mi70Var10 = ccb0.X1;
                return new gkv(new xbb0(ccb0Var, (byte) 14));
            case 11:
                mi70 mi70Var11 = ccb0.X1;
                ccb0 ccb0Var2 = this.b;
                Bundle bundle = ccb0Var2.g;
                if (bundle == null || (string = bundle.getString("RESET_AUTHENTICATOR_SECRET_HASH_KEY", "")) == null) {
                    return Unit.f46060a;
                }
                wdk0 wdk0VarH0 = ccb0Var2.H0();
                String strH = ccb0Var2.H(R.string.data_copied_to_clipboard);
                strH.getClass();
                Integer numValueOf = Integer.valueOf(R.drawable.data_copy_icon);
                Object objN = ccb0Var2.W1.n(ccb0.Y1[0], ccb0Var2);
                objN.getClass();
                j120.M(ccb0Var2, wdk0VarH0, string, string, strH, null, numValueOf, ((aid) objN).f919a, 16);
                return Unit.f46060a;
            case 12:
                mi70 mi70Var12 = ccb0.X1;
                ccb0Var.I0().x(bya0.f3408a);
                return Unit.f46060a;
            case 13:
                mi70 mi70Var13 = ccb0.X1;
                kxq kxqVarB = ccb0Var.B();
                Object systemService = kxqVarB != null ? kxqVarB.getSystemService("sensor") : null;
                if (systemService instanceof SensorManager) {
                    return (SensorManager) systemService;
                }
                return null;
            case 14:
                mi70 mi70Var14 = ccb0.X1;
                ccb0Var.I0().x(gya0.f12119a);
                return Unit.f46060a;
            default:
                mi70 mi70Var15 = ccb0.X1;
                ccb0Var.I0().x(nxa0.f24276a);
                return Unit.f46060a;
        }
    }
}
