package a;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class mov0 extends Binder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uyn f22150a;

    public mov0(uyn uynVar) {
        this.f22150a = uynVar;
    }

    public final void a(nov0 nov0Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        ((vyn) this.f22150a.f36498a).b(nov0Var.f23885a).addOnCompleteListener(new ew3((byte) 1), new ytt0(nov0Var, (byte) 3));
    }
}
