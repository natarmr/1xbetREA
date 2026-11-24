package a;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes2.dex */
public final class rgy {
    public static final rgy k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final siy f30460a;
    public final fm40 b;
    public final Boolean c;
    public final ihy d;
    public final List e;
    public final List f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    static {
        iun iunVar = iun.f15405a;
        k = new rgy(null, null, null, null, iunVar, iunVar, false, false, false, false);
    }

    public rgy(siy siyVar, fm40 fm40Var, Boolean bool, ihy ihyVar, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4) {
        list.getClass();
        list2.getClass();
        this.f30460a = siyVar;
        this.b = fm40Var;
        this.c = bool;
        this.d = ihyVar;
        this.e = list;
        this.f = list2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
    }

    public static rgy a(rgy rgyVar, siy siyVar, fm40 fm40Var, Boolean bool, ihy ihyVar, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            siyVar = rgyVar.f30460a;
        }
        siy siyVar2 = siyVar;
        if ((i & 2) != 0) {
            fm40Var = rgyVar.b;
        }
        fm40 fm40Var2 = fm40Var;
        if ((i & 4) != 0) {
            bool = rgyVar.c;
        }
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            ihyVar = rgyVar.d;
        }
        ihy ihyVar2 = ihyVar;
        List list3 = (i & 16) != 0 ? rgyVar.e : list;
        List list4 = (i & 32) != 0 ? rgyVar.f : list2;
        boolean z5 = (i & 64) != 0 ? rgyVar.g : z;
        boolean z6 = (i & 128) != 0 ? rgyVar.h : z2;
        boolean z7 = (i & 256) != 0 ? rgyVar.i : z3;
        boolean z8 = (i & 512) != 0 ? rgyVar.j : z4;
        rgyVar.getClass();
        list3.getClass();
        list4.getClass();
        return new rgy(siyVar2, fm40Var2, bool2, ihyVar2, list3, list4, z5, z6, z7, z8);
    }

    public final siy b(String str, List list) {
        siy siyVar;
        list.getClass();
        str.getClass();
        siy siyVarG = two.g(this.e, list);
        siy siyVar2 = this.f30460a;
        if (siyVarG != null) {
            siy siyVar3 = siyVar2 == null ? siy.c : siyVar2;
            Map map = siyVarG.f32283a;
            siyVar3.getClass();
            boolean z = siyVarG.b || siyVar3.b;
            if (map.isEmpty()) {
                siyVar = siyVar3.a(z);
            } else {
                Map map2 = siyVar3.f32283a;
                if (map2.isEmpty()) {
                    siyVar = siyVarG.a(z);
                } else {
                    LinkedHashSet linkedHashSetZ = CollectionsKt.Z(map.keySet(), map2.keySet());
                    if (!linkedHashSetZ.isEmpty()) {
                        c99.v(rw2.o(new StringBuilder("Substitutors must not have intersecting keys: "), CollectionsKt.b0(linkedHashSetZ, null, null, null, null, 63), ". Member: ", str));
                        return null;
                    }
                    siyVar = new siy(xp20.j(map, map2), z);
                }
            }
            if (siyVar != null) {
                return siyVar;
            }
        }
        return siyVar2 == null ? siy.c : siyVar2;
    }

    public final boolean c() {
        return this.d != null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    public final rgy d(siy siyVar) {
        siy siyVar2;
        siyVar.getClass();
        siy siyVar3 = this.f30460a;
        if (siyVar3 != null) {
            Map map = siyVar3.f32283a;
            Map map2 = siyVar.f32283a;
            if (!siyVar3.b) {
                if (map.isEmpty()) {
                    siyVar3 = siyVar;
                } else {
                    boolean z = siyVar.b;
                    if (map2.isEmpty()) {
                        siyVar3 = siyVar3.a(z);
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(map.size()));
                        for (Map.Entry entry : map.entrySet()) {
                            Object key = entry.getKey();
                            KTypeProjection kTypeProjectionB = (KTypeProjection) entry.getValue();
                            kiy kiyVar = kTypeProjectionB.b;
                            uiy uiyVar = kTypeProjectionB.f46069a;
                            if (kiyVar != null && uiyVar != null) {
                                kTypeProjectionB = siyVar.b(kiyVar, uiyVar);
                            }
                            linkedHashMap.put(key, kTypeProjectionB);
                        }
                        LinkedHashSet linkedHashSetZ = CollectionsKt.Z(linkedHashMap.keySet(), map2.keySet());
                        if (!linkedHashSetZ.isEmpty()) {
                            hny.t(linkedHashSetZ, "Substitutors must not have intersecting keys: ");
                            return null;
                        }
                        siyVar3 = new siy(xp20.j(linkedHashMap, map2), z);
                    }
                }
            }
            if (siyVar3 == null) {
                siyVar2 = siyVar;
            } else {
                siyVar2 = siyVar3;
            }
        } else {
            siyVar2 = siyVar;
        }
        return a(this, siyVar2, null, null, null, null, null, false, false, false, false, 1022);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgy)) {
            return false;
        }
        rgy rgyVar = (rgy) obj;
        return Intrinsics.d(this.f30460a, rgyVar.f30460a) && this.b == rgyVar.b && Intrinsics.d(this.c, rgyVar.c) && Intrinsics.d(this.d, rgyVar.d) && Intrinsics.d(this.e, rgyVar.e) && Intrinsics.d(this.f, rgyVar.f) && this.g == rgyVar.g && this.h == rgyVar.h && this.i == rgyVar.i && this.j == rgyVar.j;
    }

    public final int hashCode() {
        siy siyVar = this.f30460a;
        int iHashCode = (siyVar == null ? 0 : siyVar.hashCode()) * 31;
        fm40 fm40Var = this.b;
        int iHashCode2 = (iHashCode + (fm40Var == null ? 0 : fm40Var.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        ihy ihyVar = this.d;
        return Boolean.hashCode(this.j) + brm0.e(brm0.e(brm0.e(dw9.a(dw9.a((iHashCode3 + (ihyVar != null ? ihyVar.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KCallableOverriddenStorage(classTypeParametersSubstitutor=");
        sb.append(this.f30460a);
        sb.append(", modality=");
        sb.append(this.b);
        sb.append(", isStatic=");
        sb.append(this.c);
        sb.append(", originalContainerIfFakeOverride=");
        sb.append(this.d);
        sb.append(", originalCallableTypeParameters=");
        sb.append(this.e);
        sb.append(", overridden=");
        sb.append(this.f);
        sb.append(", forceIsExternal=");
        sb.append(this.g);
        sb.append(", forceIsOperator=");
        sb.append(this.h);
        sb.append(", forceIsInfix=");
        sb.append(this.i);
        sb.append(", forceIsInline=");
        return brm0.o(sb, this.j, ')');
    }
}
