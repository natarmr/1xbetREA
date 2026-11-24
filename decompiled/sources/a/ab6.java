package a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ab6 extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f564a;
    public final /* synthetic */ bb6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ab6(bb6 bb6Var, byte b) {
        super(0);
        this.f564a = b;
        this.b = bb6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        byte b = this.f564a;
        bb6 bb6Var = this.b;
        switch (b) {
            case 0:
                Intent intentRegisterReceiver = bb6Var.f2293a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                intentRegisterReceiver.getClass();
                int intExtra = intentRegisterReceiver.getIntExtra("health", -1);
                if (intExtra == -1) {
                    return "";
                }
                switch (intExtra) {
                    case 2:
                        return "good";
                    case 3:
                        return "overheat";
                    case 4:
                        return "dead";
                    case 5:
                        return "over voltage";
                    case 6:
                        return "unspecified failure";
                    case 7:
                        return "cold";
                    default:
                        return "unknown";
                }
            default:
                Object objInvoke = Class.forName("com.android.internal.os.PowerProfile").getMethod("getBatteryCapacity", null).invoke(Class.forName("com.android.internal.os.PowerProfile").getConstructor(Context.class).newInstance(bb6Var.f2293a), null);
                objInvoke.getClass();
                return String.valueOf(((Double) objInvoke).doubleValue());
        }
    }
}
