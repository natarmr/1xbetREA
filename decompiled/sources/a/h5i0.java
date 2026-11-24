package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class h5i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zai0 f12481a = new zai0("SelectionHandleInfo");

    public static final long a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
