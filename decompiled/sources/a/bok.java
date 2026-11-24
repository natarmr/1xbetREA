package a;

/* JADX INFO: loaded from: classes4.dex */
public final class bok implements qge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f2936a;

    public bok(float f) {
        this.f2936a = f;
    }

    @Override // a.qge
    public final long a(long j, long j2) {
        float fIntBitsToFloat = this.f2936a / Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        int i = l1h0.f19253a;
        return jFloatToRawIntBits;
    }
}
