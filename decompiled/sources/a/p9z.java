package a;

import java.lang.annotation.Annotation;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class p9z extends baz {
    public static final /* synthetic */ int v = 0;
    public final wm40 n;
    public final mqe0 o;
    public final boolean p;
    public final cu00 q;
    public final cu00 r;
    public final cu00 s;
    public final cu00 t;
    public final xg u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9z(f7u f7uVar, wm40 wm40Var, mqe0 mqe0Var, boolean z, p9z p9zVar) {
        super(f7uVar, p9zVar);
        f7uVar.getClass();
        mqe0Var.getClass();
        this.n = wm40Var;
        this.o = mqe0Var;
        this.p = z;
        eu00 eu00Var = (eu00) ((v7i) f7uVar.b).i;
        this.q = new cu00(eu00Var, new m9z(this, f7uVar));
        this.r = new cu00(eu00Var, new n9z(this, (byte) 0));
        this.s = new cu00(eu00Var, new m9z(f7uVar, this));
        this.t = new cu00(eu00Var, new n9z(this, (byte) 1));
        this.u = eu00Var.d(new ygy(this, f7uVar, (byte) 8));
    }

    public static fyj0 A(fyj0 fyj0Var, mer merVar, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return fyj0Var;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            fyj0 fyj0Var2 = (fyj0) it.next();
            if (!Intrinsics.d(fyj0Var, fyj0Var2) && fyj0Var2.Y == null && D(fyj0Var2, merVar)) {
                mer merVarBuild = fyj0Var.g0().j().build();
                merVarBuild.getClass();
                return (fyj0) merVarBuild;
            }
        }
        return fyj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    public static fyj0 B(fyj0 fyj0Var) {
        swq swqVarI;
        List listZ = fyj0Var.z();
        listZ.getClass();
        k3u0 k3u0Var = (k3u0) CollectionsKt.f0(listZ);
        if (k3u0Var != null) {
            foc focVarN = k3u0Var.getType().S().n();
            if (focVarN != null) {
                int i = rek.f30339a;
                twq twqVarF = oek.f(focVarN);
                twqVarF.getClass();
                if (!twqVarF.d()) {
                    twqVarF = null;
                }
                if (twqVarF != null) {
                    swqVarI = twqVarF.i();
                } else {
                    swqVarI = null;
                }
            } else {
                swqVarI = null;
            }
            if (!Intrinsics.d(swqVarI, j4m0.g)) {
                k3u0Var = null;
            }
            if (k3u0Var != null) {
                ler lerVarG0 = fyj0Var.g0();
                List listZ2 = fyj0Var.z();
                listZ2.getClass();
                fyj0 fyj0Var2 = (fyj0) lerVarG0.a(CollectionsKt.P(1, listZ2)).t(((pzs0) k3u0Var.getType().J().get(0)).b()).build();
                if (fyj0Var2 != null) {
                    fyj0Var2.v = true;
                }
                return fyj0Var2;
            }
        }
        return null;
    }

    public static boolean D(mer merVar, mer merVar2) {
        int iB = sf80.c.n(merVar2, merVar, true).b();
        if (iB != 0) {
            return iB == 1 && !tfx.x(merVar2, merVar);
        }
        throw null;
    }

    public static boolean E(fyj0 fyj0Var, fyj0 fyj0Var2) {
        int i = jd9.l;
        fyj0Var.getClass();
        if (Intrinsics.d(fyj0Var.getName().b(), "removeAt") && Intrinsics.d(m7x.x(fyj0Var), jxk0.g.e)) {
            fyj0Var2 = fyj0Var2.a();
        }
        fyj0Var2.getClass();
        return D(fyj0Var2, fyj0Var);
    }

    public static fyj0 F(d0d0 d0d0Var, String str, Function1 function1) {
        fyj0 fyj0Var;
        Iterator it = ((Iterable) function1.invoke(g950.e(str))).iterator();
        do {
            fyj0Var = null;
            if (!it.hasNext()) {
                break;
            }
            fyj0 fyj0Var2 = (fyj0) it.next();
            if (fyj0Var2.z().size() == 0) {
                lm50 lm50Var = ysy.f43192a;
                wsy wsyVar = fyj0Var2.h;
                if (wsyVar == null ? false : lm50Var.b(wsyVar, d0d0Var.getType())) {
                    fyj0Var = fyj0Var2;
                }
            }
        } while (fyj0Var == null);
        return fyj0Var;
    }

    public static fyj0 H(d0d0 d0d0Var, Function1 function1) {
        fyj0 fyj0Var;
        wsy wsyVar;
        String strB = d0d0Var.getName().b();
        strB.getClass();
        Iterator it = ((Iterable) function1.invoke(g950.e(aey.b(strB)))).iterator();
        do {
            fyj0Var = null;
            if (!it.hasNext()) {
                break;
            }
            fyj0 fyj0Var2 = (fyj0) it.next();
            if (fyj0Var2.z().size() == 1 && (wsyVar = fyj0Var2.h) != null) {
                g950 g950Var = ary.e;
                if (ary.E(wsyVar, i4m0.d)) {
                    lm50 lm50Var = ysy.f43192a;
                    List listZ = fyj0Var2.z();
                    listZ.getClass();
                    if (lm50Var.a(((k3u0) CollectionsKt.v0(listZ)).getType(), d0d0Var.getType())) {
                        fyj0Var = fyj0Var2;
                    }
                }
            }
        } while (fyj0Var == null);
        return fyj0Var;
    }

    public static boolean K(fyj0 fyj0Var, mer merVar) {
        String strW = m7x.w(fyj0Var, 2);
        mer merVarO1 = merVar.o1();
        merVarO1.getClass();
        return strW.equals(m7x.w(merVarO1, 2)) && !D(fyj0Var, merVar);
    }

    public final boolean C(d0d0 d0d0Var, Function1 function1) {
        if (gfx.J(d0d0Var)) {
            return false;
        }
        fyj0 fyj0VarG = G(d0d0Var, function1);
        fyj0 fyj0VarH = H(d0d0Var, function1);
        if (fyj0VarG == null) {
            return false;
        }
        if (d0d0Var.E()) {
            return fyj0VarH != null && fyj0VarH.m() == fyj0VarG.m();
        }
        return true;
    }

    public final fyj0 G(d0d0 d0d0Var, Function1 function1) {
        g950 g950Var;
        g0d0 g0d0VarD = d0d0Var.d();
        String strB = null;
        g0d0 g0d0Var = g0d0VarD != null ? (g0d0) x0x.S(g0d0VarD) : null;
        if (g0d0Var != null) {
            ary.A(g0d0Var);
            mp9 mp9VarB = rek.b(rek.j(g0d0Var), i13.x);
            if (mp9VarB != null && (g950Var = (g950) ld9.f19838a.get(rek.g(mp9VarB))) != null) {
                strB = g950Var.b();
            }
        }
        if (strB != null && !x0x.W(this.n, g0d0Var)) {
            return F(d0d0Var, strB, function1);
        }
        String strB2 = d0d0Var.getName().b();
        strB2.getClass();
        return F(d0d0Var, aey.a(strB2), function1);
    }

    public final LinkedHashSet I(g950 g950Var) {
        Collection collectionZ = z();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionZ.iterator();
        while (it.hasNext()) {
            w3d.u(linkedHashSet, ((wsy) it.next()).y().a(g950Var, ux50.e));
        }
        return linkedHashSet;
    }

    public final Set J(g950 g950Var) {
        Collection collectionZ = z();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionZ.iterator();
        while (it.hasNext()) {
            Collection collectionF = ((wsy) it.next()).y().f(g950Var, ux50.e);
            ArrayList arrayList2 = new ArrayList(r3d.q(collectionF, 10));
            Iterator it2 = collectionF.iterator();
            while (it2.hasNext()) {
                arrayList2.add((d0d0) it2.next());
            }
            w3d.u(arrayList, arrayList2);
        }
        return CollectionsKt.P0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0161 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:52:0x0116  */
    /* JADX WARN: Code duplicated, block: B:58:0x012d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0137  */
    /* JADX WARN: Code duplicated, block: B:64:0x0144  */
    /* JADX WARN: Code duplicated, block: B:67:0x014b  */
    /* JADX WARN: Code duplicated, block: B:70:0x015d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0167  */
    /* JADX WARN: Code duplicated, block: B:78:0x017a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:80:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[LOOP:1: B:41:0x00d6->B:87:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[LOOP:3: B:59:0x0131->B:95:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0173 A[SYNTHETIC] */
    public final boolean L(fyj0 fyj0Var) {
        g950 g950Var;
        g950 name;
        fyj0 fyj0VarB;
        LinkedHashSet<fyj0> linkedHashSetI;
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        mer merVarA;
        ArrayList arrayList2;
        fyj0 fyj0Var2;
        Iterator it3;
        fyj0 fyj0Var3;
        g950 name2 = fyj0Var.getName();
        name2.getClass();
        List listK = g8x.K(name2);
        if (listK != null && listK.isEmpty()) {
            ArrayList arrayList3 = jxk0.f17310a;
            g950 name3 = fyj0Var.getName();
            name3.getClass();
            g950Var = (g950) jxk0.k.get(name3);
            if (g950Var == null) {
                int i = kd9.l;
                name = fyj0Var.getName();
                name.getClass();
                if (!jxk0.e.contains(name)) {
                    fyj0VarB = B(fyj0Var);
                    if (fyj0VarB == null) {
                        return true;
                    }
                    g950 name4 = fyj0Var.getName();
                    name4.getClass();
                    linkedHashSetI = I(name4);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    for (fyj0 fyj0Var4 : linkedHashSetI) {
                        if (fyj0Var4.isSuspend()) {
                        }
                    }
                    return true;
                }
                g950 name5 = fyj0Var.getName();
                name5.getClass();
                LinkedHashSet linkedHashSetI2 = I(name5);
                arrayList = new ArrayList();
                it = linkedHashSetI2.iterator();
                while (it.hasNext()) {
                    merVarA = kd9.a((fyj0) it.next());
                    if (merVarA != null) {
                        arrayList.add(merVarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    fyj0VarB = B(fyj0Var);
                    if (fyj0VarB == null) {
                        return true;
                    }
                    g950 name6 = fyj0Var.getName();
                    name6.getClass();
                    linkedHashSetI = I(name6);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r6.hasNext()) {
                        if (fyj0Var4.isSuspend()) {
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (K(fyj0Var, (mer) it2.next())) {
                    }
                }
                fyj0VarB = B(fyj0Var);
                if (fyj0VarB == null) {
                    return true;
                }
                g950 name7 = fyj0Var.getName();
                name7.getClass();
                linkedHashSetI = I(name7);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r6.hasNext()) {
                    if (fyj0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            LinkedHashSet linkedHashSetI3 = I(g950Var);
            arrayList2 = new ArrayList();
            for (Object obj : linkedHashSetI3) {
                fyj0Var3 = (fyj0) obj;
                fyj0Var3.getClass();
                if (x0x.S(fyj0Var3) != null) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                int i2 = kd9.l;
                name = fyj0Var.getName();
                name.getClass();
                if (!jxk0.e.contains(name)) {
                    fyj0VarB = B(fyj0Var);
                    if (fyj0VarB == null) {
                        return true;
                    }
                    g950 name8 = fyj0Var.getName();
                    name8.getClass();
                    linkedHashSetI = I(name8);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r6.hasNext()) {
                        if (fyj0Var4.isSuspend()) {
                        }
                    }
                    return true;
                }
                g950 name9 = fyj0Var.getName();
                name9.getClass();
                LinkedHashSet linkedHashSetI4 = I(name9);
                arrayList = new ArrayList();
                it = linkedHashSetI4.iterator();
                while (it.hasNext()) {
                    merVarA = kd9.a((fyj0) it.next());
                    if (merVarA != null) {
                        arrayList.add(merVarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    fyj0VarB = B(fyj0Var);
                    if (fyj0VarB == null) {
                        return true;
                    }
                    g950 name10 = fyj0Var.getName();
                    name10.getClass();
                    linkedHashSetI = I(name10);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r6.hasNext()) {
                        if (fyj0Var4.isSuspend()) {
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (K(fyj0Var, (mer) it2.next())) {
                    }
                }
                fyj0VarB = B(fyj0Var);
                if (fyj0VarB == null) {
                    return true;
                }
                g950 name11 = fyj0Var.getName();
                name11.getClass();
                linkedHashSetI = I(name11);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r6.hasNext()) {
                    if (fyj0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            ler lerVarG0 = fyj0Var.g0();
            lerVarG0.q(g950Var);
            lerVarG0.u();
            lerVarG0.l();
            mer merVarBuild = lerVarG0.build();
            merVarBuild.getClass();
            fyj0Var2 = (fyj0) merVarBuild;
            if (arrayList2.isEmpty()) {
                int i3 = kd9.l;
                name = fyj0Var.getName();
                name.getClass();
                if (!jxk0.e.contains(name)) {
                    fyj0VarB = B(fyj0Var);
                    if (fyj0VarB == null) {
                        return true;
                    }
                    g950 name12 = fyj0Var.getName();
                    name12.getClass();
                    linkedHashSetI = I(name12);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r6.hasNext()) {
                        if (fyj0Var4.isSuspend()) {
                        }
                    }
                    return true;
                }
                g950 name13 = fyj0Var.getName();
                name13.getClass();
                LinkedHashSet linkedHashSetI5 = I(name13);
                arrayList = new ArrayList();
                it = linkedHashSetI5.iterator();
                while (it.hasNext()) {
                    merVarA = kd9.a((fyj0) it.next());
                    if (merVarA != null) {
                        arrayList.add(merVarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    fyj0VarB = B(fyj0Var);
                    if (fyj0VarB == null) {
                        return true;
                    }
                    g950 name14 = fyj0Var.getName();
                    name14.getClass();
                    linkedHashSetI = I(name14);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r6.hasNext()) {
                        if (fyj0Var4.isSuspend()) {
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (K(fyj0Var, (mer) it2.next())) {
                    }
                }
                fyj0VarB = B(fyj0Var);
                if (fyj0VarB == null) {
                    return true;
                }
                g950 name15 = fyj0Var.getName();
                name15.getClass();
                linkedHashSetI = I(name15);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r6.hasNext()) {
                    if (fyj0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (E((fyj0) it3.next(), fyj0Var2)) {
                }
            }
            int i4 = kd9.l;
            name = fyj0Var.getName();
            name.getClass();
            if (!jxk0.e.contains(name)) {
                fyj0VarB = B(fyj0Var);
                if (fyj0VarB == null) {
                    return true;
                }
                g950 name16 = fyj0Var.getName();
                name16.getClass();
                linkedHashSetI = I(name16);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r6.hasNext()) {
                    if (fyj0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            g950 name17 = fyj0Var.getName();
            name17.getClass();
            LinkedHashSet linkedHashSetI6 = I(name17);
            arrayList = new ArrayList();
            it = linkedHashSetI6.iterator();
            while (it.hasNext()) {
                merVarA = kd9.a((fyj0) it.next());
                if (merVarA != null) {
                    arrayList.add(merVarA);
                }
            }
            if (arrayList.isEmpty()) {
                fyj0VarB = B(fyj0Var);
                if (fyj0VarB == null) {
                    return true;
                }
                g950 name18 = fyj0Var.getName();
                name18.getClass();
                linkedHashSetI = I(name18);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r6.hasNext()) {
                    if (fyj0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(fyj0Var, (mer) it2.next())) {
                }
            }
            fyj0VarB = B(fyj0Var);
            if (fyj0VarB == null) {
                return true;
            }
            g950 name19 = fyj0Var.getName();
            name19.getClass();
            linkedHashSetI = I(name19);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r6.hasNext()) {
                if (fyj0Var4.isSuspend()) {
                }
            }
            return true;
        }
        Iterator it4 = listK.iterator();
        while (it4.hasNext()) {
            Set<d0d0> setJ = J((g950) it4.next());
            if (!(setJ instanceof Collection) || !setJ.isEmpty()) {
                for (d0d0 d0d0Var : setJ) {
                    if (C(d0d0Var, new ygy(fyj0Var, this, (byte) 9))) {
                        if (!d0d0Var.E()) {
                            String strB = fyj0Var.getName().b();
                            strB.getClass();
                            swq swqVar = aey.f753a;
                            if (!kotlin.text.c.x(strB, "set", false)) {
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList4 = jxk0.f17310a;
        g950 name20 = fyj0Var.getName();
        name20.getClass();
        g950Var = (g950) jxk0.k.get(name20);
        if (g950Var == null) {
            int i5 = kd9.l;
            name = fyj0Var.getName();
            name.getClass();
            if (!jxk0.e.contains(name)) {
                fyj0VarB = B(fyj0Var);
                if (fyj0VarB == null) {
                    return true;
                }
                g950 name110 = fyj0Var.getName();
                name110.getClass();
                linkedHashSetI = I(name110);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r6.hasNext()) {
                    if (fyj0Var4.isSuspend() || !D(fyj0VarB, fyj0Var4)) {
                    }
                }
                return true;
            }
            g950 name111 = fyj0Var.getName();
            name111.getClass();
            LinkedHashSet linkedHashSetI7 = I(name111);
            arrayList = new ArrayList();
            it = linkedHashSetI7.iterator();
            while (it.hasNext()) {
                merVarA = kd9.a((fyj0) it.next());
                if (merVarA != null) {
                    arrayList.add(merVarA);
                }
            }
            if (arrayList.isEmpty()) {
                fyj0VarB = B(fyj0Var);
                if (fyj0VarB == null) {
                    return true;
                }
                g950 name112 = fyj0Var.getName();
                name112.getClass();
                linkedHashSetI = I(name112);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r6.hasNext()) {
                    if (fyj0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(fyj0Var, (mer) it2.next())) {
                }
            }
            fyj0VarB = B(fyj0Var);
            if (fyj0VarB == null) {
                return true;
            }
            g950 name113 = fyj0Var.getName();
            name113.getClass();
            linkedHashSetI = I(name113);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r6.hasNext()) {
                if (fyj0Var4.isSuspend()) {
                }
            }
            return true;
        }
        LinkedHashSet linkedHashSetI8 = I(g950Var);
        arrayList2 = new ArrayList();
        while (r2.hasNext()) {
            fyj0Var3 = (fyj0) obj;
            fyj0Var3.getClass();
            if (x0x.S(fyj0Var3) != null) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            int i6 = kd9.l;
            name = fyj0Var.getName();
            name.getClass();
            if (!jxk0.e.contains(name)) {
                fyj0VarB = B(fyj0Var);
                if (fyj0VarB == null) {
                    return true;
                }
                g950 name114 = fyj0Var.getName();
                name114.getClass();
                linkedHashSetI = I(name114);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r6.hasNext()) {
                    if (fyj0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            g950 name115 = fyj0Var.getName();
            name115.getClass();
            LinkedHashSet linkedHashSetI9 = I(name115);
            arrayList = new ArrayList();
            it = linkedHashSetI9.iterator();
            while (it.hasNext()) {
                merVarA = kd9.a((fyj0) it.next());
                if (merVarA != null) {
                    arrayList.add(merVarA);
                }
            }
            if (arrayList.isEmpty()) {
                fyj0VarB = B(fyj0Var);
                if (fyj0VarB == null) {
                    return true;
                }
                g950 name116 = fyj0Var.getName();
                name116.getClass();
                linkedHashSetI = I(name116);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r6.hasNext()) {
                    if (fyj0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(fyj0Var, (mer) it2.next())) {
                }
            }
            fyj0VarB = B(fyj0Var);
            if (fyj0VarB == null) {
                return true;
            }
            g950 name117 = fyj0Var.getName();
            name117.getClass();
            linkedHashSetI = I(name117);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r6.hasNext()) {
                if (fyj0Var4.isSuspend()) {
                }
            }
            return true;
        }
        ler lerVarG1 = fyj0Var.g0();
        lerVarG1.q(g950Var);
        lerVarG1.u();
        lerVarG1.l();
        mer merVarBuild2 = lerVarG1.build();
        merVarBuild2.getClass();
        fyj0Var2 = (fyj0) merVarBuild2;
        if (arrayList2.isEmpty()) {
            int i7 = kd9.l;
            name = fyj0Var.getName();
            name.getClass();
            if (!jxk0.e.contains(name)) {
                fyj0VarB = B(fyj0Var);
                if (fyj0VarB == null) {
                    return true;
                }
                g950 name118 = fyj0Var.getName();
                name118.getClass();
                linkedHashSetI = I(name118);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r6.hasNext()) {
                    if (fyj0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            g950 name119 = fyj0Var.getName();
            name119.getClass();
            LinkedHashSet linkedHashSetI10 = I(name119);
            arrayList = new ArrayList();
            it = linkedHashSetI10.iterator();
            while (it.hasNext()) {
                merVarA = kd9.a((fyj0) it.next());
                if (merVarA != null) {
                    arrayList.add(merVarA);
                }
            }
            if (arrayList.isEmpty()) {
                fyj0VarB = B(fyj0Var);
                if (fyj0VarB == null) {
                    return true;
                }
                g950 name1110 = fyj0Var.getName();
                name1110.getClass();
                linkedHashSetI = I(name1110);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r6.hasNext()) {
                    if (fyj0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(fyj0Var, (mer) it2.next())) {
                }
            }
            fyj0VarB = B(fyj0Var);
            if (fyj0VarB == null) {
                return true;
            }
            g950 name1111 = fyj0Var.getName();
            name1111.getClass();
            linkedHashSetI = I(name1111);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r6.hasNext()) {
                if (fyj0Var4.isSuspend()) {
                }
            }
            return true;
        }
        it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            if (E((fyj0) it3.next(), fyj0Var2)) {
            }
        }
        int i8 = kd9.l;
        name = fyj0Var.getName();
        name.getClass();
        if (!jxk0.e.contains(name)) {
            fyj0VarB = B(fyj0Var);
            if (fyj0VarB == null) {
                return true;
            }
            g950 name1112 = fyj0Var.getName();
            name1112.getClass();
            linkedHashSetI = I(name1112);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r6.hasNext()) {
                if (fyj0Var4.isSuspend()) {
                }
            }
            return true;
        }
        g950 name1113 = fyj0Var.getName();
        name1113.getClass();
        LinkedHashSet linkedHashSetI11 = I(name1113);
        arrayList = new ArrayList();
        it = linkedHashSetI11.iterator();
        while (it.hasNext()) {
            merVarA = kd9.a((fyj0) it.next());
            if (merVarA != null) {
                arrayList.add(merVarA);
            }
        }
        if (arrayList.isEmpty()) {
            fyj0VarB = B(fyj0Var);
            if (fyj0VarB == null) {
                return true;
            }
            g950 name1114 = fyj0Var.getName();
            name1114.getClass();
            linkedHashSetI = I(name1114);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r6.hasNext()) {
                if (fyj0Var4.isSuspend()) {
                }
            }
            return true;
        }
        it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (K(fyj0Var, (mer) it2.next())) {
            }
        }
        fyj0VarB = B(fyj0Var);
        if (fyj0VarB == null) {
            return true;
        }
        g950 name1115 = fyj0Var.getName();
        name1115.getClass();
        linkedHashSetI = I(name1115);
        if (linkedHashSetI.isEmpty()) {
            return true;
        }
        while (r6.hasNext()) {
            if (fyj0Var4.isSuspend()) {
            }
        }
        return true;
        return false;
    }

    public final void M(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        ux50Var.getClass();
        Object obj = this.b.b;
        this.n.getClass();
    }

    public final ArrayList N(g950 g950Var) {
        Collection collectionD = ((ckj) this.e.invoke()).d(g950Var);
        ArrayList arrayList = new ArrayList(r3d.q(collectionD, 10));
        Iterator it = collectionD.iterator();
        while (it.hasNext()) {
            arrayList.add(t((vqe0) it.next()));
        }
        return arrayList;
    }

    public final ArrayList O(g950 g950Var) {
        LinkedHashSet linkedHashSetI = I(g950Var);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetI) {
            fyj0 fyj0Var = (fyj0) obj;
            fyj0Var.getClass();
            if (x0x.S(fyj0Var) == null && kd9.a(fyj0Var) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // a.baz, a.dr30, a.cr30
    public final Collection a(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        M(g950Var, ux50Var);
        return super.a(g950Var, ux50Var);
    }

    @Override // a.dr30, a.cr30
    public final foc d(g950 g950Var, ux50 ux50Var) {
        xg xgVar;
        wm40 wm40Var;
        g950Var.getClass();
        ux50Var.getClass();
        M(g950Var, ux50Var);
        p9z p9zVar = (p9z) this.c;
        return (p9zVar == null || (xgVar = p9zVar.u) == null || (wm40Var = (wm40) xgVar.invoke(g950Var)) == null) ? (foc) this.u.invoke(g950Var) : wm40Var;
    }

    @Override // a.baz, a.dr30, a.cr30
    public final Collection f(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        M(g950Var, ux50Var);
        return super.f(g950Var, ux50Var);
    }

    @Override // a.baz
    public final Set h(cek cekVar, Function1 function1) {
        cekVar.getClass();
        return eui0.g((Set) this.r.invoke(), ((Map) this.t.invoke()).keySet());
    }

    @Override // a.baz
    public final Set i(cek cekVar, Function1 function1) {
        cekVar.getClass();
        wm40 wm40Var = this.n;
        Collection collectionB = wm40Var.h().b();
        collectionB.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            w3d.u(linkedHashSet, ((wsy) it.next()).y().c());
        }
        cu00 cu00Var = this.e;
        linkedHashSet.addAll(((ckj) cu00Var.invoke()).c());
        linkedHashSet.addAll(((ckj) cu00Var.invoke()).e());
        linkedHashSet.addAll(h(cekVar, function1));
        f7u f7uVar = this.b;
        linkedHashSet.addAll(((kld) ((e6o0) ((v7i) f7uVar.b).o)).e(wm40Var, f7uVar));
        return linkedHashSet;
    }

    @Override // a.baz
    public final void j(g950 g950Var, ArrayList arrayList) throws Throwable {
        boolean zG = this.o.g();
        wm40 wm40Var = this.n;
        f7u f7uVar = this.b;
        if (zG) {
            cu00 cu00Var = this.e;
            if (((ckj) cu00Var.invoke()).a(g950Var) != null) {
                if (arrayList.isEmpty()) {
                    yqe0 yqe0VarA = ((ckj) cu00Var.invoke()).a(g950Var);
                    yqe0VarA.getClass();
                    u9y u9yVarD1 = u9y.D1(wm40Var, r8x.W(f7uVar, yqe0VarA), yqe0VarA.c(), m2a.v(yqe0VarA), true);
                    wsy wsyVarV = ((nvu) f7uVar.e).V(yqe0VarA.f(), xvw.Y(b0t0.b, false, null, 6));
                    c8z c8zVarP = p();
                    iun iunVar = iun.f15405a;
                    gm40.f11524a.getClass();
                    u9yVarD1.C1(null, c8zVarP, iunVar, iunVar, iunVar, wsyVarV, gm40.d, uek.e, null);
                    u9yVarD1.f1 = 1;
                    arrayList.add(u9yVarD1);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((fyj0) it.next()).z().isEmpty()) {
                        }
                    }
                    yqe0 yqe0VarA2 = ((ckj) cu00Var.invoke()).a(g950Var);
                    yqe0VarA2.getClass();
                    u9y u9yVarD2 = u9y.D1(wm40Var, r8x.W(f7uVar, yqe0VarA2), yqe0VarA2.c(), m2a.v(yqe0VarA2), true);
                    wsy wsyVarV2 = ((nvu) f7uVar.e).V(yqe0VarA2.f(), xvw.Y(b0t0.b, false, null, 6));
                    c8z c8zVarP2 = p();
                    iun iunVar2 = iun.f15405a;
                    gm40.f11524a.getClass();
                    u9yVarD2.C1(null, c8zVarP2, iunVar2, iunVar2, iunVar2, wsyVarV2, gm40.d, uek.e, null);
                    u9yVarD2.f1 = 1;
                    arrayList.add(u9yVarD2);
                }
            }
        }
        ((kld) ((e6o0) ((v7i) f7uVar.b).o)).b(wm40Var, g950Var, arrayList, f7uVar);
    }

    @Override // a.baz
    public final ckj k() {
        return new ilc(this.o, j9x.u);
    }

    @Override // a.baz
    public final void m(LinkedHashSet linkedHashSet, g950 g950Var) {
        LinkedHashSet linkedHashSetI = I(g950Var);
        ArrayList arrayList = jxk0.f17310a;
        if (!jxk0.j.contains(g950Var)) {
            int i = kd9.l;
            if (!jxk0.e.contains(g950Var)) {
                if (!linkedHashSetI.isEmpty()) {
                    Iterator it = linkedHashSetI.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((mer) it.next()).isSuspend()) {
                            }
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : linkedHashSetI) {
                    if (L((fyj0) obj)) {
                        arrayList2.add(obj);
                    }
                }
                w(linkedHashSet, g950Var, arrayList2, false);
                return;
            }
        }
        nbk0 nbk0Var = new nbk0();
        LinkedHashSet linkedHashSetH1 = rcb.h1(g950Var, linkedHashSetI, iun.f15405a, this.n, q1o.e0, ((lm50) ((km50) ((v7i) this.b.b).m)).d);
        Class<p9z> cls = p9z.class;
        x(g950Var, linkedHashSet, linkedHashSetH1, linkedHashSet, new g1y(1, this, cls, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, (byte) 18));
        x(g950Var, linkedHashSet, linkedHashSetH1, nbk0Var, new g1y(1, this, cls, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, (byte) 19));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSetI) {
            if (L((fyj0) obj2)) {
                arrayList3.add(obj2);
            }
        }
        w(linkedHashSet, g950Var, CollectionsKt.q0(arrayList3, nbk0Var), true);
    }

    @Override // a.baz
    public final void n(g950 g950Var, ArrayList arrayList) {
        g950 g950Var2;
        boolean zIsAnnotation = this.o.f22221a.isAnnotation();
        f7u f7uVar = this.b;
        if (zIsAnnotation) {
            g950Var2 = g950Var;
            vqe0 vqe0Var = (vqe0) CollectionsKt.w0(((ckj) this.e.invoke()).d(g950Var2));
            if (vqe0Var != null) {
                evz evzVar = gm40.f11524a;
                x9y x9yVarX1 = x9y.x1(this.n, r8x.W(f7uVar, vqe0Var), u4n0.u(vqe0Var.e()), false, vqe0Var.c(), m2a.v(vqe0Var), false);
                g0d0 g0d0VarN = obb.N(x9yVarX1, ujn.c);
                x9yVarX1.t1(g0d0VarN, null, null, null);
                f7uVar.getClass();
                wsy wsyVarL = baz.l(vqe0Var, new f7u((v7i) f7uVar.b, new ucs0(f7uVar, x9yVarX1, vqe0Var, 0), (a8z) f7uVar.d));
                iun iunVar = iun.f15405a;
                x9yVarX1.w1(wsyVarL, iunVar, p(), null, iunVar);
                g0d0VarN.n = wsyVarL;
                arrayList.add(x9yVarX1);
            }
        } else {
            g950Var2 = g950Var;
        }
        Set setJ = J(g950Var);
        if (setJ.isEmpty()) {
            return;
        }
        nbk0 nbk0Var = new nbk0();
        nbk0 nbk0Var2 = new nbk0();
        y(setJ, arrayList, nbk0Var, new o9z(this, (byte) 0));
        y(eui0.f(setJ, nbk0Var), nbk0Var2, null, new o9z(this, (byte) 1));
        LinkedHashSet linkedHashSetG = eui0.g(setJ, nbk0Var2);
        v7i v7iVar = (v7i) f7uVar.b;
        g950 g950Var3 = g950Var2;
        arrayList.addAll(rcb.h1(g950Var3, linkedHashSetG, arrayList, this.n, gqw0.A1, ((lm50) ((km50) v7iVar.m)).d));
    }

    @Override // a.baz
    public final Set o(cek cekVar) {
        cekVar.getClass();
        if (this.o.f22221a.isAnnotation()) {
            return c();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((ckj) this.e.invoke()).f());
        Collection collectionB = this.n.h().b();
        collectionB.getClass();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            w3d.u(linkedHashSet, ((wsy) it.next()).y().g());
        }
        return linkedHashSet;
    }

    @Override // a.baz
    public final c8z p() {
        wm40 wm40Var = this.n;
        if (wm40Var != null) {
            int i = oek.f25126a;
            return wm40Var.f0();
        }
        oek.a(0);
        throw null;
    }

    @Override // a.baz
    public final vjj q() {
        return this.n;
    }

    @Override // a.baz
    public final boolean r(u9y u9yVar) {
        if (this.o.f22221a.isAnnotation()) {
            return false;
        }
        return L(u9yVar);
    }

    @Override // a.baz
    public final aaz s(vqe0 vqe0Var, ArrayList arrayList, wsy wsyVar, List list) {
        vqe0Var.getClass();
        wsyVar.getClass();
        list.getClass();
        Object obj = this.b.b;
        if (this.n != null) {
            List list2 = Collections.EMPTY_LIST;
            if (list2 != null) {
                return new aaz(wsyVar, list, arrayList, list2);
            }
            jf4.l("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"signatureErrors", "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature", "<init>"});
            return null;
        }
        Object[] objArr = new Object[3];
        switch (1) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = "descriptor";
                break;
            case 6:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        objArr[2] = "resolvePropagatedSignature";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // a.baz
    public final String toString() {
        return "Lazy Java member scope for " + this.o.c();
    }

    public final void v(ArrayList arrayList, p8y p8yVar, int i, vqe0 vqe0Var, wsy wsyVar, wsy wsyVar2) {
        dqe0 nqe0Var;
        f93 f93Var = ujn.c;
        g950 g950VarC = vqe0Var.c();
        if (wsyVar == null) {
            e0t0.a(2);
            throw null;
        }
        tft0 tft0VarH = e0t0.h(wsyVar, false);
        Object defaultValue = vqe0Var.f37852a.getDefaultValue();
        if (defaultValue != null) {
            Class<?> cls = defaultValue.getClass();
            List list = bqe0.f3025a;
            if (Enum.class.isAssignableFrom(cls)) {
                nqe0Var = new rqe0(null, (Enum) defaultValue);
            } else if (defaultValue instanceof Annotation) {
                nqe0Var = new eqe0(null, (Annotation) defaultValue);
            } else if (defaultValue instanceof Object[]) {
                nqe0Var = new fqe0(null, (Object[]) defaultValue);
            } else {
                nqe0Var = defaultValue instanceof Class ? new nqe0(null, (Class) defaultValue) : new tqe0(null, defaultValue);
            }
        } else {
            nqe0Var = null;
        }
        boolean z = nqe0Var != null;
        tft0 tft0VarH2 = wsyVar2 != null ? e0t0.h(wsyVar2, false) : null;
        Object obj = this.b.b;
        arrayList.add(new k3u0(p8yVar, null, i, f93Var, g950VarC, tft0VarH, z, false, false, tft0VarH2, m2a.v(vqe0Var)));
    }

    public final void w(LinkedHashSet linkedHashSet, g950 g950Var, ArrayList arrayList, boolean z) {
        v7i v7iVar = (v7i) this.b.b;
        LinkedHashSet<fyj0> linkedHashSetH1 = rcb.h1(g950Var, arrayList, linkedHashSet, this.n, gqw0.A1, ((lm50) ((km50) v7iVar.m)).d);
        if (!z) {
            linkedHashSet.addAll(linkedHashSetH1);
            return;
        }
        ArrayList arrayListQ0 = CollectionsKt.q0(linkedHashSet, linkedHashSetH1);
        ArrayList arrayList2 = new ArrayList(r3d.q(linkedHashSetH1, 10));
        for (fyj0 fyj0VarA : linkedHashSetH1) {
            fyj0 fyj0Var = (fyj0) x0x.T(fyj0VarA);
            if (fyj0Var != null) {
                fyj0VarA = A(fyj0VarA, fyj0Var, arrayListQ0);
            }
            arrayList2.add(fyj0VarA);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void x(g950 g950Var, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, AbstractSet abstractSet, Function1 function1) {
        fyj0 fyj0VarA;
        Object next;
        fyj0 fyj0Var;
        fyj0 fyj0VarA2;
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            fyj0 fyj0Var2 = (fyj0) it.next();
            fyj0 fyj0Var3 = (fyj0) x0x.S(fyj0Var2);
            fyj0 fyj0Var4 = null;
            if (fyj0Var3 != null) {
                String strR = x0x.R(fyj0Var3);
                strR.getClass();
                Iterator it2 = ((Collection) function1.invoke(g950.e(strR))).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        fyj0VarA = null;
                        break;
                    }
                    ler lerVarG0 = ((fyj0) it2.next()).g0();
                    lerVarG0.q(g950Var);
                    lerVarG0.u();
                    lerVarG0.l();
                    mer merVarBuild = lerVarG0.build();
                    merVarBuild.getClass();
                    fyj0 fyj0Var5 = (fyj0) merVarBuild;
                    if (E(fyj0Var3, fyj0Var5)) {
                        fyj0VarA = A(fyj0Var5, fyj0Var3, linkedHashSet);
                        break;
                    }
                }
            } else {
                fyj0VarA = null;
                break;
            }
            if (fyj0VarA != null) {
                abstractSet.add(fyj0VarA);
            }
            mer merVarA = kd9.a(fyj0Var2);
            if (merVarA == 0) {
                fyj0VarA2 = null;
            } else {
                g950 name = ((wjj) merVarA).getName();
                name.getClass();
                Iterator it3 = ((Iterable) function1.invoke(name)).iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!K((fyj0) next, merVarA));
                fyj0 fyj0Var6 = (fyj0) next;
                if (fyj0Var6 != null) {
                    ler lerVarG1 = fyj0Var6.g0();
                    List listZ = merVarA.z();
                    listZ.getClass();
                    ArrayList arrayList = new ArrayList(r3d.q(listZ, 10));
                    Iterator it4 = listZ.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(((k3u0) it4.next()).getType());
                    }
                    List listZ2 = fyj0Var6.z();
                    listZ2.getClass();
                    lerVarG1.a(pvm0.o(arrayList, listZ2, merVarA));
                    lerVarG1.u();
                    lerVarG1.l();
                    lerVarG1.m();
                    fyj0Var = (fyj0) lerVarG1.build();
                } else {
                    fyj0Var = null;
                }
                if (fyj0Var == null) {
                    fyj0VarA2 = null;
                } else {
                    if (!L(fyj0Var)) {
                        fyj0Var = null;
                    }
                    if (fyj0Var != null) {
                        fyj0VarA2 = A(fyj0Var, merVarA, linkedHashSet);
                    } else {
                        fyj0VarA2 = null;
                    }
                }
            }
            if (fyj0VarA2 != null) {
                abstractSet.add(fyj0VarA2);
            }
            if (fyj0Var2.isSuspend()) {
                g950 name2 = fyj0Var2.getName();
                name2.getClass();
                Iterator it5 = ((Iterable) function1.invoke(name2)).iterator();
                while (it5.hasNext()) {
                    fyj0 fyj0VarB = B((fyj0) it5.next());
                    if (fyj0VarB == null || !D(fyj0VarB, fyj0Var2)) {
                        fyj0VarB = null;
                    }
                    if (fyj0VarB != null) {
                        fyj0Var4 = fyj0VarB;
                        break;
                    }
                }
            }
            if (fyj0Var4 != null) {
                abstractSet.add(fyj0Var4);
            }
        }
    }

    public final void y(Set set, AbstractCollection abstractCollection, nbk0 nbk0Var, Function1 function1) {
        fyj0 fyj0VarH;
        n0d0 n0d0VarU;
        c9y c9yVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            d0d0 d0d0Var = (d0d0) it.next();
            if (C(d0d0Var, function1)) {
                fyj0 fyj0VarG = G(d0d0Var, function1);
                fyj0VarG.getClass();
                if (d0d0Var.E()) {
                    fyj0VarH = H(d0d0Var, function1);
                    fyj0VarH.getClass();
                } else {
                    fyj0VarH = null;
                }
                if (fyj0VarH != null) {
                    fyj0VarH.m();
                    fyj0VarG.m();
                }
                wm40 wm40Var = this.n;
                wm40Var.getClass();
                c9y c9yVar2 = new c9y(wm40Var, ujn.c, fyj0VarG.m(), fyj0VarG.getVisibility(), fyj0VarH != null, d0d0Var.getName(), fyj0VarG.b(), null, 1, false, null);
                wsy wsyVar = fyj0VarG.h;
                wsyVar.getClass();
                iun iunVar = iun.f15405a;
                c9yVar2.w1(wsyVar, iunVar, p(), null, iunVar);
                g0d0 g0d0VarT = obb.T(c9yVar2, fyj0VarG.getAnnotations(), false, fyj0VarG.b());
                g0d0VarT.m = fyj0VarG;
                g0d0VarT.s1(c9yVar2.getType());
                if (fyj0VarH != null) {
                    List listZ = fyj0VarH.z();
                    listZ.getClass();
                    k3u0 k3u0Var = (k3u0) CollectionsKt.firstOrNull(listZ);
                    if (k3u0Var == null) {
                        hny.n(fyj0VarH, "No parameter found for ");
                        return;
                    } else {
                        n0d0VarU = obb.U(c9yVar2, fyj0VarH.getAnnotations(), k3u0Var.getAnnotations(), false, fyj0VarH.getVisibility(), fyj0VarH.b());
                        n0d0VarU.m = fyj0VarH;
                    }
                } else {
                    n0d0VarU = null;
                }
                c9yVar2.t1(g0d0VarT, n0d0VarU, null, null);
                c9yVar = c9yVar2;
            } else {
                c9yVar = null;
            }
            if (c9yVar != null) {
                abstractCollection.add(c9yVar);
                if (nbk0Var != null) {
                    nbk0Var.add(d0d0Var);
                    return;
                }
                return;
            }
        }
    }

    public final Collection z() {
        boolean z = this.p;
        wm40 wm40Var = this.n;
        if (z) {
            Collection collectionB = wm40Var.h().b();
            collectionB.getClass();
            return collectionB;
        }
        Object obj = this.b.b;
        wm40Var.getClass();
        Collection collectionB2 = wm40Var.h().b();
        collectionB2.getClass();
        return collectionB2;
    }
}
