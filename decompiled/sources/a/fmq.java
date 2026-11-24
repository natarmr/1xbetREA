package a;

/* JADX INFO: loaded from: classes.dex */
public final class fmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9797a;
    public w2e d;
    public w2e e;
    public w2e f;
    public w2e g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ hmq r;
    public k4e b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public fmq(hmq hmqVar, int i, w2e w2eVar, w2e w2eVar2, w2e w2eVar3, w2e w2eVar4, int i2) {
        this.r = hmqVar;
        this.f9797a = i;
        this.d = w2eVar;
        this.e = w2eVar2;
        this.f = w2eVar3;
        this.g = w2eVar4;
        this.h = hmqVar.A0;
        this.i = hmqVar.w0;
        this.j = hmqVar.B0;
        this.k = hmqVar.x0;
        this.q = i2;
    }

    public final void a(k4e k4eVar) {
        int i = this.f9797a;
        int i2 = this.q;
        j4e j4eVar = j4e.c;
        hmq hmqVar = this.r;
        if (i == 0) {
            int iC0 = hmqVar.c0(k4eVar, i2);
            if (k4eVar.U[0] == j4eVar) {
                this.p++;
                iC0 = 0;
            }
            this.l = iC0 + (k4eVar.i0 != 8 ? hmqVar.T0 : 0) + this.l;
            int iB0 = hmqVar.b0(k4eVar, this.q);
            if (this.b == null || this.c < iB0) {
                this.b = k4eVar;
                this.c = iB0;
                this.m = iB0;
            }
        } else {
            int iC1 = hmqVar.c0(k4eVar, i2);
            int iB1 = hmqVar.b0(k4eVar, this.q);
            if (k4eVar.U[1] == j4eVar) {
                this.p++;
                iB1 = 0;
            }
            this.m = iB1 + (k4eVar.i0 != 8 ? hmqVar.U0 : 0) + this.m;
            if (this.b == null || this.c < iC1) {
                this.b = k4eVar;
                this.c = iC1;
                this.l = iC1;
            }
        }
        this.o++;
    }

    /* JADX WARN: Code duplicated, block: B:89:0x0105 A[PHI: r5 r9
  0x0105: PHI (r5v25 int) = (r5v23 int), (r5v26 int) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]
  0x0105: PHI (r9v24 float) = (r9v22 float), (r9v27 float) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    public final void b(int i, boolean z, boolean z2) {
        hmq hmqVar;
        int i2;
        int i3;
        k4e k4eVar;
        boolean z3;
        char c;
        int i4;
        float f;
        int i5;
        int i6 = this.o;
        int i7 = 0;
        while (true) {
            hmqVar = this.r;
            if (i7 >= i6 || (i5 = this.n + i7) >= hmqVar.f1) {
                break;
            }
            k4e k4eVar2 = hmqVar.e1[i5];
            if (k4eVar2 != null) {
                k4eVar2.F();
            }
            i7++;
        }
        if (i6 == 0 || this.b == null) {
            return;
        }
        boolean z4 = z2 && i == 0;
        int i8 = -1;
        int i9 = -1;
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = this.n + (z ? (i6 - 1) - i10 : i10);
            if (i11 >= hmqVar.f1) {
                break;
            }
            k4e k4eVar3 = hmqVar.e1[i11];
            if (k4eVar3 != null && k4eVar3.i0 == 0) {
                if (i8 == -1) {
                    i8 = i10;
                }
                i9 = i10;
            }
        }
        int i12 = this.f9797a;
        k4e k4eVar4 = this.b;
        if (i12 == 0) {
            k4eVar4.m0 = hmqVar.I0;
            w2e w2eVar = k4eVar4.M;
            w2e w2eVar2 = k4eVar4.K;
            int i13 = this.i;
            if (i > 0) {
                i13 += hmqVar.U0;
            }
            w2eVar2.a(this.e, i13);
            if (z2) {
                w2eVar.a(this.g, this.k);
            }
            if (i > 0) {
                this.e.d.M.a(w2eVar2, 0);
            }
            if (hmqVar.W0 != 3 || k4eVar4.F) {
                k4eVar = k4eVar4;
                break;
            }
            int i14 = 0;
            while (true) {
                if (i14 < i6) {
                    int i15 = this.n + (z ? (i6 - 1) - i14 : i14);
                    if (i15 < hmqVar.f1) {
                        k4eVar = hmqVar.e1[i15];
                        if (k4eVar.F) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
                k4eVar = k4eVar4;
                break;
            }
            int i16 = 0;
            k4e k4eVar5 = null;
            while (i16 < i6) {
                int i17 = z ? (i6 - 1) - i16 : i16;
                int i18 = this.n + i17;
                if (i18 >= hmqVar.f1) {
                    return;
                }
                k4e k4eVar6 = hmqVar.e1[i18];
                if (k4eVar6 == null) {
                    i6 = i6;
                    z3 = z4;
                    i9 = i9;
                    c = 3;
                } else {
                    w2e w2eVar3 = k4eVar6.K;
                    w2e w2eVar4 = k4eVar6.M;
                    w2e w2eVar5 = k4eVar6.J;
                    z3 = z4;
                    if (i16 == 0) {
                        k4eVar6.g(w2eVar5, this.d, this.h);
                    }
                    if (i17 == 0) {
                        int i19 = hmqVar.H0;
                        float f2 = hmqVar.N0;
                        if (z) {
                            f2 = 1.0f - f2;
                        }
                        if (this.n == 0 && (i4 = hmqVar.J0) != -1) {
                            f = hmqVar.P0;
                            if (z) {
                                f = 1.0f - f;
                            }
                        } else if (!z2 || (i4 = hmqVar.L0) == -1) {
                            i4 = i19;
                            f = f2;
                        } else {
                            f = hmqVar.R0;
                            if (z) {
                                f = 1.0f - f;
                            }
                        }
                        k4eVar6.l0 = i4;
                        k4eVar6.f0 = f;
                    }
                    if (i16 == i6 - 1) {
                        k4eVar6.g(k4eVar6.L, this.f, this.j);
                    }
                    if (k4eVar5 != null) {
                        w2e w2eVar6 = k4eVar5.L;
                        w2eVar5.a(w2eVar6, hmqVar.T0);
                        if (i16 == i8) {
                            int i20 = this.h;
                            if (w2eVar5.h()) {
                                w2eVar5.h = i20;
                            }
                        }
                        w2eVar6.a(w2eVar5, 0);
                        if (i16 == i9 + 1) {
                            int i21 = this.j;
                            if (w2eVar6.h()) {
                                w2eVar6.h = i21;
                            }
                        }
                    }
                    if (k4eVar6 != k4eVar4) {
                        int i22 = hmqVar.W0;
                        c = 3;
                        if (i22 == 3 && k4eVar.F && k4eVar6 != k4eVar && k4eVar6.F) {
                            k4eVar6.N.a(k4eVar.N, 0);
                        } else if (i22 == 0) {
                            w2eVar3.a(w2eVar2, 0);
                        } else if (i22 == 1) {
                            w2eVar4.a(w2eVar, 0);
                        } else if (z3) {
                            w2eVar3.a(this.e, this.i);
                            w2eVar4.a(this.g, this.k);
                        } else {
                            w2eVar3.a(w2eVar2, 0);
                            w2eVar4.a(w2eVar, 0);
                        }
                    } else {
                        c = 3;
                    }
                    k4eVar5 = k4eVar6;
                }
                i16++;
                z4 = z3;
                i9 = i9;
                i6 = i6;
            }
            return;
        }
        int i23 = i6;
        boolean z5 = z4;
        int i24 = i9;
        k4eVar4.l0 = hmqVar.H0;
        w2e w2eVar7 = k4eVar4.J;
        w2e w2eVar8 = k4eVar4.L;
        int i25 = this.h;
        if (i > 0) {
            i25 += hmqVar.T0;
        }
        if (z) {
            w2eVar8.a(this.f, i25);
            if (z2) {
                w2eVar7.a(this.d, this.j);
            }
            if (i > 0) {
                this.f.d.J.a(w2eVar8, 0);
            }
        } else {
            w2eVar7.a(this.d, i25);
            if (z2) {
                w2eVar8.a(this.f, this.j);
            }
            if (i > 0) {
                this.d.d.L.a(w2eVar7, 0);
            }
        }
        int i26 = 0;
        k4e k4eVar7 = null;
        while (true) {
            int i27 = i23;
            if (i26 >= i27 || (i2 = this.n + i26) >= hmqVar.f1) {
                return;
            }
            k4e k4eVar8 = hmqVar.e1[i2];
            if (k4eVar8 == null) {
                i23 = i27;
            } else {
                w2e w2eVar9 = k4eVar8.J;
                w2e w2eVar10 = k4eVar8.K;
                w2e w2eVar11 = k4eVar8.L;
                if (i26 == 0) {
                    k4eVar8.g(w2eVar10, this.e, this.i);
                    int i28 = hmqVar.I0;
                    float f3 = hmqVar.O0;
                    if (this.n == 0) {
                        int i29 = hmqVar.K0;
                        i23 = i27;
                        i3 = -1;
                        if (i29 != -1) {
                            f3 = hmqVar.Q0;
                        }
                        i28 = i29;
                        k4eVar8.m0 = i28;
                        k4eVar8.g0 = f3;
                    } else {
                        i23 = i27;
                        i3 = -1;
                    }
                    if (z2 && (i29 = hmqVar.M0) != i3) {
                        f3 = hmqVar.S0;
                        i28 = i29;
                    }
                    k4eVar8.m0 = i28;
                    k4eVar8.g0 = f3;
                } else {
                    i23 = i27;
                }
                if (i26 == i23 - 1) {
                    k4eVar8.g(k4eVar8.M, this.g, this.k);
                }
                if (k4eVar7 != null) {
                    w2e w2eVar12 = k4eVar7.M;
                    w2eVar10.a(w2eVar12, hmqVar.U0);
                    if (i26 == i8) {
                        int i30 = this.i;
                        if (w2eVar10.h()) {
                            w2eVar10.h = i30;
                        }
                    }
                    w2eVar12.a(w2eVar10, 0);
                    if (i26 == i24 + 1) {
                        int i31 = this.k;
                        if (w2eVar12.h()) {
                            w2eVar12.h = i31;
                        }
                    }
                }
                if (k4eVar8 != k4eVar4) {
                    int i32 = hmqVar.V0;
                    if (z) {
                        if (i32 == 0) {
                            w2eVar11.a(w2eVar8, 0);
                        } else if (i32 == 1) {
                            w2eVar9.a(w2eVar7, 0);
                        } else if (i32 == 2) {
                            w2eVar9.a(w2eVar7, 0);
                            w2eVar11.a(w2eVar8, 0);
                        }
                    } else if (i32 == 0) {
                        w2eVar9.a(w2eVar7, 0);
                    } else if (i32 == 1) {
                        w2eVar11.a(w2eVar8, 0);
                    } else if (i32 == 2) {
                        if (z5) {
                            w2eVar9.a(this.d, this.h);
                            w2eVar11.a(this.f, this.j);
                        } else {
                            w2eVar9.a(w2eVar7, 0);
                            w2eVar11.a(w2eVar8, 0);
                        }
                    }
                }
                k4eVar7 = k4eVar8;
            }
            i26++;
        }
    }

    public final int c() {
        int i = this.f9797a;
        int i2 = this.m;
        return i == 1 ? i2 - this.r.U0 : i2;
    }

    public final int d() {
        int i = this.f9797a;
        int i2 = this.l;
        return i == 0 ? i2 - this.r.T0 : i2;
    }

    public final void e(int i) {
        hmq hmqVar;
        int i2;
        int i3 = this.p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            hmqVar = this.r;
            if (i6 >= i4 || (i2 = this.n + i6) >= hmqVar.f1) {
                break;
            }
            k4e k4eVar = hmqVar.e1[i2];
            int i7 = this.f9797a;
            j4e j4eVar = j4e.f15879a;
            j4e j4eVar2 = j4e.c;
            if (i7 == 0) {
                if (k4eVar != null) {
                    j4e[] j4eVarArr = k4eVar.U;
                    if (j4eVarArr[0] == j4eVar2 && k4eVar.s == 0) {
                        hmqVar.a0(k4eVar, j4eVar, i5, j4eVarArr[1], k4eVar.m());
                    }
                }
            } else if (k4eVar != null) {
                j4e[] j4eVarArr2 = k4eVar.U;
                if (j4eVarArr2[1] == j4eVar2 && k4eVar.t == 0) {
                    int i8 = i5;
                    hmqVar.a0(k4eVar, j4eVarArr2[0], k4eVar.s(), j4eVar, i8);
                    i5 = i8;
                }
            }
            i6++;
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        int i9 = this.o;
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = this.n + i10;
            if (i11 >= hmqVar.f1) {
                return;
            }
            k4e k4eVar2 = hmqVar.e1[i11];
            if (this.f9797a == 0) {
                int iS = k4eVar2.s();
                int i12 = hmqVar.T0;
                if (k4eVar2.i0 == 8) {
                    i12 = 0;
                }
                this.l = iS + i12 + this.l;
                int iB0 = hmqVar.b0(k4eVar2, this.q);
                if (this.b == null || this.c < iB0) {
                    this.b = k4eVar2;
                    this.c = iB0;
                    this.m = iB0;
                }
            } else {
                int iC0 = hmqVar.c0(k4eVar2, this.q);
                int iB1 = hmqVar.b0(k4eVar2, this.q);
                int i13 = hmqVar.U0;
                if (k4eVar2.i0 == 8) {
                    i13 = 0;
                }
                this.m = iB1 + i13 + this.m;
                if (this.b == null || this.c < iC0) {
                    this.b = k4eVar2;
                    this.c = iC0;
                    this.l = iC0;
                }
            }
        }
    }

    public final void f(int i, w2e w2eVar, w2e w2eVar2, w2e w2eVar3, w2e w2eVar4, int i2, int i3, int i4, int i5, int i6) {
        this.f9797a = i;
        this.d = w2eVar;
        this.e = w2eVar2;
        this.f = w2eVar3;
        this.g = w2eVar4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
