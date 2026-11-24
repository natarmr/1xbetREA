package a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zvw0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45078a;
    public final /* synthetic */ drm0 b;

    public zvw0(drm0 drm0Var, String str) {
        Objects.requireNonNull(drm0Var);
        this.b = drm0Var;
        this.f45078a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        drm0 drm0Var = this.b;
        if (iBinder == null) {
            uuw0 uuw0Var = ((kxw0) drm0Var.f6568a).f;
            kxw0.g(uuw0Var);
            uuw0Var.j.a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = bnw0.f2906a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            enw0 zmw0Var = iInterfaceQueryLocalInterface instanceof enw0 ? (enw0) iInterfaceQueryLocalInterface : new zmw0(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", (byte) 4);
            kxw0 kxw0Var = (kxw0) drm0Var.f6568a;
            uuw0 uuw0Var2 = kxw0Var.f;
            kxw0.g(uuw0Var2);
            uuw0Var2.o.a("Install Referrer Service connected");
            fxw0 fxw0Var = kxw0Var.g;
            kxw0.g(fxw0Var);
            fxw0Var.v1(new mfr(this, zmw0Var, this));
        } catch (RuntimeException e) {
            uuw0 uuw0Var3 = ((kxw0) drm0Var.f6568a).f;
            kxw0.g(uuw0Var3);
            uuw0Var3.j.b(e, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        uuw0 uuw0Var = ((kxw0) this.b.f6568a).f;
        kxw0.g(uuw0Var);
        uuw0Var.o.a("Install Referrer Service disconnected");
    }
}
