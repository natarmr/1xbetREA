package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class bdk implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2403a;
    public final rdk b;

    public /* synthetic */ bdk(rdk rdkVar, byte b) {
        this.f2403a = b;
        this.b = rdkVar;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x01db  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f9  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        vjj vjjVarJ;
        Class<?> clsJ;
        tqp tqpVar;
        byte b = this.f2403a;
        rdk rdkVar = this.b;
        switch (b) {
            case 0:
                qlc qlcVar = sog0.f32540a;
                d0d0 d0d0VarZ = rdkVar.z();
                ihy ihyVar = rdkVar.h;
                g1x g1xVarB = sog0.b(d0d0VarZ);
                if (!(g1xVarB instanceof qfy)) {
                    if (g1xVarB instanceof ofy) {
                        return ((ofy) g1xVarB).f25190a;
                    }
                    if ((g1xVarB instanceof pfy) || (g1xVarB instanceof rfy)) {
                        return null;
                    }
                    t9f.b();
                    return null;
                }
                qfy qfyVar = (qfy) g1xVarB;
                p3d0 p3d0Var = qfyVar.b;
                rfk rfkVar = qfyVar.f28658a;
                sso ssoVar = egy.f7784a;
                cfy cfyVarB = egy.b(p3d0Var, qfyVar.d, qfyVar.e, true);
                if (cfyVarB == null) {
                    return null;
                }
                if (rfkVar.l() != 2) {
                    vjj vjjVarJ2 = rfkVar.j();
                    if (vjjVarJ2 == null) {
                        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "companionObject", "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil", "isClassCompanionObjectWithBackingFieldsInOuter"));
                    }
                    if (oek.l(vjjVarJ2)) {
                        vjj vjjVarJ3 = vjjVarJ2.j();
                        if (oek.m(vjjVarJ3, slc.f32392a) || oek.m(vjjVarJ3, slc.c)) {
                            wm40 wm40Var = (wm40) vjjVarJ2;
                            LinkedHashSet linkedHashSet = scd.f31980a;
                            if (oek.l(wm40Var)) {
                                LinkedHashSet linkedHashSet2 = scd.f31980a;
                                qlc qlcVarF = rek.f(wm40Var);
                                if (CollectionsKt.L(linkedHashSet2, qlcVarF != null ? qlcVarF.e() : null)) {
                                    if (oek.l(rfkVar.j())) {
                                        tqpVar = rfkVar.z;
                                        if (!((tqpVar == null && tqpVar.getAnnotations().z0(aey.f753a)) ? true : rfkVar.getAnnotations().z0(aey.f753a))) {
                                            if (egy.d(p3d0Var)) {
                                                vjjVarJ = rfkVar.j();
                                                if (vjjVarJ instanceof wm40) {
                                                    clsJ = xtt0.q((wm40) vjjVarJ);
                                                } else {
                                                    clsJ = ihyVar.j();
                                                }
                                            }
                                        }
                                    } else if (egy.d(p3d0Var)) {
                                        vjjVarJ = rfkVar.j();
                                        if (vjjVarJ instanceof wm40) {
                                            clsJ = xtt0.q((wm40) vjjVarJ);
                                        } else {
                                            clsJ = ihyVar.j();
                                        }
                                    }
                                }
                            }
                        } else if (oek.l(rfkVar.j())) {
                            tqpVar = rfkVar.z;
                            if (!((tqpVar == null && tqpVar.getAnnotations().z0(aey.f753a)) ? true : rfkVar.getAnnotations().z0(aey.f753a))) {
                                if (egy.d(p3d0Var)) {
                                    vjjVarJ = rfkVar.j();
                                    if (vjjVarJ instanceof wm40) {
                                        clsJ = xtt0.q((wm40) vjjVarJ);
                                    } else {
                                        clsJ = ihyVar.j();
                                    }
                                }
                            }
                        } else if (egy.d(p3d0Var)) {
                            vjjVarJ = rfkVar.j();
                            if (vjjVarJ instanceof wm40) {
                                clsJ = xtt0.q((wm40) vjjVarJ);
                            } else {
                                clsJ = ihyVar.j();
                            }
                        }
                    } else if (oek.l(rfkVar.j())) {
                        tqpVar = rfkVar.z;
                        if (!((tqpVar == null && tqpVar.getAnnotations().z0(aey.f753a)) ? true : rfkVar.getAnnotations().z0(aey.f753a))) {
                            if (egy.d(p3d0Var)) {
                                vjjVarJ = rfkVar.j();
                                if (vjjVarJ instanceof wm40) {
                                    clsJ = xtt0.q((wm40) vjjVarJ);
                                } else {
                                    clsJ = ihyVar.j();
                                }
                            }
                        }
                    } else if (egy.d(p3d0Var)) {
                        vjjVarJ = rfkVar.j();
                        if (vjjVarJ instanceof wm40) {
                            clsJ = xtt0.q((wm40) vjjVarJ);
                        } else {
                            clsJ = ihyVar.j();
                        }
                    }
                    clsJ = ihyVar.j().getEnclosingClass();
                } else if (egy.d(p3d0Var)) {
                    clsJ = ihyVar.j().getEnclosingClass();
                } else {
                    vjjVarJ = rfkVar.j();
                    if (vjjVarJ instanceof wm40) {
                        clsJ = xtt0.q((wm40) vjjVarJ);
                    } else {
                        clsJ = ihyVar.j();
                    }
                }
                if (clsJ == null) {
                    return null;
                }
                try {
                    return clsJ.getDeclaredField(cfyVarB.b);
                } catch (NoSuchFieldException unused) {
                    return null;
                }
            case 1:
                ihy ihyVar2 = rdkVar.h;
                String str = rdkVar.i;
                String str2 = rdkVar.j;
                ihyVar2.getClass();
                str.getClass();
                str2.getClass();
                bh30 bh30VarF = ihy.f14802a.f(str2);
                if (bh30VarF != null) {
                    String str3 = (String) ((ah30) bh30VarF.a()).get(1);
                    d0d0 d0d0VarN = ihyVar2.N(Integer.parseInt(str3));
                    if (d0d0VarN != null) {
                        return d0d0VarN;
                    }
                    StringBuilder sbT = kng0.t("Local property #", str3, " not found in ");
                    sbT.append(ihyVar2.j());
                    throw new poe(sbT.toString());
                }
                Collection collectionQ = ihyVar2.Q(g950.e(str));
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionQ) {
                    if (Intrinsics.d(sog0.b((d0d0) obj).o(), str2)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    StringBuilder sbN = b1j.n("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
                    sbN.append(ihyVar2);
                    throw new poe(sbN.toString());
                }
                if (arrayList.size() == 1) {
                    return (d0d0) CollectionsKt.v0(arrayList);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList) {
                    tek visibility = ((d0d0) obj2).getVisibility();
                    Object arrayList2 = linkedHashMap.get(visibility);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(visibility, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                Collection collectionValues = wp20.c(linkedHashMap, new wpv((byte) 5)).values();
                collectionValues.getClass();
                List list = (List) CollectionsKt.c0(collectionValues);
                if (list.size() == 1) {
                    return (d0d0) CollectionsKt.U(list);
                }
                String strB0 = CollectionsKt.b0(ihyVar2.Q(g950.e(str)), Separators.RETURN, null, null, j9x.k, 30);
                StringBuilder sbN2 = b1j.n("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
                sbN2.append(ihyVar2);
                sbN2.append(':');
                sbN2.append(strB0.length() == 0 ? " no members found" : Separators.RETURN.concat(strB0));
                throw new poe(sbN2.toString());
            default:
                return rdkVar.x().getReturnType();
        }
    }
}
