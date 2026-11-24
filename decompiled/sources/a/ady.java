package a;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ady {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nek f702a = new nek();

    public static final int a(ugi0 ugi0Var, vby vbyVar, String str) {
        ugi0Var.getClass();
        vbyVar.getClass();
        str.getClass();
        d(vbyVar, ugi0Var);
        int iC = ugi0Var.c(str);
        if (iC != -3 || !vbyVar.f37162a.g) {
            return iC;
        }
        vqc vqcVar = vbyVar.c;
        wqv wqvVar = new wqv(ugi0Var, vbyVar, (byte) 19);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) vqcVar.b;
        Map map = (Map) concurrentHashMap.get(ugi0Var);
        nek nekVar = f702a;
        Object obj = map != null ? map.get(nekVar) : null;
        Object objInvoke = obj != null ? obj : null;
        if (objInvoke == null) {
            objInvoke = wqvVar.invoke();
            Object concurrentHashMap2 = concurrentHashMap.get(ugi0Var);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(ugi0Var, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(nekVar, objInvoke);
        }
        Integer num = (Integer) ((Map) objInvoke).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int b(ugi0 ugi0Var, vby vbyVar, String str, String str2) {
        ugi0Var.getClass();
        vbyVar.getClass();
        str.getClass();
        int iA = a(ugi0Var, vbyVar, str);
        if (iA != -3) {
            return iA;
        }
        throw new fhi0(ugi0Var.h() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean c(vby vbyVar, ugi0 ugi0Var) {
        ugi0Var.getClass();
        vbyVar.getClass();
        if (vbyVar.f37162a.f5868a) {
            return true;
        }
        List annotations = ugi0Var.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof vcy) {
                return true;
            }
        }
        return false;
    }

    public static final void d(vby vbyVar, ugi0 ugi0Var) {
        ugi0Var.getClass();
        vbyVar.getClass();
        Intrinsics.d(ugi0Var.l(), aum0.b);
    }
}
