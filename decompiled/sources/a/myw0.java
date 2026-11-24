package a;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class myw0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22624a;
    public final /* synthetic */ d6x0 b;

    public /* synthetic */ myw0(d6x0 d6x0Var, byte b) {
        this.f22624a = b;
        this.b = d6x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22624a) {
            case 0:
                d6x0 d6x0Var = this.b;
                synchronized (d6x0Var) {
                    if (d6x0Var.f5570a == 1) {
                        d6x0Var.b("Timed out while binding");
                    }
                    break;
                }
                return;
            case 1:
                break;
            default:
                this.b.b("Service disconnected");
                return;
        }
        while (true) {
            d6x0 d6x0Var2 = this.b;
            synchronized (d6x0Var2) {
                try {
                    if (d6x0Var2.f5570a != 2) {
                        return;
                    }
                    ArrayDeque arrayDeque = d6x0Var2.d;
                    if (arrayDeque.isEmpty()) {
                        d6x0Var2.d();
                        return;
                    }
                    f8x0 f8x0Var = (f8x0) arrayDeque.poll();
                    SparseArray sparseArray = d6x0Var2.e;
                    int i = f8x0Var.f9130a;
                    sparseArray.put(i, f8x0Var);
                    ((ScheduledExecutorService) d6x0Var2.f.d).schedule(new k3x0(d6x0Var2, f8x0Var, (byte) 1), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(f8x0Var)));
                    }
                    sbx0 sbx0Var = d6x0Var2.f;
                    Messenger messenger = d6x0Var2.b;
                    byte b = f8x0Var.c;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = b;
                    messageObtain.arg1 = i;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", f8x0Var.a());
                    bundle.putString("pkg", ((Context) sbx0Var.c).getPackageName());
                    bundle.putBundle(RemoteMessageConst.DATA, f8x0Var.d);
                    messageObtain.setData(bundle);
                    try {
                        fuj0 fuj0Var = d6x0Var2.c;
                        Messenger messenger2 = (Messenger) fuj0Var.f10166a;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            com.google.android.gms.cloudmessaging.zzd zzdVar = (com.google.android.gms.cloudmessaging.zzd) fuj0Var.b;
                            if (zzdVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            zzdVar.f45479a.send(messageObtain);
                        }
                    } catch (RemoteException e) {
                        d6x0Var2.b(e.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
