package a;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class nt90 implements cd40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24087a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public nt90(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f24087a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static nt90 d(fq80 fq80Var) {
        int iM = fq80Var.m();
        String strN = mg40.n(fq80Var.x(fq80Var.m(), StandardCharsets.US_ASCII));
        String strX = fq80Var.x(fq80Var.m(), StandardCharsets.UTF_8);
        int iM2 = fq80Var.m();
        int iM3 = fq80Var.m();
        int iM4 = fq80Var.m();
        int iM5 = fq80Var.m();
        int iM6 = fq80Var.m();
        byte[] bArr = new byte[iM6];
        fq80Var.k(bArr, 0, iM6);
        return new nt90(iM, strN, strX, iM2, iM3, iM4, iM5, bArr);
    }

    @Override // a.cd40
    public final void b(hbi hbiVar) {
        hbiVar.c(this.h, this.f24087a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nt90.class != obj.getClass()) {
            return false;
        }
        nt90 nt90Var = (nt90) obj;
        return this.f24087a == nt90Var.f24087a && this.b.equals(nt90Var.b) && this.c.equals(nt90Var.c) && this.d == nt90Var.d && this.e == nt90Var.e && this.f == nt90Var.f && this.g == nt90Var.g && Arrays.equals(this.h, nt90Var.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((ua80.b(ua80.b((527 + this.f24087a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
