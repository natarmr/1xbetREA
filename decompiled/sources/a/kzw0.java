package a;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class kzw0 implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f19170a;

    public kzw0(IBinder iBinder) {
        this.f19170a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f19170a;
    }
}
