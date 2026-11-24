package a;

/* JADX INFO: loaded from: classes4.dex */
public final class rqk implements qge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f30935a;
    public final /* synthetic */ float b;

    public rqk(float f, boolean z) {
        this.f30935a = z;
        this.b = f;
    }

    @Override // a.qge
    public final long a(long j, long j2) {
        if (this.f30935a) {
            float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
            int i = l1h0.f19253a;
            return jFloatToRawIntBits;
        }
        float fIntBitsToFloat = this.b / Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        int i2 = l1h0.f19253a;
        return jFloatToRawIntBits2;
    }
}
