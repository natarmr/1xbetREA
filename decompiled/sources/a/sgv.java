package a;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class sgv extends hvv {
    public String A0;
    public String B0;
    public int C0;
    public ogv o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public float w0;
    public float x0;
    public String y0;
    public String z0;

    public sgv(f7m0 f7m0Var, int i) {
        super(f7m0Var, i);
        this.p0 = 0;
        this.q0 = 0;
        this.r0 = 0;
        this.s0 = 0;
        if (i == 10) {
            this.u0 = 1;
        } else if (i == 11) {
            this.v0 = 1;
        }
    }

    @Override // a.hvv, a.k3e, a.vme0, a.vuo
    public final void apply() {
        s();
        ogv ogvVar = this.o0;
        int i = this.t0;
        ogvVar.getClass();
        if ((i == 0 || i == 1) && ogvVar.U0 != i) {
            ogvVar.U0 = i;
        }
        int i2 = this.u0;
        if (i2 != 0) {
            ogv ogvVar2 = this.o0;
            if (i2 > 50) {
                ogvVar2.getClass();
            } else if (ogvVar2.L0 != i2) {
                ogvVar2.L0 = i2;
                ogvVar2.l0();
                ogvVar2.h0();
            }
        }
        int i3 = this.v0;
        if (i3 != 0) {
            ogv ogvVar3 = this.o0;
            if (i3 > 50) {
                ogvVar3.getClass();
            } else if (ogvVar3.N0 != i3) {
                ogvVar3.N0 = i3;
                ogvVar3.l0();
                ogvVar3.h0();
            }
        }
        float f = this.w0;
        if (f != 0.0f) {
            ogv ogvVar4 = this.o0;
            if (f < 0.0f) {
                ogvVar4.getClass();
            } else if (ogvVar4.O0 != f) {
                ogvVar4.O0 = f;
            }
        }
        float f2 = this.x0;
        if (f2 != 0.0f) {
            ogv ogvVar5 = this.o0;
            if (f2 < 0.0f) {
                ogvVar5.getClass();
            } else if (ogvVar5.P0 != f2) {
                ogvVar5.P0 = f2;
            }
        }
        String str = this.y0;
        if (str != null && !str.isEmpty()) {
            ogv ogvVar6 = this.o0;
            String str2 = this.y0;
            String str3 = ogvVar6.Q0;
            if (str3 == null || !str3.equals(str2)) {
                ogvVar6.Q0 = str2;
            }
        }
        String str4 = this.z0;
        if (str4 != null && !str4.isEmpty()) {
            ogv ogvVar7 = this.o0;
            String str5 = this.z0;
            String str6 = ogvVar7.R0;
            if (str6 == null || !str6.equals(str5)) {
                ogvVar7.R0 = str5;
            }
        }
        String str7 = this.A0;
        if (str7 != null && !str7.isEmpty()) {
            ogv ogvVar8 = this.o0;
            String str8 = this.A0;
            String str9 = ogvVar8.S0;
            if (str9 == null || !str9.equals(str8.toString())) {
                ogvVar8.J0 = false;
                ogvVar8.S0 = str8.toString();
            }
        }
        String str10 = this.B0;
        if (str10 != null && !str10.isEmpty()) {
            ogv ogvVar9 = this.o0;
            String str11 = this.B0;
            String str12 = ogvVar9.T0;
            if (str12 == null || !str12.equals(str11)) {
                ogvVar9.J0 = false;
                ogvVar9.T0 = str11;
            }
        }
        ogv ogvVar10 = this.o0;
        ogvVar10.Z0 = this.C0;
        int i4 = this.p0;
        ogvVar10.y0 = i4;
        ogvVar10.A0 = i4;
        ogvVar10.B0 = i4;
        ogvVar10.z0 = this.q0;
        ogvVar10.w0 = this.r0;
        ogvVar10.x0 = this.s0;
        r();
    }

    @Override // a.hvv
    public final jvv s() {
        int[][] iArrJ0;
        int[][] iArrJ1;
        boolean[][] zArr;
        ogv ogvVar = this.o0;
        if (ogvVar == null) {
            ogvVar = new ogv();
            ogvVar.J0 = false;
            ogvVar.V0 = 0;
            ogvVar.X0 = new HashSet();
            ogvVar.b1 = 0;
            ogvVar.l0();
            int[][] iArr = ogvVar.Y0;
            boolean z = iArr != null && iArr.length == ogvVar.v0 && (zArr = ogvVar.W0) != null && zArr.length == ogvVar.K0 && zArr[0].length == ogvVar.M0;
            if (!z) {
                ogvVar.h0();
            }
            if (z) {
                for (int i = 0; i < ogvVar.W0.length; i++) {
                    int i2 = 0;
                    while (true) {
                        boolean[][] zArr2 = ogvVar.W0;
                        if (i2 < zArr2[0].length) {
                            zArr2[i][i2] = true;
                            i2++;
                        }
                    }
                }
                for (int i3 = 0; i3 < ogvVar.Y0.length; i3++) {
                    int i4 = 0;
                    while (true) {
                        int[][] iArr2 = ogvVar.Y0;
                        if (i4 < iArr2[0].length) {
                            iArr2[i3][i4] = -1;
                            i4++;
                        }
                    }
                }
            }
            ogvVar.V0 = 0;
            String str = ogvVar.T0;
            if (str != null && !str.trim().isEmpty() && (iArrJ1 = ogvVar.j0(ogvVar.T0, false)) != null) {
                ogvVar.f0(iArrJ1);
            }
            String str2 = ogvVar.S0;
            if (str2 != null && !str2.trim().isEmpty() && (iArrJ0 = ogvVar.j0(ogvVar.S0, true)) != null) {
                ogvVar.g0(iArrJ0);
            }
            this.o0 = ogvVar;
        }
        return ogvVar;
    }
}
