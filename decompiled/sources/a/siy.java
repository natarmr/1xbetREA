package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes2.dex */
public final class siy {
    public static final siy c;
    public static final siy d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f32283a;
    public final boolean b;

    static {
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        c = new siy(lunVar, false);
        d = new siy(lunVar, true);
    }

    public siy(Map map, boolean z) {
        map.getClass();
        this.f32283a = map;
        this.b = z;
    }

    public final siy a(boolean z) {
        if (z == this.b) {
            return this;
        }
        Map map = this.f32283a;
        if (!map.isEmpty() || z) {
            return (map.isEmpty() && z) ? d : new siy(map, z);
        }
        return c;
    }

    public final KTypeProjection b(kiy kiyVar, uiy uiyVar) {
        KTypeProjection kTypeProjectionD = d(kiyVar, uiyVar);
        boolean z = this.b;
        if (z) {
            kiy kiyVar2 = kTypeProjectionD.b;
            return new KTypeProjection(kiyVar2 != null ? q5x.J(kiyVar2, kiyVar2, false) : null, kTypeProjectionD.f46069a);
        }
        if (!z) {
            return kTypeProjectionD;
        }
        t9f.b();
        return null;
    }

    public final kiy c(kiy kiyVar, String str) {
        kiyVar.getClass();
        kiy kiyVar2 = b(kiyVar, uiy.f35755a).b;
        if (kiyVar2 == null) {
            throw new IllegalStateException("Projection in top level type is not possible".concat(str != null ? ": ".concat(str) : Separators.DOT).toString());
        }
        return kiyVar2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0137  */
    /* JADX WARN: Code duplicated, block: B:102:0x013b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0140  */
    /* JADX WARN: Code duplicated, block: B:108:0x014c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0152  */
    /* JADX WARN: Code duplicated, block: B:83:0x0107  */
    /* JADX WARN: Code duplicated, block: B:85:0x0112  */
    /* JADX WARN: Code duplicated, block: B:89:0x011b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0125  */
    /* JADX WARN: Code duplicated, block: B:94:0x0129  */
    /* JADX WARN: Code duplicated, block: B:95:0x012d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0130  */
    public final KTypeProjection d(kiy kiyVar, uiy uiyVar) {
        KTypeProjection kTypeProjectionD;
        dcg0 dcg0Var;
        boolean z;
        boolean z2;
        v2 v2VarB;
        v2 v2Var;
        v2 v2Var2;
        kiy kiyVarA;
        v2 v2VarC;
        v2 v2VarZ;
        Map map = this.f32283a;
        if (map.isEmpty()) {
            return new KTypeProjection(kiyVar, uiyVar);
        }
        boolean z3 = kiyVar instanceof v2;
        v2 v2Var3 = z3 ? (v2) kiyVar : null;
        v2 v2VarZ2 = v2Var3 != null ? v2Var3.z() : null;
        v2 v2Var4 = z3 ? (v2) kiyVar : null;
        v2 v2VarC2 = v2Var4 != null ? v2Var4.C() : null;
        if (v2VarZ2 != null && v2VarC2 != null) {
            KTypeProjection kTypeProjectionD2 = d(v2VarZ2, uiyVar);
            kiy kiyVar2 = kTypeProjectionD2.b;
            v2 v2Var5 = kiyVar2 instanceof v2 ? (v2) kiyVar2 : null;
            if (v2Var5 != null && (v2VarZ = v2Var5.z()) != null) {
                kTypeProjectionD2 = new KTypeProjection(v2VarZ, kTypeProjectionD2.f46069a);
            }
            KTypeProjection kTypeProjectionD3 = d(v2VarC2, uiyVar);
            kiy kiyVar3 = kTypeProjectionD3.b;
            v2 v2Var6 = kiyVar3 instanceof v2 ? (v2) kiyVar3 : null;
            if (v2Var6 != null && (v2VarC = v2Var6.C()) != null) {
                kTypeProjectionD3 = new KTypeProjection(v2VarC, kTypeProjectionD3.f46069a);
            }
            kiy kiyVar4 = kTypeProjectionD3.b;
            kiy kiyVar5 = kTypeProjectionD2.b;
            if (kiyVar4 != null && kiyVar5 != null) {
                return new KTypeProjection(yqm0.m(kiyVar5, kiyVar4, ((v2) kiyVar).q()), kTypeProjectionD2.f46069a);
            }
            KTypeProjection.c.getClass();
            return KTypeProjection.d;
        }
        fhy fhyVarO = kiyVar.o();
        if (fhyVarO == null) {
            return new KTypeProjection(kiyVar, uiyVar);
        }
        KTypeProjection kTypeProjection = (KTypeProjection) map.get(fhyVarO);
        if (kTypeProjection == null) {
            if (!kiyVar.M().isEmpty()) {
                List<KTypeProjection> listM = kiyVar.M();
                ArrayList arrayList = new ArrayList(r3d.q(listM, 10));
                for (KTypeProjection kTypeProjection2 : listM) {
                    uiy uiyVar2 = kTypeProjection2.f46069a;
                    kiy kiyVar6 = kTypeProjection2.b;
                    if (kiyVar6 == null || uiyVar2 == null) {
                        KTypeProjection.c.getClass();
                        kTypeProjectionD = KTypeProjection.d;
                    } else {
                        kTypeProjectionD = d(kiyVar6, uiyVar2);
                    }
                    arrayList.add(kTypeProjectionD);
                }
                boolean zH = kiyVar.h();
                List annotations = kiyVar.getAnnotations();
                v2 v2Var7 = kiyVar instanceof v2 ? (v2) kiyVar : null;
                kiyVar = x2x.O(fhyVarO, arrayList, zH, annotations, v2Var7 != null ? v2Var7.j() : null);
            }
            return new KTypeProjection(kiyVar, uiyVar);
        }
        kiy kiyVar7 = kTypeProjection.b;
        uiy uiyVar3 = kTypeProjection.f46069a;
        if (kiyVar7 == null || uiyVar3 == null) {
            return kTypeProjection;
        }
        uiy uiyVar4 = uiy.f35755a;
        if (uiyVar3 != uiyVar4) {
            if (uiyVar != uiyVar4 && uiyVar3 != uiyVar) {
                jf4.n("CONFLICTING_PROJECTION");
                return null;
            }
            uiyVar = uiyVar3;
        }
        if (kiyVar instanceof aty) {
            aty atyVar = (aty) kiyVar;
            if (((!(atyVar instanceof v2) || ((v2) atyVar).z() == null) ? null : (nkq) atyVar) == null) {
                if (kiyVar7 instanceof v2) {
                    v2 v2Var8 = (v2) kiyVar7;
                    v2 v2VarZ3 = v2Var8.z();
                    Boolean boolValueOf = v2VarZ3 != null ? Boolean.valueOf(v2VarZ3.h()) : null;
                    v2 v2VarC3 = v2Var8.C();
                    if (Intrinsics.d(boolValueOf, v2VarC3 != null ? Boolean.valueOf(v2VarC3.h()) : null)) {
                        dcg0Var = (dcg0) kiyVar7;
                        z = false;
                        if (kiyVar.h()) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        v2VarB = ((v2) dcg0Var).B(z2);
                        if (v2VarB != null) {
                            if (kiyVar instanceof v2) {
                                v2Var = (v2) kiyVar;
                            } else {
                                v2Var = null;
                            }
                            if (v2Var == null) {
                                if (dcg0Var instanceof v2) {
                                }
                                if (v2Var2 != null) {
                                    z = true;
                                }
                            } else {
                                if (dcg0Var instanceof v2) {
                                }
                                if (v2Var2 != null) {
                                    z = true;
                                }
                            }
                            kiyVarA = v2VarB.A(z);
                        } else {
                            v2VarB.getClass();
                            kiyVarA = v2VarB;
                        }
                    } else {
                        kiyVarA = kiyVar7;
                        if (kiyVar.h()) {
                            dcg0Var = (dcg0) kiyVar7;
                            z = false;
                            if (kiyVar.h()) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            v2VarB = ((v2) dcg0Var).B(z2);
                            if (v2VarB != null) {
                                if (kiyVar instanceof v2) {
                                    v2Var = (v2) kiyVar;
                                } else {
                                    v2Var = null;
                                }
                                if (v2Var == null) {
                                    if (dcg0Var instanceof v2) {
                                    }
                                    if (v2Var2 != null) {
                                        z = true;
                                    }
                                } else {
                                    if (dcg0Var instanceof v2) {
                                    }
                                    if (v2Var2 != null) {
                                        z = true;
                                    }
                                }
                                kiyVarA = v2VarB.A(z);
                            } else {
                                v2VarB.getClass();
                                kiyVarA = v2VarB;
                            }
                        }
                    }
                } else {
                    dcg0Var = (dcg0) kiyVar7;
                    z = false;
                    if (kiyVar.h() || kiyVar7.h()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    v2VarB = ((v2) dcg0Var).B(z2);
                    if (v2VarB != null) {
                        if (kiyVar instanceof v2) {
                            v2Var = (v2) kiyVar;
                        } else {
                            v2Var = null;
                        }
                        if (v2Var == null && v2Var.n()) {
                            z = true;
                        } else {
                            v2Var2 = dcg0Var instanceof v2 ? (v2) dcg0Var : null;
                            if (v2Var2 != null && v2Var2.n() && !kiyVar.h()) {
                                z = true;
                            }
                        }
                        kiyVarA = v2VarB.A(z);
                    } else {
                        v2VarB.getClass();
                        kiyVarA = v2VarB;
                    }
                }
                return new KTypeProjection(kiyVarA, uiyVar);
            }
        }
        c99.t(kiyVar, "' must be non flexible", Separators.QUOTE);
        return null;
    }
}
