package a;

import android.util.Log;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class uz3 extends Thread {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayBlockingQueue f36517a;

    static {
        uz3 uz3Var = new uz3();
        uz3Var.f36517a = new ArrayBlockingQueue(10);
        uz3Var.setName("AsyncLayoutInflator");
        uz3Var.start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (this.f36517a.take() != null) {
            try {
                throw new ClassCastException();
            } catch (InterruptedException e) {
                Log.w("AsyncLayoutInflater", e);
            }
        }
        try {
            throw null;
        } catch (RuntimeException e2) {
            Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", e2);
            throw null;
        }
    }
}
