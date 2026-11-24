package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public abstract class dww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mm40 f6818a = o7k0.n(jm40.b, gak0.c);

    public static final void a(pm80 pm80Var, n4d n4dVar, mm40 mm40Var, fet fetVar, int i, int i2) {
        int i3;
        mm40 mm40Var2;
        fetVar.g0(1755070997);
        int i4 = i | (fetVar.i(pm80Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= fetVar.i(n4dVar) ? 32 : 16;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
        } else {
            i3 = i4 | (fetVar.g(mm40Var) ? 2048 : 1024);
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            mm40 mm40Var3 = i5 != 0 ? jm40.b : mm40Var;
            long j = y3d.g;
            boolean zI = fetVar.i(n4dVar);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new adw(n4dVar, (byte) 6);
                fetVar.o0(objP);
            }
            c(pm80Var, null, rq8.L(mm40Var3, (Function1) objP), j, fetVar, (i3 & 14) | 3120, 0);
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g3n(pm80Var, n4dVar, mm40Var2, i, i2);
        }
    }

    public static final void b(r2x r2xVar, String str, mm40 mm40Var, long j, fet fetVar, int i, int i2) {
        int i3;
        mm40 mm40Var2;
        long j2;
        fetVar.g0(-126890956);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(r2xVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 8) == 0 && fetVar.f(j)) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                if (i4 != 0) {
                    mm40Var = jm40.b;
                }
                if ((i2 & 8) != 0) {
                    j = ((y3d) fetVar.k(yde.f42431a)).f41946a;
                    i3 &= -7169;
                }
            } else {
                fetVar.X();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            }
            mm40 mm40Var3 = mm40Var;
            long j3 = j;
            fetVar.s();
            c(iom0.r(r2xVar, fetVar), str, mm40Var3, j3, fetVar, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
            j2 = j3;
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            j2 = j;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v1m(r2xVar, str, mm40Var2, j2, i, i2, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x0105  */
    /* JADX WARN: Code duplicated, block: B:89:0x0120  */
    /* JADX WARN: Code duplicated, block: B:93:0x0142  */
    /* JADX WARN: Code duplicated, block: B:95:0x0162  */
    /* JADX WARN: Code duplicated, block: B:98:0x016d  */
    public static final void c(pm80 pm80Var, String str, mm40 mm40Var, long j, fet fetVar, int i, int i2) {
        int i3;
        mm40 mm40Var2;
        long j2;
        boolean z;
        mm40 mm40Var3;
        long j3;
        yfe0 yfe0VarU;
        int i4;
        mm40 mm40Var4;
        boolean z2;
        Object m78Var;
        mm40 mm40VarA;
        long jI;
        boolean z3;
        Object objP;
        int i5;
        fetVar.g0(-2142239481);
        if ((i & 6) == 0) {
            i3 = (fetVar.i(pm80Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(str) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                mm40Var2 = mm40Var;
                i3 |= fetVar.g(mm40Var2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                j2 = j;
                if ((i2 & 8) == 0 || !fetVar.f(j2)) {
                    i5 = 1024;
                } else {
                    i5 = 2048;
                }
                i3 |= i5;
            } else {
                j2 = j;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i3 & 1, z)) {
                fetVar.Z();
                i4 = i & 1;
                mm40Var4 = jm40.b;
                if (i4 != 0 || fetVar.B()) {
                    if (i6 != 0) {
                        mm40Var2 = mm40Var4;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = ((y3d) fetVar.k(yde.f42431a)).f41946a;
                        i3 &= -7169;
                    }
                } else {
                    fetVar.X();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                }
                fetVar.s();
                z2 = (((i3 & 7168) ^ 3072) <= 2048 && fetVar.f(j2)) || (i3 & 3072) == 2048;
                Object objP2 = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (!z2 || objP2 == cl5Var) {
                    if (h2t0.a(j2, y3d.g)) {
                        m78Var = null;
                    } else {
                        m78Var = new m78(j2, 5);
                    }
                    fetVar.o0(m78Var);
                } else {
                    m78Var = objP2;
                }
                a4d a4dVar = (a4d) m78Var;
                if (str != null) {
                    fetVar.e0(-536990979);
                    if ((i3 & 112) == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objP = fetVar.P();
                    if (z3 || objP == cl5Var) {
                        objP = new ka6(str, (byte) 8);
                        fetVar.o0(objP);
                    }
                    mm40VarA = pai0.a(mm40Var4, false, (Function1) objP);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-536832197);
                    fetVar.r(false);
                    mm40VarA = mm40Var4;
                }
                if (h7k0.b(pm80Var.i(), 9205357640488583168L)) {
                    mm40Var4 = f6818a;
                } else {
                    jI = pm80Var.i();
                    if (Float.isInfinite(Float.intBitsToFloat((int) (jI >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jI & 4294967295L)))) {
                        mm40Var4 = f6818a;
                    }
                }
                zq8.a(0, fetVar, wb.K(mm40Var2.e(mm40Var4), pm80Var, null, gqw0.B, 0.0f, a4dVar, 22).e(mm40VarA));
                mm40Var3 = mm40Var2;
                j3 = j2;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                j3 = j2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new v1m(pm80Var, str, mm40Var3, j3, i, i2, (byte) 1);
            }
        }
        i3 |= 384;
        mm40Var2 = mm40Var;
        if ((i & 3072) == 0) {
            j2 = j;
            if ((i2 & 8) == 0) {
                i5 = 1024;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        } else {
            j2 = j;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i3 & 1, z)) {
            fetVar.Z();
            i4 = i & 1;
            mm40Var4 = jm40.b;
            if (i4 != 0) {
                if (i6 != 0) {
                    mm40Var2 = mm40Var4;
                }
                if ((i2 & 8) != 0) {
                    j2 = ((y3d) fetVar.k(yde.f42431a)).f41946a;
                    i3 &= -7169;
                }
            } else {
                if (i6 != 0) {
                    mm40Var2 = mm40Var4;
                }
                if ((i2 & 8) != 0) {
                    j2 = ((y3d) fetVar.k(yde.f42431a)).f41946a;
                    i3 &= -7169;
                }
            }
            fetVar.s();
            if (((i3 & 7168) ^ 3072) <= 2048) {
            }
            Object objP3 = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z2) {
                if (h2t0.a(j2, y3d.g)) {
                    m78Var = null;
                } else {
                    m78Var = new m78(j2, 5);
                }
                fetVar.o0(m78Var);
            } else {
                if (h2t0.a(j2, y3d.g)) {
                    m78Var = null;
                } else {
                    m78Var = new m78(j2, 5);
                }
                fetVar.o0(m78Var);
            }
            a4d a4dVar2 = (a4d) m78Var;
            if (str != null) {
                fetVar.e0(-536990979);
                if ((i3 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objP = fetVar.P();
                if (z3) {
                    objP = new ka6(str, (byte) 8);
                    fetVar.o0(objP);
                } else {
                    objP = new ka6(str, (byte) 8);
                    fetVar.o0(objP);
                }
                mm40VarA = pai0.a(mm40Var4, false, (Function1) objP);
                fetVar.r(false);
            } else {
                fetVar.e0(-536832197);
                fetVar.r(false);
                mm40VarA = mm40Var4;
            }
            if (h7k0.b(pm80Var.i(), 9205357640488583168L)) {
                jI = pm80Var.i();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jI >> 32)))) {
                    mm40Var4 = f6818a;
                }
            } else {
                mm40Var4 = f6818a;
            }
            zq8.a(0, fetVar, wb.K(mm40Var2.e(mm40Var4), pm80Var, null, gqw0.B, 0.0f, a4dVar2, 22).e(mm40VarA));
            mm40Var3 = mm40Var2;
            j3 = j2;
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
            j3 = j2;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v1m(pm80Var, str, mm40Var3, j3, i, i2, (byte) 1);
        }
    }
}
