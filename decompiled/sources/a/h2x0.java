package a;

import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzoh;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class h2x0 extends umw0 implements mtw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f12358a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2x0(a4x0 a4x0Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.f12358a = atomicReference;
    }

    @Override // a.umw0
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzoh.CREATOR);
        wmw0.d(parcel);
        n(arrayListCreateTypedArrayList);
        return true;
    }

    @Override // a.mtw0
    public final void n(List list) {
        AtomicReference atomicReference = this.f12358a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
