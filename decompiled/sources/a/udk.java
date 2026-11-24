package a;

import android.javax.sip.message.Response;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.FileNotFoundException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class udk implements ols0, jgd, sg00, tg00, Continuation, OnFailureListener, vdo, SuccessContinuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35483a;

    public /* synthetic */ udk(byte b) {
        this.f35483a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(int i, String str, Object obj) {
        throw new IllegalStateException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void c(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) " is shutting down");
        throw new RejectedExecutionException(sb.toString());
    }

    public static /* synthetic */ void d(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void e(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void f(String str, Object obj, Object obj2, Object obj3) {
        throw new poe(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void g(String str, Object obj, Throwable th) {
        throw new SecurityException(str + obj, th);
    }

    public static /* synthetic */ void h(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    @Override // a.ols0, a.eer
    /* JADX INFO: renamed from: apply */
    public Object mo11apply(Object obj) {
        String strA = rji0.b.a((qji0) obj);
        strA.getClass();
        uho uhoVar = uho.SESSION_START;
        Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
        byte[] bytes = strA.getBytes(Charsets.UTF_8);
        bytes.getClass();
        return bytes;
    }

    @Override // a.tg00
    public void b(Object obj, jjq jjqVar) {
        ((ky90) obj).h(new jy90(jjqVar));
    }

    @Override // a.sg00
    public void invoke(Object obj) {
        ky90 ky90Var = (ky90) obj;
        switch (this.f35483a) {
            case 13:
                ky90Var.G(new dlo(2, new ss3("Player release timed out."), 1003));
                break;
            default:
                ky90Var.l();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i;
        switch (this.f35483a) {
            case 16:
                i = Response.FORBIDDEN;
                break;
            default:
                i = -1;
                break;
        }
        return Integer.valueOf(i);
    }

    @Override // a.jgd
    public Object x0(pzu pzuVar) {
        switch (this.f35483a) {
            case 9:
                return (ScheduledExecutorService) ExecutorsRegistrar.f45662a.get();
            case 10:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 11:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 12:
                b8z b8zVar = ExecutorsRegistrar.f45662a;
                return o6t0.f24755a;
            case 24:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(pzuVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return FirebasePerfRegistrar.providesFirebasePerformance(pzuVar);
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(pzuVar);
        }
    }

    public /* synthetic */ udk(Object obj, byte b) {
        this.f35483a = b;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(null);
    }
}
