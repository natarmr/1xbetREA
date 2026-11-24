package a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.Calendar;
import kotlin.ranges.IntRange;
import org.xplatform.authreminder.impl.data.AuthReminderBroadcastReceiver;

/* JADX INFO: loaded from: classes3.dex */
public final class on4 {
    public static final IntRange d = new IntRange(0, 6, 1);
    public static final IntRange e = new IntRange(23, 24, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ln4 f25529a;
    public final rn4 b;
    public final t760 c;

    public on4(ln4 ln4Var, rn4 rn4Var, vwb0 vwb0Var, t760 t760Var) {
        rn4Var.getClass();
        vwb0Var.getClass();
        this.f25529a = ln4Var;
        this.b = rn4Var;
        this.c = t760Var;
    }

    public static long a(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(13, 0);
        calendar.set(14, 0);
        IntRange intRange = e;
        int i = intRange.f46068a;
        int i2 = intRange.b;
        int i3 = calendar.get(11);
        if (i > i3 || i3 > i2) {
            IntRange intRange2 = d;
            int i4 = intRange2.f46068a;
            int i5 = intRange2.b;
            int i6 = calendar.get(11);
            if (i4 <= i6 && i6 <= i5) {
                calendar.set(11, 7);
                calendar.set(12, 0);
            }
        } else {
            calendar.add(5, 1);
            calendar.set(11, 7);
            calendar.set(12, 0);
        }
        return calendar.getTime().getTime();
    }

    public final boolean b() {
        Object systemService = this.f25529a.f20325a.getSystemService("alarm");
        AlarmManager alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
        if (alarmManager == null) {
            return false;
        }
        if (31 <= Build.VERSION.SDK_INT) {
            return alarmManager.canScheduleExactAlarms();
        }
        return true;
    }

    public final boolean c(fzs0 fzs0Var) {
        fzs0Var.getClass();
        int iB = fzs0Var.b() + 13579;
        us00 us00Var = this.f25529a.f20325a;
        return PendingIntent.getBroadcast(us00Var, iB, new Intent(us00Var, (Class<?>) AuthReminderBroadcastReceiver.class), 603979776) != null;
    }

    public final void d(fzs0 fzs0Var, long j) {
        long jA = a(j);
        Bundle bundle = new Bundle();
        bundle.putInt("TYPE_NOTIFY_VALUE_KEY", fzs0Var.b());
        this.f25529a.c(bundle, fzs0Var.b() + 13579, jA);
    }

    public final void e(fzs0 fzs0Var) {
        long jA = a(System.currentTimeMillis() + 300000);
        Bundle bundle = new Bundle();
        bundle.putInt("TYPE_NOTIFY_VALUE_KEY", fzs0Var.b());
        this.f25529a.c(bundle, 24680, jA);
    }
}
