package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class nqv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ppv0 f23975a;
    public final Context b;
    public final String c;
    public final fpv0 d;
    public final wsd e;
    public final ezb0 f;
    public final WorkDatabase g;
    public final upv0 h;
    public final g7k i;
    public final ArrayList j;
    public final String k;
    public final dby l;
    public final ArrayList m;
    public final ArrayList n;

    public nqv0(qgd qgdVar) {
        ppv0 ppv0Var = (ppv0) qgdVar.f;
        this.f23975a = ppv0Var;
        this.b = (Context) qgdVar.h;
        String str = ppv0Var.f27390a;
        this.c = str;
        this.d = (fpv0) qgdVar.c;
        this.e = (wsd) qgdVar.b;
        this.f = (ezb0) qgdVar.d;
        WorkDatabase workDatabase = (WorkDatabase) qgdVar.e;
        this.g = workDatabase;
        this.h = workDatabase.y();
        this.i = workDatabase.s();
        ArrayList arrayList = (ArrayList) qgdVar.g;
        this.j = arrayList;
        String str2 = ppv0Var.c;
        this.k = axq.n(b1j.n("Work [ id=", str, ", class=", str2, ", tags={ "), CollectionsKt.b0(arrayList, Separators.COMMA, null, null, null, 62), " } ]");
        this.l = zvw.g();
        this.m = new ArrayList();
        this.n = new ArrayList();
    }

    public final void a(kg00 kg00Var) {
        wv00.f().g(oqv0.f25709a, "Worker result FAILURE for ".concat(this.k));
        if (this.f23975a.c()) {
            c();
        } else {
            f(kg00Var);
        }
    }

    public final void b(int i) {
        zov0 zov0Var = zov0.f44733a;
        upv0 upv0Var = this.h;
        String str = this.c;
        upv0Var.j(zov0Var, str);
        upv0Var.i(System.currentTimeMillis(), str);
        upv0Var.h(this.f23975a.v, str);
        upv0Var.g(-1L, str);
        upv0Var.k(i, str);
    }

    public final void c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        upv0 upv0Var = this.h;
        String str = this.c;
        upv0Var.i(jCurrentTimeMillis, str);
        upv0Var.j(zov0.f44733a, str);
        aeg0 aeg0Var = upv0Var.f36087a;
        ((Number) kpb.h0(aeg0Var, false, true, new ka6(str, (byte) 27))).intValue();
        upv0Var.h(this.f23975a.v, str);
        kpb.h0(aeg0Var, false, true, new ka6(str, (byte) 28));
        upv0Var.g(-1L, str);
    }

    public final boolean d(int i) {
        ppv0 ppv0Var = this.f23975a;
        if (Intrinsics.d(ppv0Var.y, Boolean.TRUE)) {
            String str = oqv0.f25709a;
            wv00.f().a(str, "Worker " + ppv0Var.c + " was interrupted. Backing off.");
            b(i);
            return true;
        }
        upv0 upv0Var = this.h;
        String str2 = this.c;
        zov0 zov0VarD = upv0Var.d(str2);
        if (zov0VarD == null || zov0VarD.a()) {
            String str3 = oqv0.f25709a;
            wv00.f().a(str3, "Status for " + str2 + " is " + zov0VarD + " ; not doing any work");
            return false;
        }
        String str4 = oqv0.f25709a;
        wv00.f().a(str4, "Status for " + str2 + " is " + zov0VarD + "; not doing any work and rescheduling for later execution");
        upv0Var.j(zov0.f44733a, str2);
        upv0Var.k(i, str2);
        upv0Var.g(-1L, str2);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final Object e(zje zjeVar) throws Throwable {
        mqv0 mqv0Var;
        OverwritingInputMerger overwritingInputMerger;
        OverwritingInputMerger overwritingInputMerger2;
        maj majVarA;
        ppv0 ppv0Var = this.f23975a;
        String str = ppv0Var.c;
        String str2 = ppv0Var.d;
        if (zjeVar instanceof mqv0) {
            mqv0Var = (mqv0) zjeVar;
            int i = mqv0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqv0Var.k = i - Integer.MIN_VALUE;
            } else {
                mqv0Var = new mqv0(this, zjeVar);
            }
        } else {
            mqv0Var = new mqv0(this, zjeVar);
        }
        mqv0 mqv0Var2 = mqv0Var;
        Object objD0 = mqv0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = mqv0Var2.k;
        String str3 = this.k;
        try {
            if (i2 == 0) {
                z1x.P(objD0);
                boolean zW = afn0.w();
                String str4 = ppv0Var.x;
                if (zW && str4 != null) {
                    int iHashCode = ppv0Var.hashCode();
                    if (Build.VERSION.SDK_INT >= 29) {
                        sf3.b(iHashCode, str4.length() <= 127 ? str4 : str4.substring(0, 127));
                    } else {
                        String strSubstring = str4.length() <= 127 ? str4 : str4.substring(0, 127);
                        try {
                            Method method = afn0.c;
                            if (method == null) {
                                method = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                                afn0.c = method;
                            }
                            Method method2 = method;
                            if (method2 == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            method2.invoke(null, Long.valueOf(afn0.f787a), strSubstring, Integer.valueOf(iHashCode));
                        } catch (Exception e) {
                            if (e instanceof InvocationTargetException) {
                                Throwable cause = ((InvocationTargetException) e).getCause();
                                if (cause instanceof RuntimeException) {
                                    throw cause;
                                }
                                ohq.p(cause);
                                return null;
                            }
                            Log.v("Trace", "Unable to call asyncTraceBegin via reflection", e);
                        }
                    }
                }
                final byte b = 0;
                Callable callable = new Callable(this) { // from class: a.fqv0
                    public final /* synthetic */ nqv0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        byte b2 = b;
                        nqv0 nqv0Var = this.b;
                        switch (b2) {
                            case 0:
                                ppv0 ppv0Var2 = nqv0Var.f23975a;
                                String str5 = ppv0Var2.c;
                                zov0 zov0Var = ppv0Var2.b;
                                zov0 zov0Var2 = zov0.f44733a;
                                if (zov0Var != zov0Var2) {
                                    String str6 = oqv0.f25709a;
                                    wv00.f().a(str6, str5 + " is not in ENQUEUED state. Nothing more to do");
                                    return Boolean.TRUE;
                                }
                                if ((!ppv0Var2.c() && (ppv0Var2.b != zov0Var2 || ppv0Var2.k <= 0)) || System.currentTimeMillis() >= ppv0Var2.a()) {
                                    return Boolean.FALSE;
                                }
                                wv00.f().a(oqv0.f25709a, "Delaying execution for " + str5 + " because it is being executed before schedule.");
                                return Boolean.TRUE;
                            default:
                                upv0 upv0Var = nqv0Var.h;
                                String str7 = nqv0Var.c;
                                boolean z = false;
                                if (upv0Var.d(str7) == zov0.f44733a) {
                                    upv0Var.j(zov0.b, str7);
                                    ((Number) kpb.h0(upv0Var.f36087a, false, true, new tpv0(str7, (byte) 1))).intValue();
                                    upv0Var.k(-256, str7);
                                    z = true;
                                }
                                return Boolean.valueOf(z);
                        }
                    }
                };
                WorkDatabase workDatabase = this.g;
                if (((Boolean) workDatabase.o(callable)).booleanValue()) {
                    return new jqv0(true);
                }
                boolean zC = ppv0Var.c();
                String str5 = this.c;
                if (zC) {
                    majVarA = ppv0Var.e;
                } else {
                    str2.getClass();
                    String str6 = wex.f39040a;
                    try {
                        overwritingInputMerger = null;
                        try {
                            Object objNewInstance = Class.forName(str2).getDeclaredConstructor(null).newInstance(null);
                            objNewInstance.getClass();
                            overwritingInputMerger2 = (OverwritingInputMerger) objNewInstance;
                        } catch (Exception e2) {
                            e = e2;
                            wv00.f().e(wex.f39040a, "Trouble instantiating ".concat(str2), e);
                            overwritingInputMerger2 = overwritingInputMerger;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        overwritingInputMerger = null;
                    }
                    if (overwritingInputMerger2 == null) {
                        String str7 = oqv0.f25709a;
                        wv00.f().d(str7, "Could not create Input Merger " + str2);
                        return new jqv0(false);
                    }
                    List listC = kotlin.collections.a.c(ppv0Var.e);
                    upv0 upv0Var = this.h;
                    upv0Var.getClass();
                    str5.getClass();
                    ArrayList arrayListQ0 = CollectionsKt.q0(listC, (List) kpb.h0(upv0Var.f36087a, true, false, new ka6(str5, (byte) 29)));
                    laj lajVar = new laj((byte) 0);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = arrayListQ0.iterator();
                    while (it.hasNext()) {
                        Map mapUnmodifiableMap = Collections.unmodifiableMap(((maj) it.next()).f21460a);
                        mapUnmodifiableMap.getClass();
                        linkedHashMap.putAll(mapUnmodifiableMap);
                    }
                    lajVar.c(linkedHashMap);
                    majVarA = lajVar.a();
                }
                UUID uuidFromString = UUID.fromString(str5);
                wsd wsdVar = this.e;
                Executor executor = wsdVar.f39685a;
                rwj rwjVar = wsdVar.b;
                jtv jtvVar = jtv.f;
                ezb0 ezb0Var = this.f;
                fpv0 fpv0Var = this.d;
                wov0 wov0Var = new wov0(workDatabase, ezb0Var, fpv0Var);
                WorkerParameters workerParameters = new WorkerParameters();
                workerParameters.f45416a = uuidFromString;
                workerParameters.b = majVarA;
                new HashSet(this.j);
                workerParameters.c = executor;
                workerParameters.d = rwjVar;
                workerParameters.e = fpv0Var;
                workerParameters.f = jtvVar;
                try {
                    og00 og00VarH0 = jtvVar.H0(this.b, str, workerParameters);
                    final byte b2 = 1;
                    og00VarH0.d = true;
                    CoroutineContext.Element element = mqv0Var2.getContext().get(gqw0.o1);
                    element.getClass();
                    bby bbyVar = (bby) element;
                    bbyVar.invokeOnCompletion(new t13((Object) og00VarH0, zW, (Object) str4, (Object) this, (byte) 25));
                    Object objO = workDatabase.o(new Callable(this) { // from class: a.fqv0
                        public final /* synthetic */ nqv0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            byte b3 = b2;
                            nqv0 nqv0Var = this.b;
                            switch (b3) {
                                case 0:
                                    ppv0 ppv0Var2 = nqv0Var.f23975a;
                                    String str8 = ppv0Var2.c;
                                    zov0 zov0Var = ppv0Var2.b;
                                    zov0 zov0Var2 = zov0.f44733a;
                                    if (zov0Var != zov0Var2) {
                                        String str9 = oqv0.f25709a;
                                        wv00.f().a(str9, str8 + " is not in ENQUEUED state. Nothing more to do");
                                        return Boolean.TRUE;
                                    }
                                    if ((!ppv0Var2.c() && (ppv0Var2.b != zov0Var2 || ppv0Var2.k <= 0)) || System.currentTimeMillis() >= ppv0Var2.a()) {
                                        return Boolean.FALSE;
                                    }
                                    wv00.f().a(oqv0.f25709a, "Delaying execution for " + str8 + " because it is being executed before schedule.");
                                    return Boolean.TRUE;
                                default:
                                    upv0 upv0Var2 = nqv0Var.h;
                                    String str10 = nqv0Var.c;
                                    boolean z = false;
                                    if (upv0Var2.d(str10) == zov0.f44733a) {
                                        upv0Var2.j(zov0.b, str10);
                                        ((Number) kpb.h0(upv0Var2.f36087a, false, true, new tpv0(str10, (byte) 1))).intValue();
                                        upv0Var2.k(-256, str10);
                                        z = true;
                                    }
                                    return Boolean.valueOf(z);
                            }
                        }
                    });
                    objO.getClass();
                    if (!((Boolean) objO).booleanValue()) {
                        return new jqv0(true);
                    }
                    if (bbyVar.isCancelled()) {
                        return new jqv0(true);
                    }
                    vox voxVar = fpv0Var.e;
                    voxVar.getClass();
                    lne lneVarY = obb.Y(voxVar);
                    kpb0 kpb0Var = new kpb0(this, og00VarH0, wov0Var, null, (byte) 27);
                    mqv0Var2.k = 1;
                    objD0 = qjj.d0(lneVarY, kpb0Var, mqv0Var2);
                    if (objD0 == wneVar) {
                        return wneVar;
                    }
                } catch (Throwable unused) {
                    String str8 = oqv0.f25709a;
                    wv00.f().d(str8, "Could not create Worker " + str);
                    return new jqv0(false);
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objD0);
            }
            ng00 ng00Var = (ng00) objD0;
            ng00Var.getClass();
            return new hqv0(ng00Var);
        } catch (CancellationException e4) {
            String str9 = oqv0.f25709a;
            wv00 wv00VarF = wv00.f();
            String strConcat = str3.concat(" was cancelled");
            if (wv00VarF.f39816a <= 4) {
                Log.i(str9, strConcat, e4);
            }
            throw e4;
        } catch (Throwable th) {
            wv00.f().e(oqv0.f25709a, str3.concat(" failed because it threw an exception/error"), th);
            return new gqv0();
        }
    }

    public final void f(ng00 ng00Var) {
        String str = this.c;
        ArrayList arrayListL = q3d.l(str);
        arrayListL.addAll(vic.x(this.i, str));
        Iterator it = arrayListL.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            upv0 upv0Var = this.h;
            if (!zHasNext) {
                maj majVar = ((kg00) ng00Var).f18218a;
                majVar.getClass();
                upv0Var.h(this.f23975a.v, str);
                kpb.h0(upv0Var.f36087a, false, true, new zfv0(majVar, str, (byte) 9));
                return;
            }
            String str2 = (String) it.next();
            if (upv0Var.d(str2) != zov0.f) {
                upv0Var.j(zov0.d, str2);
                if (!str2.equals(str)) {
                    this.n.add(str2);
                }
            }
        }
    }
}
