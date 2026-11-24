package a;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class unf0 extends eg40 {
    public final /* synthetic */ byte c = 1;
    public final Context d;

    public unf0(Context context) {
        super(9, 10);
        this.d = context;
    }

    @Override // a.eg40
    public final void a(w7r w7rVar) {
        byte b = this.c;
        Context context = this.d;
        w7rVar.getClass();
        switch (b) {
            case 0:
                if (this.b >= 10) {
                    w7rVar.n(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                w7rVar.l("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    w7rVar.a();
                    try {
                        w7rVar.n(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        w7rVar.n(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                        sharedPreferences.edit().clear().apply();
                        w7rVar.r();
                        w7rVar.k();
                    } catch (Throwable th) {
                        w7rVar.k();
                        throw th;
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    w7rVar.a();
                    try {
                        w7rVar.n(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                        w7rVar.n(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                        sharedPreferences2.edit().clear().apply();
                        w7rVar.r();
                        return;
                    } finally {
                        w7rVar.k();
                    }
                }
                return;
        }
    }

    public unf0(Context context, int i, int i2) {
        super(i, i2);
        this.d = context;
    }
}
