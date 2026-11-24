package a;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class aw00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile byte f1549a = 0;
    public static final cgx0 b = new cgx0((byte) 14);
    public static final htz c = new htz();
    public static final String[] d;
    public static final String e;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            property.equalsIgnoreCase("true");
        }
        d = new String[]{"1.6", "1.7"};
        e = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    public static LinkedHashSet a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = aw00.class.getClassLoader();
            String str = e;
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(str) : classLoader.getResources(str);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
            return linkedHashSet;
        } catch (IOException e2) {
            lvm0.n("Error getting resources from path", e2);
            return linkedHashSet;
        }
    }

    public static zv00 b(String str) {
        vuw vuwVar;
        if (f1549a == 0) {
            synchronized (aw00.class) {
                try {
                    if (f1549a == 0) {
                        f1549a = (byte) 1;
                        d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        byte b2 = f1549a;
        if (b2 == 1) {
            vuwVar = b;
        } else {
            if (b2 == 2) {
                jf4.n("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
                return null;
            }
            if (b2 == 3) {
                vuwVar = v8m0.b.f36993a;
            } else {
                if (b2 != 4) {
                    jf4.n("Unreachable code");
                    return null;
                }
                vuwVar = c;
            }
        }
        return vuwVar.p(str);
    }

    public static boolean c() {
        String property;
        try {
            property = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return false;
        }
        return property.toLowerCase().contains("android");
    }

    public static final void d() {
        LinkedHashSet linkedHashSetA;
        try {
            try {
                try {
                    if (c()) {
                        linkedHashSetA = null;
                    } else {
                        linkedHashSetA = a();
                        g(linkedHashSetA);
                    }
                    v8m0 v8m0Var = v8m0.b;
                    f1549a = (byte) 3;
                    f(linkedHashSetA);
                } catch (NoClassDefFoundError e2) {
                    String message = e2.getMessage();
                    if (message == null || (!message.contains("org/slf4j/impl/StaticLoggerBinder") && !message.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                        f1549a = (byte) 2;
                        lvm0.n("Failed to instantiate SLF4J LoggerFactory", e2);
                        throw e2;
                    }
                    f1549a = (byte) 4;
                    lvm0.m("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                    lvm0.m("Defaulting to no-operation (NOP) logger implementation");
                    lvm0.m("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                }
                e();
                if (f1549a == 3) {
                    String[] strArr = d;
                    try {
                        String str = v8m0.c;
                        boolean z = false;
                        for (String str2 : strArr) {
                            if (str.startsWith(str2)) {
                                z = true;
                            }
                        }
                        if (z) {
                            return;
                        }
                        lvm0.m("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(strArr).toString());
                        lvm0.m("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
                    } catch (NoSuchFieldError unused) {
                    } catch (Throwable th) {
                        lvm0.n("Unexpected problem occured during version sanity check", th);
                    }
                }
            } catch (Exception e3) {
                f1549a = (byte) 2;
                lvm0.n("Failed to instantiate SLF4J LoggerFactory", e3);
                throw new IllegalStateException("Unexpected initialization failure", e3);
            } catch (NoSuchMethodError e4) {
                String message2 = e4.getMessage();
                if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                    f1549a = (byte) 2;
                    lvm0.m("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                    lvm0.m("Your binding is version 1.5.5 or earlier.");
                    lvm0.m("Upgrade your binding to version 1.6.x.");
                }
                throw e4;
            }
        } catch (Throwable th2) {
            e();
            throw th2;
        }
    }

    public static void e() {
        cgx0 cgx0Var = b;
        synchronized (cgx0Var) {
            try {
                cgx0Var.b = true;
                for (xen0 xen0Var : new ArrayList(((HashMap) cgx0Var.c).values())) {
                    xen0Var.b = b(xen0Var.f40751a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) b.d;
        int size = linkedBlockingQueue.size();
        ArrayList<yen0> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (yen0 yen0Var : arrayList) {
                if (yen0Var != null) {
                    xen0 xen0Var2 = yen0Var.f42495a;
                    String str = xen0Var2.f40751a;
                    if (xen0Var2.b == null) {
                        jf4.n("Delegate logger cannot be null at this state.");
                        return;
                    } else if (!(xen0Var2.b instanceof u850)) {
                        if (!xen0Var2.p()) {
                            lvm0.m(str);
                        } else if (xen0Var2.p()) {
                            try {
                                xen0Var2.d.invoke(xen0Var2.b, yen0Var);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (yen0Var.f42495a.p()) {
                        lvm0.m("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        lvm0.m("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        lvm0.m("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!(yen0Var.f42495a.b instanceof u850)) {
                        lvm0.m("The following set of substitute loggers may have been accessed");
                        lvm0.m("during the initialization phase. Logging calls during this");
                        lvm0.m("phase were not honored. However, subsequent logging calls to these");
                        lvm0.m("loggers will work as normally expected.");
                        lvm0.m("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        cgx0 cgx0Var2 = b;
        ((HashMap) cgx0Var2.c).clear();
        ((LinkedBlockingQueue) cgx0Var2.d).clear();
    }

    public static void f(LinkedHashSet linkedHashSet) {
        if (linkedHashSet == null || linkedHashSet.size() <= 1) {
            return;
        }
        StringBuilder sb = new StringBuilder("Actual binding is of type [");
        v8m0.b.getClass();
        sb.append(v8m0.d);
        sb.append("]");
        lvm0.m(sb.toString());
    }

    public static void g(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() > 1) {
            lvm0.m("Class path contains multiple SLF4J bindings.");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                lvm0.m("Found binding in [" + ((URL) it.next()) + "]");
            }
            lvm0.m("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
