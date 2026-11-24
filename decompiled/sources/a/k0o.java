package a;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class k0o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final guj0 f17479a;
    public final String b;
    public final String c;
    public final List d;
    public final ArrayList e;
    public final List f;
    public final List g;
    public final boolean h;
    public final vtb i;

    public k0o(guj0 guj0Var, String str, String str2, List list, ArrayList arrayList, List list2, List list3, boolean z, vtb vtbVar) {
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f17479a = guj0Var;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = arrayList;
        this.f = list2;
        this.g = list3;
        this.h = z;
        this.i = vtbVar;
        if (guj0Var != guj0.c || (arrayList.isEmpty() && list.isEmpty() && list2.isEmpty())) {
            if (list2.size() == list3.size()) {
                return;
            }
            StringBuilder sb = new StringBuilder("javaParameterTypesIfFunction.size (");
            sb.append(list2.size());
            sb.append(") and javaGenericParameterTypesIfFunction.size (");
            sb.append(list3.size());
            sb.append(") must be equal. For member: '");
            c99.v(axq.m(sb, str, '\''));
            throw null;
        }
        StringBuilder sb2 = new StringBuilder("Inconsistent combination of EquatableCallableSignature values. kind: ");
        sb2.append(guj0Var);
        boolean zIsEmpty = arrayList.isEmpty();
        boolean zIsEmpty2 = list.isEmpty();
        boolean zIsEmpty3 = list2.isEmpty();
        sb2.append(", kotlinParameterTypes.isEmpty(): ");
        sb2.append(zIsEmpty);
        sb2.append(",typeParameters.isEmpty(): ");
        sb2.append(zIsEmpty2);
        sb2.append(", javaParameterTypesIfFunction.isEmpty(): ");
        sb2.append(zIsEmpty3);
        sb2.append(".For member: '");
        sb2.append(str);
        sb2.append('\'');
        throw new IllegalStateException(sb2.toString().toString());
    }

    public final boolean equals(Object obj) {
        List list;
        siy siyVarG;
        if (this != obj) {
            if (obj instanceof k0o) {
                k0o k0oVar = (k0o) obj;
                List list2 = k0oVar.d;
                List list3 = k0oVar.f;
                String str = k0oVar.b;
                ArrayList arrayList = k0oVar.e;
                vtb vtbVar = k0oVar.i;
                vtb vtbVar2 = this.i;
                boolean zEquals = vtbVar2.equals(vtbVar);
                String str2 = this.b;
                if (!zEquals) {
                    c99.v(kng0.l("Equality modes must be the same for member '", str2, "'. Please recreate signatures on inheritance"));
                    return false;
                }
                guj0 guj0Var = k0oVar.f17479a;
                guj0 guj0Var2 = this.f17479a;
                if (guj0Var2 == guj0Var && this.h == k0oVar.h) {
                    ArrayList arrayList2 = this.e;
                    if (arrayList2.size() == arrayList.size()) {
                        if (!vtbVar2.equals(i0o.f13957a) || guj0Var2 != guj0.f11932a) {
                            if (!Intrinsics.d(str2, str) || (siyVarG = two.g((list = this.d), list2)) == null) {
                                return false;
                            }
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                miy miyVar = (miy) list.get(i);
                                miy miyVar2 = (miy) list2.get(i);
                                if (miyVar.getUpperBounds().size() != miyVar2.getUpperBounds().size()) {
                                    return false;
                                }
                                List upperBounds = miyVar.getUpperBounds();
                                ArrayList arrayList3 = new ArrayList(r3d.q(upperBounds, 10));
                                Iterator it = upperBounds.iterator();
                                while (it.hasNext()) {
                                    arrayList3.add(siyVarG.c((kiy) it.next(), str2));
                                }
                                ArrayList<Pair> arrayListT0 = CollectionsKt.T0(CollectionsKt.A0(arrayList3, new mto(str2, (byte) 1)), CollectionsKt.A0(miyVar2.getUpperBounds(), new mto(str, (byte) 1)));
                                if (!arrayListT0.isEmpty()) {
                                    for (Pair pair : arrayListT0) {
                                        if (!n6x.m((kiy) pair.f46059a, (kiy) pair.b)) {
                                            return false;
                                        }
                                    }
                                }
                            }
                            int size2 = arrayList2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                if (!n6x.m(siyVarG.c((kiy) arrayList2.get(i2), str2), (kiy) arrayList.get(i2))) {
                                    return false;
                                }
                            }
                        } else if (Intrinsics.d(this.c, k0oVar.c)) {
                            List list4 = this.f;
                            if (list4.size() == list3.size()) {
                                if (list4.size() != arrayList2.size()) {
                                    StringBuilder sb = new StringBuilder("javaParameterTypesIfFunction.size (");
                                    sb.append(list4.size());
                                    sb.append(") and kotlinParameterTypes.size (");
                                    sb.append(arrayList2.size());
                                    sb.append(") must be equal for member '");
                                    c99.v(axq.m(sb, str2, '\''));
                                    return false;
                                }
                                int size3 = list4.size();
                                for (int i3 = 0; i3 < size3; i3++) {
                                    Type type = (Type) this.g.get(i3);
                                    Class cls = (Class) list4.get(i3);
                                    Type type2 = (Type) k0oVar.g.get(i3);
                                    Class cls2 = (Class) list3.get(i3);
                                    TypeVariable typeVariable = type instanceof TypeVariable ? (TypeVariable) type : null;
                                    boolean z = (typeVariable != null ? typeVariable.getGenericDeclaration() : null) instanceof Class;
                                    TypeVariable typeVariable2 = type2 instanceof TypeVariable ? (TypeVariable) type2 : null;
                                    boolean z2 = (typeVariable2 != null ? typeVariable2.getGenericDeclaration() : null) instanceof Class;
                                    if (z || z2) {
                                        if (cls.isPrimitive() != cls2.isPrimitive() || !n6x.m(two.a((kiy) arrayList2.get(i3), str2), two.a((kiy) arrayList.get(i3), str))) {
                                            return false;
                                        }
                                    } else if (!Intrinsics.d(cls, cls2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean zEquals = this.i.equals(i0o.f13957a);
        guj0 guj0Var = this.f17479a;
        boolean z = zEquals && guj0Var == guj0.f11932a;
        boolean z2 = this.h;
        ArrayList arrayList = this.e;
        if (!z) {
            if (!z) {
                return Arrays.hashCode(new Object[]{guj0Var, Integer.valueOf(arrayList.size()), Boolean.valueOf(z2), this.b});
            }
            t9f.b();
            return 0;
        }
        Integer numValueOf = Integer.valueOf(arrayList.size());
        Boolean boolValueOf = Boolean.valueOf(z2);
        String str = this.c;
        if (str == null) {
            str = "";
        }
        return Arrays.hashCode(new Object[]{guj0Var, numValueOf, boolValueOf, str});
    }

    public final String toString() {
        return "EquatableCallableSignature(kind=" + this.f17479a + ", name=" + this.b + ", jvmNameIfFunction=" + this.c + ", typeParameters=" + this.d + ", kotlinParameterTypes=" + this.e + ", javaParameterTypesIfFunction=" + this.f + ", javaGenericParameterTypesIfFunction=" + this.g + ", isStatic=" + this.h + ", equalityMode=" + this.i + ')';
    }
}
