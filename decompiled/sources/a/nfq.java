package a;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class nfq {
    public static final Object k = new Object();
    public static final gx3 l = new gx3(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23449a;
    public final String b;
    public final mgq c;
    public final qgd d;
    public final b8z g;
    public final p5d0 h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public nfq(Context context, String str, mgq mgqVar) {
        ?? arrayList;
        byte b = 0;
        this.f23449a = context;
        s0x.E(str);
        this.b = str;
        this.c = mgqVar;
        b55 b55Var = FirebaseInitProvider.f45672a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new igd((String) it.next(), b));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        o6t0 o6t0Var = o6t0.f24755a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        byte b2 = 1;
        arrayList3.add(new igd(new FirebaseCommonRegistrar(), b2));
        arrayList3.add(new igd(new ExecutorsRegistrar(), b2));
        arrayList4.add(pfd.c(context, Context.class, new Class[0]));
        arrayList4.add(pfd.c(this, nfq.class, new Class[0]));
        arrayList4.add(pfd.c(mgqVar, mgq.class, new Class[0]));
        kj5 kj5Var = new kj5();
        if (tnq0.n(context) && FirebaseInitProvider.b.get()) {
            arrayList4.add(pfd.c(b55Var, b55.class, new Class[0]));
        }
        qgd qgdVar = new qgd(arrayList3, arrayList4, kj5Var);
        this.d = qgdVar;
        Trace.endSection();
        this.g = new b8z(new pgd(this, context, (byte) 2));
        this.h = qgdVar.j(quj.class);
        kfq kfqVar = new kfq(this);
        a();
        if (this.e.get()) {
            fc5.e.f9293a.get();
        }
        this.i.add(kfqVar);
        Trace.endSection();
    }

    public static ArrayList c() {
        ArrayList arrayList = new ArrayList();
        synchronized (k) {
            try {
                for (nfq nfqVar : (ex3) l.values()) {
                    nfqVar.a();
                    arrayList.add(nfqVar.b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static nfq d() {
        nfq nfqVar;
        synchronized (k) {
            try {
                nfqVar = (nfq) l.get("[DEFAULT]");
                if (nfqVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + p7x.w() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((quj) nfqVar.h.get()).a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return nfqVar;
    }

    public static nfq e(String str) {
        nfq nfqVar;
        String str2;
        synchronized (k) {
            try {
                nfqVar = (nfq) l.get(str.trim());
                if (nfqVar == null) {
                    ArrayList arrayListC = c();
                    if (arrayListC.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", arrayListC);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
                ((quj) nfqVar.h.get()).a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return nfqVar;
    }

    public static nfq h(Context context) {
        synchronized (k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    return d();
                }
                mgq mgqVarA = mgq.a(context);
                if (mgqVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return i(context, mgqVarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static nfq i(Context context, mgq mgqVar) {
        nfq nfqVar;
        AtomicReference atomicReference = lfq.f19969a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = lfq.f19969a;
            if (atomicReference2.get() == null) {
                lfq lfqVar = new lfq();
                do {
                    if (atomicReference2.compareAndSet(null, lfqVar)) {
                        fc5.b(application);
                        fc5.e.a(lfqVar);
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            gx3 gx3Var = l;
            s0x.J("FirebaseApp name [DEFAULT] already exists!", !gx3Var.containsKey("[DEFAULT]"));
            s0x.I(context, "Application context cannot be null.");
            nfqVar = new nfq(context, "[DEFAULT]", mgqVar);
            gx3Var.put("[DEFAULT]", nfqVar);
        }
        nfqVar.g();
        return nfqVar;
    }

    public final void a() {
        s0x.J("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nfq)) {
            return false;
        }
        nfq nfqVar = (nfq) obj;
        nfqVar.a();
        return this.b.equals(nfqVar.b);
    }

    public final String f() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(y0x0.G(this.b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(y0x0.G(this.c.b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void g() {
        HashMap map;
        if (!tnq0.n(this.f23449a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f23449a;
            AtomicReference atomicReference = mfq.b;
            if (atomicReference.get() == null) {
                mfq mfqVar = new mfq(context);
                while (!atomicReference.compareAndSet(null, mfqVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(mfqVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.b);
        Log.i("FirebaseApp", sb2.toString());
        qgd qgdVar = this.d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.b);
        AtomicReference atomicReference2 = (AtomicReference) qgdVar.g;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                ((quj) this.h.get()).a();
            }
        }
        synchronized (qgdVar) {
            map = new HashMap((HashMap) qgdVar.b);
        }
        qgdVar.t(map, zEquals);
        ((quj) this.h.get()).a();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final boolean j() {
        boolean z;
        a();
        raj rajVar = (raj) this.g.get();
        synchronized (rajVar) {
            z = rajVar.f30136a;
        }
        return z;
    }

    public final String toString() {
        dq00 dq00Var = new dq00(this);
        dq00Var.a(this.b, "name");
        dq00Var.a(this.c, "options");
        return dq00Var.toString();
    }
}
