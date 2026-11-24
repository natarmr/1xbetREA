package a;

/* JADX INFO: loaded from: classes5.dex */
public final class xog implements vj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41217a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xog(Object obj, byte b) {
        this.f41217a = b;
        this.b = obj;
    }

    @Override // a.vj50
    public final long C(int i, long j) {
        byte b = this.f41217a;
        Object obj = this.b;
        switch (b) {
            case 0:
                int i2 = (int) (j & 4294967295L);
                if (Float.intBitsToFloat(i2) >= 0.0f) {
                    return 0L;
                }
                float fA = ((yog) obj).a(Float.intBitsToFloat(i2));
                return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L);
            default:
                dmg0 dmg0Var = (dmg0) obj;
                int i3 = (int) (j & 4294967295L);
                if (Float.intBitsToFloat(i3) >= 0.0f || !((Boolean) dmg0Var.c.invoke()).booleanValue()) {
                    return 0L;
                }
                float fA2 = dmg0Var.a(Float.intBitsToFloat(i3));
                return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fA2)) & 4294967295L);
        }
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        byte b = this.f41217a;
        Object obj = this.b;
        switch (b) {
            case 0:
                int i2 = (int) (j2 & 4294967295L);
                if (Float.intBitsToFloat(i2) <= 0.0f) {
                    return 0L;
                }
                float fA = ((yog) obj).a(Float.intBitsToFloat(i2));
                return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L);
            default:
                int i3 = (int) (j2 & 4294967295L);
                if (Float.intBitsToFloat(i3) <= 0.0f) {
                    return 0L;
                }
                float fA2 = ((dmg0) obj).a(Float.intBitsToFloat(i3));
                return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fA2)) & 4294967295L);
        }
    }
}
