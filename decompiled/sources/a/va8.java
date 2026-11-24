package a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class va8 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f37073a = false;
    public final LinkedBlockingQueue b = new LinkedBlockingQueue();

    public final IBinder a() throws TimeoutException {
        s0x.G("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f37073a) {
            jf4.n("Cannot call get on this connection more than once");
            return null;
        }
        this.f37073a = true;
        IBinder iBinder = (IBinder) this.b.poll(10000L, TimeUnit.MILLISECONDS);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
