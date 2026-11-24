package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bqe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f3025a;
    public static final LinkedHashMap b;
    public static final LinkedHashMap c;
    public static final Map d;

    static {
        tre0 tre0Var = sre0.f32672a;
        int i = 0;
        List<sgy> listJ = q3d.j(tre0Var.b(Boolean.TYPE), tre0Var.b(Byte.TYPE), tre0Var.b(Character.TYPE), tre0Var.b(Double.TYPE), tre0Var.b(Float.TYPE), tre0Var.b(Integer.TYPE), tre0Var.b(Long.TYPE), tre0Var.b(Short.TYPE));
        f3025a = listJ;
        int iA = wp20.a(r3d.q(listJ, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (sgy sgyVar : listJ) {
            linkedHashMap.put(azw.H(sgyVar), azw.I(sgyVar));
        }
        b = linkedHashMap;
        List<sgy> list = f3025a;
        int iA2 = wp20.a(r3d.q(list, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
        for (sgy sgyVar2 : list) {
            linkedHashMap2.put(azw.I(sgyVar2), azw.H(sgyVar2));
        }
        c = linkedHashMap2;
        List listJ2 = q3d.j(Function0.class, Function1.class, Function2.class, xdr.class, ydr.class, zdr.class, aer.class, ber.class, cer.class, der.class, kdr.class, ldr.class, zer.class, mdr.class, ndr.class, odr.class, pdr.class, qdr.class, rdr.class, sdr.class, udr.class, vdr.class, zer.class);
        ArrayList arrayList = new ArrayList(r3d.q(listJ2, 10));
        for (Object obj : listJ2) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        d = xp20.m(arrayList);
    }

    public static final qlc a(Class cls) {
        cls.getClass();
        if (cls.isPrimitive()) {
            e9d0.i(cls, "Can't compute ClassId for primitive type: ");
            return null;
        }
        if (cls.isArray()) {
            e9d0.i(cls, "Can't compute ClassId for array type: ");
            return null;
        }
        if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
            swq swqVar = new swq(cls.getName());
            return new qlc(swqVar.b(), mbc.g0(swqVar.f32934a.g()), true);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return a(declaringClass).d(g950.e(cls.getSimpleName()));
        }
        swq swqVar2 = new swq(cls.getName());
        return new qlc(swqVar2.b(), swqVar2.f32934a.g());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String b(Class cls) {
        cls.getClass();
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String strReplace = cls.getName().replace('.', '/');
                strReplace.getClass();
                return strReplace;
            }
            StringBuilder sb = new StringBuilder(TokenNames.L);
            String strReplace2 = cls.getName().replace('.', '/');
            strReplace2.getClass();
            sb.append(strReplace2);
            sb.append(';');
            return sb.toString();
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return TokenNames.I;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return TokenNames.C;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return TokenNames.V;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return TokenNames.F;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return TokenNames.S;
                }
                break;
        }
        e9d0.i(cls, "Unsupported primitive type: ");
        return null;
    }

    public static final List c(Type type) {
        type.getClass();
        if (!(type instanceof ParameterizedType)) {
            return iun.f15405a;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return pgi0.t(pgi0.k(lgi0.e(b180.i, type), b180.j));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        return tx3.g0(actualTypeArguments);
    }

    public static final ClassLoader d(Class cls) {
        cls.getClass();
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        systemClassLoader.getClass();
        return systemClassLoader;
    }

    public static final Class e(Class cls) {
        cls.getClass();
        return (Class) c.get(cls);
    }
}
