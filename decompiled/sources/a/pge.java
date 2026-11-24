package a;

/* JADX INFO: loaded from: classes.dex */
public final class pge implements qge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26951a;

    public /* synthetic */ pge(byte b) {
        this.f26951a = b;
    }

    @Override // a.qge
    public final long a(long j, long j2) {
        switch (this.f26951a) {
            case 0:
                float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i = l1h0.f19253a;
                return jFloatToRawIntBits;
            case 1:
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                int i2 = l1h0.f19253a;
                return jFloatToRawIntBits2;
            case 2:
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
                int i3 = l1h0.f19253a;
                return jFloatToRawIntBits3;
            case 3:
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
                int i4 = l1h0.f19253a;
                return jFloatToRawIntBits4;
            case 4:
                float fA = nkb.A(j, j2);
                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L);
                int i5 = l1h0.f19253a;
                return jFloatToRawIntBits5;
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i6 = l1h0.f19253a;
                    return jFloatToRawIntBits6;
                }
                float fA2 = nkb.A(j, j2);
                long jFloatToRawIntBits7 = (((long) Float.floatToRawIntBits(fA2)) << 32) | (((long) Float.floatToRawIntBits(fA2)) & 4294967295L);
                int i7 = l1h0.f19253a;
                return jFloatToRawIntBits7;
        }
    }
}
