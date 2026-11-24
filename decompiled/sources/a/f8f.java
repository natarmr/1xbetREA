package a;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import android.os.ProfilingTrigger;
import android.os.StatFs;
import android.system.OsConstants;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes2.dex */
public final class f8f {
    public static final z7f r = new z7f((byte) 1);
    public static final Charset s = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9100a;
    public final qaj b;
    public final c5k c;
    public final ywq0 d;
    public final cu e;
    public final hxw f;
    public final xzp g;
    public final rrd h;
    public final yzn0 i;
    public final k8f j;
    public final xp2 k;
    public final a8f l;
    public final ywq0 m;
    public y9f n;
    public final TaskCompletionSource o = new TaskCompletionSource();
    public final TaskCompletionSource p = new TaskCompletionSource();
    public final TaskCompletionSource q = new TaskCompletionSource();

    public f8f(Context context, hxw hxwVar, qaj qajVar, xzp xzpVar, c5k c5kVar, rrd rrdVar, ywq0 ywq0Var, yzn0 yzn0Var, ywq0 ywq0Var2, k8f k8fVar, xp2 xp2Var, a8f a8fVar, cu cuVar) {
        new AtomicBoolean(false);
        this.f9100a = context;
        this.f = hxwVar;
        this.b = qajVar;
        this.g = xzpVar;
        this.c = c5kVar;
        this.h = rrdVar;
        this.d = ywq0Var;
        this.i = yzn0Var;
        this.j = k8fVar;
        this.k = xp2Var;
        this.l = a8fVar;
        this.m = ywq0Var2;
        this.e = cuVar;
    }

    /* JADX WARN: Code duplicated, block: B:147:0x0516  */
    /* JADX WARN: Code duplicated, block: B:191:0x0603  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r33v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36, types: [int] */
    /* JADX WARN: Type inference failed for: r8v83 */
    public final void a(boolean z, sd60 sd60Var, boolean z2) throws Throwable {
        k8f k8fVar;
        String str;
        xzp xzpVar;
        ArrayList arrayList;
        int i;
        Throwable th;
        boolean z3;
        String str2;
        String strSubstring;
        boolean z4;
        List listB;
        String strE;
        int i2;
        List listUnmodifiableList;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        k8f k8fVar2 = this.j;
        String str3 = "activity";
        Context context = this.f9100a;
        xzp xzpVar2 = this.g;
        cu.d();
        final ywq0 ywq0Var = this.m;
        ArrayList arrayList2 = new ArrayList(((x9f) ywq0Var.b).d());
        if (arrayList2.size() <= z) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        final String str4 = (String) arrayList2.get(z == true ? 1 : 0);
        int i3 = 4;
        if (z2 && sd60Var.e().b.b) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    yzn0 yzn0Var = new yzn0(xzpVar2);
                    yzn0Var.b = yzn0.c;
                    if (str4 != null) {
                        yzn0Var.b = new ild0(xzpVar2.G(str4, "userlog"));
                    }
                    cu cuVar = this.e;
                    oa40 oa40Var = new oa40(xzpVar2);
                    ywq0 ywq0Var2 = new ywq0(str4, xzpVar2, cuVar);
                    ((qmy) ((AtomicMarkableReference) ((o24) ywq0Var2.d).b).getReference()).c(oa40Var.c(str4, false));
                    ((qmy) ((AtomicMarkableReference) ((o24) ywq0Var2.e).b).getReference()).c(oa40Var.c(str4, true));
                    ((AtomicMarkableReference) ywq0Var2.g).set(oa40Var.d(str4), false);
                    jdg0 jdg0Var = (jdg0) ywq0Var2.f;
                    File fileG = xzpVar2.G(str4, "rollouts-state");
                    if (!fileG.exists() || fileG.length() == 0) {
                        k8fVar = k8fVar2;
                        arrayList = arrayList2;
                        oa40.g(fileG, "The file has a length of zero for session: " + str4);
                        listB = Collections.EMPTY_LIST;
                    } else {
                        k8fVar = k8fVar2;
                        try {
                            fileInputStream2 = new FileInputStream(fileG);
                            try {
                                try {
                                    listB = oa40.b(aad.b0(fileInputStream2));
                                    arrayList = arrayList2;
                                    try {
                                        String str5 = "Loaded rollouts state:\n" + listB + "\nfor session " + str4;
                                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                            Log.d("FirebaseCrashlytics", str5, null);
                                        }
                                        aad.J(fileInputStream2, "Failed to close rollouts state file.");
                                    } catch (Exception e) {
                                        e = e;
                                        Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                        oa40.f(fileG);
                                        aad.J(fileInputStream2, "Failed to close rollouts state file.");
                                        listB = Collections.EMPTY_LIST;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    arrayList = arrayList2;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileInputStream = fileInputStream2;
                                aad.J(fileInputStream, "Failed to close rollouts state file.");
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            arrayList = arrayList2;
                            fileInputStream2 = null;
                        } catch (Throwable th3) {
                            th = th3;
                            fileInputStream = null;
                            aad.J(fileInputStream, "Failed to close rollouts state file.");
                            throw th;
                        }
                    }
                    jdg0Var.d(listB);
                    final byte b = 0;
                    ApplicationExitInfo applicationExitInfoG = ywq0Var.g(str4, historicalProcessExitReasons, new Predicate() { // from class: a.eki0
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) obj;
                            switch (b) {
                                case 0:
                                    return applicationExitInfo.getReason() == 6;
                                default:
                                    return (applicationExitInfo.getReason() == 3 && applicationExitInfo.getDescription() != null && applicationExitInfo.getDescription().contains("OOM")) || (applicationExitInfo.getReason() == 2 && applicationExitInfo.getStatus() == OsConstants.SIGKILL);
                            }
                        }
                    });
                    if (applicationExitInfoG == null) {
                        String strK = kng0.k("No relevant ApplicationExitInfo occurred during session: ", str4);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strK, null);
                        }
                        str = "activity";
                        xzpVar = xzpVar2;
                    } else {
                        s9f s9fVar = (s9f) ywq0Var.f43384a;
                        try {
                            InputStream traceInputStream = applicationExitInfoG.getTraceInputStream();
                            strE = traceInputStream != null ? ywq0.e(traceInputStream) : null;
                        } catch (IOException e4) {
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + applicationExitInfoG.toString() + " Error: " + e4, null);
                        }
                        y15 y15Var = new y15();
                        y15Var.d = applicationExitInfoG.getImportance();
                        y15Var.j = (byte) (y15Var.j | 4);
                        String processName = applicationExitInfoG.getProcessName();
                        if (processName == null) {
                            hny.u("Null processName");
                            return;
                        }
                        y15Var.b = processName;
                        y15Var.c = applicationExitInfoG.getReason();
                        y15Var.j = (byte) (y15Var.j | 2);
                        y15Var.g = applicationExitInfoG.getTimestamp();
                        y15Var.j = (byte) (y15Var.j | 32);
                        y15Var.f41838a = applicationExitInfoG.getPid();
                        y15Var.j = (byte) (y15Var.j | 1);
                        y15Var.e = applicationExitInfoG.getPss();
                        y15Var.j = (byte) (y15Var.j | 8);
                        y15Var.f = applicationExitInfoG.getRss();
                        y15Var.j = (byte) (y15Var.j | 16);
                        y15Var.h = strE;
                        z15 z15VarA = y15Var.a();
                        int i5 = s9fVar.f31849a.getResources().getConfiguration().orientation;
                        m25 m25Var = new m25();
                        m25Var.b = "anr";
                        long j = z15VarA.g;
                        m25Var.f21039a = j;
                        m25Var.g = (byte) (m25Var.g | 1);
                        rrd rrdVar = s9fVar.c;
                        if (!s9fVar.e.e().b.c || ((ArrayList) rrdVar.d).size() <= 0) {
                            i2 = i5;
                            str = "activity";
                            xzpVar = xzpVar2;
                            listUnmodifiableList = null;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it = ((ArrayList) rrdVar.d).iterator();
                            while (it.hasNext()) {
                                int i6 = i5;
                                cb9 cb9Var = (cb9) it.next();
                                Iterator it2 = it;
                                String str6 = cb9Var.f4051a;
                                if (str6 == null) {
                                    hny.u("Null libraryName");
                                    return;
                                }
                                xzp xzpVar3 = xzpVar2;
                                String str7 = cb9Var.b;
                                if (str7 == null) {
                                    hny.u("Null arch");
                                    return;
                                }
                                String str8 = cb9Var.c;
                                if (str8 == null) {
                                    hny.u("Null buildId");
                                    return;
                                }
                                arrayList3.add(new a25(str7, str6, str8));
                                it = it2;
                                i5 = i6;
                                xzpVar2 = xzpVar3;
                                str3 = str3;
                            }
                            i2 = i5;
                            str = str3;
                            xzpVar = xzpVar2;
                            listUnmodifiableList = Collections.unmodifiableList(arrayList3);
                        }
                        y15 y15Var2 = new y15();
                        y15Var2.d = z15VarA.d;
                        byte b2 = (byte) (y15Var2.j | 4);
                        y15Var2.j = b2;
                        String str9 = z15VarA.b;
                        if (str9 == null) {
                            hny.u("Null processName");
                            return;
                        }
                        y15Var2.b = str9;
                        y15Var2.c = z15VarA.c;
                        y15Var2.g = j;
                        y15Var2.f41838a = z15VarA.f43601a;
                        y15Var2.e = z15VarA.e;
                        y15Var2.f = z15VarA.f;
                        y15Var2.j = (byte) (((byte) (((byte) (((byte) (((byte) (b2 | 2)) | 32)) | 1)) | 8)) | 16);
                        y15Var2.h = z15VarA.h;
                        y15Var2.i = listUnmodifiableList;
                        z15 z15VarA2 = y15Var2.a();
                        int i7 = z15VarA2.d;
                        Boolean boolValueOf = Boolean.valueOf(i7 != 100);
                        String str10 = z15VarA2.b;
                        int i8 = z15VarA2.f43601a;
                        str10.getClass();
                        kjv kjvVar = new kjv();
                        kjvVar.e = str10;
                        kjvVar.f18405a = i8;
                        byte b3 = (byte) (kjvVar.d | 1);
                        kjvVar.b = i7;
                        kjvVar.c = false;
                        kjvVar.d = (byte) (((byte) (b3 | 2)) | 4);
                        x25 x25VarA = kjvVar.a();
                        t25 t25VarE = s9f.e();
                        List listA = s9fVar.a();
                        if (listA == null) {
                            hny.u("Null binaries");
                            return;
                        }
                        m25Var.c = new p25(new q25(null, null, z15VarA2, null, t25VarE, listA), null, null, boolValueOf, x25VarA, null, i2);
                        m25Var.d = s9fVar.b(i2);
                        n25 n25VarA = m25Var.a();
                        String strK2 = kng0.k("Persisting anr for session ", str4);
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", strK2, null);
                        }
                        ((x9f) ywq0Var.b).e(ywq0.b(ywq0.a(n25VarA, yzn0Var, ywq0Var2, Collections.EMPTY_MAP), ywq0Var2), str4, true);
                    }
                    i = 2;
                } else {
                    k8fVar = k8fVar2;
                    str = "activity";
                    xzpVar = xzpVar2;
                    arrayList = arrayList2;
                    String strK3 = kng0.k("No ApplicationExitInfo available. Session: ", str4);
                    i = 2;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        th = null;
                        Log.v("FirebaseCrashlytics", strK3, null);
                    }
                }
                th = null;
            } else {
                k8fVar = k8fVar2;
                str = "activity";
                xzpVar = xzpVar2;
                arrayList = arrayList2;
                th = null;
                i = 2;
                String strM = twn.m(i4, "ANR feature enabled, but device is API ");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strM, null);
                }
            }
        } else {
            k8fVar = k8fVar2;
            str = "activity";
            xzpVar = xzpVar2;
            arrayList = arrayList2;
            i = 2;
            th = null;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
            }
        }
        if (z2 && k8fVar.c()) {
            String strK4 = kng0.k("Finalizing native report for session ", str4);
            if (Log.isLoggable("FirebaseCrashlytics", i)) {
                Log.v("FirebaseCrashlytics", strK4, th);
            }
            k8fVar.a().getClass();
            Log.w("FirebaseCrashlytics", "No minidump data found for session " + str4, th);
            Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str4, th);
            Log.w("FirebaseCrashlytics", "No native core present", th);
        }
        if (Build.VERSION.SDK_INT >= 37) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(str);
            z7f z7fVar = new z7f((byte) 2);
            File file = new File((File) xzpVar.d, str4);
            file.mkdirs();
            List list = (List) xzp.V(file.listFiles(z7fVar)).stream().map(new t24((byte) 1)).filter(new c8f((byte) 0)).collect(Collectors.toList());
            List historicalProcessExitReasons2 = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
            Optional optionalFindFirst = list.stream().findFirst();
            if (!optionalFindFirst.isPresent()) {
                final byte b4 = 1;
                optionalFindFirst = ywq0Var.g(str4, historicalProcessExitReasons2, new Predicate() { // from class: a.eki0
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) obj;
                        switch (b4) {
                            case 0:
                                return applicationExitInfo.getReason() == 6;
                            default:
                                return (applicationExitInfo.getReason() == 3 && applicationExitInfo.getDescription() != null && applicationExitInfo.getDescription().contains("OOM")) || (applicationExitInfo.getReason() == 2 && applicationExitInfo.getStatus() == OsConstants.SIGKILL);
                        }
                    }
                }) != null ? Optional.of(7) : Optional.empty();
                Objects.requireNonNull(optionalFindFirst);
            }
            optionalFindFirst.ifPresent(new Consumer() { // from class: a.fki0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    String str11 = str4;
                    x9f x9fVar = (x9f) ywq0Var.b;
                    e25 e25Var = new e25(new f25(((Integer) obj).intValue()));
                    try {
                        x9f.g.getClass();
                        x9f.g(x9fVar.b.G(str11, "profiling-manager-info"), v9f.f37032a.a(e25Var));
                    } catch (IOException e5) {
                        Log.w("FirebaseCrashlytics", "Could not persist Profiling Manager info " + str11, e5);
                    }
                }
            });
        }
        if (z != 0) {
            z3 = false;
            str2 = (String) arrayList.get(0);
        } else {
            z3 = false;
            this.l.a(null);
            str2 = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        x9f x9fVar = (x9f) ywq0Var.b;
        xzp xzpVar4 = x9fVar.b;
        xzpVar4.g(".com.google.firebase.crashlytics");
        xzpVar4.g(".com.google.firebase.crashlytics-ndk");
        if (!((String) xzpVar4.f41764a).isEmpty()) {
            xzpVar4.g(".com.google.firebase.crashlytics.files.v1");
            String str11 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
            File file2 = (File) xzpVar4.b;
            if (file2.exists()) {
                String[] list2 = file2.list(new yrd(str11, (byte) 1));
                if (list2 != null) {
                    int length = list2.length;
                    for (?? r8 = z3; r8 < length; r8++) {
                        xzpVar4.g(list2[r8]);
                    }
                }
            }
        }
        NavigableSet<String> navigableSetD = x9fVar.d();
        if (str2 != null) {
            navigableSetD.remove(str2);
        }
        if (navigableSetD.size() > 8) {
            while (navigableSetD.size() > 8) {
                String str12 = (String) navigableSetD.last();
                String strK5 = kng0.k("Removing session over cap: ", str12);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", strK5, null);
                }
                xzp.T(new File((File) xzpVar4.d, str12));
                navigableSetD.remove(str12);
            }
        }
        for (String str13 : navigableSetD) {
            String strK6 = kng0.k("Finalizing report for session ", str13);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strK6, null);
            }
            v9f v9fVar = x9f.g;
            z7f z7fVar2 = x9f.i;
            File file3 = new File((File) xzpVar4.d, str13);
            file3.mkdirs();
            List<File> listV = xzp.V(file3.listFiles(z7fVar2));
            if (listV.isEmpty()) {
                String strL = kng0.l("Session ", str13, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strL, null);
                }
            } else {
                Collections.sort(listV);
                ArrayList arrayList4 = new ArrayList();
                boolean z5 = z3;
                for (File file4 : listV) {
                    try {
                        String strF = x9f.f(file4);
                        v9fVar.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(strF));
                            try {
                                n25 n25VarD = v9f.d(jsonReader);
                                jsonReader.close();
                                arrayList4.add(x9fVar.a(str13, n25VarD));
                                if (z5) {
                                    z4 = true;
                                } else {
                                    String name = file4.getName();
                                    if (name.startsWith("event") && name.endsWith(BundleUtil.UNDERLINE_TAG)) {
                                        z4 = true;
                                    } else {
                                        z4 = z3;
                                    }
                                }
                                z5 = z4;
                            } catch (Throwable th4) {
                                try {
                                    jsonReader.close();
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                }
                                throw th4;
                            }
                        } catch (IllegalStateException e5) {
                            throw new IOException(e5);
                        }
                    } catch (IOException e6) {
                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file4, e6);
                    }
                }
                if (arrayList4.isEmpty()) {
                    Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str13, null);
                } else {
                    String strD = new oa40(xzpVar4).d(str13);
                    es esVar = x9fVar.d.b;
                    synchronized (esVar) {
                        if (Objects.equals((String) esVar.b, str13)) {
                            strSubstring = (String) esVar.c;
                        } else {
                            xzp xzpVar5 = (xzp) esVar.f8305a;
                            z7f z7fVar3 = es.d;
                            File file5 = new File((File) xzpVar5.d, str13);
                            file5.mkdirs();
                            List listV2 = xzp.V(file5.listFiles(z7fVar3));
                            if (listV2.isEmpty()) {
                                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
                                strSubstring = null;
                            } else {
                                strSubstring = ((File) Collections.min(listV2, es.e)).getName().substring(i3);
                            }
                        }
                    }
                    File fileG2 = xzpVar4.G(str13, "report");
                    try {
                        String strF2 = x9f.f(fileG2);
                        v9fVar.getClass();
                        w15 w15VarJ = v9f.j(strF2);
                        v15 v15VarA = w15VarJ.a();
                        q9f q9fVar = w15VarJ.k;
                        if (q9fVar != null) {
                            try {
                                g25 g25VarA = q9fVar.a();
                                g25VarA.e = Long.valueOf(jCurrentTimeMillis);
                                g25VarA.f = z5;
                                try {
                                    g25VarA.m = (byte) (g25VarA.m | 2);
                                    if (strD != null) {
                                        g25VarA.h = new h35(strD);
                                    }
                                    v15VarA.j = g25VarA.a();
                                } catch (IOException e7) {
                                    e = e7;
                                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileG2, e);
                                    xzp.T(new File((File) xzpVar4.d, str13));
                                    z3 = false;
                                    i3 = 4;
                                }
                            } catch (IOException e8) {
                                e = e8;
                            }
                        }
                        w15 w15VarA = v15VarA.a();
                        v15 v15VarA2 = w15VarA.a();
                        v15VarA2.g = strSubstring;
                        q9f q9fVar2 = w15VarA.k;
                        if (q9fVar2 != null) {
                            g25 g25VarA2 = q9fVar2.a();
                            g25VarA2.c = strSubstring;
                            v15VarA2.j = g25VarA2.a();
                        }
                        w15 w15VarA2 = v15VarA2.a();
                        q9f q9fVar3 = w15VarA2.k;
                        if (q9fVar3 == null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        v15 v15VarA3 = w15VarA2.a();
                        g25 g25VarA3 = q9fVar3.a();
                        g25VarA3.k = arrayList4;
                        v15VarA3.j = g25VarA3.a();
                        w15 w15VarA3 = v15VarA3.a();
                        q9f q9fVar4 = w15VarA3.k;
                        if (q9fVar4 != null) {
                            String str14 = "appQualitySessionId: " + strSubstring;
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    try {
                                        Log.d("FirebaseCrashlytics", str14, null);
                                    } catch (IOException e9) {
                                        e = e9;
                                        Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileG2, e);
                                    }
                                }
                                x9f.g(z5 ? new File((File) xzpVar4.f, ((h25) q9fVar4).b) : new File((File) xzpVar4.e, ((h25) q9fVar4).b), v9f.f37032a.a(w15VarA3));
                            } catch (IOException e10) {
                                e = e10;
                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileG2, e);
                            }
                        }
                        e = e9;
                    } catch (IOException e11) {
                        e = e11;
                    }
                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileG2, e);
                }
                xzp.T(new File((File) xzpVar4.d, str13));
                z3 = false;
                i3 = 4;
            }
            xzp.T(new File((File) xzpVar4.d, str13));
            z3 = false;
            i3 = 4;
        }
        x860 x860Var = x9fVar.c.e().f20766a;
        ArrayList arrayListC = x9fVar.c();
        int size = arrayListC.size();
        if (size <= 4) {
            return;
        }
        Iterator it3 = arrayListC.subList(4, size).iterator();
        while (it3.hasNext()) {
            ((File) it3.next()).delete();
        }
    }

    public final void b(String str, Boolean bool) {
        String str2;
        String str3;
        String str4;
        int i;
        Integer num;
        Map mapUnmodifiableMap;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strK = kng0.k("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strK, null);
        }
        Locale locale = Locale.US;
        hxw hxwVar = this.f;
        rrd rrdVar = this.h;
        e55 e55Var = new e55(hxwVar.c, (String) rrdVar.g, (String) rrdVar.h, hxwVar.c().f1941a, b1j.b(((String) rrdVar.e) != null ? 4 : 1), (fhj) rrdVar.i);
        String str5 = Build.VERSION.RELEASE;
        String str6 = Build.VERSION.CODENAME;
        g55 g55Var = new g55(aad.S());
        Context context = this.f9100a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        z9d z9dVar = z9d.f44011a;
        String str7 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str7)) {
            z9d z9dVar2 = (z9d) z9d.b.get(str7.toLowerCase(locale));
            if (z9dVar2 != null) {
                z9dVar = z9dVar2;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int iOrdinal = z9dVar.ordinal();
        String str8 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jH = aad.H(context);
        boolean zR = aad.R();
        int iM = aad.M();
        String str9 = Build.MANUFACTURER;
        String str10 = Build.PRODUCT;
        this.j.d(str, jCurrentTimeMillis, new d55(e55Var, g55Var, new f55(iOrdinal, iAvailableProcessors, jH, blockCount, zR, iM)));
        if (!bool.booleanValue() || str == null) {
            str2 = str6;
            str3 = str9;
            str4 = str10;
            i = 4;
        } else {
            ywq0 ywq0Var = this.d;
            synchronized (((String) ywq0Var.c)) {
                ywq0Var.c = str;
                qmy qmyVar = (qmy) ((AtomicMarkableReference) ((o24) ywq0Var.d).b).getReference();
                synchronized (qmyVar) {
                    mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(qmyVar.f29008a));
                }
                str3 = str9;
                str2 = str6;
                str4 = str10;
                i = 4;
                ((aaf) ((cu) ywq0Var.b).c).a(new qx9((Object) ywq0Var, (Object) str, (Object) mapUnmodifiableMap, (Object) ((jdg0) ywq0Var.f).c(), (byte) 10));
            }
        }
        yzn0 yzn0Var = this.i;
        ((lzp) yzn0Var.b).closeLogFile();
        yzn0Var.b = yzn0.c;
        if (str != null) {
            yzn0Var.b = new ild0(((xzp) yzn0Var.f43523a).G(str, "userlog"));
        }
        this.l.a(str);
        ywq0 ywq0Var2 = this.m;
        s9f s9fVar = (s9f) ywq0Var2.f43384a;
        Charset charset = r9f.f30077a;
        v15 v15Var = new v15();
        v15Var.f36612a = "20.1.1";
        rrd rrdVar2 = s9fVar.c;
        String str11 = (String) rrdVar2.b;
        if (str11 == null) {
            hny.u("Null gmpAppId");
            return;
        }
        v15Var.b = str11;
        hxw hxwVar2 = s9fVar.b;
        String str12 = hxwVar2.c().f1941a;
        if (str12 == null) {
            hny.u("Null installationUuid");
            return;
        }
        v15Var.d = str12;
        v15Var.e = hxwVar2.c().b;
        v15Var.f = hxwVar2.c().c;
        String str13 = (String) rrdVar2.g;
        if (str13 == null) {
            hny.u("Null buildVersion");
            return;
        }
        v15Var.h = str13;
        String str14 = (String) rrdVar2.h;
        if (str14 == null) {
            hny.u("Null displayVersion");
            return;
        }
        v15Var.i = str14;
        v15Var.c = i;
        v15Var.m = (byte) (v15Var.m | 1);
        g25 g25Var = new g25();
        g25Var.f = false;
        byte b = (byte) (g25Var.m | 2);
        g25Var.d = jCurrentTimeMillis;
        g25Var.m = (byte) (b | 1);
        if (str == null) {
            hny.u("Null identifier");
            return;
        }
        g25Var.b = str;
        String str15 = s9f.g;
        if (str15 == null) {
            hny.u("Null generator");
            return;
        }
        g25Var.f10545a = str15;
        String str16 = hxwVar2.c;
        if (str16 == null) {
            hny.u("Null identifier");
            return;
        }
        fhj fhjVar = (fhj) rrdVar2.i;
        String str17 = hxwVar2.c().f1941a;
        mgk mgkVar = (mgk) fhjVar.b;
        if (mgkVar == null) {
            mgkVar = new mgk(fhjVar);
            fhjVar.b = mgkVar;
        }
        mgk mgkVar2 = mgkVar;
        String str18 = mgkVar.f21747a;
        if (mgkVar2 == null) {
            mgkVar2 = new mgk(fhjVar);
            fhjVar.b = mgkVar2;
        }
        g25Var.g = new i25(str16, str13, str14, str17, str18, mgkVar2.b);
        f35 f35Var = new f35();
        f35Var.f8844a = 3;
        f35Var.e = (byte) (f35Var.e | 1);
        if (str5 == null) {
            hny.u("Null version");
            return;
        }
        f35Var.b = str5;
        if (str2 == null) {
            hny.u("Null buildVersion");
            return;
        }
        f35Var.c = str2;
        f35Var.d = aad.S();
        f35Var.e = (byte) (f35Var.e | 2);
        g25Var.i = f35Var.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str7) && (num = (Integer) s9f.f.get(str7.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jH2 = aad.H(s9fVar.f31849a);
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zR2 = aad.R();
        int iM2 = aad.M();
        k25 k25Var = new k25();
        k25Var.f17558a = iIntValue;
        byte b2 = (byte) (k25Var.j | 1);
        k25Var.j = b2;
        if (str8 == 0) {
            hny.u("Null model");
            return;
        }
        k25Var.b = str8;
        k25Var.c = iAvailableProcessors2;
        k25Var.d = jH2;
        k25Var.e = blockCount2;
        k25Var.f = zR2;
        k25Var.g = iM2;
        k25Var.j = (byte) (((byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16)) | 32);
        String str19 = str3;
        if (str19 == null) {
            hny.u("Null manufacturer");
            return;
        }
        k25Var.h = str19;
        String str20 = str4;
        if (str20 == null) {
            hny.u("Null modelClass");
            return;
        }
        k25Var.i = str20;
        g25Var.j = k25Var.a();
        g25Var.l = 3;
        g25Var.m = (byte) (g25Var.m | 4);
        v15Var.j = g25Var.a();
        w15 w15VarA = v15Var.a();
        xzp xzpVar = ((x9f) ywq0Var2.b).b;
        q9f q9fVar = w15VarA.k;
        if (q9fVar == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str21 = ((h25) q9fVar).b;
        try {
            x9f.g.getClass();
            x9f.g(xzpVar.G(str21, "report"), v9f.f37032a.a(w15VarA));
            File fileG = xzpVar.G(str21, "start-time");
            long j = ((h25) q9fVar).d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileG), x9f.e);
            try {
                outputStreamWriter.write("");
                fileG.setLastModified(j * 1000);
                outputStreamWriter.close();
            } catch (Throwable th) {
                try {
                    outputStreamWriter.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e) {
            String strK2 = kng0.k("Could not persist report for session ", str21);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strK2, e);
            }
        }
    }

    public final void c(final String str) {
        ExecutorService executorService = ((aaf) this.e.c).f520a;
        ProfilingManager profilingManager = (ProfilingManager) this.f9100a.getSystemService(ProfilingManager.class);
        Object[] objArr = {new ProfilingTrigger.Builder(7).build(), new ProfilingTrigger.Builder(8).build()};
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        profilingManager.addProfilingTriggers(Collections.unmodifiableList(arrayList));
        profilingManager.registerForAllProfilingResults(executorService, new Consumer() { // from class: a.b8f
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                String str2;
                f8f f8fVar = this.f2153a;
                String str3 = str;
                int triggerType = ((ProfilingResult) obj2).getTriggerType();
                if (triggerType == 8) {
                    str2 = "trigger-type-anomaly";
                } else {
                    str2 = triggerType == 7 ? "trigger-type-oom" : "trigger-type-unknown";
                }
                try {
                    if (f8fVar.g.G(str3, str2).createNewFile()) {
                        return;
                    }
                    String str4 = "Trigger file " + str2 + " exists for session: " + str3;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str4, null);
                    }
                } catch (IOException unused) {
                    Log.e("FirebaseCrashlytics", "Unable to touch trigger file ".concat(str2), null);
                }
            }
        });
    }

    public final boolean d(sd60 sd60Var) throws Throwable {
        cu.d();
        y9f y9fVar = this.n;
        if (y9fVar != null && y9fVar.e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            a(true, sd60Var, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public final String e() {
        NavigableSet navigableSetD = ((x9f) this.m.b).d();
        if (navigableSetD.isEmpty()) {
            return null;
        }
        return (String) navigableSetD.first();
    }

    public final String f() throws IOException {
        InputStream resourceAsStream;
        Context context = this.f9100a;
        int iN = aad.N(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = iN == 0 ? null : context.getResources().getString(iN);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(s), 0);
        }
        ClassLoader classLoader = f8f.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from file", null);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = resourceAsStream.read(bArr);
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String strEncodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return strEncodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            resourceAsStream.close();
            throw th4;
        }
    }

    public final Task g() {
        Task taskCall;
        ArrayList arrayList = new ArrayList();
        for (File file : xzp.V(((File) this.g.c).listFiles(r))) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    taskCall = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    taskCall = Tasks.call(new ScheduledThreadPoolExecutor(1), new e8f(this, j));
                }
                arrayList.add(taskCall);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    public final void h() {
        try {
            String strF = f();
            if (strF != null) {
                try {
                    ((o24) this.d.e).s("com.crashlytics.version-control-info", strF);
                } catch (IllegalArgumentException e) {
                    Context context = this.f9100a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e2);
        }
    }

    public final void i(Task task) {
        Task task2;
        Task taskR0;
        TaskCompletionSource taskCompletionSource = this.o;
        xzp xzpVar = ((x9f) this.m.b).b;
        if (xzp.V(((File) xzpVar.e).listFiles()).isEmpty() && xzp.V(((File) xzpVar.f).listFiles()).isEmpty() && xzp.V(((File) xzpVar.g).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        rv00 rv00Var = rv00.s;
        rv00Var.D("Crash reports are available to be sent.");
        qaj qajVar = this.b;
        if (qajVar.e()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            taskR0 = Tasks.forResult(Boolean.TRUE);
        } else {
            rv00Var.t("Automatic data collection is disabled.");
            rv00Var.D("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (qajVar.b) {
                task2 = ((TaskCompletionSource) qajVar.d).getTask();
            }
            Task taskOnSuccessTask = task2.onSuccessTask(new qud());
            rv00Var.t("Waiting for send/deleteUnsentReports to be called.");
            taskR0 = q8a.r0(taskOnSuccessTask, this.p.getTask());
        }
        aaf aafVar = (aaf) this.e.b;
        xr xrVar = new xr();
        xrVar.b = this;
        xrVar.f41344a = task;
        taskR0.onSuccessTask(aafVar, xrVar);
    }
}
