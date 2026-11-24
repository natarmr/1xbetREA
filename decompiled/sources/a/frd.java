package a;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class frd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10014a;
    public final /* synthetic */ long b;
    public final /* synthetic */ grd c;

    public frd(grd grdVar, int i, long j) {
        this.c = grdVar;
        this.f10014a = i;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final grd grdVar = this.c;
        int i = this.f10014a;
        final long j = this.b;
        synchronized (grdVar) {
            final int i2 = i - 1;
            final Task taskF = ((rrd) grdVar.d).f(3 - i2);
            final Task taskB = ((krd) grdVar.e).b();
            Tasks.whenAllComplete((Task<?>[]) new Task[]{taskF, taskB}).continueWithTask((ScheduledExecutorService) grdVar.g, new Continuation() { // from class: a.erd
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) throws JSONException {
                    Boolean boolValueOf;
                    grd grdVar2 = grdVar;
                    Task task2 = taskF;
                    Task task3 = taskB;
                    long j2 = j;
                    int i3 = i2;
                    if (!task2.isSuccessful()) {
                        return Tasks.forException(new ygq("Failed to auto-fetch config update.", task2.getException()));
                    }
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new ygq("Failed to get activated config for auto-fetch", task3.getException()));
                    }
                    qrd qrdVar = (qrd) task2.getResult();
                    mrd mrdVar = (mrd) task3.getResult();
                    mrd mrdVar2 = qrdVar.b;
                    if (mrdVar2 != null) {
                        boolValueOf = Boolean.valueOf(mrdVar2.f >= j2);
                    } else {
                        boolValueOf = Boolean.valueOf(qrdVar.f29204a == 1);
                    }
                    if (!boolValueOf.booleanValue()) {
                        Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                        grdVar2.a(i3, j2);
                        return Tasks.forResult(null);
                    }
                    if (qrdVar.b == null) {
                        Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                        return Tasks.forResult(null);
                    }
                    if (mrdVar == null) {
                        lrd lrdVarD = mrd.d();
                        mrdVar = new mrd((JSONObject) lrdVarD.b, (Date) lrdVarD.d, (JSONArray) lrdVarD.e, (JSONObject) lrdVarD.c, lrdVarD.f20526a, (JSONArray) lrdVarD.f);
                    }
                    mrd mrdVar3 = qrdVar.b;
                    JSONObject jSONObject = mrdVar.e;
                    JSONObject jSONObject2 = mrdVar3.f22265a;
                    JSONObject jSONObject3 = mrdVar3.b;
                    JSONObject jSONObject4 = mrdVar3.e;
                    JSONObject jSONObject5 = mrd.a(new JSONObject(jSONObject2.toString())).b;
                    HashMap mapC = mrdVar.c();
                    HashMap mapC2 = mrdVar3.c();
                    HashMap mapB = mrdVar.b();
                    HashMap mapB2 = mrdVar3.b();
                    HashSet hashSet = new HashSet();
                    JSONObject jSONObject6 = mrdVar.b;
                    Iterator<String> itKeys = jSONObject6.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!jSONObject3.has(next)) {
                            hashSet.add(next);
                        } else if (!jSONObject6.get(next).equals(jSONObject3.get(next))) {
                            hashSet.add(next);
                        } else if ((jSONObject.has(next) && !jSONObject4.has(next)) || (!jSONObject.has(next) && jSONObject4.has(next))) {
                            hashSet.add(next);
                        } else if (jSONObject.has(next) && jSONObject4.has(next) && !jSONObject.getJSONObject(next).toString().equals(jSONObject4.getJSONObject(next).toString())) {
                            hashSet.add(next);
                        } else if (mapC.containsKey(next) != mapC2.containsKey(next)) {
                            hashSet.add(next);
                        } else if (mapC.containsKey(next) && mapC2.containsKey(next) && !((Map) mapC.get(next)).equals(mapC2.get(next))) {
                            hashSet.add(next);
                        } else if (mapB.containsKey(next) != mapB2.containsKey(next)) {
                            hashSet.add(next);
                        } else if (mapB2.containsKey(next) && mapB.containsKey(next) && !((JSONObject) mapB2.get(next)).toString().equals(((JSONObject) mapB.get(next)).toString())) {
                            hashSet.add(next);
                        } else {
                            jSONObject5.remove(next);
                        }
                    }
                    Iterator<String> itKeys2 = jSONObject5.keys();
                    while (itKeys2.hasNext()) {
                        hashSet.add(itKeys2.next());
                    }
                    if (hashSet.isEmpty()) {
                        Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                        return Tasks.forResult(null);
                    }
                    synchronized (grdVar2) {
                        Iterator it = ((LinkedHashSet) grdVar2.b).iterator();
                        while (it.hasNext()) {
                            ((dsd) it.next()).getClass();
                        }
                    }
                    return Tasks.forResult(null);
                }
            });
        }
    }
}
