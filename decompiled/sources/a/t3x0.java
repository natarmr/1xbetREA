package a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes2.dex */
public final class t3x0 implements ServiceConnection, ez5, fz5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f33290a;
    public volatile kuw0 b;
    public final /* synthetic */ a4x0 c;

    public t3x0(a4x0 a4x0Var) {
        this.c = a4x0Var;
    }

    @Override // a.fz5
    public final void b(ConnectionResult connectionResult) {
        a4x0 a4x0Var = this.c;
        fxw0 fxw0Var = ((kxw0) a4x0Var.b).g;
        kxw0.g(fxw0Var);
        fxw0Var.r1();
        uuw0 uuw0Var = ((kxw0) a4x0Var.b).f;
        if (uuw0Var == null || !uuw0Var.c) {
            uuw0Var = null;
        }
        if (uuw0Var != null) {
            uuw0Var.o.b(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            this.f33290a = false;
            this.b = null;
        }
        fxw0 fxw0Var2 = ((kxw0) this.c.b).g;
        kxw0.g(fxw0Var2);
        fxw0Var2.v1(new k3x0(this, (Parcelable) connectionResult, (byte) 2));
    }

    @Override // a.ez5
    public final void onConnected() {
        fxw0 fxw0Var = ((kxw0) this.c.b).g;
        kxw0.g(fxw0Var);
        fxw0Var.r1();
        synchronized (this) {
            try {
                s0x.H(this.b);
                gtw0 gtw0Var = (gtw0) this.b.l();
                fxw0 fxw0Var2 = ((kxw0) this.c.b).g;
                kxw0.g(fxw0Var2);
                fxw0Var2.v1(new i3x0(this, gtw0Var, (byte) 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.f33290a = false;
            }
        }
    }

    @Override // a.ez5
    public final void onConnectionSuspended(int i) {
        kxw0 kxw0Var = (kxw0) this.c.b;
        fxw0 fxw0Var = kxw0Var.g;
        kxw0.g(fxw0Var);
        fxw0Var.r1();
        uuw0 uuw0Var = kxw0Var.f;
        kxw0.g(uuw0Var);
        uuw0Var.n.a("Service connection suspended");
        fxw0 fxw0Var2 = kxw0Var.g;
        kxw0.g(fxw0Var2);
        fxw0Var2.v1(new fju0((Object) this, (byte) 9));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        fxw0 fxw0Var = ((kxw0) this.c.b).g;
        kxw0.g(fxw0Var);
        fxw0Var.r1();
        synchronized (this) {
            byte b = 0;
            if (iBinder == null) {
                this.f33290a = false;
                uuw0 uuw0Var = ((kxw0) this.c.b).f;
                kxw0.g(uuw0Var);
                uuw0Var.g.a("Service connected with null binder");
                return;
            }
            gtw0 ctw0Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    ctw0Var = iInterfaceQueryLocalInterface instanceof gtw0 ? (gtw0) iInterfaceQueryLocalInterface : new ctw0(iBinder);
                    uuw0 uuw0Var2 = ((kxw0) this.c.b).f;
                    kxw0.g(uuw0Var2);
                    uuw0Var2.o.a("Bound to IMeasurementService interface");
                } else {
                    uuw0 uuw0Var3 = ((kxw0) this.c.b).f;
                    kxw0.g(uuw0Var3);
                    uuw0Var3.g.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                uuw0 uuw0Var4 = ((kxw0) this.c.b).f;
                kxw0.g(uuw0Var4);
                uuw0Var4.g.a("Service connect failed to get IMeasurementService");
            }
            if (ctw0Var == null) {
                this.f33290a = false;
                try {
                    bbw0 bbw0VarM = bbw0.m();
                    a4x0 a4x0Var = this.c;
                    bbw0VarM.s(((kxw0) a4x0Var.b).f19080a, a4x0Var.d);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                fxw0 fxw0Var2 = ((kxw0) this.c.b).g;
                kxw0.g(fxw0Var2);
                fxw0Var2.v1(new i3x0(this, ctw0Var, b));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        kxw0 kxw0Var = (kxw0) this.c.b;
        fxw0 fxw0Var = kxw0Var.g;
        kxw0.g(fxw0Var);
        fxw0Var.r1();
        uuw0 uuw0Var = kxw0Var.f;
        kxw0.g(uuw0Var);
        uuw0Var.n.a("Service disconnected");
        fxw0 fxw0Var2 = kxw0Var.g;
        kxw0.g(fxw0Var2);
        fxw0Var2.v1(new k3x0(this, (Parcelable) componentName, (byte) 0));
    }
}
