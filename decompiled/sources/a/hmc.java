package a;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class hmc {
    public static final hmc c = new hmc();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f13297a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap map, gmc gmcVar, kkz kkzVar, Class cls) {
        kkz kkzVar2 = (kkz) map.get(gmcVar);
        if (kkzVar2 == null || kkzVar == kkzVar2) {
            if (kkzVar2 == null) {
                map.put(gmcVar, kkzVar);
            }
        } else {
            String name = gmcVar.b.getName();
            String name2 = cls.getName();
            jf4.o(rw2.o(b1j.n("Method ", name, " in ", name2, " already declared with different @OnLifecycleEvent value: previous value "), String.valueOf(kkzVar2), ", new value ", String.valueOf(kkzVar)));
        }
    }

    public final fmc a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f13297a;
        if (superclass != null) {
            fmc fmcVarA = (fmc) map2.get(superclass);
            if (fmcVarA == null) {
                fmcVarA = a(superclass, null);
            }
            map.putAll(fmcVarA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            fmc fmcVarA2 = (fmc) map2.get(cls2);
            if (fmcVarA2 == null) {
                fmcVarA2 = a(cls2, null);
            }
            for (Map.Entry entry : fmcVarA2.b.entrySet()) {
                b(map, (gmc) entry.getKey(), (kkz) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                e9d0.t("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
                return null;
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            kh60 kh60Var = (kh60) method.getAnnotation(kh60.class);
            if (kh60Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!clz.class.isAssignableFrom(parameterTypes[0])) {
                        jf4.o("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                kkz kkzVarValue = kh60Var.value();
                if (parameterTypes.length > 1) {
                    if (!kkz.class.isAssignableFrom(parameterTypes[1])) {
                        jf4.o("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (kkzVarValue != kkz.ON_ANY) {
                        jf4.o("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    jf4.o("cannot have more than 2 params");
                    return null;
                }
                b(map, new gmc(method, i), kkzVarValue, cls);
                z = true;
            }
        }
        fmc fmcVar = new fmc(map);
        map2.put(cls, fmcVar);
        this.b.put(cls, Boolean.valueOf(z));
        return fmcVar;
    }
}
