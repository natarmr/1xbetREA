package a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public class u40 {
    public static final Object h = new Object();
    public static volatile u40 i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public va8 f35021a;
    public yrw0 b;
    public boolean c;
    public final Object d = new Object();
    public imw0 e;
    public final Context f;
    public final short g;

    public u40(Context context) {
        s0x.H(context);
        this.f = context.getApplicationContext();
        this.c = false;
        this.g = (short) 30000;
    }

    public static t40 a(Context context) throws Throwable {
        long j;
        int i2;
        u40 u40Var = i;
        if (u40Var == null) {
            synchronized (h) {
                try {
                    u40Var = i;
                    if (u40Var == null) {
                        Log.d("AdvertisingIdClient", "Creating AdvertisingIdClient");
                        u40Var = new u40(context);
                        i = u40Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Log.d("AdvertisingIdClient", "AdvertisingIdClient already created.");
        if (xex.c == null) {
            synchronized (xex.d) {
                try {
                    if (xex.c == null) {
                        xex xexVar = new xex();
                        xexVar.b = new AtomicLong(-1L);
                        xexVar.f40764a = new mmx(context, mmx.n, new mwp0("ads_identifier:api"), mav.c);
                        xex.c = xexVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        xex xexVar2 = xex.c;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            t40 t40VarF = u40Var.f();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            u40Var.d(t40VarF, jElapsedRealtime2, null);
            j = jElapsedRealtime;
            try {
                xexVar2.P(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j, SystemClock.elapsedRealtime());
                try {
                    StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 25);
                    sb.append("GetInfoInternal elapse ");
                    sb.append(jElapsedRealtime2);
                    sb.append("ms");
                    Log.i("AdvertisingIdClient", sb.toString());
                    return t40VarF;
                } catch (Throwable th3) {
                    th = th3;
                    u40Var.d(null, -1L, th);
                    if (th instanceof IOException) {
                        i2 = 1;
                    } else if (th instanceof abv) {
                        i2 = 9;
                    } else {
                        i2 = th instanceof IllegalStateException ? 8 : -1;
                    }
                    xexVar2.P(i2, (int) (SystemClock.elapsedRealtime() - j), j, SystemClock.elapsedRealtime());
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                j = j;
            }
        } catch (Throwable th5) {
            th = th5;
            j = jElapsedRealtime;
        }
    }

    public final void b() {
        s0x.G("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.c) {
                    return;
                }
                Context context = this.f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iC = pav.b.c(context, 12451000);
                    if (iC != 0 && iC != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    va8 va8Var = new va8();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!bbw0.m().a(context, intent, va8Var, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f35021a = va8Var;
                        try {
                            IBinder iBinderA = va8Var.a();
                            int i2 = grw0.f11802a;
                            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.b = iInterfaceQueryLocalInterface instanceof yrw0 ? (yrw0) iInterfaceQueryLocalInterface : new aqw0(iBinderA);
                            this.c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new abv();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c() {
        s0x.G("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                Context context = this.f;
                if (context == null || this.f35021a == null) {
                    return;
                }
                try {
                    if (this.c) {
                        bbw0.m().s(context, this.f35021a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.c = false;
                this.b = null;
                this.f35021a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(t40 t40Var, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (t40Var != null) {
                map.put("limit_ad_tracking", true != t40Var.b ? "0" : "1");
                String str = t40Var.c;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new byj0(this, map).start();
        }
    }

    public final synchronized void e() {
        try {
            if (!this.c) {
                try {
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is not bounded. Starting to bind it...");
                    b();
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is bounded");
                    if (!this.c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final t40 f() {
        t40 t40Var;
        s0x.G("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            e();
            s0x.H(this.f35021a);
            s0x.H(this.b);
            try {
                aqw0 aqw0Var = (aqw0) this.b;
                aqw0Var.getClass();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                Parcel parcelB = aqw0Var.b(parcelObtain, 1);
                String string = parcelB.readString();
                parcelB.recycle();
                aqw0 aqw0Var2 = (aqw0) this.b;
                aqw0Var2.getClass();
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                int i2 = xnw0.f41189a;
                parcelObtain2.writeInt(1);
                Parcel parcelB2 = aqw0Var2.b(parcelObtain2, 2);
                if (parcelB2.readInt() == 0) {
                    z = false;
                }
                parcelB2.recycle();
                t40Var = new t40((byte) 0, string, z);
            } catch (RemoteException e) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                throw new IOException("Remote exception", e);
            }
        }
        synchronized (this.d) {
            imw0 imw0Var = this.e;
            if (imw0Var != null) {
                imw0Var.c.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.e = new imw0(this, j);
            }
        }
        return t40Var;
    }

    public final void finalize() throws Throwable {
        c();
        super.finalize();
    }
}
