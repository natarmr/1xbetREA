package a;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class fby {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f9283a = wv00.h("SystemJobScheduler");

    public static final List a(JobScheduler jobScheduler) {
        jobScheduler.getClass();
        try {
            jobScheduler.getClass();
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            allPendingJobs.getClass();
            return allPendingJobs;
        } catch (Throwable th) {
            wv00.f().e(f9283a, "getAllPendingJobs() is not reliable on this device.", th);
            return null;
        }
    }

    public static final JobScheduler b(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("jobscheduler");
        systemService.getClass();
        JobScheduler jobScheduler = (JobScheduler) systemService;
        if (Build.VERSION.SDK_INT < 34) {
            return jobScheduler;
        }
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        jobSchedulerForNamespace.getClass();
        return jobSchedulerForNamespace;
    }
}
