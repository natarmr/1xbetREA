package a;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class hrw0 implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f13552a;

    public hrw0(IBinder iBinder) {
        this.f13552a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f13552a;
    }
}
