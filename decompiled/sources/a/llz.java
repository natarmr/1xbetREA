package a;

/* JADX INFO: loaded from: classes.dex */
public final class llz extends diu0 {
    public final ey40 b;

    public llz() {
        ey40 ey40Var = hkx.f13229a;
        this.b = new ey40();
    }

    @Override // a.diu0
    public final void v() {
        ey40 ey40Var = this.b;
        int[] iArr = ey40Var.b;
        Object[] objArr = ey40Var.c;
        long[] jArr = ey40Var.f11466a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        vy40 vy40Var = (vy40) objArr[i4];
                        Object[] objArr2 = vy40Var.f38232a;
                        int i6 = vy40Var.b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            klz klzVar = (klz) objArr2[i7];
                            s5a s5aVar = klzVar.d;
                            if (s5aVar != null) {
                                s5aVar.cancel();
                            }
                            klzVar.d = null;
                            zn20 zn20Var = (zn20) klzVar.f18514a.b;
                            zn20Var.b = true;
                            zn20Var.f44653a = false;
                            zn20Var.a();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
