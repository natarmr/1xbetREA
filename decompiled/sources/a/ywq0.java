package a;

import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.preference.PreferenceManager;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharConversionException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.function.Predicate;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;

/* JADX INFO: loaded from: classes.dex */
public final class ywq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f43384a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public ywq0(xju0 xju0Var) {
        this.f43384a = new Matrix();
        this.b = new Matrix();
        this.d = new float[1];
        this.e = new Matrix();
        this.f = new float[2];
        this.g = new Matrix();
        new Matrix();
        this.c = xju0Var;
    }

    public static yox A(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            return new yox((dny) ((gny) ywu.j(gny.D(byteArrayInputStream, qso.a())).b).w());
        } finally {
            byteArrayInputStream.close();
        }
    }

    public static n25 a(n25 n25Var, yzn0 yzn0Var, ywq0 ywq0Var, Map map) {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        Map mapUnmodifiableMap3;
        m25 m25VarA = n25Var.a();
        String strA = ((lzp) yzn0Var.b).a();
        if (strA != null) {
            m25VarA.e = new a35(strA);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        boolean zIsEmpty = map.isEmpty();
        o24 o24Var = (o24) ywq0Var.d;
        if (zIsEmpty) {
            qmy qmyVar = (qmy) ((AtomicMarkableReference) o24Var.b).getReference();
            synchronized (qmyVar) {
                mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap(qmyVar.f29008a));
            }
        } else {
            qmy qmyVar2 = (qmy) ((AtomicMarkableReference) o24Var.b).getReference();
            synchronized (qmyVar2) {
                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(qmyVar2.f29008a));
            }
            HashMap map2 = new HashMap(mapUnmodifiableMap);
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strA2 = qmy.a(1024, (String) entry.getKey());
                if (map2.size() < 64 || map2.containsKey(strA2)) {
                    map2.put(strA2, qmy.a(1024, (String) entry.getValue()));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
        }
        List listK = k(mapUnmodifiableMap2);
        qmy qmyVar3 = (qmy) ((AtomicMarkableReference) ((o24) ywq0Var.e).b).getReference();
        synchronized (qmyVar3) {
            mapUnmodifiableMap3 = Collections.unmodifiableMap(new HashMap(qmyVar3.f29008a));
        }
        List listK2 = k(mapUnmodifiableMap3);
        if (!listK.isEmpty() || !listK2.isEmpty()) {
            o25 o25VarA = n25Var.c.a();
            o25VarA.b = listK;
            o25VarA.c = listK2;
            m25VarA.c = o25VarA.a();
        }
        return m25VarA.a();
    }

    public static n9f b(n25 n25Var, ywq0 ywq0Var) {
        List listC = ((jdg0) ywq0Var.f).c();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listC.size(); i++) {
            idg0 idg0Var = (idg0) listC.get(i);
            idg0Var.getClass();
            b35 b35Var = new b35();
            w45 w45Var = (w45) idg0Var;
            String str = w45Var.e;
            if (str == null) {
                hny.u("Null variantId");
                return null;
            }
            String str2 = w45Var.b;
            if (str2 == null) {
                hny.u("Null rolloutId");
                return null;
            }
            b35Var.f1885a = new d35(str2, str);
            String str3 = w45Var.c;
            if (str3 == null) {
                hny.u("Null parameterKey");
                return null;
            }
            b35Var.b = str3;
            b35Var.c = w45Var.d;
            b35Var.d = w45Var.f;
            b35Var.e = (byte) (b35Var.e | 1);
            arrayList.add(b35Var.a());
        }
        if (arrayList.isEmpty()) {
            return n25Var;
        }
        m25 m25VarA = n25Var.a();
        m25VarA.f = new e35(arrayList);
        return m25VarA.a();
    }

    public static String e(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = bufferedInputStream.read(bArr);
                    if (i == -1) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    try {
                        bufferedInputStream.close();
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
            bufferedInputStream.close();
            throw th4;
        }
    }

    public static ywq0 f(Context context, hxw hxwVar, xzp xzpVar, rrd rrdVar, yzn0 yzn0Var, ywq0 ywq0Var, dq00 dq00Var, sd60 sd60Var, zn00 zn00Var, a8f a8fVar, cu cuVar) {
        s9f s9fVar = new s9f(context, hxwVar, rrdVar, dq00Var, sd60Var);
        x9f x9fVar = new x9f(xzpVar, sd60Var, a8fVar);
        v9f v9fVar = pcj.b;
        eps0.b(context);
        return new ywq0(s9fVar, x9fVar, new pcj(new amf0(eps0.a().c(new ug9(pcj.c, pcj.d)).a("FIREBASE_CRASHLYTICS_REPORT", new gwn("json"), pcj.e), sd60Var.e(), zn00Var)), yzn0Var, ywq0Var, hxwVar, cuVar);
    }

    public static List k(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                hny.u("Null key");
                return null;
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                hny.u("Null value");
                return null;
            }
            arrayList.add(new b25(str, str2));
        }
        Collections.sort(arrayList, new l13((byte) 23));
        return Collections.unmodifiableList(arrayList);
    }

    public yox B(byte[] bArr) {
        try {
            this.e = new a03().c((String) this.d);
            try {
                return new yox((dny) ((gny) ywu.z(new yk50((Object) new ByteArrayInputStream(bArr), (byte) 14), (r60) this.e).b).w());
            } catch (IOException | GeneralSecurityException e) {
                try {
                    return A(bArr);
                } catch (IOException unused) {
                    throw e;
                }
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            try {
                yox yoxVarA = A(bArr);
                Log.w("yk50", "cannot use Android Keystore, it'll be disabled", e2);
                return yoxVarA;
            } catch (IOException unused2) {
                throw e2;
            }
        }
    }

    public r60 C() throws KeyStoreException {
        a03 a03Var = new a03();
        try {
            boolean zA = a03.a((String) this.d);
            try {
                return a03Var.c((String) this.d);
            } catch (GeneralSecurityException | ProviderException e) {
                if (!zA) {
                    throw new KeyStoreException(kng0.l("the master key ", (String) this.d, " exists but is unusable"), e);
                }
                Log.w("yk50", "cannot use Android Keystore, it'll be disabled", e);
                return null;
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            Log.w("yk50", "cannot use Android Keystore, it'll be disabled", e2);
            return null;
        }
    }

    public Task D(String str, Executor executor) {
        x15 x15Var;
        TaskCompletionSource taskCompletionSource;
        ArrayList<File> arrayListC = ((x9f) this.b).c();
        ArrayList<x15> arrayList = new ArrayList();
        for (File file : arrayListC) {
            try {
                v9f v9fVar = x9f.g;
                String strF = x9f.f(file);
                v9fVar.getClass();
                arrayList.add(new x15(v9f.j(strF), file.getName(), file));
            } catch (IOException e) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (x15 x15Var2 : arrayList) {
            if (str == null || str.equals(x15Var2.b)) {
                pcj pcjVar = (pcj) this.c;
                w15 w15Var = x15Var2.f40103a;
                if (w15Var.f == null || w15Var.g == null) {
                    zfq zfqVarB = ((hxw) this.f).b(true);
                    w15 w15Var2 = x15Var2.f40103a;
                    String str2 = zfqVarB.f44312a;
                    v15 v15VarA = w15Var2.a();
                    v15VarA.e = str2;
                    w15 w15VarA = v15VarA.a();
                    String str3 = zfqVarB.b;
                    v15 v15VarA2 = w15VarA.a();
                    v15VarA2.f = str3;
                    x15Var = new x15(v15VarA2.a(), x15Var2.b, x15Var2.c);
                } else {
                    x15Var = x15Var2;
                }
                boolean z = str != null;
                amf0 amf0Var = pcjVar.f26762a;
                synchronized (amf0Var.f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z) {
                            ((AtomicInteger) amf0Var.i.f44650a).getAndIncrement();
                            if (amf0Var.f.size() < amf0Var.e) {
                                rv00 rv00Var = rv00.s;
                                rv00Var.t("Enqueueing report: " + x15Var.b);
                                rv00Var.t("Queue size: " + amf0Var.f.size());
                                amf0Var.g.execute(new hf5((Object) amf0Var, (Object) x15Var, (Object) taskCompletionSource, false, (byte) 8));
                                rv00Var.t("Closing task for report: " + x15Var.b);
                                taskCompletionSource.trySetResult(x15Var);
                            } else {
                                amf0Var.a();
                                String str4 = "Dropping report due to queue being full: " + x15Var.b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str4, null);
                                }
                                ((AtomicInteger) amf0Var.i.b).getAndIncrement();
                                taskCompletionSource.trySetResult(x15Var);
                            }
                        } else {
                            amf0Var.b(x15Var, taskCompletionSource);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new v4i0(this, (byte) 2)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:91:0x0205  */
    /* JADX WARN: Code duplicated, block: B:95:0x0211  */
    public Object E(m9s m9sVar, zje zjeVar) {
        kqp kqpVar;
        Object objR0;
        m9s m9sVar2;
        int i;
        r2s0 r2s0Var;
        Object objO;
        r2s0 r2s0Var2;
        m9s m9sVar3;
        m9s m9sVar4 = m9sVar;
        if (zjeVar instanceof kqp) {
            kqpVar = (kqp) zjeVar;
            int i2 = kqpVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kqpVar.n = i2 - Integer.MIN_VALUE;
            } else {
                kqpVar = new kqp(this, zjeVar);
            }
        } else {
            kqpVar = new kqp(this, zjeVar);
        }
        Object objJ = kqpVar.l;
        Object obj = wne.f39444a;
        int i3 = kqpVar.n;
        yje yjeVar = null;
        if (i3 != 0) {
            if (i3 == 1) {
                m9sVar4 = kqpVar.i;
                z1x.P(objJ);
            } else {
                if (i3 == 2) {
                    i = kqpVar.k;
                    m9sVar2 = kqpVar.i;
                    z1x.P(objJ);
                    r2s0Var = (r2s0) objJ;
                    String str = m9sVar2.u;
                    kqpVar.i = m9sVar2;
                    kqpVar.j = r2s0Var;
                    kqpVar.k = i;
                    kqpVar.n = 3;
                    objO = o(str, kqpVar);
                    if (objO != obj) {
                        r2s0Var2 = r2s0Var;
                        objJ = objO;
                        m9sVar3 = m9sVar2;
                    }
                    return obj;
                }
                if (i3 != 3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = kqpVar.k;
                r2s0Var2 = kqpVar.j;
                m9sVar3 = kqpVar.i;
                z1x.P(objJ);
            }
            return new vsg0(new lqp(m9sVar3, i != 0, r2s0Var2, this, (yws) objJ, null));
        }
        z1x.P(objJ);
        zn00 zn00Var = (zn00) this.b;
        Long lValueOf = Long.valueOf(m9sVar4.o);
        long j = m9sVar4.o;
        if (j == cug.d.b) {
            objR0 = cav.f4032a;
        } else if (j == wrg.d.b) {
            objR0 = vea.f37274a;
        } else if (j == mxg.d.b && m9sVar4.A == 2095742) {
            List list = gus0.f11946a;
            m6m0 m6m0Var = cus0.d;
            Long l = (Long) CollectionsKt.firstOrNull(m9sVar4.c);
            long jLongValue = l != null ? l.longValue() : 0L;
            m6m0Var.getClass();
            ArrayList arrayListR0 = CollectionsKt.r0(list, m6m0.f(jLongValue));
            Long l2 = (Long) CollectionsKt.firstOrNull(m9sVar4.d);
            long jLongValue2 = l2 != null ? l2.longValue() : 0L;
            m6m0Var.getClass();
            objR0 = CollectionsKt.r0(arrayListR0, m6m0.f(jLongValue2));
        } else if (j == vrg.d.b) {
            objR0 = aba.f569a;
        } else if (j == ntg.d.b) {
            objR0 = n8j.f23091a;
        } else if (j == lxg.d.b) {
            objR0 = ldq0.f19864a;
        } else if (j == jrg.d.b) {
            objR0 = y1g.f41852a;
        } else if (j == ovg.d.b) {
            objR0 = f960.f9141a;
        } else if (j == awg.d.b) {
            objR0 = bjg0.f2706a;
        } else {
            objR0 = (j == qtg.d.b && (m9sVar4.I instanceof qz7)) ? lz7.b : iun.f15405a;
        }
        Map mapB = wp20.b(new Pair(lValueOf, objR0));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapB.entrySet()) {
            if (!((Collection) entry.getValue()).isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        kqpVar.i = m9sVar4;
        kqpVar.n = 1;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (axq.y(((Number) entry2.getKey()).longValue(), (List) zn00Var.b)) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        boolean zIsEmpty = linkedHashMap2.isEmpty();
        Object obj2 = qtb0.f29291a;
        if (zIsEmpty) {
            objJ = obj2;
        } else {
            jw20 jw20Var = (jw20) zn00Var.f44650a;
            ArrayList arrayList = new ArrayList();
            Iterator it = linkedHashMap2.entrySet().iterator();
            while (it.hasNext()) {
                w3d.u(arrayList, (Iterable) ((Map.Entry) it.next()).getValue());
            }
            if (arrayList.isEmpty()) {
                objJ = obj2;
            } else {
                objJ = d5c.J(kqpVar, new vxb(jw20Var.b, (Object) arrayList, yjeVar, (byte) 24));
            }
        }
        if (objJ != obj) {
        }
        return obj;
        boolean z = ((rtb0) objJ) instanceof qtb0;
        cqg cqgVar = m9sVar4.I;
        kqpVar.i = m9sVar4;
        kqpVar.k = z ? 1 : 0;
        kqpVar.n = 2;
        Object objT = t(cqgVar, kqpVar);
        if (objT != obj) {
            m9sVar2 = m9sVar4;
            i = z ? 1 : 0;
            objJ = objT;
            r2s0Var = (r2s0) objJ;
            String str2 = m9sVar2.u;
            kqpVar.i = m9sVar2;
            kqpVar.j = r2s0Var;
            kqpVar.k = i;
            kqpVar.n = 3;
            objO = o(str2, kqpVar);
            if (objO != obj) {
                r2s0Var2 = r2s0Var;
                objJ = objO;
                m9sVar3 = m9sVar2;
                return new vsg0(new lqp(m9sVar3, i != 0, r2s0Var2, this, (yws) objJ, null));
            }
        }
        return obj;
    }

    public void F(ui90 ui90Var) {
        zg zgVar = (zg) this.b;
        String str = ui90Var.f35721a;
        i8i.D("action", str, zgVar.f44322a, "acc_change_email_info");
        b1j.v(str, ((au0) this.f).f1455a, 12673L);
    }

    public void G(boolean z) {
        zg zgVar = (zg) this.b;
        jo20 jo20Var = new jo20();
        jo20Var.put("screen", "acc_personal");
        if (z) {
            jo20Var.put("element", "bottom_managment");
        }
        zgVar.f44322a.a("acc_change_phone_call", jo20Var.b());
        au0 au0Var = (au0) this.f;
        yni0 yni0Var = new yni0();
        yni0Var.add(new j1p("acc_personal", (byte) 0));
        if (z) {
            yni0Var.add(new j1p("bottom_managment", (byte) 1));
        }
        au0Var.f1455a.a(cui0.a(yni0Var), 10846L);
    }

    public void H(String str) {
        b1j.v(str, ((ik4) this.g).f14907a, 3241L);
        i8i.D("point", str, ((vd1) this.f43384a).f37210a, "acc_change_password_no_phone");
    }

    public fiu0 I() {
        iyk iykVar = new iyk(2);
        iykVar.b(gmr0.class, (msi) this.f);
        iykVar.b(dmr0.class, (msi) this.g);
        return new fiu0(iykVar.a());
    }

    public fht0 J() {
        fht0 fht0Var = (fht0) this.g;
        if (fht0Var != null) {
            return fht0Var;
        }
        nfq nfqVar = (nfq) this.e;
        String strJ = ((x860) this.d).j();
        nfqVar.a();
        fht0 fht0Var2 = new fht0(nfqVar.f23449a, nfqVar, strJ);
        this.g = fht0Var2;
        return fht0Var2;
    }

    public synchronized yk50 c() {
        yk50 yk50Var;
        try {
            if (((String) this.b) == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            synchronized (yk50.c) {
                try {
                    Context context = (Context) this.f43384a;
                    String str = (String) this.b;
                    String str2 = (String) this.c;
                    byte[] bArrQ = null;
                    if (str != null) {
                        Context applicationContext = context.getApplicationContext();
                        try {
                            String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                            if (string != null) {
                                bArrQ = kbc.Q(string);
                            }
                        } catch (ClassCastException | IllegalArgumentException unused) {
                            throw new CharConversionException(kng0.l("can't read keyset; the pref value ", str, " is not a valid hex string"));
                        }
                    } else {
                        jf4.o("keysetName cannot be null");
                    }
                    String str3 = (String) this.d;
                    if (bArrQ == null) {
                        if (str3 != null) {
                            this.e = C();
                        }
                        this.g = h();
                    } else if (str3 != null) {
                        this.g = B(bArrQ);
                    } else {
                        this.g = A(bArrQ);
                    }
                    yk50Var = new yk50(this);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return yk50Var;
    }

    public boolean d() {
        List listL;
        n660 n660Var = (n660) this.d;
        List listL2 = n660Var.l(true);
        return (listL2 == null || listL2.isEmpty()) && ((listL = n660Var.l(false)) == null || listL.isEmpty());
    }

    public ApplicationExitInfo g(String str, List list, Predicate predicate) {
        long jLastModified = ((x9f) this.b).b.G(str, "start-time").lastModified();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoE = a7.e(it.next());
            if (applicationExitInfoE.getTimestamp() >= jLastModified && predicate.test(applicationExitInfoE)) {
                return applicationExitInfoE;
            }
        }
        return null;
    }

    public yox h() throws GeneralSecurityException, IOException {
        if (((cly) this.f) == null) {
            hny.o("cannot read or generate keyset");
            return null;
        }
        yox yoxVar = new yox(gny.C());
        cly clyVar = (cly) this.f;
        synchronized (yoxVar) {
            yoxVar.d(clyVar.f4582a);
        }
        int iX = ttt0.a((gny) yoxVar.i().b).y().x();
        synchronized (yoxVar) {
            for (int i = 0; i < ((gny) ((dny) yoxVar.f43005a).b).z(); i++) {
                try {
                    fny fnyVarY = ((gny) ((dny) yoxVar.f43005a).b).y(i);
                    if (fnyVarY.y() == iX) {
                        if (!fnyVarY.A().equals(zky.ENABLED)) {
                            throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + iX);
                        }
                        dny dnyVar = (dny) yoxVar.f43005a;
                        dnyVar.e();
                        ((gny) dnyVar.b).F(iX);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new GeneralSecurityException("key not found: " + iX);
        }
        Context context = (Context) this.f43384a;
        String str = (String) this.b;
        String str2 = (String) this.c;
        if (str == null) {
            jf4.o("keysetName cannot be null");
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        SharedPreferences.Editor editorEdit = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext).edit() : applicationContext.getSharedPreferences(str2, 0).edit();
        if (((r60) this.e) != null) {
            ywu ywuVarI = yoxVar.i();
            r60 r60Var = (r60) this.e;
            byte[] bArr = new byte[0];
            gny gnyVar = (gny) ywuVarI.b;
            byte[] bArrA = r60Var.a(gnyVar.e(), bArr);
            try {
                if (!gny.E(r60Var.b(bArrA, bArr), qso.a()).equals(gnyVar)) {
                    throw new GeneralSecurityException("cannot encrypt keyset");
                }
                nwn nwnVarY = own.y();
                kg9 kg9VarF = og9.f(bArrA, 0, bArrA.length);
                nwnVarY.e();
                ((own) nwnVarY.b).A(kg9VarF);
                mny mnyVarA = ttt0.a(gnyVar);
                nwnVarY.e();
                ((own) nwnVarY.b).B(mnyVarA);
                if (!editorEdit.putString(str, kbc.S(((own) nwnVarY.b()).e())).commit()) {
                    ohq.l("Failed to write to SharedPreferences");
                    return null;
                }
            } catch (ynx unused) {
                hny.o("invalid keyset, corrupted key material");
                return null;
            }
        } else if (!editorEdit.putString(str, kbc.S(((gny) yoxVar.i().b).e())).commit()) {
            ohq.l("Failed to write to SharedPreferences");
            return null;
        }
        return yoxVar;
    }

    public gmq i(long j, long j2, sip sipVar, CyberGamesPage cyberGamesPage) {
        if (sipVar == sip.b && !(cyberGamesPage instanceof CyberGamesPage.Real)) {
            e0g0 e0g0Var = j0g0.b;
            return new eu4(new j0g0(new g0g0(new g2((byte) 5))), (byte) 12);
        }
        yje yjeVar = null;
        byte b = 3;
        return new dnq(aoq.c(aoq.c(new vsg0(new o3s((Object) this, (Object) sipVar, yjeVar, (byte) 14)), new gxt(null, this, j2, sipVar, (byte) 3)), new bl00(null, cyberGamesPage, j, this)), new x5v(b, yjeVar, b), (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(zje zjeVar) {
        e0v e0vVar;
        int iIntValue;
        if (zjeVar instanceof e0v) {
            e0vVar = (e0v) zjeVar;
            int i = e0vVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                e0vVar.k = i - Integer.MIN_VALUE;
            } else {
                e0vVar = new e0v(this, zjeVar);
            }
        } else {
            e0vVar = new e0v(this, zjeVar);
        }
        Object objA = e0vVar.i;
        wne wneVar = wne.f39444a;
        int i2 = e0vVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            iIntValue = 0;
            if (((gst0) this.d).a()) {
                b3c0 b3c0Var = (b3c0) this.c;
                e0vVar.k = 1;
                objA = b3c0Var.a(false, e0vVar);
                if (objA == wneVar) {
                    return wneVar;
                }
            }
            return new Integer(iIntValue);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objA);
        Integer intOrNull = StringsKt.toIntOrNull(((m2c0) objA).c);
        iIntValue = intOrNull != null ? intOrNull.intValue() : 225;
        return new Integer(iIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(long j, long j2, zje zjeVar) {
        hqp hqpVar;
        Object g0g0Var;
        Pair pair;
        if (zjeVar instanceof hqp) {
            hqpVar = (hqp) zjeVar;
            int i = hqpVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                hqpVar.k = i - Integer.MIN_VALUE;
            } else {
                hqpVar = new hqp(this, zjeVar);
            }
        } else {
            hqpVar = new hqp(this, zjeVar);
        }
        Object objA = hqpVar.i;
        wne wneVar = wne.f39444a;
        int i2 = hqpVar.k;
        try {
            if (i2 == 0) {
                z1x.P(objA);
                String str = (String) this.g;
                if (str != null) {
                    return str;
                }
                if (j == mxg.d.b && j2 == 2095742) {
                    pair = new Pair("static/img/ImgDefault/Esports/Virtual/TwentyOne/Dota2/Font/ComicSansMS.ttf", "twenty_one_dota_font.ttf");
                } else if (j == wrg.d.b) {
                    pair = new Pair("/static/img/ImgDefault/Esports/Virtual/CardCricket/Font/Unbounded-Bold.ttf", "card_cricket_font.ttf");
                } else if (j == vrg.d.b) {
                    pair = new Pair("/static/img/ImgDefault/Esports/Virtual/CardBasketball/Font/DS-DIGIB.TTF", "card_basketball_font.ttf");
                } else if (j == lxg.d.b) {
                    pair = new Pair("/static/img/ImgDefault/Esports/Virtual/OXO/RobotoFlex.ttf", "tic_tac_toe_font.ttf");
                } else if (j == wtg.d.b) {
                    pair = new Pair("/static/img/ImgDefault/Esports/Virtual/FatalFury/Unbounded-Medium.ttf", "fatal_fury_font.ttf");
                } else {
                    pair = j == ovg.d.b ? new Pair("/static/img/ImgDefault/Esports/Virtual/Numbers/YesevaOne.ttf", "numbers_font.ttf") : new Pair("", "");
                }
                String str2 = (String) pair.f46059a;
                String str3 = (String) pair.b;
                e0g0 e0g0Var = j0g0.b;
                yox yoxVar = (yox) this.d;
                hqpVar.k = 1;
                objA = ((x0t0) ((w4p0) yoxVar.f43005a).b).a(str2, str3, hqpVar);
                if (objA == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objA);
            }
            g0g0Var = (String) objA;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null) {
            thA.printStackTrace();
        }
        String str4 = (String) (g0g0Var instanceof g0g0 ? "" : g0g0Var);
        this.g = str4;
        return str4;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x013d  */
    /* JADX WARN: Code duplicated, block: B:34:0x015f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0169  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public Serializable m(ctx ctxVar, s77 s77Var, zje zjeVar) {
        ec60 ec60Var;
        sff0 sff0VarA;
        rrd rrdVar;
        String str;
        long j;
        String str2;
        int id;
        boolean z;
        s77 s77Var2;
        List list;
        String str3;
        rrd rrdVar2;
        sff0 sff0Var;
        s77 s77Var3;
        List list2;
        List listJ;
        String str4;
        List list3;
        sff0 sff0Var2;
        int i;
        rrd rrdVar3;
        List list4;
        boolean z2;
        long j2;
        String str5;
        boolean z3;
        j1q0 j1q0Var = (j1q0) this.g;
        if (zjeVar instanceof ec60) {
            ec60Var = (ec60) zjeVar;
            int i2 = ec60Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ec60Var.u = i2 - Integer.MIN_VALUE;
            } else {
                ec60Var = new ec60(this, zjeVar);
            }
        } else {
            ec60Var = new ec60(this, zjeVar);
        }
        Object objB = ec60Var.s;
        wne wneVar = wne.f39444a;
        int i3 = ec60Var.u;
        if (i3 == 0) {
            z1x.P(objB);
            sff0VarA = ((pru) this.e).a();
            rrdVar = (rrd) this.f43384a;
            str = ctxVar.b.f22868a;
            j = ctxVar.c;
            str2 = ctxVar.d;
            id = ((uzc) this.b).b().getId();
            z = sff0VarA.f32117a.b.h;
            edo edoVar = (edo) this.d;
            ec60Var.i = sff0VarA;
            ec60Var.j = str2;
            s77Var2 = s77Var;
            ec60Var.k = s77Var2;
            ec60Var.l = str;
            ec60Var.m = rrdVar;
            ec60Var.p = z;
            ec60Var.q = id;
            ec60Var.r = j;
            ec60Var.u = 1;
            objB = edoVar.b(ec60Var);
            if (objB != wneVar) {
            }
            return wneVar;
        }
        if (i3 == 1) {
            j = ec60Var.r;
            id = ec60Var.q;
            z = ec60Var.p;
            rrdVar = ec60Var.m;
            str = ec60Var.l;
            s77Var2 = ec60Var.k;
            str2 = ec60Var.j;
            sff0VarA = ec60Var.i;
            z1x.P(objB);
        } else {
            if (i3 == 2) {
                j = ec60Var.r;
                id = ec60Var.q;
                boolean z4 = ec60Var.p;
                List list5 = ec60Var.n;
                rrd rrdVar4 = ec60Var.m;
                String str6 = ec60Var.l;
                s77 s77Var4 = ec60Var.k;
                String str7 = ec60Var.j;
                sff0 sff0Var3 = ec60Var.i;
                z1x.P(objB);
                sff0Var = sff0Var3;
                z = z4;
                str3 = str6;
                rrdVar2 = rrdVar4;
                list = list5;
                s77Var3 = s77Var4;
                str2 = str7;
                list2 = (List) objB;
                ocl oclVar = (ocl) this.f;
                ec60Var.i = sff0Var;
                ec60Var.j = str2;
                ec60Var.k = s77Var3;
                ec60Var.l = str3;
                ec60Var.m = rrdVar2;
                ec60Var.n = list;
                ec60Var.o = list2;
                ec60Var.p = z;
                ec60Var.q = id;
                ec60Var.r = j;
                ec60Var.u = 3;
                listJ = oclVar.j();
                if (listJ != wneVar) {
                    str4 = str2;
                    list3 = list2;
                    objB = listJ;
                    sff0Var2 = sff0Var;
                    i = id;
                    rrdVar3 = rrdVar2;
                    list4 = list;
                    z2 = z;
                    j2 = j;
                    str5 = str3;
                    s77 s77Var5 = s77Var3;
                    List list6 = (List) objB;
                    boolean zJ = j1q0Var.f15748a.j();
                    boolean z5 = sff0Var2.J1;
                    if (j1q0Var.f15748a.f()) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    ec60Var.i = null;
                    ec60Var.j = null;
                    ec60Var.k = null;
                    ec60Var.l = null;
                    ec60Var.m = null;
                    ec60Var.n = null;
                    ec60Var.o = null;
                    ec60Var.u = 4;
                    objB = rrdVar3.k(str5, j2, s77Var5, str4, i, z2, list4, list3, list6, zJ, z5, z3, ec60Var);
                    if (objB == wneVar) {
                        return wneVar;
                    }
                }
                return wneVar;
            }
            if (i3 == 3) {
                long j3 = ec60Var.r;
                int i4 = ec60Var.q;
                boolean z6 = ec60Var.p;
                List list7 = ec60Var.o;
                List list8 = ec60Var.n;
                rrd rrdVar5 = ec60Var.m;
                String str8 = ec60Var.l;
                s77Var3 = ec60Var.k;
                String str9 = ec60Var.j;
                sff0 sff0Var4 = ec60Var.i;
                z1x.P(objB);
                str4 = str9;
                sff0Var2 = sff0Var4;
                rrdVar3 = rrdVar5;
                i = i4;
                list4 = list8;
                str5 = str8;
                z2 = z6;
                list3 = list7;
                j2 = j3;
                s77 s77Var6 = s77Var3;
                List list9 = (List) objB;
                boolean zJ2 = j1q0Var.f15748a.j();
                boolean z7 = sff0Var2.J1;
                if (j1q0Var.f15748a.f() || sff0Var2.O1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                ec60Var.i = null;
                ec60Var.j = null;
                ec60Var.k = null;
                ec60Var.l = null;
                ec60Var.m = null;
                ec60Var.n = null;
                ec60Var.o = null;
                ec60Var.u = 4;
                objB = rrdVar3.k(str5, j2, s77Var6, str4, i, z2, list4, list3, list9, zJ2, z7, z3, ec60Var);
                if (objB == wneVar) {
                    return wneVar;
                }
            } else {
                if (i3 != 4) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objB);
            }
        }
        return (n3w) objB;
        List list10 = (List) objB;
        zfo zfoVar = (zfo) this.c;
        ec60Var.i = sff0VarA;
        ec60Var.j = str2;
        ec60Var.k = s77Var2;
        ec60Var.l = str;
        ec60Var.m = rrdVar;
        ec60Var.n = list10;
        ec60Var.p = z;
        ec60Var.q = id;
        ec60Var.r = j;
        ec60Var.u = 2;
        Object objB2 = zfoVar.b(ec60Var);
        if (objB2 != wneVar) {
            String str10 = str;
            list = list10;
            objB = objB2;
            str3 = str10;
            s77 s77Var7 = s77Var2;
            rrdVar2 = rrdVar;
            sff0Var = sff0VarA;
            s77Var3 = s77Var7;
            list2 = (List) objB;
            ocl oclVar2 = (ocl) this.f;
            ec60Var.i = sff0Var;
            ec60Var.j = str2;
            ec60Var.k = s77Var3;
            ec60Var.l = str3;
            ec60Var.m = rrdVar2;
            ec60Var.n = list;
            ec60Var.o = list2;
            ec60Var.p = z;
            ec60Var.q = id;
            ec60Var.r = j;
            ec60Var.u = 3;
            listJ = oclVar2.j();
            if (listJ != wneVar) {
                str4 = str2;
                list3 = list2;
                objB = listJ;
                sff0Var2 = sff0Var;
                i = id;
                rrdVar3 = rrdVar2;
                list4 = list;
                z2 = z;
                j2 = j;
                str5 = str3;
                s77 s77Var8 = s77Var3;
                List list11 = (List) objB;
                boolean zJ3 = j1q0Var.f15748a.j();
                boolean z8 = sff0Var2.J1;
                if (j1q0Var.f15748a.f()) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                ec60Var.i = null;
                ec60Var.j = null;
                ec60Var.k = null;
                ec60Var.l = null;
                ec60Var.m = null;
                ec60Var.n = null;
                ec60Var.o = null;
                ec60Var.u = 4;
                objB = rrdVar3.k(str5, j2, s77Var8, str4, i, z2, list4, list3, list11, zJ3, z8, z3, ec60Var);
                if (objB == wneVar) {
                    return wneVar;
                }
                return (n3w) objB;
            }
        }
        return wneVar;
    }

    public void n(float f, float f2, bp10 bp10Var) {
        float[] fArr = (float[]) this.f;
        fArr[0] = f;
        fArr[1] = f2;
        w(fArr);
        bp10Var.b = fArr[0];
        bp10Var.c = fArr[1];
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(String str, zje zjeVar) {
        iqp iqpVar;
        Object g0g0Var;
        yws ywsVar;
        if (zjeVar instanceof iqp) {
            iqpVar = (iqp) zjeVar;
            int i = iqpVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                iqpVar.k = i - Integer.MIN_VALUE;
            } else {
                iqpVar = new iqp(this, zjeVar);
            }
        } else {
            iqpVar = new iqp(this, zjeVar);
        }
        Object objF = iqpVar.i;
        wne wneVar = wne.f39444a;
        int i2 = iqpVar.k;
        boolean z = true;
        try {
            if (i2 == 0) {
                z1x.P(objF);
                tdt0 tdt0Var = (tdt0) ((p7m0) ((qz40) ((irh) ((rpt) this.f43384a).f30901a).f15255a.f13529a.getValue())).getValue();
                if (tdt0Var != null && (ywsVar = tdt0Var.e) != null) {
                    return ywsVar;
                }
                if (str.length() <= 0) {
                    str = null;
                }
                if (str == null) {
                    return null;
                }
                e0g0 e0g0Var = j0g0.b;
                lbu lbuVar = (lbu) this.e;
                iqpVar.k = 1;
                objF = lbuVar.f(str, iqpVar);
                if (objF == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objF);
            }
            g0g0Var = (String) objF;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        boolean z2 = j0g0.a(g0g0Var) instanceof lws;
        String str2 = (String) (g0g0Var instanceof g0g0 ? null : g0g0Var);
        String str3 = str2 == null ? "" : str2;
        if (!z2 && (str2 == null || str2.length() <= 0)) {
            z = false;
        }
        return new yws(z, z2, str3, 0);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object p(zje zjeVar) {
        p8c p8cVar;
        if (zjeVar instanceof p8c) {
            p8cVar = (p8c) zjeVar;
            int i = p8cVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                p8cVar.k = i - Integer.MIN_VALUE;
            } else {
                p8cVar = new p8c(this, zjeVar);
            }
        } else {
            p8cVar = new p8c(this, zjeVar);
        }
        p8c p8cVar2 = p8cVar;
        Object objA = p8cVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = p8cVar2.k;
        boolean z = true;
        if (i2 == 0) {
            z1x.P(objA);
            biu biuVar = (biu) this.f43384a;
            ucq ucqVar = (ucq) this.g;
            boolean z2 = ucqVar.l;
            boolean z3 = ucqVar.i;
            boolean z4 = ucqVar.k;
            boolean z5 = ucqVar.j;
            p8cVar2.k = 1;
            objA = biuVar.a(false, z2, z3, z4, z5, p8cVar2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        List list = (List) ((jzz) objA).b.get(LimitNeGroupEnum.SESSION_TIME_LIMITS);
        if (list == null || list.isEmpty()) {
            z = false;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((riq0) it.next()).d == orz.b) {
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public utb q(long j, boolean z, boolean z2, boolean z3) {
        if (z) {
            ((yqc) this.g).w(y9s.f42264a);
        }
        return aoq.c(aoq.c(((uzc) this.b).c(), new i0v((yje) null, this, z, j)), new b9u((byte) 5, null, this, z2, z3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Serializable r(List list, List list2, List list3, List list4, q4f q4fVar, ArrayList arrayList, g0f g0fVar, boolean z, boolean z2, zje zjeVar) {
        jzt jztVar;
        List list5;
        List<qu6> list6;
        List list7;
        List list8;
        q4f q4fVar2;
        g0f g0fVar2;
        boolean z3;
        Object obj;
        zri zriVar;
        ArrayList arrayList2;
        boolean z4;
        boolean z5;
        Object next;
        String str;
        ave aveVar;
        Object next2;
        String str2;
        Object next3;
        Object next4;
        if (zjeVar instanceof jzt) {
            jztVar = (jzt) zjeVar;
            int i = jztVar.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                jztVar.u = i - Integer.MIN_VALUE;
            } else {
                jztVar = new jzt(this, zjeVar);
            }
        } else {
            jztVar = new jzt(this, zjeVar);
        }
        Object obj2 = jztVar.s;
        wne wneVar = wne.f39444a;
        int i2 = jztVar.u;
        if (i2 == 0) {
            z1x.P(obj2);
            zri zriVar2 = (zri) this.f43384a;
            b3u b3uVar = (b3u) this.d;
            jztVar.i = list;
            list5 = list2;
            jztVar.j = list5;
            jztVar.k = list3;
            jztVar.l = list4;
            jztVar.m = q4fVar;
            jztVar.n = arrayList;
            jztVar.o = g0fVar;
            jztVar.p = zriVar2;
            jztVar.q = z;
            jztVar.r = z2;
            jztVar.u = 1;
            Serializable serializableA = b3uVar.a(jztVar);
            if (serializableA == wneVar) {
                return wneVar;
            }
            list6 = list;
            list7 = list3;
            list8 = list4;
            q4fVar2 = q4fVar;
            g0fVar2 = g0fVar;
            z3 = z;
            obj = serializableA;
            zriVar = zriVar2;
            arrayList2 = arrayList;
            z4 = z2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z6 = jztVar.r;
            z3 = jztVar.q;
            zri zriVar3 = jztVar.p;
            g0f g0fVar3 = jztVar.o;
            ArrayList arrayList3 = jztVar.n;
            q4f q4fVar3 = jztVar.m;
            List list9 = jztVar.l;
            List list10 = jztVar.k;
            List list11 = jztVar.j;
            list6 = jztVar.i;
            z1x.P(obj2);
            obj = obj2;
            arrayList2 = arrayList3;
            q4fVar2 = q4fVar3;
            list8 = list9;
            list7 = list10;
            zriVar = zriVar3;
            z4 = z6;
            g0fVar2 = g0fVar3;
            list5 = list11;
        }
        Map map = (Map) obj;
        oxk0 oxk0Var = ((pru) this.g).a().I1;
        g45 g45Var = (g45) zriVar.b;
        ave aveVar2 = (ave) g45Var.c;
        list6.getClass();
        list5.getClass();
        list7.getClass();
        list8.getClass();
        map.getClass();
        g0fVar2.getClass();
        q4fVar2.getClass();
        arrayList2.getClass();
        ArrayList arrayList4 = new ArrayList();
        for (qu6 qu6Var : list6) {
            Iterator it = list5.iterator();
            do {
                if (!it.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it.next();
            } while (!ozb.X((m97) next4, qu6Var));
            m97 m97Var = (m97) next4;
            ArrayList arrayList5 = arrayList2;
            if (m97Var != null) {
                arrayList4.add(new Pair(qu6Var, m97Var));
            }
            arrayList2 = arrayList5;
        }
        ArrayList arrayList6 = arrayList2;
        ArrayList arrayList7 = new ArrayList(r3d.q(arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            qu6 qu6Var2 = (qu6) pair.f46059a;
            m97 m97Var2 = (m97) pair.b;
            khf0 khf0Var = (khf0) zriVar.c;
            boolean z7 = z3;
            Iterator it3 = it2;
            long j = qu6Var2.f29333a;
            boolean z8 = z4;
            long j2 = qu6Var2.b;
            String strS = khf0Var.s(j);
            ave aveVar3 = aveVar2;
            iv10 iv10VarB = g45Var.B(j2);
            iwm0 iwm0VarL = g45Var.L(j2);
            Iterator it4 = arrayList6.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    str = strS;
                    aveVar = aveVar3;
                    next2 = null;
                    break;
                }
                next2 = it4.next();
                str = strS;
                aveVar = aveVar3;
                if (((l820) next2).f19589a == j2) {
                    break;
                }
                strS = str;
                aveVar3 = aveVar;
            }
            l820 l820Var = (l820) next2;
            String strJ0 = sj3.j0(l820Var != null ? l820Var.c : null, g0fVar2.q.contains(Integer.valueOf((int) j2)) ? g0fVar2.p : "");
            Iterator it5 = ((lye) g45Var.f10647a).d.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    str2 = strJ0;
                    next3 = null;
                    break;
                }
                next3 = it5.next();
                str2 = strJ0;
                Iterator it6 = it5;
                if (((p5t) next3).f26422a == j2) {
                    break;
                }
                strJ0 = str2;
                it5 = it6;
            }
            p5t p5tVar = (p5t) next3;
            ril0 ril0Var = (ril0) map.get(Long.valueOf(qu6Var2.e));
            String str3 = ril0Var != null ? ril0Var.b : null;
            Map map2 = map;
            g45 g45Var2 = g45Var;
            wue wueVarF0 = qcc.f0(qu6Var2, m97Var2, str, str3 == null ? "" : str3, iv10VarB, iwm0VarL, str2, q4fVar2, p5tVar, list7, list8, oxk0Var);
            q4f q4fVar4 = q4fVar2;
            p5t p5tVar2 = wueVarF0.h;
            if (p5tVar2 != null) {
                iv10 iv10Var = p5tVar2.z;
                aveVar.getClass();
                aveVar2 = aveVar;
                aveVar2.k.put(Long.valueOf(j2), iv10Var);
                iwm0 iwm0Var = p5tVar2.A;
                aveVar2.getClass();
                aveVar2.l.put(Long.valueOf(j2), iwm0Var);
            } else {
                aveVar2 = aveVar;
            }
            arrayList7.add(wueVarF0);
            z4 = z8;
            map = map2;
            g45Var = g45Var2;
            q4fVar2 = q4fVar4;
            oxk0Var = oxk0Var;
            it2 = it3;
            zriVar = zriVar;
            z3 = z7;
        }
        boolean z9 = z3;
        boolean z10 = z4;
        q4f q4fVar5 = q4fVar2;
        long j3 = g0fVar2.f;
        boolean z11 = ((lye) ((o4a) this.f).f24624a.f10647a).h;
        if (arrayList7.isEmpty()) {
            z5 = false;
            break;
        }
        Iterator it7 = arrayList7.iterator();
        while (true) {
            if (!it7.hasNext()) {
                z5 = false;
                break;
            }
            if (((wue) it7.next()).i == fho.c) {
                z5 = true;
                break;
            }
        }
        boolean z12 = j3 == 0 && q4fVar5 == q4f.d && z9 && z11 && !z5;
        g0f g0fVar4 = ((lye) ((ni9) this.b).f23572a.f10647a).f20858a;
        boolean z13 = !g0fVar4.n && g0fVar4.l > 0 && g0fVar4.m.length() > 0 && z12;
        boolean z14 = ((lye) ((ert) this.c).f8297a.f10647a).f20858a.n && z12;
        if (z13) {
            arrayList7 = CollectionsKt.q0(kotlin.collections.a.c(new yue(g0fVar2.l, g0fVar2.m)), arrayList7);
        } else if (z14) {
            Iterator it8 = arrayList7.iterator();
            do {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
            } while (((wue) next).f39789a.x != 707);
            wue wueVar = (wue) next;
            if (wueVar != null) {
                List listC = kotlin.collections.a.c(new xue(wueVar.b.m));
                ArrayList arrayList8 = new ArrayList();
                for (Object obj3 : arrayList7) {
                    if (((wue) obj3).b.h != 707) {
                        arrayList8.add(obj3);
                    }
                }
                arrayList7 = CollectionsKt.q0(listC, arrayList8);
            }
        }
        return z10 ? CollectionsKt.r0(arrayList7, new vue(((mpc) this.e).b(list6))) : arrayList7;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:36:0x012c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:1: B:28:0x00f5->B:51:?, LOOP_END, SYNTHETIC] */
    public void s(yx6 yx6Var, ob7 ob7Var) {
        pln plnVar;
        List list;
        gho ghoVar;
        gho ghoVar2;
        List listI;
        Iterator it;
        long j;
        long j2;
        p7m0 p7m0Var;
        Object value;
        Collection collection;
        ArrayList arrayListN0;
        int iD;
        es esVar = ((pq) this.f43384a).f27394a;
        Map map = ((sln) ((pq) this.f).f27394a.f8305a).c;
        Map map2 = ((sln) ((a8u) this.g).f444a.f8305a).d;
        map.getClass();
        long j3 = ob7Var.b;
        long j4 = ob7Var.c;
        long j5 = ob7Var.f24963a;
        long j6 = yx6Var.d;
        double d = ob7Var.e;
        long j7 = ob7Var.f;
        boolean z = yx6Var.g;
        boolean z2 = ob7Var.h;
        String str = ob7Var.g;
        long j8 = yx6Var.f43405a;
        String str2 = yx6Var.b;
        double d2 = ob7Var.j;
        String str3 = ob7Var.k;
        boolean z3 = ob7Var.d;
        long j9 = yx6Var.h;
        String str4 = yx6Var.e;
        String str5 = yx6Var.f;
        List list2 = yx6Var.j;
        List list3 = yx6Var.k;
        String str6 = yx6Var.i;
        boolean z4 = ob7Var.i;
        ueo ueoVar = (ueo) map2.get(Long.valueOf(j4));
        if (ueoVar != null) {
            list = list3;
            if (ueoVar.d == 2) {
                ghoVar2 = gho.c;
            }
            plnVar = new pln(j3, j4, j5, j6, d, j7, z, z2, str, j8, str2, d2, d2, str3, z3, j9, str4, str5, list2, list, str6, "", "", z4, "", false, ghoVar2);
            listI = esVar.i();
            if (listI != null || !listI.isEmpty()) {
                it = listI.iterator();
                while (it.hasNext()) {
                    j = ((pln) it.next()).c;
                    j2 = plnVar.c;
                    if (j2 == j) {
                        ((es) ((lef0) this.e).f19899a).A(j2);
                        break;
                    }
                }
            }
            sln slnVar = (sln) ((pq) this.d).f27394a.f8305a;
            slnVar.getClass();
            p7m0Var = slnVar.b;
            do {
                value = p7m0Var.getValue();
                collection = (List) value;
                if (collection == null) {
                    collection = iun.f15405a;
                }
                arrayListN0 = CollectionsKt.N0(collection);
                arrayListN0.add(plnVar);
            } while (!p7m0Var.m(value, arrayListN0));
            nwd nwdVar = q4f.f28094a;
            q4f q4fVar = q4f.d;
            nwdVar.getClass();
            iD = nwd.d(q4fVar);
            int iC = nwd.c(((vqc) ((a7q) this.b).f384a).e());
            if (esVar.i().size() != iD || esVar.i().size() > iC) {
                ((fht0) this.c).n(q4fVar);
            }
            return;
        }
        list = list3;
        ueo ueoVar2 = (ueo) map2.get(Long.valueOf(ob7Var.c));
        if (ueoVar2 == null || ueoVar2.d != 3) {
            xco xcoVar = (xco) map.get(Long.valueOf(ob7Var.b));
            ghoVar = xcoVar != null ? xcoVar.e : false ? gho.b : gho.f11309a;
        } else {
            ghoVar = gho.d;
        }
        ghoVar2 = ghoVar;
        plnVar = new pln(j3, j4, j5, j6, d, j7, z, z2, str, j8, str2, d2, d2, str3, z3, j9, str4, str5, list2, list, str6, "", "", z4, "", false, ghoVar2);
        listI = esVar.i();
        if (listI != null) {
            it = listI.iterator();
            while (it.hasNext()) {
                j = ((pln) it.next()).c;
                j2 = plnVar.c;
                if (j2 == j) {
                    ((es) ((lef0) this.e).f19899a).A(j2);
                    break;
                }
            }
        } else {
            it = listI.iterator();
            while (it.hasNext()) {
                j = ((pln) it.next()).c;
                j2 = plnVar.c;
                if (j2 == j) {
                    ((es) ((lef0) this.e).f19899a).A(j2);
                    break;
                }
            }
        }
        sln slnVar2 = (sln) ((pq) this.d).f27394a.f8305a;
        slnVar2.getClass();
        p7m0Var = slnVar2.b;
        do {
            value = p7m0Var.getValue();
            collection = (List) value;
            if (collection == null) {
                collection = iun.f15405a;
            }
            arrayListN0 = CollectionsKt.N0(collection);
            arrayListN0.add(plnVar);
        } while (!p7m0Var.m(value, arrayListN0));
        nwd nwdVar2 = q4f.f28094a;
        q4f q4fVar2 = q4f.d;
        nwdVar2.getClass();
        iD = nwd.d(q4fVar2);
        int iC2 = nwd.c(((vqc) ((a7q) this.b).f384a).e());
        if (esVar.i().size() != iD) {
        }
        ((fht0) this.c).n(q4fVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object t(cqg cqgVar, zje zjeVar) {
        jqp jqpVar;
        Object g0g0Var;
        if (zjeVar instanceof jqp) {
            jqpVar = (jqp) zjeVar;
            int i = jqpVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                jqpVar.k = i - Integer.MIN_VALUE;
            } else {
                jqpVar = new jqp(this, zjeVar);
            }
        } else {
            jqpVar = new jqp(this, zjeVar);
        }
        Object objS = jqpVar.i;
        wne wneVar = wne.f39444a;
        int i2 = jqpVar.k;
        try {
            if (i2 == 0) {
                z1x.P(objS);
                if (!(cqgVar instanceof yrp)) {
                    return null;
                }
                e0g0 e0g0Var = j0g0.b;
                bzu bzuVar = (bzu) this.c;
                long j = ((yrp) cqgVar).f43132a;
                int i3 = ((yrp) cqgVar).b;
                jqpVar.k = 1;
                objS = ((cyu) bzuVar.b).s(i3, j, jqpVar);
                if (objS == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objS);
            }
            g0g0Var = (r2s0) objS;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return (r2s0) (g0g0Var instanceof g0g0 ? null : g0g0Var);
    }

    public void u(Path path) {
        path.transform((Matrix) this.f43384a);
        path.transform(((xju0) this.c).f41005a);
        path.transform((Matrix) this.b);
    }

    public void v(Throwable th, Thread thread, String str, qeo qeoVar, boolean z) {
        boolean zEquals = str.equals(CrashHianalyticsData.EVENT_ID_CRASH);
        s9f s9fVar = (s9f) this.f43384a;
        long j = qeoVar.b;
        Context context = s9fVar.f31849a;
        int i = context.getResources().getConfiguration().orientation;
        dq00 dq00Var = s9fVar.d;
        Stack stack = new Stack();
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        n660 n660Var = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            n660Var = new n660(th2.getLocalizedMessage(), th2.getClass().getName(), dq00Var.f(th2.getStackTrace()), n660Var);
        }
        m25 m25Var = new m25();
        m25Var.b = str;
        m25Var.f21039a = j;
        m25Var.g = (byte) (m25Var.g | 1);
        g9f g9fVarN = m2a.f1.n(context);
        int i2 = ((x25) g9fVarN).c;
        Boolean boolValueOf = i2 > 0 ? Boolean.valueOf(i2 != 100) : null;
        ArrayList arrayListM = m2a.m(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) n660Var.c;
        String name = thread.getName();
        if (name == null) {
            hny.u("Null name");
            return;
        }
        List listD = s9f.d(stackTraceElementArr, 4);
        if (listD == null) {
            hny.u("Null frames");
            return;
        }
        arrayList.add(new u25(name, listD, 4));
        if (z) {
            for (Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator(); it.hasNext(); it = it) {
                Map.Entry<Thread, StackTraceElement[]> next = it.next();
                Thread key = next.getKey();
                if (!key.equals(thread)) {
                    StackTraceElement[] stackTraceElementArrF = dq00Var.f(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        hny.u("Null name");
                        return;
                    }
                    List listD2 = s9f.d(stackTraceElementArrF, 0);
                    if (listD2 == null) {
                        hny.u("Null frames");
                        return;
                    }
                    arrayList.add(new u25(name2, listD2, 0));
                }
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        s25 s25VarC = s9f.c(n660Var, 0);
        t25 t25VarE = s9f.e();
        List listA = s9fVar.a();
        if (listA == null) {
            hny.u("Null binaries");
            return;
        }
        m25Var.c = new p25(new q25(listUnmodifiableList, s25VarC, null, null, t25VarE, listA), null, null, boolValueOf, g9fVarN, arrayListM, i);
        m25Var.d = s9fVar.b(i);
        n25 n25VarA = m25Var.a();
        Map map = qeoVar.c;
        yzn0 yzn0Var = (yzn0) this.d;
        ywq0 ywq0Var = (ywq0) this.e;
        n9f n9fVarB = b(a(n25VarA, yzn0Var, ywq0Var, map), ywq0Var);
        if (z) {
            ((x9f) this.b).e(n9fVarB, qeoVar.f28593a, zEquals);
        } else {
            ((aaf) ((cu) this.g).c).a(new olo(this, n9fVarB, qeoVar, zEquals));
        }
    }

    public void w(float[] fArr) {
        Matrix matrix = (Matrix) this.e;
        matrix.reset();
        ((Matrix) this.b).invert(matrix);
        matrix.mapPoints(fArr);
        ((xju0) this.c).f41005a.invert(matrix);
        matrix.mapPoints(fArr);
        ((Matrix) this.f43384a).invert(matrix);
        matrix.mapPoints(fArr);
    }

    public void x(float[] fArr) {
        ((Matrix) this.f43384a).mapPoints(fArr);
        ((xju0) this.c).f41005a.mapPoints(fArr);
        ((Matrix) this.b).mapPoints(fArr);
    }

    public void y() {
        xju0 xju0Var = (xju0) this.c;
        Matrix matrix = (Matrix) this.b;
        matrix.reset();
        RectF rectF = xju0Var.b;
        float f = rectF.left;
        float f2 = xju0Var.d;
        matrix.postTranslate(f, f2 - (f2 - rectF.bottom));
    }

    public void z(float f, float f2, float f3, float f4) {
        Matrix matrix = (Matrix) this.f43384a;
        xju0 xju0Var = (xju0) this.c;
        float fWidth = xju0Var.b.width() / f2;
        float fHeight = xju0Var.b.height() / f3;
        if (Float.isInfinite(fWidth)) {
            fWidth = 0.0f;
        }
        if (Float.isInfinite(fHeight)) {
            fHeight = 0.0f;
        }
        matrix.reset();
        matrix.postTranslate(-f, -f4);
        matrix.postScale(fWidth, -fHeight);
    }

    public ywq0(rrd rrdVar, uzc uzcVar, zfo zfoVar, edo edoVar, pru pruVar, ocl oclVar, j1q0 j1q0Var) {
        zfoVar.getClass();
        edoVar.getClass();
        j1q0Var.getClass();
        this.f43384a = rrdVar;
        this.b = uzcVar;
        this.c = zfoVar;
        this.d = edoVar;
        this.e = pruVar;
        this.f = oclVar;
        this.g = j1q0Var;
    }

    public /* synthetic */ ywq0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.f43384a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.g = obj7;
    }

    public ywq0(String str, xzp xzpVar, cu cuVar) {
        this.d = new o24(this, false);
        this.e = new o24(this, true);
        this.f = new jdg0((byte) 0);
        this.g = new AtomicMarkableReference(null, false);
        this.c = str;
        this.f43384a = new oa40(xzpVar);
        this.b = cuVar;
    }

    public ywq0() {
        this.f43384a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
