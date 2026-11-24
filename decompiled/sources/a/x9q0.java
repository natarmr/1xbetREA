package a;

import android.gov.nist.core.Separators;
import android.graphics.Paint;
import android.os.Trace;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x9q0 extends lm40 implements v6z, ehl, qai0 {
    public String o;
    public y9q0 p;
    public mrq q;
    public int r;
    public boolean s;
    public int t;
    public int u;
    public n4d v;
    public HashMap w;
    public bo80 x;
    public v9q0 y;
    public w9q0 z;

    @Override // a.lm40
    public final boolean O0() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // a.v6z
    public final int U(c810 c810Var, pj30 pj30Var, int i) {
        bo80 bo80VarZ0;
        w9q0 w9q0Var = this.z;
        if (w9q0Var == null) {
            bo80VarZ0 = Z0();
        } else {
            if (!w9q0Var.c) {
                w9q0Var = null;
            }
            if (w9q0Var == null || (bo80VarZ0 = w9q0Var.d) == null) {
                bo80VarZ0 = Z0();
            }
        }
        bo80VarZ0.d(c810Var);
        return jtm0.j(bo80VarZ0.e(c810Var.getLayoutDirection()).e());
    }

    public final bo80 Z0() {
        y9q0 y9q0Var = this.p;
        bo80 bo80Var = this.x;
        if (bo80Var == null) {
            bo80Var = new bo80(this.o, y9q0Var, this.q, this.r, this.s, this.t, this.u);
            this.x = bo80Var;
        }
        bo80Var.getClass();
        return bo80Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x0042, B:21:0x0049, B:24:0x0059, B:26:0x0069, B:28:0x0084, B:30:0x0094, B:29:0x008d, B:25:0x0062, B:31:0x00a1, B:12:0x0015), top: B:37:0x0005 }] */
    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        bo80 bo80VarZ0;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            w9q0 w9q0Var = this.z;
            if (w9q0Var == null) {
                bo80VarZ0 = Z0();
            } else {
                if (!w9q0Var.c) {
                    w9q0Var = null;
                }
                if (w9q0Var == null || (bo80VarZ0 = w9q0Var.d) == null) {
                    bo80VarZ0 = Z0();
                }
            }
            bo80VarZ0.d(vj30Var);
            boolean zB = bo80VarZ0.b(j, vj30Var.getLayoutDirection());
            ao80 ao80Var = bo80VarZ0.n;
            if (ao80Var != null) {
                ao80Var.b();
            }
            s03 s03Var = bo80VarZ0.j;
            s03Var.getClass();
            y8q0 y8q0Var = s03Var.d;
            long j2 = bo80VarZ0.l;
            if (zB) {
                vcc.X(this, 2).o1();
                HashMap map = this.w;
                if (map == null) {
                    map = new HashMap(2);
                    this.w = map;
                }
                ykw ykwVar = z12.f43597a;
                Paint.FontMetricsInt fontMetricsInt = y8q0Var.l;
                map.put(ykwVar, Integer.valueOf(Math.round(y8q0Var.h + ((y8q0Var.g + (-1) != 0 || fontMetricsInt == null) ? y8q0Var.f.getLineBaseline(0) : y8q0Var.h(0) - fontMetricsInt.ascent) + 0.0f)));
                ykw ykwVar2 = z12.b;
                int i = y8q0Var.g - 1;
                Paint.FontMetricsInt fontMetricsInt2 = y8q0Var.l;
                map.put(ykwVar2, Integer.valueOf(Math.round(y8q0Var.h + (fontMetricsInt2 != null ? y8q0Var.h(i) - fontMetricsInt2.ascent : y8q0Var.f.getLineBaseline(i)) + 0.0f)));
            }
            int i2 = (int) (j2 >> 32);
            int i3 = (int) (j2 & 4294967295L);
            pu90 pu90VarS = pj30Var.S(lgb.O(i2, i2, i3, i3));
            HashMap map2 = this.w;
            map2.getClass();
            return vj30Var.i0(i2, i3, map2, new klo0(pu90VarS, (byte) 5));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // a.v6z
    public final int e0(c810 c810Var, pj30 pj30Var, int i) {
        bo80 bo80VarZ0;
        w9q0 w9q0Var = this.z;
        if (w9q0Var == null) {
            bo80VarZ0 = Z0();
        } else {
            if (!w9q0Var.c) {
                w9q0Var = null;
            }
            if (w9q0Var == null || (bo80VarZ0 = w9q0Var.d) == null) {
                bo80VarZ0 = Z0();
            }
        }
        bo80VarZ0.d(c810Var);
        return jtm0.j(bo80VarZ0.e(c810Var.getLayoutDirection()).f());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0016  */
    @Override // a.ehl
    public final void u0(g7z g7zVar) {
        bo80 bo80VarZ0;
        if (this.n) {
            w9q0 w9q0Var = this.z;
            if (w9q0Var == null) {
                bo80VarZ0 = Z0();
            } else {
                if (!w9q0Var.c) {
                    w9q0Var = null;
                }
                if (w9q0Var == null || (bo80VarZ0 = w9q0Var.d) == null) {
                    bo80VarZ0 = Z0();
                }
            }
            s03 s03Var = bo80VarZ0.j;
            if (s03Var == null) {
                adx.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.x + ", textSubstitution=" + this.z + Separators.RPAREN);
                csj.b();
                return;
            }
            x5a x5aVarI = g7zVar.f10839a.b.i();
            boolean z = bo80VarZ0.k;
            if (z) {
                long j = bo80VarZ0.l;
                x5aVarI.l();
                x5aVarI.f(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                y9q0 y9q0Var = this.p;
                smk0 smk0Var = y9q0Var.f42262a;
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
                    s03Var.f(x5aVarI, t89VarL, y9q0Var.f42262a.f32451a.g(), ljj0Var2, k5q0Var2, agcVar2);
                } else {
                    n4d n4dVar = this.v;
                    long jA = n4dVar != null ? n4dVar.a() : y3d.g;
                    if (jA == 16) {
                        jA = y9q0Var.b() != 16 ? y9q0Var.b() : y3d.b;
                    }
                    s03Var.e(x5aVarI, jA, ljj0Var2, k5q0Var2, agcVar2);
                }
            } finally {
                if (z) {
                    x5aVarI.i();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // a.v6z
    public final int v(c810 c810Var, pj30 pj30Var, int i) {
        bo80 bo80VarZ0;
        w9q0 w9q0Var = this.z;
        if (w9q0Var == null) {
            bo80VarZ0 = Z0();
        } else {
            if (!w9q0Var.c) {
                w9q0Var = null;
            }
            if (w9q0Var == null || (bo80VarZ0 = w9q0Var.d) == null) {
                bo80VarZ0 = Z0();
            }
        }
        bo80VarZ0.d(c810Var);
        return bo80VarZ0.a(i, c810Var.getLayoutDirection());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // a.v6z
    public final int w(c810 c810Var, pj30 pj30Var, int i) {
        bo80 bo80VarZ0;
        w9q0 w9q0Var = this.z;
        if (w9q0Var == null) {
            bo80VarZ0 = Z0();
        } else {
            if (!w9q0Var.c) {
                w9q0Var = null;
            }
            if (w9q0Var == null || (bo80VarZ0 = w9q0Var.d) == null) {
                bo80VarZ0 = Z0();
            }
        }
        bo80VarZ0.d(c810Var);
        return bo80VarZ0.a(i, c810Var.getLayoutDirection());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [a.v9q0] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // a.qai0
    public final void x0(abi0 abi0Var) {
        v9q0 v9q0Var = this.y;
        ?? r0 = v9q0Var;
        if (v9q0Var == null) {
            final byte b = 0;
            ?? r1 = new Function1(this) { // from class: a.v9q0
                public final /* synthetic */ x9q0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Code duplicated, block: B:27:0x00c5  */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    w6k w6kVar;
                    a9q0 a9q0Var;
                    byte b2 = b;
                    boolean z = true;
                    x9q0 x9q0Var = this.b;
                    switch (b2) {
                        case 0:
                            List list = (List) obj;
                            bo80 bo80VarZ0 = x9q0Var.Z0();
                            y9q0 y9q0Var = x9q0Var.p;
                            n4d n4dVar = x9q0Var.v;
                            y9q0 y9q0VarE = y9q0.e(y9q0Var, n4dVar != null ? n4dVar.a() : y3d.g, 0L, null, null, null, 0L, 0, 0L, 16777214);
                            k6z k6zVar = bo80VarZ0.o;
                            a9q0 a9q0Var2 = null;
                            if (k6zVar == null || (w6kVar = bo80VarZ0.i) == null) {
                                a9q0Var = null;
                            } else {
                                j83 j83Var = new j83(bo80VarZ0.f2921a);
                                if (bo80VarZ0.j == null || bo80VarZ0.n == null) {
                                    a9q0Var = null;
                                } else {
                                    long j = bo80VarZ0.p & (-8589934589L);
                                    iun iunVar = iun.f15405a;
                                    int i = bo80VarZ0.f;
                                    boolean z2 = bo80VarZ0.e;
                                    int i2 = bo80VarZ0.d;
                                    mrq mrqVar = bo80VarZ0.c;
                                    a9q0Var = new a9q0(new z8q0(j83Var, y9q0VarE, iunVar, i, z2, i2, w6kVar, k6zVar, mrqVar, j), new bw40(new w5z(j83Var, w6kVar, mrqVar, y9q0VarE, iunVar, z2), j, bo80VarZ0.f, bo80VarZ0.d), bo80VarZ0.l);
                                }
                            }
                            if (a9q0Var != null) {
                                list.add(a9q0Var);
                                a9q0Var2 = a9q0Var;
                            }
                            return Boolean.valueOf(a9q0Var2 != null);
                        case 1:
                            String str = ((j83) obj).b;
                            w9q0 w9q0Var = x9q0Var.z;
                            if (w9q0Var == null) {
                                w9q0 w9q0Var2 = new w9q0(x9q0Var.o, str);
                                bo80 bo80Var = new bo80(str, x9q0Var.p, x9q0Var.q, x9q0Var.r, x9q0Var.s, x9q0Var.t, x9q0Var.u);
                                bo80Var.d(x9q0Var.Z0().i);
                                w9q0Var2.d = bo80Var;
                                x9q0Var.z = w9q0Var2;
                            } else if (!Intrinsics.d(str, w9q0Var.b)) {
                                w9q0Var.b = str;
                                bo80 bo80Var2 = w9q0Var.d;
                                if (bo80Var2 != null) {
                                    y9q0 y9q0Var2 = x9q0Var.p;
                                    mrq mrqVar2 = x9q0Var.q;
                                    int i3 = x9q0Var.r;
                                    boolean z3 = x9q0Var.s;
                                    int i4 = x9q0Var.t;
                                    int i5 = x9q0Var.u;
                                    bo80Var2.f2921a = str;
                                    bo80Var2.b = y9q0Var2;
                                    bo80Var2.c = mrqVar2;
                                    bo80Var2.d = i3;
                                    bo80Var2.e = z3;
                                    bo80Var2.f = i4;
                                    bo80Var2.g = i5;
                                    bo80Var2.s = (bo80Var2.s << 2) | 2;
                                    bo80Var2.c();
                                }
                            }
                            s0x.S(x9q0Var);
                            n7x.I(x9q0Var);
                            vfc.J(x9q0Var);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            w9q0 w9q0Var3 = x9q0Var.z;
                            if (w9q0Var3 == null) {
                                z = false;
                            } else {
                                w9q0Var3.c = zBooleanValue;
                                s0x.S(x9q0Var);
                                n7x.I(x9q0Var);
                                vfc.J(x9q0Var);
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.y = r1;
            r0 = r1;
        }
        j83 j83Var = new j83(this.o);
        iiy[] iiyVarArr = yai0.f42300a;
        abi0Var.b(xai0.C, kotlin.collections.a.c(j83Var));
        w9q0 w9q0Var = this.z;
        if (w9q0Var != null) {
            boolean z = w9q0Var.c;
            zai0 zai0Var = xai0.E;
            iiy[] iiyVarArr2 = yai0.f42300a;
            iiy iiyVar = iiyVarArr2[17];
            Boolean boolValueOf = Boolean.valueOf(z);
            zai0Var.getClass();
            abi0Var.b(zai0Var, boolValueOf);
            j83 j83Var2 = new j83(w9q0Var.b);
            zai0 zai0Var2 = xai0.D;
            iiy iiyVar2 = iiyVarArr2[16];
            zai0Var2.getClass();
            abi0Var.b(zai0Var2, j83Var2);
        }
        final byte b2 = 1;
        abi0Var.b(mai0.l, new m6(null, new Function1(this) { // from class: a.v9q0
            public final /* synthetic */ x9q0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00c5  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                w6k w6kVar;
                a9q0 a9q0Var;
                byte b3 = b2;
                boolean z2 = true;
                x9q0 x9q0Var = this.b;
                switch (b3) {
                    case 0:
                        List list = (List) obj;
                        bo80 bo80VarZ0 = x9q0Var.Z0();
                        y9q0 y9q0Var = x9q0Var.p;
                        n4d n4dVar = x9q0Var.v;
                        y9q0 y9q0VarE = y9q0.e(y9q0Var, n4dVar != null ? n4dVar.a() : y3d.g, 0L, null, null, null, 0L, 0, 0L, 16777214);
                        k6z k6zVar = bo80VarZ0.o;
                        a9q0 a9q0Var2 = null;
                        if (k6zVar == null || (w6kVar = bo80VarZ0.i) == null) {
                            a9q0Var = null;
                        } else {
                            j83 j83Var3 = new j83(bo80VarZ0.f2921a);
                            if (bo80VarZ0.j == null || bo80VarZ0.n == null) {
                                a9q0Var = null;
                            } else {
                                long j = bo80VarZ0.p & (-8589934589L);
                                iun iunVar = iun.f15405a;
                                int i = bo80VarZ0.f;
                                boolean z3 = bo80VarZ0.e;
                                int i2 = bo80VarZ0.d;
                                mrq mrqVar = bo80VarZ0.c;
                                a9q0Var = new a9q0(new z8q0(j83Var3, y9q0VarE, iunVar, i, z3, i2, w6kVar, k6zVar, mrqVar, j), new bw40(new w5z(j83Var3, w6kVar, mrqVar, y9q0VarE, iunVar, z3), j, bo80VarZ0.f, bo80VarZ0.d), bo80VarZ0.l);
                            }
                        }
                        if (a9q0Var != null) {
                            list.add(a9q0Var);
                            a9q0Var2 = a9q0Var;
                        }
                        return Boolean.valueOf(a9q0Var2 != null);
                    case 1:
                        String str = ((j83) obj).b;
                        w9q0 w9q0Var2 = x9q0Var.z;
                        if (w9q0Var2 == null) {
                            w9q0 w9q0Var3 = new w9q0(x9q0Var.o, str);
                            bo80 bo80Var = new bo80(str, x9q0Var.p, x9q0Var.q, x9q0Var.r, x9q0Var.s, x9q0Var.t, x9q0Var.u);
                            bo80Var.d(x9q0Var.Z0().i);
                            w9q0Var3.d = bo80Var;
                            x9q0Var.z = w9q0Var3;
                        } else if (!Intrinsics.d(str, w9q0Var2.b)) {
                            w9q0Var2.b = str;
                            bo80 bo80Var2 = w9q0Var2.d;
                            if (bo80Var2 != null) {
                                y9q0 y9q0Var2 = x9q0Var.p;
                                mrq mrqVar2 = x9q0Var.q;
                                int i3 = x9q0Var.r;
                                boolean z4 = x9q0Var.s;
                                int i4 = x9q0Var.t;
                                int i5 = x9q0Var.u;
                                bo80Var2.f2921a = str;
                                bo80Var2.b = y9q0Var2;
                                bo80Var2.c = mrqVar2;
                                bo80Var2.d = i3;
                                bo80Var2.e = z4;
                                bo80Var2.f = i4;
                                bo80Var2.g = i5;
                                bo80Var2.s = (bo80Var2.s << 2) | 2;
                                bo80Var2.c();
                            }
                        }
                        s0x.S(x9q0Var);
                        n7x.I(x9q0Var);
                        vfc.J(x9q0Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        w9q0 w9q0Var4 = x9q0Var.z;
                        if (w9q0Var4 == null) {
                            z2 = false;
                        } else {
                            w9q0Var4.c = zBooleanValue;
                            s0x.S(x9q0Var);
                            n7x.I(x9q0Var);
                            vfc.J(x9q0Var);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final byte b3 = 2;
        abi0Var.b(mai0.m, new m6(null, new Function1(this) { // from class: a.v9q0
            public final /* synthetic */ x9q0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00c5  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                w6k w6kVar;
                a9q0 a9q0Var;
                byte b4 = b3;
                boolean z2 = true;
                x9q0 x9q0Var = this.b;
                switch (b4) {
                    case 0:
                        List list = (List) obj;
                        bo80 bo80VarZ0 = x9q0Var.Z0();
                        y9q0 y9q0Var = x9q0Var.p;
                        n4d n4dVar = x9q0Var.v;
                        y9q0 y9q0VarE = y9q0.e(y9q0Var, n4dVar != null ? n4dVar.a() : y3d.g, 0L, null, null, null, 0L, 0, 0L, 16777214);
                        k6z k6zVar = bo80VarZ0.o;
                        a9q0 a9q0Var2 = null;
                        if (k6zVar == null || (w6kVar = bo80VarZ0.i) == null) {
                            a9q0Var = null;
                        } else {
                            j83 j83Var3 = new j83(bo80VarZ0.f2921a);
                            if (bo80VarZ0.j == null || bo80VarZ0.n == null) {
                                a9q0Var = null;
                            } else {
                                long j = bo80VarZ0.p & (-8589934589L);
                                iun iunVar = iun.f15405a;
                                int i = bo80VarZ0.f;
                                boolean z3 = bo80VarZ0.e;
                                int i2 = bo80VarZ0.d;
                                mrq mrqVar = bo80VarZ0.c;
                                a9q0Var = new a9q0(new z8q0(j83Var3, y9q0VarE, iunVar, i, z3, i2, w6kVar, k6zVar, mrqVar, j), new bw40(new w5z(j83Var3, w6kVar, mrqVar, y9q0VarE, iunVar, z3), j, bo80VarZ0.f, bo80VarZ0.d), bo80VarZ0.l);
                            }
                        }
                        if (a9q0Var != null) {
                            list.add(a9q0Var);
                            a9q0Var2 = a9q0Var;
                        }
                        return Boolean.valueOf(a9q0Var2 != null);
                    case 1:
                        String str = ((j83) obj).b;
                        w9q0 w9q0Var2 = x9q0Var.z;
                        if (w9q0Var2 == null) {
                            w9q0 w9q0Var3 = new w9q0(x9q0Var.o, str);
                            bo80 bo80Var = new bo80(str, x9q0Var.p, x9q0Var.q, x9q0Var.r, x9q0Var.s, x9q0Var.t, x9q0Var.u);
                            bo80Var.d(x9q0Var.Z0().i);
                            w9q0Var3.d = bo80Var;
                            x9q0Var.z = w9q0Var3;
                        } else if (!Intrinsics.d(str, w9q0Var2.b)) {
                            w9q0Var2.b = str;
                            bo80 bo80Var2 = w9q0Var2.d;
                            if (bo80Var2 != null) {
                                y9q0 y9q0Var2 = x9q0Var.p;
                                mrq mrqVar2 = x9q0Var.q;
                                int i3 = x9q0Var.r;
                                boolean z4 = x9q0Var.s;
                                int i4 = x9q0Var.t;
                                int i5 = x9q0Var.u;
                                bo80Var2.f2921a = str;
                                bo80Var2.b = y9q0Var2;
                                bo80Var2.c = mrqVar2;
                                bo80Var2.d = i3;
                                bo80Var2.e = z4;
                                bo80Var2.f = i4;
                                bo80Var2.g = i5;
                                bo80Var2.s = (bo80Var2.s << 2) | 2;
                                bo80Var2.c();
                            }
                        }
                        s0x.S(x9q0Var);
                        n7x.I(x9q0Var);
                        vfc.J(x9q0Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        w9q0 w9q0Var4 = x9q0Var.z;
                        if (w9q0Var4 == null) {
                            z2 = false;
                        } else {
                            w9q0Var4.c = zBooleanValue;
                            s0x.S(x9q0Var);
                            n7x.I(x9q0Var);
                            vfc.J(x9q0Var);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        abi0Var.b(mai0.n, new m6(null, new h3q0(this, (byte) 6)));
        yai0.a(abi0Var, r0);
    }
}
