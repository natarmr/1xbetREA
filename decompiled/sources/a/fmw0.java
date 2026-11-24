package a;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes2.dex */
public final class fmw0 extends jaw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hz5 f9805a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmw0(hz5 hz5Var, Looper looper) {
        super(looper, (byte) 3);
        this.f9805a = hz5Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        kbw0 kbw0Var;
        hz5 hz5Var = this.f9805a;
        int i = hz5Var.x.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (kbw0Var = (kbw0) message.obj) != null) {
                synchronized (kbw0Var) {
                    kbw0Var.f18035a = null;
                }
                hz5 hz5Var2 = kbw0Var.c;
                synchronized (hz5Var2.l) {
                    hz5Var2.l.remove(kbw0Var);
                }
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !hz5Var.q()) {
            kbw0 kbw0Var2 = (kbw0) message.obj;
            if (kbw0Var2 != null) {
                synchronized (kbw0Var2) {
                    kbw0Var2.f18035a = null;
                }
                hz5 hz5Var3 = kbw0Var2.c;
                synchronized (hz5Var3.l) {
                    hz5Var3.l.remove(kbw0Var2);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            hz5Var.u = new ConnectionResult(message.arg2, null, null);
            if (!hz5Var.v && !TextUtils.isEmpty(hz5Var.m()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(hz5Var.m());
                    if (!hz5Var.v) {
                        hz5Var.v(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            ConnectionResult connectionResult = hz5Var.u;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(8, null, null);
            }
            hz5Var.j.a(connectionResult);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            ConnectionResult connectionResult2 = hz5Var.u;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(8, null, null);
            }
            hz5Var.j.a(connectionResult2);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            hz5Var.j.a(new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            hz5Var.v(5, null);
            ez5 ez5Var = hz5Var.o;
            if (ez5Var != null) {
                ez5Var.onConnectionSuspended(message.arg2);
            }
            System.currentTimeMillis();
            hz5Var.u(5, 1, null);
            return;
        }
        if (i4 == 2 && !hz5Var.p()) {
            kbw0 kbw0Var3 = (kbw0) message.obj;
            if (kbw0Var3 != null) {
                synchronized (kbw0Var3) {
                    kbw0Var3.f18035a = null;
                }
                hz5 hz5Var4 = kbw0Var3.c;
                synchronized (hz5Var4.l) {
                    hz5Var4.l.remove(kbw0Var3);
                }
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            Log.wtf("GmsClient", b1j.h(i5, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i5).length() + 34)), new Exception());
            return;
        }
        kbw0 kbw0Var4 = (kbw0) message.obj;
        synchronized (kbw0Var4) {
            try {
                bool = kbw0Var4.f18035a;
                if (kbw0Var4.b) {
                    String string = kbw0Var4.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(string);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            hz5 hz5Var5 = kbw0Var4.f;
            int i6 = kbw0Var4.d;
            if (i6 != 0) {
                hz5Var5.v(1, null);
                Bundle bundle = kbw0Var4.e;
                kbw0Var4.b(new ConnectionResult(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!kbw0Var4.a()) {
                hz5Var5.v(1, null);
                kbw0Var4.b(new ConnectionResult(8, null, null));
            }
        }
        synchronized (kbw0Var4) {
            kbw0Var4.b = true;
        }
        synchronized (kbw0Var4) {
            kbw0Var4.f18035a = null;
        }
        hz5 hz5Var6 = kbw0Var4.c;
        synchronized (hz5Var6.l) {
            hz5Var6.l.remove(kbw0Var4);
        }
    }
}
