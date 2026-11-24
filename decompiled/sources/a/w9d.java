package a;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public abstract class w9d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f38774a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX WARN: Code duplicated, block: B:131:0x0305  */
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:227:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x02f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:67:0x017b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102, types: [int] */
    /* JADX WARN: Type inference failed for: r0v142 */
    /* JADX WARN: Type inference failed for: r0v143 */
    /* JADX WARN: Type inference failed for: r0v144 */
    /* JADX WARN: Type inference failed for: r0v145 */
    public static xex a(FirebaseMessagingService firebaseMessagingService, pyu pyuVar) {
        Bundle bundle;
        int identifier;
        String string;
        int identifier2;
        Uri defaultUri;
        Intent launchIntentForPackage;
        PendingIntent activity;
        Integer numValueOf;
        Long lValueOf;
        long[] jArr;
        int[] iArr;
        int i;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        Bundle bundle2 = bundle;
        String strF = pyuVar.f("gcm.n.android_channel_id");
        int i2 = 0;
        if (Build.VERSION.SDK_INT < 26) {
            strF = null;
        } else {
            try {
                if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion < 26) {
                    strF = null;
                } else {
                    NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                    if (TextUtils.isEmpty(strF)) {
                        strF = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strF)) {
                            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strF) == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        strF = "fcm_fallback_notification_channel";
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                            if (identifier == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = firebaseMessagingService.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                        }
                    } else if (notificationManager.getNotificationChannel(strF) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + strF + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                        strF = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strF)) {
                            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strF) == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        strF = "fcm_fallback_notification_channel";
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                            if (identifier == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = firebaseMessagingService.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String packageName = firebaseMessagingService.getPackageName();
        Resources resources = firebaseMessagingService.getResources();
        PackageManager packageManager = firebaseMessagingService.getPackageManager();
        g760 g760Var = new g760(firebaseMessagingService, strF);
        String strD = pyuVar.d(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strD)) {
            g760Var.e = g760.b(strD);
        }
        String strD2 = pyuVar.d(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strD2)) {
            g760Var.f = g760.b(strD2);
            f760 f760Var = new f760((byte) 7, false);
            f760Var.c = g760.b(strD2);
            g760Var.f(f760Var);
        }
        String strF2 = pyuVar.f("gcm.n.icon");
        if (TextUtils.isEmpty(strF2)) {
            identifier2 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (identifier2 != 0 || !b(resources, identifier2)) {
                try {
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.w("FirebaseMessaging", "Couldn't get own application info: " + e2);
                }
            }
            if (identifier2 != 0 || !b(resources, identifier2)) {
                identifier2 = 17301651;
            }
        } else {
            identifier2 = resources.getIdentifier(strF2, "drawable", packageName);
            if ((identifier2 == 0 || !b(resources, identifier2)) && ((identifier2 = resources.getIdentifier(strF2, "mipmap", packageName)) == 0 || !b(resources, identifier2))) {
                Log.w("FirebaseMessaging", "Icon resource " + strF2 + " not found. Notification will use default icon.");
                identifier2 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                identifier2 = identifier2 != 0 ? packageManager.getApplicationInfo(packageName, 0).icon : packageManager.getApplicationInfo(packageName, 0).icon;
                if (identifier2 != 0) {
                    identifier2 = 17301651;
                } else {
                    identifier2 = 17301651;
                }
            }
        }
        Notification notification = g760Var.s;
        notification.icon = identifier2;
        String strF3 = pyuVar.f("gcm.n.sound2");
        if (TextUtils.isEmpty(strF3)) {
            strF3 = pyuVar.f("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strF3)) {
            defaultUri = null;
        } else if ("default".equals(strF3) || resources.getIdentifier(strF3, "raw", packageName) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strF3);
        }
        if (defaultUri != null) {
            g760Var.e(defaultUri);
        }
        String strF4 = pyuVar.f("gcm.n.click_action");
        if (TextUtils.isEmpty(strF4)) {
            String strF5 = pyuVar.f("gcm.n.link_android");
            if (TextUtils.isEmpty(strF5)) {
                strF5 = pyuVar.f("gcm.n.link");
            }
            Uri uri = !TextUtils.isEmpty(strF5) ? Uri.parse(strF5) : null;
            if (uri != null) {
                launchIntentForPackage = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        } else {
            launchIntentForPackage = new Intent(strF4);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        }
        AtomicInteger atomicInteger = f38774a;
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle3 = (Bundle) pyuVar.f27815a;
            Bundle bundle4 = new Bundle(bundle3);
            for (String str : bundle3.keySet()) {
                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                    bundle4.remove(str);
                }
            }
            launchIntentForPackage.putExtras(bundle4);
            if (pyuVar.a("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", pyuVar.n());
            }
            activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        g760Var.g = activity;
        PendingIntent broadcast = !pyuVar.a("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(pyuVar.n())), 1140850688);
        if (broadcast != null) {
            notification.deleteIntent = broadcast;
        }
        String strF6 = pyuVar.f("gcm.n.color");
        if (TextUtils.isEmpty(strF6)) {
            i = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i != 0) {
                numValueOf = Integer.valueOf(firebaseMessagingService.getColor(i));
            } else {
                numValueOf = null;
            }
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(strF6));
            } catch (IllegalArgumentException unused2) {
                Log.w("FirebaseMessaging", "Color is invalid: " + strF6 + ". Notification will use default color.");
                i = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i != 0) {
                    try {
                        numValueOf = Integer.valueOf(firebaseMessagingService.getColor(i));
                    } catch (Resources.NotFoundException unused3) {
                        Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            }
        }
        if (numValueOf != null) {
            g760Var.o = numValueOf.intValue();
        }
        g760Var.c(!pyuVar.a("gcm.n.sticky"));
        g760Var.m = pyuVar.a("gcm.n.local_only");
        String strF7 = pyuVar.f("gcm.n.ticker");
        if (strF7 != null) {
            notification.tickerText = g760.b(strF7);
        }
        Integer numB = pyuVar.b("gcm.n.notification_priority");
        if (numB == null) {
            numB = null;
        } else if (numB.intValue() < -2 || numB.intValue() > 2) {
            Log.w("FirebaseMessaging", "notificationPriority is invalid " + numB + ". Skipping setting notificationPriority.");
            numB = null;
        }
        if (numB != null) {
            g760Var.j = numB.intValue();
        }
        Integer numB2 = pyuVar.b("gcm.n.visibility");
        if (numB2 == null) {
            numB2 = null;
        } else if (numB2.intValue() < -1 || numB2.intValue() > 1) {
            Log.w("NotificationParams", "visibility is invalid: " + numB2 + ". Skipping setting visibility.");
            numB2 = null;
        }
        if (numB2 != null) {
            g760Var.p = numB2.intValue();
        }
        Integer numB3 = pyuVar.b("gcm.n.notification_count");
        if (numB3 == null) {
            numB3 = null;
        } else if (numB3.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + numB3 + ". Skipping setting notificationCount.");
            numB3 = null;
        }
        if (numB3 != null) {
            g760Var.i = numB3.intValue();
        }
        String strF8 = pyuVar.f("gcm.n.event_time");
        if (TextUtils.isEmpty(strF8)) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(strF8));
            } catch (NumberFormatException unused4) {
                Log.w("NotificationParams", "Couldn't parse value of " + pyu.q("gcm.n.event_time") + Separators.LPAREN + strF8 + ") into a long");
                lValueOf = null;
            }
        }
        if (lValueOf != null) {
            g760Var.k = true;
            notification.when = lValueOf.longValue();
        }
        JSONArray jSONArrayC = pyuVar.c("gcm.n.vibrate_timings");
        if (jSONArrayC == null) {
            jArr = null;
        } else {
            try {
                if (jSONArrayC.length() <= 1) {
                    throw new JSONException("vibrateTimings have invalid length");
                }
                int length = jSONArrayC.length();
                jArr = new long[length];
                for (int i3 = 0; i3 < length; i3++) {
                    jArr[i3] = jSONArrayC.optLong(i3);
                }
            } catch (NumberFormatException | JSONException unused5) {
                Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayC + ". Skipping setting vibrateTimings.");
                jArr = null;
            }
        }
        if (jArr != null) {
            notification.vibrate = jArr;
        }
        JSONArray jSONArrayC2 = pyuVar.c("gcm.n.light_settings");
        if (jSONArrayC2 == null) {
            iArr = null;
        } else {
            int[] iArr2 = new int[3];
            try {
                if (jSONArrayC2.length() != 3) {
                    throw new JSONException("lightSettings don't have all three fields");
                }
                int color = Color.parseColor(jSONArrayC2.optString(0));
                if (color == -16777216) {
                    throw new IllegalArgumentException("Transparent color is invalid");
                }
                iArr2[0] = color;
                iArr2[1] = jSONArrayC2.optInt(1);
                iArr2[2] = jSONArrayC2.optInt(2);
                iArr = iArr2;
            } catch (IllegalArgumentException e3) {
                Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayC2 + ". " + e3.getMessage() + ". Skipping setting LightSettings");
                iArr = null;
            } catch (JSONException unused6) {
                Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayC2 + ". Skipping setting LightSettings");
                iArr = null;
            }
        }
        if (iArr != null) {
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = iArr[2];
            notification.ledARGB = i4;
            notification.ledOnMS = i5;
            notification.ledOffMS = i6;
            if (i5 != 0 && i6 != 0) {
                i2 = 1;
            }
            notification.flags = (notification.flags & (-2)) | i2;
        }
        boolean zA = pyuVar.a("gcm.n.default_sound");
        ?? r0 = zA;
        if (pyuVar.a("gcm.n.default_vibrate_timings")) {
            r0 = (zA ? 1 : 0) | 2;
        }
        ?? r1 = r0;
        if (pyuVar.a("gcm.n.default_light_settings")) {
            r1 = (r0 == true ? 1 : 0) | 4;
        }
        notification.defaults = r1;
        if ((r1 & 4) != 0) {
            notification.flags |= 1;
        }
        String strF9 = pyuVar.f("gcm.n.tag");
        if (TextUtils.isEmpty(strF9)) {
            strF9 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        return new xex(g760Var, strF9);
    }

    public static boolean b(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!y24.v(resources.getDrawable(i, null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }
}
