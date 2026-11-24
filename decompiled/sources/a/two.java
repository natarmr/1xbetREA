package a;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes2.dex */
public abstract class two {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gi2 f34660a = hdd.a(ske.y, ske.z);

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (a.bdx.k0(r0) == true) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final a.kiy a(a.kiy r7, java.lang.String r8) {
        /*
            boolean r0 = r7 instanceof a.v2
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r7
            a.v2 r0 = (a.v2) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto L2a
            a.fhy r2 = r0.o()
            boolean r2 = r2 instanceof a.d2o
            if (r2 != 0) goto L29
            boolean r2 = r0 instanceof a.wdk
            if (r2 == 0) goto L1b
            a.wdk r0 = (a.wdk) r0
            goto L1c
        L1b:
            r0 = r1
        L1c:
            if (r0 == 0) goto L2a
            a.wsy r0 = r0.b
            if (r0 == 0) goto L2a
            boolean r0 = a.bdx.k0(r0)
            r2 = 1
            if (r0 != r2) goto L2a
        L29:
            return r7
        L2a:
            a.fhy r0 = r7.o()
            if (r0 == 0) goto L70
            java.util.List r2 = r7.M()
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = a.r3d.q(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L43:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L64
            java.lang.Object r4 = r2.next()
            kotlin.reflect.KTypeProjection r4 = (kotlin.reflect.KTypeProjection) r4
            a.kiy r5 = r4.b
            if (r5 == 0) goto L58
            a.kiy r5 = a(r5, r8)
            goto L59
        L58:
            r5 = r1
        L59:
            a.uiy r4 = r4.f46069a
            kotlin.reflect.KTypeProjection r6 = new kotlin.reflect.KTypeProjection
            r6.<init>(r5, r4)
            r3.add(r6)
            goto L43
        L64:
            java.util.List r7 = r7.getAnnotations()
            r8 = 8
            r1 = 0
            a.v2 r7 = a.x2x.P(r0, r3, r1, r7, r8)
            return r7
        L70:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Non-denotable parameter types are not possible. Some parameter types appear non-denotable for type '"
            r1.<init>(r2)
            r1.append(r7)
            java.lang.Class r7 = r7.getClass()
            a.tre0 r2 = a.sre0.f32672a
            a.sgy r7 = r2.b(r7)
            java.lang.String r2 = "' ("
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = ") which belongs to member '"
            r1.append(r7)
            r1.append(r8)
            r7 = 39
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.two.a(a.kiy, java.lang.String):a.kiy");
    }

    public static final ArrayList b(xgy xgyVar, k0o k0oVar) {
        xgyVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (kiy kiyVar : xgyVar.b()) {
            fhy fhyVarO = kiyVar.o();
            sgy sgyVar = fhyVarO instanceof sgy ? (sgy) fhyVarO : null;
            if (sgyVar != null) {
                siy siyVar = siy.c;
                siy siyVarX = b5x.x(kiyVar);
                Iterator it = c(sgyVar).entrySet().iterator();
                while (it.hasNext()) {
                    dre0 dre0Var = (dre0) ((Map.Entry) it.next()).getValue();
                    if (dre0Var instanceof gre0) {
                        dre0 dre0Var2 = (gre0) dre0Var;
                        if (k0oVar.equals(h(dre0Var2.H(xgyVar, rgy.a(((ere0) dre0Var2).f8277a.d(siyVarX), null, null, Boolean.valueOf(f(dre0Var)), d(dre0Var), dre0Var2.getTypeParameters(), null, false, false, false, false, 995)), j0o.f15691a))) {
                            arrayList.add(dre0Var);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static final Map c(sgy sgyVar) {
        if (sgyVar instanceof xgy) {
            mre0 mre0Var = ((vgy) ((xgy) sgyVar).c.getValue()).p;
            iiy iiyVar = vgy.r[12];
            Object objInvoke = mre0Var.invoke();
            objInvoke.getClass();
            return (Map) objInvoke;
        }
        if (sgyVar instanceof yx40) {
            return c(((yx40) sgyVar).w());
        }
        e9d0.x(sre0.f32672a.b(sgyVar.getClass()), "Unknown type ");
        return null;
    }

    public static final ihy d(dre0 dre0Var) {
        ihy ihyVar = ((ere0) dre0Var).f8277a.d;
        return ihyVar == null ? dre0Var.K() : ihyVar;
    }

    public static final boolean e(xgy xgyVar, dre0 dre0Var) {
        Field fieldY;
        Class<?> declaringClass;
        xgyVar.getClass();
        dre0Var.getClass();
        if (dre0Var.getVisibility() == viy.d) {
            return true;
        }
        if (f(dre0Var) && xgyVar.V() == rlc.INTERFACE) {
            return !(dre0Var instanceof iiy) || (fieldY = uvw.y((iiy) dre0Var)) == null || (declaringClass = fieldY.getDeclaringClass()) == null || declaringClass.getAnnotation(Metadata.class) != null;
        }
        return false;
    }

    public static final boolean f(dre0 dre0Var) {
        List listA;
        dre0Var.getClass();
        Boolean bool = ((ere0) dre0Var).f8277a.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        n9y n9yVar = dre0Var instanceof n9y ? (n9y) dre0Var : null;
        if (n9yVar == null || (listA = (List) n9yVar.h.getValue()) == null) {
            listA = dre0Var.a();
        }
        hre0 hre0Var = (hre0) CollectionsKt.firstOrNull(listA);
        return (hre0Var != null ? hre0Var.n() : null) != aiy.f949a;
    }

    public static final siy g(List list, List list2) {
        list.getClass();
        list2.getClass();
        if (list.size() != list2.size()) {
            return null;
        }
        if (list.isEmpty()) {
            return siy.c;
        }
        ArrayList<Pair> arrayListT0 = CollectionsKt.T0(list, list2);
        int iA = wp20.a(r3d.q(arrayListT0, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Pair pair : arrayListT0) {
            miy miyVar = (miy) pair.f46059a;
            miy miyVar2 = (miy) pair.b;
            piy piyVar = KTypeProjection.c;
            v2 v2VarN = x2x.N(miyVar2, null, 7);
            piyVar.getClass();
            linkedHashMap.put(miyVar, piy.a(v2VarN));
        }
        return new siy(linkedHashMap, false);
    }

    public static final k0o h(dre0 dre0Var, vtb vtbVar) {
        List listA;
        guj0 guj0Var;
        Field fieldY;
        Class<?> declaringClass;
        dre0Var.getClass();
        n9y n9yVar = dre0Var instanceof n9y ? (n9y) dre0Var : null;
        if (n9yVar == null || (listA = (List) n9yVar.h.getValue()) == null) {
            listA = dre0Var.a();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (((hre0) obj).n() != aiy.f949a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((hre0) it.next()).p());
        }
        boolean z = dre0Var instanceof iiy;
        if (z && (fieldY = uvw.y((iiy) dre0Var)) != null && (declaringClass = fieldY.getDeclaringClass()) != null && declaringClass.getAnnotation(Metadata.class) == null) {
            guj0Var = guj0.c;
        } else if (z) {
            guj0Var = guj0.b;
        } else {
            if (!(dre0Var instanceof jhy)) {
                e9d0.x(sre0.f32672a.b(dre0Var.getClass()), "Unknown kind for ");
                return null;
            }
            guj0Var = guj0.f11932a;
        }
        guj0 guj0Var2 = guj0Var;
        jhy jhyVar = dre0Var instanceof jhy ? (jhy) dre0Var : null;
        Method methodZ = jhyVar != null ? uvw.z(jhyVar) : null;
        Type[] genericParameterTypes = methodZ != null ? methodZ.getGenericParameterTypes() : null;
        if (genericParameterTypes == null) {
            genericParameterTypes = new Type[0];
        }
        List listG0 = tx3.g0(genericParameterTypes);
        Class<?>[] parameterTypes = methodZ != null ? methodZ.getParameterTypes() : null;
        if (parameterTypes == null) {
            parameterTypes = new Class[0];
        }
        return new k0o(guj0Var2, dre0Var.getName(), methodZ != null ? methodZ.getName() : null, dre0Var.getTypeParameters(), arrayList2, tx3.g0(parameterTypes), listG0, f(dre0Var), vtbVar);
    }
}
