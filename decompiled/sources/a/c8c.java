package a;

import android.os.Build;

/* JADX INFO: loaded from: classes5.dex */
public final class c8c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f3906a;

    public c8c(us00 us00Var) {
        this.f3906a = us00Var;
    }

    public final boolean a() {
        int i = Build.VERSION.SDK_INT;
        us00 us00Var = this.f3906a;
        if (i >= 33) {
            return us00Var.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0;
        }
        return new o760(us00Var).b.areNotificationsEnabled();
    }
}
