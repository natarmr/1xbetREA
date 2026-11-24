package a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.gov.nist.core.Separators;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n760 implements Handler.Callback, ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23026a;
    public final Handler b;
    public final HashMap c = new HashMap();
    public HashSet d = new HashSet();

    public n760(Context context) {
        this.f23026a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(m760 m760Var) {
        boolean z;
        ArrayDeque arrayDeque = m760Var.d;
        ComponentName componentName = m760Var.f21304a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (m760Var.b) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f23026a;
            boolean zBindService = context.bindService(component, this, 33);
            m760Var.b = zBindService;
            if (zBindService) {
                m760Var.e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z = m760Var.b;
        }
        if (!z || m760Var.c == null) {
            b(m760Var);
            return;
        }
        while (true) {
            k760 k760Var = (k760) arrayDeque.peek();
            if (k760Var == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + k760Var);
                }
                k760Var.a(m760Var.c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(m760Var);
    }

    public final void b(m760 m760Var) {
        ComponentName componentName = m760Var.f21304a;
        ArrayDeque arrayDeque = m760Var.d;
        Handler handler = this.b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = m760Var.e;
        int i2 = i + 1;
        m760Var.e = i2;
        if (i2 <= 6) {
            int i3 = (1 << i) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + m760Var.e + " retries");
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        fvw fvwVar = null;
        if (i == 0) {
            k760 k760Var = (k760) message.obj;
            String string = Settings.Secure.getString(this.f23026a.getContentResolver(), "enabled_notification_listeners");
            synchronized (o760.c) {
                if (string != null) {
                    try {
                        if (!string.equals(o760.d)) {
                            String[] strArrSplit = string.split(Separators.COLON, -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            o760.e = hashSet2;
                            o760.d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = o760.e;
            }
            if (!hashSet.equals(this.d)) {
                this.d = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.f23026a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet3) {
                    if (!this.c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.c.put(componentName2, new m760(componentName2));
                    }
                }
                Iterator it = this.c.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        m760 m760Var = (m760) entry.getValue();
                        if (m760Var.b) {
                            this.f23026a.unbindService(this);
                            m760Var.b = false;
                        }
                        m760Var.c = null;
                        it.remove();
                    }
                }
            }
            for (m760 m760Var2 : this.c.values()) {
                m760Var2.d.add(k760Var);
                a(m760Var2);
            }
        } else if (i == 1) {
            l760 l760Var = (l760) message.obj;
            ComponentName componentName3 = l760Var.f19542a;
            IBinder iBinder = l760Var.b;
            m760 m760Var3 = (m760) this.c.get(componentName3);
            if (m760Var3 != null) {
                int i2 = evw.f8493a;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(fvw.k);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof fvw)) {
                        dvw dvwVar = new dvw();
                        dvwVar.f6765a = iBinder;
                        fvwVar = dvwVar;
                    } else {
                        fvwVar = (fvw) iInterfaceQueryLocalInterface;
                    }
                }
                m760Var3.c = fvwVar;
                m760Var3.e = 0;
                a(m760Var3);
                return true;
            }
        } else if (i == 2) {
            m760 m760Var4 = (m760) this.c.get((ComponentName) message.obj);
            if (m760Var4 != null) {
                if (m760Var4.b) {
                    this.f23026a.unbindService(this);
                    m760Var4.b = false;
                }
                m760Var4.c = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            m760 m760Var5 = (m760) this.c.get((ComponentName) message.obj);
            if (m760Var5 != null) {
                a(m760Var5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.b.obtainMessage(1, new l760(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.b.obtainMessage(2, componentName).sendToTarget();
    }
}
