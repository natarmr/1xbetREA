package a;

/* JADX INFO: loaded from: classes.dex */
public enum upt0 {
    c("PREVIEW"),
    d("IMAGE_CAPTURE"),
    e("IMAGE_ANALYSIS"),
    f("VIDEO_CAPTURE"),
    g("STREAM_SHARING"),
    h("UNDEFINED");

    public static final sxs0 b = new sxs0((byte) 4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f36084a;

    upt0(String str) {
        this.f36084a = cls;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "Preview";
        }
        if (iOrdinal == 1) {
            return "ImageCapture";
        }
        if (iOrdinal == 2) {
            return "ImageAnalysis";
        }
        if (iOrdinal == 3) {
            return "VideoCapture";
        }
        if (iOrdinal == 4) {
            return "StreamSharing";
        }
        if (iOrdinal == 5) {
            return "Undefined";
        }
        t9f.b();
        return null;
    }
}
