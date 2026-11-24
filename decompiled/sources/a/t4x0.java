package a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class t4x0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f33343a = new HashMap();
    public byte b = 2;
    public boolean c;
    public IBinder d;
    public final m3x0 e;
    public ComponentName f;
    public final /* synthetic */ d7x0 g;

    public t4x0(d7x0 d7x0Var, m3x0 m3x0Var) {
        this.g = d7x0Var;
        this.e = m3x0Var;
    }

    public final ConnectionResult a(String str, Executor executor) {
        try {
            Intent intentA = jhw0.a(this.g.b, this.e);
            this.b = (byte) 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(wnw0.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                d7x0 d7x0Var = this.g;
                bbw0 bbw0Var = d7x0Var.d;
                Context context = d7x0Var.b;
                m3x0 m3x0Var = this.e;
                boolean zV = bbw0Var.v(context, str, intentA, this, 4225, executor);
                this.c = zV;
                if (zV) {
                    d7x0Var.c.sendMessageDelayed(d7x0Var.c.obtainMessage(1, m3x0Var), d7x0Var.f);
                    return ConnectionResult.f;
                }
                this.b = (byte) 2;
                try {
                    d7x0Var.d.s(d7x0Var.b, this);
                } catch (IllegalArgumentException unused) {
                }
                return new ConnectionResult(16, null, null);
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (nfw0 e) {
            return e.f23457a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        d7x0 d7x0Var = this.g;
        synchronized (d7x0Var.f5615a) {
            try {
                d7x0Var.c.removeMessages(1, this.e);
                this.d = iBinder;
                this.f = componentName;
                Iterator it = this.f33343a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = (byte) 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d7x0 d7x0Var = this.g;
        synchronized (d7x0Var.f5615a) {
            try {
                d7x0Var.c.removeMessages(1, this.e);
                this.d = null;
                this.f = componentName;
                Iterator it = this.f33343a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = (byte) 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
