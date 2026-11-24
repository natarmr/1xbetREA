package a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public final class ypw0 extends f9w0 {
    public hz5 b;
    public final int c;

    public ypw0(hz5 hz5Var, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", (byte) 2);
        this.b = hz5Var;
        this.c = i;
    }

    @Override // a.f9w0
    public final boolean F(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) mnw0.a(parcel, Bundle.CREATOR);
            mnw0.c(parcel);
            s0x.I(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            hz5 hz5Var = this.b;
            int i3 = this.c;
            hz5Var.getClass();
            xrw0 xrw0Var = new xrw0(hz5Var, i2, strongBinder, bundle);
            fmw0 fmw0Var = hz5Var.f;
            fmw0Var.sendMessage(fmw0Var.obtainMessage(1, i3, -1, xrw0Var));
            this.b = null;
        } else if (i == 2) {
            parcel.readInt();
            mnw0.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            com.google.android.gms.common.internal.zzj zzjVar = (com.google.android.gms.common.internal.zzj) mnw0.a(parcel, com.google.android.gms.common.internal.zzj.CREATOR);
            mnw0.c(parcel);
            hz5 hz5Var2 = this.b;
            s0x.I(hz5Var2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            s0x.H(zzjVar);
            hz5Var2.w = zzjVar;
            if (hz5Var2.s()) {
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.d;
                peg0 peg0VarM = peg0.m();
                RootTelemetryConfiguration rootTelemetryConfiguration = connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.f45488a;
                synchronized (peg0VarM) {
                    try {
                        if (rootTelemetryConfiguration == null) {
                            rootTelemetryConfiguration = peg0.d;
                        } else {
                            RootTelemetryConfiguration rootTelemetryConfiguration2 = (RootTelemetryConfiguration) peg0VarM.b;
                            if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.f45491a < rootTelemetryConfiguration.f45491a) {
                            }
                        }
                        peg0VarM.b = rootTelemetryConfiguration;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Bundle bundle2 = zzjVar.f45496a;
            s0x.I(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            hz5 hz5Var3 = this.b;
            int i5 = this.c;
            hz5Var3.getClass();
            xrw0 xrw0Var2 = new xrw0(hz5Var3, i4, strongBinder2, bundle2);
            fmw0 fmw0Var2 = hz5Var3.f;
            fmw0Var2.sendMessage(fmw0Var2.obtainMessage(1, i5, -1, xrw0Var2));
            this.b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
