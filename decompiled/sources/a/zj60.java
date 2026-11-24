package a;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class zj60 implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f44470a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ jge0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ ak60 f;
    public final /* synthetic */ g9q0 g;
    public final /* synthetic */ y9q0 h;
    public final /* synthetic */ k6z i;

    public zj60(float f, float f2, float f3, jge0 jge0Var, boolean z, ak60 ak60Var, g9q0 g9q0Var, y9q0 y9q0Var, k6z k6zVar) {
        this.f44470a = f;
        this.b = f2;
        this.c = f3;
        this.d = jge0Var;
        this.e = z;
        this.f = ak60Var;
        this.g = g9q0Var;
        this.h = y9q0Var;
        this.i = k6zVar;
    }

    public static final boolean f(pu90 pu90Var, int i, ak60 ak60Var, int i2, g9q0 g9q0Var, y9q0 y9q0Var, k6z k6zVar, int i3) {
        int i4 = (i3 - pu90Var.b) - i;
        if (i4 < 0) {
            i4 = 0;
        }
        return ((int) (g9q0.a(g9q0Var, ak60Var.b, y9q0Var, 0, 6, r4e.b(0, i2, 0, i4, 5), k6zVar, 908).c & 4294967295L)) < i4;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:103:0x01db  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x01f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:108:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:111:0x020a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0210  */
    /* JADX WARN: Code duplicated, block: B:114:0x0212  */
    /* JADX WARN: Code duplicated, block: B:56:0x0133  */
    /* JADX WARN: Code duplicated, block: B:59:0x013a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x0140  */
    /* JADX WARN: Code duplicated, block: B:64:0x0144 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x014a  */
    /* JADX WARN: Code duplicated, block: B:70:0x014f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0158  */
    /* JADX WARN: Code duplicated, block: B:75:0x015b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0169  */
    /* JADX WARN: Code duplicated, block: B:78:0x016f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0196  */
    /* JADX WARN: Code duplicated, block: B:84:0x019d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x019f  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c1 A[PHI: r4
  0x01c1: PHI (r4v21 int) = (r4v14 int), (r4v24 int) binds: [B:95:0x01cb, B:91:0x01be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d1  */
    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        int i;
        int i2;
        int iD;
        int i3;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        final boolean z3;
        boolean z4;
        int i6;
        Pair pair;
        final pu90 pu90VarS;
        int i7;
        int i8;
        int i9;
        prs0 prs0Var;
        float f;
        int i10;
        int i11;
        int i12;
        list.getClass();
        pj30 pj30Var = (pj30) list.get(0);
        pj30 pj30Var2 = (pj30) list.get(1);
        zcl zclVar = qmk.f28987a;
        int iT = vj30Var.T(8.0f);
        int iT2 = vj30Var.T(8.0f);
        int iT3 = vj30Var.T(this.f44470a);
        int iT4 = vj30Var.T(456.0f);
        int iT5 = vj30Var.T(this.b);
        int iH = p4e.h(j) - vj30Var.T(this.c);
        final pu90 pu90VarS2 = pj30Var2.S(p4e.b(j, 0, 0, 0, 0, 10));
        jge0 jge0Var = this.d;
        if (jge0Var == null ? (i = iH - iT5) < 0 : (i = (int) ((jge0Var.b - iT5) - iT)) < 0) {
            i = 0;
        }
        int i13 = i;
        if (jge0Var == null ? (i2 = iH - iT5) < 0 : (i2 = (int) ((iH - jge0Var.d) - iT)) < 0) {
            i2 = 0;
        }
        int i14 = i2;
        int i15 = p4e.i(j) - (iT3 * 2);
        if (i15 < 0) {
            i15 = 0;
        }
        if (i15 <= iT4) {
            iT4 = i15;
        }
        int i16 = p4e.i(j) - iT3;
        int i17 = pu90VarS2.f27604a;
        int i18 = i16 - i17;
        if (i18 < iT3) {
            i18 = iT3;
        }
        boolean z5 = this.e;
        if (jge0Var != null) {
            iD = l1e0.d((int) (z5 ? jge0Var.c - i17 : jge0Var.f16474a), iT3, i18);
        } else {
            iD = iT3;
        }
        int iD2 = z5 ? l1e0.d((pu90VarS2.f27604a + iD) - iT3, 0, iT4) : l1e0.d((p4e.i(j) - iT3) - iD, 0, iT4);
        g9q0 g9q0Var = this.g;
        k6z k6zVar = this.i;
        ak60 ak60Var = this.f;
        int i19 = iD2;
        y9q0 y9q0Var = this.h;
        int i20 = iT4;
        boolean zF = f(pu90VarS2, iT2, ak60Var, i19, g9q0Var, y9q0Var, k6zVar, i13);
        if (!zF) {
            i3 = i13;
            i4 = i14;
            z = f(pu90VarS2, iT2, this.f, i19, this.g, y9q0Var, this.i, i4);
            if (zF && !z) {
                i5 = iT2;
                z2 = z;
                boolean z6 = ((int) (g9q0.a(this.g, this.f.b, y9q0Var, 0, 6, r4e.b(0, i20, 0, i3 < 0 ? 0 : i3, 5), this.i, 908).c & 4294967295L)) < i3;
                if (!zF || z6) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!zF || z2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z3) {
                    i4 = i3;
                }
                i6 = (i4 - pu90VarS2.b) - i5;
                if (i6 < 0) {
                    i6 = 0;
                }
                if (z4) {
                    pair = new Pair(Integer.valueOf(i19), Integer.valueOf(i6));
                } else {
                    Integer numValueOf = Integer.valueOf(i20);
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    pair = new Pair(numValueOf, Integer.valueOf(i4));
                }
                int iIntValue = ((Number) pair.f46059a).intValue();
                pu90VarS = pj30Var.S(p4e.a(iIntValue, iIntValue, 0, ((Number) pair.b).intValue()));
                i7 = pu90VarS.b;
                if (z4) {
                    i7 = i7 + pu90VarS2.b + i5;
                }
                if (jge0Var == null) {
                    i8 = (((iH - iT5) - i7) / 2) + iT5;
                } else if (z3) {
                    i8 = (int) (jge0Var.d + iT);
                } else {
                    i8 = (int) ((jge0Var.b - i7) - iT);
                }
                if (z4) {
                    if (z5) {
                        i11 = (pu90VarS2.f27604a + iD) - pu90VarS.f27604a;
                        if (i11 >= iT3) {
                            iT3 = i11;
                        }
                    } else {
                        i11 = (p4e.i(j) - iT3) - pu90VarS.f27604a;
                        if (iD > i11) {
                            iT3 = i11;
                        } else {
                            iT3 = iD;
                        }
                    }
                    if (z3) {
                        i12 = pu90VarS2.b + i8 + i5;
                    } else {
                        i12 = i8;
                    }
                    if (!z3) {
                        i8 = i8 + pu90VarS.b + i5;
                    }
                    prs0Var = new prs0(Integer.valueOf(iT3), Integer.valueOf(i12), Integer.valueOf(i8));
                } else {
                    if (jge0Var != null) {
                        if (z5) {
                            f = jge0Var.c - pu90VarS.f27604a;
                        } else {
                            f = jge0Var.f16474a;
                        }
                        int i21 = (int) f;
                        i10 = (p4e.i(j) - iT3) - pu90VarS.f27604a;
                        if (i10 < iT3) {
                            i10 = iT3;
                        }
                        iT3 = l1e0.d(i21, iT3, i10);
                    } else if (z5 && (i9 = (p4e.i(j) - iT3) - pu90VarS.f27604a) >= iT3) {
                        iT3 = i9;
                    }
                    prs0Var = new prs0(Integer.valueOf(iT3), Integer.valueOf(i8), 0);
                }
                final int iIntValue2 = ((Number) prs0Var.f27482a).intValue();
                final int iIntValue3 = ((Number) prs0Var.b).intValue();
                final int iIntValue4 = ((Number) prs0Var.c).intValue();
                int i22 = p4e.i(j);
                int iH2 = p4e.h(j);
                final k6z k6zVar2 = this.i;
                final boolean z7 = this.e;
                final int i23 = iD;
                final boolean z8 = z4;
                return vj30.x(vj30Var, i22, iH2, new Function1() { // from class: a.yj60
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ou90 ou90Var = (ou90) obj;
                        ou90Var.getClass();
                        ou90Var.m(pu90VarS, iIntValue2, iIntValue3, 0.0f);
                        if (z8) {
                            ou90.w(ou90Var, pu90VarS2, i23, iIntValue4, new cj((byte) 5, k6zVar2, z7, z3), 4);
                        }
                        return Unit.f46060a;
                    }
                });
            }
            i5 = iT2;
            z2 = z;
            if (zF) {
                z3 = false;
            } else {
                z3 = false;
            }
            if (zF) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (!z3) {
                i4 = i3;
            }
            i6 = (i4 - pu90VarS2.b) - i5;
            if (i6 < 0) {
                i6 = 0;
            }
            if (z4) {
                pair = new Pair(Integer.valueOf(i19), Integer.valueOf(i6));
            } else {
                Integer numValueOf2 = Integer.valueOf(i20);
                if (i4 < 0) {
                    i4 = 0;
                }
                pair = new Pair(numValueOf2, Integer.valueOf(i4));
            }
            int iIntValue5 = ((Number) pair.f46059a).intValue();
            pu90VarS = pj30Var.S(p4e.a(iIntValue5, iIntValue5, 0, ((Number) pair.b).intValue()));
            i7 = pu90VarS.b;
            if (z4) {
                i7 = i7 + pu90VarS2.b + i5;
            }
            if (jge0Var == null) {
                i8 = (((iH - iT5) - i7) / 2) + iT5;
            } else if (z3) {
                i8 = (int) (jge0Var.d + iT);
            } else {
                i8 = (int) ((jge0Var.b - i7) - iT);
            }
            if (z4) {
                if (z5) {
                    i11 = (pu90VarS2.f27604a + iD) - pu90VarS.f27604a;
                    if (i11 >= iT3) {
                        iT3 = i11;
                    }
                } else {
                    i11 = (p4e.i(j) - iT3) - pu90VarS.f27604a;
                    if (iD > i11) {
                        iT3 = i11;
                    } else {
                        iT3 = iD;
                    }
                }
                if (z3) {
                    i12 = pu90VarS2.b + i8 + i5;
                } else {
                    i12 = i8;
                }
                if (!z3) {
                    i8 = i8 + pu90VarS.b + i5;
                }
                prs0Var = new prs0(Integer.valueOf(iT3), Integer.valueOf(i12), Integer.valueOf(i8));
            } else {
                if (jge0Var != null) {
                    if (z5) {
                        f = jge0Var.c - pu90VarS.f27604a;
                    } else {
                        f = jge0Var.f16474a;
                    }
                    int i24 = (int) f;
                    i10 = (p4e.i(j) - iT3) - pu90VarS.f27604a;
                    if (i10 < iT3) {
                        i10 = iT3;
                    }
                    iT3 = l1e0.d(i24, iT3, i10);
                } else if (z5) {
                    iT3 = i9;
                }
                prs0Var = new prs0(Integer.valueOf(iT3), Integer.valueOf(i8), 0);
            }
            final int iIntValue6 = ((Number) prs0Var.f27482a).intValue();
            final int iIntValue7 = ((Number) prs0Var.b).intValue();
            final int iIntValue8 = ((Number) prs0Var.c).intValue();
            int i25 = p4e.i(j);
            int iH3 = p4e.h(j);
            final k6z k6zVar3 = this.i;
            final boolean z9 = this.e;
            final int i26 = iD;
            final boolean z10 = z4;
            return vj30.x(vj30Var, i25, iH3, new Function1() { // from class: a.yj60
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ou90 ou90Var = (ou90) obj;
                    ou90Var.getClass();
                    ou90Var.m(pu90VarS, iIntValue6, iIntValue7, 0.0f);
                    if (z10) {
                        ou90.w(ou90Var, pu90VarS2, i26, iIntValue8, new cj((byte) 5, k6zVar3, z9, z3), 4);
                    }
                    return Unit.f46060a;
                }
            });
        }
        i3 = i13;
        i4 = i14;
        if (zF) {
            i5 = iT2;
            z2 = z;
        } else {
            i5 = iT2;
            z2 = z;
        }
        if (zF) {
            z3 = false;
        } else {
            z3 = false;
        }
        if (zF) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (!z3) {
            i4 = i3;
        }
        i6 = (i4 - pu90VarS2.b) - i5;
        if (i6 < 0) {
            i6 = 0;
        }
        if (z4) {
            pair = new Pair(Integer.valueOf(i19), Integer.valueOf(i6));
        } else {
            Integer numValueOf3 = Integer.valueOf(i20);
            if (i4 < 0) {
                i4 = 0;
            }
            pair = new Pair(numValueOf3, Integer.valueOf(i4));
        }
        int iIntValue9 = ((Number) pair.f46059a).intValue();
        pu90VarS = pj30Var.S(p4e.a(iIntValue9, iIntValue9, 0, ((Number) pair.b).intValue()));
        i7 = pu90VarS.b;
        if (z4) {
            i7 = i7 + pu90VarS2.b + i5;
        }
        if (jge0Var == null) {
            i8 = (((iH - iT5) - i7) / 2) + iT5;
        } else if (z3) {
            i8 = (int) (jge0Var.d + iT);
        } else {
            i8 = (int) ((jge0Var.b - i7) - iT);
        }
        if (z4) {
            if (z5) {
                i11 = (pu90VarS2.f27604a + iD) - pu90VarS.f27604a;
                if (i11 >= iT3) {
                    iT3 = i11;
                }
            } else {
                i11 = (p4e.i(j) - iT3) - pu90VarS.f27604a;
                if (iD > i11) {
                    iT3 = i11;
                } else {
                    iT3 = iD;
                }
            }
            if (z3) {
                i12 = pu90VarS2.b + i8 + i5;
            } else {
                i12 = i8;
            }
            if (!z3) {
                i8 = i8 + pu90VarS.b + i5;
            }
            prs0Var = new prs0(Integer.valueOf(iT3), Integer.valueOf(i12), Integer.valueOf(i8));
        } else {
            if (jge0Var != null) {
                if (z5) {
                    f = jge0Var.c - pu90VarS.f27604a;
                } else {
                    f = jge0Var.f16474a;
                }
                int i27 = (int) f;
                i10 = (p4e.i(j) - iT3) - pu90VarS.f27604a;
                if (i10 < iT3) {
                    i10 = iT3;
                }
                iT3 = l1e0.d(i27, iT3, i10);
            } else if (z5) {
                iT3 = i9;
            }
            prs0Var = new prs0(Integer.valueOf(iT3), Integer.valueOf(i8), 0);
        }
        final int iIntValue10 = ((Number) prs0Var.f27482a).intValue();
        final int iIntValue11 = ((Number) prs0Var.b).intValue();
        final int iIntValue12 = ((Number) prs0Var.c).intValue();
        int i28 = p4e.i(j);
        int iH4 = p4e.h(j);
        final k6z k6zVar4 = this.i;
        final boolean z11 = this.e;
        final int i29 = iD;
        final boolean z12 = z4;
        return vj30.x(vj30Var, i28, iH4, new Function1() { // from class: a.yj60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                ou90Var.m(pu90VarS, iIntValue10, iIntValue11, 0.0f);
                if (z12) {
                    ou90.w(ou90Var, pu90VarS2, i29, iIntValue12, new cj((byte) 5, k6zVar4, z11, z3), 4);
                }
                return Unit.f46060a;
            }
        });
    }
}
