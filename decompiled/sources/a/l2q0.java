package a;

import android.os.Trace;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l2q0 extends lm40 implements v6z, ehl, qai0 {
    public Function1 A;
    public Map B;
    public ew40 Y;
    public j2q0 Z;
    public k2q0 f1;
    public j83 o;
    public y9q0 p;
    public mrq q;
    public Function1 r;
    public int s;
    public boolean t;
    public int u;
    public int v;
    public List w;
    public Function1 x;
    public n4d y;
    public n05 z;

    @Override // a.lm40
    public final boolean O0() {
        return false;
    }

    @Override // a.v6z
    public final int U(c810 c810Var, pj30 pj30Var, int i) {
        return jtm0.j(a1(c810Var).e(c810Var.getLayoutDirection()).e());
    }

    public final ew40 Z0() {
        ew40 ew40Var = this.Y;
        if (ew40Var == null) {
            ew40 ew40Var2 = new ew40(this.o, this.p, this.q, this.s, this.t, this.u, this.v, this.w, this.z);
            this.Y = ew40Var2;
            ew40Var = ew40Var2;
        }
        ew40Var.getClass();
        return ew40Var;
    }

    public final ew40 a1(w6k w6kVar) {
        ew40 ew40Var;
        k2q0 k2q0Var = this.f1;
        if (k2q0Var != null && k2q0Var.c && (ew40Var = k2q0Var.d) != null) {
            ew40Var.d(w6kVar);
            return ew40Var;
        }
        ew40 ew40VarZ0 = Z0();
        ew40VarZ0.d(w6kVar);
        return ew40VarZ0;
    }

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            ew40 ew40VarA1 = a1(vj30Var);
            boolean zC = ew40VarA1.c(j, vj30Var.getLayoutDirection());
            a9q0 a9q0Var = ew40VarA1.o;
            if (a9q0Var == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + ew40VarA1);
            }
            long j2 = a9q0Var.c;
            a9q0Var.b.f3309a.b();
            if (zC) {
                vcc.X(this, 2).o1();
                Function1 function1 = this.r;
                if (function1 != null) {
                    function1.invoke(a9q0Var);
                }
                Map linkedHashMap = this.B;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap(2);
                }
                linkedHashMap.put(z12.f43597a, Integer.valueOf(Math.round(a9q0Var.d)));
                linkedHashMap.put(z12.b, Integer.valueOf(Math.round(a9q0Var.e)));
                this.B = linkedHashMap;
            }
            Function1 function2 = this.x;
            if (function2 != null) {
                function2.invoke(a9q0Var.f);
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            pu90 pu90VarS = pj30Var.S(lgb.O(i, i, i2, i2));
            Map map = this.B;
            map.getClass();
            uj30 uj30VarI0 = vj30Var.i0(i, i2, map, new klo0(pu90VarS, (byte) 3));
            Trace.endSection();
            return uj30VarI0;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // a.v6z
    public final int e0(c810 c810Var, pj30 pj30Var, int i) {
        return jtm0.j(a1(c810Var).e(c810Var.getLayoutDirection()).f());
    }

    @Override // a.ehl
    public final void u0(g7z g7zVar) {
        List list;
        if (this.n) {
            x5a x5aVarI = g7zVar.f10839a.b.i();
            ew40 ew40VarA1 = a1(g7zVar);
            a9q0 a9q0Var = ew40VarA1.o;
            if (a9q0Var == null) {
                e9d0.v(ew40VarA1, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ");
                return;
            }
            bw40 bw40Var = a9q0Var.b;
            boolean z = a9q0Var.f() && this.s != 3;
            if (z) {
                long j = a9q0Var.c;
                jge0 jge0VarR = k9x.r(0L, (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L));
                x5aVarI.l();
                x5a.h(x5aVarI, jge0VarR);
            }
            try {
                smk0 smk0Var = this.p.f42262a;
                k5q0 k5q0Var = smk0Var.m;
                if (k5q0Var == null) {
                    k5q0Var = k5q0.b;
                }
                k5q0 k5q0Var2 = k5q0Var;
                ljj0 ljj0Var = smk0Var.n;
                if (ljj0Var == null) {
                    ljj0Var = ljj0.d;
                }
                ljj0 ljj0Var2 = ljj0Var;
                agc agcVar = smk0Var.o;
                if (agcVar == null) {
                    agcVar = l0q.f19214a;
                }
                agc agcVar2 = agcVar;
                t89 t89VarL = smk0Var.f32451a.l();
                if (t89VarL != null) {
                    x8f.X(bw40Var, x5aVarI, t89VarL, this.p.f42262a.f32451a.g(), ljj0Var2, k5q0Var2, agcVar2);
                } else {
                    n4d n4dVar = this.y;
                    long jA = n4dVar != null ? n4dVar.a() : y3d.g;
                    if (jA == 16) {
                        jA = this.p.b() != 16 ? this.p.b() : y3d.b;
                    }
                    bw40Var.i(x5aVarI, jA, ljj0Var2, k5q0Var2, agcVar2);
                }
                if (z) {
                    x5aVarI.i();
                }
                k2q0 k2q0Var = this.f1;
                if (((k2q0Var == null || !k2q0Var.c) ? tnq0.m(this.o) : false) || !((list = this.w) == null || list.isEmpty())) {
                    g7zVar.a();
                }
            } catch (Throwable th) {
                if (!z) {
                    throw th;
                }
                x5aVarI.i();
                throw th;
            }
        }
    }

    @Override // a.v6z
    public final int v(c810 c810Var, pj30 pj30Var, int i) {
        return a1(c810Var).a(i, c810Var.getLayoutDirection());
    }

    @Override // a.v6z
    public final int w(c810 c810Var, pj30 pj30Var, int i) {
        return a1(c810Var).a(i, c810Var.getLayoutDirection());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [a.j2q0] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // a.qai0
    public final void x0(abi0 abi0Var) {
        j2q0 j2q0Var = this.Z;
        ?? r0 = j2q0Var;
        if (j2q0Var == null) {
            final byte b = 0;
            ?? r1 = new Function1(this) { // from class: a.j2q0
                public final /* synthetic */ l2q0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean z;
                    byte b2 = b;
                    a9q0 a9q0Var = null;
                    l2q0 l2q0Var = this.b;
                    switch (b2) {
                        case 0:
                            List list = (List) obj;
                            a9q0 a9q0Var2 = l2q0Var.Z0().o;
                            if (a9q0Var2 != null) {
                                z8q0 z8q0Var = a9q0Var2.f491a;
                                j83 j83Var = z8q0Var.f43981a;
                                y9q0 y9q0Var = l2q0Var.p;
                                n4d n4dVar = l2q0Var.y;
                                a9q0 a9q0Var3 = new a9q0(new z8q0(j83Var, y9q0.e(y9q0Var, n4dVar != null ? n4dVar.a() : y3d.g, 0L, null, null, null, 0L, 0, 0L, 16777214), z8q0Var.c, z8q0Var.d, z8q0Var.e, z8q0Var.f, z8q0Var.g, z8q0Var.h, z8q0Var.i, z8q0Var.j), a9q0Var2.b, a9q0Var2.c);
                                list.add(a9q0Var3);
                                a9q0Var = a9q0Var3;
                            }
                            return Boolean.valueOf(a9q0Var != null);
                        case 1:
                            j83 j83Var2 = (j83) obj;
                            k2q0 k2q0Var = l2q0Var.f1;
                            if (k2q0Var == null) {
                                k2q0 k2q0Var2 = new k2q0(l2q0Var.o, j83Var2);
                                ew40 ew40Var = new ew40(j83Var2, l2q0Var.p, l2q0Var.q, l2q0Var.s, l2q0Var.t, l2q0Var.u, l2q0Var.v, iun.f15405a, l2q0Var.z);
                                ew40Var.d(l2q0Var.Z0().k);
                                k2q0Var2.d = ew40Var;
                                l2q0Var.f1 = k2q0Var2;
                            } else if (!Intrinsics.d(j83Var2, k2q0Var.b)) {
                                k2q0Var.b = j83Var2;
                                ew40 ew40Var2 = k2q0Var.d;
                                if (ew40Var2 != null) {
                                    y9q0 y9q0Var2 = l2q0Var.p;
                                    mrq mrqVar = l2q0Var.q;
                                    int i = l2q0Var.s;
                                    boolean z2 = l2q0Var.t;
                                    int i2 = l2q0Var.u;
                                    int i3 = l2q0Var.v;
                                    iun iunVar = iun.f15405a;
                                    n05 n05Var = l2q0Var.z;
                                    ew40Var2.f8503a = j83Var2;
                                    ew40Var2.f(y9q0Var2);
                                    ew40Var2.b = mrqVar;
                                    ew40Var2.c = i;
                                    ew40Var2.d = z2;
                                    ew40Var2.e = i2;
                                    ew40Var2.f = i3;
                                    ew40Var2.g = iunVar;
                                    ew40Var2.h = n05Var;
                                    ew40Var2.s = (ew40Var2.s << 2) | 2;
                                    ew40Var2.m = null;
                                    ew40Var2.o = null;
                                    ew40Var2.q = -1;
                                    ew40Var2.p = -1;
                                    ew40Var2.r = null;
                                }
                            }
                            s0x.S(l2q0Var);
                            n7x.I(l2q0Var);
                            vfc.J(l2q0Var);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            k2q0 k2q0Var3 = l2q0Var.f1;
                            if (k2q0Var3 == null) {
                                z = false;
                            } else {
                                Function1 function1 = l2q0Var.A;
                                if (function1 != null) {
                                    function1.invoke(k2q0Var3);
                                }
                                k2q0 k2q0Var4 = l2q0Var.f1;
                                if (k2q0Var4 != null) {
                                    k2q0Var4.c = zBooleanValue;
                                }
                                s0x.S(l2q0Var);
                                n7x.I(l2q0Var);
                                vfc.J(l2q0Var);
                                z = true;
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.Z = r1;
            r0 = r1;
        }
        j83 j83Var = this.o;
        iiy[] iiyVarArr = yai0.f42300a;
        abi0Var.b(xai0.C, kotlin.collections.a.c(j83Var));
        k2q0 k2q0Var = this.f1;
        if (k2q0Var != null) {
            j83 j83Var2 = k2q0Var.b;
            zai0 zai0Var = xai0.D;
            iiy[] iiyVarArr2 = yai0.f42300a;
            iiy iiyVar = iiyVarArr2[16];
            zai0Var.getClass();
            abi0Var.b(zai0Var, j83Var2);
            boolean z = k2q0Var.c;
            zai0 zai0Var2 = xai0.E;
            iiy iiyVar2 = iiyVarArr2[17];
            Boolean boolValueOf = Boolean.valueOf(z);
            zai0Var2.getClass();
            abi0Var.b(zai0Var2, boolValueOf);
        }
        final byte b2 = 1;
        abi0Var.b(mai0.l, new m6(null, new Function1(this) { // from class: a.j2q0
            public final /* synthetic */ l2q0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z2;
                byte b3 = b2;
                a9q0 a9q0Var = null;
                l2q0 l2q0Var = this.b;
                switch (b3) {
                    case 0:
                        List list = (List) obj;
                        a9q0 a9q0Var2 = l2q0Var.Z0().o;
                        if (a9q0Var2 != null) {
                            z8q0 z8q0Var = a9q0Var2.f491a;
                            j83 j83Var3 = z8q0Var.f43981a;
                            y9q0 y9q0Var = l2q0Var.p;
                            n4d n4dVar = l2q0Var.y;
                            a9q0 a9q0Var3 = new a9q0(new z8q0(j83Var3, y9q0.e(y9q0Var, n4dVar != null ? n4dVar.a() : y3d.g, 0L, null, null, null, 0L, 0, 0L, 16777214), z8q0Var.c, z8q0Var.d, z8q0Var.e, z8q0Var.f, z8q0Var.g, z8q0Var.h, z8q0Var.i, z8q0Var.j), a9q0Var2.b, a9q0Var2.c);
                            list.add(a9q0Var3);
                            a9q0Var = a9q0Var3;
                        }
                        return Boolean.valueOf(a9q0Var != null);
                    case 1:
                        j83 j83Var4 = (j83) obj;
                        k2q0 k2q0Var2 = l2q0Var.f1;
                        if (k2q0Var2 == null) {
                            k2q0 k2q0Var3 = new k2q0(l2q0Var.o, j83Var4);
                            ew40 ew40Var = new ew40(j83Var4, l2q0Var.p, l2q0Var.q, l2q0Var.s, l2q0Var.t, l2q0Var.u, l2q0Var.v, iun.f15405a, l2q0Var.z);
                            ew40Var.d(l2q0Var.Z0().k);
                            k2q0Var3.d = ew40Var;
                            l2q0Var.f1 = k2q0Var3;
                        } else if (!Intrinsics.d(j83Var4, k2q0Var2.b)) {
                            k2q0Var2.b = j83Var4;
                            ew40 ew40Var2 = k2q0Var2.d;
                            if (ew40Var2 != null) {
                                y9q0 y9q0Var2 = l2q0Var.p;
                                mrq mrqVar = l2q0Var.q;
                                int i = l2q0Var.s;
                                boolean z3 = l2q0Var.t;
                                int i2 = l2q0Var.u;
                                int i3 = l2q0Var.v;
                                iun iunVar = iun.f15405a;
                                n05 n05Var = l2q0Var.z;
                                ew40Var2.f8503a = j83Var4;
                                ew40Var2.f(y9q0Var2);
                                ew40Var2.b = mrqVar;
                                ew40Var2.c = i;
                                ew40Var2.d = z3;
                                ew40Var2.e = i2;
                                ew40Var2.f = i3;
                                ew40Var2.g = iunVar;
                                ew40Var2.h = n05Var;
                                ew40Var2.s = (ew40Var2.s << 2) | 2;
                                ew40Var2.m = null;
                                ew40Var2.o = null;
                                ew40Var2.q = -1;
                                ew40Var2.p = -1;
                                ew40Var2.r = null;
                            }
                        }
                        s0x.S(l2q0Var);
                        n7x.I(l2q0Var);
                        vfc.J(l2q0Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        k2q0 k2q0Var4 = l2q0Var.f1;
                        if (k2q0Var4 == null) {
                            z2 = false;
                        } else {
                            Function1 function1 = l2q0Var.A;
                            if (function1 != null) {
                                function1.invoke(k2q0Var4);
                            }
                            k2q0 k2q0Var5 = l2q0Var.f1;
                            if (k2q0Var5 != null) {
                                k2q0Var5.c = zBooleanValue;
                            }
                            s0x.S(l2q0Var);
                            n7x.I(l2q0Var);
                            vfc.J(l2q0Var);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final byte b3 = 2;
        abi0Var.b(mai0.m, new m6(null, new Function1(this) { // from class: a.j2q0
            public final /* synthetic */ l2q0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z2;
                byte b4 = b3;
                a9q0 a9q0Var = null;
                l2q0 l2q0Var = this.b;
                switch (b4) {
                    case 0:
                        List list = (List) obj;
                        a9q0 a9q0Var2 = l2q0Var.Z0().o;
                        if (a9q0Var2 != null) {
                            z8q0 z8q0Var = a9q0Var2.f491a;
                            j83 j83Var3 = z8q0Var.f43981a;
                            y9q0 y9q0Var = l2q0Var.p;
                            n4d n4dVar = l2q0Var.y;
                            a9q0 a9q0Var3 = new a9q0(new z8q0(j83Var3, y9q0.e(y9q0Var, n4dVar != null ? n4dVar.a() : y3d.g, 0L, null, null, null, 0L, 0, 0L, 16777214), z8q0Var.c, z8q0Var.d, z8q0Var.e, z8q0Var.f, z8q0Var.g, z8q0Var.h, z8q0Var.i, z8q0Var.j), a9q0Var2.b, a9q0Var2.c);
                            list.add(a9q0Var3);
                            a9q0Var = a9q0Var3;
                        }
                        return Boolean.valueOf(a9q0Var != null);
                    case 1:
                        j83 j83Var4 = (j83) obj;
                        k2q0 k2q0Var2 = l2q0Var.f1;
                        if (k2q0Var2 == null) {
                            k2q0 k2q0Var3 = new k2q0(l2q0Var.o, j83Var4);
                            ew40 ew40Var = new ew40(j83Var4, l2q0Var.p, l2q0Var.q, l2q0Var.s, l2q0Var.t, l2q0Var.u, l2q0Var.v, iun.f15405a, l2q0Var.z);
                            ew40Var.d(l2q0Var.Z0().k);
                            k2q0Var3.d = ew40Var;
                            l2q0Var.f1 = k2q0Var3;
                        } else if (!Intrinsics.d(j83Var4, k2q0Var2.b)) {
                            k2q0Var2.b = j83Var4;
                            ew40 ew40Var2 = k2q0Var2.d;
                            if (ew40Var2 != null) {
                                y9q0 y9q0Var2 = l2q0Var.p;
                                mrq mrqVar = l2q0Var.q;
                                int i = l2q0Var.s;
                                boolean z3 = l2q0Var.t;
                                int i2 = l2q0Var.u;
                                int i3 = l2q0Var.v;
                                iun iunVar = iun.f15405a;
                                n05 n05Var = l2q0Var.z;
                                ew40Var2.f8503a = j83Var4;
                                ew40Var2.f(y9q0Var2);
                                ew40Var2.b = mrqVar;
                                ew40Var2.c = i;
                                ew40Var2.d = z3;
                                ew40Var2.e = i2;
                                ew40Var2.f = i3;
                                ew40Var2.g = iunVar;
                                ew40Var2.h = n05Var;
                                ew40Var2.s = (ew40Var2.s << 2) | 2;
                                ew40Var2.m = null;
                                ew40Var2.o = null;
                                ew40Var2.q = -1;
                                ew40Var2.p = -1;
                                ew40Var2.r = null;
                            }
                        }
                        s0x.S(l2q0Var);
                        n7x.I(l2q0Var);
                        vfc.J(l2q0Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        k2q0 k2q0Var4 = l2q0Var.f1;
                        if (k2q0Var4 == null) {
                            z2 = false;
                        } else {
                            Function1 function1 = l2q0Var.A;
                            if (function1 != null) {
                                function1.invoke(k2q0Var4);
                            }
                            k2q0 k2q0Var5 = l2q0Var.f1;
                            if (k2q0Var5 != null) {
                                k2q0Var5.c = zBooleanValue;
                            }
                            s0x.S(l2q0Var);
                            n7x.I(l2q0Var);
                            vfc.J(l2q0Var);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        abi0Var.b(mai0.n, new m6(null, new nxo0(this, (byte) 29)));
        yai0.a(abi0Var, r0);
    }
}
