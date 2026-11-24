package a;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i4m0 {
    public static final swq A;
    public static final swq B;
    public static final swq C;
    public static final swq D;
    public static final swq E;
    public static final swq F;
    public static final swq G;
    public static final swq H;
    public static final swq I;
    public static final swq J;
    public static final swq K;
    public static final swq L;
    public static final swq M;
    public static final swq N;
    public static final swq O;
    public static final swq P;
    public static final twq Q;
    public static final qlc R;
    public static final qlc S;
    public static final qlc T;
    public static final qlc U;
    public static final qlc V;
    public static final swq W;
    public static final swq X;
    public static final swq Y;
    public static final swq Z;
    public static final swq a0;
    public static final swq b0;
    public static final swq c0;
    public static final twq d;
    public static final HashSet d0;
    public static final twq e;
    public static final HashSet e0;
    public static final twq f;
    public static final HashMap f0;
    public static final twq g;
    public static final HashMap g0;
    public static final twq h;
    public static final twq i;
    public static final twq j;
    public static final swq k;
    public static final swq l;
    public static final swq m;
    public static final swq n;
    public static final swq o;
    public static final swq p;
    public static final swq q;
    public static final swq r;
    public static final swq s;
    public static final swq t;
    public static final swq u;
    public static final swq v;
    public static final swq w;
    public static final swq x;
    public static final swq y;
    public static final swq z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final twq f14153a = d("Any").f32934a;
    public static final twq b = d("Nothing").f32934a;
    public static final twq c = d("Cloneable").f32934a;

    static {
        d("Suppress");
        d = d("Unit").f32934a;
        e = d("CharSequence").f32934a;
        f = d("String").f32934a;
        g = d("Array").f32934a;
        h = d("Boolean").f32934a;
        d("Char");
        d("Byte");
        d("Short");
        d("Int");
        d("Long");
        d("Float");
        d("Double");
        i = d("Number").f32934a;
        j = d("Enum").f32934a;
        d("Function");
        k = d("Throwable");
        l = d("Comparable");
        e("IntRange");
        e("LongRange");
        e("CharRange");
        e("IntProgression");
        e("LongProgression");
        e("CharProgression");
        m = d("Deprecated");
        d("DeprecatedSinceKotlin");
        n = d("DeprecationLevel");
        o = d("ReplaceWith");
        p = d("ExtensionFunctionType");
        q = d("ContextFunctionTypeParams");
        swq swqVarD = d("ParameterName");
        r = swqVarD;
        plc.S(swqVarD);
        s = d("Annotation");
        swq swqVarA = a("Target");
        t = swqVarA;
        plc.S(swqVarA);
        u = a("AnnotationTarget");
        v = a("AnnotationRetention");
        swq swqVarA2 = a("Retention");
        w = swqVarA2;
        plc.S(swqVarA2);
        plc.S(a("Repeatable"));
        x = a("MustBeDocumented");
        y = d("UnsafeVariance");
        d("PublishedApi");
        j4m0.p.a(g950.e("AccessibleLateinitPropertyLiteral"));
        swq swqVar = new swq("kotlin.internal.PlatformDependent");
        z = swqVar;
        plc.S(swqVar);
        d("IntroducedAt");
        A = b("Iterator");
        B = b("Iterable");
        C = b("Collection");
        D = b("List");
        E = b("ListIterator");
        F = b("Set");
        swq swqVarB = b("Map");
        G = swqVarB;
        H = swqVarB.a(g950.e("Entry"));
        I = b("MutableIterator");
        J = b("MutableIterable");
        K = b("MutableCollection");
        L = b("MutableList");
        M = b("MutableListIterator");
        N = b("MutableSet");
        swq swqVarB2 = b("MutableMap");
        O = swqVarB2;
        P = swqVarB2.a(g950.e("MutableEntry"));
        Q = f("KClass");
        f("KType");
        f("KCallable");
        f("KProperty0");
        f("KProperty1");
        f("KProperty2");
        f("KMutableProperty0");
        f("KMutableProperty1");
        f("KMutableProperty2");
        twq twqVarF = f("KProperty");
        f("KMutableProperty");
        R = plc.S(twqVarF.i());
        f("KDeclarationContainer");
        f("findAssociatedObject");
        swq swqVarD2 = d("UByte");
        swq swqVarD3 = d("UShort");
        swq swqVarD4 = d("UInt");
        swq swqVarD5 = d("ULong");
        S = plc.S(swqVarD2);
        T = plc.S(swqVarD3);
        U = plc.S(swqVarD4);
        V = plc.S(swqVarD5);
        W = d("UByteArray");
        X = d("UShortArray");
        Y = d("UIntArray");
        Z = d("ULongArray");
        c("AtomicInt");
        c("AtomicLong");
        c("AtomicBoolean");
        c("AtomicReference");
        a0 = c("AtomicIntArray");
        b0 = c("AtomicLongArray");
        c0 = c("AtomicArray");
        int length = iwb0.values().length;
        HashSet hashSet = new HashSet(length < 3 ? 3 : (length / 3) + length + 1);
        for (iwb0 iwb0Var : iwb0.values()) {
            hashSet.add(iwb0Var.f15481a);
        }
        d0 = hashSet;
        int length2 = iwb0.values().length;
        HashSet hashSet2 = new HashSet(length2 < 3 ? 3 : (length2 / 3) + length2 + 1);
        for (iwb0 iwb0Var2 : iwb0.values()) {
            hashSet2.add(iwb0Var2.b);
        }
        e0 = hashSet2;
        int length3 = iwb0.values().length;
        HashMap map = new HashMap(length3 < 3 ? 3 : (length3 / 3) + length3 + 1);
        for (iwb0 iwb0Var3 : iwb0.values()) {
            String strB = iwb0Var3.f15481a.b();
            strB.getClass();
            map.put(d(strB).f32934a, iwb0Var3);
        }
        f0 = map;
        int length4 = iwb0.values().length;
        HashMap map2 = new HashMap(length4 >= 3 ? (length4 / 3) + length4 + 1 : 3);
        for (iwb0 iwb0Var4 : iwb0.values()) {
            String strB2 = iwb0Var4.b.b();
            strB2.getClass();
            map2.put(d(strB2).f32934a, iwb0Var4);
        }
        g0 = map2;
    }

    public static swq a(String str) {
        return j4m0.m.a(g950.e(str));
    }

    public static swq b(String str) {
        return j4m0.n.a(g950.e(str));
    }

    public static swq c(String str) {
        return j4m0.q.a(g950.e(str));
    }

    public static swq d(String str) {
        return j4m0.l.a(g950.e(str));
    }

    public static void e(String str) {
        j4m0.o.a(g950.e(str));
    }

    public static final twq f(String str) {
        return j4m0.i.a(g950.e(str)).f32934a;
    }
}
