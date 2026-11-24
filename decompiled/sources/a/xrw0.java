package a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes2.dex */
public final class xrw0 extends kbw0 {
    public final IBinder g;
    public final /* synthetic */ hz5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrw0(hz5 hz5Var, int i, IBinder iBinder, Bundle bundle) {
        super(hz5Var, i, bundle);
        this.h = hz5Var;
        this.g = iBinder;
    }

    @Override // a.kbw0
    public final boolean a() {
        IBinder iBinder = this.g;
        try {
            s0x.H(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            hz5 hz5Var = this.h;
            if (!hz5Var.m().equals(interfaceDescriptor)) {
                String strM = hz5Var.m();
                Log.w("GmsClient", ua80.m(new StringBuilder(strM.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", strM, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface iInterfaceB = hz5Var.b(iBinder);
            if (iInterfaceB == null || !(hz5Var.u(2, 4, iInterfaceB) || hz5Var.u(3, 4, iInterfaceB))) {
                return false;
            }
            hz5Var.u = null;
            ez5 ez5Var = hz5Var.o;
            if (ez5Var == null) {
                return true;
            }
            ez5Var.onConnected();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // a.kbw0
    public final void b(ConnectionResult connectionResult) {
        fz5 fz5Var = this.h.p;
        if (fz5Var != null) {
            fz5Var.b(connectionResult);
        }
        System.currentTimeMillis();
    }
}
