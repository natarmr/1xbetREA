package a;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class suw implements uuw, IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f32839a;

    public suw(IBinder iBinder) {
        this.f32839a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f32839a;
    }
}
