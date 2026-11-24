package a;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class bay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f2281a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final qlc e;
    public static final swq f;
    public static final qlc g;
    public static final HashMap h;
    public static final HashMap i;
    public static final HashMap j;
    public static final HashMap k;
    public static final HashMap l;
    public static final HashMap m;
    public static final LinkedHashSet n;
    public static final List o;

    static {
        StringBuilder sb = new StringBuilder();
        ser serVar = ser.d;
        sb.append(serVar.f39032a);
        sb.append('.');
        sb.append(serVar.b);
        f2281a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        ter terVar = ter.d;
        sb2.append(terVar.f39032a);
        sb2.append('.');
        sb2.append(terVar.b);
        b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        ver verVar = ver.d;
        sb3.append(verVar.f39032a);
        sb3.append('.');
        sb3.append(verVar.b);
        c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        uer uerVar = uer.d;
        sb4.append(uerVar.f39032a);
        sb4.append('.');
        sb4.append(uerVar.b);
        d = sb4.toString();
        qlc qlcVarS = plc.S(new swq("kotlin.jvm.functions.FunctionN"));
        e = qlcVarS;
        f = qlcVarS.a();
        g = e4m0.v;
        e(Class.class);
        h = new HashMap();
        i = new HashMap();
        j = new HashMap();
        k = new HashMap();
        l = new HashMap();
        m = new HashMap();
        n = new LinkedHashSet();
        qlc qlcVarS2 = plc.S(i4m0.B);
        swq swqVar = i4m0.J;
        swq swqVar2 = qlcVarS2.f28927a;
        aay aayVar = new aay(e(Iterable.class), qlcVarS2, new qlc(swqVar2, obc.S(swqVar, swqVar2), false));
        qlc qlcVarS3 = plc.S(i4m0.A);
        swq swqVar3 = i4m0.I;
        swq swqVar4 = qlcVarS3.f28927a;
        aay aayVar2 = new aay(e(Iterator.class), qlcVarS3, new qlc(swqVar4, obc.S(swqVar3, swqVar4), false));
        qlc qlcVarS4 = plc.S(i4m0.C);
        swq swqVar5 = i4m0.K;
        swq swqVar6 = qlcVarS4.f28927a;
        aay aayVar3 = new aay(e(Collection.class), qlcVarS4, new qlc(swqVar6, obc.S(swqVar5, swqVar6), false));
        qlc qlcVarS5 = plc.S(i4m0.D);
        swq swqVar7 = i4m0.L;
        swq swqVar8 = qlcVarS5.f28927a;
        aay aayVar4 = new aay(e(List.class), qlcVarS5, new qlc(swqVar8, obc.S(swqVar7, swqVar8), false));
        qlc qlcVarS6 = plc.S(i4m0.F);
        swq swqVar9 = i4m0.N;
        swq swqVar10 = qlcVarS6.f28927a;
        aay aayVar5 = new aay(e(Set.class), qlcVarS6, new qlc(swqVar10, obc.S(swqVar9, swqVar10), false));
        qlc qlcVarS7 = plc.S(i4m0.E);
        swq swqVar11 = i4m0.M;
        swq swqVar12 = qlcVarS7.f28927a;
        aay aayVar6 = new aay(e(ListIterator.class), qlcVarS7, new qlc(swqVar12, obc.S(swqVar11, swqVar12), false));
        swq swqVar13 = i4m0.G;
        qlc qlcVarS8 = plc.S(swqVar13);
        swq swqVar14 = i4m0.O;
        swq swqVar15 = qlcVarS8.f28927a;
        aay aayVar7 = new aay(e(Map.class), qlcVarS8, new qlc(swqVar15, obc.S(swqVar14, swqVar15), false));
        qlc qlcVarD = plc.S(swqVar13).d(i4m0.H.f32934a.g());
        swq swqVar16 = i4m0.P;
        swq swqVar17 = qlcVarD.f28927a;
        List<aay> listJ = q3d.j(aayVar, aayVar2, aayVar3, aayVar4, aayVar5, aayVar6, aayVar7, new aay(e(Map.Entry.class), qlcVarD, new qlc(swqVar17, obc.S(swqVar16, swqVar17), false)));
        o = listJ;
        d(Object.class, i4m0.f14153a);
        d(String.class, i4m0.f);
        d(CharSequence.class, i4m0.e);
        c(Throwable.class, i4m0.k);
        d(Cloneable.class, i4m0.c);
        d(Number.class, i4m0.i);
        c(Comparable.class, i4m0.l);
        d(Enum.class, i4m0.j);
        c(Annotation.class, i4m0.s);
        for (aay aayVar8 : listJ) {
            qlc qlcVar = aayVar8.f553a;
            qlc qlcVar2 = aayVar8.b;
            qlc qlcVar3 = aayVar8.c;
            a(qlcVar, qlcVar2);
            b(qlcVar3.a(), qlcVar);
            l.put(qlcVar3, qlcVar2);
            m.put(qlcVar2, qlcVar3);
            swq swqVarA = qlcVar2.a();
            swq swqVarA2 = qlcVar3.a();
            j.put(qlcVar3.a().f32934a, swqVarA);
            k.put(swqVarA.f32934a, swqVarA2);
        }
        for (mfy mfyVar : mfy.values()) {
            swq swqVar18 = mfyVar.d;
            qlc qlcVar4 = new qlc(swqVar18.b(), swqVar18.f32934a.g());
            iwb0 iwb0VarD = mfyVar.d();
            iwb0VarD.getClass();
            swq swqVarA3 = j4m0.l.a(iwb0VarD.f15481a);
            a(qlcVar4, new qlc(swqVarA3.b(), swqVarA3.f32934a.g()));
        }
        for (qlc qlcVar5 : scd.f31980a) {
            swq swqVar19 = new swq("kotlin.jvm.internal." + qlcVar5.f().b() + "CompanionObject");
            a(new qlc(swqVar19.b(), swqVar19.f32934a.g()), qlcVar5.d(lxk0.b));
        }
        for (int i2 = 0; i2 < 23; i2++) {
            swq swqVar20 = new swq(twn.m(i2, "kotlin.jvm.functions.Function"));
            a(new qlc(swqVar20.b(), swqVar20.f32934a.g()), new qlc(j4m0.l, g950.e("Function" + i2)));
            b(new swq(b1j.h(i2, b, new StringBuilder())), g);
        }
        for (int i3 = 0; i3 < 22; i3++) {
            b(new swq(b1j.h(i3, d, new StringBuilder())), g);
        }
        b(new swq("kotlin.concurrent.atomics.AtomicInt"), e(AtomicInteger.class));
        b(new swq("kotlin.concurrent.atomics.AtomicLong"), e(AtomicLong.class));
        b(new swq("kotlin.concurrent.atomics.AtomicBoolean"), e(AtomicBoolean.class));
        b(new swq("kotlin.concurrent.atomics.AtomicReference"), e(AtomicReference.class));
        b(new swq("kotlin.concurrent.atomics.AtomicIntArray"), e(AtomicIntegerArray.class));
        b(new swq("kotlin.concurrent.atomics.AtomicLongArray"), e(AtomicLongArray.class));
        b(new swq("kotlin.concurrent.atomics.AtomicArray"), e(AtomicReferenceArray.class));
        b(i4m0.b.i(), e(Void.class));
    }

    public static void a(qlc qlcVar, qlc qlcVar2) {
        h.put(qlcVar.a().f32934a, qlcVar2);
        b(qlcVar2.a(), qlcVar);
    }

    public static void b(swq swqVar, qlc qlcVar) {
        n.add(swqVar);
        i.put(swqVar.f32934a, qlcVar);
    }

    public static void c(Class cls, swq swqVar) {
        qlc qlcVarE = e(cls);
        swqVar.getClass();
        a(qlcVarE, new qlc(swqVar.b(), swqVar.f32934a.g()));
    }

    public static void d(Class cls, twq twqVar) {
        c(cls, twqVar.i());
    }

    public static qlc e(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return e(declaringClass).d(g950.e(cls.getSimpleName()));
        }
        String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        swq swqVar = new swq(canonicalName);
        return new qlc(swqVar.b(), swqVar.f32934a.g());
    }

    public static boolean f(twq twqVar, String str, boolean z) {
        String str2 = twqVar.f34663a;
        if (kotlin.text.c.x(str2, str, false)) {
            String strSubstring = str2.substring(str.length());
            if (!StringsKt.k0(strSubstring, '0')) {
                Integer intOrNull = StringsKt.toIntOrNull(strSubstring);
                int i2 = z ? 22 : 23;
                if (intOrNull != null && intOrNull.intValue() >= i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static qlc g(swq swqVar) {
        swqVar.getClass();
        return (qlc) h.get(swqVar.f32934a);
    }

    public static qlc h(twq twqVar) {
        twqVar.getClass();
        if (f(twqVar, f2281a, false) || f(twqVar, c, true)) {
            return e;
        }
        return (f(twqVar, b, false) || f(twqVar, d, true)) ? g : (qlc) i.get(twqVar);
    }
}
