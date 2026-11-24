package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hmq extends zru0 {
    public k4e[] e1;
    public int H0 = -1;
    public int I0 = -1;
    public int J0 = -1;
    public int K0 = -1;
    public int L0 = -1;
    public int M0 = -1;
    public float N0 = 0.5f;
    public float O0 = 0.5f;
    public float P0 = 0.5f;
    public float Q0 = 0.5f;
    public float R0 = 0.5f;
    public float S0 = 0.5f;
    public int T0 = 0;
    public int U0 = 0;
    public int V0 = 2;
    public int W0 = 2;
    public int X0 = 0;
    public int Y0 = -1;
    public int Z0 = 0;
    public final ArrayList a1 = new ArrayList();
    public k4e[] b1 = null;
    public k4e[] c1 = null;
    public int[] d1 = null;
    public int f1 = 0;

    /* JADX WARN: Code duplicated, block: B:399:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:400:0x06d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:401:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:402:0x06dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:404:0x06df  */
    /* JADX WARN: Code duplicated, block: B:407:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:408:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:74:0x010b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zru0
    public final void Z(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        k4e[] k4eVarArr;
        int i7;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        fmq fmqVar;
        char c;
        int i11;
        boolean z;
        int i12;
        int i13;
        int i14;
        int iCeil;
        Object obj;
        k4e k4eVar;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = this.v0;
        j4e j4eVar = j4e.c;
        j4e j4eVar2 = j4e.b;
        if (i19 > 0) {
            k4e k4eVar2 = this.V;
            r96 r96Var = k4eVar2 != null ? ((l4e) k4eVar2).y0 : null;
            if (r96Var == null) {
                this.D0 = 0;
                this.E0 = 0;
                this.C0 = false;
                return;
            }
            for (int i20 = 0; i20 < this.v0; i20++) {
                k4e k4eVar3 = this.u0[i20];
                if (k4eVar3 != null && !(k4eVar3 instanceof qiv)) {
                    j4e j4eVarL = k4eVar3.l(0);
                    j4e j4eVarL2 = k4eVar3.l(1);
                    if (j4eVarL != j4eVar || k4eVar3.s == 1 || j4eVarL2 != j4eVar || k4eVar3.t == 1) {
                        if (j4eVarL == j4eVar) {
                            j4eVarL = j4eVar2;
                        }
                        if (j4eVarL2 == j4eVar) {
                            j4eVarL2 = j4eVar2;
                        }
                        q96 q96Var = this.F0;
                        q96Var.f28332a = j4eVarL;
                        q96Var.b = j4eVarL2;
                        q96Var.c = k4eVar3.s();
                        q96Var.d = k4eVar3.m();
                        r96Var.b(k4eVar3, q96Var);
                        k4eVar3.T(q96Var.e);
                        k4eVar3.O(q96Var.f);
                        k4eVar3.K(q96Var.g);
                    }
                }
            }
        }
        int i21 = this.A0;
        int i22 = this.B0;
        int i23 = this.w0;
        int i24 = this.x0;
        int[] iArr2 = new int[2];
        int i25 = (i2 - i21) - i22;
        int i26 = this.Z0;
        if (i26 == 1) {
            i25 = (i4 - i23) - i24;
        }
        int i27 = i25;
        int i28 = this.H0;
        if (i26 == 0) {
            if (i28 == -1) {
                this.H0 = 0;
            }
            if (this.I0 == -1) {
                this.I0 = 0;
            }
        } else {
            if (i28 == -1) {
                this.H0 = 0;
            }
            if (this.I0 == -1) {
                this.I0 = 0;
            }
        }
        k4e[] k4eVarArr2 = this.u0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        while (true) {
            i5 = this.v0;
            i6 = i21;
            if (i29 >= i5) {
                break;
            }
            if (this.u0[i29].i0 == 8) {
                i30++;
            }
            i29++;
            i21 = i6;
        }
        if (i30 > 0) {
            k4e[] k4eVarArr3 = new k4e[i5 - i30];
            int i32 = 0;
            int i33 = 0;
            while (i32 < this.v0) {
                k4e k4eVar4 = this.u0[i32];
                k4e[] k4eVarArr4 = k4eVarArr3;
                if (k4eVar4.i0 != 8) {
                    k4eVarArr4[i33] = k4eVar4;
                    i33++;
                }
                i32++;
                k4eVarArr3 = k4eVarArr4;
            }
            i5 = i33;
            k4eVarArr = k4eVarArr3;
        } else {
            k4eVarArr = k4eVarArr2;
        }
        this.e1 = k4eVarArr;
        this.f1 = i5;
        int i34 = this.X0;
        ArrayList arrayList = this.a1;
        if (i34 != 0) {
            w2e w2eVar = this.K;
            w2e w2eVar2 = this.J;
            w2e w2eVar3 = this.L;
            w2e w2eVar4 = this.M;
            if (i34 == 1) {
                i7 = i22;
                i8 = i23;
                i9 = i24;
                iArr = iArr2;
                i10 = i6;
                int i35 = this.Z0;
                if (i5 != 0) {
                    arrayList.clear();
                    fmq fmqVar2 = new fmq(this, i35, this.J, this.K, this.L, this.M, i27);
                    arrayList.add(fmqVar2);
                    if (i35 == 0) {
                        i12 = 0;
                        int i36 = 0;
                        int i37 = 0;
                        while (i37 < i5) {
                            k4e k4eVar5 = k4eVarArr[i37];
                            int iC0 = c0(k4eVar5, i27);
                            if (k4eVar5.U[0] == j4eVar) {
                                i12++;
                            }
                            int i38 = i12;
                            boolean z2 = (i36 == i27 || (this.T0 + i36) + iC0 > i27) && fmqVar2.b != null;
                            if (!z2 && i37 > 0 && (i14 = this.Y0) > 0 && i37 % i14 == 0) {
                                z2 = true;
                            }
                            if (z2) {
                                fmqVar2 = new fmq(this, i35, this.J, this.K, this.L, this.M, i27);
                                fmqVar2.n = i37;
                                arrayList.add(fmqVar2);
                            } else {
                                if (i37 > 0) {
                                    i36 = this.T0 + iC0 + i36;
                                }
                                fmqVar2.a(k4eVar5);
                                i37++;
                                i12 = i38;
                            }
                            i36 = iC0;
                            fmqVar2.a(k4eVar5);
                            i37++;
                            i12 = i38;
                        }
                    } else {
                        i12 = 0;
                        int i39 = 0;
                        int i40 = 0;
                        while (i40 < i5) {
                            k4e k4eVar6 = k4eVarArr[i40];
                            int iB0 = b0(k4eVar6, i27);
                            if (k4eVar6.U[1] == j4eVar) {
                                i12++;
                            }
                            int i41 = i12;
                            boolean z3 = (i39 == i27 || (this.U0 + i39) + iB0 > i27) && fmqVar2.b != null;
                            if (!z3 && i40 > 0 && (i13 = this.Y0) > 0 && i40 % i13 == 0) {
                                z3 = true;
                            }
                            if (z3) {
                                fmqVar2 = new fmq(this, i35, this.J, this.K, this.L, this.M, i27);
                                fmqVar2.n = i40;
                                arrayList.add(fmqVar2);
                            } else {
                                if (i40 > 0) {
                                    i39 = this.U0 + iB0 + i39;
                                }
                                fmqVar2.a(k4eVar6);
                                i40++;
                                i12 = i41;
                            }
                            i39 = iB0;
                            fmqVar2.a(k4eVar6);
                            i40++;
                            i12 = i41;
                        }
                    }
                    int size = arrayList.size();
                    int i42 = this.A0;
                    int i43 = this.w0;
                    int i44 = this.B0;
                    int i45 = this.x0;
                    j4e[] j4eVarArr = this.U;
                    boolean z4 = j4eVarArr[0] == j4eVar2 || j4eVarArr[1] == j4eVar2;
                    if (i12 > 0 && z4) {
                        for (int i46 = 0; i46 < size; i46++) {
                            fmq fmqVar3 = (fmq) arrayList.get(i46);
                            if (i35 == 0) {
                                fmqVar3.e(i27 - fmqVar3.d());
                            } else {
                                fmqVar3.e(i27 - fmqVar3.c());
                            }
                        }
                    }
                    int i47 = i42;
                    int i48 = i43;
                    int i49 = i44;
                    int i50 = i45;
                    w2e w2eVar5 = w2eVar;
                    w2e w2eVar6 = w2eVar2;
                    int iMax = 0;
                    int i51 = 0;
                    w2e w2eVar7 = w2eVar3;
                    w2e w2eVar8 = w2eVar4;
                    for (int i52 = 0; i52 < size; i52++) {
                        fmq fmqVar4 = (fmq) arrayList.get(i52);
                        if (i35 == 0) {
                            if (i52 < size - 1) {
                                w2eVar8 = ((fmq) arrayList.get(i52 + 1)).b.K;
                                i50 = 0;
                            } else {
                                i50 = this.x0;
                                w2eVar8 = w2eVar4;
                            }
                            w2e w2eVar9 = fmqVar4.b.M;
                            fmqVar4.f(i35, w2eVar6, w2eVar5, w2eVar7, w2eVar8, i47, i48, i49, i50, i27);
                            iMax = Math.max(iMax, fmqVar4.d());
                            int iC = fmqVar4.c() + i51;
                            if (i52 > 0) {
                                iC += this.U0;
                            }
                            i51 = iC;
                            w2eVar5 = w2eVar9;
                            i48 = 0;
                        } else {
                            if (i52 < size - 1) {
                                w2eVar7 = ((fmq) arrayList.get(i52 + 1)).b.J;
                                i49 = 0;
                            } else {
                                i49 = this.B0;
                                w2eVar7 = w2eVar3;
                            }
                            w2e w2eVar10 = fmqVar4.b.L;
                            fmqVar4.f(i35, w2eVar6, w2eVar5, w2eVar7, w2eVar8, i47, i48, i49, i50, i27);
                            int iD = fmqVar4.d() + iMax;
                            int iMax2 = Math.max(i51, fmqVar4.c());
                            if (i52 > 0) {
                                iD += this.T0;
                            }
                            i51 = iMax2;
                            iMax = iD;
                            w2eVar6 = w2eVar10;
                            i47 = 0;
                        }
                    }
                    iArr[0] = iMax;
                    iArr[1] = i51;
                }
            } else if (i34 == 2) {
                i7 = i22;
                i8 = i23;
                i9 = i24;
                iArr = iArr2;
                i10 = i6;
                int i53 = this.Z0;
                int iCeil2 = this.Y0;
                if (i53 == 0) {
                    if (iCeil2 <= 0) {
                        int i54 = 0;
                        iCeil = 0;
                        for (int i55 = 0; i55 < i5; i55++) {
                            if (i55 > 0) {
                                i54 += this.T0;
                            }
                            k4e k4eVar7 = k4eVarArr[i55];
                            if (k4eVar7 != null) {
                                int iC1 = c0(k4eVar7, i27) + i54;
                                if (iC1 > i27) {
                                    break;
                                }
                                iCeil++;
                                i54 = iC1;
                            }
                        }
                    } else {
                        iCeil = iCeil2;
                    }
                    iCeil2 = 0;
                } else {
                    if (iCeil2 <= 0) {
                        int i56 = 0;
                        int i57 = 0;
                        for (int i58 = 0; i58 < i5; i58++) {
                            if (i58 > 0) {
                                i56 += this.U0;
                            }
                            k4e k4eVar8 = k4eVarArr[i58];
                            if (k4eVar8 != null) {
                                int iB1 = b0(k4eVar8, i27) + i56;
                                if (iB1 > i27) {
                                    break;
                                }
                                i57++;
                                i56 = iB1;
                            }
                        }
                        iCeil2 = i57;
                    }
                    iCeil = 0;
                }
                if (this.d1 == null) {
                    this.d1 = new int[2];
                }
                boolean z5 = (iCeil2 == 0 && i53 == 1) || (iCeil == 0 && i53 == 0);
                while (!z5) {
                    if (i53 == 0) {
                        iCeil2 = (int) Math.ceil(i5 / iCeil);
                    } else {
                        iCeil = (int) Math.ceil(i5 / iCeil2);
                    }
                    k4e[] k4eVarArr5 = this.c1;
                    if (k4eVarArr5 == null || k4eVarArr5.length < iCeil) {
                        obj = null;
                        this.c1 = new k4e[iCeil];
                    } else {
                        obj = null;
                        Arrays.fill(k4eVarArr5, (Object) null);
                    }
                    k4e[] k4eVarArr6 = this.b1;
                    if (k4eVarArr6 == null || k4eVarArr6.length < iCeil2) {
                        this.b1 = new k4e[iCeil2];
                    } else {
                        Arrays.fill(k4eVarArr6, obj);
                    }
                    for (int i59 = 0; i59 < iCeil; i59++) {
                        for (int i60 = 0; i60 < iCeil2; i60++) {
                            int i61 = (i60 * iCeil) + i59;
                            if (i53 == 1) {
                                i61 = (i59 * iCeil2) + i60;
                            }
                            if (i61 < k4eVarArr.length && (k4eVar = k4eVarArr[i61]) != null) {
                                int iC2 = c0(k4eVar, i27);
                                k4e k4eVar9 = this.c1[i59];
                                if (k4eVar9 == null || k4eVar9.s() < iC2) {
                                    this.c1[i59] = k4eVar;
                                }
                                int iB2 = b0(k4eVar, i27);
                                k4e k4eVar10 = this.b1[i60];
                                if (k4eVar10 == null || k4eVar10.m() < iB2) {
                                    this.b1[i60] = k4eVar;
                                }
                            }
                        }
                    }
                    int iC3 = 0;
                    for (int i62 = 0; i62 < iCeil; i62++) {
                        k4e k4eVar11 = this.c1[i62];
                        if (k4eVar11 != null) {
                            if (i62 > 0) {
                                iC3 += this.T0;
                            }
                            iC3 = c0(k4eVar11, i27) + iC3;
                        }
                    }
                    int iB3 = 0;
                    for (int i63 = 0; i63 < iCeil2; i63++) {
                        k4e k4eVar12 = this.b1[i63];
                        if (k4eVar12 != null) {
                            if (i63 > 0) {
                                iB3 += this.U0;
                            }
                            iB3 = b0(k4eVar12, i27) + iB3;
                        }
                    }
                    iArr[0] = iC3;
                    iArr[1] = iB3;
                    if (i53 == 0) {
                        if (iC3 <= i27 || iCeil <= 1) {
                            z5 = true;
                        } else {
                            iCeil--;
                        }
                    } else if (iB3 <= i27 || iCeil2 <= 1) {
                        z5 = true;
                    } else {
                        iCeil2--;
                    }
                }
                int[] iArr3 = this.d1;
                iArr3[0] = iCeil;
                iArr3[1] = iCeil2;
                c = 1;
            } else if (i34 != 3) {
                i7 = i22;
                i8 = i23;
                i9 = i24;
                iArr = iArr2;
                i10 = i6;
            } else {
                int i64 = this.Z0;
                if (i5 == 0) {
                    i7 = i22;
                    i8 = i23;
                    i9 = i24;
                    iArr = iArr2;
                    i10 = i6;
                } else {
                    arrayList.clear();
                    iArr = iArr2;
                    i9 = i24;
                    i10 = i6;
                    i7 = i22;
                    i8 = i23;
                    fmq fmqVar5 = new fmq(this, i64, this.J, this.K, this.L, this.M, i27);
                    arrayList.add(fmqVar5);
                    if (i64 == 0) {
                        int i65 = 0;
                        int i66 = 0;
                        i15 = 0;
                        int i67 = 0;
                        while (i65 < i5) {
                            i66++;
                            k4e k4eVar13 = k4eVarArr[i65];
                            int iC4 = c0(k4eVar13, i27);
                            int i68 = i64;
                            if (k4eVar13.U[0] == j4eVar) {
                                i15++;
                            }
                            int i69 = i15;
                            boolean z6 = (i67 == i27 || (this.T0 + i67) + iC4 > i27) && fmqVar5.b != null;
                            if (!z6 && i65 > 0 && (i18 = this.Y0) > 0 && i66 > i18) {
                                z6 = true;
                            }
                            if (z6) {
                                i17 = i65;
                                i64 = i68;
                                fmqVar5 = new fmq(this, i64, this.J, this.K, this.L, this.M, i27);
                                fmqVar5.n = i17;
                                arrayList.add(fmqVar5);
                                i67 = iC4;
                                i66 = 1;
                            } else {
                                i17 = i65;
                                i64 = i68;
                                i67 = i17 > 0 ? this.T0 + iC4 + i67 : iC4;
                            }
                            fmqVar5.a(k4eVar13);
                            i65 = i17 + 1;
                            i15 = i69;
                        }
                    } else {
                        int i70 = 0;
                        int i71 = 0;
                        int i72 = 0;
                        int i73 = 0;
                        while (i73 < i5) {
                            i70++;
                            k4e k4eVar14 = k4eVarArr[i73];
                            int iB4 = b0(k4eVar14, i27);
                            if (k4eVar14.U[1] == j4eVar) {
                                i71++;
                            }
                            int i74 = i71;
                            boolean z7 = (i72 == i27 || (this.U0 + i72) + iB4 > i27) && fmqVar5.b != null;
                            if (!z7 && i73 > 0 && (i16 = this.Y0) > 0 && i70 > i16) {
                                z7 = true;
                            }
                            if (z7) {
                                fmqVar5 = new fmq(this, i64, this.J, this.K, this.L, this.M, i27);
                                fmqVar5.n = i73;
                                arrayList.add(fmqVar5);
                                i72 = iB4;
                                i70 = 1;
                            } else {
                                i72 = i73 > 0 ? this.U0 + iB4 + i72 : iB4;
                            }
                            fmqVar5.a(k4eVar14);
                            i73++;
                            i71 = i74;
                        }
                        i15 = i71;
                    }
                    int size2 = arrayList.size();
                    int i75 = this.A0;
                    int i76 = this.w0;
                    int i77 = this.B0;
                    int i78 = this.x0;
                    j4e[] j4eVarArr2 = this.U;
                    boolean z8 = j4eVarArr2[0] == j4eVar2 || j4eVarArr2[1] == j4eVar2;
                    if (i15 > 0 && z8) {
                        for (int i79 = 0; i79 < size2; i79++) {
                            fmq fmqVar6 = (fmq) arrayList.get(i79);
                            if (i64 == 0) {
                                fmqVar6.e(i27 - fmqVar6.d());
                            } else {
                                fmqVar6.e(i27 - fmqVar6.c());
                            }
                        }
                    }
                    int i80 = i75;
                    int i81 = i76;
                    int i82 = i77;
                    int i83 = i78;
                    w2e w2eVar11 = w2eVar;
                    w2e w2eVar12 = w2eVar2;
                    int iMax3 = 0;
                    int i84 = 0;
                    w2e w2eVar13 = w2eVar3;
                    w2e w2eVar14 = w2eVar4;
                    for (int i85 = 0; i85 < size2; i85++) {
                        fmq fmqVar7 = (fmq) arrayList.get(i85);
                        if (i64 == 0) {
                            if (i85 < size2 - 1) {
                                w2eVar14 = ((fmq) arrayList.get(i85 + 1)).b.K;
                                i83 = 0;
                            } else {
                                i83 = this.x0;
                                w2eVar14 = w2eVar4;
                            }
                            w2e w2eVar15 = fmqVar7.b.M;
                            fmqVar7.f(i64, w2eVar12, w2eVar11, w2eVar13, w2eVar14, i80, i81, i82, i83, i27);
                            iMax3 = Math.max(iMax3, fmqVar7.d());
                            int iC5 = fmqVar7.c() + i84;
                            if (i85 > 0) {
                                iC5 += this.U0;
                            }
                            i84 = iC5;
                            w2eVar11 = w2eVar15;
                            i81 = 0;
                        } else {
                            if (i85 < size2 - 1) {
                                w2eVar13 = ((fmq) arrayList.get(i85 + 1)).b.J;
                                i82 = 0;
                            } else {
                                i82 = this.B0;
                                w2eVar13 = w2eVar3;
                            }
                            w2e w2eVar16 = fmqVar7.b.L;
                            fmqVar7.f(i64, w2eVar12, w2eVar11, w2eVar13, w2eVar14, i80, i81, i82, i83, i27);
                            int iD2 = fmqVar7.d() + iMax3;
                            int iMax4 = Math.max(i84, fmqVar7.c());
                            if (i85 > 0) {
                                iD2 += this.T0;
                            }
                            i84 = iMax4;
                            iMax3 = iD2;
                            w2eVar12 = w2eVar16;
                            i80 = 0;
                        }
                    }
                    iArr[0] = iMax3;
                    iArr[1] = i84;
                }
            }
            c = 1;
        } else {
            i7 = i22;
            i8 = i23;
            i9 = i24;
            iArr = iArr2;
            i10 = i6;
            int i86 = this.Z0;
            if (i5 == 0) {
                c = 1;
            } else {
                if (arrayList.size() == 0) {
                    fmqVar = new fmq(this, i86, this.J, this.K, this.L, this.M, i27);
                    arrayList.add(fmqVar);
                } else {
                    fmq fmqVar8 = (fmq) arrayList.get(0);
                    fmqVar8.c = 0;
                    fmqVar8.b = null;
                    fmqVar8.l = 0;
                    fmqVar8.m = 0;
                    fmqVar8.n = 0;
                    fmqVar8.o = 0;
                    fmqVar8.p = 0;
                    fmqVar8.f(i86, this.J, this.K, this.L, this.M, this.A0, this.w0, this.B0, this.x0, i27);
                    fmqVar = fmqVar8;
                }
                for (int i87 = 0; i87 < i5; i87++) {
                    fmqVar.a(k4eVarArr[i87]);
                }
                i31 = 0;
                iArr[0] = fmqVar.d();
                c = 1;
                iArr[1] = fmqVar.c();
            }
        }
        int iMin = iArr[i31] + i10 + i7;
        int iMin2 = iArr[c] + i8 + i9;
        if (i != 1073741824) {
            if (i == Integer.MIN_VALUE) {
                iMin = Math.min(iMin, i2);
            } else {
                i11 = i3;
                if (i != 0) {
                    iMin = i31;
                }
            }
            if (i11 == 1073741824) {
                iMin2 = i4;
            } else if (i11 == Integer.MIN_VALUE) {
                iMin2 = Math.min(iMin2, i4);
            } else if (i11 != 0) {
                iMin2 = i31;
            }
            this.D0 = iMin;
            this.E0 = iMin2;
            T(iMin);
            O(iMin2);
            if (this.v0 > 0) {
                z = c;
            } else {
                z = i31;
            }
            this.C0 = z;
        }
        iMin = i2;
        i11 = i3;
        if (i11 == 1073741824) {
            iMin2 = i4;
        } else if (i11 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i4);
        } else if (i11 != 0) {
            iMin2 = i31;
        }
        this.D0 = iMin;
        this.E0 = iMin2;
        T(iMin);
        O(iMin2);
        if (this.v0 > 0) {
            z = c;
        } else {
            z = i31;
        }
        this.C0 = z;
    }

    public final int b0(k4e k4eVar, int i) {
        k4e k4eVar2;
        if (k4eVar == null) {
            return 0;
        }
        if (k4eVar.U[1] == j4e.c) {
            int i2 = k4eVar.t;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (k4eVar.A * i);
                if (i3 != k4eVar.m()) {
                    k4eVar.g = true;
                    a0(k4eVar, k4eVar.U[0], k4eVar.s(), j4e.f15879a, i3);
                }
                return i3;
            }
            k4eVar2 = k4eVar;
            if (i2 == 1) {
                return k4eVar2.m();
            }
            if (i2 == 3) {
                return (int) ((k4eVar2.s() * k4eVar2.Y) + 0.5f);
            }
        } else {
            k4eVar2 = k4eVar;
        }
        return k4eVar2.m();
    }

    @Override // a.k4e
    public final void c(p900 p900Var, boolean z) {
        k4e k4eVar;
        float f;
        int i;
        super.c(p900Var, z);
        k4e k4eVar2 = this.V;
        boolean z2 = k4eVar2 != null && ((l4e) k4eVar2).z0;
        int i2 = this.X0;
        ArrayList arrayList = this.a1;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((fmq) arrayList.get(i3)).b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((fmq) arrayList.get(i4)).b(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.d1 != null && this.c1 != null && this.b1 != null) {
                for (int i5 = 0; i5 < this.f1; i5++) {
                    this.e1[i5].F();
                }
                int[] iArr = this.d1;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.N0;
                k4e k4eVar3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.N0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    k4e k4eVar4 = this.c1[i];
                    if (k4eVar4 != null) {
                        w2e w2eVar = k4eVar4.J;
                        if (k4eVar4.i0 != 8) {
                            if (i8 == 0) {
                                k4eVar4.g(w2eVar, this.J, this.A0);
                                k4eVar4.l0 = this.H0;
                                k4eVar4.f0 = f;
                            }
                            if (i8 == i6 - 1) {
                                k4eVar4.g(k4eVar4.L, this.L, this.B0);
                            }
                            if (i8 > 0 && k4eVar3 != null) {
                                w2e w2eVar2 = k4eVar3.L;
                                k4eVar4.g(w2eVar, w2eVar2, this.T0);
                                k4eVar3.g(w2eVar2, w2eVar, 0);
                            }
                            k4eVar3 = k4eVar4;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    k4e k4eVar5 = this.b1[i9];
                    if (k4eVar5 != null) {
                        w2e w2eVar3 = k4eVar5.K;
                        if (k4eVar5.i0 != 8) {
                            if (i9 == 0) {
                                k4eVar5.g(w2eVar3, this.K, this.w0);
                                k4eVar5.m0 = this.I0;
                                k4eVar5.g0 = this.O0;
                            }
                            if (i9 == i7 - 1) {
                                k4eVar5.g(k4eVar5.M, this.M, this.x0);
                            }
                            if (i9 > 0 && k4eVar3 != null) {
                                w2e w2eVar4 = k4eVar3.M;
                                k4eVar5.g(w2eVar3, w2eVar4, this.U0);
                                k4eVar3.g(w2eVar4, w2eVar3, 0);
                            }
                            k4eVar3 = k4eVar5;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.Z0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        k4e[] k4eVarArr = this.e1;
                        if (i12 < k4eVarArr.length && (k4eVar = k4eVarArr[i12]) != null && k4eVar.i0 != 8) {
                            k4e k4eVar6 = this.c1[i10];
                            k4e k4eVar7 = this.b1[i11];
                            if (k4eVar != k4eVar6) {
                                k4eVar.g(k4eVar.J, k4eVar6.J, 0);
                                k4eVar.g(k4eVar.L, k4eVar6.L, 0);
                            }
                            if (k4eVar != k4eVar7) {
                                k4eVar.g(k4eVar.K, k4eVar7.K, 0);
                                k4eVar.g(k4eVar.M, k4eVar7.M, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((fmq) arrayList.get(0)).b(0, z2, true);
        }
        this.C0 = false;
    }

    public final int c0(k4e k4eVar, int i) {
        k4e k4eVar2;
        if (k4eVar == null) {
            return 0;
        }
        if (k4eVar.U[0] == j4e.c) {
            int i2 = k4eVar.s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (k4eVar.x * i);
                if (i3 != k4eVar.s()) {
                    k4eVar.g = true;
                    a0(k4eVar, j4e.f15879a, i3, k4eVar.U[1], k4eVar.m());
                }
                return i3;
            }
            k4eVar2 = k4eVar;
            if (i2 == 1) {
                return k4eVar2.s();
            }
            if (i2 == 3) {
                return (int) ((k4eVar2.m() * k4eVar2.Y) + 0.5f);
            }
        } else {
            k4eVar2 = k4eVar;
        }
        return k4eVar2.s();
    }

    @Override // a.jvv, a.k4e
    public final void h(k4e k4eVar, HashMap map) {
        super.h(k4eVar, map);
        hmq hmqVar = (hmq) k4eVar;
        this.H0 = hmqVar.H0;
        this.I0 = hmqVar.I0;
        this.J0 = hmqVar.J0;
        this.K0 = hmqVar.K0;
        this.L0 = hmqVar.L0;
        this.M0 = hmqVar.M0;
        this.N0 = hmqVar.N0;
        this.O0 = hmqVar.O0;
        this.P0 = hmqVar.P0;
        this.Q0 = hmqVar.Q0;
        this.R0 = hmqVar.R0;
        this.S0 = hmqVar.S0;
        this.T0 = hmqVar.T0;
        this.U0 = hmqVar.U0;
        this.V0 = hmqVar.V0;
        this.W0 = hmqVar.W0;
        this.X0 = hmqVar.X0;
        this.Y0 = hmqVar.Y0;
        this.Z0 = hmqVar.Z0;
    }
}
