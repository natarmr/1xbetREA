package a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.util.Size;
import android.view.Surface;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.xplatform.consultantchat.presentation.dialogs.rate.model.RatingModel;
import org.xplatform.domino.presentation.views.DominoHandView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a4e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f218a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a4e(DominoHandView dominoHandView, List list) {
        this.f218a = (byte) 25;
        this.c = dominoHandView;
        this.b = list;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0259  */
    /* JADX WARN: Code duplicated, block: B:114:0x0260  */
    /* JADX WARN: Code duplicated, block: B:119:0x0293 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x0299 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:188:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:232:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:399:0x02a4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:50:0x0107  */
    /* JADX WARN: Instruction removed from duplicated block: B:112:0x0259, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        char c;
        char c2;
        boolean zExists;
        String str;
        String line;
        int i;
        int i2;
        String str2;
        String str3;
        Collection collectionD0;
        byte b = 2;
        boolean zEquals = false;
        z = false;
        boolean z = false;
        switch (this.f218a) {
            case 0:
                List<ww5> list = (List) this.b;
                b4e b4eVar = (b4e) this.c;
                for (ww5 ww5Var : list) {
                    Object obj = b4eVar.e;
                    yw5 yw5Var = ww5Var.f39870a;
                    Object v4eVar = yw5Var.e(obj) ? new v4e(yw5Var.d()) : u4e.f35042a;
                    hzb0 hzb0Var = ww5Var.b;
                    hzb0Var.getClass();
                    hzb0Var.f(v4eVar);
                }
                return;
            case 1:
                e7e e7eVar = (e7e) this.b;
                RatingModel ratingModel = (RatingModel) this.c;
                kwd kwdVar = e7e.d2;
                kud kudVar = dbe.k2;
                androidx.fragment.app.e eVarC = e7eVar.C();
                eVarC.getClass();
                kudVar.getClass();
                Fragment fragmentJ = eVarC.J("rate_consultant_dialog");
                dbe dbeVar = fragmentJ instanceof dbe ? (dbe) fragmentJ : null;
                if (dbeVar == null) {
                    dbe dbeVar2 = new dbe();
                    dbeVar2.i2.J(dbeVar2, dbe.l2[1], ratingModel);
                    sj3.E0(dbeVar2, eVarC, "rate_consultant_dialog");
                    return;
                } else {
                    khf0 khf0Var = dbeVar.i2;
                    iiy[] iiyVarArr = dbe.l2;
                    khf0Var.J(dbeVar, iiyVarArr[1], ratingModel);
                    dbeVar.U0().w((RatingModel) khf0Var.n(dbeVar, iiyVarArr[1]));
                    return;
                }
            case 2:
                axe axeVar = (axe) this.b;
                RecyclerView recyclerView = (RecyclerView) this.c;
                kud kudVar2 = axe.e2;
                if (axeVar.N()) {
                    recyclerView.b0();
                    return;
                }
                return;
            case 3:
                ((f8f) this.b).b((String) this.c, Boolean.FALSE);
                return;
            case 4:
                j8f j8fVar = (j8f) this.b;
                String str4 = (String) this.c;
                ywq0 ywq0Var = j8fVar.g.d;
                String strA = qmy.a(1024, str4);
                synchronized (((AtomicMarkableReference) ywq0Var.g)) {
                    try {
                        String str5 = (String) ((AtomicMarkableReference) ywq0Var.g).getReference();
                        if (strA != null) {
                            zEquals = strA.equals(str5);
                        } else if (str5 == null) {
                            zEquals = true;
                        }
                        if (zEquals) {
                            return;
                        }
                        ((AtomicMarkableReference) ywq0Var.g).set(strA, true);
                        ((aaf) ((cu) ywq0Var.b).c).a(new apj0((Object) ywq0Var, (byte) 19));
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 5:
                ((a1d) ((dcf) this.b).d()).k((g0u) this.c);
                return;
            case 6:
                ((a1d) ((dcf) this.b).d()).j(((mie0) this.c).f21842a);
                return;
            case 7:
                ((a1d) ((dcf) this.b).d()).j((d0u) this.c);
                return;
            case 8:
                ((a1d) ((ybf) this.b)).j(this.c);
                return;
            case 9:
                ((a1d) ((icf) this.b).d()).j(((mie0) this.c).f21842a);
                return;
            case 10:
                ((a1d) ((icf) this.b).d()).k((g0u) this.c);
                return;
            case 11:
                ((a1d) ((icf) this.b).d()).j((h0u) this.c);
                return;
            case 12:
                ((a1d) ((icf) this.b).d()).j((d0u) this.c);
                return;
            case 13:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$3$0$0((ybf) this.b, (mie0) this.c);
                return;
            case 14:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2$0$0$0((ybf) this.b, (Exception) this.c);
                return;
            case 15:
                eyf eyfVar = (eyf) this.b;
                Runnable runnable = (Runnable) this.c;
                Process.setThreadPriority(eyfVar.c);
                StrictMode.ThreadPolicy threadPolicy = eyfVar.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 16:
                cgx0 cgx0Var = (cgx0) this.b;
                RecyclerView recyclerView2 = (RecyclerView) this.c;
                if (cgx0Var.b) {
                    recyclerView2.y0(0);
                    cgx0Var.b = false;
                    return;
                }
                return;
            case 17:
                tuj tujVar = (tuj) this.b;
                Uri uri = (Uri) this.c;
                tujVar.j = false;
                if (tujVar.f34553a.equals(tujVar.m.r) || tujVar.l) {
                    tujVar.c(uri);
                    return;
                }
                return;
            case 18:
                txj txjVar = (txj) this.b;
                imn0 imn0Var = (imn0) this.c;
                Surface surfaceC = imn0Var.c(txjVar.c, new m3a(txjVar, imn0Var, (byte) 1));
                txjVar.f34703a.s(surfaceC);
                txjVar.h.put(imn0Var, surfaceC);
                return;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((txj) this.b).k.add((j35) this.c);
                return;
            case 20:
                final txj txjVar2 = (txj) this.b;
                final pmn0 pmn0Var = (pmn0) this.c;
                txjVar2.i++;
                p8l p8lVar = txjVar2.f34703a;
                vfr.d((AtomicBoolean) p8lVar.c, true);
                vfr.c((Thread) p8lVar.b);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(p8lVar.f26560a);
                Size size = pmn0Var.b;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                lmv lmvVar = txjVar2.c;
                pmn0Var.b(lmvVar, new uq((Object) txjVar2, (Object) pmn0Var, (byte) 13));
                pmn0Var.a(surface, lmvVar, new sbe() { // from class: a.sxj
                    @Override // a.sbe
                    public final void accept(Object obj2) {
                        txj txjVar3 = txjVar2;
                        pmn0 pmn0Var2 = pmn0Var;
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        Surface surface2 = surface;
                        synchronized (pmn0Var2.f27245a) {
                            pmn0Var2.m = null;
                            pmn0Var2.n = null;
                        }
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface2.release();
                        txjVar3.i--;
                        txjVar3.c();
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(txjVar2, txjVar2.d);
                return;
            case 21:
                ((czj) ((fhj) this.b).b).i.a((qfu0) this.c);
                return;
            case 22:
                hzj hzjVar = (hzj) this.b;
                String str6 = (String) this.c;
                try {
                    hzjVar.e.get();
                    hzjVar.e(hzj.m.decrementAndGet(), hzj.l.get(), "Surface terminated");
                    return;
                } catch (Exception e) {
                    l8x.X("DeferrableSurface", "Unexpected surface termination for " + hzjVar + "\nStack Trace:\n" + str6);
                    synchronized (hzjVar.f13909a) {
                        try {
                            throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", hzjVar, Boolean.valueOf(hzjVar.c), Integer.valueOf(hzjVar.b)), e);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            case 23:
                Callable callable = (Callable) this.b;
                o3k o3kVar = (o3k) ((prc) this.c).b;
                try {
                    o3kVar.l(callable.call());
                    return;
                } catch (Exception e2) {
                    o3kVar.m(e2);
                    return;
                }
            case 24:
                rgk rgkVar = (rgk) this.b;
                Context context = (Context) this.c;
                if (rgkVar.f30441a != null || context == null) {
                    return;
                }
                rgkVar.f30441a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                DominoHandView dominoHandView = (DominoHandView) this.c;
                List<? extends List<Integer>> list2 = (List) this.b;
                iiy[] iiyVarArr2 = szk.Q1;
                dominoHandView.setOpponentBones(list2);
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lyl lylVar = (lyl) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                if (!lylVar.u2 && lylVar.r2 != uyl.b) {
                    lylVar.post(new kyl(arrayList, lylVar));
                }
                lylVar.u2 = false;
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                final mbn mbnVar = (mbn) this.b;
                pmn0 pmn0Var2 = (pmn0) this.c;
                mbnVar.e++;
                jbn jbnVar = mbnVar.f21518a;
                boolean z2 = pmn0Var2.e;
                Size size2 = pmn0Var2.b;
                vfr.d((AtomicBoolean) jbnVar.c, true);
                vfr.c((Thread) jbnVar.b);
                final SurfaceTexture surfaceTexture2 = new SurfaceTexture(z2 ? jbnVar.n : jbnVar.o);
                surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                final Surface surface2 = new Surface(surfaceTexture2);
                pmn0Var2.a(surface2, mbnVar.c, new sbe() { // from class: a.lbn
                    @Override // a.sbe
                    public final void accept(Object obj2) {
                        SurfaceTexture surfaceTexture3 = surfaceTexture2;
                        surfaceTexture3.setOnFrameAvailableListener(null);
                        surfaceTexture3.release();
                        surface2.release();
                        mbn mbnVar2 = mbnVar;
                        mbnVar2.e--;
                        mbnVar2.c();
                    }
                });
                if (z2) {
                    mbnVar.i = surfaceTexture2;
                    return;
                } else {
                    mbnVar.j = surfaceTexture2;
                    surfaceTexture2.setOnFrameAvailableListener(mbnVar, mbnVar.d);
                    return;
                }
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                mbn mbnVar2 = (mbn) this.b;
                imn0 imn0Var2 = (imn0) this.c;
                Surface surfaceC2 = imn0Var2.c(mbnVar2.c, new m3a(mbnVar2, imn0Var2, b));
                mbnVar2.f21518a.s(surfaceC2);
                mbnVar2.h.put(imn0Var2, surfaceC2);
                return;
            default:
                chf0 chf0Var = (chf0) this.b;
                ctl ctlVar = (ctl) this.c;
                String str7 = Build.PRODUCT;
                String str8 = Build.MANUFACTURER;
                String str9 = Build.BRAND;
                String str10 = Build.DEVICE;
                String str11 = Build.MODEL;
                String str12 = Build.HARDWARE;
                String str13 = Build.FINGERPRINT;
                str13.getClass();
                if (kotlin.text.c.x(str13, "generic", false)) {
                    c = 1;
                } else {
                    str11.getClass();
                    if (StringsKt.O(str11, "google_sdk", false)) {
                        c = 1;
                    } else {
                        Locale locale = Locale.ROOT;
                        if (vqd.A(str11, locale, "droid4x", false) || StringsKt.O(str11, "Emulator", false) || StringsKt.O(str11, "Android SDK built for x86", false)) {
                            c = 1;
                        } else {
                            str8.getClass();
                            if (StringsKt.O(str8, "Genymotion", false) || Intrinsics.d(str12, "goldfish") || Intrinsics.d(str12, "vbox86") || Intrinsics.d(str7, "sdk") || Intrinsics.d(str7, "google_sdk") || Intrinsics.d(str7, "sdk_x86") || Intrinsics.d(str7, "vbox86p")) {
                                c = 1;
                            } else {
                                String str14 = Build.BOARD;
                                str14.getClass();
                                String lowerCase = str14.toLowerCase(locale);
                                lowerCase.getClass();
                                if (StringsKt.O(lowerCase, "nox", false)) {
                                    c = 1;
                                } else {
                                    String str15 = Build.BOOTLOADER;
                                    str15.getClass();
                                    String lowerCase2 = str15.toLowerCase(locale);
                                    lowerCase2.getClass();
                                    if (StringsKt.O(lowerCase2, "nox", false)) {
                                        c = 1;
                                    } else {
                                        str12.getClass();
                                        String lowerCase3 = str12.toLowerCase(locale);
                                        lowerCase3.getClass();
                                        if (StringsKt.O(lowerCase3, "nox", false)) {
                                            c = 1;
                                        } else {
                                            str7.getClass();
                                            String lowerCase4 = str7.toLowerCase(locale);
                                            lowerCase4.getClass();
                                            if (StringsKt.O(lowerCase4, "nox", false)) {
                                                c = 1;
                                            } else {
                                                String str16 = Build.HOST;
                                                str16.getClass();
                                                if (StringsKt.O(str16, "ubuntu", false)) {
                                                    c = 1;
                                                } else {
                                                    str10.getClass();
                                                    if (StringsKt.O(str10, "aosp", false)) {
                                                        c = 1;
                                                    } else {
                                                        c = 0;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (c != 0) {
                    zExists = true;
                } else {
                    str9.getClass();
                    if (kotlin.text.c.x(str9, "generic", false)) {
                        str10.getClass();
                        if (kotlin.text.c.x(str10, "generic", false)) {
                            c2 = 1;
                        } else {
                            c2 = 0;
                        }
                    } else {
                        c2 = 0;
                    }
                    boolean z3 = c2 | c;
                    if (z3 != 0) {
                        zExists = true;
                    } else {
                        zExists = ("google_sdk".equals(str7) ? 1 : 0) | (z3 ? 1 : 0);
                    }
                }
                byte b2 = 5;
                if (!zExists) {
                    us00 us00Var = (us00) chf0Var.b;
                    jiq0.j0(us00Var, "android.permission.READ_PHONE_STATE");
                    if (chf0Var.q("Geny", chf0.d) || chf0Var.q("Andy", chf0.h) || chf0Var.q("Nox", chf0.i)) {
                        zExists = true;
                    } else {
                        File[] fileArr = {new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
                        int i3 = 0;
                        while (true) {
                            if (i3 < 2) {
                                File file = fileArr[i3];
                                if (file.exists() && file.canRead()) {
                                    byte[] bArr = new byte[1024];
                                    try {
                                        FileInputStream fileInputStream = new FileInputStream(file);
                                        fileInputStream.read(bArr);
                                        fileInputStream.close();
                                    } catch (Exception e3) {
                                        e3.printStackTrace();
                                    }
                                    if (StringsKt.O(new String(bArr, Charsets.UTF_8), chf0.e[0], false)) {
                                    }
                                    break;
                                }
                                i3++;
                            } else if (!chf0Var.q("Pipes", chf0.f)) {
                                if (jiq0.j0(us00Var, "android.permission.INTERNET") == 0) {
                                    String[] strArr = {"/system/bin/netcfg"};
                                    StringBuilder sb = new StringBuilder();
                                    try {
                                        ProcessBuilder processBuilder = new ProcessBuilder((String[]) Arrays.copyOf(strArr, 1));
                                        processBuilder.directory(new File("/system/bin/"));
                                        processBuilder.redirectErrorStream(true);
                                        InputStream inputStream = processBuilder.start().getInputStream();
                                        byte[] bArr2 = new byte[1024];
                                        while (inputStream.read(bArr2) != -1) {
                                            sb.append(new String(bArr2, Charsets.UTF_8));
                                        }
                                        inputStream.close();
                                        break;
                                    } catch (Exception unused) {
                                    }
                                    String string = sb.toString();
                                    "netcfg data -> ".concat(string);
                                    if (string.length() > 0) {
                                        List listI = new Regex(Separators.RETURN).i(string);
                                        if (listI.isEmpty()) {
                                            collectionD0 = iun.f15405a;
                                        } else {
                                            ListIterator listIterator = listI.listIterator(listI.size());
                                            while (true) {
                                                if (!listIterator.hasPrevious()) {
                                                    collectionD0 = iun.f15405a;
                                                } else if (((String) listIterator.previous()).length() != 0) {
                                                    collectionD0 = CollectionsKt.D0(listI, listIterator.nextIndex() + 1);
                                                }
                                            }
                                        }
                                        String[] strArr2 = (String[]) collectionD0.toArray(new String[0]);
                                        int length = strArr2.length;
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 < length) {
                                                String str17 = strArr2[i4];
                                                if ((!StringsKt.O(str17, "wlan0", false) && !StringsKt.O(str17, "tunl0", false) && !StringsKt.O(str17, "eth0", false)) || !StringsKt.O(str17, "10.0.2.15", false)) {
                                                    i4++;
                                                }
                                            } else {
                                                i2 = 0;
                                                for (a0d0 a0d0Var : chf0.j) {
                                                    String str18 = a0d0Var.f22a;
                                                    str2 = a0d0Var.b;
                                                    try {
                                                        Class<?> clsLoadClass = us00Var.getClassLoader().loadClass("android.os.SystemProperties");
                                                        Object objInvoke = clsLoadClass.getMethod("get", String.class).invoke(clsLoadClass, Arrays.copyOf(new Object[]{str18}, 1));
                                                        objInvoke.getClass();
                                                        str3 = (String) objInvoke;
                                                    } catch (Exception unused2) {
                                                        str3 = null;
                                                    }
                                                    if (str2 == null && str3 != null) {
                                                        i2++;
                                                    }
                                                    if (str2 == null && str3 != null && StringsKt.O(str3, str2, false)) {
                                                        i2++;
                                                    }
                                                    break;
                                                }
                                                if (i2 >= 5 || !chf0Var.q("X86", chf0.g)) {
                                                    zExists = false;
                                                }
                                            }
                                        }
                                    } else {
                                        i2 = 0;
                                        while (i < r2) {
                                            String str19 = a0d0Var.f22a;
                                            str2 = a0d0Var.b;
                                            Class<?> clsLoadClass2 = us00Var.getClassLoader().loadClass("android.os.SystemProperties");
                                            Object objInvoke2 = clsLoadClass2.getMethod("get", String.class).invoke(clsLoadClass2, Arrays.copyOf(new Object[]{str19}, 1));
                                            objInvoke2.getClass();
                                            str3 = (String) objInvoke2;
                                            if (str2 == null) {
                                                i2++;
                                            }
                                            if (str2 == null) {
                                            }
                                        }
                                        if (i2 >= 5) {
                                        }
                                        zExists = false;
                                    }
                                } else {
                                    i2 = 0;
                                    while (i < r2) {
                                        String str110 = a0d0Var.f22a;
                                        str2 = a0d0Var.b;
                                        Class<?> clsLoadClass3 = us00Var.getClassLoader().loadClass("android.os.SystemProperties");
                                        Object objInvoke3 = clsLoadClass3.getMethod("get", String.class).invoke(clsLoadClass3, Arrays.copyOf(new Object[]{str110}, 1));
                                        objInvoke3.getClass();
                                        str3 = (String) objInvoke3;
                                        if (str2 == null) {
                                            i2++;
                                        }
                                        if (str2 == null) {
                                        }
                                    }
                                    if (i2 >= 5) {
                                    }
                                    zExists = false;
                                }
                            }
                            zExists = true;
                        }
                    }
                }
                if (!zExists) {
                    ArrayList arrayList2 = (ArrayList) chf0Var.c;
                    if (arrayList2.isEmpty()) {
                        zExists = false;
                    } else {
                        final PackageManager packageManager = ((us00) chf0Var.b).getPackageManager();
                        final byte b3 = 1;
                        sx3 sx3Var = new sx3(arrayList2, b3);
                        final byte b4 = zEquals ? (byte) 1 : (byte) 0;
                        qls0 qls0VarP = pgi0.p(pgi0.q(sx3Var, new Function1() { // from class: a.hvn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                byte b5 = b4;
                                PackageManager packageManager2 = packageManager;
                                switch (b5) {
                                    case 0:
                                        String str20 = (String) obj2;
                                        str20.getClass();
                                        return packageManager2.getLaunchIntentForPackage(str20);
                                    default:
                                        Intent intent = (Intent) obj2;
                                        intent.getClass();
                                        return packageManager2.queryIntentActivities(intent, 65536);
                                }
                            }
                        }), new Function1() { // from class: a.hvn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                byte b5 = b3;
                                PackageManager packageManager2 = packageManager;
                                switch (b5) {
                                    case 0:
                                        String str20 = (String) obj2;
                                        str20.getClass();
                                        return packageManager2.getLaunchIntentForPackage(str20);
                                    default:
                                        Intent intent = (Intent) obj2;
                                        intent.getClass();
                                        return packageManager2.queryIntentActivities(intent, 65536);
                                }
                            }
                        });
                        Iterator it = qls0VarP.f28951a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                List list3 = (List) qls0VarP.b.invoke(it.next());
                                list3.getClass();
                                if (!list3.isEmpty()) {
                                    zExists = true;
                                }
                            } else {
                                zExists = false;
                            }
                        }
                    }
                }
                if (!zExists) {
                    zExists = new File(new String[]{"/mnt/windows/BstSharedFolder"}[0]).exists();
                }
                if (!zExists) {
                    try {
                        String[] strArr3 = {null};
                        boolean[] zArr = {false};
                        Object obj2 = new Object();
                        new Handler(Looper.getMainLooper()).post(new w1(new g8l(strArr3, zArr, obj2, (byte) 10), b2));
                        synchronized (obj2) {
                            while (!zArr[0]) {
                                obj2.wait();
                                break;
                            }
                        }
                        String str20 = strArr3[0];
                        zExists = str20 != null && (StringsKt.O(str20, "Bluestacks", false) || StringsKt.O(str20, "Translator", false));
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                }
                if (!zExists) {
                    us00 us00Var2 = (us00) chf0Var.b;
                    String str21 = Build.FINGERPRINT;
                    str21.getClass();
                    if (kotlin.text.c.x(str21, "generic", false) || kotlin.text.c.x(str21, "unknown", false)) {
                        z = true;
                    } else {
                        String str22 = Build.MODEL;
                        str22.getClass();
                        if (StringsKt.O(str22, "google_sdk", false) || StringsKt.O(str22, "sdk", false) || StringsKt.O(str22, "Emulator", false) || StringsKt.O(str22, "Android SDK built for x86", false)) {
                            z = true;
                        } else {
                            String str23 = Build.MANUFACTURER;
                            str23.getClass();
                            if (StringsKt.O(str23, "Genymotion", false)) {
                                z = true;
                            } else {
                                String str24 = Build.BRAND;
                                str24.getClass();
                                if (kotlin.text.c.x(str24, "generic", false)) {
                                    String str25 = Build.DEVICE;
                                    str25.getClass();
                                    if (kotlin.text.c.x(str25, "generic", false)) {
                                        z = true;
                                    } else {
                                        str = Build.PRODUCT;
                                        str.getClass();
                                        if (!StringsKt.O(str, "google_sdk", false) || StringsKt.O(str, "sdk", false)) {
                                            z = true;
                                        } else {
                                            String str26 = Build.HARDWARE;
                                            str26.getClass();
                                            if (StringsKt.O(str26, "goldfish", false) || StringsKt.O(str26, "ranchu", false)) {
                                                z = true;
                                            } else {
                                                String str27 = Build.BOARD;
                                                str27.getClass();
                                                if (StringsKt.O(str27, "unknown", false)) {
                                                    z = true;
                                                } else {
                                                    String str28 = Build.ID;
                                                    str28.getClass();
                                                    if (StringsKt.O(str28, "FRF91", false) || StringsKt.O(str23, "unknown", false)) {
                                                        z = true;
                                                    } else {
                                                        String str29 = Build.TAGS;
                                                        str29.getClass();
                                                        if (!StringsKt.O(str29, "test-keys", false) && !"goldfish".equals(m0x0.N(us00Var2, "ro.hardware")) && !"ranchu".equals(m0x0.N(us00Var2, "ro.hardware")) && !"generic".equals(m0x0.N(us00Var2, "ro.product.device")) && !"1".equals(m0x0.N(us00Var2, "ro.kernel.qemu")) && !"0".equals(m0x0.N(us00Var2, "ro.secure"))) {
                                                            try {
                                                                BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
                                                                do {
                                                                    line = bufferedReader.readLine();
                                                                    line.getClass();
                                                                } while (!StringsKt.O(line, "Goldfish", false));
                                                            } catch (Exception unused3) {
                                                                if (!new File("/init.goldfish.rc").exists() && !new File("/sys/qemu_trace").exists() && !new File("/system/bin/qemud").exists()) {
                                                                    try {
                                                                        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                                                                        while (networkInterfaces.hasMoreElements()) {
                                                                            if (Intrinsics.d(networkInterfaces.nextElement().getName(), "eth0")) {
                                                                            }
                                                                        }
                                                                    } catch (Exception unused4) {
                                                                    }
                                                                }
                                                                zExists = z;
                                                                ctlVar.invoke(Boolean.valueOf(zExists));
                                                                return;
                                                            }
                                                        }
                                                        z = true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                } else {
                                    str = Build.PRODUCT;
                                    str.getClass();
                                    if (StringsKt.O(str, "google_sdk", false)) {
                                        z = true;
                                    } else {
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                    zExists = z;
                }
                ctlVar.invoke(Boolean.valueOf(zExists));
                return;
        }
    }

    public /* synthetic */ a4e(Object obj, Object obj2, byte b) {
        this.f218a = b;
        this.b = obj;
        this.c = obj2;
    }
}
