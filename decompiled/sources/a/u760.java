package a;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.content.FileProvider;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class u760 implements t760 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f35169a;
    public final x4u b;
    public final e1u c;
    public final n0o0 d = maz.b(new th50(18));
    public final n0o0 e = maz.b(new pu50(this, 4));
    public final int f;

    public u760(us00 us00Var, x4u x4uVar, e1u e1uVar, kl5 kl5Var) {
        this.f35169a = us00Var;
        this.b = x4uVar;
        this.c = e1uVar;
        TypedValue typedValue = j5d.f15927a;
        this.f = us00Var.getColor(R.color.uikit_primary_light);
    }

    public final void b(String str, List list) {
        str.getClass();
        list.getClass();
        NotificationManager notificationManagerC = c();
        if (notificationManagerC != null) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (str.length() == 0) {
                        notificationManagerC.cancel(iIntValue);
                    } else {
                        notificationManagerC.cancel(str, iIntValue);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final NotificationManager c() {
        Object systemService = this.f35169a.getSystemService(RemoteMessageConst.NOTIFICATION);
        if (systemService instanceof NotificationManager) {
            return (NotificationManager) systemService;
        }
        return null;
    }

    public final Uri d() {
        Uri uriC;
        try {
            if (StringsKt.O(e().f26493a, "file://", false)) {
                us00 us00Var = this.f35169a;
                ((jm3) this.b.f40284a).b.getClass();
                uriC = FileProvider.c(us00Var, new File(kotlin.text.c.r(e().f26493a, "file://", "", false)), "org.xbet.client1.provider");
            } else {
                uriC = Uri.parse(e().f26493a);
                uriC.getClass();
            }
            uriC.getClass();
            return g(uriC) ? uriC : Settings.System.DEFAULT_NOTIFICATION_URI;
        } catch (Exception e) {
            Log.e("NotificationServiceImpl", "Error getting notification sound URI", e);
            try {
                Uri uri = Uri.parse(e().f26493a);
                uri.getClass();
                return g(uri) ? uri : Settings.System.DEFAULT_NOTIFICATION_URI;
            } catch (Exception unused) {
                return Settings.System.DEFAULT_NOTIFICATION_URI;
            }
        }
    }

    public final p760 e() {
        return (p760) this.e.getValue();
    }

    public final boolean f() {
        NotificationManager notificationManagerC;
        NotificationChannel notificationChannel;
        return (Build.VERSION.SDK_INT < 26 || !((notificationManagerC = c()) == null || (notificationChannel = notificationManagerC.getNotificationChannel(e().b)) == null || notificationChannel.getImportance() == 0)) && new o760(this.f35169a).b.areNotificationsEnabled();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    public final boolean g(Uri uri) {
        try {
            String scheme = uri.getScheme();
            if (scheme != null) {
                int iHashCode = scheme.hashCode();
                if (iHashCode != 3143036) {
                    if (iHashCode == 951530617 && scheme.equals(RemoteMessageConst.Notification.CONTENT)) {
                        boolean zD = Intrinsics.d(uri.getAuthority(), "settings");
                        us00 us00Var = this.f35169a;
                        if (!zD) {
                            String string = uri.toString();
                            string.getClass();
                            if (!StringsKt.O(string, "ringtone", false)) {
                                InputStream inputStreamOpenInputStream = us00Var.getContentResolver().openInputStream(uri);
                                if (inputStreamOpenInputStream != null) {
                                    inputStreamOpenInputStream.close();
                                    return true;
                                }
                            } else if (RingtoneManager.getRingtone(us00Var, uri) != null) {
                            }
                        } else if (RingtoneManager.getRingtone(us00Var, uri) != null) {
                        }
                        return false;
                    }
                } else if (scheme.equals("file")) {
                    String path = uri.getPath();
                    if (path != null) {
                        File file = new File(path);
                        if (!file.exists() || !file.canRead()) {
                        }
                    }
                    return false;
                }
            }
            return true;
        } catch (FileNotFoundException unused) {
        } catch (SecurityException e) {
            Log.w("NotificationServiceImpl", "SecurityException checking URI access: " + uri, e);
        } catch (Exception e2) {
            Log.w("NotificationServiceImpl", "Exception checking URI access: " + uri, e2);
        }
    }

    public final void h() {
        NotificationManager notificationManagerC;
        n0o0 n0o0Var = this.d;
        if (Build.VERSION.SDK_INT < 26 || (notificationManagerC = c()) == null) {
            return;
        }
        NotificationChannel notificationChannel = notificationManagerC.getNotificationChannel(e().b);
        if (notificationChannel != null) {
            Uri sound = notificationChannel.getSound();
            Uri uri = Uri.parse(e().f26493a);
            uri.getClass();
            boolean zD = Intrinsics.d(sound, uri);
            boolean z = notificationChannel.shouldShowLights() != e().c;
            if (zD && !z) {
                return;
            }
        }
        List<NotificationChannel> notificationChannels = notificationManagerC.getNotificationChannels();
        b5q b5qVar = new b5q(pgi0.q(CollectionsKt.I(l1e0.o(0, notificationChannels.size())), new jw50(1, notificationChannels, List.class, "get", "get(I)Ljava/lang/Object;", 0, (byte) 12)));
        while (b5qVar.hasNext()) {
            notificationManagerC.deleteNotificationChannel(((NotificationChannel) b5qVar.next()).getId());
        }
        p760 p760VarG = this.c.g();
        i7w0.b();
        NotificationChannel notificationChannel2 = new NotificationChannel(p760VarG.b, this.f35169a.getResources().getString(R.string.app_name), 4);
        notificationChannel2.setLightColor(-16776961);
        notificationChannel2.enableLights(p760VarG.c);
        notificationChannel2.enableVibration(true);
        notificationChannel2.setShowBadge(true);
        try {
            notificationChannel2.setSound(d(), (AudioAttributes) n0o0Var.getValue());
        } catch (Exception e) {
            Log.e("NotificationServiceImpl", "Failed to set notification channel sound, using default", e);
            notificationChannel2.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, (AudioAttributes) n0o0Var.getValue());
        }
        notificationManagerC.createNotificationChannel(notificationChannel2);
    }
}
