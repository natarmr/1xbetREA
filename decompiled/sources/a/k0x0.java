package a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class k0x0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f17490a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ fui0 c;
    public final /* synthetic */ zas0 d;
    public final /* synthetic */ Executor e;

    public k0x0(AtomicBoolean atomicBoolean, Context context, fui0 fui0Var, zas0 zas0Var, Executor executor) {
        this.f17490a = atomicBoolean;
        this.b = context;
        this.c = fui0Var;
        this.d = zas0Var;
        this.e = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f17490a.compareAndSet(false, true)) {
            try {
                this.b.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                Log.w("DirectBootUtils", "Failed to unregister receiver", e);
            }
            fui0 fui0Var = this.c;
            zas0 zas0Var = this.d;
            Executor executor = this.e;
            trs0 trs0Var = new trs0();
            trs0Var.i = new srs0(trs0Var, zas0Var);
            executor.execute(trs0Var);
            fui0Var.o(trs0Var);
        }
    }
}
