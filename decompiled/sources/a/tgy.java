package a;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class tgy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33937a;
    public final xgy b;

    public /* synthetic */ tgy(xgy xgyVar, byte b) {
        this.f33937a = b;
        this.b = xgyVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:0x0114  */
    /* JADX WARN: Code duplicated, block: B:46:0x0135  */
    /* JADX WARN: Code duplicated, block: B:48:0x013a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0140  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.util.List] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        wm40 wm40VarV;
        ?? arrayList;
        sgy sgyVarF;
        Class cls;
        byte b = this.f33937a;
        boolean z = true;
        xgy xgyVar = this.b;
        switch (b) {
            case 0:
                return new vgy(xgyVar);
            case 1:
                Class cls2 = xgyVar.b;
                if (!Iterable.class.isAssignableFrom(cls2) && !Map.class.isAssignableFrom(cls2) && !CharSequence.class.isAssignableFrom(cls2) && !Number.class.isAssignableFrom(cls2)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                qlc qlcVarU = xgyVar.U();
                Class cls3 = xgyVar.b;
                mre0 mre0Var = ((vgy) xgyVar.c.getValue()).f13087a;
                iiy iiyVar = hhy.b[0];
                Object objInvoke = mre0Var.invoke();
                objInvoke.getClass();
                pog0 pog0Var = (pog0) objInvoke;
                f6i f6iVar = pog0Var.f27328a;
                ym40 ym40Var = (ym40) f6iVar.f;
                if (qlcVarU.c && cls3.isAnnotationPresent(Metadata.class)) {
                    nlc nlcVar = (nlc) f6iVar.d;
                    Set set = nlc.c;
                    wm40VarV = nlcVar.a(qlcVarU, null);
                } else {
                    wm40VarV = obb.V(ym40Var, qlcVarU);
                }
                if (wm40VarV != null) {
                    return wm40VarV;
                }
                if (cls3.isSynthetic()) {
                    return xgy.T(qlcVarU, pog0Var);
                }
                jre0 jre0VarN = zvw.N(cls3);
                bry bryVar = jre0VarN != null ? (bry) jre0VarN.b.c : null;
                switch (bryVar != null ? wgy.f39139a[bryVar.ordinal()] : -1) {
                    case -1:
                    case 6:
                        c99.u("Unresolved class: ", cls3, " (kind = ", bryVar);
                        return null;
                    case 0:
                    default:
                        t9f.b();
                        return null;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        return xgy.T(qlcVarU, pog0Var);
                    case 5:
                        c99.u("Unknown class: ", cls3, " (kind = ", bryVar);
                        return null;
                }
            case 3:
                Class cls4 = xgyVar.b;
                Annotation[] annotations = cls4.getAnnotations();
                if (annotations.length != cls4.getDeclaredAnnotations().length) {
                    ArrayList arrayList2 = new ArrayList();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Class superclass = cls4;
                    do {
                        Annotation[] declaredAnnotations = superclass.getDeclaredAnnotations();
                        for (int length = declaredAnnotations.length - 1; -1 < length; length--) {
                            Annotation annotation = declaredAnnotations[length];
                            if (!xgy.d.contains(azw.G(azw.F(annotation)).getName())) {
                                if (superclass != cls4) {
                                    swq swqVar = xtt0.f41480a;
                                    if (azw.G(azw.F(annotation)).getAnnotation(Inherited.class) != null) {
                                        if (xtt0.j(azw.F(annotation))) {
                                            Class<?> componentType = azw.G(azw.F(annotation)).getDeclaredMethod("value", null).getReturnType().getComponentType();
                                            componentType.getClass();
                                            if (azw.G(sre0.f32672a.b(componentType)).getAnnotation(Inherited.class) != null) {
                                                swq swqVar2 = xtt0.f41480a;
                                                sgyVarF = azw.F(annotation);
                                                if (xtt0.j(sgyVarF)) {
                                                    Class<?> componentType2 = azw.G(sgyVarF).getDeclaredMethod("value", null).getReturnType().getComponentType();
                                                    componentType2.getClass();
                                                    sgyVarF = sre0.f32672a.b(componentType2);
                                                }
                                                cls = (Class) linkedHashMap.get(sgyVarF);
                                                if (cls == null) {
                                                    linkedHashMap.put(sgyVarF, superclass);
                                                }
                                                if (cls != null || cls.equals(superclass)) {
                                                    arrayList2.add(annotation);
                                                }
                                            }
                                        } else {
                                            swq swqVar3 = xtt0.f41480a;
                                            sgyVarF = azw.F(annotation);
                                            if (xtt0.j(sgyVarF)) {
                                                Class<?> componentType3 = azw.G(sgyVarF).getDeclaredMethod("value", null).getReturnType().getComponentType();
                                                componentType3.getClass();
                                                sgyVarF = sre0.f32672a.b(componentType3);
                                            }
                                            cls = (Class) linkedHashMap.get(sgyVarF);
                                            if (cls == null) {
                                                linkedHashMap.put(sgyVarF, superclass);
                                            }
                                            if (cls != null) {
                                                arrayList2.add(annotation);
                                            } else {
                                                arrayList2.add(annotation);
                                            }
                                        }
                                    }
                                } else {
                                    swq swqVar4 = xtt0.f41480a;
                                    sgyVarF = azw.F(annotation);
                                    if (xtt0.j(sgyVarF)) {
                                        Class<?> componentType4 = azw.G(sgyVarF).getDeclaredMethod("value", null).getReturnType().getComponentType();
                                        componentType4.getClass();
                                        sgyVarF = sre0.f32672a.b(componentType4);
                                    }
                                    cls = (Class) linkedHashMap.get(sgyVarF);
                                    if (cls == null) {
                                        linkedHashMap.put(sgyVarF, superclass);
                                    }
                                    if (cls != null) {
                                        arrayList2.add(annotation);
                                    } else {
                                        arrayList2.add(annotation);
                                    }
                                }
                            }
                        }
                        superclass = superclass.getSuperclass();
                    } while (superclass != null);
                    arrayList = CollectionsKt.t0(arrayList2);
                } else {
                    arrayList = new ArrayList();
                    for (Annotation annotation2 : annotations) {
                        if (!xgy.d.contains(azw.G(azw.F(annotation2)).getName())) {
                            arrayList.add(annotation2);
                        }
                    }
                }
                return xtt0.t(arrayList);
            case 4:
                Class cls5 = xgyVar.b;
                if (cls5.isAnonymousClass()) {
                    return null;
                }
                qlc qlcVarU2 = xgyVar.U();
                if (!qlcVarU2.c) {
                    String strB = qlcVarU2.f().b();
                    strB.getClass();
                    return strB;
                }
                String simpleName = cls5.getSimpleName();
                Method enclosingMethod = cls5.getEnclosingMethod();
                if (enclosingMethod != null) {
                    return StringsKt.m0(simpleName, enclosingMethod.getName() + '$', simpleName);
                }
                Constructor<?> enclosingConstructor = cls5.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    return StringsKt.n0(simpleName, '$');
                }
                return StringsKt.m0(simpleName, enclosingConstructor.getName() + '$', simpleName);
            default:
                if (xgyVar.b.isAnonymousClass()) {
                    return null;
                }
                qlc qlcVarU3 = xgyVar.U();
                if (qlcVarU3.c) {
                    return null;
                }
                return qlcVarU3.a().f32934a.f34663a;
        }
    }

    public /* synthetic */ tgy(xgy xgyVar, vgy vgyVar, byte b) {
        this.f33937a = b;
        this.b = xgyVar;
    }
}
