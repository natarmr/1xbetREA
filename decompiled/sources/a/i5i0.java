package a;

/* JADX INFO: loaded from: classes5.dex */
public abstract class i5i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q73 f14194a = new q73(Float.NaN, Float.NaN);
    public static final lxs0 b = new lxs0(new eoh0((byte) 16), new eoh0((byte) 17));
    public static final long c;
    public static final nul0 d;

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        c = jFloatToRawIntBits;
        d = new nul0(new ne60(jFloatToRawIntBits), 3);
    }
}
