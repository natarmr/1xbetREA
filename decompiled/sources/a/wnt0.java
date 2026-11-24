package a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wnt0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wdu f39464a;
    public final /* synthetic */ q55 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ wnt0(wdu wduVar, q55 q55Var, int i, Runnable runnable) {
        this.f39464a = wduVar;
        this.b = q55Var;
        this.c = i;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q55 q55Var = this.b;
        int i = this.c;
        Runnable runnable = this.d;
        wdu wduVar = this.f39464a;
        wpg0 wpg0Var = (wpg0) wduVar.g;
        try {
            wpg0 wpg0Var2 = (wpg0) wduVar.d;
            Objects.requireNonNull(wpg0Var2);
            wpg0Var.l(new xnt0(wpg0Var2, (byte) 1));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) wduVar.b).getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                wpg0Var.l(new nlo(wduVar, q55Var, i));
            } else {
                wduVar.H(q55Var, i);
            }
        } catch (vzn0 unused) {
            ((y3v) wduVar.e).v(q55Var, i + 1, false);
        } finally {
            runnable.run();
        }
    }
}
