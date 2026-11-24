package a;

/* JADX INFO: loaded from: classes6.dex */
public final class nw3 implements pw3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24216a;

    @Override // a.ow3, a.sw3
    public final float a() {
        switch (this.f24216a) {
        }
        return 0.0f;
    }

    @Override // a.ow3
    public final void b(w6k w6kVar, int i, int[] iArr, k6z k6zVar, int[] iArr2) {
        switch (this.f24216a) {
            case 0:
                if (k6zVar != k6z.f17794a) {
                    uc9.Z(i, iArr, iArr2, true);
                } else {
                    uc9.Z(i, iArr, iArr2, false);
                }
                break;
            case 1:
                if (k6zVar != k6z.f17794a) {
                    uc9.a0(i, iArr, iArr2, true);
                } else {
                    uc9.a0(i, iArr, iArr2, false);
                }
                break;
            case 2:
                if (k6zVar != k6z.f17794a) {
                    uc9.b0(i, iArr, iArr2, true);
                } else {
                    uc9.b0(i, iArr, iArr2, false);
                }
                break;
            default:
                if (k6zVar != k6z.f17794a) {
                    uc9.c0(i, iArr, iArr2, true);
                } else {
                    uc9.c0(i, iArr, iArr2, false);
                }
                break;
        }
    }

    @Override // a.sw3
    public final void c(w6k w6kVar, int i, int[] iArr, int[] iArr2) {
        switch (this.f24216a) {
            case 0:
                uc9.Z(i, iArr, iArr2, false);
                break;
            case 1:
                uc9.a0(i, iArr, iArr2, false);
                break;
            case 2:
                uc9.b0(i, iArr, iArr2, false);
                break;
            default:
                uc9.c0(i, iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f24216a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
