package a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class qaj implements phi0, gz5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f28396a;
    public Object b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;

    public qaj(nfq nfqVar) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.b = new Object();
        this.d = new TaskCompletionSource();
        this.f28396a = false;
        this.e = new TaskCompletionSource();
        nfqVar.a();
        Context context = nfqVar.f23449a;
        this.c = nfqVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f28396a = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e);
            }
            if (boolValueOf2 == null) {
                this.f28396a = false;
                boolValueOf = null;
            } else {
                this.f28396a = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.f = boolValueOf;
        synchronized (this.b) {
            try {
                if (e()) {
                    ((TaskCompletionSource) this.d).trySetResult(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.phi0
    public void B(sgy sgyVar, Function1 function1) {
        i(sgyVar, function1, false);
    }

    @Override // a.phi0
    public void G(sgy sgyVar, Function1 function1) {
        sgyVar.getClass();
        k(sgyVar, new wje(function1), false);
    }

    @Override // a.phi0
    public void K(sgy sgyVar, Function1 function1) {
        g(sgyVar, function1, false);
    }

    @Override // a.phi0
    public void Z(sgy sgyVar, jiy jiyVar) {
        sgyVar.getClass();
        k(sgyVar, new vje(jiyVar), false);
    }

    @Override // a.gz5
    public void a(ConnectionResult connectionResult) {
        ((sav) this.f).m.post(new lfr(this, connectionResult, false, (byte) 21));
    }

    public qaj b() {
        return new qaj((HashMap) this.c, (HashMap) this.b, (HashMap) this.d, (HashMap) this.e, (HashMap) this.f, this.f28396a);
    }

    public void c(phi0 phi0Var) {
        for (Map.Entry entry : ((Map) this.c).entrySet()) {
            sgy sgyVar = (sgy) entry.getKey();
            xje xjeVar = (xje) entry.getValue();
            if (xjeVar instanceof vje) {
                sgyVar.getClass();
                phi0Var.Z(sgyVar, ((vje) xjeVar).f37523a);
            } else {
                if (!(xjeVar instanceof wje)) {
                    t9f.b();
                    return;
                }
                phi0Var.G(sgyVar, ((wje) xjeVar).f39259a);
            }
        }
        for (Map.Entry entry2 : ((Map) this.b).entrySet()) {
            sgy sgyVar2 = (sgy) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                sgy sgyVar3 = (sgy) entry3.getKey();
                jiy jiyVar = (jiy) entry3.getValue();
                sgyVar2.getClass();
                sgyVar3.getClass();
                jiyVar.getClass();
                phi0Var.h(sgyVar2, sgyVar3, jiyVar);
            }
        }
        for (Map.Entry entry4 : ((Map) this.d).entrySet()) {
            sgy sgyVar4 = (sgy) entry4.getKey();
            Function1 function1 = (Function1) entry4.getValue();
            sgyVar4.getClass();
            function1.getClass();
            zys0.e(1, function1);
            phi0Var.B(sgyVar4, function1);
        }
        for (Map.Entry entry5 : ((Map) this.f).entrySet()) {
            sgy sgyVar5 = (sgy) entry5.getKey();
            Function1 function2 = (Function1) entry5.getValue();
            sgyVar5.getClass();
            function2.getClass();
            zys0.e(1, function2);
            phi0Var.K(sgyVar5, function2);
        }
    }

    public jiy d(sgy sgyVar, List list) {
        sgyVar.getClass();
        list.getClass();
        xje xjeVar = (xje) ((Map) this.c).get(sgyVar);
        jiy jiyVarA = xjeVar != null ? xjeVar.a(list) : null;
        if (jiyVarA instanceof jiy) {
            return jiyVarA;
        }
        return null;
    }

    public synchronized boolean e() {
        boolean zJ;
        Boolean bool = (Boolean) this.f;
        if (bool != null) {
            zJ = bool.booleanValue();
        } else {
            try {
                zJ = ((nfq) this.c).j();
            } catch (IllegalStateException unused) {
                zJ = false;
            }
        }
        f(zJ);
        return zJ;
    }

    public void f(boolean z) {
        String str;
        String str2 = z ? "ENABLED" : "DISABLED";
        if (((Boolean) this.f) == null) {
            str = "global Firebase setting";
        } else {
            str = this.f28396a ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        String strK = b1j.k("Crashlytics automatic data collection ", str2, " by ", str, Separators.DOT);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strK, null);
        }
    }

    public void g(sgy sgyVar, Function1 function1, boolean z) {
        HashMap map = (HashMap) this.f;
        Function1 function2 = (Function1) map.get(sgyVar);
        if (function2 == null || function2.equals(function1) || z) {
            map.put(sgyVar, function1);
        } else {
            itt0.l("Default deserializers provider for ", sgyVar, " is already registered: ", function2);
        }
    }

    @Override // a.phi0
    public void h(sgy sgyVar, sgy sgyVar2, jiy jiyVar) {
        j(sgyVar, sgyVar2, jiyVar, false);
    }

    public void i(sgy sgyVar, Function1 function1, boolean z) {
        HashMap map = (HashMap) this.d;
        Function1 function2 = (Function1) map.get(sgyVar);
        if (function2 == null || function2.equals(function1) || z) {
            map.put(sgyVar, function1);
        } else {
            itt0.l("Default serializers provider for ", sgyVar, " is already registered: ", function2);
        }
    }

    public void j(sgy sgyVar, sgy sgyVar2, jiy jiyVar, boolean z) {
        Object next;
        sgy sgyVar3;
        sgyVar.getClass();
        sgyVar2.getClass();
        jiyVar.getClass();
        String strH = jiyVar.getDescriptor().h();
        HashMap map = (HashMap) this.b;
        Object map2 = map.get(sgyVar);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(sgyVar, map2);
        }
        Map map3 = (Map) map2;
        HashMap map4 = (HashMap) this.e;
        Object map5 = map4.get(sgyVar);
        if (map5 == null) {
            map5 = new HashMap();
            map4.put(sgyVar, map5);
        }
        Map map6 = (Map) map5;
        jiy jiyVar2 = (jiy) map3.get(sgyVar2);
        if (jiyVar2 != null && !jiyVar2.equals(jiyVar)) {
            if (!z) {
                throw new w4x("Serializer for " + sgyVar2 + " already registered in the scope of " + sgyVar);
            }
        }
        jiy jiyVar3 = (jiy) map6.get(strH);
        if (jiyVar3 != null && !jiyVar3.equals(jiyVar)) {
            Iterator it = ((Iterable) CollectionsKt.I(map3.entrySet()).b).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((Map.Entry) next).getValue() != jiyVar3);
            Map.Entry entry = (Map.Entry) next;
            if (entry == null || (sgyVar3 = (sgy) entry.getKey()) == null) {
                c99.m(strH, " is registered in the module but no Kotlin class is associated with it.", "Name ");
                return;
            }
            if (!z) {
                throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + sgyVar + "' have the same serial name '" + strH + "': " + jiyVar + " for '" + sgyVar2 + "' and " + jiyVar3 + " for '" + sgyVar3 + '\'');
            }
        }
        map3.put(sgyVar2, jiyVar);
        map6.put(strH, jiyVar);
    }

    public void k(sgy sgyVar, xje xjeVar, boolean z) {
        xje xjeVar2;
        HashMap map = (HashMap) this.c;
        sgyVar.getClass();
        if (!z && (xjeVar2 = (xje) map.get(sgyVar)) != null && !xjeVar2.equals(xjeVar)) {
            throw new w4x("Contextual serializer or serializer provider for " + sgyVar + " already registered in this module");
        }
        map.put(sgyVar, xjeVar);
        if (azw.G(sgyVar).isInterface()) {
            this.f28396a = true;
        }
    }

    public void l(ConnectionResult connectionResult) {
        h9w0 h9w0Var = (h9w0) ((sav) this.f).j.get((ua3) this.b);
        if (h9w0Var != null) {
            h9w0Var.l(connectionResult);
        }
    }

    public qaj(Map map, Map map2, Map map3, Map map4, Map map5, boolean z) {
        this.c = map;
        this.b = map2;
        this.d = map3;
        this.e = map4;
        this.f = map5;
        this.f28396a = z;
    }

    public qaj(int i, float f, xk80 xk80Var) {
        this.c = xk80Var;
        this.d = androidx.compose.runtime.e.b(i);
        this.e = androidx.compose.runtime.e.a(f);
        this.f = new lbz(i, 30, 100);
    }

    public qaj() {
        this.c = new HashMap();
        this.b = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
    }

    public qaj(sav savVar, b9v b9vVar, ua3 ua3Var) {
        Objects.requireNonNull(savVar);
        this.f = savVar;
        this.d = null;
        this.e = null;
        this.f28396a = false;
        this.c = b9vVar;
        this.b = ua3Var;
    }
}
