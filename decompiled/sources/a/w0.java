package a;

import android.gov.nist.core.Separators;
import android.os.CancellationSignal;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Call;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.presentation.EsportsGamesScreenParams;
import org.xplatform.uikit.components.chips.DsChip;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38323a;
    public final Object b;

    public w0(cp cpVar, cp cpVar2) {
        this.f38323a = (byte) 16;
        this.b = cpVar;
    }

    /* JADX WARN: Code duplicated, block: B:175:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:214:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:216:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:282:0x071d  */
    /* JADX WARN: Code duplicated, block: B:393:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zIsEmpty;
        swq swqVarC;
        Object next;
        mg80 mg80Var;
        g45 g45Var;
        mg80 mg80Var2;
        g950 g950VarF;
        byte b = this.f38323a;
        xmx xmxVar = null;
        boolean z = true;
        int i = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                jre0 jre0Var = (jre0) obj;
                jre0Var.getClass();
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                chf0 chf0Var = new chf0((esg0) obj2, map, map2);
                Class cls = jre0Var.f16999a;
                Method[] declaredMethods = cls.getDeclaredMethods();
                declaredMethods.getClass();
                int length = declaredMethods.length;
                int i2 = 0;
                while (true) {
                    String str = Separators.LPAREN;
                    if (i2 >= length) {
                        Class cls2 = cls;
                        Constructor<?>[] declaredConstructors = cls2.getDeclaredConstructors();
                        declaredConstructors.getClass();
                        int length2 = declaredConstructors.length;
                        int i3 = 0;
                        while (i3 < length2) {
                            Constructor<?> constructor = declaredConstructors[i3];
                            g950 g950Var = lxk0.e;
                            constructor.getClass();
                            StringBuilder sb = new StringBuilder(str);
                            Class<?>[] parameterTypes = constructor.getParameterTypes();
                            parameterTypes.getClass();
                            for (Class<?> cls3 : parameterTypes) {
                                cls3.getClass();
                                sb.append(bqe0.b(cls3));
                            }
                            sb.append(")V");
                            mii0 mii0VarL0 = chf0Var.l0(g950Var, sb.toString());
                            Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                            declaredAnnotations.getClass();
                            for (Annotation annotation : declaredAnnotations) {
                                annotation.getClass();
                                gfx.N(mii0VarL0, annotation);
                            }
                            Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                            parameterAnnotations.getClass();
                            if (parameterAnnotations.length != 0) {
                                int length3 = constructor.getParameterTypes().length - parameterAnnotations.length;
                                int length4 = parameterAnnotations.length;
                                for (int i4 = 0; i4 < length4; i4++) {
                                    Annotation[] annotationArr = parameterAnnotations[i4];
                                    annotationArr.getClass();
                                    int length5 = annotationArr.length;
                                    int i5 = 0;
                                    while (i5 < length5) {
                                        Constructor<?>[] constructorArr = declaredConstructors;
                                        Annotation annotation2 = annotationArr[i5];
                                        int i6 = length2;
                                        Class clsG = azw.G(azw.F(annotation2));
                                        int i7 = i3;
                                        int i8 = length3;
                                        String str2 = str;
                                        xzp xzpVarW = mii0VarL0.W(i4 + length3, bqe0.a(clsG), new zpe0(annotation2));
                                        if (xzpVarW != null) {
                                            gfx.O(xzpVarW, annotation2, clsG);
                                        }
                                        i5++;
                                        declaredConstructors = constructorArr;
                                        i3 = i7;
                                        length2 = i6;
                                        length3 = i8;
                                        str = str2;
                                    }
                                }
                            }
                            Constructor<?>[] constructorArr2 = declaredConstructors;
                            int i9 = length2;
                            int i10 = i3;
                            String str3 = str;
                            mii0VarL0.a();
                            i3 = i10 + 1;
                            declaredConstructors = constructorArr2;
                            length2 = i9;
                            str = str3;
                        }
                        Field[] declaredFields = cls2.getDeclaredFields();
                        declaredFields.getClass();
                        int length6 = declaredFields.length;
                        int i11 = 0;
                        while (i11 < length6) {
                            Field field = declaredFields[i11];
                            g950 g950VarE = g950.e(field.getName());
                            Class<?> type = field.getType();
                            type.getClass();
                            String strB = bqe0.b(type);
                            String strB2 = g950VarE.b();
                            strB2.getClass();
                            er30 er30Var = new er30(strB2 + '#' + strB);
                            ArrayList arrayList = new ArrayList();
                            Annotation[] declaredAnnotations2 = field.getDeclaredAnnotations();
                            declaredAnnotations2.getClass();
                            int length7 = declaredAnnotations2.length;
                            int i12 = 0;
                            while (i12 < length7) {
                                Annotation annotation3 = declaredAnnotations2[i12];
                                annotation3.getClass();
                                Class clsG2 = azw.G(azw.F(annotation3));
                                Field[] fieldArr = declaredFields;
                                xzp xzpVarD0 = ((esg0) chf0Var.b).d0(bqe0.a(clsG2), new zpe0(annotation3), arrayList);
                                if (xzpVarD0 != null) {
                                    gfx.O(xzpVarD0, annotation3, clsG2);
                                }
                                i12++;
                                declaredFields = fieldArr;
                            }
                            Field[] fieldArr2 = declaredFields;
                            if (!arrayList.isEmpty()) {
                                ((HashMap) chf0Var.c).put(er30Var, arrayList);
                            }
                            i11++;
                            declaredFields = fieldArr2;
                        }
                        return new h93(map, map2, map3);
                    }
                    Method method = declaredMethods[i2];
                    g950 g950VarE2 = g950.e(method.getName());
                    StringBuilder sb2 = new StringBuilder(Separators.LPAREN);
                    Class<?>[] parameterTypes2 = method.getParameterTypes();
                    parameterTypes2.getClass();
                    int length8 = parameterTypes2.length;
                    for (int i13 = i; i13 < length8; i13++) {
                        Class<?> cls4 = parameterTypes2[i13];
                        cls4.getClass();
                        sb2.append(bqe0.b(cls4));
                    }
                    sb2.append(Separators.RPAREN);
                    Class<?> returnType = method.getReturnType();
                    returnType.getClass();
                    sb2.append(bqe0.b(returnType));
                    mii0 mii0VarL1 = chf0Var.l0(g950VarE2, sb2.toString());
                    Annotation[] declaredAnnotations3 = method.getDeclaredAnnotations();
                    declaredAnnotations3.getClass();
                    int length9 = declaredAnnotations3.length;
                    for (int i14 = i; i14 < length9; i14++) {
                        Annotation annotation4 = declaredAnnotations3[i14];
                        annotation4.getClass();
                        gfx.N(mii0VarL1, annotation4);
                    }
                    Annotation[][] parameterAnnotations2 = method.getParameterAnnotations();
                    parameterAnnotations2.getClass();
                    Annotation[][] annotationArr2 = parameterAnnotations2;
                    int length10 = annotationArr2.length;
                    int i15 = i;
                    while (i15 < length10) {
                        Annotation[] annotationArr3 = annotationArr2[i15];
                        annotationArr3.getClass();
                        int length11 = annotationArr3.length;
                        int i16 = i;
                        while (i16 < length11) {
                            Annotation annotation5 = annotationArr3[i16];
                            Class cls5 = cls;
                            Class clsG3 = azw.G(azw.F(annotation5));
                            Method[] methodArr = declaredMethods;
                            int i17 = length;
                            xzp xzpVarW2 = mii0VarL1.W(i15, bqe0.a(clsG3), new zpe0(annotation5));
                            if (xzpVarW2 != null) {
                                gfx.O(xzpVarW2, annotation5, clsG3);
                            }
                            i16++;
                            cls = cls5;
                            declaredMethods = methodArr;
                            length = i17;
                        }
                        i15++;
                        i = 0;
                    }
                    mii0VarL1.a();
                    i2++;
                    i = 0;
                }
                break;
            case 1:
                ((cty) obj).getClass();
                return (kzj0) ((g1) obj2).b.b.invoke();
            case 2:
                oey oeyVar = (oey) obj2;
                swq swqVar = (swq) obj;
                swqVar.getClass();
                ed9 ed9VarC = oeyVar.c(swqVar);
                if (ed9VarC == null) {
                    return null;
                }
                f6i f6iVar = oeyVar.c;
                if (f6iVar != null) {
                    ed9VarC.q1(f6iVar);
                    return ed9VarC;
                }
                Intrinsics.h("components");
                throw null;
            case 3:
                tfk tfkVar = (tfk) obj2;
                tft0 tft0Var = (tft0) obj;
                tft0Var.getClass();
                if (!bdx.k0(tft0Var)) {
                    foc focVarN = tft0Var.S().n();
                    z = (focVarN instanceof hzs0) && !Intrinsics.d(((hzs0) focVarN).j(), tfkVar);
                }
                return Boolean.valueOf(z);
            case 4:
                r5 r5Var = (r5) obj2;
                q5 q5Var = (q5) obj;
                q5Var.getClass();
                gfk0 gfk0VarE = r5Var.e();
                Collection collection = q5Var.f28125a;
                gfk0VarE.getClass();
                collection.getClass();
                if (collection.isEmpty()) {
                    wsy wsyVarD = r5Var.d();
                    List listC = wsyVarD != null ? kotlin.collections.a.c(wsyVarD) : null;
                    if (listC == null) {
                        listC = iun.f15405a;
                    }
                    collection = listC;
                }
                List listL0 = collection instanceof List ? (List) collection : null;
                if (listL0 == null) {
                    listL0 = CollectionsKt.L0(collection);
                }
                List listI = r5Var.i(listL0);
                listI.getClass();
                q5Var.b = listI;
                return Unit.f46060a;
            case 5:
                p6t0 p6t0Var = (p6t0) CollectionsKt.W(((Number) obj).intValue(), ((rno0) obj2).b);
                if (!(p6t0Var instanceof pqv) && !(p6t0Var instanceof ly30)) {
                    my30 my30Var = p6t0Var instanceof my30 ? (my30) p6t0Var : null;
                    if (my30Var == null || !my30Var.y0()) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 6:
                p6t0 p6t0Var2 = (p6t0) CollectionsKt.W(((Number) obj).intValue(), ((sno0) obj2).b);
                if (!(p6t0Var2 instanceof pqv) && !(p6t0Var2 instanceof ly30)) {
                    my30 my30Var2 = p6t0Var2 instanceof my30 ? (my30) p6t0Var2 : null;
                    if (my30Var2 == null || !my30Var2.y0()) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 7:
                String str4 = (String) obj;
                str4.getClass();
                return new g7n(new c6q0(str4, e6q0.f7299a, o6q0.f24750a, r7q0.f29989a, true, false, new y5q0(2, null, null, 6), (String) ((ov0) obj2).f, null, false, 3, null, 253184));
            case 8:
                ((ou90) obj).m((pu90) obj2, 0, 0, 0.0f);
                return Unit.f46060a;
            case 9:
                ((s5a) obj2).cancel();
                return Unit.f46060a;
            case 10:
                ((mp9) obj).getClass();
                return Boolean.valueOf(jxk0.i.containsKey(m7x.x((fyj0) obj2)));
            case 11:
                ((Call) obj2).cancel();
                return Unit.f46060a;
            case 12:
                b7r b7rVar = (b7r) obj;
                b7rVar.getClass();
                g9a g9aVar = (g9a) obj2;
                pz2 metadata = b7rVar.getMetadata();
                a9a a9aVar = new a9a(metadata, g9aVar);
                n8a n8aVar = g9aVar.n;
                metadata.f27824a.getFrameNumber();
                return Boolean.valueOf(oke.a(new j9a(n8aVar, a9aVar), true));
            case 13:
                vqe0 vqe0Var = (vqe0) obj;
                vqe0Var.getClass();
                if (((Boolean) ((ilc) obj2).b.invoke(vqe0Var)).booleanValue()) {
                    Class<?> declaringClass = ((Method) vqe0Var.b()).getDeclaringClass();
                    declaringClass.getClass();
                    if (declaringClass.isInterface()) {
                        String strB3 = vqe0Var.c().b();
                        int iHashCode = strB3.hashCode();
                        if (iHashCode != -1776922004) {
                            if (iHashCode != -1295482945) {
                                if (iHashCode == 147696667 && strB3.equals("hashCode")) {
                                    zIsEmpty = ((ArrayList) vqe0Var.g()).isEmpty();
                                }
                            } else if (strB3.equals("equals")) {
                                bre0 bre0Var = (bre0) CollectionsKt.x0(vqe0Var.g());
                                zqe0 zqe0Var = bre0Var != null ? bre0Var.f3078a : null;
                                oqe0 oqe0Var = zqe0Var instanceof oqe0 ? (oqe0) zqe0Var : null;
                                if (oqe0Var != null) {
                                    q8y q8yVar = oqe0Var.b;
                                    if ((q8yVar instanceof mqe0) && (swqVarC = ((mqe0) q8yVar).c()) != null && Intrinsics.d(swqVarC.f32934a.f34663a, "java.lang.Object")) {
                                        zIsEmpty = true;
                                    }
                                }
                            }
                            zIsEmpty = false;
                        } else if (strB3.equals("toString")) {
                            zIsEmpty = ((ArrayList) vqe0Var.g()).isEmpty();
                        } else {
                            zIsEmpty = false;
                        }
                        if (zIsEmpty) {
                            z = false;
                        }
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                nlc nlcVar = (nlc) obj2;
                mlc mlcVar = (mlc) obj;
                mlcVar.getClass();
                qlc qlcVar = mlcVar.f21982a;
                f6i f6iVar2 = nlcVar.f23719a;
                Iterator it = ((Iterable) f6iVar2.m).iterator();
                while (it.hasNext()) {
                    wm40 wm40VarB = ((klc) it.next()).b(qlcVar);
                    if (wm40VarB != null) {
                        return wm40VarB;
                    }
                }
                if (nlc.c.contains(qlcVar)) {
                    return null;
                }
                glc glcVarD = mlcVar.b;
                if (glcVarD == null && (glcVarD = ((hlc) f6iVar2.b).d(qlcVar)) == null) {
                    return null;
                }
                h950 h950Var = glcVarD.f11484a;
                s2d0 s2d0Var = glcVarD.b;
                e28 e28Var = glcVarD.c;
                gmk0 gmk0Var = glcVarD.d;
                qlc qlcVarE = qlcVar.e();
                if (qlcVarE != null) {
                    wm40 wm40VarA = nlcVar.a(qlcVarE, null);
                    ffk ffkVar = wm40VarA instanceof ffk ? (ffk) wm40VarA : null;
                    if (ffkVar == null) {
                        return null;
                    }
                    g950 g950VarF2 = qlcVar.f();
                    g950VarF2.getClass();
                    if (!ffkVar.u0().m().contains(g950VarF2)) {
                        return null;
                    }
                    g45Var = ffkVar.l;
                } else {
                    Iterator it2 = x2x.i0((pg80) f6iVar2.h, qlcVar.f28927a).iterator();
                    do {
                        if (it2.hasNext()) {
                            next = it2.next();
                            mg80Var2 = (mg80) next;
                            if (mg80Var2 instanceof ed9) {
                                g950VarF = qlcVar.f();
                                g950VarF.getClass();
                            }
                        } else {
                            next = null;
                        }
                        mg80Var = (mg80) next;
                        if (mg80Var == null) {
                            return null;
                        }
                        g4d0 g4d0Var = s2d0Var.A;
                        g4d0Var.getClass();
                        roi0 roi0Var = new roi0(g4d0Var);
                        xbu0 xbu0Var = xbu0.b;
                        n4d0 n4d0Var = s2d0Var.Y;
                        n4d0Var.getClass();
                        xbu0 xbu0VarJ = tnq0.j(n4d0Var);
                        h950Var.getClass();
                        e28Var.getClass();
                        g45Var = new g45(f6iVar2, h950Var, mg80Var, roi0Var, xbu0VarJ, e28Var, (hfk) null, (qgd) null, iun.f15405a);
                    } while (!((pfk) ((ed9) mg80Var2).y()).m().contains(g950VarF));
                    mg80Var = (mg80) next;
                    if (mg80Var == null) {
                        return null;
                    }
                    g4d0 g4d0Var2 = s2d0Var.A;
                    g4d0Var2.getClass();
                    roi0 roi0Var2 = new roi0(g4d0Var2);
                    xbu0 xbu0Var2 = xbu0.b;
                    n4d0 n4d0Var2 = s2d0Var.Y;
                    n4d0Var2.getClass();
                    xbu0 xbu0VarJ2 = tnq0.j(n4d0Var2);
                    h950Var.getClass();
                    e28Var.getClass();
                    g45Var = new g45(f6iVar2, h950Var, mg80Var, roi0Var2, xbu0VarJ2, e28Var, (hfk) null, (qgd) null, iun.f15405a);
                }
                return new ffk(g45Var, s2d0Var, h950Var, e28Var, gmk0Var);
            case 15:
                dby dbyVar = (dby) obj2;
                if (dbyVar.isActive()) {
                    dbyVar.r(new t(dbyVar));
                }
                return Unit.f46060a;
            case 16:
                List list = (List) obj;
                list.getClass();
                if (list.isEmpty()) {
                    cp cpVar = (cp) obj2;
                    ((ktx) cpVar.u).b.setText(((tnd) cpVar.u()).b);
                } else {
                    ArrayList<List> arrayList2 = new ArrayList();
                    for (Object obj3 : list) {
                        obj3.getClass();
                        w3d.u(arrayList2, (Collection) obj3);
                    }
                    for (List list2 : arrayList2) {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            it3.next();
                        }
                        Iterator it4 = arrayList3.iterator();
                        if (it4.hasNext()) {
                            throw rw2.h(it4);
                        }
                    }
                }
                return Unit.f46060a;
            case 17:
                ym40 ym40Var = (ym40) obj;
                ym40Var.getClass();
                return ym40Var.c().r((iwb0) obj2);
            case 18:
                ((CancellationSignal) obj2).cancel();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                mp9 mp9Var = (mp9) obj;
                if (mp9Var != null) {
                    ((mek) obj2).f21649a.E0(mp9Var);
                    return Unit.f46060a;
                }
                jf4.o("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
                return null;
            case 20:
                int i18 = (int) (((qkx) obj).f28908a & 4294967295L);
                if (i18 > 0) {
                    ((cgk0) obj2).m(i18);
                }
                return Unit.f46060a;
            case 21:
                b4o b4oVar = (b4o) obj2;
                y3o y3oVar = b4oVar.f1968a;
                ctf0 ctf0Var = b4oVar.c;
                if (!(y3oVar.f41962a instanceof EsportsGamesScreenParams.BestGames)) {
                    return null;
                }
                int iIntValue = ((Number) b4oVar.a().c()).intValue();
                String strA = ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
                bwh0 bwh0Var = bwh0.f3325a;
                return new l2o(iIntValue, dyb.g0(new yvh0(strA, bwh0Var), new yvh0(ctf0Var.b.a(R.string.line, Arrays.copyOf(new Object[0], 0)), bwh0Var)), ucx.X(y3oVar.f));
            case 22:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                v12 v12Var = ((wbv0) obj2).f;
                if (v12Var == v12.f36608a || v12Var == v12.b) {
                    zcl zclVar = qmk.f28987a;
                    float fW0 = fhlVar.w0(1.0f);
                    float fW1 = fhlVar.w0(56.0f);
                    pz40 pz40Var = s6t0.f31722a;
                    float f = fW0 / 2.0f;
                    fhl.Q(fhlVar, s6t0.b().f33626a.getSeparator60(), (((long) Float.floatToRawIntBits(fW1)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) - f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) - f))), fW0, 0, null, 496);
                }
                return Unit.f46060a;
            case 23:
                DsChip dsChip = (DsChip) obj;
                dsChip.getClass();
                dsChip.setCount(null);
                dsChip.setBackgroundActiveColor(Integer.valueOf(fbc.U(ijg.M)));
                uew uewVar = (uew) obj2;
                dsChip.setText(uewVar.b);
                dsChip.setSelected(uewVar.c);
                return Unit.f46060a;
            case 24:
                ctf0 ctf0Var2 = ((mkw) obj2).b;
                ctf0Var2.getClass();
                lsm0 lsm0Var = ctf0Var2.b;
                String strA2 = lsm0Var.a(R.string.statistic_info_rating, Arrays.copyOf(new Object[0], 0));
                StringBuilder sb3 = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/ImgDefault/MMA/UFC/Main_Screen/Rating.png", ujn.h, false) || kotlin.text.c.x("static/img/ImgDefault/MMA/UFC/Main_Screen/Rating.png", "https://", false)) {
                    sb3.setLength(0);
                    sb3.append("static/img/ImgDefault/MMA/UFC/Main_Screen/Rating.png");
                } else {
                    if (sb3.length() > 0 && !StringsKt.S(sb3, Separators.SLASH)) {
                        sb3.append('/');
                    }
                    sb3.append(StringsKt.y0("static/img/ImgDefault/MMA/UFC/Main_Screen/Rating.png", '/'));
                }
                fdm fdmVar = new fdm(1L, strA2, new n0x(sb3.toString()));
                String strA3 = lsm0Var.a(R.string.cyber_games_chip_calendar, Arrays.copyOf(new Object[0], 0));
                StringBuilder sb4 = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/ImgDefault/MMA/UFC/Main_Screen/Calendar.png", ujn.h, false) || kotlin.text.c.x("static/img/ImgDefault/MMA/UFC/Main_Screen/Calendar.png", "https://", false)) {
                    sb4.setLength(0);
                    sb4.append("static/img/ImgDefault/MMA/UFC/Main_Screen/Calendar.png");
                } else {
                    if (sb4.length() > 0 && !StringsKt.S(sb4, Separators.SLASH)) {
                        sb4.append('/');
                    }
                    sb4.append(StringsKt.y0("static/img/ImgDefault/MMA/UFC/Main_Screen/Calendar.png", '/'));
                }
                fdm fdmVar2 = new fdm(2L, strA3, new n0x(sb4.toString()));
                String strA4 = lsm0Var.a(R.string.results, Arrays.copyOf(new Object[0], 0));
                StringBuilder sb5 = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/ImgDefault/MMA/UFC/Main_Screen/Results.png", ujn.h, false) || kotlin.text.c.x("static/img/ImgDefault/MMA/UFC/Main_Screen/Results.png", "https://", false)) {
                    sb5.setLength(0);
                    sb5.append("static/img/ImgDefault/MMA/UFC/Main_Screen/Results.png");
                } else {
                    if (sb5.length() > 0 && !StringsKt.S(sb5, Separators.SLASH)) {
                        sb5.append('/');
                    }
                    sb5.append(StringsKt.y0("static/img/ImgDefault/MMA/UFC/Main_Screen/Results.png", '/'));
                }
                return new biw(new hdm(dyb.g0(fdmVar, fdmVar2, new fdm(3L, strA4, new n0x(sb5.toString())))));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                xmx xmxVar2 = (xmx) obj2;
                cty ctyVar = (cty) obj;
                ctyVar.getClass();
                LinkedHashSet linkedHashSet = xmxVar2.b;
                ArrayList arrayList4 = new ArrayList(r3d.q(linkedHashSet, 10));
                Iterator it5 = linkedHashSet.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(((wsy) it5.next()).f0(ctyVar));
                    i = 1;
                }
                if (i != 0) {
                    wsy wsyVar = xmxVar2.f41149a;
                    wsy wsyVarL0 = wsyVar != null ? wsyVar.f0(ctyVar) : null;
                    arrayList4.isEmpty();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList4);
                    linkedHashSet2.hashCode();
                    xmx xmxVar3 = new xmx(linkedHashSet2);
                    xmxVar3.f41149a = wsyVarL0;
                    xmxVar = xmxVar3;
                }
                if (xmxVar != null) {
                    xmxVar2 = xmxVar;
                }
                return xmxVar2.a();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                fty ftyVar = (fty) obj2;
                swq swqVar2 = (swq) obj;
                swqVar2.getClass();
                swq swqVar3 = v9y.f37057a;
                o860.w0.getClass();
                nw20 nw20Var = n860.b;
                nw20Var.getClass();
                zlf0 zlf0Var = (zlf0) ((xg) nw20Var.b).invoke(swqVar2);
                if (zlf0Var != null) {
                    return zlf0Var;
                }
                nw20 nw20Var2 = v9y.c;
                nw20Var2.getClass();
                w9y w9yVar = (w9y) ((xg) nw20Var2.b).invoke(swqVar2);
                if (w9yVar == null) {
                    return zlf0.IGNORE;
                }
                fty ftyVar2 = w9yVar.b;
                return (ftyVar2 == null || ftyVar2.d - ftyVar.d > 0) ? w9yVar.f38802a : w9yVar.c;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Pair pair = (Pair) obj;
                pair.getClass();
                String str5 = (String) pair.f46059a;
                String str6 = (String) pair.b;
                List listC2 = kotlin.collections.a.c(d93.a(((mey) obj2).f21670a.c(), b1j.k(Separators.QUOTE, str5, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", str6, "()' stdlib extension instead"), str6 + "()", "HIDDEN"));
                listC2.getClass();
                return listC2.isEmpty() ? ujn.c : new i93(listC2, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                j9z j9zVar = (j9z) obj2;
                cqe0 cqe0Var = (cqe0) obj;
                cqe0Var.getClass();
                g950 g950Var2 = l8y.f19626a;
                return l8y.b(j9zVar.f16163a, cqe0Var, j9zVar.c);
            default:
                l9z l9zVar = (l9z) obj2;
                ((cty) obj).getClass();
                return new p9z(l9zVar.j, l9zVar, l9zVar.h, l9zVar.i != null, l9zVar.q);
        }
    }

    public /* synthetic */ w0(Object obj, byte b) {
        this.f38323a = b;
        this.b = obj;
    }
}
