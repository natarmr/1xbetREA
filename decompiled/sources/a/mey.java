package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class mey implements fx, qv90 {
    public static final /* synthetic */ iiy[] h = {new j0d0(mey.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0), new j0d0(mey.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0), new j0d0(mey.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ym40 f21670a;
    public final cu00 b;
    public final kzj0 c;
    public final cu00 d;
    public final zt00 e;
    public final cu00 f;
    public final zt00 g;

    public mey(zm40 zm40Var, eu00 eu00Var, aaw aawVar) {
        zm40Var.getClass();
        this.f21670a = zm40Var;
        this.b = new cu00(eu00Var, aawVar);
        llc llcVar = new llc(new nun(zm40Var, new swq("java.io"), (byte) 1), g950.e("Serializable"), gm40.e, slc.b, kotlin.collections.a.c(new zez(eu00Var, new key(this, (byte) 1))), eu00Var);
        llcVar.u0(br30.b, xun.f41520a, null);
        this.c = llcVar.I();
        this.d = new cu00(eu00Var, new nsr((Object) this, (Object) eu00Var, (byte) 18));
        byte b = 0;
        this.e = new zt00(eu00Var, new ConcurrentHashMap(3, 1.0f, 2), new pnk0((byte) 19), b);
        this.f = new cu00(eu00Var, new key(this, b));
        this.g = eu00Var.c(new w0((Object) this, (byte) 27));
    }

    @Override // a.fx
    public final Collection a(wm40 wm40Var) throws wzs0 {
        twq twqVarF;
        hfk0 hfk0Var = hfk0.f;
        if (wm40Var.r() != slc.f32392a) {
            return iun.f15405a;
        }
        e().getClass();
        l9z l9zVarB = b(wm40Var);
        if (l9zVarB == null) {
            return iun.f15405a;
        }
        swq swqVarG = rek.g(l9zVarB);
        vwo vwoVar = vwo.f;
        vwoVar.getClass();
        String str = bay.f2281a;
        qlc qlcVarG = bay.g(swqVarG);
        wm40 wm40VarJ = qlcVarG != null ? vwoVar.j(qlcVarG.a()) : null;
        if (wm40VarJ == null) {
            return iun.f15405a;
        }
        xzs0 xzs0Var = new xzs0(e9x.K(wm40VarJ, l9zVarB));
        List list = (List) l9zVarB.q.q.invoke();
        ArrayList<flc> arrayList = new ArrayList();
        for (Object obj : list) {
            flc flcVar = (flc) obj;
            if (flcVar.getVisibility().f33825a.b) {
                Collection collectionG = wm40VarJ.g();
                collectionG.getClass();
                Collection collection = collectionG;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            flc flcVar2 = (flc) it.next();
                            flcVar2.getClass();
                            if (sf80.j(flcVar2, flcVar.f(xzs0Var)) == 1) {
                            }
                        }
                    }
                }
                if (flcVar.z().size() == 1) {
                    List listZ = flcVar.z();
                    listZ.getClass();
                    foc focVarN = ((k3u0) CollectionsKt.v0(listZ)).getType().S().n();
                    if (focVarN != null) {
                        int i = rek.f30339a;
                        twqVarF = oek.f(focVarN);
                        twqVarF.getClass();
                    } else {
                        twqVarF = null;
                    }
                    twq twqVarF2 = oek.f(wm40Var);
                    twqVarF2.getClass();
                    if (Intrinsics.d(twqVarF, twqVarF2)) {
                    }
                }
                if (!ary.D(flcVar)) {
                    LinkedHashSet linkedHashSet = pey.f;
                    String strW = m7x.w(flcVar, 3);
                    String str2 = bay.f2281a;
                    qlc qlcVarH = bay.h(rek.g(l9zVarB).f32934a);
                    if (!linkedHashSet.contains((qlcVarH != null ? rey.b(qlcVarH) : lmc.F(l9zVarB, hfk0Var)) + '.' + strW)) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (flc flcVar3 : arrayList) {
            flcVar3.getClass();
            ner nerVarU1 = flcVar3.u1(xzs0.b);
            nerVarU1.b = wm40Var;
            nerVarU1.t(wm40Var.I());
            nerVarU1.o = true;
            nerVarU1.f23400a = xzs0Var.f41769a;
            LinkedHashSet linkedHashSet2 = pey.g;
            String strW2 = m7x.w(flcVar3, 3);
            String str3 = bay.f2281a;
            qlc qlcVarH2 = bay.h(rek.g(l9zVarB).f32934a);
            if (!linkedHashSet2.contains((qlcVarH2 != null ? rey.b(qlcVarH2) : lmc.F(l9zVarB, hfk0Var)) + '.' + strW2)) {
                nerVarU1.o((g93) yqm0.s(this.f, h[2]));
            }
            oer oerVarR1 = nerVarU1.x.r1(nerVarU1);
            oerVarR1.getClass();
            arrayList2.add((flc) oerVarR1);
        }
        return arrayList2;
    }

    public final l9z b(wm40 wm40Var) {
        swq swqVarA;
        if (wm40Var == null) {
            ary.a(108);
            throw null;
        }
        if (!ary.b(wm40Var, i4m0.f14153a) && ary.K(wm40Var)) {
            int i = rek.f30339a;
            twq twqVarF = oek.f(wm40Var);
            twqVarF.getClass();
            if (twqVarF.d()) {
                String str = bay.f2281a;
                qlc qlcVarH = bay.h(twqVarF);
                if (qlcVarH != null && (swqVarA = qlcVarH.a()) != null) {
                    zm40 zm40Var = e().f14659a;
                    ux50 ux50Var = ux50.f36425a;
                    wm40 wm40VarE0 = feb.e0(zm40Var, swqVarA);
                    if (wm40VarE0 instanceof l9z) {
                        return (l9z) wm40VarE0;
                    }
                }
            }
        }
        return null;
    }

    @Override // a.fx
    public final Collection c(g950 g950Var, wm40 wm40Var) throws Throwable {
        Set setB;
        Iterable<fyj0> iterable;
        boolean zBooleanValue;
        fyj0 fyj0Var;
        g93 g93Var;
        wm40Var.getClass();
        boolean zEquals = g950Var.equals(tuc.e);
        iiy[] iiyVarArr = h;
        if (zEquals && (wm40Var instanceof ffk) && (ary.b(wm40Var, i4m0.g) || ary.s(wm40Var) != null)) {
            ffk ffkVar = (ffk) wm40Var;
            List list = ffkVar.e.q;
            list.getClass();
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (ydx.L((h950) ffkVar.l.b, ((i3d0) it.next()).f).equals(tuc.e)) {
                        return iun.f15405a;
                    }
                }
            }
            ler lerVarG0 = ((fyj0) CollectionsKt.u0(((kzj0) yqm0.s(this.d, iiyVarArr[1])).y().a(g950Var, ux50.f36425a))).g0();
            lerVarG0.h(ffkVar);
            lerVarG0.k(uek.e);
            lerVarG0.t(ffkVar.I());
            lerVarG0.b(ffkVar.f0());
            mer merVarBuild = lerVarG0.build();
            merVarBuild.getClass();
            return kotlin.collections.a.c((fyj0) merVarBuild);
        }
        e().getClass();
        l9z l9zVarB = b(wm40Var);
        if (l9zVarB == null) {
            iterable = iun.f15405a;
        } else {
            swq swqVarG = rek.g(l9zVarB);
            vwo vwoVar = vwo.f;
            vwoVar.getClass();
            String str = bay.f2281a;
            qlc qlcVarG = bay.g(swqVarG);
            wm40 wm40VarJ = qlcVarG != null ? vwoVar.j(qlcVarG.a()) : null;
            if (wm40VarJ == null) {
                setB = xun.f41520a;
            } else {
                twq twqVarF = oek.f(wm40VarJ);
                twqVarF.getClass();
                swq swqVar = (swq) bay.k.get(twqVarF);
                setB = swqVar == null ? cui0.b(wm40VarJ) : q3d.j(wm40VarJ, vwoVar.j(swqVar));
            }
            Iterable iterable2 = setB;
            wm40 wm40Var2 = (wm40) CollectionsKt.e0(iterable2);
            if (wm40Var2 == null) {
                iterable = iun.f15405a;
            } else {
                int i = nbk0.c;
                ArrayList arrayList = new ArrayList(r3d.q(iterable2, 10));
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(rek.g((wm40) it2.next()));
                }
                nbk0 nbk0Var = new nbk0();
                nbk0Var.addAll(arrayList);
                String str2 = bay.f2281a;
                boolean zContainsKey = bay.j.containsKey(oek.f(wm40Var));
                swq swqVarG2 = rek.g(l9zVarB);
                nsr nsrVar = new nsr((Object) l9zVarB, (Object) wm40Var2, (byte) 19);
                zt00 zt00Var = this.e;
                zt00Var.getClass();
                Object objInvoke = zt00Var.invoke(new au00(swqVarG2, nsrVar));
                if (objInvoke == null) {
                    zt00.a(3);
                    throw null;
                }
                cr30 cr30VarK0 = ((wm40) objInvoke).k0();
                cr30VarK0.getClass();
                Collection collectionA = cr30VarK0.a(g950Var, ux50.f36425a);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionA) {
                    fyj0 fyj0Var2 = (fyj0) obj;
                    if (fyj0Var2.l() == 1 && fyj0Var2.getVisibility().f33825a.b && !ary.D(fyj0Var2)) {
                        Collection collectionK = fyj0Var2.k();
                        if (!(collectionK instanceof Collection) || !collectionK.isEmpty()) {
                            Iterator it3 = collectionK.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    vjj vjjVarJ = ((mer) it3.next()).j();
                                    vjjVarJ.getClass();
                                    if (nbk0Var.contains(rek.g(vjjVarJ))) {
                                    }
                                }
                            }
                        }
                        vjj vjjVarJ2 = fyj0Var2.j();
                        vjjVarJ2.getClass();
                        wm40 wm40Var3 = (wm40) vjjVarJ2;
                        String strW = m7x.w(fyj0Var2, 3);
                        LinkedHashSet linkedHashSet = pey.e;
                        String str3 = bay.f2281a;
                        qlc qlcVarH = bay.h(rek.g(wm40Var3).f32934a);
                        if (linkedHashSet.contains((qlcVarH != null ? rey.b(qlcVarH) : lmc.F(wm40Var3, hfk0.f)) + '.' + strW) ^ zContainsKey) {
                            zBooleanValue = true;
                        } else {
                            Boolean boolT = ntb.T(kotlin.collections.a.c(fyj0Var2), ujn.q, new pnk0(this, (byte) 18));
                            boolT.getClass();
                            zBooleanValue = boolT.booleanValue();
                        }
                        if (!zBooleanValue) {
                            arrayList2.add(obj);
                        }
                    }
                }
                iterable = arrayList2;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (fyj0 fyj0Var3 : iterable) {
            vjj vjjVarJ3 = fyj0Var3.j();
            vjjVarJ3.getClass();
            mer merVarF = fyj0Var3.f(new xzs0(e9x.K((wm40) vjjVarJ3, wm40Var)));
            merVarF.getClass();
            ler lerVarG1 = ((fyj0) merVarF).g0();
            lerVarG1.h(wm40Var);
            lerVarG1.b(wm40Var.f0());
            lerVarG1.l();
            vjj vjjVarJ4 = fyj0Var3.j();
            vjjVarJ4.getClass();
            Object objH = ntb.H(kotlin.collections.a.c((wm40) vjjVarJ4), new onv(this), new ryh(m7x.w(fyj0Var3, 3), new mie0(), (byte) 2));
            objH.getClass();
            int iOrdinal = ((ley) objH).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        g950 name = fyj0Var3.getName();
                        boolean zD = Intrinsics.d(name, ney.f23410a);
                        zt00 zt00Var2 = this.g;
                        if (zD) {
                            g93Var = (g93) zt00Var2.invoke(new Pair(fyj0Var3.getName().b(), "first"));
                        } else {
                            if (!Intrinsics.d(name, ney.b)) {
                                e9d0.x(fyj0Var3.getName(), "Unexpected name: ");
                                return null;
                            }
                            g93Var = (g93) zt00Var2.invoke(new Pair(fyj0Var3.getName().b(), "last"));
                        }
                        lerVarG1.o(g93Var);
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            t9f.b();
                            return null;
                        }
                        fyj0Var = null;
                    } else {
                        lerVarG1.o((g93) yqm0.s(this.f, iiyVarArr[2]));
                    }
                }
                mer merVarBuild2 = lerVarG1.build();
                merVarBuild2.getClass();
                fyj0Var = (fyj0) merVarBuild2;
            } else if (wm40Var.m() != gm40.b || wm40Var.r() == slc.c) {
                lerVarG1.g();
                mer merVarBuild3 = lerVarG1.build();
                merVarBuild3.getClass();
                fyj0Var = (fyj0) merVarBuild3;
            } else {
                fyj0Var = null;
            }
            if (fyj0Var != null) {
                arrayList3.add(fyj0Var);
            }
        }
        return arrayList3;
    }

    @Override // a.fx
    public final Collection d(wm40 wm40Var) {
        int i = rek.f30339a;
        twq twqVarF = oek.f(wm40Var);
        twqVarF.getClass();
        LinkedHashSet linkedHashSet = pey.f26874a;
        twq twqVar = i4m0.g;
        boolean zEquals = twqVarF.equals(twqVar);
        boolean zIsAssignableFrom = false;
        kzj0 kzj0Var = this.c;
        if (!zEquals) {
            HashMap map = i4m0.g0;
            if (map.get(twqVarF) == null) {
                if (twqVarF.equals(twqVar) || map.get(twqVarF) != null) {
                    zIsAssignableFrom = true;
                } else {
                    String str = bay.f2281a;
                    qlc qlcVarH = bay.h(twqVarF);
                    if (qlcVarH != null) {
                        try {
                            zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(qlcVarH.a().f32934a.f34663a));
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                }
                return zIsAssignableFrom ? kotlin.collections.a.c(kzj0Var) : iun.f15405a;
            }
        }
        return q3d.j((kzj0) yqm0.s(this.d, h[1]), kzj0Var);
    }

    public final iey e() {
        return (iey) yqm0.s(this.b, h[0]);
    }

    @Override // a.qv90
    public final boolean f(wm40 wm40Var, sfk sfkVar) {
        wm40Var.getClass();
        l9z l9zVarB = b(wm40Var);
        if (l9zVarB == null || !sfkVar.getAnnotations().z0(rv90.f31158a)) {
            return true;
        }
        e().getClass();
        String strW = m7x.w(sfkVar, 3);
        p9z p9zVarU0 = l9zVarB.u0();
        g950 name = sfkVar.getName();
        name.getClass();
        Collection collectionA = p9zVarU0.a(name, ux50.f36425a);
        if ((collectionA instanceof Collection) && collectionA.isEmpty()) {
            return false;
        }
        Iterator it = collectionA.iterator();
        while (it.hasNext()) {
            if (m7x.w((fyj0) it.next(), 3).equals(strW)) {
                return true;
            }
        }
        return false;
    }

    @Override // a.fx
    public final Collection g(wm40 wm40Var) {
        Set setC;
        wm40Var.getClass();
        e().getClass();
        l9z l9zVarB = b(wm40Var);
        if (l9zVarB == null || (setC = l9zVarB.u0().c()) == null) {
            setC = xun.f41520a;
        }
        return setC;
    }
}
