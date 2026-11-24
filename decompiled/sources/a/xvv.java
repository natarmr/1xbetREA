package a;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xvv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f41581a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final String n;
    public final dgu o;

    public xvv(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, dgu dguVar) {
        this.f41581a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = f;
        this.m = i11;
        this.n = str;
        this.o = dguVar;
    }

    public static xvv a(fq80 fq80Var, boolean z, dgu dguVar) {
        boolean z2;
        x860 x860VarM0;
        int i = 4;
        try {
            if (z) {
                fq80Var.N(4);
            } else {
                fq80Var.N(21);
            }
            int iZ = fq80Var.z() & 3;
            int iZ2 = fq80Var.z();
            int i2 = fq80Var.b;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                z2 = true;
                if (i4 >= iZ2) {
                    break;
                }
                fq80Var.N(1);
                int iG = fq80Var.G();
                for (int i6 = 0; i6 < iG; i6++) {
                    int iG2 = fq80Var.G();
                    i5 += iG2 + 4;
                    fq80Var.N(iG2);
                }
                i4++;
            }
            fq80Var.M(i2);
            byte[] bArr = new byte[i5];
            dgu dguVar2 = dguVar;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            float f = 1.0f;
            String strA = null;
            int i17 = 0;
            int i18 = 0;
            while (i17 < iZ2) {
                int iZ3 = fq80Var.z() & 63;
                int iG3 = fq80Var.G();
                int i19 = i3;
                dgu dguVarO0 = dguVar2;
                while (i19 < iG3) {
                    boolean z3 = z2;
                    int iG4 = fq80Var.G();
                    int i20 = iZ;
                    System.arraycopy(ntr.j, i3, bArr, i18, i);
                    int i21 = i18 + 4;
                    System.arraycopy(fq80Var.f9961a, fq80Var.b, bArr, i21, iG4);
                    if (iZ3 == 32 && i19 == 0) {
                        dguVarO0 = ntr.o0(bArr, i21, i21 + iG4);
                    } else {
                        if (iZ3 == 33 && i19 == 0) {
                            c950 c950VarN0 = ntr.n0(bArr, i21, i21 + iG4, dguVarO0);
                            i7 = c950VarN0.f3946a + 1;
                            i8 = c950VarN0.g;
                            int i22 = c950VarN0.h;
                            i10 = c950VarN0.c + 8;
                            i11 = c950VarN0.d + 8;
                            int i23 = c950VarN0.k;
                            i9 = i22;
                            int i24 = c950VarN0.l;
                            int i25 = c950VarN0.m;
                            float f2 = c950VarN0.i;
                            int i26 = c950VarN0.j;
                            a950 a950Var = c950VarN0.b;
                            if (a950Var != null) {
                                strA = jyc.a(a950Var.f461a, a950Var.b, a950Var.c, a950Var.d, a950Var.e, a950Var.f);
                            }
                            i16 = i26;
                            f = f2;
                            i14 = i25;
                            i13 = i24;
                            i12 = i23;
                        } else if (iZ3 == 39 && i19 == 0 && (x860VarM0 = ntr.m0(bArr, i21, i21 + iG4)) != null && dguVarO0 != null) {
                            i3 = 0;
                            i15 = x860VarM0.f40449a == ((z850) ((b4x) dguVarO0.f6058a).get(0)).b ? 4 : 5;
                        }
                        i3 = 0;
                    }
                    i18 = i21 + iG4;
                    fq80Var.N(iG4);
                    i19++;
                    z2 = z3;
                    iZ = i20;
                    i = 4;
                }
                i17++;
                dguVar2 = dguVarO0;
                i = 4;
            }
            return new xvv(i5 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iZ + 1, i7, i8, i9, i10, i11, i12, i13, i14, i15, f, i16, strA, dguVar2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw kq80.a("Error parsing".concat(z ? "L-HEVC config" : "HEVC config"), e);
        }
    }
}
