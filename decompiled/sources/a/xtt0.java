package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xtt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final swq f41480a = new swq("kotlin.jvm.JvmStatic");
    public static final String b;

    static {
        StringBuilder sb = new StringBuilder();
        ver verVar = ver.d;
        sb.append(verVar.f39032a.f32934a.f34663a);
        sb.append('.');
        sb.append(verVar.b);
        b = sb.toString();
    }

    public static final dre0 a(qgy qgyVar) {
        if (qgyVar instanceof laz) {
            return a(((laz) qgyVar).c());
        }
        if (qgyVar instanceof dre0) {
            return (dre0) qgyVar;
        }
        if (qgyVar instanceof op9) {
            qgy qgyVarCompute = ((op9) qgyVar).compute();
            if (qgyVarCompute == qgyVar) {
                qgyVarCompute = null;
            }
            if (qgyVarCompute != null) {
                return a(qgyVarCompute);
            }
        }
        return null;
    }

    public static final gre0 b(Object obj) {
        if (obj instanceof gre0) {
            return (gre0) obj;
        }
        if (obj instanceof qer) {
            qgy qgyVarCompute = ((qer) obj).compute();
            if (qgyVarCompute instanceof gre0) {
                return (gre0) qgyVarCompute;
            }
        }
        return null;
    }

    public static final ire0 c(Object obj) {
        if (obj instanceof laz) {
            return c(((laz) obj).c());
        }
        if (obj instanceof ire0) {
            return (ire0) obj;
        }
        if (obj instanceof m0d0) {
            qgy qgyVarCompute = ((m0d0) obj).compute();
            if (qgyVarCompute == obj) {
                qgyVarCompute = null;
            }
            if (qgyVarCompute != null) {
                return c(qgyVarCompute);
            }
        }
        return null;
    }

    public static final List d(e83 e83Var) {
        Annotation annotationP;
        e83Var.getClass();
        g93<t83> annotations = e83Var.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (t83 t83Var : annotations) {
            gmk0 gmk0VarB = t83Var.b();
            if (gmk0VarB instanceof zpe0) {
                annotationP = ((zpe0) gmk0VarB).f44756a;
            } else if (gmk0VarB instanceof rog0) {
                qqe0 qqe0Var = ((rog0) gmk0VarB).f30835a;
                cqe0 cqe0Var = qqe0Var instanceof cqe0 ? (cqe0) qqe0Var : null;
                annotationP = cqe0Var != null ? cqe0Var.f4791a : null;
            } else {
                annotationP = p(t83Var);
            }
            if (annotationP != null) {
                arrayList.add(annotationP);
            }
        }
        return t(arrayList);
    }

    public static final Class e(Class cls) {
        cls.getClass();
        return Array.newInstance((Class<?>) cls, 0).getClass();
    }

    public static final Object f(Type type) {
        type.getClass();
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                if (cls.equals(Boolean.TYPE)) {
                    return Boolean.FALSE;
                }
                if (cls.equals(Character.TYPE)) {
                    return (char) 0;
                }
                if (cls.equals(Byte.TYPE)) {
                    return (byte) 0;
                }
                if (cls.equals(Short.TYPE)) {
                    return (short) 0;
                }
                if (cls.equals(Integer.TYPE)) {
                    return 0;
                }
                if (cls.equals(Float.TYPE)) {
                    return Float.valueOf(0.0f);
                }
                if (cls.equals(Long.TYPE)) {
                    return 0L;
                }
                if (cls.equals(Double.TYPE)) {
                    return Double.valueOf(0.0d);
                }
                if (cls.equals(Void.TYPE)) {
                    jf4.n("Parameter with void type is illegal");
                    return null;
                }
                v4i0.j(type, "Unknown primitive: ");
            }
        }
        return null;
    }

    public static final kp9 g(Class cls, hfk hfkVar, gjt gjtVar, h950 h950Var, roi0 roi0Var, e28 e28Var, Function2 function2) {
        List list;
        gjtVar.getClass();
        h950Var.getClass();
        e28Var.getClass();
        pog0 pog0VarA = xm40.a(cls);
        if (gjtVar instanceof i3d0) {
            list = ((i3d0) gjtVar).i;
        } else {
            if (!(gjtVar instanceof p3d0)) {
                udk.e(gjtVar, "Unsupported message: ");
                return null;
            }
            list = ((p3d0) gjtVar).i;
        }
        List list2 = list;
        f6i f6iVar = pog0VarA.f27328a;
        ym40 ym40Var = (ym40) f6iVar.f;
        xbu0 xbu0Var = xbu0.b;
        list2.getClass();
        return (kp9) function2.invoke(new xq30(new g45(f6iVar, h950Var, ym40Var, roi0Var, xbu0Var, e28Var, hfkVar, (qgd) null, list2)), gjtVar);
    }

    public static final c8z h(ock ockVar) {
        wm40 wm40VarW;
        ockVar.getClass();
        mp9 mp9VarZ = ockVar.z();
        rgy rgyVar = ockVar.f8277a;
        if (!rgyVar.c() || !two.f(ockVar)) {
            if (rgyVar.c() && !two.f(ockVar)) {
                ihy ihyVarK = ockVar.K();
                xgy xgyVar = ihyVarK instanceof xgy ? (xgy) ihyVarK : null;
                if (xgyVar != null && (wm40VarW = xgyVar.W()) != null) {
                    return wm40VarW.f0();
                }
            } else {
                if (mp9VarZ instanceof x4e) {
                    return ((oer) ((x4e) mp9VarZ)).k;
                }
                if (mp9VarZ.C() != null) {
                    vjj vjjVarJ = mp9VarZ.j();
                    vjjVarJ.getClass();
                    return ((wm40) vjjVarJ).f0();
                }
            }
        }
        return null;
    }

    public static final boolean i(kiy kiyVar) {
        kiyVar.getClass();
        fhy fhyVarO = kiyVar.o();
        xgy xgyVar = fhyVarO instanceof xgy ? (xgy) fhyVarO : null;
        if (xgyVar != null && xgyVar.I()) {
            qpy qpyVarX = xgyVar.X();
            if ((qpyVarX != null ? qpyVarX.m : null) != null) {
                return true;
            }
        }
        return false;
    }

    public static final boolean j(sgy sgyVar) {
        Method declaredMethod;
        Class<?> componentType;
        Annotation annotation;
        Object objInvoke;
        Class clsG = azw.G(sgyVar);
        try {
            declaredMethod = clsG.getDeclaredMethod("value", (Class[]) Arrays.copyOf(new Class[0], 0));
        } catch (NoSuchMethodException unused) {
            declaredMethod = null;
        }
        if (declaredMethod != null && (componentType = declaredMethod.getReturnType().getComponentType()) != null && componentType.isAnnotation()) {
            Annotation[] annotations = componentType.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    annotation = null;
                    break;
                }
                annotation = annotations[i];
                if (azw.G(azw.F(annotation)).getName().equals(bey.g.f32934a.f34663a)) {
                    break;
                }
                i++;
            }
            if (annotation != null && (objInvoke = azw.G(azw.F(annotation)).getMethod("value", null).invoke(annotation, null)) != null) {
                return clsG.equals(objInvoke);
            }
        }
        return false;
    }

    public static final boolean k(kiy kiyVar) {
        kiyVar.getClass();
        if (kiyVar.h()) {
            return true;
        }
        v2 v2Var = (v2) kiyVar;
        v2 v2VarC = v2Var.C();
        if (v2VarC != null && k(v2VarC)) {
            return true;
        }
        if (v2Var.n()) {
            return false;
        }
        fhy fhyVarO = kiyVar.o();
        if (!(fhyVarO instanceof miy)) {
            return false;
        }
        List upperBounds = ((miy) fhyVarO).getUpperBounds();
        if (upperBounds.isEmpty()) {
            return false;
        }
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            if (k((kiy) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class l(ClassLoader classLoader, qlc qlcVar, int i) {
        classLoader.getClass();
        qlcVar.getClass();
        twq twqVar = qlcVar.a().f32934a;
        String str = twqVar.f34663a;
        Integer intOrNull = StringsKt.toIntOrNull(StringsKt.m0(str, b, str));
        if (intOrNull != null) {
            int iIntValue = intOrNull.intValue();
            ser serVar = ser.d;
            return l(classLoader, new qlc(serVar.f39032a, serVar.a(iIntValue + 1)), i);
        }
        String str2 = bay.f2281a;
        qlc qlcVarH = bay.h(twqVar);
        if (qlcVarH == null) {
            qlcVarH = qlcVar;
        }
        if (!qlcVarH.equals(qlcVar)) {
            classLoader = bqe0.d(Unit.class);
        }
        String str3 = qlcVarH.f28927a.f32934a.f34663a;
        String str4 = qlcVarH.b.f32934a.f34663a;
        if (Intrinsics.d(str3, "kotlin")) {
            switch (str4.hashCode()) {
                case -901856463:
                    if (str4.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str4.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str4.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str4.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str4.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str4.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str4.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str4.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str4.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("[");
            }
            sb.append(TokenNames.L);
        }
        if (str3.length() > 0) {
            sb.append(str3.concat(Separators.DOT));
        }
        sb.append(kotlin.text.c.s(str4, '.', '$'));
        if (i > 0) {
            sb.append(Separators.SEMICOLON);
        }
        return ufx.Q(classLoader, sb.toString());
    }

    public static final zri m(ClassLoader classLoader, String str, boolean z) {
        Class clsN;
        classLoader.getClass();
        str.getClass();
        jtj jtjVarO = o(str);
        ArrayList<String> arrayList = (ArrayList) jtjVarO.b;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (String str2 : arrayList) {
            arrayList2.add(n(classLoader, str2, 0, str2.length()));
        }
        if (z) {
            String str3 = (String) jtjVarO.c;
            clsN = n(classLoader, str3, 0, str3.length());
        } else {
            clsN = null;
        }
        return new zri(arrayList2, clsN, (byte) 16);
    }

    public static final Class n(ClassLoader classLoader, String str, int i, int i2) throws ClassNotFoundException {
        char cCharAt = str.charAt(i);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            String strReplace = str.substring(i + 1, i2 - 1).replace('/', '.');
            strReplace.getClass();
            Class<?> clsLoadClass = classLoader.loadClass(strReplace);
            clsLoadClass.getClass();
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class cls = Void.TYPE;
            cls.getClass();
            return cls;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            return e(n(classLoader, str, i + 1, i2));
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new poe("Unknown type prefix in the method signature: ".concat(str));
        }
    }

    public static final jtj o(String str) {
        int iU;
        ArrayList arrayListU = ohs0.u(str);
        int i = 1;
        while (str.charAt(i) != ')') {
            int i2 = i;
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char cCharAt = str.charAt(i2);
            if (StringsKt.P("VZCBSIFJD", cCharAt)) {
                iU = i2 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new poe("Unknown type prefix in the method signature: ".concat(str));
                }
                iU = StringsKt.U(';', i, 4, str) + 1;
            }
            arrayListU.add(str.substring(i, iU));
            i = iU;
        }
        return new jtj((Object) arrayListU, (Object) str.substring(i + 1), (byte) 13);
    }

    public static final Annotation p(t83 t83Var) {
        wm40 wm40VarD = rek.d(t83Var);
        Class clsQ = wm40VarD != null ? q(wm40VarD) : null;
        if (clsQ == null) {
            clsQ = null;
        }
        if (clsQ == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = t83Var.c().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            g950 g950Var = (g950) entry.getKey();
            Object objR = r((r2e) entry.getValue(), bqe0.d(clsQ));
            Pair pair = objR != null ? new Pair(g950Var.b(), objR) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return (Annotation) jiq0.m0(clsQ, xp20.m(arrayList));
    }

    public static final Class q(wm40 wm40Var) {
        gmk0 gmk0VarB = wm40Var.b();
        gmk0VarB.getClass();
        if (gmk0VarB instanceof ory) {
            return ((ory) gmk0VarB).f25757a.f16999a;
        }
        if (gmk0VarB instanceof rog0) {
            qqe0 qqe0Var = ((rog0) gmk0VarB).f30835a;
            qqe0Var.getClass();
            return ((mqe0) qqe0Var).f22221a;
        }
        qlc qlcVarF = rek.f(wm40Var);
        if (qlcVarF == null) {
            return null;
        }
        return l(bqe0.d(wm40Var.getClass()), qlcVarF, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object r(r2e r2eVar, ClassLoader classLoader) {
        wsy wsyVar;
        Class clsL;
        if (r2eVar instanceof e93) {
            return p((t83) ((e93) r2eVar).f29728a);
        }
        int i = 0;
        if (r2eVar instanceof mx3) {
            mx3 mx3Var = (mx3) r2eVar;
            h0t0 h0t0Var = mx3Var instanceof h0t0 ? (h0t0) mx3Var : null;
            if (h0t0Var != null && (wsyVar = h0t0Var.c) != null) {
                Object obj = mx3Var.f29728a;
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(r((r2e) it.next(), classLoader));
                }
                g950 g950Var = ary.e;
                foc focVarN = wsyVar.S().n();
                iwb0 iwb0VarS = focVarN == null ? null : ary.s(focVarN);
                switch (iwb0VarS == null ? -1 : wtt0.f39759a[iwb0VarS.ordinal()]) {
                    case -1:
                        if (!ary.z(wsyVar)) {
                            hny.t(wsyVar, "Not an array type: ");
                            return null;
                        }
                        wsy wsyVarB = ((pzs0) CollectionsKt.v0(wsyVar.J())).b();
                        wsyVarB.getClass();
                        foc focVarN2 = wsyVarB.S().n();
                        wm40 wm40Var = focVarN2 instanceof wm40 ? (wm40) focVarN2 : null;
                        if (wm40Var == null) {
                            udk.e(wsyVarB, "Not a class type: ");
                            return null;
                        }
                        if (ary.I(wsyVarB)) {
                            int size = ((List) obj).size();
                            String[] strArr = new String[size];
                            while (i < size) {
                                Object obj2 = arrayList.get(i);
                                obj2.getClass();
                                strArr[i] = obj2;
                                i++;
                            }
                            return strArr;
                        }
                        if (ary.b(wm40Var, i4m0.Q)) {
                            int size2 = ((List) obj).size();
                            Class[] clsArr = new Class[size2];
                            while (i < size2) {
                                Object obj3 = arrayList.get(i);
                                obj3.getClass();
                                clsArr[i] = obj3;
                                i++;
                            }
                            return clsArr;
                        }
                        qlc qlcVarF = rek.f(wm40Var);
                        if (qlcVarF != null && (clsL = l(classLoader, qlcVarF, 0)) != null) {
                            Object objNewInstance = Array.newInstance((Class<?>) clsL, ((List) obj).size());
                            objNewInstance.getClass();
                            Object[] objArr = (Object[]) objNewInstance;
                            int size3 = arrayList.size();
                            while (i < size3) {
                                objArr[i] = arrayList.get(i);
                                i++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        t9f.b();
                        return null;
                    case 1:
                        int size4 = ((List) obj).size();
                        boolean[] zArr = new boolean[size4];
                        while (i < size4) {
                            Object obj4 = arrayList.get(i);
                            obj4.getClass();
                            zArr[i] = ((Boolean) obj4).booleanValue();
                            i++;
                        }
                        return zArr;
                    case 2:
                        int size5 = ((List) obj).size();
                        char[] cArr = new char[size5];
                        while (i < size5) {
                            Object obj5 = arrayList.get(i);
                            obj5.getClass();
                            cArr[i] = ((Character) obj5).charValue();
                            i++;
                        }
                        return cArr;
                    case 3:
                        int size6 = ((List) obj).size();
                        byte[] bArr = new byte[size6];
                        while (i < size6) {
                            Object obj6 = arrayList.get(i);
                            obj6.getClass();
                            bArr[i] = ((Byte) obj6).byteValue();
                            i++;
                        }
                        return bArr;
                    case 4:
                        int size7 = ((List) obj).size();
                        short[] sArr = new short[size7];
                        while (i < size7) {
                            Object obj7 = arrayList.get(i);
                            obj7.getClass();
                            sArr[i] = ((Short) obj7).shortValue();
                            i++;
                        }
                        return sArr;
                    case 5:
                        int size8 = ((List) obj).size();
                        int[] iArr = new int[size8];
                        while (i < size8) {
                            Object obj8 = arrayList.get(i);
                            obj8.getClass();
                            iArr[i] = ((Integer) obj8).intValue();
                            i++;
                        }
                        return iArr;
                    case 6:
                        int size9 = ((List) obj).size();
                        float[] fArr = new float[size9];
                        while (i < size9) {
                            Object obj9 = arrayList.get(i);
                            obj9.getClass();
                            fArr[i] = ((Float) obj9).floatValue();
                            i++;
                        }
                        return fArr;
                    case 7:
                        int size10 = ((List) obj).size();
                        long[] jArr = new long[size10];
                        while (i < size10) {
                            Object obj10 = arrayList.get(i);
                            obj10.getClass();
                            jArr[i] = ((Long) obj10).longValue();
                            i++;
                        }
                        return jArr;
                    case 8:
                        int size11 = ((List) obj).size();
                        double[] dArr = new double[size11];
                        while (i < size11) {
                            Object obj11 = arrayList.get(i);
                            obj11.getClass();
                            dArr[i] = ((Double) obj11).doubleValue();
                            i++;
                        }
                        return dArr;
                }
            }
        } else if (r2eVar instanceof h0o) {
            Pair pair = (Pair) ((h0o) r2eVar).f29728a;
            qlc qlcVar = (qlc) pair.f46059a;
            g950 g950Var2 = (g950) pair.b;
            Class clsL2 = l(classLoader, qlcVar, 0);
            if (clsL2 != null) {
                return Enum.valueOf(clsL2, g950Var2.b());
            }
        } else {
            if (!(r2eVar instanceof ehy)) {
                if ((r2eVar instanceof g2o) || (r2eVar instanceof l860)) {
                    return null;
                }
                return r2eVar.b();
            }
            dhy dhyVar = (dhy) ((ehy) r2eVar).f29728a;
            if (dhyVar instanceof chy) {
                tlc tlcVar = ((chy) dhyVar).f4385a;
                return l(classLoader, tlcVar.f34135a, tlcVar.b);
            }
            if (!(dhyVar instanceof bhy)) {
                t9f.b();
                return null;
            }
            foc focVarN3 = ((bhy) dhyVar).f2632a.S().n();
            wm40 wm40Var2 = focVarN3 instanceof wm40 ? (wm40) focVarN3 : null;
            if (wm40Var2 != null) {
                return q(wm40Var2);
            }
        }
        return null;
    }

    public static final kiy s(kiy kiyVar) {
        kiyVar.getClass();
        fhy fhyVarO = kiyVar.o();
        xgy xgyVar = fhyVarO instanceof xgy ? (xgy) fhyVarO : null;
        if (xgyVar != null) {
            return (kiy) ((vgy) xgyVar.c.getValue()).l.getValue();
        }
        return null;
    }

    public static final List t(List list) throws IllegalAccessException, InvocationTargetException {
        List listC;
        list.getClass();
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (azw.G(azw.F((Annotation) it.next())).getSimpleName().equals("Container")) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Annotation annotation = (Annotation) it2.next();
                        sgy sgyVarF = azw.F(annotation);
                        Class clsG = azw.G(sgyVarF);
                        if (!clsG.getSimpleName().equals("Container") || clsG.getAnnotation(mkf0.class) == null) {
                            listC = kotlin.collections.a.c(annotation);
                        } else {
                            Object objInvoke = azw.G(sgyVarF).getDeclaredMethod("value", null).invoke(annotation, null);
                            objInvoke.getClass();
                            listC = Arrays.asList((Annotation[]) objInvoke);
                            listC.getClass();
                        }
                        w3d.u(arrayList, listC);
                    }
                    return arrayList;
                }
            }
        }
        return list;
    }
}
