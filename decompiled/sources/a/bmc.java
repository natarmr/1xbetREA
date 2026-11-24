package a;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class bmc implements sgy, elc, kry {
    public static final amc b = new amc(null);
    public static final Map c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f2830a;

    static {
        List listJ = q3d.j(Function0.class, Function1.class, Function2.class, xdr.class, ydr.class, zdr.class, aer.class, ber.class, cer.class, der.class, kdr.class, ldr.class, zer.class, mdr.class, ndr.class, odr.class, pdr.class, qdr.class, rdr.class, sdr.class, udr.class, vdr.class, zer.class);
        ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
        int i = 0;
        for (Object obj : listJ) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        c = xp20.m(arrayList);
    }

    public bmc(Class cls) {
        cls.getClass();
        this.f2830a = cls;
    }

    public static void c() {
        throw new tsy();
    }

    @Override // a.sgy
    public final boolean I() {
        c();
        throw null;
    }

    @Override // a.sgy
    public final String J() {
        String strB;
        b.getClass();
        Class cls = this.f2830a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strB2 = amc.b(cls.getName());
                return strB2 == null ? cls.getSimpleName() : strB2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strB = amc.b(componentType.getName())) != null) {
                strConcat = strB.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return StringsKt.m0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return StringsKt.n0(simpleName, '$');
        }
        return StringsKt.m0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    @Override // a.sgy
    public final List b() {
        c();
        throw null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bmc) && azw.H(this).equals(azw.H((sgy) obj));
    }

    @Override // a.kry
    public final GenericDeclaration findJavaDeclaration() {
        return this.f2830a;
    }

    @Override // a.sgy
    public final Collection g() {
        c();
        throw null;
    }

    @Override // a.pgy
    public final List getAnnotations() {
        c();
        throw null;
    }

    @Override // a.sgy, a.oiy
    public final List getTypeParameters() {
        c();
        throw null;
    }

    @Override // a.sgy
    public final int hashCode() {
        return azw.H(this).hashCode();
    }

    @Override // a.sgy
    public final boolean i() {
        c();
        throw null;
    }

    @Override // a.elc
    public final Class j() {
        return this.f2830a;
    }

    @Override // a.sgy
    public final boolean l() {
        c();
        throw null;
    }

    @Override // a.sgy
    public final boolean r(Object obj) {
        b.getClass();
        Class clsH = this.f2830a;
        clsH.getClass();
        Map map = c;
        map.getClass();
        Integer num = (Integer) map.get(clsH);
        if (num != null) {
            return zys0.f(num.intValue(), obj);
        }
        if (clsH.isPrimitive()) {
            clsH = azw.H(sre0.f32672a.b(clsH));
        }
        return clsH.isInstance(obj);
    }

    @Override // a.sgy
    public final Collection s() {
        c();
        throw null;
    }

    public final String toString() {
        return this.f2830a.toString() + " (Kotlin reflection is not available)";
    }

    @Override // a.sgy
    public final String v() {
        String strA;
        b.getClass();
        Class cls = this.f2830a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strA2 = amc.a(cls.getName());
            return strA2 == null ? cls.getCanonicalName() : strA2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strA = amc.a(componentType.getName())) != null) {
            strConcat = strA.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }
}
