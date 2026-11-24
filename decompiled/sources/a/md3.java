package a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.huawei.hms.support.sms.common.ReadSmsConstant;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class md3 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21578a;
    public final Object b;

    public /* synthetic */ md3(Object obj, byte b) {
        this.f21578a = b;
        this.b = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        String string;
        Uri data;
        String schemeSpecificPart;
        byte b = this.f21578a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((c2) obj).B();
                break;
            case 1:
                krs0 krs0Var = (krs0) obj;
                if (!isInitialStickyBroadcast()) {
                    krs0Var.d(q24.b(context, intent, (m24) krs0Var.k, (AudioDeviceInfo) krs0Var.j, krs0Var.b()));
                }
                break;
            case 2:
                a56 a56Var = (a56) obj;
                context.getClass();
                intent.getClass();
                String action = intent.getAction();
                if (action != null && action.hashCode() == 1933814656 && action.equals("action_change_locale")) {
                    a56Var.e().c();
                } else {
                    a56Var.g(context, intent);
                }
                break;
            case 3:
                context.getClass();
                intent.getClass();
                va6 va6Var = (va6) obj;
                byte b2 = va6Var.h;
                intent.getClass();
                switch (b2) {
                    case 0:
                        String action2 = intent.getAction();
                        if (action2 != null) {
                            wv00.f().a(wa6.f38812a, "Received ".concat(action2));
                            switch (action2.hashCode()) {
                                case -1886648615:
                                    if (action2.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        va6Var.f(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case -54942926:
                                    if (action2.equals("android.os.action.DISCHARGING")) {
                                        va6Var.f(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case 948344062:
                                    if (action2.equals("android.os.action.CHARGING")) {
                                        va6Var.f(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                                case 1019184907:
                                    if (action2.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        va6Var.f(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1:
                        if (intent.getAction() != null) {
                            wv00.f().a(cb6.f4047a, "Received " + intent.getAction());
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int iHashCode = action3.hashCode();
                                if (iHashCode != -1980154005) {
                                    if (iHashCode == 490310653 && action3.equals("android.intent.action.BATTERY_LOW")) {
                                        va6Var.f(Boolean.FALSE);
                                    }
                                    break;
                                } else if (action3.equals("android.intent.action.BATTERY_OKAY")) {
                                    va6Var.f(Boolean.TRUE);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        if (intent.getAction() != null) {
                            wv00.f().a(arm0.f1353a, "Received " + intent.getAction());
                            String action4 = intent.getAction();
                            if (action4 != null) {
                                int iHashCode2 = action4.hashCode();
                                if (iHashCode2 != -1181163412) {
                                    if (iHashCode2 == -730838620 && action4.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                        va6Var.f(Boolean.TRUE);
                                    }
                                    break;
                                } else if (action4.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    va6Var.f(Boolean.FALSE);
                                    break;
                                }
                            }
                        }
                        break;
                }
                break;
            case 4:
                ywu ywuVar = (ywu) obj;
                context.getClass();
                intent.getClass();
                if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction()) && (extras = intent.getExtras()) != null) {
                    Status status = (Status) (Build.VERSION.SDK_INT <= 33 ? extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS") : (Parcelable) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS", Status.class));
                    Integer numValueOf = status != null ? Integer.valueOf(status.f45486a) : null;
                    if (numValueOf != null && numValueOf.intValue() == 0) {
                        String string2 = extras.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                        ((qoj0) ywuVar.c).g(string2 != null ? string2 : "");
                    } else if (numValueOf != null && numValueOf.intValue() == 15) {
                        ywuVar.D();
                    }
                    break;
                }
                break;
            case 5:
                nvu nvuVar = (nvu) obj;
                context.getClass();
                intent.getClass();
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    com.huawei.hms.support.api.client.Status status2 = (com.huawei.hms.support.api.client.Status) (Build.VERSION.SDK_INT <= 33 ? extras2.getParcelable(ReadSmsConstant.EXTRA_STATUS) : (Parcelable) extras2.getParcelable(ReadSmsConstant.EXTRA_STATUS, com.huawei.hms.support.api.client.Status.class));
                    Integer numValueOf2 = status2 != null ? Integer.valueOf(status2.getStatusCode()) : null;
                    if (numValueOf2 != null && numValueOf2.intValue() == 15) {
                        nvuVar.X();
                    } else if (numValueOf2 != null && numValueOf2.intValue() == 0 && (string = extras2.getString(ReadSmsConstant.EXTRA_SMS_MESSAGE, null)) != null) {
                        ((qoj0) nvuVar.c).g(string);
                    }
                    break;
                }
                break;
            case 6:
                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                    ((Handler) ((cwj) obj).e).post(new hp2(this, intent.getIntExtra("plugged", -1) <= 0, (byte) 3));
                }
                break;
            case 7:
                ((wl50) obj).f39337a.execute(new llo(this, context, (byte) 29));
                break;
            case 8:
                context.getClass();
                intent.getClass();
                if ((Intrinsics.d(intent.getAction(), "android.intent.action.PACKAGE_ADDED") || Intrinsics.d(intent.getAction(), "android.intent.action.PACKAGE_REPLACED")) && (data = intent.getData()) != null && (schemeSpecificPart = data.getSchemeSpecificPart()) != null && schemeSpecificPart.equals("") && !StringsKt.W("")) {
                    ((kr3) obj).invoke();
                }
                break;
            default:
                kxw0 kxw0Var = (kxw0) obj;
                if (intent != null) {
                    String action5 = intent.getAction();
                    if (action5 != null) {
                        int iHashCode3 = action5.hashCode();
                        if (iHashCode3 != -1928239649) {
                            if (iHashCode3 == 1279883384 && action5.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                                uuw0 uuw0Var = kxw0Var.f;
                                kxw0.g(uuw0Var);
                                uuw0Var.o.a("[sgtm] App Receiver notified batches are available");
                                fxw0 fxw0Var = kxw0Var.g;
                                kxw0.g(fxw0Var);
                                fxw0Var.v1(new fju0((Object) this, (byte) 16));
                            }
                            break;
                        } else if (action5.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                            miw0.a();
                            if (kxw0Var.d.x1(null, btw0.P0)) {
                                uuw0 uuw0Var2 = kxw0Var.f;
                                kxw0.g(uuw0Var2);
                                uuw0Var2.o.a("App receiver notified triggers are available");
                                fxw0 fxw0Var2 = kxw0Var.g;
                                kxw0.g(fxw0Var2);
                                fxw0Var2.v1(new fju0((Object) kxw0Var, (byte) 17));
                                break;
                            }
                        }
                        uuw0 uuw0Var3 = kxw0Var.f;
                        kxw0.g(uuw0Var3);
                        uuw0Var3.j.a("App receiver called with unknown action");
                    } else {
                        uuw0 uuw0Var4 = kxw0Var.f;
                        kxw0.g(uuw0Var4);
                        uuw0Var4.j.a("App receiver called with null action");
                    }
                } else {
                    uuw0 uuw0Var5 = kxw0Var.f;
                    kxw0.g(uuw0Var5);
                    uuw0Var5.j.a("App receiver called with null intent");
                }
                break;
        }
    }

    public /* synthetic */ md3(Object obj, byte b, boolean z) {
        this.f21578a = b;
        this.b = obj;
    }
}
