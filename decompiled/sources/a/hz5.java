package a;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.huawei.hms.api.HuaweiApiClientImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hz5 {
    public static final Feature[] y = new Feature[0];
    public t40 b;
    public final Context c;
    public final d7x0 d;
    public final pav e;
    public final fmw0 f;
    public mbw0 i;
    public gz5 j;
    public IInterface k;
    public frw0 m;
    public final ez5 o;
    public final fz5 p;
    public final short q;
    public final String r;
    public volatile String s;
    public volatile fvt0 t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile String f13892a = null;
    public final Object g = new Object();
    public final Object h = new Object();
    public final ArrayList l = new ArrayList();
    public byte n = 1;
    public ConnectionResult u = null;
    public boolean v = false;
    public volatile com.google.android.gms.common.internal.zzj w = null;
    public final AtomicInteger x = new AtomicInteger(0);

    /* JADX WARN: Multi-variable type inference failed */
    public hz5(Context context, Looper looper, d7x0 d7x0Var, pav pavVar, int i, ez5 ez5Var, fz5 fz5Var, String str) {
        s0x.I(context, "Context must not be null");
        this.c = context;
        s0x.I(looper, "Looper must not be null");
        s0x.I(d7x0Var, "Supervisor must not be null");
        this.d = d7x0Var;
        s0x.I(pavVar, "API availability must not be null");
        this.e = pavVar;
        this.f = new fmw0(this, looper);
        this.q = i;
        this.o = ez5Var;
        this.p = fz5Var;
        this.r = str;
    }

    public final void a() {
        int iC = this.e.c(this.c, i());
        if (iC == 0) {
            this.j = new r7v(this);
            v(2, null);
            return;
        }
        v(1, null);
        this.j = new r7v(this);
        int i = this.x.get();
        fmw0 fmw0Var = this.f;
        fmw0Var.sendMessage(fmw0Var.obtainMessage(3, i, iC, null));
    }

    public IInterface b(IBinder iBinder) {
        iBinder.getClass();
        int i = tuw.b;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        return iInterfaceQueryLocalInterface instanceof uuw ? (uuw) iInterfaceQueryLocalInterface : new suw(iBinder);
    }

    public final void c() {
        this.x.incrementAndGet();
        ArrayList arrayList = this.l;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    kbw0 kbw0Var = (kbw0) arrayList.get(i);
                    synchronized (kbw0Var) {
                        kbw0Var.f18035a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.h) {
            this.i = null;
        }
        v(1, null);
    }

    public final void d(String str) {
        this.f13892a = str;
        c();
    }

    public Account e() {
        return null;
    }

    public Feature[] f() {
        return y;
    }

    public Executor g() {
        return null;
    }

    public Bundle h() {
        return new Bundle();
    }

    public int i() {
        return 17895000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(guw guwVar, Set set) {
        AttributionSource attributionSource;
        Bundle bundleH = h();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.t == null || (attributionSource = (AttributionSource) this.t.f10231a) == null || attributionSource.getAttributionTag() == null) ? this.s : attributionSource.getAttributionTag();
        String str = attributionTag;
        short s = this.q;
        int i = pav.f26674a;
        Scope[] scopeArr = GetServiceRequest.o;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.p;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, s, i, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.d = this.c.getPackageName();
        getServiceRequest.g = bundleH;
        if (set != null) {
            getServiceRequest.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (r()) {
            Account accountE = e();
            if (accountE == null) {
                accountE = new Account(HuaweiApiClientImpl.DEFAULT_ACCOUNT, "com.google");
            }
            getServiceRequest.h = accountE;
            if (guwVar != 0) {
                getServiceRequest.e = ((y4w0) guwVar).b;
            }
        }
        getServiceRequest.i = y;
        getServiceRequest.j = f();
        if (s()) {
            getServiceRequest.m = true;
        }
        try {
            synchronized (this.h) {
                try {
                    mbw0 mbw0Var = this.i;
                    if (mbw0Var != null) {
                        mbw0Var.b(new ypw0(this, this.x.get()), getServiceRequest);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i2 = this.x.get();
            fmw0 fmw0Var = this.f;
            fmw0Var.sendMessage(fmw0Var.obtainMessage(6, i2, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.x.get();
            xrw0 xrw0Var = new xrw0(this, 8, null, null);
            fmw0 fmw0Var2 = this.f;
            fmw0Var2.sendMessage(fmw0Var2.obtainMessage(1, i3, -1, xrw0Var));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.x.get();
            xrw0 xrw0Var2 = new xrw0(this, 8, null, null);
            fmw0 fmw0Var3 = this.f;
            fmw0Var3.sendMessage(fmw0Var3.obtainMessage(1, i4, -1, xrw0Var2));
        }
    }

    public Set k() {
        return Collections.EMPTY_SET;
    }

    public final IInterface l() {
        IInterface iInterface;
        synchronized (this.g) {
            try {
                if (this.n == 5) {
                    throw new DeadObjectException();
                }
                if (!p()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.k;
                s0x.I(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public String m() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    public String n() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    public boolean o() {
        return i() >= 211700000;
    }

    public final boolean p() {
        boolean z;
        synchronized (this.g) {
            z = this.n == 4;
        }
        return z;
    }

    public final boolean q() {
        boolean z;
        synchronized (this.g) {
            byte b = this.n;
            z = true;
            if (b != 2 && b != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return this instanceof ywf0;
    }

    public final String t() {
        String str = this.r;
        return str == null ? this.c.getClass().getName() : str;
    }

    public final /* synthetic */ boolean u(int i, int i2, IInterface iInterface) {
        synchronized (this.g) {
            try {
                if (this.n != i) {
                    return false;
                }
                v(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(int i, IInterface iInterface) {
        t40 t40Var;
        s0x.C((i == 4) == (iInterface != null));
        synchronized (this.g) {
            try {
                this.n = i;
                this.k = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    frw0 frw0Var = this.m;
                    if (frw0Var != null) {
                        d7x0 d7x0Var = this.d;
                        String str = this.b.c;
                        s0x.H(str);
                        this.b.getClass();
                        t();
                        d7x0Var.d(new m3x0(str, this.b.b), frw0Var);
                        this.m = null;
                    }
                } else if (i == 2 || i == 3) {
                    frw0 frw0Var2 = this.m;
                    if (frw0Var2 != null && (t40Var = this.b) != null) {
                        String str2 = t40Var.c;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        d7x0 d7x0Var2 = this.d;
                        String str3 = this.b.c;
                        s0x.H(str3);
                        this.b.getClass();
                        t();
                        boolean z = this.b.b;
                        d7x0Var2.getClass();
                        d7x0Var2.d(new m3x0(str3, z), frw0Var2);
                        this.x.incrementAndGet();
                    }
                    frw0 frw0Var3 = new frw0(this, this.x.get());
                    this.m = frw0Var3;
                    String strN = n();
                    boolean zO = o();
                    this.b = new t40((byte) 2, strN, zO);
                    if (zO && i() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.b.c)));
                    }
                    d7x0 d7x0Var3 = this.d;
                    String str4 = this.b.c;
                    s0x.H(str4);
                    this.b.getClass();
                    ConnectionResult connectionResultC = d7x0Var3.c(new m3x0(str4, this.b.b), frw0Var3, t(), g());
                    if (!(connectionResultC.b == 0)) {
                        String str5 = this.b.c;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str5);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i2 = connectionResultC.b;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (connectionResultC.c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", connectionResultC.c);
                        }
                        int i3 = this.x.get();
                        dtw0 dtw0Var = new dtw0(this, i2, bundle);
                        fmw0 fmw0Var = this.f;
                        fmw0Var.sendMessage(fmw0Var.obtainMessage(7, i3, -1, dtw0Var));
                    }
                } else if (i == 4) {
                    s0x.H(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
