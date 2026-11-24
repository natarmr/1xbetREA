package a;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wgq implements SuccessContinuation, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xgq f39128a;

    public /* synthetic */ wgq(xgq xgqVar) {
        this.f39128a = xgqVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        xgq xgqVar = this.f39128a;
        xgqVar.getClass();
        boolean z = false;
        if (task.isSuccessful()) {
            krd krdVar = xgqVar.c;
            synchronized (krdVar) {
                krdVar.c = Tasks.forResult(null);
            }
            nsd nsdVar = krdVar.b;
            synchronized (nsdVar) {
                nsdVar.f24046a.deleteFile(nsdVar.b);
            }
            mrd mrdVar = (mrd) task.getResult();
            if (mrdVar != null) {
                JSONArray jSONArray = mrdVar.d;
                gfq gfqVar = xgqVar.f40851a;
                if (gfqVar != null) {
                    try {
                        gfqVar.c(xgq.d(jSONArray));
                    } catch (d6 e) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e);
                    } catch (JSONException e2) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e2);
                    }
                }
                n660 n660Var = xgqVar.i;
                try {
                    x45 x45VarH = ((j910) n660Var.b).h(mrdVar);
                    Iterator it = ((Set) n660Var.d).iterator();
                    while (it.hasNext()) {
                        ((Executor) n660Var.c).execute(new kdg0((p8f) it.next(), x45VarH, (byte) 0));
                    }
                } catch (zgq e3) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e3);
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        xgq xgqVar = this.f39128a;
        Task taskB = xgqVar.c.b();
        Task taskB2 = xgqVar.d.b();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskB, taskB2}).continueWithTask(xgqVar.b, new hi(xgqVar, taskB, taskB2, (byte) 7));
    }
}
