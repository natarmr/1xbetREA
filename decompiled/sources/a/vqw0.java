package a;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class vqw0 extends umw0 implements mpw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k3x0 f37873a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqw0(oqw0 oqw0Var, k3x0 k3x0Var) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.f37873a = k3x0Var;
    }

    @Override // a.umw0
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        zze();
        return true;
    }

    @Override // a.mpw0
    public final void zze() {
        this.f37873a.run();
    }
}
