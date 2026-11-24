package a;

import android.app.job.JobScheduler;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.javax.sip.header.SubscriptionStateHeader;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.tasks.Task;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.firebase.auth.FirebaseAuth;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.game.universal.impl.presentation.cardfootball.views.CardFootballFieldView;

/* JADX INFO: loaded from: classes2.dex */
public final class mfr implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21708a;
    public Object b;
    public final Object c;

    public mfr(f04 f04Var) {
        this.f21708a = (byte) 3;
        this.c = f04Var;
        this.b = new AtomicReference(null);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ae A[Catch: all -> 0x00ac, TryCatch #0 {all -> 0x00ac, blocks: (B:33:0x008e, B:35:0x0092, B:37:0x0096, B:42:0x00a3, B:47:0x00ae, B:48:0x00b8), top: B:59:0x008e }] */
    private final void a() {
        boolean z;
        boolean z2;
        fbv fbvVar = (fbv) this.b;
        nmt0 nmt0Var = (nmt0) this.c;
        qg00 qg00Var = (qg00) fbvVar.b;
        if (qg00Var == null) {
            return;
        }
        k7x0 k7x0Var = (k7x0) qg00Var.f28660a;
        try {
            byte[] bArr = (byte[]) nmt0Var.f23789a;
            bew0 bew0Var = bew0.b;
            int i = ldw0.f19874a;
            t6x0 t6x0VarS = t6x0.s(bArr, bew0.c);
            boolean z3 = false;
            for (y5x0 y5x0Var : k7x0Var.b.f) {
                List listR = t6x0VarS.r();
                y5x0Var.getClass();
                zas0 zas0Var = l6x0.h;
                zas0Var.getClass();
                if (listR == null || listR.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = listR.iterator();
                    z = false;
                    while (it.hasNext()) {
                        p5x0 p5x0Var = (p5x0) ((ConcurrentHashMap) zas0Var.b).get((String) it.next());
                        if (p5x0Var != null) {
                            l6x0 l6x0Var = p5x0Var.f26426a;
                            if (l6x0Var.d) {
                                td9 td9Var = l6x0Var.f19530a;
                                if (td9Var != null && (td9Var.f33756a || ((un00) td9Var.e).f35939a == 3 || l6x0Var.g.l())) {
                                    synchronized (l6x0Var) {
                                        try {
                                            td9 td9Var2 = l6x0Var.f19530a;
                                            if (td9Var2 != null) {
                                                if (td9Var2.f33756a) {
                                                    l6x0Var.f19530a = null;
                                                    l6x0Var.f.f43322a.incrementAndGet();
                                                } else if ((((un00) td9Var2.e).f35939a == 3) || l6x0Var.g.l()) {
                                                    l6x0Var.f19530a = null;
                                                    l6x0Var.f.f43322a.incrementAndGet();
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            z |= z2;
                        }
                    }
                }
                if (z && !z3) {
                    k7x0Var.f17845a.zza();
                    z3 = true;
                }
            }
        } catch (zew0 unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:104:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:105:0x02d5 A[Catch: NotFoundException -> 0x02da, TRY_LEAVE, TryCatch #3 {NotFoundException -> 0x02da, blocks: (B:102:0x02c3, B:105:0x02d5), top: B:294:0x02c3 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:113:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:114:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:117:0x0306  */
    /* JADX WARN: Code duplicated, block: B:120:0x031a A[EDGE_INSN: B:120:0x031a->B:121:0x031c BREAK  A[LOOP:0: B:115:0x0300->B:304:?]] */
    /* JADX WARN: Code duplicated, block: B:122:0x031e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0325  */
    /* JADX WARN: Code duplicated, block: B:126:0x034b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0393  */
    /* JADX WARN: Code duplicated, block: B:129:0x039c  */
    /* JADX WARN: Code duplicated, block: B:132:0x03be  */
    /* JADX WARN: Code duplicated, block: B:135:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:136:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:139:0x0400  */
    /* JADX WARN: Code duplicated, block: B:142:0x040c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x040e  */
    /* JADX WARN: Code duplicated, block: B:144:0x040f A[PHI: r13
  0x040f: PHI (r13v14 boolean) = (r13v10 boolean), (r13v9 boolean) binds: [B:143:0x040e, B:140:0x0409] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:146:0x0440  */
    /* JADX WARN: Code duplicated, block: B:147:0x0458  */
    /* JADX WARN: Code duplicated, block: B:150:0x047f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x0481  */
    /* JADX WARN: Code duplicated, block: B:155:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:156:0x04b6 A[PHI: r28 r29 r30
  0x04b6: PHI (r28v2 a.kxw0) = (r28v0 a.kxw0), (r28v3 a.kxw0) binds: [B:154:0x04a1, B:152:0x0484] A[DONT_GENERATE, DONT_INLINE]
  0x04b6: PHI (r29v2 a.quw0) = (r29v0 a.quw0), (r29v3 a.quw0) binds: [B:154:0x04a1, B:152:0x0484] A[DONT_GENERATE, DONT_INLINE]
  0x04b6: PHI (r30v2 a.x6x0) = (r30v0 a.x6x0), (r30v3 a.x6x0) binds: [B:154:0x04a1, B:152:0x0484] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:158:0x04c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:169:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:171:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:174:0x0519  */
    /* JADX WARN: Code duplicated, block: B:177:0x0529  */
    /* JADX WARN: Code duplicated, block: B:180:0x0548  */
    /* JADX WARN: Code duplicated, block: B:182:0x0556 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x0573  */
    /* JADX WARN: Code duplicated, block: B:190:0x0579  */
    /* JADX WARN: Code duplicated, block: B:192:0x0597  */
    /* JADX WARN: Code duplicated, block: B:196:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:199:0x05df  */
    /* JADX WARN: Code duplicated, block: B:204:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:206:0x0600  */
    /* JADX WARN: Code duplicated, block: B:208:0x060a  */
    /* JADX WARN: Code duplicated, block: B:209:0x0615  */
    /* JADX WARN: Code duplicated, block: B:212:0x061f  */
    /* JADX WARN: Code duplicated, block: B:215:0x0635  */
    /* JADX WARN: Code duplicated, block: B:219:0x0641  */
    /* JADX WARN: Code duplicated, block: B:222:0x064f  */
    /* JADX WARN: Code duplicated, block: B:225:0x0663  */
    /* JADX WARN: Code duplicated, block: B:226:0x0668  */
    /* JADX WARN: Code duplicated, block: B:228:0x067a  */
    /* JADX WARN: Code duplicated, block: B:230:0x069a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:241:0x0710  */
    /* JADX WARN: Code duplicated, block: B:243:0x072c  */
    /* JADX WARN: Code duplicated, block: B:246:0x0738  */
    /* JADX WARN: Code duplicated, block: B:255:0x0782  */
    /* JADX WARN: Code duplicated, block: B:257:0x078a  */
    /* JADX WARN: Code duplicated, block: B:258:0x078c  */
    /* JADX WARN: Code duplicated, block: B:260:0x0794  */
    /* JADX WARN: Code duplicated, block: B:264:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:268:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:270:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:272:0x0812  */
    /* JADX WARN: Code duplicated, block: B:275:0x0828  */
    /* JADX WARN: Code duplicated, block: B:279:0x083a  */
    /* JADX WARN: Code duplicated, block: B:294:0x02c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x031a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:71:0x0208  */
    /* JADX WARN: Code duplicated, block: B:72:0x0213  */
    /* JADX WARN: Code duplicated, block: B:73:0x021e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0229  */
    /* JADX WARN: Code duplicated, block: B:75:0x0234  */
    /* JADX WARN: Code duplicated, block: B:76:0x023f  */
    /* JADX WARN: Code duplicated, block: B:77:0x024a  */
    /* JADX WARN: Code duplicated, block: B:81:0x025e  */
    /* JADX WARN: Code duplicated, block: B:82:0x025f A[Catch: IllegalStateException -> 0x0281, TryCatch #2 {IllegalStateException -> 0x0281, blocks: (B:79:0x0256, B:83:0x0265, B:87:0x026d, B:89:0x0271, B:82:0x025f), top: B:292:0x0256 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x026b  */
    /* JADX WARN: Code duplicated, block: B:86:0x026c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0271 A[Catch: IllegalStateException -> 0x0281, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x0281, blocks: (B:79:0x0256, B:83:0x0265, B:87:0x026d, B:89:0x0271, B:82:0x025f), top: B:292:0x0256 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:97:0x02b2  */
    /* JADX WARN: Type inference failed for: r0v26, types: [a.x0x0] */
    private final void b() {
        String str;
        uuw0 uuw0Var;
        uuw0 uuw0Var2;
        String installerPackageName;
        String string;
        String str2;
        int i;
        String str3;
        int iB;
        kxw0 kxw0Var;
        Bundle bundleY1;
        Integer numValueOf;
        String[] stringArray;
        List listAsList;
        o1x0 o1x0Var;
        kxw0 kxw0Var2;
        uuw0 uuw0Var3;
        quw0 quw0Var;
        quw0 quw0Var2;
        quw0 quw0Var3;
        quw0 quw0Var4;
        String strR1;
        int i2;
        AtomicInteger atomicInteger;
        long j;
        final b1x0 b1x0Var;
        int iQ1;
        boolean zX1;
        boolean z;
        uuw0 uuw0Var4;
        o24 o24Var;
        xyw0 xyw0VarT1;
        tyw0 tyw0VarC1;
        tyw0 tyw0VarC2;
        wyw0 wyw0Var;
        tyw0 tyw0Var;
        kxw0 kxw0Var3;
        quw0 quw0Var5;
        x6x0 x6x0Var;
        xyw0 xyw0Var;
        kxw0 kxw0Var4;
        tyw0 tyw0VarC3;
        tyw0 tyw0VarC4;
        Boolean boolZ1;
        rvw0 rvw0Var;
        zlt0 zlt0Var;
        kxw0 kxw0Var5;
        x6x0 x6x0Var2;
        o24 o24Var2;
        uuw0 uuw0Var5;
        boolean zA;
        SharedPreferences sharedPreferences;
        boolean zContains;
        boolean zIsEmpty;
        long jMax;
        ezw0 ezw0Var;
        quw0 quw0Var6;
        Context context;
        boolean z2;
        Iterator it;
        String str4;
        x6x0 x6x0Var3;
        String strW;
        Bundle bundle;
        kxw0 kxw0Var6 = (kxw0) this.c;
        bzw0 bzw0Var = (bzw0) this.b;
        fxw0 fxw0Var = kxw0Var6.g;
        uuw0 uuw0Var6 = kxw0Var6.f;
        wvw0 wvw0Var = kxw0Var6.e;
        x6x0 x6x0Var4 = kxw0Var6.i;
        kxw0.g(fxw0Var);
        fxw0Var.m1();
        bkw0 bkw0Var = kxw0Var6.d;
        ((kxw0) bkw0Var.b).getClass();
        kmw0 kmw0Var = new kmw0(kxw0Var6);
        ((kxw0) kmw0Var.b).A++;
        kmw0Var.p1();
        kxw0Var6.s = kmw0Var;
        zzdb zzdbVar = bzw0Var.d;
        long j2 = zzdbVar == null ? 0L : zzdbVar.f45525a;
        String string2 = (zzdbVar == null || (bundle = zzdbVar.d) == null) ? "" : bundle.getString("runtime_google_app_id", "");
        long j3 = bzw0Var.c;
        String str5 = "";
        vtw0 vtw0Var = new vtw0(kxw0Var6, j3, j2, string2);
        vtw0Var.f1();
        kxw0Var6.t = vtw0Var;
        euw0 euw0Var = new euw0(kxw0Var6);
        euw0Var.f1();
        kxw0Var6.q = euw0Var;
        a4x0 a4x0Var = new a4x0(kxw0Var6);
        a4x0Var.f1();
        kxw0Var6.r = a4x0Var;
        boolean z3 = x6x0Var4.c;
        kxw0 kxw0Var7 = (kxw0) x6x0Var4.b;
        if (z3) {
            jf4.n("Can't initialize twice");
            return;
        }
        x6x0Var4.m1();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                uuw0 uuw0Var7 = ((kxw0) x6x0Var4.b).f;
                kxw0.g(uuw0Var7);
                uuw0Var7.j.a("Utils falling back to Random for random id");
            }
        }
        x6x0Var4.e.set(jNextLong);
        kxw0Var7.Y.incrementAndGet();
        x6x0Var4.c = true;
        if (wvw0Var.c) {
            jf4.n("Can't initialize twice");
            return;
        }
        SharedPreferences sharedPreferences2 = ((kxw0) wvw0Var.b).f19080a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        wvw0Var.d = sharedPreferences2;
        boolean z4 = sharedPreferences2.getBoolean("has_been_opened", false);
        wvw0Var.s = z4;
        if (!z4) {
            SharedPreferences.Editor editorEdit = wvw0Var.d.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        wvw0Var.f = new hac(wvw0Var, Math.max(0L, ((Long) btw0.d.a(null)).longValue()));
        ((kxw0) wvw0Var.b).Y.incrementAndGet();
        wvw0Var.c = true;
        vtw0 vtw0Var2 = kxw0Var6.t;
        if (vtw0Var2.c) {
            jf4.n("Can't initialize twice");
            return;
        }
        kxw0 kxw0Var8 = (kxw0) vtw0Var2.b;
        uuw0 uuw0Var8 = kxw0Var8.f;
        uuw0 uuw0Var9 = kxw0Var8.f;
        kxw0.g(uuw0Var8);
        uuw0Var8.o.c(Long.valueOf(vtw0Var2.k), Long.valueOf(vtw0Var2.j), "sdkVersion bundled with app, dynamiteVersion");
        Context context2 = kxw0Var8.f19080a;
        String packageName = context2.getPackageName();
        PackageManager packageManager = context2.getPackageManager();
        String str6 = "Unknown";
        String str7 = "unknown";
        try {
            if (packageManager != null) {
                str = "Can't initialize twice";
                uuw0Var = uuw0Var6;
                uuw0Var2 = uuw0Var9;
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    kxw0.g(uuw0Var2);
                    uuw0Var2.g.b(uuw0.q1(packageName), "Error retrieving app installer package name. appId");
                    installerPackageName = "unknown";
                }
                if (installerPackageName == null) {
                    installerPackageName = "manual_install";
                } else if ("com.android.vending".equals(installerPackageName)) {
                    installerPackageName = str5;
                }
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                        str7 = installerPackageName;
                        try {
                            str2 = packageInfo.versionName;
                            try {
                                i = packageInfo.versionCode;
                                packageManager = packageManager;
                                str3 = str7;
                            } catch (PackageManager.NameNotFoundException unused2) {
                                str6 = str2;
                                kxw0.g(uuw0Var2);
                                uuw0Var2.g.c(uuw0.q1(packageName), string, "Error retrieving package info. appId, appName");
                                str2 = str6;
                                str3 = str7;
                                i = Integer.MIN_VALUE;
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                        }
                    } else {
                        str7 = installerPackageName;
                    }
                } catch (PackageManager.NameNotFoundException unused4) {
                    str7 = installerPackageName;
                    string = "Unknown";
                }
                vtw0Var2.d = packageName;
                vtw0Var2.g = str3;
                vtw0Var2.e = str2;
                vtw0Var2.f = i;
                vtw0Var2.h = string;
                vtw0Var2.i = 0L;
                iB = kxw0Var8.b();
                if (iB != 0) {
                    kxw0.g(uuw0Var2);
                    uuw0Var2.o.a("App measurement collection enabled");
                } else if (iB != 1) {
                    kxw0.g(uuw0Var2);
                    uuw0Var2.m.a("App measurement deactivated via the manifest");
                } else if (iB != 3) {
                    kxw0.g(uuw0Var2);
                    uuw0Var2.m.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iB != 4) {
                    kxw0.g(uuw0Var2);
                    uuw0Var2.m.a("App measurement disabled via the manifest");
                } else if (iB != 6) {
                    kxw0.g(uuw0Var2);
                    uuw0Var2.l.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iB != 7) {
                    kxw0.g(uuw0Var2);
                    uuw0Var2.m.a("App measurement disabled via the global data collection setting");
                } else if (iB != 8) {
                    kxw0.g(uuw0Var2);
                    uuw0Var2.m.a("App measurement disabled");
                    kxw0.g(uuw0Var2);
                    uuw0Var2.h.a("Invalid scion state in identity");
                } else {
                    kxw0.g(uuw0Var2);
                    uuw0Var2.m.a("App measurement disabled due to denied storage consent");
                }
                vtw0Var2.p = str5;
                strW = vtw0Var2.n;
                if (!TextUtils.isEmpty(strW)) {
                    strW = o5n0.w(context2, kxw0Var8.p);
                }
                if (TextUtils.isEmpty(strW)) {
                    str5 = strW;
                }
                vtw0Var2.p = str5;
                if (iB == 0) {
                    kxw0.g(uuw0Var2);
                    uuw0Var2.o.c(vtw0Var2.d, vtw0Var2.p, "App measurement enabled for app package, google app id");
                }
                vtw0Var2.l = null;
                bkw0 bkw0Var2 = kxw0Var8.d;
                kxw0Var = (kxw0) bkw0Var2.b;
                s0x.E("analytics.safelisted_events");
                bundleY1 = bkw0Var2.y1();
                if (bundleY1 == null) {
                    if (!bundleY1.containsKey("analytics.safelisted_events")) {
                        numValueOf = Integer.valueOf(bundleY1.getInt("analytics.safelisted_events"));
                    }
                    if (numValueOf != null) {
                        try {
                            stringArray = kxw0Var.f19080a.getResources().getStringArray(numValueOf.intValue());
                            if (stringArray == null) {
                                listAsList = null;
                            } else {
                                listAsList = Arrays.asList(stringArray);
                            }
                        } catch (Resources.NotFoundException e) {
                            uuw0 uuw0Var10 = kxw0Var.f;
                            kxw0.g(uuw0Var10);
                            uuw0Var10.g.b(e, "Failed to load string array from metadata: resource not found");
                        }
                    } else {
                        listAsList = null;
                    }
                    if (listAsList != null) {
                        vtw0Var2.l = listAsList;
                        break;
                    }
                    if (listAsList.isEmpty()) {
                        it = listAsList.iterator();
                        do {
                            if (it.hasNext()) {
                                vtw0Var2.l = listAsList;
                                break;
                            } else {
                                str4 = (String) it.next();
                                x6x0Var3 = kxw0Var8.i;
                                kxw0.e(x6x0Var3);
                            }
                        } while (x6x0Var3.q2("safelisted event", str4));
                    } else {
                        kxw0.g(uuw0Var2);
                        uuw0Var2.l.a("Safelisted event list is empty. Ignoring");
                    }
                    if (packageManager != null) {
                        vtw0Var2.o = cjx.U(context2) ? 1 : 0;
                    } else {
                        vtw0Var2.o = 0;
                    }
                    ((kxw0) vtw0Var2.b).Y.incrementAndGet();
                    vtw0Var2.c = true;
                    o1x0Var = new o1x0(kxw0Var6);
                    kxw0Var2 = (kxw0) o1x0Var.b;
                    kxw0Var2.A++;
                    o1x0Var.f1();
                    kxw0Var6.u = o1x0Var;
                    if (!o1x0Var.c) {
                        jf4.n(str);
                        return;
                    }
                    o1x0Var.d = (JobScheduler) ((kxw0) o1x0Var.b).f19080a.getSystemService("jobscheduler");
                    kxw0Var2.Y.incrementAndGet();
                    o1x0Var.c = true;
                    kxw0.g(uuw0Var);
                    uuw0Var3 = uuw0Var;
                    quw0Var = uuw0Var3.n;
                    quw0Var2 = uuw0Var3.m;
                    quw0Var3 = uuw0Var3.o;
                    quw0Var4 = uuw0Var3.g;
                    bkw0Var.s1();
                    quw0Var2.b(161000L, "App measurement initialized, version");
                    kxw0.g(uuw0Var3);
                    quw0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                    strR1 = vtw0Var.r1();
                    if (x6x0Var4.R1(strR1, bkw0Var.d)) {
                        kxw0.g(uuw0Var3);
                        quw0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    } else {
                        kxw0.g(uuw0Var3);
                        quw0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strR1)));
                    }
                    kxw0.g(uuw0Var3);
                    quw0Var.a("Debug-level message logging enabled");
                    i2 = kxw0Var6.A;
                    atomicInteger = kxw0Var6.Y;
                    if (i2 != atomicInteger.get()) {
                        kxw0.g(uuw0Var3);
                        quw0Var4.c(Integer.valueOf(kxw0Var6.A), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                    }
                    kxw0Var6.v = true;
                    j = kxw0Var6.Z;
                    b1x0Var = kxw0Var6.m;
                    kxw0.g(fxw0Var);
                    fxw0Var.m1();
                    kxw0.d(kxw0Var6.u);
                    iQ1 = kxw0Var6.u.q1();
                    miw0.a();
                    zX1 = bkw0Var.x1(null, btw0.P0);
                    if (iQ1 == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (zX1) {
                        x6x0Var4.m1();
                        if (x6x0Var4.J1() == 1) {
                            x6x0Var4.m1();
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z2 = z;
                            uuw0Var4 = uuw0Var3;
                            jiq0.t0(kxw0Var7.f19080a, new md3(kxw0Var7, (byte) 9, false), intentFilter);
                            uuw0 uuw0Var11 = kxw0Var7.f;
                            kxw0.g(uuw0Var11);
                            uuw0Var11.n.a("Registered app receiver");
                            if (z2) {
                                kxw0.d(kxw0Var6.u);
                                kxw0Var6.u.p1(((Long) btw0.C.a(null)).longValue());
                            }
                        } else if (z) {
                            z = true;
                            x6x0Var4.m1();
                            IntentFilter intentFilter2 = new IntentFilter();
                            intentFilter2.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter2.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z2 = z;
                            uuw0Var4 = uuw0Var3;
                            jiq0.t0(kxw0Var7.f19080a, new md3(kxw0Var7, (byte) 9, false), intentFilter2);
                            uuw0 uuw0Var12 = kxw0Var7.f;
                            kxw0.g(uuw0Var12);
                            uuw0Var12.n.a("Registered app receiver");
                            if (z2) {
                                kxw0.d(kxw0Var6.u);
                                kxw0Var6.u.p1(((Long) btw0.C.a(null)).longValue());
                            }
                        } else {
                            uuw0Var4 = uuw0Var3;
                        }
                    } else if (z) {
                        z = true;
                        x6x0Var4.m1();
                        IntentFilter intentFilter3 = new IntentFilter();
                        intentFilter3.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter3.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z2 = z;
                        uuw0Var4 = uuw0Var3;
                        jiq0.t0(kxw0Var7.f19080a, new md3(kxw0Var7, (byte) 9, false), intentFilter3);
                        uuw0 uuw0Var13 = kxw0Var7.f;
                        kxw0.g(uuw0Var13);
                        uuw0Var13.n.a("Registered app receiver");
                        if (z2) {
                            kxw0.d(kxw0Var6.u);
                            kxw0Var6.u.p1(((Long) btw0.C.a(null)).longValue());
                        }
                    } else {
                        uuw0Var4 = uuw0Var3;
                    }
                    o24Var = wvw0Var.h;
                    xyw0VarT1 = wvw0Var.t1();
                    int i3 = xyw0VarT1.b;
                    tyw0VarC1 = bkw0Var.C1("google_analytics_default_allow_ad_storage", false);
                    tyw0VarC2 = bkw0Var.C1("google_analytics_default_allow_analytics_storage", false);
                    wyw0Var = wyw0.ANALYTICS_STORAGE;
                    tyw0Var = tyw0.UNINITIALIZED;
                    if (tyw0VarC1 == tyw0Var || tyw0VarC2 != tyw0Var) {
                        kxw0Var3 = kxw0Var6;
                        quw0Var5 = quw0Var4;
                        x6x0Var = x6x0Var4;
                        if (xyw0.l(-10, wvw0Var.q1().getInt("consent_source", 100))) {
                            EnumMap enumMap = new EnumMap(wyw0.class);
                            enumMap.put(wyw0.AD_STORAGE, tyw0VarC1);
                            enumMap.put(wyw0Var, tyw0VarC2);
                            xyw0Var = new xyw0(enumMap, -10);
                        }
                        if (xyw0Var != null) {
                            kxw0.f(b1x0Var);
                            b1x0Var.H1(xyw0Var, true);
                        } else {
                            xyw0Var = xyw0VarT1;
                        }
                        kxw0.f(b1x0Var);
                        kxw0Var4 = (kxw0) b1x0Var.b;
                        b1x0Var.L1(xyw0Var);
                        wvw0Var.m1();
                        int i4 = jmw0.b(wvw0Var.q1().getString("dma_consent_settings", null)).f16787a;
                        tyw0VarC3 = bkw0Var.C1("google_analytics_default_allow_ad_personalization_signals", true);
                        if (tyw0VarC3 != tyw0Var) {
                            kxw0.g(uuw0Var4);
                            quw0Var3.b(tyw0VarC3, "Default ad personalization consent from Manifest");
                        }
                        tyw0VarC4 = bkw0Var.C1("google_analytics_default_allow_ad_user_data", true);
                        if (tyw0VarC4 == tyw0Var && xyw0.l(-10, i4)) {
                            kxw0.f(b1x0Var);
                            EnumMap enumMap2 = new EnumMap(wyw0.class);
                            enumMap2.put(wyw0.AD_USER_DATA, tyw0VarC4);
                            b1x0Var.G1(new jmw0(enumMap2, -10, (Boolean) null, (String) null), true);
                        } else if (!TextUtils.isEmpty(kxw0Var3.k().s1()) && (i4 == 0 || i4 == 30)) {
                            kxw0.f(b1x0Var);
                            b1x0Var.G1(new jmw0(-10, (Boolean) null, (Boolean) null, (String) null), true);
                        }
                        boolZ1 = bkw0Var.z1("google_analytics_tcf_data_enabled");
                        if (boolZ1 != null || boolZ1.booleanValue()) {
                            kxw0.g(uuw0Var4);
                            quw0Var.a("TCF client enabled.");
                            kxw0.f(b1x0Var);
                            b1x0Var.m1();
                            uuw0 uuw0Var14 = kxw0Var4.f;
                            kxw0.g(uuw0Var14);
                            uuw0Var14.n.a("Register tcfPrefChangeListener.");
                            if (b1x0Var.u == null) {
                                b1x0Var.v = new ezw0(b1x0Var, kxw0Var4, (byte) 2);
                                b1x0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: a.x0x0
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                        b1x0 b1x0Var2 = b1x0Var;
                                        b1x0Var2.getClass();
                                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                            uuw0 uuw0Var15 = ((kxw0) b1x0Var2.b).f;
                                            kxw0.g(uuw0Var15);
                                            uuw0Var15.o.a("IABTCF_TCString change picked up in listener.");
                                            ezw0 ezw0Var2 = b1x0Var2.v;
                                            s0x.H(ezw0Var2);
                                            ezw0Var2.b(500L);
                                        }
                                    }
                                };
                            }
                            wvw0 wvw0Var2 = kxw0Var4.e;
                            kxw0.e(wvw0Var2);
                            wvw0Var2.r1().registerOnSharedPreferenceChangeListener(b1x0Var.u);
                            kxw0.f(b1x0Var);
                            b1x0Var.r1();
                        }
                        rvw0Var = wvw0Var.g;
                        if (rvw0Var.a() == 0) {
                            kxw0.g(uuw0Var4);
                            quw0Var3.b(Long.valueOf(j), "Persisting first open");
                            rvw0Var.b(j);
                        }
                        kxw0.f(b1x0Var);
                        zlt0Var = b1x0Var.r;
                        if (zlt0Var.t() && zlt0Var.s()) {
                            wvw0 wvw0Var3 = ((kxw0) zlt0Var.b).e;
                            kxw0.e(wvw0Var3);
                            wvw0Var3.x.u(null);
                        }
                        if (kxw0Var3.c()) {
                            kxw0Var5 = kxw0Var3;
                            x6x0Var2 = x6x0Var;
                            if (TextUtils.isEmpty(kxw0Var5.k().s1())) {
                                o24Var2 = o24Var;
                            } else {
                                String strS1 = kxw0Var5.k().s1();
                                wvw0Var.m1();
                                String string3 = wvw0Var.q1().getString("gmp_app_id", null);
                                zIsEmpty = TextUtils.isEmpty(strS1);
                                boolean zIsEmpty2 = TextUtils.isEmpty(string3);
                                if (!zIsEmpty || zIsEmpty2) {
                                    o24Var2 = o24Var;
                                } else {
                                    s0x.H(strS1);
                                    if (strS1.equals(string3)) {
                                        o24Var2 = o24Var;
                                    } else {
                                        kxw0.g(uuw0Var4);
                                        quw0Var2.a("Rechecking which service to use due to a GMP App Id change");
                                        wvw0Var.m1();
                                        wvw0Var.m1();
                                        Boolean boolValueOf = wvw0Var.q1().contains("measurement_enabled") ? Boolean.valueOf(wvw0Var.q1().getBoolean("measurement_enabled", true)) : null;
                                        SharedPreferences.Editor editorEdit2 = wvw0Var.q1().edit();
                                        editorEdit2.clear();
                                        editorEdit2.apply();
                                        if (boolValueOf != null) {
                                            wvw0Var.m1();
                                            SharedPreferences.Editor editorEdit3 = wvw0Var.q1().edit();
                                            editorEdit3.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                            editorEdit3.apply();
                                        }
                                        kxw0Var5.h().p1();
                                        kxw0Var5.r.t1();
                                        kxw0Var5.r.r1();
                                        rvw0Var.b(j);
                                        o24Var2 = o24Var;
                                        o24Var2.u(null);
                                    }
                                }
                                String strS2 = kxw0Var5.k().s1();
                                wvw0Var.m1();
                                SharedPreferences.Editor editorEdit4 = wvw0Var.q1().edit();
                                editorEdit4.putString("gmp_app_id", strS2);
                                editorEdit4.apply();
                            }
                            if (!wvw0Var.t1().i(wyw0Var)) {
                                o24Var2.u(null);
                            }
                            kxw0.f(b1x0Var);
                            b1x0Var.h.set(o24Var2.t());
                            try {
                                kxw0Var7.f19080a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            } catch (ClassNotFoundException unused5) {
                                o24 o24Var3 = wvw0Var.w;
                                if (!TextUtils.isEmpty(o24Var3.t())) {
                                    kxw0.g(uuw0Var4);
                                    uuw0Var5 = uuw0Var4;
                                    uuw0Var5.j.a("Remote config removed with active feature rollouts");
                                    o24Var3.u(null);
                                }
                                if (!TextUtils.isEmpty(kxw0Var5.k().s1())) {
                                    zA = kxw0Var5.a();
                                    sharedPreferences = wvw0Var.d;
                                    if (sharedPreferences == null) {
                                        zContains = false;
                                    } else {
                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
                                    if (!zContains) {
                                        wvw0Var.u1(!zA);
                                    }
                                    if (zA) {
                                        kxw0.f(b1x0Var);
                                        b1x0Var.x1();
                                    }
                                    w4x0 w4x0Var = kxw0Var5.h;
                                    kxw0.f(w4x0Var);
                                    w4x0Var.f.e();
                                    kxw0Var5.i().p1(new AtomicReference());
                                    kxw0Var5.i().q1(wvw0Var.z.s());
                                }
                                miw0.a();
                                if (bkw0Var.x1(null, btw0.P0)) {
                                    x6x0Var2.m1();
                                    if (x6x0Var2.J1() == 1) {
                                        long jIntValue = ((Integer) btw0.w0.a(null)).intValue();
                                        long jNextInt = new Random().nextInt(5000);
                                        kxw0Var5.k.getClass();
                                        jMax = Math.max(500L, ((jIntValue * 1000) + jNextInt) - SystemClock.elapsedRealtime());
                                        if (jMax > 500) {
                                            kxw0.g(uuw0Var5);
                                            quw0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                        }
                                        kxw0.f(b1x0Var);
                                        b1x0Var.m1();
                                        ezw0Var = b1x0Var.m;
                                        if (ezw0Var == null) {
                                            ezw0Var = new ezw0(b1x0Var, kxw0Var4, (byte) 0);
                                            b1x0Var.m = ezw0Var;
                                        }
                                        ezw0Var.b(jMax);
                                    }
                                }
                                wvw0Var.p.b(true);
                            }
                            uuw0Var5 = uuw0Var4;
                            if (!TextUtils.isEmpty(kxw0Var5.k().s1())) {
                                zA = kxw0Var5.a();
                                sharedPreferences = wvw0Var.d;
                                if (sharedPreferences == null) {
                                    zContains = false;
                                } else {
                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
                                if (!zContains && !bkw0Var.A1()) {
                                    wvw0Var.u1(!zA);
                                }
                                if (zA) {
                                    kxw0.f(b1x0Var);
                                    b1x0Var.x1();
                                }
                                w4x0 w4x0Var2 = kxw0Var5.h;
                                kxw0.f(w4x0Var2);
                                w4x0Var2.f.e();
                                kxw0Var5.i().p1(new AtomicReference());
                                kxw0Var5.i().q1(wvw0Var.z.s());
                            }
                        } else {
                            if (kxw0Var3.a()) {
                                x6x0Var2 = x6x0Var;
                                if (x6x0Var2.P1("android.permission.INTERNET")) {
                                    quw0Var6 = quw0Var5;
                                } else {
                                    kxw0.g(uuw0Var4);
                                    quw0Var6 = quw0Var5;
                                    quw0Var6.a("App is missing INTERNET permission");
                                }
                                if (!x6x0Var2.P1("android.permission.ACCESS_NETWORK_STATE")) {
                                    kxw0.g(uuw0Var4);
                                    quw0Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                                }
                                kxw0Var5 = kxw0Var3;
                                context = kxw0Var5.f19080a;
                                if (!grv0.a(context).c() && !bkw0Var.p1()) {
                                    if (!x6x0.h2(context)) {
                                        kxw0.g(uuw0Var4);
                                        quw0Var6.a("AppMeasurementReceiver not registered/enabled");
                                    }
                                    if (!x6x0.H1(context)) {
                                        kxw0.g(uuw0Var4);
                                        quw0Var6.a("AppMeasurementService not registered/enabled");
                                    }
                                }
                                kxw0.g(uuw0Var4);
                                quw0Var6.a("Uploading is not possible. App measurement disabled");
                            } else {
                                kxw0Var5 = kxw0Var3;
                                x6x0Var2 = x6x0Var;
                            }
                            uuw0Var5 = uuw0Var4;
                        }
                        miw0.a();
                        if (bkw0Var.x1(null, btw0.P0)) {
                            x6x0Var2.m1();
                            if (x6x0Var2.J1() == 1) {
                                long jIntValue2 = ((Integer) btw0.w0.a(null)).intValue();
                                long jNextInt2 = new Random().nextInt(5000);
                                kxw0Var5.k.getClass();
                                jMax = Math.max(500L, ((jIntValue2 * 1000) + jNextInt2) - SystemClock.elapsedRealtime());
                                if (jMax > 500) {
                                    kxw0.g(uuw0Var5);
                                    quw0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                }
                                kxw0.f(b1x0Var);
                                b1x0Var.m1();
                                ezw0Var = b1x0Var.m;
                                if (ezw0Var == null) {
                                    ezw0Var = new ezw0(b1x0Var, kxw0Var4, (byte) 0);
                                    b1x0Var.m = ezw0Var;
                                }
                                ezw0Var.b(jMax);
                            }
                        }
                        wvw0Var.p.b(true);
                    }
                    kxw0Var3 = kxw0Var6;
                    quw0Var5 = quw0Var4;
                    x6x0Var = x6x0Var4;
                    if (!TextUtils.isEmpty(kxw0Var3.k().s1()) && (i3 == 0 || i3 == 30 || i3 == 10 || i3 == 40)) {
                        kxw0.f(b1x0Var);
                        b1x0Var.H1(new xyw0(-10), false);
                    }
                    xyw0Var = null;
                    if (xyw0Var != null) {
                        kxw0.f(b1x0Var);
                        b1x0Var.H1(xyw0Var, true);
                    } else {
                        xyw0Var = xyw0VarT1;
                    }
                    kxw0.f(b1x0Var);
                    kxw0Var4 = (kxw0) b1x0Var.b;
                    b1x0Var.L1(xyw0Var);
                    wvw0Var.m1();
                    int i5 = jmw0.b(wvw0Var.q1().getString("dma_consent_settings", null)).f16787a;
                    tyw0VarC3 = bkw0Var.C1("google_analytics_default_allow_ad_personalization_signals", true);
                    if (tyw0VarC3 != tyw0Var) {
                        kxw0.g(uuw0Var4);
                        quw0Var3.b(tyw0VarC3, "Default ad personalization consent from Manifest");
                    }
                    tyw0VarC4 = bkw0Var.C1("google_analytics_default_allow_ad_user_data", true);
                    if (tyw0VarC4 == tyw0Var) {
                        if (!TextUtils.isEmpty(kxw0Var3.k().s1())) {
                            kxw0.f(b1x0Var);
                            b1x0Var.G1(new jmw0(-10, (Boolean) null, (Boolean) null, (String) null), true);
                        }
                    } else if (!TextUtils.isEmpty(kxw0Var3.k().s1())) {
                        kxw0.f(b1x0Var);
                        b1x0Var.G1(new jmw0(-10, (Boolean) null, (Boolean) null, (String) null), true);
                    }
                    boolZ1 = bkw0Var.z1("google_analytics_tcf_data_enabled");
                    if (boolZ1 != null) {
                        kxw0.g(uuw0Var4);
                        quw0Var.a("TCF client enabled.");
                        kxw0.f(b1x0Var);
                        b1x0Var.m1();
                        uuw0 uuw0Var15 = kxw0Var4.f;
                        kxw0.g(uuw0Var15);
                        uuw0Var15.n.a("Register tcfPrefChangeListener.");
                        if (b1x0Var.u == null) {
                            b1x0Var.v = new ezw0(b1x0Var, kxw0Var4, (byte) 2);
                            b1x0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: a.x0x0
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                    b1x0 b1x0Var2 = b1x0Var;
                                    b1x0Var2.getClass();
                                    if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                        uuw0 uuw0Var16 = ((kxw0) b1x0Var2.b).f;
                                        kxw0.g(uuw0Var16);
                                        uuw0Var16.o.a("IABTCF_TCString change picked up in listener.");
                                        ezw0 ezw0Var2 = b1x0Var2.v;
                                        s0x.H(ezw0Var2);
                                        ezw0Var2.b(500L);
                                    }
                                }
                            };
                        }
                        wvw0 wvw0Var4 = kxw0Var4.e;
                        kxw0.e(wvw0Var4);
                        wvw0Var4.r1().registerOnSharedPreferenceChangeListener(b1x0Var.u);
                        kxw0.f(b1x0Var);
                        b1x0Var.r1();
                    } else {
                        kxw0.g(uuw0Var4);
                        quw0Var.a("TCF client enabled.");
                        kxw0.f(b1x0Var);
                        b1x0Var.m1();
                        uuw0 uuw0Var16 = kxw0Var4.f;
                        kxw0.g(uuw0Var16);
                        uuw0Var16.n.a("Register tcfPrefChangeListener.");
                        if (b1x0Var.u == null) {
                            b1x0Var.v = new ezw0(b1x0Var, kxw0Var4, (byte) 2);
                            b1x0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: a.x0x0
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                    b1x0 b1x0Var2 = b1x0Var;
                                    b1x0Var2.getClass();
                                    if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                        uuw0 uuw0Var17 = ((kxw0) b1x0Var2.b).f;
                                        kxw0.g(uuw0Var17);
                                        uuw0Var17.o.a("IABTCF_TCString change picked up in listener.");
                                        ezw0 ezw0Var2 = b1x0Var2.v;
                                        s0x.H(ezw0Var2);
                                        ezw0Var2.b(500L);
                                    }
                                }
                            };
                        }
                        wvw0 wvw0Var5 = kxw0Var4.e;
                        kxw0.e(wvw0Var5);
                        wvw0Var5.r1().registerOnSharedPreferenceChangeListener(b1x0Var.u);
                        kxw0.f(b1x0Var);
                        b1x0Var.r1();
                    }
                    rvw0Var = wvw0Var.g;
                    if (rvw0Var.a() == 0) {
                        kxw0.g(uuw0Var4);
                        quw0Var3.b(Long.valueOf(j), "Persisting first open");
                        rvw0Var.b(j);
                    }
                    kxw0.f(b1x0Var);
                    zlt0Var = b1x0Var.r;
                    if (zlt0Var.t()) {
                        wvw0 wvw0Var6 = ((kxw0) zlt0Var.b).e;
                        kxw0.e(wvw0Var6);
                        wvw0Var6.x.u(null);
                    }
                    if (kxw0Var3.c()) {
                        if (kxw0Var3.a()) {
                            x6x0Var2 = x6x0Var;
                            if (x6x0Var2.P1("android.permission.INTERNET")) {
                                kxw0.g(uuw0Var4);
                                quw0Var6 = quw0Var5;
                                quw0Var6.a("App is missing INTERNET permission");
                            } else {
                                quw0Var6 = quw0Var5;
                            }
                            if (!x6x0Var2.P1("android.permission.ACCESS_NETWORK_STATE")) {
                                kxw0.g(uuw0Var4);
                                quw0Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                            }
                            kxw0Var5 = kxw0Var3;
                            context = kxw0Var5.f19080a;
                            if (!grv0.a(context).c()) {
                                if (!x6x0.h2(context)) {
                                    kxw0.g(uuw0Var4);
                                    quw0Var6.a("AppMeasurementReceiver not registered/enabled");
                                }
                                if (!x6x0.H1(context)) {
                                    kxw0.g(uuw0Var4);
                                    quw0Var6.a("AppMeasurementService not registered/enabled");
                                }
                            }
                            kxw0.g(uuw0Var4);
                            quw0Var6.a("Uploading is not possible. App measurement disabled");
                        } else {
                            kxw0Var5 = kxw0Var3;
                            x6x0Var2 = x6x0Var;
                        }
                        uuw0Var5 = uuw0Var4;
                    } else {
                        kxw0Var5 = kxw0Var3;
                        x6x0Var2 = x6x0Var;
                        if (TextUtils.isEmpty(kxw0Var5.k().s1())) {
                            String strS3 = kxw0Var5.k().s1();
                            wvw0Var.m1();
                            String string4 = wvw0Var.q1().getString("gmp_app_id", null);
                            zIsEmpty = TextUtils.isEmpty(strS3);
                            boolean zIsEmpty3 = TextUtils.isEmpty(string4);
                            if (zIsEmpty) {
                                o24Var2 = o24Var;
                            } else {
                                o24Var2 = o24Var;
                            }
                            String strS4 = kxw0Var5.k().s1();
                            wvw0Var.m1();
                            SharedPreferences.Editor editorEdit5 = wvw0Var.q1().edit();
                            editorEdit5.putString("gmp_app_id", strS4);
                            editorEdit5.apply();
                        } else {
                            o24Var2 = o24Var;
                        }
                        if (!wvw0Var.t1().i(wyw0Var)) {
                            o24Var2.u(null);
                        }
                        kxw0.f(b1x0Var);
                        b1x0Var.h.set(o24Var2.t());
                        kxw0Var7.f19080a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        uuw0Var5 = uuw0Var4;
                        if (!TextUtils.isEmpty(kxw0Var5.k().s1())) {
                            zA = kxw0Var5.a();
                            sharedPreferences = wvw0Var.d;
                            if (sharedPreferences == null) {
                                zContains = false;
                            } else {
                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
                            if (!zContains) {
                                wvw0Var.u1(!zA);
                            }
                            if (zA) {
                                kxw0.f(b1x0Var);
                                b1x0Var.x1();
                            }
                            w4x0 w4x0Var3 = kxw0Var5.h;
                            kxw0.f(w4x0Var3);
                            w4x0Var3.f.e();
                            kxw0Var5.i().p1(new AtomicReference());
                            kxw0Var5.i().q1(wvw0Var.z.s());
                        }
                    }
                    miw0.a();
                    if (bkw0Var.x1(null, btw0.P0)) {
                        x6x0Var2.m1();
                        if (x6x0Var2.J1() == 1) {
                            long jIntValue3 = ((Integer) btw0.w0.a(null)).intValue();
                            long jNextInt3 = new Random().nextInt(5000);
                            kxw0Var5.k.getClass();
                            jMax = Math.max(500L, ((jIntValue3 * 1000) + jNextInt3) - SystemClock.elapsedRealtime());
                            if (jMax > 500) {
                                kxw0.g(uuw0Var5);
                                quw0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                            }
                            kxw0.f(b1x0Var);
                            b1x0Var.m1();
                            ezw0Var = b1x0Var.m;
                            if (ezw0Var == null) {
                                ezw0Var = new ezw0(b1x0Var, kxw0Var4, (byte) 0);
                                b1x0Var.m = ezw0Var;
                            }
                            ezw0Var.b(jMax);
                        }
                    }
                    wvw0Var.p.b(true);
                }
                uuw0 uuw0Var17 = kxw0Var.f;
                kxw0.g(uuw0Var17);
                uuw0Var17.g.a("Failed to load metadata: Metadata bundle is null");
                numValueOf = null;
                if (numValueOf != null) {
                    stringArray = kxw0Var.f19080a.getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = null;
                    } else {
                        listAsList = Arrays.asList(stringArray);
                    }
                } else {
                    listAsList = null;
                }
                if (listAsList != null) {
                    vtw0Var2.l = listAsList;
                    break;
                }
                if (listAsList.isEmpty()) {
                    it = listAsList.iterator();
                    do {
                        if (it.hasNext()) {
                            vtw0Var2.l = listAsList;
                            break;
                        } else {
                            str4 = (String) it.next();
                            x6x0Var3 = kxw0Var8.i;
                            kxw0.e(x6x0Var3);
                        }
                    } while (x6x0Var3.q2("safelisted event", str4));
                } else {
                    kxw0.g(uuw0Var2);
                    uuw0Var2.l.a("Safelisted event list is empty. Ignoring");
                }
                if (packageManager != null) {
                    vtw0Var2.o = cjx.U(context2) ? 1 : 0;
                } else {
                    vtw0Var2.o = 0;
                }
                ((kxw0) vtw0Var2.b).Y.incrementAndGet();
                vtw0Var2.c = true;
                o1x0Var = new o1x0(kxw0Var6);
                kxw0Var2 = (kxw0) o1x0Var.b;
                kxw0Var2.A++;
                o1x0Var.f1();
                kxw0Var6.u = o1x0Var;
                if (!o1x0Var.c) {
                    jf4.n(str);
                    return;
                }
                o1x0Var.d = (JobScheduler) ((kxw0) o1x0Var.b).f19080a.getSystemService("jobscheduler");
                kxw0Var2.Y.incrementAndGet();
                o1x0Var.c = true;
                kxw0.g(uuw0Var);
                uuw0Var3 = uuw0Var;
                quw0Var = uuw0Var3.n;
                quw0Var2 = uuw0Var3.m;
                quw0Var3 = uuw0Var3.o;
                quw0Var4 = uuw0Var3.g;
                bkw0Var.s1();
                quw0Var2.b(161000L, "App measurement initialized, version");
                kxw0.g(uuw0Var3);
                quw0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                strR1 = vtw0Var.r1();
                if (x6x0Var4.R1(strR1, bkw0Var.d)) {
                    kxw0.g(uuw0Var3);
                    quw0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                } else {
                    kxw0.g(uuw0Var3);
                    quw0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strR1)));
                }
                kxw0.g(uuw0Var3);
                quw0Var.a("Debug-level message logging enabled");
                i2 = kxw0Var6.A;
                atomicInteger = kxw0Var6.Y;
                if (i2 != atomicInteger.get()) {
                    kxw0.g(uuw0Var3);
                    quw0Var4.c(Integer.valueOf(kxw0Var6.A), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                }
                kxw0Var6.v = true;
                j = kxw0Var6.Z;
                b1x0Var = kxw0Var6.m;
                kxw0.g(fxw0Var);
                fxw0Var.m1();
                kxw0.d(kxw0Var6.u);
                iQ1 = kxw0Var6.u.q1();
                miw0.a();
                zX1 = bkw0Var.x1(null, btw0.P0);
                if (iQ1 == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (zX1) {
                    x6x0Var4.m1();
                    if (x6x0Var4.J1() == 1) {
                        x6x0Var4.m1();
                        IntentFilter intentFilter4 = new IntentFilter();
                        intentFilter4.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter4.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z2 = z;
                        uuw0Var4 = uuw0Var3;
                        jiq0.t0(kxw0Var7.f19080a, new md3(kxw0Var7, (byte) 9, false), intentFilter4);
                        uuw0 uuw0Var18 = kxw0Var7.f;
                        kxw0.g(uuw0Var18);
                        uuw0Var18.n.a("Registered app receiver");
                        if (z2) {
                            kxw0.d(kxw0Var6.u);
                            kxw0Var6.u.p1(((Long) btw0.C.a(null)).longValue());
                        }
                    } else if (z) {
                        z = true;
                        x6x0Var4.m1();
                        IntentFilter intentFilter5 = new IntentFilter();
                        intentFilter5.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter5.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z2 = z;
                        uuw0Var4 = uuw0Var3;
                        jiq0.t0(kxw0Var7.f19080a, new md3(kxw0Var7, (byte) 9, false), intentFilter5);
                        uuw0 uuw0Var19 = kxw0Var7.f;
                        kxw0.g(uuw0Var19);
                        uuw0Var19.n.a("Registered app receiver");
                        if (z2) {
                            kxw0.d(kxw0Var6.u);
                            kxw0Var6.u.p1(((Long) btw0.C.a(null)).longValue());
                        }
                    } else {
                        uuw0Var4 = uuw0Var3;
                    }
                } else if (z) {
                    z = true;
                    x6x0Var4.m1();
                    IntentFilter intentFilter6 = new IntentFilter();
                    intentFilter6.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter6.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z2 = z;
                    uuw0Var4 = uuw0Var3;
                    jiq0.t0(kxw0Var7.f19080a, new md3(kxw0Var7, (byte) 9, false), intentFilter6);
                    uuw0 uuw0Var110 = kxw0Var7.f;
                    kxw0.g(uuw0Var110);
                    uuw0Var110.n.a("Registered app receiver");
                    if (z2) {
                        kxw0.d(kxw0Var6.u);
                        kxw0Var6.u.p1(((Long) btw0.C.a(null)).longValue());
                    }
                } else {
                    uuw0Var4 = uuw0Var3;
                }
                o24Var = wvw0Var.h;
                xyw0VarT1 = wvw0Var.t1();
                int i6 = xyw0VarT1.b;
                tyw0VarC1 = bkw0Var.C1("google_analytics_default_allow_ad_storage", false);
                tyw0VarC2 = bkw0Var.C1("google_analytics_default_allow_analytics_storage", false);
                wyw0Var = wyw0.ANALYTICS_STORAGE;
                tyw0Var = tyw0.UNINITIALIZED;
                if (tyw0VarC1 == tyw0Var) {
                    kxw0Var3 = kxw0Var6;
                    quw0Var5 = quw0Var4;
                    x6x0Var = x6x0Var4;
                    if (xyw0.l(-10, wvw0Var.q1().getInt("consent_source", 100))) {
                        EnumMap enumMap3 = new EnumMap(wyw0.class);
                        enumMap3.put(wyw0.AD_STORAGE, tyw0VarC1);
                        enumMap3.put(wyw0Var, tyw0VarC2);
                        xyw0Var = new xyw0(enumMap3, -10);
                    } else {
                        if (!TextUtils.isEmpty(kxw0Var3.k().s1())) {
                            kxw0.f(b1x0Var);
                            b1x0Var.H1(new xyw0(-10), false);
                        }
                        xyw0Var = null;
                    }
                } else {
                    kxw0Var3 = kxw0Var6;
                    quw0Var5 = quw0Var4;
                    x6x0Var = x6x0Var4;
                    if (xyw0.l(-10, wvw0Var.q1().getInt("consent_source", 100))) {
                        EnumMap enumMap4 = new EnumMap(wyw0.class);
                        enumMap4.put(wyw0.AD_STORAGE, tyw0VarC1);
                        enumMap4.put(wyw0Var, tyw0VarC2);
                        xyw0Var = new xyw0(enumMap4, -10);
                    } else {
                        if (!TextUtils.isEmpty(kxw0Var3.k().s1())) {
                            kxw0.f(b1x0Var);
                            b1x0Var.H1(new xyw0(-10), false);
                        }
                        xyw0Var = null;
                    }
                }
                if (xyw0Var != null) {
                    kxw0.f(b1x0Var);
                    b1x0Var.H1(xyw0Var, true);
                } else {
                    xyw0Var = xyw0VarT1;
                }
                kxw0.f(b1x0Var);
                kxw0Var4 = (kxw0) b1x0Var.b;
                b1x0Var.L1(xyw0Var);
                wvw0Var.m1();
                int i7 = jmw0.b(wvw0Var.q1().getString("dma_consent_settings", null)).f16787a;
                tyw0VarC3 = bkw0Var.C1("google_analytics_default_allow_ad_personalization_signals", true);
                if (tyw0VarC3 != tyw0Var) {
                    kxw0.g(uuw0Var4);
                    quw0Var3.b(tyw0VarC3, "Default ad personalization consent from Manifest");
                }
                tyw0VarC4 = bkw0Var.C1("google_analytics_default_allow_ad_user_data", true);
                if (tyw0VarC4 == tyw0Var) {
                    if (!TextUtils.isEmpty(kxw0Var3.k().s1())) {
                        kxw0.f(b1x0Var);
                        b1x0Var.G1(new jmw0(-10, (Boolean) null, (Boolean) null, (String) null), true);
                    }
                } else if (!TextUtils.isEmpty(kxw0Var3.k().s1())) {
                    kxw0.f(b1x0Var);
                    b1x0Var.G1(new jmw0(-10, (Boolean) null, (Boolean) null, (String) null), true);
                }
                boolZ1 = bkw0Var.z1("google_analytics_tcf_data_enabled");
                if (boolZ1 != null) {
                    kxw0.g(uuw0Var4);
                    quw0Var.a("TCF client enabled.");
                    kxw0.f(b1x0Var);
                    b1x0Var.m1();
                    uuw0 uuw0Var111 = kxw0Var4.f;
                    kxw0.g(uuw0Var111);
                    uuw0Var111.n.a("Register tcfPrefChangeListener.");
                    if (b1x0Var.u == null) {
                        b1x0Var.v = new ezw0(b1x0Var, kxw0Var4, (byte) 2);
                        b1x0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: a.x0x0
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                b1x0 b1x0Var2 = b1x0Var;
                                b1x0Var2.getClass();
                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                    uuw0 uuw0Var112 = ((kxw0) b1x0Var2.b).f;
                                    kxw0.g(uuw0Var112);
                                    uuw0Var112.o.a("IABTCF_TCString change picked up in listener.");
                                    ezw0 ezw0Var2 = b1x0Var2.v;
                                    s0x.H(ezw0Var2);
                                    ezw0Var2.b(500L);
                                }
                            }
                        };
                    }
                    wvw0 wvw0Var7 = kxw0Var4.e;
                    kxw0.e(wvw0Var7);
                    wvw0Var7.r1().registerOnSharedPreferenceChangeListener(b1x0Var.u);
                    kxw0.f(b1x0Var);
                    b1x0Var.r1();
                } else {
                    kxw0.g(uuw0Var4);
                    quw0Var.a("TCF client enabled.");
                    kxw0.f(b1x0Var);
                    b1x0Var.m1();
                    uuw0 uuw0Var112 = kxw0Var4.f;
                    kxw0.g(uuw0Var112);
                    uuw0Var112.n.a("Register tcfPrefChangeListener.");
                    if (b1x0Var.u == null) {
                        b1x0Var.v = new ezw0(b1x0Var, kxw0Var4, (byte) 2);
                        b1x0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: a.x0x0
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                b1x0 b1x0Var2 = b1x0Var;
                                b1x0Var2.getClass();
                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                    uuw0 uuw0Var113 = ((kxw0) b1x0Var2.b).f;
                                    kxw0.g(uuw0Var113);
                                    uuw0Var113.o.a("IABTCF_TCString change picked up in listener.");
                                    ezw0 ezw0Var2 = b1x0Var2.v;
                                    s0x.H(ezw0Var2);
                                    ezw0Var2.b(500L);
                                }
                            }
                        };
                    }
                    wvw0 wvw0Var8 = kxw0Var4.e;
                    kxw0.e(wvw0Var8);
                    wvw0Var8.r1().registerOnSharedPreferenceChangeListener(b1x0Var.u);
                    kxw0.f(b1x0Var);
                    b1x0Var.r1();
                }
                rvw0Var = wvw0Var.g;
                if (rvw0Var.a() == 0) {
                    kxw0.g(uuw0Var4);
                    quw0Var3.b(Long.valueOf(j), "Persisting first open");
                    rvw0Var.b(j);
                }
                kxw0.f(b1x0Var);
                zlt0Var = b1x0Var.r;
                if (zlt0Var.t()) {
                    wvw0 wvw0Var9 = ((kxw0) zlt0Var.b).e;
                    kxw0.e(wvw0Var9);
                    wvw0Var9.x.u(null);
                }
                if (kxw0Var3.c()) {
                    if (kxw0Var3.a()) {
                        x6x0Var2 = x6x0Var;
                        if (x6x0Var2.P1("android.permission.INTERNET")) {
                            kxw0.g(uuw0Var4);
                            quw0Var6 = quw0Var5;
                            quw0Var6.a("App is missing INTERNET permission");
                        } else {
                            quw0Var6 = quw0Var5;
                        }
                        if (!x6x0Var2.P1("android.permission.ACCESS_NETWORK_STATE")) {
                            kxw0.g(uuw0Var4);
                            quw0Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                        }
                        kxw0Var5 = kxw0Var3;
                        context = kxw0Var5.f19080a;
                        if (!grv0.a(context).c()) {
                            if (!x6x0.h2(context)) {
                                kxw0.g(uuw0Var4);
                                quw0Var6.a("AppMeasurementReceiver not registered/enabled");
                            }
                            if (!x6x0.H1(context)) {
                                kxw0.g(uuw0Var4);
                                quw0Var6.a("AppMeasurementService not registered/enabled");
                            }
                        }
                        kxw0.g(uuw0Var4);
                        quw0Var6.a("Uploading is not possible. App measurement disabled");
                    } else {
                        kxw0Var5 = kxw0Var3;
                        x6x0Var2 = x6x0Var;
                    }
                    uuw0Var5 = uuw0Var4;
                } else {
                    kxw0Var5 = kxw0Var3;
                    x6x0Var2 = x6x0Var;
                    if (TextUtils.isEmpty(kxw0Var5.k().s1())) {
                        String strS5 = kxw0Var5.k().s1();
                        wvw0Var.m1();
                        String string5 = wvw0Var.q1().getString("gmp_app_id", null);
                        zIsEmpty = TextUtils.isEmpty(strS5);
                        boolean zIsEmpty4 = TextUtils.isEmpty(string5);
                        if (zIsEmpty) {
                            o24Var2 = o24Var;
                        } else {
                            o24Var2 = o24Var;
                        }
                        String strS6 = kxw0Var5.k().s1();
                        wvw0Var.m1();
                        SharedPreferences.Editor editorEdit6 = wvw0Var.q1().edit();
                        editorEdit6.putString("gmp_app_id", strS6);
                        editorEdit6.apply();
                    } else {
                        o24Var2 = o24Var;
                    }
                    if (!wvw0Var.t1().i(wyw0Var)) {
                        o24Var2.u(null);
                    }
                    kxw0.f(b1x0Var);
                    b1x0Var.h.set(o24Var2.t());
                    kxw0Var7.f19080a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    uuw0Var5 = uuw0Var4;
                    if (!TextUtils.isEmpty(kxw0Var5.k().s1())) {
                        zA = kxw0Var5.a();
                        sharedPreferences = wvw0Var.d;
                        if (sharedPreferences == null) {
                            zContains = false;
                        } else {
                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                        }
                        if (!zContains) {
                            wvw0Var.u1(!zA);
                        }
                        if (zA) {
                            kxw0.f(b1x0Var);
                            b1x0Var.x1();
                        }
                        w4x0 w4x0Var4 = kxw0Var5.h;
                        kxw0.f(w4x0Var4);
                        w4x0Var4.f.e();
                        kxw0Var5.i().p1(new AtomicReference());
                        kxw0Var5.i().q1(wvw0Var.z.s());
                    }
                }
                miw0.a();
                if (bkw0Var.x1(null, btw0.P0)) {
                    x6x0Var2.m1();
                    if (x6x0Var2.J1() == 1) {
                        long jIntValue4 = ((Integer) btw0.w0.a(null)).intValue();
                        long jNextInt4 = new Random().nextInt(5000);
                        kxw0Var5.k.getClass();
                        jMax = Math.max(500L, ((jIntValue4 * 1000) + jNextInt4) - SystemClock.elapsedRealtime());
                        if (jMax > 500) {
                            kxw0.g(uuw0Var5);
                            quw0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                        }
                        kxw0.f(b1x0Var);
                        b1x0Var.m1();
                        ezw0Var = b1x0Var.m;
                        if (ezw0Var == null) {
                            ezw0Var = new ezw0(b1x0Var, kxw0Var4, (byte) 0);
                            b1x0Var.m = ezw0Var;
                        }
                        ezw0Var.b(jMax);
                    }
                }
                wvw0Var.p.b(true);
            }
            kxw0.g(uuw0Var9);
            uuw0Var2 = uuw0Var9;
            str = "Can't initialize twice";
            uuw0Var = uuw0Var6;
            uuw0Var2.g.b(uuw0.q1(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
            strW = vtw0Var2.n;
            if (!TextUtils.isEmpty(strW)) {
                strW = o5n0.w(context2, kxw0Var8.p);
            }
            if (TextUtils.isEmpty(strW)) {
                str5 = strW;
            }
            vtw0Var2.p = str5;
            if (iB == 0) {
                kxw0.g(uuw0Var2);
                uuw0Var2.o.c(vtw0Var2.d, vtw0Var2.p, "App measurement enabled for app package, google app id");
            }
        } catch (IllegalStateException e2) {
            kxw0.g(uuw0Var2);
            uuw0Var2.g.c(uuw0.q1(packageName), e2, "Fetching Google App Id failed with exception. appId");
        }
        str2 = "Unknown";
        string = str2;
        str3 = str7;
        i = Integer.MIN_VALUE;
        vtw0Var2.d = packageName;
        vtw0Var2.g = str3;
        vtw0Var2.e = str2;
        vtw0Var2.f = i;
        vtw0Var2.h = string;
        vtw0Var2.i = 0L;
        iB = kxw0Var8.b();
        if (iB != 0) {
            kxw0.g(uuw0Var2);
            uuw0Var2.o.a("App measurement collection enabled");
        } else if (iB != 1) {
            kxw0.g(uuw0Var2);
            uuw0Var2.m.a("App measurement deactivated via the manifest");
        } else if (iB != 3) {
            kxw0.g(uuw0Var2);
            uuw0Var2.m.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iB != 4) {
            kxw0.g(uuw0Var2);
            uuw0Var2.m.a("App measurement disabled via the manifest");
        } else if (iB != 6) {
            kxw0.g(uuw0Var2);
            uuw0Var2.l.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iB != 7) {
            kxw0.g(uuw0Var2);
            uuw0Var2.m.a("App measurement disabled via the global data collection setting");
        } else if (iB != 8) {
            kxw0.g(uuw0Var2);
            uuw0Var2.m.a("App measurement disabled");
            kxw0.g(uuw0Var2);
            uuw0Var2.h.a("Invalid scion state in identity");
        } else {
            kxw0.g(uuw0Var2);
            uuw0Var2.m.a("App measurement disabled due to denied storage consent");
        }
        vtw0Var2.p = str5;
        vtw0Var2.l = null;
        bkw0 bkw0Var3 = kxw0Var8.d;
        kxw0Var = (kxw0) bkw0Var3.b;
        s0x.E("analytics.safelisted_events");
        bundleY1 = bkw0Var3.y1();
        if (bundleY1 == null) {
            if (!bundleY1.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleY1.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                stringArray = kxw0Var.f19080a.getResources().getStringArray(numValueOf.intValue());
                if (stringArray == null) {
                    listAsList = null;
                } else {
                    listAsList = Arrays.asList(stringArray);
                }
            } else {
                listAsList = null;
            }
            if (listAsList != null) {
                vtw0Var2.l = listAsList;
                break;
            }
            if (listAsList.isEmpty()) {
                it = listAsList.iterator();
                do {
                    if (it.hasNext()) {
                        vtw0Var2.l = listAsList;
                        break;
                    } else {
                        str4 = (String) it.next();
                        x6x0Var3 = kxw0Var8.i;
                        kxw0.e(x6x0Var3);
                    }
                } while (x6x0Var3.q2("safelisted event", str4));
            } else {
                kxw0.g(uuw0Var2);
                uuw0Var2.l.a("Safelisted event list is empty. Ignoring");
            }
            if (packageManager != null) {
                vtw0Var2.o = cjx.U(context2) ? 1 : 0;
            } else {
                vtw0Var2.o = 0;
            }
            ((kxw0) vtw0Var2.b).Y.incrementAndGet();
            vtw0Var2.c = true;
            o1x0Var = new o1x0(kxw0Var6);
            kxw0Var2 = (kxw0) o1x0Var.b;
            kxw0Var2.A++;
            o1x0Var.f1();
            kxw0Var6.u = o1x0Var;
            if (!o1x0Var.c) {
                jf4.n(str);
                return;
            }
            o1x0Var.d = (JobScheduler) ((kxw0) o1x0Var.b).f19080a.getSystemService("jobscheduler");
            kxw0Var2.Y.incrementAndGet();
            o1x0Var.c = true;
            kxw0.g(uuw0Var);
            uuw0Var3 = uuw0Var;
            quw0Var = uuw0Var3.n;
            quw0Var2 = uuw0Var3.m;
            quw0Var3 = uuw0Var3.o;
            quw0Var4 = uuw0Var3.g;
            bkw0Var.s1();
            quw0Var2.b(161000L, "App measurement initialized, version");
            kxw0.g(uuw0Var3);
            quw0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
            strR1 = vtw0Var.r1();
            if (x6x0Var4.R1(strR1, bkw0Var.d)) {
                kxw0.g(uuw0Var3);
                quw0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                kxw0.g(uuw0Var3);
                quw0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strR1)));
            }
            kxw0.g(uuw0Var3);
            quw0Var.a("Debug-level message logging enabled");
            i2 = kxw0Var6.A;
            atomicInteger = kxw0Var6.Y;
            if (i2 != atomicInteger.get()) {
                kxw0.g(uuw0Var3);
                quw0Var4.c(Integer.valueOf(kxw0Var6.A), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
            }
            kxw0Var6.v = true;
            j = kxw0Var6.Z;
            b1x0Var = kxw0Var6.m;
            kxw0.g(fxw0Var);
            fxw0Var.m1();
            kxw0.d(kxw0Var6.u);
            iQ1 = kxw0Var6.u.q1();
            miw0.a();
            zX1 = bkw0Var.x1(null, btw0.P0);
            if (iQ1 == 2) {
                z = true;
            } else {
                z = false;
            }
            if (zX1) {
                x6x0Var4.m1();
                if (x6x0Var4.J1() == 1) {
                    x6x0Var4.m1();
                    IntentFilter intentFilter7 = new IntentFilter();
                    intentFilter7.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter7.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z2 = z;
                    uuw0Var4 = uuw0Var3;
                    jiq0.t0(kxw0Var7.f19080a, new md3(kxw0Var7, (byte) 9, false), intentFilter7);
                    uuw0 uuw0Var113 = kxw0Var7.f;
                    kxw0.g(uuw0Var113);
                    uuw0Var113.n.a("Registered app receiver");
                    if (z2) {
                        kxw0.d(kxw0Var6.u);
                        kxw0Var6.u.p1(((Long) btw0.C.a(null)).longValue());
                    }
                } else if (z) {
                    z = true;
                    x6x0Var4.m1();
                    IntentFilter intentFilter8 = new IntentFilter();
                    intentFilter8.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter8.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z2 = z;
                    uuw0Var4 = uuw0Var3;
                    jiq0.t0(kxw0Var7.f19080a, new md3(kxw0Var7, (byte) 9, false), intentFilter8);
                    uuw0 uuw0Var114 = kxw0Var7.f;
                    kxw0.g(uuw0Var114);
                    uuw0Var114.n.a("Registered app receiver");
                    if (z2) {
                        kxw0.d(kxw0Var6.u);
                        kxw0Var6.u.p1(((Long) btw0.C.a(null)).longValue());
                    }
                } else {
                    uuw0Var4 = uuw0Var3;
                }
            } else if (z) {
                z = true;
                x6x0Var4.m1();
                IntentFilter intentFilter9 = new IntentFilter();
                intentFilter9.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter9.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z2 = z;
                uuw0Var4 = uuw0Var3;
                jiq0.t0(kxw0Var7.f19080a, new md3(kxw0Var7, (byte) 9, false), intentFilter9);
                uuw0 uuw0Var115 = kxw0Var7.f;
                kxw0.g(uuw0Var115);
                uuw0Var115.n.a("Registered app receiver");
                if (z2) {
                    kxw0.d(kxw0Var6.u);
                    kxw0Var6.u.p1(((Long) btw0.C.a(null)).longValue());
                }
            } else {
                uuw0Var4 = uuw0Var3;
            }
            o24Var = wvw0Var.h;
            xyw0VarT1 = wvw0Var.t1();
            int i8 = xyw0VarT1.b;
            tyw0VarC1 = bkw0Var.C1("google_analytics_default_allow_ad_storage", false);
            tyw0VarC2 = bkw0Var.C1("google_analytics_default_allow_analytics_storage", false);
            wyw0Var = wyw0.ANALYTICS_STORAGE;
            tyw0Var = tyw0.UNINITIALIZED;
            if (tyw0VarC1 == tyw0Var) {
                kxw0Var3 = kxw0Var6;
                quw0Var5 = quw0Var4;
                x6x0Var = x6x0Var4;
                if (xyw0.l(-10, wvw0Var.q1().getInt("consent_source", 100))) {
                    EnumMap enumMap5 = new EnumMap(wyw0.class);
                    enumMap5.put(wyw0.AD_STORAGE, tyw0VarC1);
                    enumMap5.put(wyw0Var, tyw0VarC2);
                    xyw0Var = new xyw0(enumMap5, -10);
                } else {
                    if (!TextUtils.isEmpty(kxw0Var3.k().s1())) {
                        kxw0.f(b1x0Var);
                        b1x0Var.H1(new xyw0(-10), false);
                    }
                    xyw0Var = null;
                }
            } else {
                kxw0Var3 = kxw0Var6;
                quw0Var5 = quw0Var4;
                x6x0Var = x6x0Var4;
                if (xyw0.l(-10, wvw0Var.q1().getInt("consent_source", 100))) {
                    EnumMap enumMap6 = new EnumMap(wyw0.class);
                    enumMap6.put(wyw0.AD_STORAGE, tyw0VarC1);
                    enumMap6.put(wyw0Var, tyw0VarC2);
                    xyw0Var = new xyw0(enumMap6, -10);
                } else {
                    if (!TextUtils.isEmpty(kxw0Var3.k().s1())) {
                        kxw0.f(b1x0Var);
                        b1x0Var.H1(new xyw0(-10), false);
                    }
                    xyw0Var = null;
                }
            }
            if (xyw0Var != null) {
                kxw0.f(b1x0Var);
                b1x0Var.H1(xyw0Var, true);
            } else {
                xyw0Var = xyw0VarT1;
            }
            kxw0.f(b1x0Var);
            kxw0Var4 = (kxw0) b1x0Var.b;
            b1x0Var.L1(xyw0Var);
            wvw0Var.m1();
            int i9 = jmw0.b(wvw0Var.q1().getString("dma_consent_settings", null)).f16787a;
            tyw0VarC3 = bkw0Var.C1("google_analytics_default_allow_ad_personalization_signals", true);
            if (tyw0VarC3 != tyw0Var) {
                kxw0.g(uuw0Var4);
                quw0Var3.b(tyw0VarC3, "Default ad personalization consent from Manifest");
            }
            tyw0VarC4 = bkw0Var.C1("google_analytics_default_allow_ad_user_data", true);
            if (tyw0VarC4 == tyw0Var) {
                if (!TextUtils.isEmpty(kxw0Var3.k().s1())) {
                    kxw0.f(b1x0Var);
                    b1x0Var.G1(new jmw0(-10, (Boolean) null, (Boolean) null, (String) null), true);
                }
            } else if (!TextUtils.isEmpty(kxw0Var3.k().s1())) {
                kxw0.f(b1x0Var);
                b1x0Var.G1(new jmw0(-10, (Boolean) null, (Boolean) null, (String) null), true);
            }
            boolZ1 = bkw0Var.z1("google_analytics_tcf_data_enabled");
            if (boolZ1 != null) {
                kxw0.g(uuw0Var4);
                quw0Var.a("TCF client enabled.");
                kxw0.f(b1x0Var);
                b1x0Var.m1();
                uuw0 uuw0Var116 = kxw0Var4.f;
                kxw0.g(uuw0Var116);
                uuw0Var116.n.a("Register tcfPrefChangeListener.");
                if (b1x0Var.u == null) {
                    b1x0Var.v = new ezw0(b1x0Var, kxw0Var4, (byte) 2);
                    b1x0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: a.x0x0
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                            b1x0 b1x0Var2 = b1x0Var;
                            b1x0Var2.getClass();
                            if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                uuw0 uuw0Var117 = ((kxw0) b1x0Var2.b).f;
                                kxw0.g(uuw0Var117);
                                uuw0Var117.o.a("IABTCF_TCString change picked up in listener.");
                                ezw0 ezw0Var2 = b1x0Var2.v;
                                s0x.H(ezw0Var2);
                                ezw0Var2.b(500L);
                            }
                        }
                    };
                }
                wvw0 wvw0Var10 = kxw0Var4.e;
                kxw0.e(wvw0Var10);
                wvw0Var10.r1().registerOnSharedPreferenceChangeListener(b1x0Var.u);
                kxw0.f(b1x0Var);
                b1x0Var.r1();
            } else {
                kxw0.g(uuw0Var4);
                quw0Var.a("TCF client enabled.");
                kxw0.f(b1x0Var);
                b1x0Var.m1();
                uuw0 uuw0Var117 = kxw0Var4.f;
                kxw0.g(uuw0Var117);
                uuw0Var117.n.a("Register tcfPrefChangeListener.");
                if (b1x0Var.u == null) {
                    b1x0Var.v = new ezw0(b1x0Var, kxw0Var4, (byte) 2);
                    b1x0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: a.x0x0
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                            b1x0 b1x0Var2 = b1x0Var;
                            b1x0Var2.getClass();
                            if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                uuw0 uuw0Var118 = ((kxw0) b1x0Var2.b).f;
                                kxw0.g(uuw0Var118);
                                uuw0Var118.o.a("IABTCF_TCString change picked up in listener.");
                                ezw0 ezw0Var2 = b1x0Var2.v;
                                s0x.H(ezw0Var2);
                                ezw0Var2.b(500L);
                            }
                        }
                    };
                }
                wvw0 wvw0Var11 = kxw0Var4.e;
                kxw0.e(wvw0Var11);
                wvw0Var11.r1().registerOnSharedPreferenceChangeListener(b1x0Var.u);
                kxw0.f(b1x0Var);
                b1x0Var.r1();
            }
            rvw0Var = wvw0Var.g;
            if (rvw0Var.a() == 0) {
                kxw0.g(uuw0Var4);
                quw0Var3.b(Long.valueOf(j), "Persisting first open");
                rvw0Var.b(j);
            }
            kxw0.f(b1x0Var);
            zlt0Var = b1x0Var.r;
            if (zlt0Var.t()) {
                wvw0 wvw0Var12 = ((kxw0) zlt0Var.b).e;
                kxw0.e(wvw0Var12);
                wvw0Var12.x.u(null);
            }
            if (kxw0Var3.c()) {
                if (kxw0Var3.a()) {
                    x6x0Var2 = x6x0Var;
                    if (x6x0Var2.P1("android.permission.INTERNET")) {
                        kxw0.g(uuw0Var4);
                        quw0Var6 = quw0Var5;
                        quw0Var6.a("App is missing INTERNET permission");
                    } else {
                        quw0Var6 = quw0Var5;
                    }
                    if (!x6x0Var2.P1("android.permission.ACCESS_NETWORK_STATE")) {
                        kxw0.g(uuw0Var4);
                        quw0Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                    }
                    kxw0Var5 = kxw0Var3;
                    context = kxw0Var5.f19080a;
                    if (!grv0.a(context).c()) {
                        if (!x6x0.h2(context)) {
                            kxw0.g(uuw0Var4);
                            quw0Var6.a("AppMeasurementReceiver not registered/enabled");
                        }
                        if (!x6x0.H1(context)) {
                            kxw0.g(uuw0Var4);
                            quw0Var6.a("AppMeasurementService not registered/enabled");
                        }
                    }
                    kxw0.g(uuw0Var4);
                    quw0Var6.a("Uploading is not possible. App measurement disabled");
                } else {
                    kxw0Var5 = kxw0Var3;
                    x6x0Var2 = x6x0Var;
                }
                uuw0Var5 = uuw0Var4;
            } else {
                kxw0Var5 = kxw0Var3;
                x6x0Var2 = x6x0Var;
                if (TextUtils.isEmpty(kxw0Var5.k().s1())) {
                    String strS7 = kxw0Var5.k().s1();
                    wvw0Var.m1();
                    String string6 = wvw0Var.q1().getString("gmp_app_id", null);
                    zIsEmpty = TextUtils.isEmpty(strS7);
                    boolean zIsEmpty5 = TextUtils.isEmpty(string6);
                    if (zIsEmpty) {
                        o24Var2 = o24Var;
                    } else {
                        o24Var2 = o24Var;
                    }
                    String strS8 = kxw0Var5.k().s1();
                    wvw0Var.m1();
                    SharedPreferences.Editor editorEdit7 = wvw0Var.q1().edit();
                    editorEdit7.putString("gmp_app_id", strS8);
                    editorEdit7.apply();
                } else {
                    o24Var2 = o24Var;
                }
                if (!wvw0Var.t1().i(wyw0Var)) {
                    o24Var2.u(null);
                }
                kxw0.f(b1x0Var);
                b1x0Var.h.set(o24Var2.t());
                kxw0Var7.f19080a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                uuw0Var5 = uuw0Var4;
                if (!TextUtils.isEmpty(kxw0Var5.k().s1())) {
                    zA = kxw0Var5.a();
                    sharedPreferences = wvw0Var.d;
                    if (sharedPreferences == null) {
                        zContains = false;
                    } else {
                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                    }
                    if (!zContains) {
                        wvw0Var.u1(!zA);
                    }
                    if (zA) {
                        kxw0.f(b1x0Var);
                        b1x0Var.x1();
                    }
                    w4x0 w4x0Var5 = kxw0Var5.h;
                    kxw0.f(w4x0Var5);
                    w4x0Var5.f.e();
                    kxw0Var5.i().p1(new AtomicReference());
                    kxw0Var5.i().q1(wvw0Var.z.s());
                }
            }
            miw0.a();
            if (bkw0Var.x1(null, btw0.P0)) {
                x6x0Var2.m1();
                if (x6x0Var2.J1() == 1) {
                    long jIntValue5 = ((Integer) btw0.w0.a(null)).intValue();
                    long jNextInt5 = new Random().nextInt(5000);
                    kxw0Var5.k.getClass();
                    jMax = Math.max(500L, ((jIntValue5 * 1000) + jNextInt5) - SystemClock.elapsedRealtime());
                    if (jMax > 500) {
                        kxw0.g(uuw0Var5);
                        quw0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                    }
                    kxw0.f(b1x0Var);
                    b1x0Var.m1();
                    ezw0Var = b1x0Var.m;
                    if (ezw0Var == null) {
                        ezw0Var = new ezw0(b1x0Var, kxw0Var4, (byte) 0);
                        b1x0Var.m = ezw0Var;
                    }
                    ezw0Var.b(jMax);
                }
            }
            wvw0Var.p.b(true);
        }
        uuw0 uuw0Var118 = kxw0Var.f;
        kxw0.g(uuw0Var118);
        uuw0Var118.g.a("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = kxw0Var.f19080a.getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                listAsList = null;
            } else {
                listAsList = Arrays.asList(stringArray);
            }
        } else {
            listAsList = null;
        }
        if (listAsList != null) {
            vtw0Var2.l = listAsList;
            break;
        }
        if (listAsList.isEmpty()) {
            it = listAsList.iterator();
            do {
                if (it.hasNext()) {
                    vtw0Var2.l = listAsList;
                    break;
                } else {
                    str4 = (String) it.next();
                    x6x0Var3 = kxw0Var8.i;
                    kxw0.e(x6x0Var3);
                }
            } while (x6x0Var3.q2("safelisted event", str4));
        } else {
            kxw0.g(uuw0Var2);
            uuw0Var2.l.a("Safelisted event list is empty. Ignoring");
        }
        if (packageManager != null) {
            vtw0Var2.o = cjx.U(context2) ? 1 : 0;
        } else {
            vtw0Var2.o = 0;
        }
        ((kxw0) vtw0Var2.b).Y.incrementAndGet();
        vtw0Var2.c = true;
        o1x0Var = new o1x0(kxw0Var6);
        kxw0Var2 = (kxw0) o1x0Var.b;
        kxw0Var2.A++;
        o1x0Var.f1();
        kxw0Var6.u = o1x0Var;
        if (!o1x0Var.c) {
            jf4.n(str);
            return;
        }
        o1x0Var.d = (JobScheduler) ((kxw0) o1x0Var.b).f19080a.getSystemService("jobscheduler");
        kxw0Var2.Y.incrementAndGet();
        o1x0Var.c = true;
        kxw0.g(uuw0Var);
        uuw0Var3 = uuw0Var;
        quw0Var = uuw0Var3.n;
        quw0Var2 = uuw0Var3.m;
        quw0Var3 = uuw0Var3.o;
        quw0Var4 = uuw0Var3.g;
        bkw0Var.s1();
        quw0Var2.b(161000L, "App measurement initialized, version");
        kxw0.g(uuw0Var3);
        quw0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        strR1 = vtw0Var.r1();
        if (x6x0Var4.R1(strR1, bkw0Var.d)) {
            kxw0.g(uuw0Var3);
            quw0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            kxw0.g(uuw0Var3);
            quw0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strR1)));
        }
        kxw0.g(uuw0Var3);
        quw0Var.a("Debug-level message logging enabled");
        i2 = kxw0Var6.A;
        atomicInteger = kxw0Var6.Y;
        if (i2 != atomicInteger.get()) {
            kxw0.g(uuw0Var3);
            quw0Var4.c(Integer.valueOf(kxw0Var6.A), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
        }
        kxw0Var6.v = true;
        j = kxw0Var6.Z;
        b1x0Var = kxw0Var6.m;
        kxw0.g(fxw0Var);
        fxw0Var.m1();
        kxw0.d(kxw0Var6.u);
        iQ1 = kxw0Var6.u.q1();
        miw0.a();
        zX1 = bkw0Var.x1(null, btw0.P0);
        if (iQ1 == 2) {
            z = true;
        } else {
            z = false;
        }
        if (zX1) {
            x6x0Var4.m1();
            if (x6x0Var4.J1() == 1) {
                x6x0Var4.m1();
                IntentFilter intentFilter10 = new IntentFilter();
                intentFilter10.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter10.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z2 = z;
                uuw0Var4 = uuw0Var3;
                jiq0.t0(kxw0Var7.f19080a, new md3(kxw0Var7, (byte) 9, false), intentFilter10);
                uuw0 uuw0Var119 = kxw0Var7.f;
                kxw0.g(uuw0Var119);
                uuw0Var119.n.a("Registered app receiver");
                if (z2) {
                    kxw0.d(kxw0Var6.u);
                    kxw0Var6.u.p1(((Long) btw0.C.a(null)).longValue());
                }
            } else if (z) {
                z = true;
                x6x0Var4.m1();
                IntentFilter intentFilter11 = new IntentFilter();
                intentFilter11.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter11.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z2 = z;
                uuw0Var4 = uuw0Var3;
                jiq0.t0(kxw0Var7.f19080a, new md3(kxw0Var7, (byte) 9, false), intentFilter11);
                uuw0 uuw0Var1110 = kxw0Var7.f;
                kxw0.g(uuw0Var1110);
                uuw0Var1110.n.a("Registered app receiver");
                if (z2) {
                    kxw0.d(kxw0Var6.u);
                    kxw0Var6.u.p1(((Long) btw0.C.a(null)).longValue());
                }
            } else {
                uuw0Var4 = uuw0Var3;
            }
        } else if (z) {
            z = true;
            x6x0Var4.m1();
            IntentFilter intentFilter12 = new IntentFilter();
            intentFilter12.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intentFilter12.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            z2 = z;
            uuw0Var4 = uuw0Var3;
            jiq0.t0(kxw0Var7.f19080a, new md3(kxw0Var7, (byte) 9, false), intentFilter12);
            uuw0 uuw0Var1111 = kxw0Var7.f;
            kxw0.g(uuw0Var1111);
            uuw0Var1111.n.a("Registered app receiver");
            if (z2) {
                kxw0.d(kxw0Var6.u);
                kxw0Var6.u.p1(((Long) btw0.C.a(null)).longValue());
            }
        } else {
            uuw0Var4 = uuw0Var3;
        }
        o24Var = wvw0Var.h;
        xyw0VarT1 = wvw0Var.t1();
        int i10 = xyw0VarT1.b;
        tyw0VarC1 = bkw0Var.C1("google_analytics_default_allow_ad_storage", false);
        tyw0VarC2 = bkw0Var.C1("google_analytics_default_allow_analytics_storage", false);
        wyw0Var = wyw0.ANALYTICS_STORAGE;
        tyw0Var = tyw0.UNINITIALIZED;
        if (tyw0VarC1 == tyw0Var) {
            kxw0Var3 = kxw0Var6;
            quw0Var5 = quw0Var4;
            x6x0Var = x6x0Var4;
            if (xyw0.l(-10, wvw0Var.q1().getInt("consent_source", 100))) {
                EnumMap enumMap7 = new EnumMap(wyw0.class);
                enumMap7.put(wyw0.AD_STORAGE, tyw0VarC1);
                enumMap7.put(wyw0Var, tyw0VarC2);
                xyw0Var = new xyw0(enumMap7, -10);
            } else {
                if (!TextUtils.isEmpty(kxw0Var3.k().s1())) {
                    kxw0.f(b1x0Var);
                    b1x0Var.H1(new xyw0(-10), false);
                }
                xyw0Var = null;
            }
        } else {
            kxw0Var3 = kxw0Var6;
            quw0Var5 = quw0Var4;
            x6x0Var = x6x0Var4;
            if (xyw0.l(-10, wvw0Var.q1().getInt("consent_source", 100))) {
                EnumMap enumMap8 = new EnumMap(wyw0.class);
                enumMap8.put(wyw0.AD_STORAGE, tyw0VarC1);
                enumMap8.put(wyw0Var, tyw0VarC2);
                xyw0Var = new xyw0(enumMap8, -10);
            } else {
                if (!TextUtils.isEmpty(kxw0Var3.k().s1())) {
                    kxw0.f(b1x0Var);
                    b1x0Var.H1(new xyw0(-10), false);
                }
                xyw0Var = null;
            }
        }
        if (xyw0Var != null) {
            kxw0.f(b1x0Var);
            b1x0Var.H1(xyw0Var, true);
        } else {
            xyw0Var = xyw0VarT1;
        }
        kxw0.f(b1x0Var);
        kxw0Var4 = (kxw0) b1x0Var.b;
        b1x0Var.L1(xyw0Var);
        wvw0Var.m1();
        int i11 = jmw0.b(wvw0Var.q1().getString("dma_consent_settings", null)).f16787a;
        tyw0VarC3 = bkw0Var.C1("google_analytics_default_allow_ad_personalization_signals", true);
        if (tyw0VarC3 != tyw0Var) {
            kxw0.g(uuw0Var4);
            quw0Var3.b(tyw0VarC3, "Default ad personalization consent from Manifest");
        }
        tyw0VarC4 = bkw0Var.C1("google_analytics_default_allow_ad_user_data", true);
        if (tyw0VarC4 == tyw0Var) {
            if (!TextUtils.isEmpty(kxw0Var3.k().s1())) {
                kxw0.f(b1x0Var);
                b1x0Var.G1(new jmw0(-10, (Boolean) null, (Boolean) null, (String) null), true);
            }
        } else if (!TextUtils.isEmpty(kxw0Var3.k().s1())) {
            kxw0.f(b1x0Var);
            b1x0Var.G1(new jmw0(-10, (Boolean) null, (Boolean) null, (String) null), true);
        }
        boolZ1 = bkw0Var.z1("google_analytics_tcf_data_enabled");
        if (boolZ1 != null) {
            kxw0.g(uuw0Var4);
            quw0Var.a("TCF client enabled.");
            kxw0.f(b1x0Var);
            b1x0Var.m1();
            uuw0 uuw0Var1112 = kxw0Var4.f;
            kxw0.g(uuw0Var1112);
            uuw0Var1112.n.a("Register tcfPrefChangeListener.");
            if (b1x0Var.u == null) {
                b1x0Var.v = new ezw0(b1x0Var, kxw0Var4, (byte) 2);
                b1x0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: a.x0x0
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                        b1x0 b1x0Var2 = b1x0Var;
                        b1x0Var2.getClass();
                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                            uuw0 uuw0Var1113 = ((kxw0) b1x0Var2.b).f;
                            kxw0.g(uuw0Var1113);
                            uuw0Var1113.o.a("IABTCF_TCString change picked up in listener.");
                            ezw0 ezw0Var2 = b1x0Var2.v;
                            s0x.H(ezw0Var2);
                            ezw0Var2.b(500L);
                        }
                    }
                };
            }
            wvw0 wvw0Var13 = kxw0Var4.e;
            kxw0.e(wvw0Var13);
            wvw0Var13.r1().registerOnSharedPreferenceChangeListener(b1x0Var.u);
            kxw0.f(b1x0Var);
            b1x0Var.r1();
        } else {
            kxw0.g(uuw0Var4);
            quw0Var.a("TCF client enabled.");
            kxw0.f(b1x0Var);
            b1x0Var.m1();
            uuw0 uuw0Var1113 = kxw0Var4.f;
            kxw0.g(uuw0Var1113);
            uuw0Var1113.n.a("Register tcfPrefChangeListener.");
            if (b1x0Var.u == null) {
                b1x0Var.v = new ezw0(b1x0Var, kxw0Var4, (byte) 2);
                b1x0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: a.x0x0
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                        b1x0 b1x0Var2 = b1x0Var;
                        b1x0Var2.getClass();
                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                            uuw0 uuw0Var1114 = ((kxw0) b1x0Var2.b).f;
                            kxw0.g(uuw0Var1114);
                            uuw0Var1114.o.a("IABTCF_TCString change picked up in listener.");
                            ezw0 ezw0Var2 = b1x0Var2.v;
                            s0x.H(ezw0Var2);
                            ezw0Var2.b(500L);
                        }
                    }
                };
            }
            wvw0 wvw0Var14 = kxw0Var4.e;
            kxw0.e(wvw0Var14);
            wvw0Var14.r1().registerOnSharedPreferenceChangeListener(b1x0Var.u);
            kxw0.f(b1x0Var);
            b1x0Var.r1();
        }
        rvw0Var = wvw0Var.g;
        if (rvw0Var.a() == 0) {
            kxw0.g(uuw0Var4);
            quw0Var3.b(Long.valueOf(j), "Persisting first open");
            rvw0Var.b(j);
        }
        kxw0.f(b1x0Var);
        zlt0Var = b1x0Var.r;
        if (zlt0Var.t()) {
            wvw0 wvw0Var15 = ((kxw0) zlt0Var.b).e;
            kxw0.e(wvw0Var15);
            wvw0Var15.x.u(null);
        }
        if (kxw0Var3.c()) {
            if (kxw0Var3.a()) {
                x6x0Var2 = x6x0Var;
                if (x6x0Var2.P1("android.permission.INTERNET")) {
                    kxw0.g(uuw0Var4);
                    quw0Var6 = quw0Var5;
                    quw0Var6.a("App is missing INTERNET permission");
                } else {
                    quw0Var6 = quw0Var5;
                }
                if (!x6x0Var2.P1("android.permission.ACCESS_NETWORK_STATE")) {
                    kxw0.g(uuw0Var4);
                    quw0Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                }
                kxw0Var5 = kxw0Var3;
                context = kxw0Var5.f19080a;
                if (!grv0.a(context).c()) {
                    if (!x6x0.h2(context)) {
                        kxw0.g(uuw0Var4);
                        quw0Var6.a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!x6x0.H1(context)) {
                        kxw0.g(uuw0Var4);
                        quw0Var6.a("AppMeasurementService not registered/enabled");
                    }
                }
                kxw0.g(uuw0Var4);
                quw0Var6.a("Uploading is not possible. App measurement disabled");
            } else {
                kxw0Var5 = kxw0Var3;
                x6x0Var2 = x6x0Var;
            }
            uuw0Var5 = uuw0Var4;
        } else {
            kxw0Var5 = kxw0Var3;
            x6x0Var2 = x6x0Var;
            if (TextUtils.isEmpty(kxw0Var5.k().s1())) {
                String strS9 = kxw0Var5.k().s1();
                wvw0Var.m1();
                String string7 = wvw0Var.q1().getString("gmp_app_id", null);
                zIsEmpty = TextUtils.isEmpty(strS9);
                boolean zIsEmpty6 = TextUtils.isEmpty(string7);
                if (zIsEmpty) {
                    o24Var2 = o24Var;
                } else {
                    o24Var2 = o24Var;
                }
                String strS10 = kxw0Var5.k().s1();
                wvw0Var.m1();
                SharedPreferences.Editor editorEdit8 = wvw0Var.q1().edit();
                editorEdit8.putString("gmp_app_id", strS10);
                editorEdit8.apply();
            } else {
                o24Var2 = o24Var;
            }
            if (!wvw0Var.t1().i(wyw0Var)) {
                o24Var2.u(null);
            }
            kxw0.f(b1x0Var);
            b1x0Var.h.set(o24Var2.t());
            kxw0Var7.f19080a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            uuw0Var5 = uuw0Var4;
            if (!TextUtils.isEmpty(kxw0Var5.k().s1())) {
                zA = kxw0Var5.a();
                sharedPreferences = wvw0Var.d;
                if (sharedPreferences == null) {
                    zContains = false;
                } else {
                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                }
                if (!zContains) {
                    wvw0Var.u1(!zA);
                }
                if (zA) {
                    kxw0.f(b1x0Var);
                    b1x0Var.x1();
                }
                w4x0 w4x0Var6 = kxw0Var5.h;
                kxw0.f(w4x0Var6);
                w4x0Var6.f.e();
                kxw0Var5.i().p1(new AtomicReference());
                kxw0Var5.i().q1(wvw0Var.z.s());
            }
        }
        miw0.a();
        if (bkw0Var.x1(null, btw0.P0)) {
            x6x0Var2.m1();
            if (x6x0Var2.J1() == 1) {
                long jIntValue6 = ((Integer) btw0.w0.a(null)).intValue();
                long jNextInt6 = new Random().nextInt(5000);
                kxw0Var5.k.getClass();
                jMax = Math.max(500L, ((jIntValue6 * 1000) + jNextInt6) - SystemClock.elapsedRealtime());
                if (jMax > 500) {
                    kxw0.g(uuw0Var5);
                    quw0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                }
                kxw0.f(b1x0Var);
                b1x0Var.m1();
                ezw0Var = b1x0Var.m;
                if (ezw0Var == null) {
                    ezw0Var = new ezw0(b1x0Var, kxw0Var4, (byte) 0);
                    b1x0Var.m = ezw0Var;
                }
                ezw0Var.b(jMax);
            }
        }
        wvw0Var.p.b(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        pfx pfxVarI;
        ig00 ig00Var = null;
        int i = 0;
        z = false;
        boolean z = false;
        objArr = 0;
        Object[] objArr = 0;
        try {
            switch (this.f21708a) {
                case 0:
                    cfr cfrVar = (cfr) this.c;
                    try {
                        cfrVar.onSuccess(ro4.Y((Future) this.b));
                        return;
                    } catch (Error e) {
                        e = e;
                        cfrVar.onFailure(e);
                        return;
                    } catch (RuntimeException e2) {
                        e = e2;
                        cfrVar.onFailure(e);
                        return;
                    } catch (ExecutionException e3) {
                        Throwable cause = e3.getCause();
                        if (cause == null) {
                            cfrVar.onFailure(e3);
                            return;
                        } else {
                            cfrVar.onFailure(cause);
                            return;
                        }
                    }
                case 1:
                    ((un) this.b).f35938a = this.c;
                    return;
                case 2:
                    Object obj = this.c;
                    Object obj2 = this.b;
                    try {
                        Method method = vn.d;
                        if (method != null) {
                            method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                        } else {
                            vn.e.invoke(obj2, obj, Boolean.FALSE);
                        }
                        return;
                    } catch (RuntimeException e4) {
                        if (e4.getClass() == RuntimeException.class && e4.getMessage() != null && e4.getMessage().startsWith("Unable to stop")) {
                            throw e4;
                        }
                        return;
                    } catch (Throwable th) {
                        Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                        return;
                    }
                case 3:
                    h7d h7dVar = (h7d) ((AtomicReference) this.b).get();
                    if (h7dVar != null) {
                        Iterator it = ((f04) this.c).m.iterator();
                        while (it.hasNext()) {
                            ((Function1) it.next()).invoke(h7dVar);
                        }
                        return;
                    }
                    return;
                case 4:
                    CardFootballFieldView cardFootballFieldView = (CardFootballFieldView) this.c;
                    vd7 vd7Var = cardFootballFieldView.q;
                    ((ImageView) vd7Var.c).setScaleX(1.0f);
                    ((ImageView) vd7Var.c).setScaleY(1.0f);
                    ((ImageView) vd7Var.c).setX((((CardFootballFieldView) vd7Var.b).getWidth() / 2.0f) - (((ImageView) vd7Var.c).getWidth() / 2.0f));
                    ((ImageView) vd7Var.c).setY((((CardFootballFieldView) vd7Var.b).getHeight() - ((ImageView) vd7Var.c).getHeight()) - cardFootballFieldView.w);
                    return;
                case 5:
                    try {
                        qbb qbbVar = (qbb) this.c;
                        Object objZ = ro4.Z((ig00) this.b);
                        tu9 tu9Var = qbbVar.b;
                        if (tu9Var != null) {
                            tu9Var.b(objZ);
                        }
                        break;
                    } catch (CancellationException unused) {
                        ((qbb) this.c).cancel(false);
                    } catch (ExecutionException e5) {
                        qbb qbbVar2 = (qbb) this.c;
                        Throwable cause2 = e5.getCause();
                        tu9 tu9Var2 = qbbVar2.b;
                        if (tu9Var2 != null) {
                            tu9Var2.d(cause2);
                        }
                    }
                    return;
                case 6:
                    f46 f46Var = ((rrm) this.c).i;
                    ViewGroup viewGroup = (ViewGroup) this.b;
                    WeakHashMap weakHashMap = rgu0.f30456a;
                    xiv0 xiv0VarA = jgu0.a(viewGroup);
                    int i2 = (xiv0VarA == null || (pfxVarI = xiv0VarA.f40966a.i(2)) == null) ? 0 : pfxVarI.d;
                    sje sjeVar = rrm.B;
                    f46Var.getClass();
                    ViewGroup.LayoutParams layoutParams = f46Var.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if ((marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) != i2) {
                        f46Var.getClass();
                        ViewGroup.LayoutParams layoutParams2 = f46Var.getLayoutParams();
                        if (layoutParams2 == null) {
                            hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            return;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.bottomMargin = i2;
                        f46Var.setLayoutParams(marginLayoutParams2);
                        return;
                    }
                    return;
                case 7:
                    b2k b2kVar = (b2k) this.c;
                    int width = b2kVar.f1855a.getWidth() - sj3.X(92);
                    ShapeableImageView shapeableImageView = b2kVar.d;
                    shapeableImageView.getLayoutParams().width = Math.min(width, shapeableImageView.getLayoutParams().width);
                    shapeableImageView.getLayoutParams().height = Math.min(width, shapeableImageView.getLayoutParams().height);
                    return;
                case 8:
                    d2k d2kVar = (d2k) this.c;
                    int width2 = d2kVar.f5359a.getWidth() - sj3.X(92);
                    RecyclerView recyclerView = d2kVar.f;
                    recyclerView.getLayoutParams().width = Math.min(width2, recyclerView.getLayoutParams().width);
                    return;
                case 9:
                    qyx qyxVar = (qyx) this.b;
                    xhe0 xhe0Var = qyxVar.e;
                    vyx vyxVar = (vyx) this.c;
                    RecyclerView recyclerView2 = vyxVar.q;
                    if (recyclerView2 == null || !recyclerView2.s || qyxVar.k || xhe0Var.c() == -1) {
                        return;
                    }
                    ehe0 itemAnimator = vyxVar.q.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.f()) {
                        ArrayList arrayList = vyxVar.p;
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            if (((qyx) arrayList.get(i3)).l) {
                            }
                        }
                        vyxVar.m.u(xhe0Var);
                        return;
                    }
                    vyxVar.q.post(this);
                    return;
                case 10:
                    while (true) {
                        try {
                            ((Runnable) this.b).run();
                        } catch (Throwable th2) {
                            u1c.H(th2, kotlin.coroutines.g.f46065a);
                        }
                        try {
                            Runnable runnableX = ((hsz) this.c).x();
                            if (runnableX == null) {
                                return;
                            }
                            this.b = runnableX;
                            i++;
                            if (i >= 16) {
                                hsz hszVar = (hsz) this.c;
                                if (ovk.c(hszVar.d, hszVar)) {
                                    hsz hszVar2 = (hsz) this.c;
                                    ovk.b(hszVar2.d, hszVar2, this);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            hsz hszVar3 = (hsz) this.c;
                            synchronized (hszVar3.g) {
                                hsz.h.decrementAndGet(hszVar3);
                                throw th3;
                            }
                        }
                        break;
                    }
                    break;
                case 11:
                    h04 h04Var = (h04) this.c;
                    Object obj3 = this.b;
                    boolean z2 = h04Var.c.get();
                    saw0 saw0Var = h04Var.e;
                    if (z2) {
                        if (saw0Var.h == h04Var) {
                            SystemClock.uptimeMillis();
                            saw0Var.h = null;
                            saw0Var.a();
                        }
                    } else if (saw0Var.g != h04Var) {
                        if (saw0Var.h == h04Var) {
                            SystemClock.uptimeMillis();
                            saw0Var.h = null;
                            saw0Var.a();
                        }
                    } else if (!saw0Var.c) {
                        SystemClock.uptimeMillis();
                        saw0Var.g = null;
                        pq00 pq00Var = saw0Var.f31903a;
                        if (pq00Var != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                pq00Var.l(obj3);
                            } else {
                                pq00Var.i(obj3);
                            }
                        }
                    }
                    h04Var.b = 3;
                    return;
                case 12:
                    ((n5a) this.c).D((cko) this.b, Unit.f46060a);
                    return;
                case 13:
                    try {
                        ((Runnable) this.c).run();
                        synchronized (((xgi0) this.b).d) {
                            ((xgi0) this.b).a();
                            break;
                        }
                        return;
                    } catch (Throwable th4) {
                        synchronized (((xgi0) this.b).d) {
                            ((xgi0) this.b).a();
                            throw th4;
                        }
                    }
                case 14:
                    View view = (View) this.b;
                    int width3 = (view.getWidth() - view.getPaddingEnd()) - view.getPaddingEnd();
                    c3k c3kVar = (c3k) this.c;
                    ConstraintLayout constraintLayout = c3kVar.d;
                    int paddingEnd = (width3 - constraintLayout.getPaddingEnd()) - constraintLayout.getPaddingStart();
                    if (paddingEnd > 0) {
                        ViewGroup.LayoutParams layoutParams3 = c3kVar.b.getLayoutParams();
                        layoutParams3.getClass();
                        ((a3e) layoutParams3).N = paddingEnd;
                        constraintLayout.requestLayout();
                        return;
                    }
                    return;
                case 15:
                    ig00 ig00Var2 = (ig00) this.b;
                    boolean zIsCancelled = ig00Var2.isCancelled();
                    n5a n5aVar = (n5a) this.c;
                    if (zIsCancelled) {
                        n5aVar.h(null);
                        return;
                    }
                    try {
                        e0g0 e0g0Var = j0g0.b;
                        n5aVar.resumeWith(y4.i(ig00Var2));
                        return;
                    } catch (ExecutionException e6) {
                        e0g0 e0g0Var2 = j0g0.b;
                        Throwable cause3 = e6.getCause();
                        cause3.getClass();
                        n5aVar.resumeWith(new g0g0(cause3));
                        return;
                    }
                case 16:
                    ((glz) this.b).f((kov0) this.c);
                    return;
                case 17:
                    synchronized (((e6w0) this.c).c) {
                        ((fh60) ((e6w0) this.c).d).onFailure(((u6w0) this.b).b());
                        break;
                    }
                    return;
                case 18:
                    fuo0 fuo0Var = (fuo0) this.b;
                    try {
                        fuo0Var.b(((Callable) this.c).call());
                        return;
                    } catch (Exception e7) {
                        fuo0Var.a(e7);
                        return;
                    }
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    a();
                    return;
                case 20:
                    nfq nfqVarE = nfq.e((String) this.b);
                    ((zdw0) nfqVarE.b(zdw0.class)).getClass();
                    FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(nfqVarE);
                    if ((firebaseAuth.a() != null) == true) {
                        Task taskD = firebaseAuth.d(firebaseAuth.f, true);
                        tlw0.e.K("Token refreshing started", new Object[0]);
                        taskD.addOnFailureListener(new ilp0(this));
                        return;
                    }
                    return;
                case 21:
                    zvw0 zvw0Var = (zvw0) this.c;
                    kxw0 kxw0Var = (kxw0) zvw0Var.b.f6568a;
                    fxw0 fxw0Var = kxw0Var.g;
                    kxw0.g(fxw0Var);
                    fxw0Var.m1();
                    Bundle bundle = new Bundle();
                    bundle.putString("package_name", zvw0Var.f45078a);
                    try {
                        zmw0 zmw0Var = (zmw0) ((enw0) this.b);
                        Parcel parcelG = zmw0Var.G();
                        wmw0.b(parcelG, bundle);
                        Parcel parcelF = zmw0Var.F(parcelG, 1);
                        Bundle bundle2 = (Bundle) wmw0.a(parcelF, Bundle.CREATOR);
                        parcelF.recycle();
                        if (bundle2 == null) {
                            uuw0 uuw0Var = kxw0Var.f;
                            kxw0.g(uuw0Var);
                            uuw0Var.g.a("Install Referrer Service returned a null response");
                        }
                        break;
                    } catch (Exception e8) {
                        uuw0 uuw0Var2 = kxw0Var.f;
                        kxw0.g(uuw0Var2);
                        uuw0Var2.g.b(e8.getMessage(), "Exception occurred while retrieving the Install Referrer");
                    }
                    fxw0 fxw0Var2 = kxw0Var.g;
                    kxw0.g(fxw0Var2);
                    fxw0Var2.m1();
                    throw new IllegalStateException("Unexpected call on client side");
                case 22:
                    b();
                    return;
                case 23:
                    b1x0 b1x0Var = (b1x0) this.c;
                    b1x0Var.m1();
                    b1x0Var.n1();
                    Bundle bundle3 = (Bundle) this.b;
                    String string = bundle3.getString("name");
                    s0x.E(string);
                    kxw0 kxw0Var2 = (kxw0) b1x0Var.b;
                    if (!kxw0Var2.a()) {
                        uuw0 uuw0Var3 = kxw0Var2.f;
                        kxw0.g(uuw0Var3);
                        uuw0Var3.o.a("Conditional property not cleared since app measurement is disabled");
                        return;
                    } else {
                        zzpl zzplVar = new zzpl(0L, null, string, "");
                        try {
                            x6x0 x6x0Var = kxw0Var2.i;
                            kxw0.e(x6x0Var);
                            bundle3.getString(HiAnalyticsConstant.BI_KEY_APP_ID);
                            kxw0Var2.i().E1(new zzah(bundle3.getString(HiAnalyticsConstant.BI_KEY_APP_ID), "", zzplVar, bundle3.getLong("creation_timestamp"), bundle3.getBoolean(SubscriptionStateHeader.ACTIVE), bundle3.getString("trigger_event_name"), null, bundle3.getLong("trigger_timeout"), null, bundle3.getLong("time_to_live"), x6x0Var.T1(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), "", bundle3.getLong("creation_timestamp"), 0L, true)));
                            return;
                        } catch (IllegalArgumentException unused2) {
                            return;
                        }
                    }
                case 24:
                    ((b1x0) this.c).C1((Boolean) this.b, true);
                    return;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    b1x0 b1x0Var2 = ((AppMeasurementDynamiteService) this.c).f45539a.m;
                    kxw0.f(b1x0Var2);
                    hcp0 hcp0Var = (hcp0) this.b;
                    b1x0Var2.m1();
                    b1x0Var2.n1();
                    hcp0 hcp0Var2 = b1x0Var2.e;
                    if (hcp0Var != hcp0Var2) {
                        s0x.J("EventInterceptor already set.", hcp0Var2 == null);
                    }
                    b1x0Var2.e = hcp0Var;
                    return;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    b1x0 b1x0Var3 = (b1x0) this.b;
                    b1x0Var3.m1();
                    if (Build.VERSION.SDK_INT < 30) {
                        return;
                    }
                    List<zzoh> list = (List) this.c;
                    wvw0 wvw0Var = ((kxw0) b1x0Var3.b).e;
                    kxw0.e(wvw0Var);
                    SparseArray sparseArrayS1 = wvw0Var.s1();
                    for (zzoh zzohVar : list) {
                        int i4 = zzohVar.c;
                        if (!sparseArrayS1.contains(i4) || ((Long) sparseArrayS1.get(i4)).longValue() < zzohVar.b) {
                            b1x0Var3.J1().add(zzohVar);
                        }
                    }
                    b1x0Var3.K1();
                    return;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    kxw0 kxw0Var3 = (kxw0) ((b1x0) this.b).b;
                    vtw0 vtw0VarK = kxw0Var3.k();
                    String str = (String) this.c;
                    String str2 = vtw0VarK.s;
                    if (str2 != null && !str2.equals(str)) {
                        objArr = 1;
                    }
                    vtw0VarK.s = str;
                    if (objArr != 0) {
                        kxw0Var3.k().q1();
                        return;
                    }
                    return;
                default:
                    AppMeasurementDynamiteService appMeasurementDynamiteService = (AppMeasurementDynamiteService) this.c;
                    x6x0 x6x0Var2 = appMeasurementDynamiteService.f45539a.i;
                    kxw0.e(x6x0Var2);
                    kxw0 kxw0Var4 = appMeasurementDynamiteService.f45539a;
                    if (kxw0Var4.y != null && kxw0Var4.y.booleanValue()) {
                        z = true;
                    }
                    x6x0Var2.d2((gpw0) this.b, z);
                    return;
            }
        } finally {
            ((qbb) this.c).g = null;
        }
    }

    public String toString() {
        switch (this.f21708a) {
            case 0:
                return mfr.class.getSimpleName() + Separators.COMMA + ((cfr) this.c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ mfr(Object obj, Object obj2, byte b) {
        this.f21708a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ mfr(Object obj, Object obj2, boolean z, byte b) {
        this.f21708a = b;
        this.c = obj;
        this.b = obj2;
    }

    public mfr(tlw0 tlw0Var, String str) {
        this.f21708a = (byte) 20;
        this.c = tlw0Var;
        s0x.E(str);
        this.b = str;
    }

    public mfr(zvw0 zvw0Var, enw0 enw0Var, zvw0 zvw0Var2) {
        this.f21708a = (byte) 21;
        this.b = enw0Var;
        this.c = zvw0Var;
    }

    public mfr(f46 f46Var, ViewGroup viewGroup, rrm rrmVar) {
        this.f21708a = (byte) 6;
        this.b = viewGroup;
        this.c = rrmVar;
    }

    public mfr(vyx vyxVar, qyx qyxVar, int i) {
        this.f21708a = (byte) 9;
        this.c = vyxVar;
        this.b = qyxVar;
    }
}
