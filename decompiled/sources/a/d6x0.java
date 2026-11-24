package a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class d6x0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f5570a = 0;
    public final Messenger b;
    public fuj0 c;
    public final ArrayDeque d;
    public final SparseArray e;
    public final /* synthetic */ sbx0 f;

    public d6x0(sbx0 sbx0Var) {
        this.f = sbx0Var;
        jaw0 jaw0Var = new jaw0(Looper.getMainLooper(), new mz4(this, (byte) 3));
        Looper.getMainLooper();
        this.b = new Messenger(jaw0Var);
        this.d = new ArrayDeque();
        this.e = new SparseArray();
    }

    public final synchronized boolean a(f8x0 f8x0Var) {
        byte b = this.f5570a;
        byte b2 = 0;
        byte b3 = 1;
        if (b != 0) {
            if (b == 1) {
                this.d.add(f8x0Var);
                return true;
            }
            if (b != 2) {
                return false;
            }
            this.d.add(f8x0Var);
            ((ScheduledExecutorService) this.f.d).execute(new myw0(this, b3));
            return true;
        }
        this.d.add(f8x0Var);
        if (this.f5570a != 0) {
            throw new IllegalStateException();
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f5570a = (byte) 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            bbw0 bbw0VarM = bbw0.m();
            sbx0 sbx0Var = this.f;
            if (bbw0VarM.a((Context) sbx0Var.c, intent, this, 1)) {
                ((ScheduledExecutorService) sbx0Var.d).schedule(new myw0(this, b2), 30L, TimeUnit.SECONDS);
            } else {
                b("Unable to bind to service");
            }
        } catch (SecurityException e) {
            c("Unable to bind to service", e);
        }
        return true;
    }

    public final synchronized void b(String str) {
        c(str, null);
    }

    public final synchronized void c(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            byte b = this.f5570a;
            if (b == 0) {
                throw new IllegalStateException();
            }
            if (b != 1 && b != 2) {
                if (b != 3) {
                    return;
                }
                this.f5570a = (byte) 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f5570a = (byte) 4;
            bbw0.m().s((Context) this.f.c, this);
            c44 c44Var = new c44(str, securityException, (byte) 20);
            ArrayDeque arrayDeque = this.d;
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((f8x0) it.next()).c(c44Var);
            }
            arrayDeque.clear();
            int i = 0;
            while (true) {
                SparseArray sparseArray = this.e;
                if (i >= sparseArray.size()) {
                    sparseArray.clear();
                    return;
                } else {
                    ((f8x0) sparseArray.valueAt(i)).c(c44Var);
                    i++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d() {
        try {
            if (this.f5570a == 2 && this.d.isEmpty() && this.e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f5570a = (byte) 3;
                bbw0.m().s((Context) this.f.c, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f.d).execute(new lfr((Object) this, (Object) iBinder, (byte) 26));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f.d).execute(new myw0(this, (byte) 2));
    }
}
