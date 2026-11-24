package org.xplatform.app_start.impl.work;

import a.af3;
import a.b1j;
import a.brm0;
import a.dpi0;
import a.e0g0;
import a.e5m0;
import a.f5m0;
import a.g090;
import a.g0g0;
import a.gv00;
import a.i0q;
import a.iqt;
import a.j0g0;
import a.j1p;
import a.jf4;
import a.jo20;
import a.jru;
import a.jw20;
import a.k1p;
import a.kg00;
import a.kt2;
import a.lg00;
import a.mii0;
import a.msh0;
import a.ng00;
import a.o5d0;
import a.ojj;
import a.ot10;
import a.psc;
import a.q3d;
import a.rpt;
import a.tgk;
import a.ttm0;
import a.tx3;
import a.u58;
import a.ujn;
import a.wne;
import a.x1u;
import a.x20;
import a.yje;
import a.ywu;
import a.z1x;
import a.ze3;
import a.zje;
import a.zx10;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.TransportInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lorg/xplatform/app_start/impl/work/StartFailedLogWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a/k9x", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class StartFailedLogWorker extends CoroutineWorker {
    public final mii0 g;
    public final ojj h;
    public final zx10 i;
    public final jw20 j;
    public final ywu k;
    public final ot10 l;
    public final msh0 m;
    public final x20 n;
    public final u58 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartFailedLogWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        Context context2 = this.f25193a;
        context2.getClass();
        ComponentCallbacks2 componentCallbacks2 = (Application) context2;
        af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(f5m0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            f5m0 f5m0Var = (f5m0) (ze3Var instanceof f5m0 ? ze3Var : null);
            if (f5m0Var != null) {
                mii0 mii0Var = f5m0Var.f8969a;
                ojj ojjVar = f5m0Var.b;
                zx10 zx10Var = f5m0Var.c;
                jw20 jw20Var = f5m0Var.d;
                ywu ywuVar = f5m0Var.e;
                ot10 ot10Var = f5m0Var.f;
                msh0 msh0Var = f5m0Var.g;
                x20 x20Var = f5m0Var.h;
                u58 u58Var = f5m0Var.i;
                this.g = mii0Var;
                this.h = ojjVar;
                this.i = zx10Var;
                this.j = jw20Var;
                this.k = ywuVar;
                this.l = ot10Var;
                this.m = msh0Var;
                this.n = x20Var;
                this.o = u58Var;
                return;
            }
        }
        jf4.n(b1j.i(f5m0.class, "Cannot create dependency "));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:111:0x0203  */
    /* JADX WARN: Code duplicated, block: B:113:0x0239  */
    /* JADX WARN: Code duplicated, block: B:116:0x024f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0257 A[LOOP:1: B:114:0x0249->B:118:0x0257, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:123:0x027d  */
    /* JADX WARN: Code duplicated, block: B:126:0x028e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0297  */
    /* JADX WARN: Code duplicated, block: B:131:0x029b  */
    /* JADX WARN: Code duplicated, block: B:134:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:139:0x02db  */
    /* JADX WARN: Code duplicated, block: B:142:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:145:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:147:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:149:0x0301  */
    /* JADX WARN: Code duplicated, block: B:151:0x0308  */
    /* JADX WARN: Code duplicated, block: B:153:0x030b  */
    /* JADX WARN: Code duplicated, block: B:155:0x0314  */
    /* JADX WARN: Code duplicated, block: B:157:0x0318  */
    /* JADX WARN: Code duplicated, block: B:159:0x0320  */
    /* JADX WARN: Code duplicated, block: B:161:0x0328  */
    /* JADX WARN: Code duplicated, block: B:169:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x02b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x026c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:91:0x018c A[Catch: all -> 0x019d, TryCatch #1 {all -> 0x019d, blocks: (B:89:0x0186, B:91:0x018c, B:94:0x019f, B:95:0x01a4, B:83:0x016f, B:85:0x0175, B:96:0x01a5, B:97:0x01aa), top: B:167:0x016f }] */
    /* JADX WARN: Code duplicated, block: B:94:0x019f A[Catch: all -> 0x019d, TryCatch #1 {all -> 0x019d, blocks: (B:89:0x0186, B:91:0x018c, B:94:0x019f, B:95:0x01a4, B:83:0x016f, B:85:0x0175, B:96:0x01a5, B:97:0x01aa), top: B:167:0x016f }] */
    /* JADX WARN: Instruction removed from duplicated block: B:118:0x0257, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.work.CoroutineWorker
    public final Object c(yje yjeVar) throws Throwable {
        e5m0 e5m0Var;
        File file;
        gv00 gv00Var;
        Throwable th;
        String strB;
        StartFailedLogWorker startFailedLogWorker;
        String ssid;
        WifiInfo connectionInfo;
        Object g0g0Var;
        gv00 gv00Var2;
        x20 x20Var;
        String str;
        String str2;
        u58 u58Var;
        jo20 jo20Var;
        ojj ojjVar;
        File file2;
        int i;
        int i2;
        String str3;
        msh0 msh0Var;
        jw20 jw20Var;
        g090 g090Var;
        List listL;
        ArrayList arrayList;
        ywu ywuVar;
        File file3;
        gv00 gv00Var3;
        if (yjeVar instanceof e5m0) {
            e5m0Var = (e5m0) yjeVar;
            int i3 = e5m0Var.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e5m0Var.n = i3 - Integer.MIN_VALUE;
            } else {
                e5m0Var = new e5m0(this, (zje) yjeVar);
            }
        } else {
            e5m0Var = new e5m0(this, (zje) yjeVar);
        }
        Object objD = e5m0Var.l;
        wne wneVar = wne.f39444a;
        int i4 = e5m0Var.n;
        zx10 zx10Var = this.i;
        if (i4 != 0) {
            if (i4 == 1) {
                startFailedLogWorker = e5m0Var.k;
                gv00Var = e5m0Var.j;
                file = e5m0Var.i;
                try {
                    z1x.P(objD);
                    th = null;
                    str3 = (String) objD;
                    msh0Var = startFailedLogWorker.m;
                    if (msh0Var != null) {
                        Intrinsics.h("updateApiEndpointUseCase");
                        throw th;
                    }
                    str3.getClass();
                    ujn.h = str3;
                    msh0Var.f22320a.d.clear();
                    g0g0Var = Unit.f46060a;
                    e0g0 e0g0Var = j0g0.b;
                } catch (Throwable th2) {
                    th = th2;
                    th = null;
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
            } else {
                if (i4 == 2) {
                    gv00Var2 = e5m0Var.j;
                    file2 = e5m0Var.i;
                    z1x.P(objD);
                    if (!((Boolean) objD).booleanValue()) {
                        if (zx10Var != null) {
                            zx10Var.n(gv00Var2);
                            return new lg00();
                        }
                        Intrinsics.h("saveForRetryUseCase");
                        throw null;
                    }
                    jw20Var = this.j;
                    if (jw20Var == null) {
                        Intrinsics.h("removeFromSavedUseCase");
                        throw null;
                    }
                    gv00Var2.getClass();
                    g090Var = (g090) ((dpi0) jw20Var.b).f6468a;
                    listL = g090Var.l();
                    arrayList = new ArrayList();
                    for (Object obj : listL) {
                        gv00Var3 = (gv00) obj;
                        gv00Var3.getClass();
                        if (!Intrinsics.d(gv00Var3.d, gv00Var2.d)) {
                            arrayList.add(obj);
                        }
                    }
                    if (listL.size() != arrayList.size()) {
                        g090Var.w(arrayList);
                    }
                    ywuVar = this.k;
                    if (ywuVar == null) {
                        Intrinsics.h("retryStartFailedLogsUseCase");
                        throw null;
                    }
                    e5m0Var.i = file2;
                    e5m0Var.j = null;
                    e5m0Var.n = 3;
                    if (ywuVar.w(e5m0Var) != wneVar) {
                        file3 = file2;
                    }
                    return wneVar;
                }
                if (i4 != 3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                file3 = e5m0Var.i;
                z1x.P(objD);
            }
            file3.delete();
            return ng00.a();
        }
        z1x.P(objD);
        String strB2 = this.b.b.b("FAILED_WORKER_LOG_FILE_PATH");
        if (strB2 == null) {
            return new kg00();
        }
        file = new File(strB2);
        mii0 mii0Var = this.g;
        if (mii0Var == null) {
            Intrinsics.h("collectStartFailedLogDataUseCase");
            throw null;
        }
        String strB3 = i0q.b(file);
        String strValueOf = String.valueOf(((iqt) mii0Var.c).f15225a.a() ? ((x1u) mii0Var.b).a() : 0L);
        tgk tgkVar = (tgk) ((psc) ((jru) mii0Var.d).b).b;
        th = null;
        if (Build.VERSION.SDK_INT >= 31) {
            ConnectivityManager connectivityManager = (ConnectivityManager) tgkVar.e.getValue();
            Network activeNetwork = connectivityManager != null ? connectivityManager.getActiveNetwork() : null;
            ConnectivityManager connectivityManager2 = (ConnectivityManager) tgkVar.e.getValue();
            NetworkCapabilities networkCapabilities = connectivityManager2 != null ? connectivityManager2.getNetworkCapabilities(activeNetwork) : null;
            TransportInfo transportInfo = networkCapabilities != null ? networkCapabilities.getTransportInfo() : null;
            WifiInfo wifiInfo = transportInfo instanceof WifiInfo ? (WifiInfo) transportInfo : null;
            String ssid2 = wifiInfo != null ? wifiInfo.getSSID() : null;
            if (ssid2 == null || StringsKt.W(ssid2) || Intrinsics.d(wifiInfo.getSSID(), "<unknown ssid>")) {
                WifiManager wifiManager = (WifiManager) tgkVar.f.getValue();
                ssid = (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) ? null : connectionInfo.getSSID();
            } else {
                ssid = wifiInfo.getSSID();
            }
            strB = tgk.b(ssid);
        } else {
            WifiManager wifiManager2 = (WifiManager) tgkVar.f.getValue();
            WifiInfo connectionInfo2 = wifiManager2 != null ? wifiManager2.getConnectionInfo() : null;
            strB = tgk.b(connectionInfo2 != null ? connectionInfo2.getSSID() : null);
        }
        TelephonyManager telephonyManager = (TelephonyManager) ((tgk) ((psc) ((rpt) mii0Var.e).f30901a).b).g.getValue();
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        if (networkOperatorName == null) {
            networkOperatorName = "";
        }
        gv00Var = new gv00(strValueOf, strB, networkOperatorName, strB3);
        if (Intrinsics.d(ujn.h, "https://mob-experience.space")) {
            try {
                e0g0 e0g0Var3 = j0g0.b;
                ot10 ot10Var = this.l;
                if (ot10Var == null) {
                    Intrinsics.h("mainDomainResolver");
                    throw null;
                }
                e5m0Var.i = file;
                e5m0Var.j = gv00Var;
                e5m0Var.k = this;
                e5m0Var.n = 1;
                objD = ot10Var.d(e5m0Var);
                if (objD != wneVar) {
                    startFailedLogWorker = this;
                    str3 = (String) objD;
                    msh0Var = startFailedLogWorker.m;
                    if (msh0Var != null) {
                        Intrinsics.h("updateApiEndpointUseCase");
                        throw th;
                    }
                    str3.getClass();
                    ujn.h = str3;
                    msh0Var.f22320a.d.clear();
                    g0g0Var = Unit.f46060a;
                    e0g0 e0g0Var4 = j0g0.b;
                }
            } catch (Throwable th3) {
                th = th3;
                e0g0 e0g0Var5 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
        } else {
            gv00Var2 = gv00Var;
            x20Var = this.n;
            if (x20Var != null) {
                Throwable th4 = th;
                Intrinsics.h("appStartFatmanLogger");
                throw th4;
            }
            String str4 = gv00Var2.b;
            str = gv00Var2.d;
            str2 = gv00Var2.c;
            brm0.B(str4, str2, str);
            x20Var.f40143a.a(tx3.l0(new k1p[]{new j1p(str4, (byte) 0), new j1p(str2, (byte) 1), new j1p(str, (byte) 2)}), 12282L);
            u58Var = this.o;
            if (u58Var != null) {
                Throwable th5 = th;
                Intrinsics.h("startFailedAnalytics");
                throw th5;
            }
            String str5 = gv00Var2.f11954a;
            String str6 = gv00Var2.b;
            str5.getClass();
            str6.getClass();
            kt2 kt2Var = u58Var.f35083a;
            jo20Var = new jo20(25);
            jo20Var.put("userId", ttm0.L(100, str5));
            jo20Var.put("option", ttm0.L(100, str6));
            jo20Var.put("point", ttm0.L(100, str2));
            if (!StringsKt.W(str)) {
                i = 0;
                for (Object obj2 : ttm0.G(100, ttm0.M(2200, str))) {
                    i2 = i + 1;
                    if (i >= 0) {
                        q3d.p();
                        throw th;
                    }
                    jo20Var.put("error_code_" + i, (String) obj2);
                    i = i2;
                }
            }
            kt2Var.a("app_open_error", jo20Var.b());
            ojjVar = this.h;
            if (ojjVar != null) {
                Throwable th6 = th;
                Intrinsics.h("sendSysLogUseCase");
                throw th6;
            }
            e5m0Var.i = file;
            e5m0Var.j = gv00Var2;
            e5m0Var.k = th;
            e5m0Var.n = 2;
            objD = ojjVar.a(gv00Var2, e5m0Var);
            if (objD != wneVar) {
                file2 = file;
                if (!((Boolean) objD).booleanValue()) {
                    if (zx10Var != null) {
                        zx10Var.n(gv00Var2);
                        return new lg00();
                    }
                    Intrinsics.h("saveForRetryUseCase");
                    throw null;
                }
                jw20Var = this.j;
                if (jw20Var == null) {
                    Intrinsics.h("removeFromSavedUseCase");
                    throw null;
                }
                gv00Var2.getClass();
                g090Var = (g090) ((dpi0) jw20Var.b).f6468a;
                listL = g090Var.l();
                arrayList = new ArrayList();
                while (r7.hasNext()) {
                    gv00Var3 = (gv00) obj;
                    gv00Var3.getClass();
                    if (!Intrinsics.d(gv00Var3.d, gv00Var2.d)) {
                        arrayList.add(obj);
                    }
                }
                if (listL.size() != arrayList.size()) {
                    g090Var.w(arrayList);
                }
                ywuVar = this.k;
                if (ywuVar == null) {
                    Intrinsics.h("retryStartFailedLogsUseCase");
                    throw null;
                }
                e5m0Var.i = file2;
                e5m0Var.j = null;
                e5m0Var.n = 3;
                if (ywuVar.w(e5m0Var) != wneVar) {
                    file3 = file2;
                    file3.delete();
                    return ng00.a();
                }
            }
        }
        return wneVar;
        if (j0g0.a(g0g0Var) != null) {
            if (zx10Var != null) {
                zx10Var.n(gv00Var);
                return new lg00();
            }
            Intrinsics.h("saveForRetryUseCase");
            throw th;
        }
        gv00Var2 = gv00Var;
        x20Var = this.n;
        if (x20Var != null) {
            Throwable th7 = th;
            Intrinsics.h("appStartFatmanLogger");
            throw th7;
        }
        String str7 = gv00Var2.b;
        str = gv00Var2.d;
        str2 = gv00Var2.c;
        brm0.B(str7, str2, str);
        x20Var.f40143a.a(tx3.l0(new k1p[]{new j1p(str7, (byte) 0), new j1p(str2, (byte) 1), new j1p(str, (byte) 2)}), 12282L);
        u58Var = this.o;
        if (u58Var != null) {
            Throwable th8 = th;
            Intrinsics.h("startFailedAnalytics");
            throw th8;
        }
        String str8 = gv00Var2.f11954a;
        String str9 = gv00Var2.b;
        str8.getClass();
        str9.getClass();
        kt2 kt2Var2 = u58Var.f35083a;
        jo20Var = new jo20(25);
        jo20Var.put("userId", ttm0.L(100, str8));
        jo20Var.put("option", ttm0.L(100, str9));
        jo20Var.put("point", ttm0.L(100, str2));
        if (!StringsKt.W(str)) {
            i = 0;
            while (r7.hasNext()) {
                i2 = i + 1;
                if (i >= 0) {
                    q3d.p();
                    throw th;
                }
                jo20Var.put("error_code_" + i, (String) obj2);
                i = i2;
            }
        }
        kt2Var2.a("app_open_error", jo20Var.b());
        ojjVar = this.h;
        if (ojjVar != null) {
            Throwable th9 = th;
            Intrinsics.h("sendSysLogUseCase");
            throw th9;
        }
        e5m0Var.i = file;
        e5m0Var.j = gv00Var2;
        e5m0Var.k = th;
        e5m0Var.n = 2;
        objD = ojjVar.a(gv00Var2, e5m0Var);
        if (objD != wneVar) {
            file2 = file;
            if (!((Boolean) objD).booleanValue()) {
                if (zx10Var != null) {
                    zx10Var.n(gv00Var2);
                    return new lg00();
                }
                Intrinsics.h("saveForRetryUseCase");
                throw null;
            }
            jw20Var = this.j;
            if (jw20Var == null) {
                Intrinsics.h("removeFromSavedUseCase");
                throw null;
            }
            gv00Var2.getClass();
            g090Var = (g090) ((dpi0) jw20Var.b).f6468a;
            listL = g090Var.l();
            arrayList = new ArrayList();
            while (r7.hasNext()) {
                gv00Var3 = (gv00) obj;
                gv00Var3.getClass();
                if (!Intrinsics.d(gv00Var3.d, gv00Var2.d)) {
                    arrayList.add(obj);
                }
            }
            if (listL.size() != arrayList.size()) {
                g090Var.w(arrayList);
            }
            ywuVar = this.k;
            if (ywuVar == null) {
                Intrinsics.h("retryStartFailedLogsUseCase");
                throw null;
            }
            e5m0Var.i = file2;
            e5m0Var.j = null;
            e5m0Var.n = 3;
            if (ywuVar.w(e5m0Var) != wneVar) {
                file3 = file2;
                file3.delete();
                return ng00.a();
            }
        }
        return wneVar;
    }
}
