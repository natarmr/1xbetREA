package a;

import android.gov.nist.core.Separators;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ogv extends zru0 {
    public l4e H0;
    public k4e[] I0;
    public boolean J0;
    public int K0;
    public int L0;
    public int M0;
    public int N0;
    public float O0;
    public float P0;
    public String Q0;
    public String R0;
    public String S0;
    public String T0;
    public int U0;
    public int V0;
    public boolean[][] W0;
    public HashSet X0;
    public int[][] Y0;
    public int Z0;
    public int[][] a1;
    public int b1;

    public static void b0(k4e k4eVar) {
        k4eVar.n0[1] = -1.0f;
        k4eVar.K.j();
        k4eVar.M.j();
        k4eVar.N.j();
    }

    public static float[] k0(int i, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(Separators.COMMA);
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < strArrSplit.length) {
                try {
                    fArr[i2] = Float.parseFloat(strArrSplit[i2]);
                } catch (Exception e) {
                    System.err.println("Error parsing `" + strArrSplit[i2] + "`: " + e.getMessage());
                    fArr[i2] = 1.0f;
                }
            } else {
                fArr[i2] = 1.0f;
            }
        }
        return fArr;
    }

    @Override // a.zru0
    public final void Z(int i, int i2, int i3, int i4) {
        int[][] iArrJ0;
        this.H0 = (l4e) this.V;
        if (this.K0 >= 1 && this.M0 >= 1) {
            this.V0 = 0;
            String str = this.T0;
            if (str != null && !str.trim().isEmpty() && (iArrJ0 = j0(this.T0, false)) != null) {
                f0(iArrJ0);
            }
            String str2 = this.S0;
            if (str2 != null && !str2.trim().isEmpty()) {
                this.a1 = j0(this.S0, true);
            }
            int iMax = Math.max(this.K0, this.M0);
            k4e[] k4eVarArr = this.I0;
            j4e j4eVar = j4e.c;
            if (k4eVarArr == null) {
                this.I0 = new k4e[iMax];
                int i5 = 0;
                while (true) {
                    k4e[] k4eVarArr2 = this.I0;
                    if (i5 >= k4eVarArr2.length) {
                        break;
                    }
                    k4e k4eVar = new k4e();
                    j4e[] j4eVarArr = k4eVar.U;
                    j4eVarArr[0] = j4eVar;
                    j4eVarArr[1] = j4eVar;
                    k4eVar.k = String.valueOf(k4eVar.hashCode());
                    k4eVarArr2[i5] = k4eVar;
                    i5++;
                }
            } else if (iMax != k4eVarArr.length) {
                k4e[] k4eVarArr3 = new k4e[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    k4e[] k4eVarArr4 = this.I0;
                    if (i6 < k4eVarArr4.length) {
                        k4eVarArr3[i6] = k4eVarArr4[i6];
                    } else {
                        k4e k4eVar2 = new k4e();
                        j4e[] j4eVarArr2 = k4eVar2.U;
                        j4eVarArr2[0] = j4eVar;
                        j4eVarArr2[1] = j4eVar;
                        k4eVar2.k = String.valueOf(k4eVar2.hashCode());
                        k4eVarArr3[i6] = k4eVar2;
                    }
                }
                while (true) {
                    k4e[] k4eVarArr5 = this.I0;
                    if (iMax >= k4eVarArr5.length) {
                        break;
                    }
                    k4e k4eVar3 = k4eVarArr5[iMax];
                    this.H0.u0.remove(k4eVar3);
                    k4eVar3.E();
                    iMax++;
                }
                this.I0 = k4eVarArr3;
            }
            int[][] iArr = this.a1;
            if (iArr != null) {
                g0(iArr);
            }
        }
        l4e l4eVar = this.H0;
        k4e[] k4eVarArr6 = this.I0;
        l4eVar.getClass();
        for (k4e k4eVar4 : k4eVarArr6) {
            l4eVar.W(k4eVar4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x013d  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b4  */
    @Override // a.k4e
    public final void c(p900 p900Var, boolean z) {
        int i;
        int i2;
        ogv ogvVar;
        int[][] iArr;
        int i3;
        super.c(p900Var, z);
        int iMax = Math.max(this.K0, this.M0);
        k4e k4eVar = this.I0[0];
        float[] fArrK0 = k0(this.K0, this.Q0);
        int i4 = this.K0;
        w2e w2eVar = this.M;
        w2e w2eVar2 = this.K;
        if (i4 == 1) {
            b0(k4eVar);
            k4eVar.K.a(w2eVar2, 0);
            k4eVar.M.a(w2eVar, 0);
        } else {
            int i5 = 0;
            while (true) {
                i = this.K0;
                if (i5 >= i) {
                    break;
                }
                k4e k4eVar2 = this.I0[i5];
                b0(k4eVar2);
                w2e w2eVar3 = k4eVar2.K;
                if (fArrK0 != null) {
                    k4eVar2.n0[1] = fArrK0[i5];
                }
                if (i5 > 0) {
                    w2eVar3.a(this.I0[i5 - 1].M, 0);
                } else {
                    w2eVar3.a(w2eVar2, 0);
                }
                int i6 = this.K0 - 1;
                w2e w2eVar4 = k4eVar2.M;
                if (i5 < i6) {
                    w2eVar4.a(this.I0[i5 + 1].K, 0);
                } else {
                    w2eVar4.a(w2eVar, 0);
                }
                if (i5 > 0) {
                    w2eVar3.g = (int) this.P0;
                }
                i5++;
            }
            while (i < iMax) {
                k4e k4eVar3 = this.I0[i];
                b0(k4eVar3);
                k4eVar3.K.a(w2eVar2, 0);
                k4eVar3.M.a(w2eVar, 0);
                i++;
            }
        }
        int iMax2 = Math.max(this.K0, this.M0);
        k4e k4eVar4 = this.I0[0];
        float[] fArrK1 = k0(this.M0, this.R0);
        int i7 = this.M0;
        w2e w2eVar5 = this.L;
        w2e w2eVar6 = this.J;
        if (i7 == 1) {
            float[] fArr = k4eVar4.n0;
            w2e w2eVar7 = k4eVar4.L;
            w2e w2eVar8 = k4eVar4.J;
            fArr[0] = -1.0f;
            w2eVar8.j();
            w2eVar7.j();
            w2eVar8.a(w2eVar6, 0);
            w2eVar7.a(w2eVar5, 0);
        } else {
            int i8 = 0;
            while (true) {
                i2 = this.M0;
                if (i8 >= i2) {
                    break;
                }
                k4e k4eVar5 = this.I0[i8];
                float[] fArr2 = k4eVar5.n0;
                w2e w2eVar9 = k4eVar5.L;
                w2e w2eVar10 = k4eVar5.J;
                fArr2[0] = -1.0f;
                w2eVar10.j();
                w2eVar9.j();
                if (fArrK1 != null) {
                    k4eVar5.n0[0] = fArrK1[i8];
                }
                if (i8 > 0) {
                    w2eVar10.a(this.I0[i8 - 1].L, 0);
                } else {
                    w2eVar10.a(w2eVar6, 0);
                }
                if (i8 < this.M0 - 1) {
                    w2eVar9.a(this.I0[i8 + 1].J, 0);
                } else {
                    w2eVar9.a(w2eVar5, 0);
                }
                if (i8 > 0) {
                    w2eVar10.g = (int) this.O0;
                }
                i8++;
            }
            while (i2 < iMax2) {
                k4e k4eVar6 = this.I0[i2];
                float[] fArr3 = k4eVar6.n0;
                w2e w2eVar11 = k4eVar6.L;
                w2e w2eVar12 = k4eVar6.J;
                fArr3[0] = -1.0f;
                w2eVar12.j();
                w2eVar11.j();
                w2eVar12.a(w2eVar6, 0);
                w2eVar11.a(w2eVar5, 0);
                i2++;
            }
        }
        int i9 = 0;
        while (i9 < this.v0) {
            if (this.X0.contains(this.u0[i9].k)) {
                ogvVar = this;
            } else {
                boolean z2 = false;
                int i10 = 0;
                while (!z2) {
                    i10 = this.V0;
                    if (i10 >= this.K0 * this.M0) {
                        i10 = -1;
                        break;
                    }
                    int iE0 = this.e0(i10);
                    int iD0 = this.d0(this.V0);
                    boolean[] zArr = this.W0[iE0];
                    if (zArr[iD0]) {
                        zArr[iD0] = false;
                        z2 = true;
                    }
                    this.V0++;
                }
                int iE1 = this.e0(i10);
                int iD1 = this.d0(i10);
                if (i10 == -1) {
                    return;
                }
                if ((this.Z0 & 2) <= 0 || (iArr = this.a1) == null || (i3 = this.b1) >= iArr.length) {
                    ogvVar = this;
                    ogvVar.c0(iE1, iD1, 1, 1, ogvVar.u0[i9]);
                } else {
                    int[] iArr2 = iArr[i3];
                    if (iArr2[0] == i10) {
                        this.W0[iE1][iD1] = true;
                        if (this.i0(iE1, iD1, iArr2[1], iArr2[2])) {
                            k4e k4eVar7 = this.u0[i9];
                            int[] iArr3 = this.a1[this.b1];
                            ogvVar = this;
                            ogvVar.c0(iE1, iD1, iArr3[1], iArr3[2], k4eVar7);
                            ogvVar.b1++;
                        } else {
                            ogvVar = this;
                        }
                    } else {
                        ogvVar = this;
                        ogvVar.c0(iE1, iD1, 1, 1, ogvVar.u0[i9]);
                    }
                }
            }
            i9++;
            this = ogvVar;
        }
    }

    public final void c0(int i, int i2, int i3, int i4, k4e k4eVar) {
        k4eVar.J.a(this.I0[i2].J, 0);
        k4eVar.K.a(this.I0[i].K, 0);
        k4eVar.L.a(this.I0[(i2 + i4) - 1].L, 0);
        k4eVar.M.a(this.I0[(i + i3) - 1].M, 0);
    }

    public final int d0(int i) {
        return this.U0 == 1 ? i / this.K0 : i % this.M0;
    }

    public final int e0(int i) {
        return this.U0 == 1 ? i % this.K0 : i / this.M0;
    }

    public final void f0(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!i0(e0(iArr2[0]), d0(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    public final void g0(int[][] iArr) {
        if ((this.Z0 & 2) > 0) {
            return;
        }
        int i = 0;
        while (i < iArr.length) {
            int iE0 = this.e0(iArr[i][0]);
            int iD0 = this.d0(iArr[i][0]);
            int[] iArr2 = iArr[i];
            if (!this.i0(iE0, iD0, iArr2[1], iArr2[2])) {
                return;
            }
            k4e k4eVar = this.u0[i];
            int[] iArr3 = iArr[i];
            ogv ogvVar = this;
            ogvVar.c0(iE0, iD0, iArr3[1], iArr3[2], k4eVar);
            ogvVar.X0.add(ogvVar.u0[i].k);
            i++;
            this = ogvVar;
        }
    }

    public final void h0() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.K0, this.M0);
        this.W0 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i = this.v0;
        if (i > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, 4);
            this.Y0 = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    public final boolean i0(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.W0;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final int[][] j0(String str, boolean z) {
        int i;
        int i2;
        try {
            String[] strArrSplit = str.split(Separators.COMMA);
            Arrays.sort(strArrSplit, new l13((byte) 16));
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
            if (this.K0 != 1 && this.M0 != 1) {
                for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                    String[] strArrSplit2 = strArrSplit[i3].trim().split(Separators.COLON);
                    String[] strArrSplit3 = strArrSplit2[1].split("x");
                    iArr[i3][0] = Integer.parseInt(strArrSplit2[0]);
                    if ((this.Z0 & 1) > 0) {
                        iArr[i3][1] = Integer.parseInt(strArrSplit3[1]);
                        iArr[i3][2] = Integer.parseInt(strArrSplit3[0]);
                    } else {
                        iArr[i3][1] = Integer.parseInt(strArrSplit3[0]);
                        iArr[i3][2] = Integer.parseInt(strArrSplit3[1]);
                    }
                }
                return iArr;
            }
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < strArrSplit.length; i6++) {
                String[] strArrSplit4 = strArrSplit[i6].trim().split(Separators.COLON);
                iArr[i6][0] = Integer.parseInt(strArrSplit4[0]);
                int[] iArr2 = iArr[i6];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.M0 == 1) {
                    iArr2[1] = Integer.parseInt(strArrSplit4[1]);
                    i4 += iArr[i6][1];
                    if (z) {
                        i4--;
                    }
                }
                if (this.K0 == 1) {
                    iArr[i6][2] = Integer.parseInt(strArrSplit4[1]);
                    i5 += iArr[i6][2];
                    if (z) {
                        i5--;
                    }
                }
            }
            if (i4 != 0 && !this.J0 && (i2 = this.K0 + i4) <= 50 && this.L0 != i2) {
                this.L0 = i2;
                l0();
                h0();
            }
            if (i5 != 0 && !this.J0 && (i = this.M0 + i5) <= 50 && this.N0 != i) {
                this.N0 = i;
                l0();
                h0();
            }
            this.J0 = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void l0() {
        int i;
        int i2 = this.L0;
        if (i2 != 0 && (i = this.N0) != 0) {
            this.K0 = i2;
            this.M0 = i;
            return;
        }
        int i3 = this.N0;
        if (i3 > 0) {
            this.M0 = i3;
            this.K0 = ((this.v0 + i3) - 1) / i3;
        } else if (i2 > 0) {
            this.K0 = i2;
            this.M0 = ((this.v0 + i2) - 1) / i2;
        } else {
            int iSqrt = (int) (Math.sqrt(this.v0) + 1.5d);
            this.K0 = iSqrt;
            this.M0 = ((this.v0 + iSqrt) - 1) / iSqrt;
        }
    }
}
