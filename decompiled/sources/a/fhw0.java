package a;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes2.dex */
public final class fhw0 extends b9v {
    @Override // a.hz5
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return iInterfaceQueryLocalInterface instanceof kzw0 ? (kzw0) iInterfaceQueryLocalInterface : new kzw0(iBinder);
    }

    @Override // a.hz5
    public final Feature[] f() {
        return ohq0.i;
    }

    @Override // a.hz5
    public final int i() {
        return 12451000;
    }

    @Override // a.hz5
    public final String m() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // a.hz5
    public final String n() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // a.hz5
    public final boolean s() {
        return true;
    }
}
