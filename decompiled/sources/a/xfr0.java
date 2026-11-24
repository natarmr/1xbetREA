package a;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class xfr0 {
    public static WeakReference c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y3v f40806a;
    public final ScheduledThreadPoolExecutor b;

    public xfr0(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = scheduledThreadPoolExecutor;
    }

    public final synchronized wfr0 a() {
        String str;
        wfr0 wfr0Var;
        y3v y3vVar = this.f40806a;
        synchronized (((ArrayDeque) y3vVar.c)) {
            str = (String) ((ArrayDeque) y3vVar.c).peek();
        }
        Pattern pattern = wfr0.d;
        wfr0Var = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                wfr0Var = new wfr0(strArrSplit[0], strArrSplit[1]);
            }
        }
        return wfr0Var;
    }
}
