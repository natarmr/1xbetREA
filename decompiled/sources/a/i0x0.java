package a;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes2.dex */
public final class i0x0 extends b9v {
    @Override // a.hz5
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return iInterfaceQueryLocalInterface instanceof h0x0 ? (h0x0) iInterfaceQueryLocalInterface : new h0x0(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService", (byte) 4);
    }

    @Override // a.hz5
    public final Feature[] f() {
        return f1t0.l;
    }

    @Override // a.hz5
    public final int i() {
        return 9410000;
    }

    @Override // a.hz5
    public final String m() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // a.hz5
    public final String n() {
        return "com.google.android.gms.phenotype.service.START";
    }
}
