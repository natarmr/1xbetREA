package a;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class d7x0 {
    public static final Object g = new Object();
    public static d7x0 h = null;
    public static HandlerThread i = null;
    public static boolean j = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5615a = new HashMap();
    public final Context b;
    public volatile jaw0 c;
    public final bbw0 d;
    public final short e;
    public final int f;

    public d7x0(Context context, Looper looper) {
        mz4 mz4Var = new mz4(this, (byte) 4);
        this.b = context.getApplicationContext();
        jaw0 jaw0Var = new jaw0(looper, mz4Var);
        Looper.getMainLooper();
        this.c = jaw0Var;
        this.d = bbw0.m();
        this.e = (short) 5000;
        this.f = 300000;
    }

    public static d7x0 a(Context context) {
        d7x0 d7x0Var;
        synchronized (g) {
            try {
                d7x0Var = h;
                if (d7x0Var == null) {
                    if (!j) {
                        context.getPackageName();
                        j = true;
                    }
                    d7x0Var = new d7x0(context.getApplicationContext(), j ? b().getLooper() : context.getMainLooper());
                    h = d7x0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d7x0Var;
    }

    public static HandlerThread b() {
        synchronized (g) {
            try {
                HandlerThread handlerThread = i;
                if (handlerThread != null && handlerThread.isAlive()) {
                    return i;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                i = handlerThread2;
                handlerThread2.start();
                return i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ConnectionResult c(m3x0 m3x0Var, frw0 frw0Var, String str, Executor executor) {
        ConnectionResult connectionResultA;
        HashMap map = this.f5615a;
        synchronized (map) {
            try {
                t4x0 t4x0Var = (t4x0) map.get(m3x0Var);
                if (executor == null) {
                    executor = null;
                }
                if (t4x0Var == null) {
                    t4x0Var = new t4x0(this, m3x0Var);
                    t4x0Var.f33343a.put(frw0Var, frw0Var);
                    connectionResultA = t4x0Var.a(str, executor);
                    map.put(m3x0Var, t4x0Var);
                } else {
                    this.c.removeMessages(0, m3x0Var);
                    if (t4x0Var.f33343a.containsKey(frw0Var)) {
                        String string = m3x0Var.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    t4x0Var.f33343a.put(frw0Var, frw0Var);
                    byte b = t4x0Var.b;
                    if (b == 1) {
                        frw0Var.onServiceConnected(t4x0Var.f, t4x0Var.d);
                    } else if (b == 2) {
                        connectionResultA = t4x0Var.a(str, executor);
                    }
                    connectionResultA = null;
                }
                if (t4x0Var.c) {
                    return ConnectionResult.f;
                }
                if (connectionResultA == null) {
                    connectionResultA = new ConnectionResult(-1, null, null);
                }
                return connectionResultA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(m3x0 m3x0Var, ServiceConnection serviceConnection) {
        s0x.I(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f5615a;
        synchronized (map) {
            try {
                t4x0 t4x0Var = (t4x0) map.get(m3x0Var);
                if (t4x0Var == null) {
                    String string = m3x0Var.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!t4x0Var.f33343a.containsKey(serviceConnection)) {
                    String string2 = m3x0Var.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                t4x0Var.f33343a.remove(serviceConnection);
                if (t4x0Var.f33343a.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, m3x0Var), this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
