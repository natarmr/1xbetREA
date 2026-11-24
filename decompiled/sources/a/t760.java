package a;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public interface t760 {
    /* JADX WARN: Multi-variable type inference failed */
    static void a(t760 t760Var, Intent intent, String str, String str2, int i, Bitmap bitmap, Bitmap bitmap2, String str3, int i2, List list, int i3) throws Throwable {
        Throwable th;
        PendingIntent activity;
        IconCompat iconCompat;
        Bitmap bitmap3 = (i3 & 16) != 0 ? null : bitmap;
        Bitmap bitmap4 = (i3 & 32) != 0 ? bitmap3 : bitmap2;
        String str4 = (i3 & 64) != 0 ? "" : str3;
        int iHashCode = (i3 & 128) != 0 ? str2.hashCode() : i2;
        List list2 = (i3 & 256) != 0 ? iun.f15405a : list;
        boolean z = false;
        boolean z2 = (i3 & 512) == 0;
        u760 u760Var = (u760) t760Var;
        u760Var.getClass();
        intent.getClass();
        str.getClass();
        str2.getClass();
        str4.getClass();
        list2.getClass();
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() & 4294967295L);
        us00 us00Var = u760Var.f35169a;
        PendingIntent activity2 = PendingIntent.getActivity(us00Var, iCurrentTimeMillis, intent, rsr0.e0(i));
        activity2.getClass();
        if (bitmap4 == null) {
            bitmap4 = bitmap3;
        }
        g760 g760Var = new g760(us00Var, u760Var.e().b);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Notification notification = g760Var.s;
        notification.when = jCurrentTimeMillis;
        notification.icon = R.drawable.ic_notification_white;
        String string = us00Var.getString(R.string.app_name);
        string.getClass();
        g760Var.e = g760.b(sj3.j0(str, string));
        notification.tickerText = g760.b(str2);
        g760Var.f = g760.b(str2);
        g760Var.g = activity2;
        g760Var.c(true);
        byte b = 7;
        f760 f760Var = new f760(b, z);
        f760Var.c = g760.b(str2);
        g760Var.f(f760Var);
        try {
            g760Var.e(u760Var.d());
            th = null;
        } catch (Exception e) {
            th = null;
            Log.e("NotificationServiceImpl", "Failed to set notification sound, using default", e);
            g760Var.e(Settings.System.DEFAULT_NOTIFICATION_URI);
        }
        notification.defaults = 2;
        g760Var.o = u760Var.f;
        if (z2) {
            g760Var.j = 1;
        }
        if (u760Var.e().c) {
            notification.ledARGB = -16776961;
            notification.ledOnMS = 500;
            notification.ledOffMS = 500;
            notification.flags = (notification.flags & (-2)) | 1;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            u760Var.h();
            g760Var.q = u760Var.e().b;
        }
        if (bitmap3 != null) {
            g760Var.d(bitmap3);
            e760 e760Var = new e760(b, z);
            if (bitmap4 == null) {
                iconCompat = th;
            } else {
                IconCompat iconCompat2 = new IconCompat(1);
                iconCompat2.b = bitmap4;
                iconCompat = iconCompat2;
            }
            e760Var.c = iconCompat;
            g760Var.f(e760Var);
        }
        int i4 = 0;
        for (Object obj : list2) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                q3d.p();
                throw th;
            }
            y660 y660Var = (y660) obj;
            String str5 = y660Var.f42082a;
            klx klxVar = y660Var.c;
            Intent intent2 = y660Var.b;
            int iOrdinal = klxVar.ordinal();
            if (iOrdinal == 0) {
                activity = PendingIntent.getActivity(us00Var, i4, intent2, rsr0.e0(i));
                activity.getClass();
            } else if (iOrdinal != 1) {
                t9f.b();
                return;
            } else {
                activity = PendingIntent.getBroadcast(us00Var, i4, intent2, rsr0.e0(i));
                activity.getClass();
            }
            g760Var.b.add(new c760(0, str5, activity));
            i4 = i5;
        }
        NotificationManager notificationManagerC = u760Var.c();
        if (notificationManagerC != null) {
            Notification notificationA = g760Var.a();
            notificationA.getClass();
            if (str4.length() == 0) {
                notificationManagerC.notify(iHashCode, notificationA);
            } else {
                notificationManagerC.notify(str4, iHashCode, notificationA);
            }
        }
    }
}
