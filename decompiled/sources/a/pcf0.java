package a;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pcf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f26757a;
    public static final ConcurrentHashMap b;
    public static final ConcurrentHashMap c;
    public static final ConcurrentHashMap d;

    static {
        Logger.getLogger(pcf0.class.getName());
        f26757a = new AtomicReference(new oky());
        b = new ConcurrentHashMap();
        c = new ConcurrentHashMap();
        new ConcurrentHashMap();
        d = new ConcurrentHashMap();
    }

    public static synchronized void a(String str, Map map, boolean z) {
        if (z) {
            try {
                ConcurrentHashMap concurrentHashMap = c;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            if (((oky) f26757a.get()).f25428a.containsKey(str)) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!d.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry entry2 : map.entrySet()) {
                    if (d.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String) entry2.getKey()));
                    }
                }
            }
        }
    }

    public static Object b(l7x l7xVar, Class cls) {
        dwb0 dwb0Var = (dwb0) bz40.b.f3448a.get();
        dwb0Var.getClass();
        cwb0 cwb0Var = new cwb0(l7xVar.getClass(), cls);
        HashMap map = dwb0Var.f6790a;
        if (map.containsKey(cwb0Var)) {
            return ((xvb0) map.get(cwb0Var)).b.a(l7xVar);
        }
        e9d0.h(cwb0Var, " available", "No PrimitiveConstructor for ");
        return null;
    }

    public static Object c(String str, og9 og9Var, Class cls) {
        oky okyVar = (oky) f26757a.get();
        okyVar.getClass();
        nky nkyVarA = okyVar.a(str);
        Set setKeySet = ((Map) nkyVarA.f23703a.c).keySet();
        v0 v0Var = nkyVarA.f23703a;
        if (!setKeySet.contains(cls)) {
            StringBuilder sb = new StringBuilder("Primitive type ");
            sb.append(cls.getName());
            sb.append(" not supported by key manager of type ");
            sb.append(v0Var.getClass());
            sb.append(", supported primitives: ");
            Set<Class> setKeySet2 = ((Map) v0Var.c).keySet();
            StringBuilder sb2 = new StringBuilder();
            boolean z = true;
            for (Class cls2 : setKeySet2) {
                if (!z) {
                    sb2.append(", ");
                }
                sb2.append(cls2.getCanonicalName());
                z = false;
            }
            sb.append(sb2.toString());
            throw new GeneralSecurityException(sb.toString());
        }
        try {
            if (!((Map) v0Var.c).keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + v0Var.toString() + " does not support primitive class " + cls.getName());
            }
            try {
                x3 x3VarV = v0Var.v(og9Var);
                if (Void.class.equals(cls)) {
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                }
                v0Var.y(x3VarV);
                m50 m50Var = (m50) ((Map) v0Var.c).get(cls);
                if (m50Var != null) {
                    return m50Var.a(x3VarV);
                }
                e9d0.w(cls.getCanonicalName(), " not supported.", "Requested primitive class ");
                return null;
            } catch (ynx e) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) v0Var.b).getName()), e);
            }
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    public static Object d(String str, byte[] bArr) {
        kg9 kg9Var = og9.b;
        return c(str, og9.f(bArr, 0, bArr.length), a50.class);
    }

    public static synchronized fky e(bly blyVar) {
        hru hruVar;
        v0 v0Var = ((oky) f26757a.get()).a(blyVar.z()).f23703a;
        hruVar = new hru(v0Var, (Class) v0Var.d);
        if (!((Boolean) c.get(blyVar.z())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + blyVar.z());
        }
        return hruVar.l(blyVar.A());
    }

    public static synchronized void f(v0 v0Var, boolean z) {
        try {
            AtomicReference atomicReference = f26757a;
            oky okyVar = new oky((oky) atomicReference.get());
            okyVar.b(v0Var);
            String strQ = v0Var.q();
            a(strQ, z ? v0Var.s().D0() : Collections.EMPTY_MAP, z);
            if (!((oky) atomicReference.get()).f25428a.containsKey(strQ)) {
                b.put(strQ, new gle0());
                if (z) {
                    g(strQ, v0Var.s().D0());
                }
            }
            c.put(strQ, Boolean.valueOf(z));
            atomicReference.set(okyVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void g(String str, Map map) {
        af80 af80Var;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            byte[] bArrE = ((x3) ((ily) entry.getValue()).f14999a).e();
            int i = ((ily) entry.getValue()).b;
            aly alyVarB = bly.B();
            alyVarB.e();
            ((bly) alyVarB.b).D(str);
            kg9 kg9VarF = og9.f(bArrE, 0, bArrE.length);
            alyVarB.e();
            ((bly) alyVarB.b).E(kg9VarF);
            int iE = hne.E(i);
            if (iE == 0) {
                af80Var = af80.TINK;
            } else if (iE == 1) {
                af80Var = af80.LEGACY;
            } else if (iE == 2) {
                af80Var = af80.RAW;
            } else {
                if (iE != 3) {
                    jf4.o("Unknown output prefix type");
                    return;
                }
                af80Var = af80.CRUNCHY;
            }
            alyVarB.e();
            ((bly) alyVarB.b).C(af80Var);
            d.put(str2, new cly((bly) alyVarB.b()));
        }
    }

    public static synchronized void h(jwb0 jwb0Var) {
        bz40 bz40Var = bz40.b;
        synchronized (bz40Var) {
            nw20 nw20Var = new nw20((dwb0) bz40Var.f3448a.get());
            HashMap map = (HashMap) nw20Var.b;
            if (jwb0Var != null) {
                Class clsB = jwb0Var.b();
                if (map.containsKey(clsB)) {
                    jwb0 jwb0Var2 = (jwb0) map.get(clsB);
                    if (!jwb0Var2.equals(jwb0Var) || !jwb0Var.equals(jwb0Var2)) {
                        ohq.v(clsB, "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type");
                    }
                } else {
                    map.put(clsB, jwb0Var);
                }
            } else {
                hny.u("wrapper must be non-null");
            }
            bz40Var.f3448a.set(new dwb0(nw20Var));
        }
    }
}
