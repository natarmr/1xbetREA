package a;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class d8f implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f5644a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ sd60 d;
    public final /* synthetic */ f8f e;

    public d8f(f8f f8fVar, long j, Throwable th, Thread thread, sd60 sd60Var) {
        this.e = f8fVar;
        this.f5644a = j;
        this.b = th;
        this.c = thread;
        this.d = sd60Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        long j = this.f5644a;
        long j2 = j / 1000;
        f8f f8fVar = this.e;
        String strE = f8fVar.e();
        if (strE == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        f8fVar.c.a();
        ywq0 ywq0Var = f8fVar.m;
        String strConcat = "Persisting fatal event for session ".concat(strE);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        ywq0Var.v(this.b, this.c, CrashHianalyticsData.EVENT_ID_CRASH, new qeo(strE, j2, lunVar), true);
        try {
            if (!new File((File) f8fVar.g.c, ".ae" + j).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e);
        }
        sd60 sd60Var = this.d;
        f8fVar.a(false, sd60Var, false);
        f8fVar.b(new dh9().f6081a, Boolean.FALSE);
        return !f8fVar.b.e() ? Tasks.forResult(null) : ((TaskCompletionSource) ((AtomicReference) sd60Var.i).get()).getTask().onSuccessTask((aaf) f8fVar.e.b, new psc(this, strE));
    }
}
