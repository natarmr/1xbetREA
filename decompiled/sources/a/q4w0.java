package a;

/* JADX INFO: loaded from: classes2.dex */
public final class q4w0 {
    public static final q4w0 b = new q4w0();
    public static final int c;
    public static final int d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bnk f28122a = new bnk((byte) 2);

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        c = iAvailableProcessors + 1;
        d = (iAvailableProcessors * 2) + 1;
    }
}
