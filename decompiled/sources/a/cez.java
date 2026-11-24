package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class cez extends p4 {
    public final boolean c;
    public final ydz d;
    public final jbz e;
    public final kez f;
    public final /* synthetic */ dez g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cez(dez dezVar, boolean z, ydz ydzVar, jbz jbzVar, kez kezVar) {
        super((byte) 6);
        this.g = dezVar;
        this.c = z;
        this.d = ydzVar;
        this.e = jbzVar;
        this.f = kezVar;
    }

    public final hez n1(int i, long j) {
        int i2;
        long jH;
        ydz ydzVar = this.d;
        Object objD = ydzVar.d(i);
        Object objA = ydzVar.b.a(i);
        kez kezVar = this.f;
        int[] iArr = kezVar.b;
        int length = iArr.length;
        int i3 = (int) (j >> 32);
        int i4 = length - 1;
        if (i3 <= i4) {
            i4 = i3;
        }
        int i5 = ((int) (j & 4294967295L)) - i3;
        int i6 = length - i4;
        if (i5 > i6) {
            i5 = i6;
        }
        if (i5 == 1) {
            i2 = iArr[i4];
        } else {
            int[] iArr2 = kezVar.f18173a;
            int i7 = (i4 + i5) - 1;
            i2 = (iArr2[i7] + iArr[i7]) - iArr2[i4];
        }
        if (this.c) {
            if (i2 < 0) {
                zcx.a("width must be >= 0");
            }
            jH = r4e.h(i2, i2, 0, Integer.MAX_VALUE);
        } else {
            if (i2 < 0) {
                zcx.a("height must be >= 0");
            }
            jH = r4e.h(0, Integer.MAX_VALUE, i2, i2);
        }
        long j2 = jH;
        List listZ0 = z0(this.e, i, j2);
        dez dezVar = this.g;
        return new hez(i, objD, listZ0, dezVar.f, dezVar.l, i4, i5, dezVar.j, dezVar.k, objA, dezVar.f5975a.t, j2);
    }

    @Override // a.p4
    public final kbz w0(int i, int i2, int i3, long j) {
        ydz ydzVar = this.d;
        Object objD = ydzVar.d(i);
        Object objA = ydzVar.b.a(i);
        List listZ0 = z0(this.e, i, j);
        dez dezVar = this.g;
        return new hez(i, objD, listZ0, dezVar.f, dezVar.l, i2, i3, dezVar.j, dezVar.k, objA, dezVar.f5975a.t, j);
    }
}
