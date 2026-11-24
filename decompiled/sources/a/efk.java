package a;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
public final class efk extends i1 {
    public final /* synthetic */ byte c = 0;
    public final cu00 d;
    public final /* synthetic */ h1 e;

    /* JADX WARN: Illegal instructions before constructor call */
    public efk(ffk ffkVar) {
        this.e = ffkVar;
        g45 g45Var = ffkVar.l;
        super((eu00) ((f6i) g45Var.f10647a).e);
        eu00 eu00Var = (eu00) ((f6i) g45Var.f10647a).e;
        yek yekVar = new yek(ffkVar, (byte) 6);
        eu00Var.getClass();
        this.d = new cu00(eu00Var, yekVar);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x023d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0251  */
    /* JADX WARN: Code duplicated, block: B:106:0x0254  */
    /* JADX WARN: Code duplicated, block: B:108:0x0259  */
    /* JADX WARN: Code duplicated, block: B:111:0x0262  */
    /* JADX WARN: Code duplicated, block: B:114:0x0277 A[LOOP:1: B:112:0x0271->B:114:0x0277, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x0298  */
    /* JADX WARN: Code duplicated, block: B:118:0x029e  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:162:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:59:0x0110  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:87:0x020c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0219  */
    /* JADX WARN: Code duplicated, block: B:93:0x0222  */
    /* JADX WARN: Code duplicated, block: B:94:0x0227  */
    @Override // a.r5
    public final Collection a() throws Throwable {
        String strB;
        swq swqVarA;
        Collection<oqe0> collection;
        String str;
        swq swqVar;
        swq swqVar2;
        ArrayList arrayList;
        kzj0 kzj0VarF0;
        wm40 wm40Var;
        wsy wsyVarH;
        ArrayList arrayList2;
        wsy wsyVarV;
        wsy wsyVar;
        iys0 iys0VarS;
        iys0 iys0VarS2;
        byte b = this.c;
        h1 h1Var = this.e;
        switch (b) {
            case 0:
                ffk ffkVar = (ffk) h1Var;
                s2d0 s2d0Var = ffkVar.e;
                g45 g45Var = ffkVar.l;
                List listK0 = m8x.k0(s2d0Var, (roi0) g45Var.d);
                ArrayList arrayList3 = new ArrayList(r3d.q(listK0, 10));
                Iterator it = listK0.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((qgd) g45Var.h).d0((a4d0) it.next()));
                }
                ArrayList arrayListQ0 = CollectionsKt.q0(arrayList3, ((fx) ((f6i) g45Var.f10647a).p).d(ffkVar));
                ArrayList<m660> arrayList4 = new ArrayList();
                Iterator it2 = arrayListQ0.iterator();
                while (it2.hasNext()) {
                    foc focVarN = ((wsy) it2.next()).S().n();
                    m660 m660Var = focVarN instanceof m660 ? (m660) focVarN : null;
                    if (m660Var != null) {
                        arrayList4.add(m660Var);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    q1o q1oVar = (q1o) ((f6i) g45Var.f10647a).j;
                    ArrayList arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
                    for (m660 m660Var2 : arrayList4) {
                        qlc qlcVarF = rek.f(m660Var2);
                        if (qlcVarF == null || (swqVarA = qlcVarF.a()) == null || (strB = swqVarA.f32934a.f34663a) == null) {
                            strB = m660Var2.getName().b();
                            strB.getClass();
                        }
                        arrayList5.add(strB);
                    }
                    q1oVar.o(ffkVar, arrayList5);
                }
                return CollectionsKt.L0(arrayListQ0);
            default:
                l9z l9zVar = (l9z) h1Var;
                f7u f7uVar = l9zVar.j;
                Class cls = l9zVar.h.f22221a;
                if (Intrinsics.d(cls, Object.class)) {
                    collection = iun.f15405a;
                } else {
                    jdg0 jdg0Var = new jdg0(2);
                    Type genericSuperclass = cls.getGenericSuperclass();
                    jdg0Var.a(genericSuperclass != null ? genericSuperclass : Object.class);
                    jdg0Var.b(cls.getGenericInterfaces());
                    ArrayList arrayList6 = jdg0Var.b;
                    List listJ = q3d.j(arrayList6.toArray(new Type[arrayList6.size()]));
                    ArrayList arrayList7 = new ArrayList(r3d.q(listJ, 10));
                    Iterator it3 = listJ.iterator();
                    while (it3.hasNext()) {
                        arrayList7.add(new oqe0((Type) it3.next()));
                    }
                    collection = arrayList7;
                }
                ArrayList arrayList8 = new ArrayList(collection.size());
                ArrayList<zqe0> arrayList9 = new ArrayList(0);
                j9z j9zVar = l9zVar.u;
                swq swqVar3 = bey.p;
                swqVar3.getClass();
                t83 t83VarO0 = j9zVar.O0(swqVar3);
                if (t83VarO0 == null) {
                    swqVar = null;
                } else {
                    Object objW0 = CollectionsKt.w0(t83VarO0.c().values());
                    htm0 htm0Var = objW0 instanceof htm0 ? (htm0) objW0 : null;
                    if (htm0Var == null || (str = (String) htm0Var.f29728a) == null) {
                        swqVar = null;
                    } else {
                        j7m0 j7m0Var = j7m0.f16049a;
                        int length = str.length();
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                char cCharAt = str.charAt(i);
                                int iOrdinal = j7m0Var.ordinal();
                                if (iOrdinal == 0) {
                                    if (!Character.isJavaIdentifierStart(cCharAt)) {
                                        j7m0Var = j7m0.b;
                                        i++;
                                    }
                                } else if (iOrdinal != 1) {
                                    if (iOrdinal != 2) {
                                        t9f.b();
                                        return null;
                                    }
                                    if (!Character.isJavaIdentifierStart(cCharAt)) {
                                        j7m0Var = j7m0.b;
                                        i++;
                                    }
                                } else {
                                    if (cCharAt == '.') {
                                        j7m0Var = j7m0.c;
                                    } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                                    }
                                    i++;
                                }
                            } else if (j7m0Var != j7m0.c) {
                                swqVar = new swq(str);
                            }
                            swqVar = null;
                        }
                    }
                }
                if (swqVar != null) {
                    twq twqVar = swqVar.f32934a;
                    if (twqVar.c()) {
                        swqVar = null;
                    } else {
                        g950 g950Var = j4m0.k;
                        g950Var.getClass();
                        if (!twqVar.h(g950Var)) {
                            swqVar = null;
                        }
                    }
                } else {
                    swqVar = null;
                }
                if (swqVar == null) {
                    LinkedHashMap linkedHashMap = uwo.f36403a;
                    swqVar2 = (swq) uwo.b.get(rek.g(l9zVar));
                    if (swqVar2 == null) {
                        kzj0VarF0 = null;
                    }
                    for (oqe0 oqe0Var : collection) {
                        wsyVarV = ((nvu) f7uVar.e).V(oqe0Var, xvw.Y(b0t0.f1776a, false, null, 7));
                        Object obj = f7uVar.b;
                        wsyVar = (wsy) tqt.b(wsyVarV.j0(), new huj0(null, false, f7uVar, x83.TYPE_USE, true).L(wsyVarV, iun.f15405a, null, false), 0, true).c;
                        if (wsyVar != null) {
                            wsyVarV = wsyVar;
                        }
                        if (wsyVarV.S().n() instanceof m660) {
                            arrayList9.add(oqe0Var);
                        }
                        iys0VarS = wsyVarV.S();
                        if (kzj0VarF0 != null) {
                            iys0VarS2 = kzj0VarF0.S();
                        } else {
                            iys0VarS2 = null;
                        }
                        if (!Intrinsics.d(iys0VarS, iys0VarS2) && !ary.y(wsyVarV)) {
                            arrayList8.add(wsyVarV);
                        }
                    }
                    wm40Var = l9zVar.i;
                    if (wm40Var != null) {
                        wsyVarH = new xzs0(e9x.K(wm40Var, l9zVar)).h(wm40Var.I(), t3u0.c);
                    } else {
                        wsyVarH = null;
                    }
                    if (wsyVarH != null) {
                        arrayList8.add(wsyVarH);
                    }
                    if (kzj0VarF0 != null) {
                        arrayList8.add(kzj0VarF0);
                    }
                    if (!arrayList9.isEmpty()) {
                        return !arrayList8.isEmpty() ? CollectionsKt.L0(arrayList8) : kotlin.collections.a.c(((zm40) ((v7i) f7uVar.b).j).e.e());
                    }
                    Object obj2 = f7uVar.b;
                    arrayList2 = new ArrayList(r3d.q(arrayList9, 10));
                    for (zqe0 zqe0Var : arrayList9) {
                        zqe0Var.getClass();
                        arrayList2.add(((oqe0) zqe0Var).f25684a.toString());
                    }
                    e9d0.k("Incomplete hierarchy for class ", l9zVar.getName(), ", unresolved classes ", arrayList2);
                    return null;
                }
                swqVar2 = swqVar;
                twq twqVar2 = swqVar2.f32934a;
                zm40 zm40Var = (zm40) ((v7i) f7uVar.b).j;
                ux50 ux50Var = ux50.h;
                int i2 = rek.f30339a;
                twqVar2.c();
                foc focVarD = zm40Var.c0(swqVar2.b()).h.d(twqVar2.g(), ux50Var);
                wm40 wm40Var2 = focVarD instanceof wm40 ? (wm40) focVarD : null;
                if (wm40Var2 == null) {
                    kzj0VarF0 = null;
                } else {
                    int size = wm40Var2.h().getParameters().size();
                    List parameters = l9zVar.p.getParameters();
                    parameters.getClass();
                    int size2 = parameters.size();
                    if (size2 == size) {
                        arrayList = new ArrayList(r3d.q(parameters, 10));
                        Iterator it4 = parameters.iterator();
                        while (it4.hasNext()) {
                            arrayList.add(new q4m0(((hzs0) it4.next()).I(), t3u0.c));
                        }
                    } else if (size2 == 1 && size > 1 && swqVar == null) {
                        q4m0 q4m0Var = new q4m0(((hzs0) CollectionsKt.v0(parameters)).I(), t3u0.c);
                        IntRange intRange = new IntRange(1, size, 1);
                        arrayList = new ArrayList(r3d.q(intRange, 10));
                        Iterator it5 = intRange.iterator();
                        while (((kkx) it5).c) {
                            ((bkx) it5).nextInt();
                            arrayList.add(q4m0Var);
                        }
                    } else {
                        kzj0VarF0 = null;
                    }
                    ays0.b.getClass();
                    kzj0VarF0 = ucx.f0(ays0.c, wm40Var2, arrayList);
                }
                while (r0.hasNext()) {
                    wsyVarV = ((nvu) f7uVar.e).V(oqe0Var, xvw.Y(b0t0.f1776a, false, null, 7));
                    Object obj3 = f7uVar.b;
                    wsyVar = (wsy) tqt.b(wsyVarV.j0(), new huj0(null, false, f7uVar, x83.TYPE_USE, true).L(wsyVarV, iun.f15405a, null, false), 0, true).c;
                    if (wsyVar != null) {
                        wsyVarV = wsyVar;
                    }
                    if (wsyVarV.S().n() instanceof m660) {
                        arrayList9.add(oqe0Var);
                    }
                    iys0VarS = wsyVarV.S();
                    if (kzj0VarF0 != null) {
                        iys0VarS2 = kzj0VarF0.S();
                    } else {
                        iys0VarS2 = null;
                    }
                    if (!Intrinsics.d(iys0VarS, iys0VarS2)) {
                        arrayList8.add(wsyVarV);
                    }
                }
                wm40Var = l9zVar.i;
                if (wm40Var != null) {
                    wsyVarH = new xzs0(e9x.K(wm40Var, l9zVar)).h(wm40Var.I(), t3u0.c);
                } else {
                    wsyVarH = null;
                }
                if (wsyVarH != null) {
                    arrayList8.add(wsyVarH);
                }
                if (kzj0VarF0 != null) {
                    arrayList8.add(kzj0VarF0);
                }
                if (!arrayList9.isEmpty()) {
                    if (!arrayList8.isEmpty()) {
                    }
                }
                Object obj4 = f7uVar.b;
                arrayList2 = new ArrayList(r3d.q(arrayList9, 10));
                while (r1.hasNext()) {
                    zqe0Var.getClass();
                    arrayList2.add(((oqe0) zqe0Var).f25684a.toString());
                }
                e9d0.k("Incomplete hierarchy for class ", l9zVar.getName(), ", unresolved classes ", arrayList2);
                return null;
        }
    }

    @Override // a.r5
    public final gfk0 e() {
        switch (this.c) {
            case 0:
                break;
            default:
                Object obj = ((l9z) this.e).j.b;
                break;
        }
        return gfk0.c;
    }

    @Override // a.iys0
    public final List getParameters() {
        switch (this.c) {
            case 0:
                break;
        }
        return (List) this.d.invoke();
    }

    @Override // a.i1
    /* JADX INFO: renamed from: k */
    public final wm40 n() {
        byte b = this.c;
        h1 h1Var = this.e;
        switch (b) {
            case 0:
                return (ffk) h1Var;
            default:
                return (l9z) h1Var;
        }
    }

    @Override // a.iys0
    public final foc n() {
        byte b = this.c;
        h1 h1Var = this.e;
        switch (b) {
            case 0:
                return (ffk) h1Var;
            default:
                return (l9z) h1Var;
        }
    }

    @Override // a.iys0
    public final boolean p() {
        switch (this.c) {
        }
        return true;
    }

    public final String toString() {
        byte b = this.c;
        h1 h1Var = this.e;
        switch (b) {
            case 0:
                String str = ((ffk) h1Var).getName().f10896a;
                str.getClass();
                return str;
            default:
                String strB = ((l9z) h1Var).getName().b();
                strB.getClass();
                return strB;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public efk(l9z l9zVar) {
        this.e = l9zVar;
        f7u f7uVar = l9zVar.j;
        super((eu00) ((v7i) f7uVar.b).i);
        this.d = new cu00((eu00) ((v7i) f7uVar.b).i, new k9z(l9zVar, (byte) 2));
    }
}
