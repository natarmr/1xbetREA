package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class z95 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f44001a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public z95(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.f44001a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static z95 a(fq80 fq80Var) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            fq80Var.N(4);
            int iZ = (fq80Var.z() & 3) + 1;
            if (iZ == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZ2 = fq80Var.z() & 31;
            for (int i9 = 0; i9 < iZ2; i9++) {
                int iG = fq80Var.G();
                int i10 = fq80Var.b;
                fq80Var.N(iG);
                byte[] bArr = fq80Var.f9961a;
                byte[] bArr2 = new byte[iG + 4];
                System.arraycopy(jyc.f17352a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i10, bArr2, 4, iG);
                arrayList.add(bArr2);
            }
            int iZ3 = fq80Var.z();
            for (int i11 = 0; i11 < iZ3; i11++) {
                int iG2 = fq80Var.G();
                int i12 = fq80Var.b;
                fq80Var.N(iG2);
                byte[] bArr3 = fq80Var.f9961a;
                byte[] bArr4 = new byte[iG2 + 4];
                System.arraycopy(jyc.f17352a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i12, bArr4, 4, iG2);
                arrayList.add(bArr4);
            }
            if (iZ2 > 0) {
                f950 f950VarP0 = ntr.p0((byte[]) arrayList.get(0), 4, ((byte[]) arrayList.get(0)).length);
                int i13 = f950VarP0.e;
                int i14 = f950VarP0.f;
                int i15 = f950VarP0.h + 8;
                int i16 = f950VarP0.i + 8;
                int i17 = f950VarP0.p;
                int i18 = f950VarP0.q;
                int i19 = f950VarP0.r;
                int i20 = f950VarP0.s;
                float f2 = f950VarP0.g;
                int i21 = f950VarP0.f9139a;
                int i22 = f950VarP0.b;
                int i23 = f950VarP0.c;
                byte[] bArr5 = jyc.f17352a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23));
                i4 = i18;
                i5 = i19;
                i6 = i20;
                f = f2;
                i2 = i14;
                i3 = i15;
                i7 = i16;
                i8 = i17;
                i = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new z95(arrayList, iZ, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw kq80.a("Error parsing AVC config", e);
        }
    }
}
