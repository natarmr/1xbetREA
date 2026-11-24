package a;

import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzoq;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class j2x0 extends umw0 implements ttw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f15804a;
    public final /* synthetic */ a4x0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2x0(a4x0 a4x0Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.f15804a = atomicReference;
        this.b = a4x0Var;
    }

    @Override // a.umw0
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        zzoq zzoqVar = (zzoq) wmw0.a(parcel, zzoq.CREATOR);
        wmw0.d(parcel);
        w(zzoqVar);
        return true;
    }

    @Override // a.ttw0
    public final void w(zzoq zzoqVar) {
        AtomicReference atomicReference = this.f15804a;
        synchronized (atomicReference) {
            uuw0 uuw0Var = ((kxw0) this.b.b).f;
            kxw0.g(uuw0Var);
            uuw0Var.o.b(Integer.valueOf(zzoqVar.f45548a.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(zzoqVar);
            atomicReference.notifyAll();
        }
    }
}
