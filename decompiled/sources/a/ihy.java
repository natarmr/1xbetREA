package a;

import android.gov.nist.core.Separators;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ihy implements elc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f14802a = new Regex("<v#(\\d+)>");

    public static Method R(Class cls, String str, Class[] clsArr, Class cls2, boolean z) {
        Class clsQ;
        Method methodR;
        if (z) {
            clsArr[0] = cls;
        }
        Method methodS = S(cls, str, clsArr, cls2);
        if (methodS != null) {
            return methodS;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodR = R(superclass, str, clsArr, cls2, z)) != null) {
            return methodR;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        interfaces.getClass();
        for (Class<?> cls3 : interfaces) {
            cls3.getClass();
            Method methodR2 = R(cls3, str, clsArr, cls2, z);
            if (methodR2 != null) {
                return methodR2;
            }
            if (z && (clsQ = ufx.Q(bqe0.d(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method methodS2 = S(clsQ, str, clsArr, cls2);
                if (methodS2 != null) {
                    return methodS2;
                }
            }
        }
        return null;
    }

    public static Method S(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (Intrinsics.d(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (Intrinsics.d(method.getName(), str) && Intrinsics.d(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static void q(ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2) {
        boolean zD = Intrinsics.d(CollectionsKt.f0(arrayList2), DefaultConstructorMarker.class);
        List listSubList = arrayList2;
        if (zD) {
            listSubList = arrayList2.subList(0, arrayList2.size() - 1);
        }
        int size = z2 ? listSubList.size() - 1 : listSubList.size();
        arrayList.addAll(listSubList);
        int i = (size + 31) / 32;
        for (int i2 = 0; i2 < i; i2++) {
            Class cls = Integer.TYPE;
            cls.getClass();
            arrayList.add(cls);
        }
        arrayList.add(z ? DefaultConstructorMarker.class : Object.class);
    }

    public final Field A(String str) throws NoSuchFieldException {
        str.getClass();
        Class cls = ((xgy) this).b;
        Field declaredField = cls.getDeclaredField(str);
        if (declaredField != null) {
            return declaredField;
        }
        StringBuilder sb = new StringBuilder("Field ");
        sb.append(str);
        sb.append(" not found in ");
        sb.append(cls);
        sb.append(':');
        Field[] declaredFields = cls.getDeclaredFields();
        declaredFields.getClass();
        sb.append(declaredFields.length == 0 ? " no fields found" : Separators.RETURN.concat(tx3.N(declaredFields, Separators.RETURN, null, null, j9x.q, 30)));
        throw new poe(sb.toString());
    }

    public final Method B(String str, String str2) {
        Method methodR;
        str.getClass();
        str2.getClass();
        if (str.equals("<init>")) {
            return null;
        }
        zri zriVarM = xtt0.m(bqe0.d(j()), str2, true);
        Class[] clsArr = (Class[]) ((ArrayList) zriVarM.b).toArray(new Class[0]);
        Class cls = (Class) zriVarM.c;
        cls.getClass();
        Method methodR2 = R(P(), str, clsArr, cls, false);
        if (methodR2 != null) {
            return methodR2;
        }
        if (!P().isInterface() || (methodR = R(Object.class, str, clsArr, cls, false)) == null) {
            return null;
        }
        return methodR;
    }

    public final dqy C(String str, String str2) {
        str.getClass();
        str2.getClass();
        List list = (List) ((yhy) ((zhy) this).c.getValue()).c.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w3d.u(arrayList, ((cqy) it.next()).b);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            dqy dqyVar = (dqy) obj;
            if (Intrinsics.d(dqyVar.b, str) && Intrinsics.d(jwb.C(dqyVar, this), str2)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            StringBuilder sbN = b1j.n("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
            sbN.append(this);
            throw new poe(sbN.toString());
        }
        if (arrayList2.size() <= 1) {
            return (dqy) CollectionsKt.v0(arrayList2);
        }
        StringBuilder sbN2 = b1j.n("Property '", str, "' (JVM signature: ", str2, ") resolved in several methods in ");
        sbN2.append(this);
        throw new poe(sbN2.toString());
    }

    public Collection D() {
        throw new poe("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }

    public Collection E() {
        throw new poe("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }

    public Collection F(g950 g950Var) {
        throw new poe("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }

    public d0d0 N(int i) {
        return null;
    }

    public dqy O(int i) {
        return null;
    }

    public Class P() {
        Class clsE = bqe0.e(j());
        return clsE == null ? j() : clsE;
    }

    public Collection Q(g950 g950Var) {
        throw new poe("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }

    public final ksy u(int i, String str) {
        str.getClass();
        dqy dqyVarO = O(i);
        if (dqyVarO == null) {
            return null;
        }
        if (dqyVarO.f == null) {
            return j24.r.m(j24.f15764a[37], dqyVarO) ? new ury(this, str, null, dqyVarO, rgy.k) : new ksy(this, str, null, dqyVarO, rgy.k);
        }
        throw new poe(axq.n(new StringBuilder("Local property "), dqyVarO.b, " is an extension, which is not yet supported"));
    }

    public final Method z(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        if (str.equals("<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(j());
        }
        zri zriVarM = xtt0.m(bqe0.d(j()), str2, true);
        q(arrayList, (ArrayList) zriVarM.b, false, z2);
        Class clsP = P();
        String strConcat = str.concat("$default");
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class cls = (Class) zriVarM.c;
        cls.getClass();
        return R(clsP, strConcat, clsArr, cls, z);
    }
}
