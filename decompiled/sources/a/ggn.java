package a;

/* JADX INFO: loaded from: classes.dex */
public final class ggn implements yjj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11258a;
    public final float b;

    public ggn(float f, float f2) {
        this.f11258a = f;
        this.b = f2;
    }

    @Override // a.yjj0
    public final x1x a(long j, k6z k6zVar, w6k w6kVar) {
        k6zVar.getClass();
        w6kVar.getClass();
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = this.b * (Float.intBitsToFloat(i) > 0.0f ? Float.intBitsToFloat(i) / this.f11258a : 1.0f);
        return new pe80(r8x.v(0.0f, 0.0f, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat(i), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L)));
    }
}
