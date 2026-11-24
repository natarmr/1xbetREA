package a;

import android.content.Intent;
import android.os.Bundle;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ybb0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42336a;
    public final /* synthetic */ ccb0 b;

    public /* synthetic */ ybb0(ccb0 ccb0Var, byte b) {
        this.f42336a = b;
        this.b = ccb0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        byte b = this.f42336a;
        ccb0 ccb0Var = this.b;
        switch (b) {
            case 0:
                ylb0 ylb0Var = (ylb0) obj;
                mi70 mi70Var = ccb0.X1;
                ylb0Var.getClass();
                ccb0Var.I0().x(new eya0(ylb0Var));
                return Unit.f46060a;
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                mi70 mi70Var2 = ccb0.X1;
                ccb0Var.I0().x(new hya0(iIntValue));
                return Unit.f46060a;
            case 2:
                int iIntValue2 = ((Integer) obj).intValue();
                mi70 mi70Var3 = ccb0.X1;
                ccb0Var.I0().x(new hya0(iIntValue2));
                return Unit.f46060a;
            case 3:
                mi70 mi70Var4 = ccb0.X1;
                ((lwk) obj).getClass();
                ccq0.V(ccb0Var, "REQUEST_SUCCESS_AUTHENTICATOR_DIALOG_KEY", new xbb0(ccb0Var, (byte) 11));
                ccb0Var.F().u0("RESET_HASH_SECRET_KEY", ccb0Var, new zbb0(ccb0Var, (byte) 1));
                ccq0.T(ccb0Var, "ADD_ADDITIONAL_EVENTS_TO_COUPON_DIALOG_REQUEST__KEY", new xbb0(ccb0Var, (byte) 6));
                ccq0.V(ccb0Var, "SWITCH_ON_NOTIFICATION_INFO_DIALOG_REQUEST_KEY", new xbb0(ccb0Var, (byte) 12));
                ccq0.V(ccb0Var, "KEY_2FA_ALERT", new xbb0(ccb0Var, (byte) 7));
                ccq0.V(ccb0Var, "KZ_IDENTIFICATION_ALERT_REQUEST_KEY", new xbb0(ccb0Var, (byte) 8));
                ccq0.T(ccb0Var, "KZ_IDENTIFICATION_ALERT_REQUEST_KEY", new xbb0(ccb0Var, (byte) 9));
                k3t0 k3t0VarI0 = ccb0Var.I0();
                Intent intent = ccb0Var.n0().getIntent();
                Bundle extras = intent.getExtras();
                boolean z2 = extras != null && (extras.containsKey("REQUEST_SECTION_FROM_WIDGET") || extras.containsKey("af_consumed") || extras.containsKey("REQUEST_WIDGET_SETTINGS"));
                c0o c0oVar = csj0.h;
                if (c0oVar == null || !c0oVar.isEmpty()) {
                    Iterator it = c0oVar.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (Intrinsics.d(intent.getAction(), ((csj0) it.next()).a())) {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                    }
                } else {
                    z = false;
                }
                k3t0VarI0.x(new hxa0((intent.hasCategory("CUSTOM_INTENT") || z2 || z || intent.hasCategory("PUSH_INTENT") || intent.getData() != null) ? false : true));
                wdk0.l(ccb0Var.H0(), ccb0Var, ccb0Var.R1);
                return new ty2(ccb0Var, (byte) 19);
            default:
                hdb0 hdb0Var = (hdb0) obj;
                mi70 mi70Var5 = ccb0.X1;
                hdb0Var.getClass();
                ccb0Var.I0().x(new cya0(hdb0Var));
                return Unit.f46060a;
        }
    }
}
