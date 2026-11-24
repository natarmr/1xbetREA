package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class tai0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm40 f33613a;
    public final boolean b;
    public final e7z c;
    public final nai0 d;
    public tai0 e;
    public final int f;

    public tai0(lm40 lm40Var, boolean z, e7z e7zVar, nai0 nai0Var) {
        this.f33613a = lm40Var;
        this.b = z;
        this.c = e7zVar;
        this.d = nai0Var;
        this.f = e7zVar.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final jge0 a(s460 s460Var) {
        ?? V;
        tai0 tai0VarL = l();
        if (tai0VarL == null) {
            return jge0.e;
        }
        lm40 lm40Var = (lm40) tai0VarL.c.h1.g;
        if ((lm40Var.d & 8) == 0) {
            V = 0;
            break;
        }
        loop0: while (true) {
            if (lm40Var != null) {
                if ((lm40Var.c & 8) != 0) {
                    V = lm40Var;
                    ?? xz40Var = 0;
                    while (V != 0) {
                        if (V instanceof qai0) {
                            if (((qai0) V).e()) {
                                break loop0;
                            }
                        } else if ((V.c & 8) != 0 && (V instanceof f3k)) {
                            lm40 lm40Var2 = ((f3k) V).p;
                            int i = 0;
                            V = V;
                            xz40Var = xz40Var;
                            while (lm40Var2 != null) {
                                if ((lm40Var2.c & 8) != 0) {
                                    i++;
                                    xz40Var = xz40Var;
                                    if (i == 1) {
                                        V = lm40Var2;
                                    } else {
                                        if (xz40Var == 0) {
                                            xz40Var = new xz40(new lm40[16]);
                                        }
                                        if (V != 0) {
                                            xz40Var.b(V);
                                            V = 0;
                                        }
                                        xz40Var.b(lm40Var2);
                                    }
                                }
                                lm40Var2 = lm40Var2.f;
                                V = V;
                                xz40Var = xz40Var;
                            }
                            if (i == 1) {
                            }
                        }
                        V = vcc.V(xz40Var);
                    }
                }
                if ((lm40Var.d & 8) != 0) {
                    lm40Var = lm40Var.f;
                }
            }
            V = 0;
            break;
        }
        qai0 qai0Var = (qai0) V;
        s460 s460VarX = qai0Var != null ? vcc.X(qai0Var, 8) : null;
        return s460VarX == null ? tai0VarL.a(s460Var) : s460VarX.w(s460Var, true);
    }

    public final tai0 b(ucg0 ucg0Var, Function1 function1) {
        nai0 nai0Var = new nai0();
        nai0Var.c = false;
        nai0Var.d = false;
        function1.invoke(nai0Var);
        tai0 tai0Var = new tai0(new sai0(function1), false, new e7z(true, this.f + (ucg0Var != null ? 1000000000 : 2000000000)), nai0Var);
        tai0Var.e = this;
        return tai0Var;
    }

    public final void c(e7z e7zVar, ArrayList arrayList) {
        xz40 xz40VarZ = e7zVar.z();
        Object[] objArr = xz40VarZ.f41739a;
        int i = xz40VarZ.c;
        for (int i2 = 0; i2 < i; i2++) {
            e7z e7zVar2 = (e7z) objArr[i2];
            if (e7zVar2.I() && !e7zVar2.s1) {
                if (e7zVar2.h1.j(8)) {
                    arrayList.add(x0x.o(e7zVar2, this.b));
                } else {
                    c(e7zVar2, arrayList);
                }
            }
        }
    }

    public final s460 d() {
        if (!n()) {
            qai0 qai0VarF = f();
            return qai0VarF != null ? vcc.X(qai0VarF, 8) : (rdx) this.c.h1.d;
        }
        tai0 tai0VarL = l();
        if (tai0VarL != null) {
            return tai0VarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            tai0 tai0Var = (tai0) arrayList.get(size2);
            if (tai0Var.o()) {
                arrayList2.add(tai0Var);
            } else if (!tai0Var.d.d) {
                tai0Var.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final qai0 f() {
        ?? V;
        boolean z;
        boolean z2 = this.d.c;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        e7z e7zVar = this.c;
        if (!z2) {
            lm40 lm40Var = (lm40) e7zVar.h1.g;
            if ((lm40Var.d & 8) != 0) {
                loop3: while (lm40Var != null) {
                    if ((lm40Var.c & 8) != 0) {
                        V = lm40Var;
                        ?? xz40Var = 0;
                        while (true) {
                            if (V != 0) {
                                if (V instanceof qai0) {
                                    if (((qai0) V).e()) {
                                        r4 = V;
                                    }
                                } else if ((V.c & 8) != 0 && (V instanceof f3k)) {
                                    lm40 lm40Var2 = ((f3k) V).p;
                                    int i = 0;
                                    V = V;
                                    xz40Var = xz40Var;
                                    while (lm40Var2 != null) {
                                        if ((lm40Var2.c & 8) != 0) {
                                            i++;
                                            xz40Var = xz40Var;
                                            if (i == 1) {
                                                V = lm40Var2;
                                            } else {
                                                if (xz40Var == 0) {
                                                    xz40Var = new xz40(new lm40[16]);
                                                }
                                                if (V != 0) {
                                                    xz40Var.b(V);
                                                    V = 0;
                                                }
                                                xz40Var.b(lm40Var2);
                                            }
                                        }
                                        lm40Var2 = lm40Var2.f;
                                        V = V;
                                        xz40Var = xz40Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                V = vcc.V(xz40Var);
                            }
                        }
                    }
                    if ((lm40Var.d & 8) == 0) {
                        break;
                    }
                    lm40Var = lm40Var.f;
                }
            }
        } else {
            lm40 lm40Var3 = (lm40) e7zVar.h1.g;
            if ((lm40Var3.d & 8) != 0) {
                V = 0;
                while (lm40Var3 != null) {
                    if ((lm40Var3.c & 8) != 0) {
                        lm40 lm40VarV = lm40Var3;
                        xz40 xz40Var2 = null;
                        while (lm40VarV != null) {
                            if (lm40VarV instanceof qai0) {
                                qai0 qai0Var = (qai0) lm40VarV;
                                ?? r0 = V;
                                if (qai0Var.e()) {
                                    r0 = V;
                                    if (qai0Var.J0()) {
                                        return qai0Var;
                                    }
                                    if (V == 0) {
                                        r0 = qai0Var;
                                    }
                                }
                                z = false;
                                V = r0;
                            } else {
                                z = true;
                                V = V;
                            }
                            if (z && (lm40VarV.c & 8) != 0 && (lm40VarV instanceof f3k)) {
                                int i2 = 0;
                                for (lm40 lm40Var4 = ((f3k) lm40VarV).p; lm40Var4 != null; lm40Var4 = lm40Var4.f) {
                                    if ((lm40Var4.c & 8) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            lm40VarV = lm40Var4;
                                        } else {
                                            if (xz40Var2 == null) {
                                                xz40Var2 = new xz40(new lm40[16]);
                                            }
                                            if (lm40VarV != null) {
                                                xz40Var2.b(lm40VarV);
                                                lm40VarV = null;
                                            }
                                            xz40Var2.b(lm40Var4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            lm40VarV = vcc.V(xz40Var2);
                        }
                    }
                    if ((lm40Var3.d & 8) == 0) {
                        break;
                    }
                    lm40Var3 = lm40Var3.f;
                    V = V;
                }
                r4 = V;
            }
        }
        return (qai0) r4;
    }

    public final jge0 g() {
        s460 s460VarD = d();
        if (s460VarD != null) {
            if (!s460VarD.g1().n) {
                s460VarD = null;
            }
            if (s460VarD != null) {
                return k7x.C(s460VarD).w(s460VarD, true);
            }
        }
        return jge0.e;
    }

    public final jge0 h() {
        s460 s460VarD = d();
        if (s460VarD != null) {
            if (!s460VarD.g1().n) {
                s460VarD = null;
            }
            if (s460VarD != null) {
                return k7x.z(s460VarD, true);
            }
        }
        return jge0.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.d) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList();
        if (!o()) {
            return q(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final nai0 k() {
        boolean zO = o();
        nai0 nai0Var = this.d;
        if (!zO) {
            return nai0Var;
        }
        nai0 nai0Var2 = new nai0();
        nai0Var2.c = nai0Var.c;
        nai0Var2.d = nai0Var.d;
        nai0Var2.f23193a.k(nai0Var.f23193a);
        p(new ArrayList(), nai0Var2);
        return nai0Var2;
    }

    public final tai0 l() {
        e7z e7zVarV;
        tai0 tai0Var = this.e;
        if (tai0Var != null) {
            return tai0Var;
        }
        e7z e7zVar = this.c;
        boolean z = this.b;
        if (!z) {
            e7zVarV = null;
            break;
        }
        e7zVarV = e7zVar.v();
        while (true) {
            if (e7zVarV == null) {
                e7zVarV = null;
                break;
            }
            nai0 nai0VarX = e7zVarV.x();
            if (nai0VarX != null && nai0VarX.c) {
                break;
            }
            e7zVarV = e7zVarV.v();
        }
        if (e7zVarV == null) {
            for (e7z e7zVarV2 = e7zVar.v(); e7zVarV2 != null; e7zVarV2 = e7zVarV2.v()) {
                if (e7zVarV2.h1.j(8)) {
                    e7zVarV = e7zVarV2;
                }
            }
            e7zVarV = null;
        }
        if (e7zVarV == null) {
            return null;
        }
        return x0x.o(e7zVarV, z);
    }

    public final jge0 m() {
        yzj yzjVarF = f();
        if (yzjVarF == null) {
            return ((rdx) this.c.h1.d).D1();
        }
        lm40 lm40Var = ((lm40) yzjVarF).f20279a;
        Object objG = this.d.f23193a.g(mai0.b);
        if (objG == null) {
            objG = null;
        }
        boolean z = objG != null;
        if (!lm40Var.f20279a.n) {
            return jge0.e;
        }
        if (z) {
            return vcc.X(lm40Var, 8).D1();
        }
        s460 s460VarX = vcc.X(lm40Var, 8);
        return k7x.C(s460VarX).w(s460VarX, true);
    }

    public final boolean n() {
        return this.e != null;
    }

    public final boolean o() {
        return this.b && this.d.c;
    }

    public final void p(ArrayList arrayList, nai0 nai0Var) {
        if (this.d.d) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            tai0 tai0Var = (tai0) arrayList.get(size2);
            if (!tai0Var.o()) {
                nai0Var.e(tai0Var.d);
                tai0Var.p(arrayList, nai0Var);
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z) {
        if (n()) {
            return iun.f15405a;
        }
        c(this.c, arrayList);
        if (z) {
            nai0 nai0Var = this.d;
            hz40 hz40Var = nai0Var.f23193a;
            Object objG = hz40Var.g(xai0.z);
            if (objG == null) {
                objG = null;
            }
            ucg0 ucg0Var = (ucg0) objG;
            byte b = 0;
            if (ucg0Var != null && nai0Var.c && !arrayList.isEmpty()) {
                arrayList.add(b(ucg0Var, new rai0(ucg0Var, b)));
            }
            zai0 zai0Var = xai0.f40557a;
            if (hz40Var.c(zai0Var) && !arrayList.isEmpty() && nai0Var.c) {
                Object objG2 = hz40Var.g(zai0Var);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) CollectionsKt.firstOrNull(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new ka6(str, (byte) 13)));
                }
            }
        }
        return arrayList;
    }
}
