package a;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public abstract class caw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f4034a;

    /* JADX WARN: Multi-variable type inference failed */
    public caw0(int i) {
        this.f4034a = i;
    }

    public static Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(fuj0 fuj0Var, boolean z);

    public abstract void d(h9w0 h9w0Var);
}
