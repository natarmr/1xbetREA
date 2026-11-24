package a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes.dex */
public final class va6 extends b4e {
    public final md3 g;
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va6(Context context, fpv0 fpv0Var, byte b) {
        super(context, fpv0Var);
        this.h = b;
        this.g = new md3(this, (byte) 3);
    }

    @Override // a.b4e
    public final Object d() {
        boolean z = true;
        switch (this.h) {
            case 0:
                Intent intentRegisterReceiver = ((Context) this.c).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    wv00.f().d(wa6.f38812a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = intentRegisterReceiver.getIntExtra(CommonConstant.KEY_STATUS, -1);
                if (intExtra != 2 && intExtra != 5) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                Intent intentRegisterReceiver2 = ((Context) this.c).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 == null) {
                    wv00.f().d(cb6.f4047a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = intentRegisterReceiver2.getIntExtra(CommonConstant.KEY_STATUS, -1);
                float intExtra3 = intentRegisterReceiver2.getIntExtra("level", -1) / intentRegisterReceiver2.getIntExtra("scale", -1);
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Intent intentRegisterReceiver3 = ((Context) this.c).registerReceiver(null, k());
                if (intentRegisterReceiver3 != null && intentRegisterReceiver3.getAction() != null) {
                    String action = intentRegisterReceiver3.getAction();
                    if (action == null) {
                        z = false;
                    } else {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        }
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // a.b4e
    public final void g() {
        wv00.f().a(q39.f28040a, getClass().getSimpleName().concat(": registering receiver"));
        ((Context) this.c).registerReceiver(this.g, k());
    }

    @Override // a.b4e
    public final void h() {
        wv00.f().a(q39.f28040a, getClass().getSimpleName().concat(": unregistering receiver"));
        ((Context) this.c).unregisterReceiver(this.g);
    }

    public final IntentFilter k() {
        switch (this.h) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }
}
