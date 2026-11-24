package a;

import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class prd implements Continuation, OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f27459a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ prd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f27459a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        f0u f0uVar = (f0u) this.f27459a;
        Context context = ((c0u) this.b).d;
        ybf ybfVar = (ybf) this.c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.e;
        exc.getClass();
        CredentialProviderPlayServicesImpl.Companion.getClass();
        f0uVar.getClass();
        Iterator it = f0uVar.f8733a.iterator();
        while (it.hasNext()) {
            if (((utu) it.next()) instanceof utu) {
                Log.w("GetCredentialController", "Pre-u credman get flow failed for get sign in intent; retrying with gis flow");
                new icf(context).f(f0uVar, cancellationSignal, executor, ybfVar);
                return;
            }
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new dcf(context).f(f0uVar, cancellationSignal, executor, ybfVar);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        rrd rrdVar = (rrd) this.f27459a;
        Task task2 = (Task) this.b;
        Task task3 = (Task) this.c;
        Date date = (Date) this.d;
        HashMap map = (HashMap) this.e;
        if (!task2.isSuccessful()) {
            return Tasks.forException(new ygq("Firebase Installations failed to get installation ID for fetch.", task2.getException()));
        }
        if (!task3.isSuccessful()) {
            return Tasks.forException(new ygq("Firebase Installations failed to get installation auth token for fetch.", task3.getException()));
        }
        try {
            qrd qrdVarD = rrdVar.d((String) task2.getResult(), ((d45) task3.getResult()).f5438a, date, map);
            if (qrdVarD.f29204a != 0) {
                return Tasks.forResult(qrdVarD);
            }
            krd krdVar = (krd) rrdVar.f;
            mrd mrdVar = qrdVarD.b;
            Executor executor = krdVar.f18759a;
            return Tasks.call(executor, new ird(krdVar, mrdVar, (byte) 0)).onSuccessTask(executor, new uq(krdVar, mrdVar, (byte) 5)).onSuccessTask((Executor) rrdVar.d, new gne(qrdVarD, (byte) 27));
        } catch (zgq e) {
            return Tasks.forException(e);
        }
    }
}
