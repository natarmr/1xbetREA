package a;

/* JADX INFO: loaded from: classes.dex */
public final class ljc implements yjj0 {
    public static final ljc b = new ljc(0);
    public static final ljc c = new ljc(1);
    public static final ljc d = new ljc(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20142a;

    public /* synthetic */ ljc(byte b2) {
        this.f20142a = b2;
    }

    @Override // a.yjj0
    public final x1x a(long j, k6z k6zVar, w6k w6kVar) {
        switch (this.f20142a) {
            case 0:
                float fD = h7k0.d(j) / 2.0f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fD)) & 4294967295L);
                return new pe80(r8x.u(k9x.r(0L, j), jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits));
            case 1:
                float fT = w6kVar.T(30.0f);
                return new oe80(new jge0(0.0f, -fT, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fT));
            case 2:
                float fT2 = w6kVar.T(30.0f);
                return new oe80(new jge0(-fT2, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fT2, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new oe80(k9x.r(0L, j));
        }
    }

    public String toString() {
        switch (this.f20142a) {
            case 3:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
