package a;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes2.dex */
public final class bqw0 extends b9v {
    @Override // a.hz5
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        return iInterfaceQueryLocalInterface instanceof hrw0 ? (hrw0) iInterfaceQueryLocalInterface : new hrw0(iBinder);
    }

    @Override // a.hz5
    public final Feature[] f() {
        return rsr0.i;
    }

    @Override // a.hz5
    public final int i() {
        return 261200000;
    }

    @Override // a.hz5
    public final String m() {
        return "com.google.android.gms.cloudmessaging.internal.ICloudMessagingService";
    }

    @Override // a.hz5
    public final String n() {
        return "com.google.android.gms.cloudmessaging.service.START";
    }

    @Override // a.hz5
    public final boolean s() {
        return true;
    }
}
