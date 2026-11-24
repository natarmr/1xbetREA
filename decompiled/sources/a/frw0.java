package a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class frw0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10040a;
    public final /* synthetic */ hz5 b;

    public frw0(hz5 hz5Var, int i) {
        this.b = hz5Var;
        this.f10040a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        byte b;
        int i;
        hz5 hz5Var = this.b;
        if (iBinder == null) {
            synchronized (hz5Var.g) {
                b = hz5Var.n;
            }
            if (b == 3) {
                hz5Var.v = true;
                i = 5;
            } else {
                i = 4;
            }
            fmw0 fmw0Var = hz5Var.f;
            fmw0Var.sendMessage(fmw0Var.obtainMessage(i, hz5Var.x.get(), 16));
            return;
        }
        synchronized (hz5Var.h) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                hz5Var.i = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof mbw0)) ? new mbw0(iBinder) : (mbw0) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        hz5 hz5Var2 = this.b;
        int i2 = this.f10040a;
        dtw0 dtw0Var = new dtw0(hz5Var2, 0, null);
        fmw0 fmw0Var2 = hz5Var2.f;
        fmw0Var2.sendMessage(fmw0Var2.obtainMessage(7, i2, -1, dtw0Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        hz5 hz5Var = this.b;
        synchronized (hz5Var.h) {
            hz5Var.i = null;
        }
        hz5 hz5Var2 = this.b;
        int i = this.f10040a;
        fmw0 fmw0Var = hz5Var2.f;
        fmw0Var.sendMessage(fmw0Var.obtainMessage(6, i, 1));
    }
}
