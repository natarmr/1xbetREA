package a;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes2.dex */
public class oav extends pav {
    public static final Object d = new Object();
    public static final oav e = new oav();
    public mmx c;

    public static AlertDialog e(Activity activity, int i, eaw0 eaw0Var, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(w9w0.b(i, activity));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i == 1) {
            string = resources.getString(org.xbet.client1.R.string.common_google_play_services_install_button);
        } else if (i != 2) {
            string = i != 3 ? resources.getString(R.string.ok) : resources.getString(org.xbet.client1.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(org.xbet.client1.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, eaw0Var);
        }
        String strA = w9w0.a(i, activity);
        if (strA != null) {
            builder.setTitle(strA);
        }
        Log.w("GoogleApiAvailability", twn.m(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void h(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof kxq) {
                v1r v1rVarR = ((kxq) activity).r();
                ajn0 ajn0Var = new ajn0();
                s0x.I(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                ajn0Var.Y1 = alertDialog;
                if (onCancelListener != null) {
                    ajn0Var.Z1 = onCancelListener;
                }
                ajn0Var.H0(v1rVarR, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        a1o a1oVar = new a1o();
        s0x.I(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        a1oVar.f80a = alertDialog;
        if (onCancelListener != null) {
            a1oVar.b = onCancelListener;
        }
        a1oVar.show(fragmentManager, str);
    }

    @Override // a.pav
    public final Intent a(Context context, int i, String str) {
        return super.a(context, i, str);
    }

    @Override // a.pav
    public final int b(Context context) {
        return c(context, pav.f26674a);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogE = e(googleApiActivity, i, new z9w0(super.a(googleApiActivity, i, "d"), googleApiActivity), googleApiActivity2);
        if (alertDialogE == null) {
            return;
        }
        h(googleApiActivity, alertDialogE, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Activity activity, alz alzVar, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogE = e(activity, i, new baw0(super.a(activity, i, "d"), alzVar), onCancelListener);
        if (alertDialogE == null) {
            return;
        }
        h(activity, alertDialogE, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void g(Context context, ConnectionResult connectionResult) {
        int i;
        int i2 = connectionResult.b;
        Log.w("GoogleApiAvailability", ua80.e(i2, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i2 == 18) {
            new m9w0(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        PendingIntent pendingIntent = connectionResult.c;
        if (pendingIntent == null) {
            if (i2 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i2 == 6 ? w9w0.e(context, "common_google_play_services_resolution_required_title") : w9w0.a(i2, context);
        if (strE == null) {
            strE = context.getResources().getString(org.xbet.client1.R.string.common_google_play_services_try_again_title);
        }
        String strD = (i2 == 6 || i2 == 19) ? w9w0.d(context, "common_google_play_services_resolution_required_text", w9w0.c(context)) : w9w0.b(i2, context);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService(RemoteMessageConst.NOTIFICATION);
        s0x.H(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        g760 g760Var = new g760(context, null);
        g760Var.m = true;
        g760Var.c(true);
        g760Var.e = g760.b(strE);
        f760 f760Var = new f760((byte) 7, false);
        f760Var.c = g760.b(strD);
        g760Var.f(f760Var);
        PackageManager packageManager = context.getPackageManager();
        Boolean boolValueOf = zjb.f44475a;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            zjb.f44475a = boolValueOf;
        }
        boolean zBooleanValue = boolValueOf.booleanValue();
        int i3 = R.drawable.stat_sys_warning;
        if (zBooleanValue) {
            int i4 = context.getApplicationInfo().icon;
            if (i4 != 0) {
                i3 = i4;
            }
            g760Var.s.icon = i3;
            g760Var.j = 2;
            if (zjb.J(context)) {
                g760Var.b.add(new c760(org.xbet.client1.R.drawable.common_full_open_on_phone, resources.getString(org.xbet.client1.R.string.common_open_on_phone), pendingIntent));
            } else {
                g760Var.g = pendingIntent;
            }
        } else {
            g760Var.s.icon = R.drawable.stat_sys_warning;
            g760Var.s.tickerText = g760.b(resources.getString(org.xbet.client1.R.string.common_google_play_services_notification_ticker));
            g760Var.s.when = System.currentTimeMillis();
            g760Var.g = pendingIntent;
            g760Var.f = g760.b(strD);
        }
        if (ufx.F()) {
            if (!ufx.F()) {
                v4i0.e();
                return;
            }
            synchronized (d) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(org.xbet.client1.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            g760Var.q = "com.google.android.gms.availability";
        }
        Notification notificationA = g760Var.a();
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            bbv.f2326a.set(false);
            i = 10436;
        } else {
            i = 39789;
        }
        notificationManager.notify(i, notificationA);
        Integer num = connectionResult.e;
        int iIntValue = num == null ? -1 : num.intValue();
        com.google.android.gms.common.internal.zab zabVar = new com.google.android.gms.common.internal.zab(iIntValue, connectionResult.b, System.currentTimeMillis(), context.getPackageName(), false);
        mmx mmxVar = this.c;
        if (mmxVar == null) {
            mmxVar = new mmx(context, mmx.m, ea3.D, mav.c);
            this.c = mmxVar;
        }
        euo0 euo0VarA = s9w0.a();
        euo0VarA.d = new Feature[]{ro4.i};
        euo0VarA.c = true;
        euo0VarA.b = false;
        euo0VarA.f8431a = new ilp0(zabVar);
        mmxVar.b(2, euo0VarA.a());
    }
}
