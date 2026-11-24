package a;

import android.util.Log;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dwb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6789a;

    public boolean a(Level level) {
        return true;
    }

    public abstract void b(lfx0 lfx0Var);

    public void c(RuntimeException runtimeException, lfx0 lfx0Var) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }
}
