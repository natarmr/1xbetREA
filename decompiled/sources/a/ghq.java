package a;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class ghq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nfq f11313a;
    public final xmi0 b;

    public ghq(nfq nfqVar, xmi0 xmi0Var, CoroutineContext coroutineContext, vmi0 vmi0Var) {
        nfqVar.getClass();
        xmi0Var.getClass();
        coroutineContext.getClass();
        vmi0Var.getClass();
        this.f11313a = nfqVar;
        this.b = xmi0Var;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.8.");
        nfqVar.a();
        Context applicationContext = nfqVar.f23449a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(vmi0Var);
            qjj.W(d5c.a(coroutineContext), null, null, new fhq(this, vmi0Var, null, (byte) 0), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
