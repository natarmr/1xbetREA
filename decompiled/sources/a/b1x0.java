package a;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzpl;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class b1x0 extends etw0 {
    public cgp d;
    public hcp0 e;
    public final CopyOnWriteArraySet f;
    public boolean g;
    public final AtomicReference h;
    public final Object i;
    public boolean j;
    public int k;
    public ezw0 l;
    public ezw0 m;
    public PriorityQueue n;
    public xyw0 o;
    public final AtomicLong p;
    public long q;
    public final zlt0 r;
    public boolean s;
    public ezw0 t;
    public x0x0 u;
    public ezw0 v;
    public final zlt0 w;

    public b1x0(kxw0 kxw0Var) {
        super(kxw0Var);
        this.f = new CopyOnWriteArraySet();
        this.i = new Object();
        this.j = false;
        this.k = 1;
        this.s = true;
        this.w = new zlt0((Object) this, (byte) 15);
        this.h = new AtomicReference();
        this.o = xyw0.c;
        this.q = -1L;
        this.p = new AtomicLong(0L);
        this.r = new zlt0((Object) kxw0Var, (byte) 17);
    }

    public final String A1() {
        kxw0 kxw0Var = (kxw0) this.b;
        try {
            return o5n0.w(kxw0Var.f19080a, kxw0Var.p);
        } catch (IllegalStateException e) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.g.b(e, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void B1(xyw0 xyw0Var, long j, boolean z) {
        int i = xyw0Var.b;
        m1();
        n1();
        kxw0 kxw0Var = (kxw0) this.b;
        wvw0 wvw0Var = kxw0Var.e;
        uuw0 uuw0Var = kxw0Var.f;
        kxw0.e(wvw0Var);
        xyw0 xyw0VarT1 = wvw0Var.t1();
        if (j <= this.q && xyw0.l(xyw0VarT1.b, i)) {
            kxw0.g(uuw0Var);
            uuw0Var.m.b(xyw0Var, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        wvw0 wvw0Var2 = kxw0Var.e;
        kxw0.e(wvw0Var2);
        wvw0Var2.m1();
        if (!xyw0.l(i, wvw0Var2.q1().getInt("consent_source", 100))) {
            kxw0.g(uuw0Var);
            uuw0Var.m.b(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = wvw0Var2.q1().edit();
        editorEdit.putString("consent_settings", xyw0Var.g());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        kxw0.g(uuw0Var);
        uuw0Var.o.b(xyw0Var, "Setting storage consent(FE)");
        this.q = j;
        if (kxw0Var.i().v1()) {
            a4x0 a4x0VarI = kxw0Var.i();
            a4x0VarI.m1();
            a4x0VarI.n1();
            a4x0VarI.z1(new r3x0(a4x0VarI, (byte) 2));
        } else {
            a4x0 a4x0VarI2 = kxw0Var.i();
            a4x0VarI2.m1();
            a4x0VarI2.n1();
            if (a4x0VarI2.u1()) {
                a4x0VarI2.z1(new t2x0(a4x0VarI2, a4x0VarI2.B1(false), (byte) 1));
            }
        }
        if (z) {
            kxw0Var.i().p1(new AtomicReference());
        }
    }

    public final void C1(Boolean bool, boolean z) {
        m1();
        n1();
        kxw0 kxw0Var = (kxw0) this.b;
        uuw0 uuw0Var = kxw0Var.f;
        kxw0.g(uuw0Var);
        uuw0Var.n.b(bool, "Setting app measurement enabled (FE)");
        wvw0 wvw0Var = kxw0Var.e;
        kxw0.e(wvw0Var);
        wvw0Var.m1();
        SharedPreferences.Editor editorEdit = wvw0Var.q1().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z) {
            wvw0Var.m1();
            SharedPreferences.Editor editorEdit2 = wvw0Var.q1().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        fxw0 fxw0Var = kxw0Var.g;
        kxw0.g(fxw0Var);
        fxw0Var.m1();
        if (kxw0Var.z || !(bool == null || bool.booleanValue())) {
            D1();
        }
    }

    public final void D1() {
        m1();
        kxw0 kxw0Var = (kxw0) this.b;
        wvw0 wvw0Var = kxw0Var.e;
        uuw0 uuw0Var = kxw0Var.f;
        lwf lwfVar = kxw0Var.k;
        kxw0.e(wvw0Var);
        String strT = wvw0Var.n.t();
        byte b = 1;
        if (strT != null) {
            if ("unset".equals(strT)) {
                lwfVar.getClass();
                w1(System.currentTimeMillis(), null, Payload.TYPE_APP, "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strT) ? 0L : 1L);
                lwfVar.getClass();
                w1(System.currentTimeMillis(), lValueOf, Payload.TYPE_APP, "_npa");
            }
        }
        if (!kxw0Var.a() || !this.s) {
            kxw0.g(uuw0Var);
            uuw0Var.n.a("Updating Scion state (FE)");
            a4x0 a4x0VarI = kxw0Var.i();
            a4x0VarI.m1();
            a4x0VarI.n1();
            a4x0VarI.z1(new o2x0(a4x0VarI, a4x0VarI.B1(true), (byte) 2));
            return;
        }
        kxw0.g(uuw0Var);
        uuw0Var.n.a("Recording app launch after enabling measurement for the first time (FE)");
        x1();
        w4x0 w4x0Var = kxw0Var.h;
        kxw0.f(w4x0Var);
        w4x0Var.f.e();
        fxw0 fxw0Var = kxw0Var.g;
        kxw0.g(fxw0Var);
        fxw0Var.v1(new dzw0(this, b));
    }

    public final void E1() {
        kxw0 kxw0Var = (kxw0) this.b;
        if (!(kxw0Var.f19080a.getApplicationContext() instanceof Application) || this.d == null) {
            return;
        }
        ((Application) kxw0Var.f19080a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.d);
    }

    public final void F1(Bundle bundle, int i, long j) {
        Boolean bool;
        String string;
        tyw0 tyw0Var;
        Boolean bool2;
        kxw0 kxw0Var = (kxw0) this.b;
        n1();
        xyw0 xyw0Var = xyw0.c;
        wyw0[] wyw0VarArr = vyw0.STORAGE.f38270a;
        int length = wyw0VarArr.length;
        int i2 = 0;
        while (true) {
            bool = null;
            if (i2 >= length) {
                string = null;
                break;
            }
            String str = wyw0VarArr[i2].f39994a;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    bool2 = Boolean.TRUE;
                } else {
                    bool2 = string.equals("denied") ? Boolean.FALSE : null;
                }
                if (bool2 == null) {
                    break;
                }
            }
            i2++;
        }
        if (string != null) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.l.b(string, "Ignoring invalid consent setting");
            uuw0 uuw0Var2 = kxw0Var.f;
            kxw0.g(uuw0Var2);
            uuw0Var2.l.a("Valid consent values are 'granted', 'denied'");
        }
        fxw0 fxw0Var = kxw0Var.g;
        kxw0.g(fxw0Var);
        boolean zS1 = fxw0Var.s1();
        xyw0 xyw0VarB = xyw0.b(i, bundle);
        Iterator it = xyw0VarB.f41726a.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            tyw0Var = tyw0.UNINITIALIZED;
            if (!zHasNext) {
                break;
            } else if (((tyw0) it.next()) != tyw0Var) {
                H1(xyw0VarB, zS1);
                break;
            }
        }
        jmw0 jmw0VarC = jmw0.c(i, bundle);
        Iterator it2 = jmw0VarC.e.values().iterator();
        while (it2.hasNext()) {
            if (((tyw0) it2.next()) != tyw0Var) {
                G1(jmw0VarC, zS1);
                break;
            }
        }
        if (bundle != null) {
            int iOrdinal = xyw0.d(bundle.getString("ad_personalization")).ordinal();
            if (iOrdinal == 2) {
                bool = Boolean.FALSE;
            } else if (iOrdinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str2 = i == -30 ? "tcf" : Payload.TYPE_APP;
            if (zS1) {
                w1(j, bool.toString(), str2, "allow_personalized_ads");
            } else {
                v1(str2, "allow_personalized_ads", bool.toString(), false, j);
            }
        }
    }

    public final void G1(jmw0 jmw0Var, boolean z) {
        lfr lfrVar = new lfr(this, jmw0Var, false, (byte) 28);
        if (z) {
            m1();
            lfrVar.run();
        } else {
            fxw0 fxw0Var = ((kxw0) this.b).g;
            kxw0.g(fxw0Var);
            fxw0Var.v1(lfrVar);
        }
    }

    public final void H1(xyw0 xyw0Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        xyw0 xyw0Var2;
        n1();
        int i = xyw0Var.b;
        if (i != -10) {
            tyw0 tyw0Var = (tyw0) xyw0Var.f41726a.get(wyw0.AD_STORAGE);
            if (tyw0Var == null) {
                tyw0Var = tyw0.UNINITIALIZED;
            }
            tyw0 tyw0Var2 = tyw0.UNINITIALIZED;
            if (tyw0Var == tyw0Var2) {
                tyw0 tyw0Var3 = (tyw0) xyw0Var.f41726a.get(wyw0.ANALYTICS_STORAGE);
                if (tyw0Var3 == null) {
                    tyw0Var3 = tyw0Var2;
                }
                if (tyw0Var3 == tyw0Var2) {
                    uuw0 uuw0Var = ((kxw0) this.b).f;
                    kxw0.g(uuw0Var);
                    uuw0Var.l.a("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.i) {
            try {
                z2 = false;
                if (xyw0.l(i, this.o.b)) {
                    xyw0 xyw0Var3 = this.o;
                    EnumMap enumMap = xyw0Var.f41726a;
                    wyw0[] wyw0VarArr = (wyw0[]) enumMap.keySet().toArray(new wyw0[0]);
                    int length = wyw0VarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z3 = false;
                            break;
                        }
                        wyw0 wyw0Var = wyw0VarArr[i2];
                        tyw0 tyw0Var4 = (tyw0) enumMap.get(wyw0Var);
                        tyw0 tyw0Var5 = (tyw0) xyw0Var3.f41726a.get(wyw0Var);
                        tyw0 tyw0Var6 = tyw0.DENIED;
                        if (tyw0Var4 == tyw0Var6 && tyw0Var5 != tyw0Var6) {
                            z3 = true;
                            break;
                        }
                        i2++;
                    }
                    wyw0 wyw0Var2 = wyw0.ANALYTICS_STORAGE;
                    if (xyw0Var.i(wyw0Var2) && !this.o.i(wyw0Var2)) {
                        z2 = true;
                    }
                    xyw0Var = xyw0Var.k(this.o);
                    this.o = xyw0Var;
                    z4 = z2;
                    z2 = true;
                } else {
                    z3 = false;
                    z4 = false;
                }
                xyw0Var2 = xyw0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            uuw0 uuw0Var2 = ((kxw0) this.b).f;
            kxw0.g(uuw0Var2);
            uuw0Var2.m.b(xyw0Var2, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.p.getAndIncrement();
        if (z3) {
            this.h.set(null);
            j0x0 j0x0Var = new j0x0(this, xyw0Var2, andIncrement, z4, (byte) 0);
            if (z) {
                m1();
                j0x0Var.run();
                return;
            } else {
                fxw0 fxw0Var = ((kxw0) this.b).g;
                kxw0.g(fxw0Var);
                fxw0Var.x1(j0x0Var);
                return;
            }
        }
        j0x0 j0x0Var2 = new j0x0(this, xyw0Var2, andIncrement, z4, (byte) 1);
        if (z) {
            m1();
            j0x0Var2.run();
        } else if (i == 30 || i == -10) {
            fxw0 fxw0Var2 = ((kxw0) this.b).g;
            kxw0.g(fxw0Var2);
            fxw0Var2.x1(j0x0Var2);
        } else {
            fxw0 fxw0Var3 = ((kxw0) this.b).g;
            kxw0.g(fxw0Var3);
            fxw0Var3.v1(j0x0Var2);
        }
    }

    public final void I1() {
        miw0.a();
        kxw0 kxw0Var = (kxw0) this.b;
        bkw0 bkw0Var = kxw0Var.d;
        fxw0 fxw0Var = kxw0Var.g;
        uuw0 uuw0Var = kxw0Var.f;
        if (bkw0Var.x1(null, btw0.P0)) {
            kxw0.g(fxw0Var);
            if (fxw0Var.s1()) {
                kxw0.g(uuw0Var);
                uuw0Var.g.a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (svs0.e()) {
                kxw0.g(uuw0Var);
                uuw0Var.g.a("Cannot get trigger URIs from main thread");
                return;
            }
            n1();
            kxw0.g(uuw0Var);
            uuw0Var.o.a("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            kxw0.g(fxw0Var);
            fxw0Var.w1(atomicReference, 10000L, "get trigger URIs", new zzw0(this, atomicReference, (byte) 2, false));
            List list = (List) atomicReference.get();
            if (list == null) {
                kxw0.g(uuw0Var);
                uuw0Var.i.a("Timed out waiting for get trigger URIs");
            } else {
                kxw0.g(fxw0Var);
                fxw0Var.v1(new mfr((Object) this, (Object) list, (byte) 26));
            }
        }
    }

    public final PriorityQueue J1() {
        PriorityQueue priorityQueue = this.n;
        if (priorityQueue != null) {
            return priorityQueue;
        }
        PriorityQueue priorityQueue2 = new PriorityQueue(Comparator.comparing(s0x0.f31431a, jzt0.c));
        this.n = priorityQueue2;
        return priorityQueue2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K1() {
        zzoh zzohVar;
        m1();
        if (J1().isEmpty() || this.j || (zzohVar = (zzoh) J1().poll()) == null) {
            return;
        }
        kxw0 kxw0Var = (kxw0) this.b;
        x6x0 x6x0Var = kxw0Var.i;
        kxw0.e(x6x0Var);
        zj30 zj30VarI1 = x6x0Var.I1();
        if (zj30VarI1 != null) {
            this.j = true;
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            quw0 quw0Var = uuw0Var.o;
            String str = zzohVar.f45545a;
            quw0Var.b(str, "Registering trigger URI");
            ig00 ig00VarB = zj30VarI1.b(Uri.parse(str));
            boolean z = false;
            Object[] objArr = 0;
            if (ig00VarB != null) {
                ig00VarB.a(new lfr((Object) ig00VarB, (Object) new trm0((Object) this, (Object) zzohVar, z, (byte) 22), (byte) (objArr == true ? 1 : 0)), new vox(this, (byte) 3));
            } else {
                this.j = false;
                J1().add(zzohVar);
            }
        }
    }

    public final void L1(xyw0 xyw0Var) {
        m1();
        boolean z = (xyw0Var.i(wyw0.ANALYTICS_STORAGE) && xyw0Var.i(wyw0.AD_STORAGE)) || ((kxw0) this.b).i().u1();
        kxw0 kxw0Var = (kxw0) this.b;
        fxw0 fxw0Var = kxw0Var.g;
        kxw0.g(fxw0Var);
        fxw0Var.m1();
        if (z != kxw0Var.z) {
            fxw0 fxw0Var2 = kxw0Var.g;
            kxw0.g(fxw0Var2);
            fxw0Var2.m1();
            kxw0Var.z = z;
            wvw0 wvw0Var = ((kxw0) this.b).e;
            kxw0.e(wvw0Var);
            wvw0Var.m1();
            Boolean boolValueOf = wvw0Var.q1().contains("measurement_enabled_from_api") ? Boolean.valueOf(wvw0Var.q1().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                C1(Boolean.valueOf(z), false);
            }
        }
    }

    @Override // a.etw0
    public final boolean o1() {
        return false;
    }

    public final void p1(Bundle bundle, String str, String str2) {
        long jElapsedRealtime;
        kxw0 kxw0Var = (kxw0) this.b;
        kxw0Var.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (kxw0Var.d.x1(null, btw0.e1)) {
            kxw0Var.k.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        q1(str, str2, bundle, true, true, jCurrentTimeMillis, jElapsedRealtime);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (r5 > 500) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        if (r6 > 500) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q1(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, boolean r23, boolean r24, long r25, long r27) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b1x0.q1(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long, long):void");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0268  */
    /* JADX WARN: Code duplicated, block: B:102:0x026d  */
    /* JADX WARN: Code duplicated, block: B:105:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:107:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:110:0x0318  */
    /* JADX WARN: Code duplicated, block: B:112:0x0333  */
    /* JADX WARN: Code duplicated, block: B:115:0x0352  */
    /* JADX WARN: Code duplicated, block: B:117:0x0364  */
    /* JADX WARN: Code duplicated, block: B:120:0x036f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0372  */
    /* JADX WARN: Code duplicated, block: B:125:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:126:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:128:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:137:0x0414  */
    /* JADX WARN: Code duplicated, block: B:139:0x0434  */
    /* JADX WARN: Code duplicated, block: B:140:0x0447  */
    /* JADX WARN: Code duplicated, block: B:146:0x0460  */
    /* JADX WARN: Code duplicated, block: B:158:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:162:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:166:0x04da A[Catch: NumberFormatException -> 0x04df, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x04df, blocks: (B:164:0x04ce, B:166:0x04da), top: B:198:0x04ce }] */
    /* JADX WARN: Code duplicated, block: B:168:0x04df  */
    /* JADX WARN: Code duplicated, block: B:174:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:180:0x0513  */
    /* JADX WARN: Code duplicated, block: B:183:0x0522  */
    /* JADX WARN: Code duplicated, block: B:185:0x0527  */
    /* JADX WARN: Code duplicated, block: B:188:0x0535  */
    /* JADX WARN: Code duplicated, block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:81:0x0201  */
    /* JADX WARN: Code duplicated, block: B:82:0x0204  */
    /* JADX WARN: Code duplicated, block: B:85:0x021b  */
    /* JADX WARN: Code duplicated, block: B:86:0x021e  */
    /* JADX WARN: Code duplicated, block: B:89:0x022c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0231  */
    /* JADX WARN: Code duplicated, block: B:93:0x0240  */
    /* JADX WARN: Code duplicated, block: B:94:0x0245  */
    /* JADX WARN: Code duplicated, block: B:97:0x0254  */
    /* JADX WARN: Code duplicated, block: B:98:0x0259  */
    /* JADX WARN: Instruction removed from duplicated block: B:126:0x03cc, please report this as an issue */
    public final void r1() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        zz2 zz2VarA;
        eet0 it;
        ddw0 ddw0Var;
        kxw0 kxw0Var;
        boolean z;
        x4x0 x4x0Var;
        ddw0 ddw0Var2;
        ddw0 ddw0Var3;
        ddw0 ddw0Var4;
        ddw0 ddw0Var5;
        Object obj;
        boolean z2;
        Object obj2;
        boolean z3;
        Object obj3;
        Object obj4;
        Object obj5;
        int iZza;
        int iZza2;
        int iZza3;
        int iZza4;
        int i6;
        String str;
        String str2;
        int i7;
        String str3;
        int i8;
        String str4;
        String str5;
        String str6;
        wcf0 wcf0VarE;
        String string;
        HashMap map;
        int i9;
        int i10;
        x4x0 x4x0Var2;
        String[] strArrSplit;
        String string2;
        String strA;
        Bundle bundleB;
        b1x0 b1x0Var;
        HashMap map2;
        String str7;
        Bundle bundleB2;
        Bundle bundleB3;
        String str8;
        HashMap map3;
        String str9;
        StringBuilder sb;
        int i11;
        int iC;
        int i12;
        boolean zEquals;
        int i13;
        String str10;
        ddw0 ddw0Var6;
        m1();
        kxw0 kxw0Var2 = (kxw0) this.b;
        uuw0 uuw0Var = kxw0Var2.f;
        uuw0 uuw0Var2 = kxw0Var2.f;
        kxw0.g(uuw0Var);
        uuw0Var.n.a("Handle tcf update.");
        wvw0 wvw0Var = kxw0Var2.e;
        kxw0.e(wvw0Var);
        SharedPreferences sharedPreferencesR1 = wvw0Var.r1();
        rcf0 rcf0Var = c5x0.f3794a;
        cdw0 cdw0Var = cdw0.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        z4x0 z4x0Var = z4x0.f43793a;
        cdw0 cdw0Var2 = cdw0.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
        z4x0 z4x0Var2 = z4x0.b;
        cdw0 cdw0Var3 = cdw0.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        cdw0 cdw0Var4 = cdw0.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        cdw0 cdw0Var5 = cdw0.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        wcf0 wcf0VarD = wcf0.d(7, new Object[]{cdw0Var, z4x0Var, cdw0Var2, z4x0Var2, cdw0Var3, z4x0Var, cdw0Var4, z4x0Var, cdw0Var5, z4x0Var2, cdw0.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, z4x0Var2, cdw0.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, z4x0Var2}, null);
        int i14 = f4x.c;
        r5k0 r5k0Var = new r5k0("CH");
        char[] cArr = new char[5];
        boolean zContains = sharedPreferencesR1.contains("IABTCF_TCString");
        try {
            i = sharedPreferencesR1.getInt("IABTCF_CmpSdkID", -1);
        } catch (ClassCastException unused) {
            i = -1;
        }
        try {
            try {
                try {
                    try {
                        i2 = sharedPreferencesR1.getInt("IABTCF_PolicyVersion", -1);
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            ddw0Var = ddw0.PURPOSE_RESTRICTION_UNDEFINED;
                            if (!zHasNext) {
                                break;
                            }
                            cdw0 cdw0Var6 = (cdw0) it.next();
                            boolean z4 = zContains;
                            int iZza5 = cdw0Var6.zza();
                            int i15 = i;
                            r5k0 r5k0Var2 = r5k0Var;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(iZza5).length() + 28);
                            sb2.append("IABTCF_PublisherRestrictions");
                            sb2.append(iZza5);
                            String strA2 = c5x0.a(sharedPreferencesR1, sb2.toString());
                            if (TextUtils.isEmpty(strA2) || strA2.length() < 755) {
                                ddw0Var6 = ddw0Var;
                            } else {
                                int iDigit = Character.digit(strA2.charAt(754), 10);
                                ddw0Var6 = ddw0.PURPOSE_RESTRICTION_NOT_ALLOWED;
                                if (iDigit >= 0 && iDigit <= ddw0.values().length && iDigit != 0) {
                                    if (iDigit == 1) {
                                        ddw0Var = ddw0.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                                    } else if (iDigit == 2) {
                                        ddw0Var = ddw0.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                                    }
                                    ddw0Var6 = ddw0Var;
                                }
                            }
                            zz2VarA.A(cdw0Var6, ddw0Var6);
                            zContains = z4;
                            i = i15;
                            r5k0Var = r5k0Var2;
                        }
                    } catch (ClassCastException unused2) {
                        i2 = -1;
                    }
                    i5 = sharedPreferencesR1.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
                } catch (ClassCastException unused3) {
                    i5 = -1;
                }
                i3 = sharedPreferencesR1.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused4) {
                i3 = -1;
            }
            i4 = sharedPreferencesR1.getInt("IABTCF_PurposeOneTreatment", -1);
        } catch (ClassCastException unused5) {
            i4 = -1;
        }
        int i16 = i2;
        String strA3 = c5x0.a(sharedPreferencesR1, "IABTCF_PublisherCC");
        zz2VarA = wcf0.a();
        it = wcf0VarD.keySet().iterator();
        boolean z5 = zContains;
        int i17 = i;
        r5k0 r5k0Var3 = r5k0Var;
        wcf0 wcf0VarE2 = zz2VarA.e(true);
        String strA4 = c5x0.a(sharedPreferencesR1, "IABTCF_PurposeConsents");
        String strA5 = c5x0.a(sharedPreferencesR1, "IABTCF_VendorConsents");
        boolean z6 = !TextUtils.isEmpty(strA5) && strA5.length() >= 755 && strA5.charAt(754) == '1';
        String strA6 = c5x0.a(sharedPreferencesR1, "IABTCF_PurposeLegitimateInterests");
        String strA7 = c5x0.a(sharedPreferencesR1, "IABTCF_VendorLegitimateInterests");
        if (!TextUtils.isEmpty(strA7)) {
            kxw0Var = kxw0Var2;
            if (strA7.length() >= 755 && strA7.charAt(754) == '1') {
                z = true;
            }
            cArr[0] = '2';
            if (z5) {
                ddw0Var2 = (ddw0) wcf0VarE2.get(cdw0Var);
                ddw0Var3 = (ddw0) wcf0VarE2.get(cdw0Var3);
                ddw0Var4 = (ddw0) wcf0VarE2.get(cdw0Var4);
                ddw0Var5 = (ddw0) wcf0VarE2.get(cdw0Var5);
                zz2 zz2VarA2 = wcf0.a();
                zz2VarA2.A("Version", "2");
                if (true != z6) {
                    obj = "0";
                } else {
                    obj = "1";
                }
                z2 = z6;
                zz2VarA2.A("VendorConsent", obj);
                if (true != z) {
                    obj2 = "0";
                } else {
                    obj2 = "1";
                }
                z3 = z;
                zz2VarA2.A("VendorLegitimateInterest", obj2);
                if (i3 != 1) {
                    obj3 = "0";
                } else {
                    obj3 = "1";
                }
                zz2VarA2.A("gdprApplies", obj3);
                if (i5 != 1) {
                    obj4 = "0";
                } else {
                    obj4 = "1";
                }
                zz2VarA2.A("EnableAdvertiserConsentMode", obj4);
                zz2VarA2.A("PolicyVersion", String.valueOf(i16));
                zz2VarA2.A("CmpSdkID", String.valueOf(i17));
                if (i4 != 1) {
                    obj5 = "0";
                } else {
                    obj5 = "1";
                }
                zz2VarA2.A("PurposeOneTreatment", obj5);
                zz2VarA2.A("PublisherCC", strA3);
                if (ddw0Var2 != null) {
                    iZza = ddw0Var2.zza();
                } else {
                    iZza = ddw0Var.zza();
                }
                zz2VarA2.A("PublisherRestrictions1", String.valueOf(iZza));
                if (ddw0Var3 != null) {
                    iZza2 = ddw0Var3.zza();
                } else {
                    iZza2 = ddw0Var.zza();
                }
                zz2VarA2.A("PublisherRestrictions3", String.valueOf(iZza2));
                if (ddw0Var4 != null) {
                    iZza3 = ddw0Var4.zza();
                } else {
                    iZza3 = ddw0Var.zza();
                }
                zz2VarA2.A("PublisherRestrictions4", String.valueOf(iZza3));
                if (ddw0Var5 != null) {
                    iZza4 = ddw0Var5.zza();
                } else {
                    iZza4 = ddw0Var.zza();
                }
                zz2VarA2.A("PublisherRestrictions7", String.valueOf(iZza4));
                i6 = i3;
                zz2VarA2.B(wcf0.d(4, new Object[]{"Purpose1", c5x0.d(cdw0Var, strA4, strA6), "Purpose3", c5x0.d(cdw0Var3, strA4, strA6), "Purpose4", c5x0.d(cdw0Var4, strA4, strA6), "Purpose7", c5x0.d(cdw0Var5, strA4, strA6)}, null).entrySet());
                str = "0";
                str2 = "1";
                i7 = i4;
                if (true != c5x0.b(cdw0Var, wcf0VarD, wcf0VarE2, r5k0Var3, cArr, i5, i6, i7, strA3, strA4, strA6, z2, z3)) {
                    str3 = str;
                } else {
                    str3 = str2;
                }
                i8 = i5;
                if (true != c5x0.b(cdw0Var3, wcf0VarD, wcf0VarE2, r5k0Var3, cArr, i8, i6, i7, strA3, strA4, strA6, z2, z3)) {
                    str4 = str;
                } else {
                    str4 = str2;
                }
                if (true != c5x0.b(cdw0Var4, wcf0VarD, wcf0VarE2, r5k0Var3, cArr, i8, i6, i7, strA3, strA4, strA6, z2, z3)) {
                    str5 = str;
                } else {
                    str5 = str2;
                }
                if (true != c5x0.b(cdw0Var5, wcf0VarD, wcf0VarE2, r5k0Var3, cArr, i8, i6, i7, strA3, strA4, strA6, z2, z3)) {
                    str6 = str;
                } else {
                    str6 = str2;
                }
                zz2VarA2.B(wcf0.d(5, new Object[]{"AuthorizePurpose1", str3, "AuthorizePurpose3", str4, "AuthorizePurpose4", str5, "AuthorizePurpose7", str6, "PurposeDiagnostics", new String(cArr)}, null).entrySet());
                wcf0VarE = zz2VarA2.e(true);
            } else {
                wcf0VarE = wcf0.g;
                str2 = "1";
                str = "0";
            }
            x4x0Var = new x4x0(wcf0VarE);
            kxw0.g(uuw0Var2);
            uuw0Var2.o.b(x4x0Var, "Tcf preferences read");
            wvw0Var.m1();
            string = wvw0Var.q1().getString("stored_tcf_param", "");
            map = new HashMap();
            if (TextUtils.isEmpty(string)) {
                x4x0Var2 = new x4x0(map);
                i10 = 2;
            } else {
                for (String str11 : string.split(Separators.SEMICOLON)) {
                    strArrSplit = str11.split("=");
                    if (strArrSplit.length < 2 && c5x0.f3794a.contains(strArrSplit[0])) {
                        map.put(strArrSplit[0], strArrSplit[1]);
                    }
                }
                i10 = 2;
                x4x0Var2 = new x4x0(map);
            }
            wvw0Var.m1();
            string2 = wvw0Var.q1().getString("stored_tcf_param", "");
            strA = x4x0Var.a();
            if (strA.equals(string2)) {
            }
            SharedPreferences.Editor editorEdit = wvw0Var.q1().edit();
            editorEdit.putString("stored_tcf_param", strA);
            editorEdit.apply();
            bundleB = x4x0Var.b();
            kxw0.g(uuw0Var2);
            uuw0Var2.o.b(bundleB, "Consent generated from Tcf");
            if (bundleB != Bundle.EMPTY) {
                kxw0Var.k.getClass();
                b1x0Var = this;
                b1x0Var.F1(bundleB, -30, System.currentTimeMillis());
            } else {
                b1x0Var = this;
            }
            Bundle bundle = new Bundle();
            map2 = x4x0Var2.f40288a;
            if (map2.isEmpty() && ((String) map2.get("Version")) == null) {
                str7 = str2;
            } else {
                str7 = str;
            }
            bundleB2 = x4x0Var.b();
            bundleB3 = x4x0Var2.b();
            if (bundleB2.size() != bundleB3.size() && Objects.equals(bundleB2.getString("ad_storage"), bundleB3.getString("ad_storage")) && Objects.equals(bundleB2.getString("ad_personalization"), bundleB3.getString("ad_personalization")) && Objects.equals(bundleB2.getString("ad_user_data"), bundleB3.getString("ad_user_data"))) {
                str8 = str;
            } else {
                str8 = str2;
            }
            bundle.putString("_tcfm", str7.concat(str8));
            map3 = x4x0Var.f40288a;
            str9 = (String) map3.get("PurposeDiagnostics");
            if (TextUtils.isEmpty(str9)) {
                str9 = "200000";
            }
            bundle.putString("_tcfd2", str9);
            sb = new StringBuilder(str2);
            try {
                str10 = (String) map3.get("CmpSdkID");
                if (TextUtils.isEmpty(str10)) {
                    i11 = -1;
                } else {
                    i11 = Integer.parseInt(str10);
                }
            } catch (NumberFormatException unused6) {
            }
            if (i11 >= 0 || i11 > 4095) {
                sb.append("00");
            } else {
                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i11 >> 6));
                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i11 & 63));
            }
            iC = x4x0Var.c();
            if (iC >= 0 || iC > 63) {
                sb.append(str);
            } else {
                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iC));
            }
            if (true != str2.equals(map3.get("gdprApplies"))) {
                i12 = 0;
            } else {
                i12 = i10;
            }
            zEquals = str2.equals(map3.get("EnableAdvertiserConsentMode"));
            i13 = i12 | 4;
            if (zEquals) {
                i13 = i12 | 12;
            }
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i13));
            bundle.putString("_tcfd", sb.toString());
            b1x0Var.s1(bundle, "auto", "_tcf");
        }
        kxw0Var = kxw0Var2;
        z = false;
        cArr[0] = '2';
        if (z5) {
            wcf0VarE = wcf0.g;
            str2 = "1";
            str = "0";
        } else {
            ddw0Var2 = (ddw0) wcf0VarE2.get(cdw0Var);
            ddw0Var3 = (ddw0) wcf0VarE2.get(cdw0Var3);
            ddw0Var4 = (ddw0) wcf0VarE2.get(cdw0Var4);
            ddw0Var5 = (ddw0) wcf0VarE2.get(cdw0Var5);
            zz2 zz2VarA3 = wcf0.a();
            zz2VarA3.A("Version", "2");
            if (true != z6) {
                obj = "0";
            } else {
                obj = "1";
            }
            z2 = z6;
            zz2VarA3.A("VendorConsent", obj);
            if (true != z) {
                obj2 = "0";
            } else {
                obj2 = "1";
            }
            z3 = z;
            zz2VarA3.A("VendorLegitimateInterest", obj2);
            if (i3 != 1) {
                obj3 = "0";
            } else {
                obj3 = "1";
            }
            zz2VarA3.A("gdprApplies", obj3);
            if (i5 != 1) {
                obj4 = "0";
            } else {
                obj4 = "1";
            }
            zz2VarA3.A("EnableAdvertiserConsentMode", obj4);
            zz2VarA3.A("PolicyVersion", String.valueOf(i16));
            zz2VarA3.A("CmpSdkID", String.valueOf(i17));
            if (i4 != 1) {
                obj5 = "0";
            } else {
                obj5 = "1";
            }
            zz2VarA3.A("PurposeOneTreatment", obj5);
            zz2VarA3.A("PublisherCC", strA3);
            if (ddw0Var2 != null) {
                iZza = ddw0Var2.zza();
            } else {
                iZza = ddw0Var.zza();
            }
            zz2VarA3.A("PublisherRestrictions1", String.valueOf(iZza));
            if (ddw0Var3 != null) {
                iZza2 = ddw0Var3.zza();
            } else {
                iZza2 = ddw0Var.zza();
            }
            zz2VarA3.A("PublisherRestrictions3", String.valueOf(iZza2));
            if (ddw0Var4 != null) {
                iZza3 = ddw0Var4.zza();
            } else {
                iZza3 = ddw0Var.zza();
            }
            zz2VarA3.A("PublisherRestrictions4", String.valueOf(iZza3));
            if (ddw0Var5 != null) {
                iZza4 = ddw0Var5.zza();
            } else {
                iZza4 = ddw0Var.zza();
            }
            zz2VarA3.A("PublisherRestrictions7", String.valueOf(iZza4));
            i6 = i3;
            zz2VarA3.B(wcf0.d(4, new Object[]{"Purpose1", c5x0.d(cdw0Var, strA4, strA6), "Purpose3", c5x0.d(cdw0Var3, strA4, strA6), "Purpose4", c5x0.d(cdw0Var4, strA4, strA6), "Purpose7", c5x0.d(cdw0Var5, strA4, strA6)}, null).entrySet());
            str = "0";
            str2 = "1";
            i7 = i4;
            if (true != c5x0.b(cdw0Var, wcf0VarD, wcf0VarE2, r5k0Var3, cArr, i5, i6, i7, strA3, strA4, strA6, z2, z3)) {
                str3 = str;
            } else {
                str3 = str2;
            }
            i8 = i5;
            if (true != c5x0.b(cdw0Var3, wcf0VarD, wcf0VarE2, r5k0Var3, cArr, i8, i6, i7, strA3, strA4, strA6, z2, z3)) {
                str4 = str;
            } else {
                str4 = str2;
            }
            if (true != c5x0.b(cdw0Var4, wcf0VarD, wcf0VarE2, r5k0Var3, cArr, i8, i6, i7, strA3, strA4, strA6, z2, z3)) {
                str5 = str;
            } else {
                str5 = str2;
            }
            if (true != c5x0.b(cdw0Var5, wcf0VarD, wcf0VarE2, r5k0Var3, cArr, i8, i6, i7, strA3, strA4, strA6, z2, z3)) {
                str6 = str;
            } else {
                str6 = str2;
            }
            zz2VarA3.B(wcf0.d(5, new Object[]{"AuthorizePurpose1", str3, "AuthorizePurpose3", str4, "AuthorizePurpose4", str5, "AuthorizePurpose7", str6, "PurposeDiagnostics", new String(cArr)}, null).entrySet());
            wcf0VarE = zz2VarA3.e(true);
        }
        x4x0Var = new x4x0(wcf0VarE);
        kxw0.g(uuw0Var2);
        uuw0Var2.o.b(x4x0Var, "Tcf preferences read");
        wvw0Var.m1();
        string = wvw0Var.q1().getString("stored_tcf_param", "");
        map = new HashMap();
        if (TextUtils.isEmpty(string)) {
            x4x0Var2 = new x4x0(map);
            i10 = 2;
        } else {
            while (i9 < r10) {
                strArrSplit = str11.split("=");
                if (strArrSplit.length < 2) {
                }
            }
            i10 = 2;
            x4x0Var2 = new x4x0(map);
        }
        wvw0Var.m1();
        string2 = wvw0Var.q1().getString("stored_tcf_param", "");
        strA = x4x0Var.a();
        if (strA.equals(string2)) {
            SharedPreferences.Editor editorEdit2 = wvw0Var.q1().edit();
            editorEdit2.putString("stored_tcf_param", strA);
            editorEdit2.apply();
            bundleB = x4x0Var.b();
            kxw0.g(uuw0Var2);
            uuw0Var2.o.b(bundleB, "Consent generated from Tcf");
            if (bundleB != Bundle.EMPTY) {
                kxw0Var.k.getClass();
                b1x0Var = this;
                b1x0Var.F1(bundleB, -30, System.currentTimeMillis());
            } else {
                b1x0Var = this;
            }
            Bundle bundle2 = new Bundle();
            map2 = x4x0Var2.f40288a;
            if (map2.isEmpty()) {
                str7 = str;
            } else {
                str7 = str;
            }
            bundleB2 = x4x0Var.b();
            bundleB3 = x4x0Var2.b();
            if (bundleB2.size() != bundleB3.size()) {
                str8 = str2;
            } else {
                str8 = str;
            }
            bundle2.putString("_tcfm", str7.concat(str8));
            map3 = x4x0Var.f40288a;
            str9 = (String) map3.get("PurposeDiagnostics");
            if (TextUtils.isEmpty(str9)) {
                str9 = "200000";
            }
            bundle2.putString("_tcfd2", str9);
            sb = new StringBuilder(str2);
            str10 = (String) map3.get("CmpSdkID");
            if (TextUtils.isEmpty(str10)) {
                i11 = Integer.parseInt(str10);
            } else {
                i11 = -1;
            }
            if (i11 >= 0) {
                sb.append("00");
            } else {
                sb.append("00");
            }
            iC = x4x0Var.c();
            if (iC >= 0) {
                sb.append(str);
            } else {
                sb.append(str);
            }
            if (true != str2.equals(map3.get("gdprApplies"))) {
                i12 = 0;
            } else {
                i12 = i10;
            }
            zEquals = str2.equals(map3.get("EnableAdvertiserConsentMode"));
            i13 = i12 | 4;
            if (zEquals) {
                i13 = i12 | 12;
            }
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i13));
            bundle2.putString("_tcfd", sb.toString());
            b1x0Var.s1(bundle2, "auto", "_tcf");
        }
    }

    public final void s1(Bundle bundle, String str, String str2) {
        long jElapsedRealtime;
        m1();
        kxw0 kxw0Var = (kxw0) this.b;
        kxw0Var.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (kxw0Var.d.x1(null, btw0.e1)) {
            kxw0Var.k.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        t1(jCurrentTimeMillis, jElapsedRealtime, bundle, str, str2);
    }

    public final void t1(long j, long j2, Bundle bundle, String str, String str2) {
        m1();
        boolean z = true;
        if (this.e != null && !x6x0.Q1(str2)) {
            z = false;
        }
        u1(str, str2, j, j2, bundle, true, z, true);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x013a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0152  */
    /* JADX WARN: Code duplicated, block: B:61:0x0157  */
    public final void u1(String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) {
        String str3;
        wvw0 wvw0Var;
        zlt0 zlt0Var;
        boolean z4;
        c2x0 c2x0Var;
        long j3;
        boolean zA;
        int i;
        w4x0 w4x0Var;
        long j4;
        int i2;
        long j5;
        w4x0 w4x0Var2;
        boolean zS1;
        ArrayList arrayList;
        Bundle[] bundleArr;
        int i3;
        int length;
        String str4 = str;
        s0x.E(str4);
        s0x.H(bundle);
        m1();
        n1();
        kxw0 kxw0Var = (kxw0) this.b;
        boolean zA2 = kxw0Var.a();
        w4x0 w4x0Var3 = kxw0Var.h;
        bkw0 bkw0Var = kxw0Var.d;
        Context context = kxw0Var.f19080a;
        x6x0 x6x0Var = kxw0Var.i;
        uuw0 uuw0Var = kxw0Var.f;
        if (!zA2) {
            kxw0.g(uuw0Var);
            uuw0Var.n.a("Event not sent since app measurement is disabled");
            return;
        }
        List list = kxw0Var.k().l;
        if (list != null && !list.contains(str2)) {
            kxw0.g(uuw0Var);
            uuw0Var.n.c(str2, str4, "Dropping non-safelisted event. event name, origin");
            return;
        }
        if (!this.g) {
            this.g = true;
            try {
                try {
                    (!kxw0Var.b ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e) {
                    kxw0.g(uuw0Var);
                    uuw0Var.j.b(e, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                kxw0.g(uuw0Var);
                uuw0Var.m.a("Tag Manager is not found and thus will not be used");
            }
        }
        iuw0 iuw0Var = kxw0Var.j;
        wvw0 wvw0Var2 = kxw0Var.e;
        lwf lwfVar = kxw0Var.k;
        if (!bkw0Var.x1(null, btw0.Z0) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            lwfVar.getClass();
            str3 = null;
            w1(System.currentTimeMillis(), string, "auto", "_lgclid");
        } else {
            str3 = null;
        }
        if (!z || x6x0.k[0].equals(str2)) {
            wvw0Var = wvw0Var2;
        } else {
            kxw0.e(x6x0Var);
            kxw0.e(wvw0Var2);
            wvw0Var = wvw0Var2;
            x6x0Var.z1(bundle, wvw0Var.z.s());
        }
        zlt0 zlt0Var2 = this.w;
        if (z3 || "_iap".equals(str2)) {
            zlt0Var = zlt0Var2;
        } else {
            kxw0.e(x6x0Var);
            int i4 = 2;
            if (x6x0Var.p2("event", str2)) {
                zlt0Var = zlt0Var2;
                if (x6x0Var.r2("event", cwr0.j, ((kxw0) x6x0Var.b).d.x1(str3, btw0.f1) ? cwr0.l : cwr0.k, str2)) {
                    i3 = 40;
                    if (x6x0Var.s2(40, "event", str2)) {
                        i4 = 0;
                    }
                } else {
                    i4 = 13;
                }
                if (i4 != 0) {
                    kxw0.g(uuw0Var);
                    uuw0Var.i.b(iuw0Var.a(str2), "Invalid public event name. Event will not be logged (FE)");
                    kxw0.e(x6x0Var);
                    String strT1 = x6x0.t1(str2, i3, true);
                    if (str2 != null) {
                        length = str2.length();
                    } else {
                        length = 0;
                    }
                    x6x0.E1(zlt0Var, null, i4, "_ev", strT1, length);
                    return;
                }
            } else {
                zlt0Var = zlt0Var2;
            }
            i3 = 40;
            if (i4 != 0) {
                kxw0.g(uuw0Var);
                uuw0Var.i.b(iuw0Var.a(str2), "Invalid public event name. Event will not be logged (FE)");
                kxw0.e(x6x0Var);
                String strT2 = x6x0.t1(str2, i3, true);
                if (str2 != null) {
                    length = str2.length();
                } else {
                    length = 0;
                }
                x6x0.E1(zlt0Var, null, i4, "_ev", strT2, length);
                return;
            }
        }
        c2x0 c2x0Var2 = kxw0Var.l;
        kxw0.f(c2x0Var2);
        r1x0 r1x0VarP1 = c2x0Var2.p1(false);
        if (r1x0VarP1 != null && !bundle.containsKey("_sc")) {
            r1x0VarP1.d = true;
        }
        x6x0.i2(r1x0VarP1, bundle, z && !z3);
        boolean zEquals = "am".equals(str4);
        boolean zQ1 = x6x0.Q1(str2);
        if (!z || this.e == null || zQ1) {
            z4 = zEquals;
        } else {
            if (!zEquals) {
                kxw0.g(uuw0Var);
                uuw0Var.n.c(iuw0Var.a(str2), iuw0Var.e(bundle), "Passing event to registered event handler (FE)");
                s0x.H(this.e);
                hcp0 hcp0Var = this.e;
                hcp0Var.getClass();
                try {
                    ((rpw0) hcp0Var.b).d(str4, str2, bundle, j);
                    return;
                } catch (RemoteException e2) {
                    kxw0 kxw0Var2 = ((AppMeasurementDynamiteService) hcp0Var.c).f45539a;
                    if (kxw0Var2 != null) {
                        uuw0 uuw0Var2 = kxw0Var2.f;
                        kxw0.g(uuw0Var2);
                        uuw0Var2.j.b(e2, "Event interceptor threw exception");
                        return;
                    }
                    return;
                }
            }
            z4 = true;
        }
        if (kxw0Var.c()) {
            kxw0.e(x6x0Var);
            kxw0 kxw0Var3 = (kxw0) x6x0Var.b;
            int iT2 = x6x0Var.t2(str2);
            if (iT2 != 0) {
                kxw0.g(uuw0Var);
                uuw0Var.i.b(iuw0Var.a(str2), "Invalid event name. Event will not be logged (FE)");
                String strT3 = x6x0.t1(str2, 40, true);
                int length2 = str2 != null ? str2.length() : 0;
                kxw0.e(x6x0Var);
                x6x0.E1(zlt0Var, null, iT2, "_ev", strT3, length2);
                return;
            }
            Bundle bundleW1 = x6x0Var.w1(str2, bundle, n4c.O("_o", "_sn", "_sc", "_si"), z3);
            s0x.H(bundleW1);
            kxw0.f(c2x0Var2);
            String str5 = "_o";
            if (c2x0Var2.p1(false) == null || !"_ae".equals(str2)) {
                c2x0Var = c2x0Var2;
                j3 = 0;
            } else {
                kxw0.f(w4x0Var3);
                dr8 dr8Var = w4x0Var3.g;
                ((kxw0) ((w4x0) dr8Var.d).b).k.getClass();
                j3 = 0;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                c2x0Var = c2x0Var2;
                long j6 = jElapsedRealtime - dr8Var.b;
                dr8Var.b = jElapsedRealtime;
                if (j6 > 0) {
                    x6x0Var.Y1(bundleW1, j6);
                }
            }
            if (!"auto".equals(str4) && "_ssr".equals(str2)) {
                String string2 = bundleW1.getString("_ffr");
                int i5 = ktm0.f18874a;
                if (string2 == null || string2.trim().isEmpty()) {
                    string2 = null;
                } else if (string2 != null) {
                    string2 = string2.trim();
                }
                wvw0 wvw0Var3 = kxw0Var3.e;
                kxw0.e(wvw0Var3);
                if (Objects.equals(string2, wvw0Var3.w.t())) {
                    uuw0 uuw0Var3 = kxw0Var3.f;
                    kxw0.g(uuw0Var3);
                    uuw0Var3.n.a("Not logging duplicate session_start_with_rollout event");
                    return;
                } else {
                    wvw0 wvw0Var4 = kxw0Var3.e;
                    kxw0.e(wvw0Var4);
                    wvw0Var4.w.u(string2);
                }
            } else if ("_ae".equals(str2)) {
                wvw0 wvw0Var5 = kxw0Var3.e;
                kxw0.e(wvw0Var5);
                String strT = wvw0Var5.w.t();
                if (!TextUtils.isEmpty(strT)) {
                    bundleW1.putString("_ffr", strT);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(bundleW1);
            if (bkw0Var.x1(null, btw0.S0)) {
                kxw0.f(w4x0Var3);
                w4x0Var3.m1();
                zA = w4x0Var3.e;
            } else {
                kxw0.e(wvw0Var);
                zA = wvw0Var.t.a();
            }
            kxw0.e(wvw0Var);
            if (wvw0Var.q.a() > j3) {
                w4x0Var = w4x0Var3;
                j5 = j;
                if (wvw0Var.v1(j5) && zA) {
                    kxw0.g(uuw0Var);
                    uuw0Var.o.a("Current session is expired, remove the session number, ID, and engagement time");
                    lwfVar.getClass();
                    i = 1;
                    i2 = 0;
                    w1(System.currentTimeMillis(), null, "auto", "_sid");
                    w1(System.currentTimeMillis(), null, "auto", "_sno");
                    w1(System.currentTimeMillis(), null, "auto", "_se");
                    j4 = j3;
                    wvw0Var.r.b(j4);
                } else {
                    i = 1;
                    j4 = j3;
                    i2 = 0;
                }
            } else {
                i = 1;
                w4x0Var = w4x0Var3;
                j4 = j3;
                i2 = 0;
                j5 = j;
            }
            if (bundleW1.getLong("extend_session", j4) == 1) {
                kxw0.g(uuw0Var);
                uuw0Var.o.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                kxw0.f(w4x0Var);
                w4x0Var2 = w4x0Var;
                w4x0Var2.f.g(j5, j2);
            } else {
                w4x0Var2 = w4x0Var;
            }
            ArrayList arrayList3 = new ArrayList(bundleW1.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            int i6 = i2;
            while (i6 < size) {
                String str6 = (String) arrayList3.get(i6);
                if (str6 != null) {
                    kxw0.e(x6x0Var);
                    Object obj = bundleW1.get(str6);
                    arrayList = arrayList3;
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[i];
                        bundleArr[i2] = (Bundle) obj;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList4 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleW1.putParcelableArray(str6, bundleArr);
                    }
                } else {
                    arrayList = arrayList3;
                }
                i6++;
                arrayList3 = arrayList;
                i = 1;
            }
            int i7 = i2;
            while (i7 < arrayList2.size()) {
                Bundle bundleS1 = (Bundle) arrayList2.get(i7);
                String str7 = i7 != 0 ? "_ep" : str2;
                String str8 = str5;
                bundleS1.putString(str8, str4);
                if (z2) {
                    bundleS1 = x6x0Var.S1(bundleS1);
                }
                Bundle bundle2 = bundleS1;
                zzbh zzbhVar = new zzbh(str7, new zzbf(bundleS1), str4, j5, j2);
                a4x0 a4x0VarI = kxw0Var.i();
                a4x0VarI.getClass();
                a4x0VarI.m1();
                a4x0VarI.n1();
                a4x0VarI.x1();
                euw0 euw0VarH = ((kxw0) a4x0VarI.b).h();
                euw0VarH.getClass();
                Parcel parcelObtain = Parcel.obtain();
                lgw0.a(zzbhVar, parcelObtain, i2);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                if (bArrMarshall.length > 131072) {
                    uuw0 uuw0Var4 = ((kxw0) euw0VarH.b).f;
                    kxw0.g(uuw0Var4);
                    uuw0Var4.h.a("Event is too long for local database. Sending event directly to service");
                    zS1 = false;
                } else {
                    zS1 = euw0VarH.s1(bArrMarshall, 0);
                }
                a4x0VarI.z1(new ftw0(a4x0VarI, a4x0VarI.B1(true), zS1, (AbstractSafeParcelable) zzbhVar, (byte) 2));
                if (!z4) {
                    Iterator it = this.f.iterator();
                    while (it.hasNext()) {
                        ((azw0) it.next()).a(str, str2, new Bundle(bundle2), j);
                    }
                }
                i7++;
                str4 = str;
                j5 = j;
                str5 = str8;
                i2 = 0;
            }
            kxw0.f(c2x0Var);
            if (c2x0Var.p1(false) == null || !"_ae".equals(str2)) {
                return;
            }
            kxw0.f(w4x0Var2);
            lwfVar.getClass();
            w4x0Var2.g.r(SystemClock.elapsedRealtime(), true, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final void v1(String str, String str2, Object obj, boolean z, long j) {
        int iV2;
        int length;
        kxw0 kxw0Var = (kxw0) this.b;
        if (z) {
            x6x0 x6x0Var = kxw0Var.i;
            kxw0.e(x6x0Var);
            iV2 = x6x0Var.v2(str2);
        } else {
            x6x0 x6x0Var2 = kxw0Var.i;
            kxw0.e(x6x0Var2);
            if (!x6x0Var2.p2("user property", str2)) {
                iV2 = 6;
            } else if (x6x0Var2.r2("user property", epv0.p, null, str2)) {
                bkw0 bkw0Var = ((kxw0) x6x0Var2.b).d;
                if (x6x0Var2.s2(24, "user property", str2)) {
                    iV2 = 0;
                } else {
                    iV2 = 6;
                }
            } else {
                iV2 = 15;
            }
        }
        zlt0 zlt0Var = this.w;
        if (iV2 != 0) {
            kxw0.e(kxw0Var.i);
            String strT1 = x6x0.t1(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            kxw0.e(kxw0Var.i);
            x6x0.E1(zlt0Var, null, iV2, "_ev", strT1, length);
            return;
        }
        String str3 = str == null ? Payload.TYPE_APP : str;
        if (obj == null) {
            fxw0 fxw0Var = kxw0Var.g;
            kxw0.g(fxw0Var);
            fxw0Var.v1(new bgr0(this, str3, str2, null, j, (byte) 2));
            return;
        }
        x6x0 x6x0Var3 = kxw0Var.i;
        x6x0 x6x0Var4 = kxw0Var.i;
        kxw0.e(x6x0Var3);
        int iB1 = x6x0Var3.B1(obj, str2);
        if (iB1 != 0) {
            kxw0.e(x6x0Var4);
            String strT2 = x6x0.t1(str2, 24, true);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            kxw0.e(x6x0Var4);
            x6x0.E1(zlt0Var, null, iB1, "_ev", strT2, length);
            return;
        }
        kxw0.e(x6x0Var4);
        Object objC1 = x6x0Var4.C1(obj, str2);
        if (objC1 != null) {
            fxw0 fxw0Var2 = kxw0Var.g;
            kxw0.g(fxw0Var2);
            fxw0Var2.v1(new bgr0(this, str3, str2, objC1, j, (byte) 2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    public final void w1(long j, Object obj, String str, String str2) {
        String str3;
        boolean zS1;
        Object objValueOf = obj;
        kxw0 kxw0Var = (kxw0) this.b;
        s0x.E(str);
        s0x.E(str2);
        m1();
        n1();
        if ("allow_personalized_ads".equals(str2)) {
            String str4 = "_npa";
            if (objValueOf instanceof String) {
                String str5 = (String) objValueOf;
                if (!TextUtils.isEmpty(str5)) {
                    long j2 = true != "false".equals(str5.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    objValueOf = Long.valueOf(j2);
                    wvw0 wvw0Var = kxw0Var.e;
                    kxw0.e(wvw0Var);
                    wvw0Var.n.u(j2 == 1 ? "true" : "false");
                } else if (objValueOf == null) {
                    wvw0 wvw0Var2 = kxw0Var.e;
                    kxw0.e(wvw0Var2);
                    wvw0Var2.n.u("unset");
                } else {
                    str4 = str2;
                }
            } else if (objValueOf == null) {
                wvw0 wvw0Var3 = kxw0Var.e;
                kxw0.e(wvw0Var3);
                wvw0Var3.n.u("unset");
            } else {
                str4 = str2;
            }
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.o.c("non_personalized_ads(_npa)", objValueOf, "Setting user property(FE)");
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj2 = objValueOf;
        if (!kxw0Var.a()) {
            uuw0 uuw0Var2 = kxw0Var.f;
            kxw0.g(uuw0Var2);
            uuw0Var2.o.a("User property not set since app measurement is disabled");
            return;
        }
        if (kxw0Var.c()) {
            zzpl zzplVar = new zzpl(j, obj2, str3, str);
            a4x0 a4x0VarI = kxw0Var.i();
            a4x0VarI.m1();
            a4x0VarI.n1();
            a4x0VarI.x1();
            euw0 euw0VarH = ((kxw0) a4x0VarI.b).h();
            euw0VarH.getClass();
            Parcel parcelObtain = Parcel.obtain();
            erw0.b(zzplVar, parcelObtain);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length > 131072) {
                uuw0 uuw0Var3 = ((kxw0) euw0VarH.b).f;
                kxw0.g(uuw0Var3);
                uuw0Var3.h.a("User property too long for local database. Sending directly to service");
                zS1 = false;
            } else {
                zS1 = euw0VarH.s1(bArrMarshall, 1);
            }
            a4x0VarI.z1(new ftw0(a4x0VarI, a4x0VarI.B1(true), zS1, (AbstractSafeParcelable) zzplVar, (byte) 1));
        }
    }

    public final void x1() {
        m1();
        n1();
        kxw0 kxw0Var = (kxw0) this.b;
        if (kxw0Var.c()) {
            bkw0 bkw0Var = kxw0Var.d;
            ((kxw0) bkw0Var.b).getClass();
            Boolean boolZ1 = bkw0Var.z1("google_analytics_deferred_deep_link_enabled");
            if (boolZ1 != null && boolZ1.booleanValue()) {
                uuw0 uuw0Var = kxw0Var.f;
                kxw0.g(uuw0Var);
                uuw0Var.n.a("Deferred Deep Link feature enabled.");
                fxw0 fxw0Var = kxw0Var.g;
                kxw0.g(fxw0Var);
                fxw0Var.v1(new dzw0(this, (byte) 2));
            }
            a4x0 a4x0VarI = kxw0Var.i();
            a4x0VarI.m1();
            a4x0VarI.n1();
            com.google.android.gms.measurement.internal.zzr zzrVarB1 = a4x0VarI.B1(true);
            a4x0VarI.x1();
            kxw0 kxw0Var2 = (kxw0) a4x0VarI.b;
            kxw0Var2.d.x1(null, btw0.W0);
            kxw0Var2.h().s1(new byte[0], 3);
            a4x0VarI.z1(new t2x0(a4x0VarI, zzrVarB1, (byte) 0));
            this.s = false;
            wvw0 wvw0Var = kxw0Var.e;
            kxw0.e(wvw0Var);
            wvw0Var.m1();
            String string = wvw0Var.q1().getString("previous_os_version", null);
            ((kxw0) wvw0Var.b).j().o1();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = wvw0Var.q1().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            kxw0Var.j().o1();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            s1(bundle, "auto", "_ou");
        }
    }

    public final void y1(Bundle bundle, long j) {
        kxw0 kxw0Var = (kxw0) this.b;
        s0x.H(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString(HiAnalyticsConstant.BI_KEY_APP_ID))) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.j.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(HiAnalyticsConstant.BI_KEY_APP_ID);
        u4n0.y(bundle2, HiAnalyticsConstant.BI_KEY_APP_ID, String.class, null);
        u4n0.y(bundle2, "origin", String.class, null);
        u4n0.y(bundle2, "name", String.class, null);
        u4n0.y(bundle2, "value", Object.class, null);
        u4n0.y(bundle2, "trigger_event_name", String.class, null);
        u4n0.y(bundle2, "trigger_timeout", Long.class, 0L);
        u4n0.y(bundle2, "timed_out_event_name", String.class, null);
        u4n0.y(bundle2, "timed_out_event_params", Bundle.class, null);
        u4n0.y(bundle2, "triggered_event_name", String.class, null);
        u4n0.y(bundle2, "triggered_event_params", Bundle.class, null);
        u4n0.y(bundle2, "time_to_live", Long.class, 0L);
        u4n0.y(bundle2, "expired_event_name", String.class, null);
        u4n0.y(bundle2, "expired_event_params", Bundle.class, null);
        s0x.E(bundle2.getString("name"));
        s0x.E(bundle2.getString("origin"));
        s0x.H(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        x6x0 x6x0Var = kxw0Var.i;
        iuw0 iuw0Var = kxw0Var.j;
        uuw0 uuw0Var2 = kxw0Var.f;
        kxw0.e(x6x0Var);
        if (x6x0Var.v2(string) != 0) {
            kxw0.g(uuw0Var2);
            uuw0Var2.g.b(iuw0Var.c(string), "Invalid conditional user property name");
            return;
        }
        kxw0.e(x6x0Var);
        if (x6x0Var.B1(obj, string) != 0) {
            kxw0.g(uuw0Var2);
            uuw0Var2.g.c(iuw0Var.c(string), obj, "Invalid conditional user property value");
            return;
        }
        Object objC1 = x6x0Var.C1(obj, string);
        if (objC1 == null) {
            kxw0.g(uuw0Var2);
            uuw0Var2.g.c(iuw0Var.c(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        u4n0.x(bundle2, objC1);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            kxw0.g(uuw0Var2);
            uuw0Var2.g.c(iuw0Var.c(string), Long.valueOf(j2), "Invalid conditional user property timeout");
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            kxw0.g(uuw0Var2);
            uuw0Var2.g.c(iuw0Var.c(string), Long.valueOf(j3), "Invalid conditional user property time to live");
        } else {
            fxw0 fxw0Var = kxw0Var.g;
            kxw0.g(fxw0Var);
            fxw0Var.v1(new szw0(this, bundle2, (byte) 0));
        }
    }

    public final void z1(Bundle bundle, String str, String str2) {
        kxw0 kxw0Var = (kxw0) this.b;
        kxw0Var.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        s0x.E(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        fxw0 fxw0Var = kxw0Var.g;
        kxw0.g(fxw0Var);
        fxw0Var.v1(new mfr(this, bundle2, false, (byte) 23));
    }
}
