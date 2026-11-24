package a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
public final class g5w0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h5w0 f10737a;

    public /* synthetic */ g5w0(h5w0 h5w0Var) {
        this.f10737a = h5w0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        h5w0 h5w0Var = this.f10737a;
        h5w0Var.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        h5w0Var.a().post(new a5w0(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        h5w0 h5w0Var = this.f10737a;
        h5w0Var.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        h5w0Var.a().post(new c5w0(this, (byte) 0));
    }
}
