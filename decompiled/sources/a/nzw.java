package a;

/* JADX INFO: loaded from: classes.dex */
public final class nzw implements fpt0, w0x, uox {
    public static final u15 b;
    public static final u15 c;
    public static final u15 d;
    public static final u15 e;
    public static final u15 f;
    public static final u15 g;
    public static final u15 h;
    public static final u15 i;
    public static final u15 j;
    public static final u15 k;
    public static final u15 l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b780 f24392a;

    static {
        Class cls = Integer.TYPE;
        b = new u15("camerax.core.imageCapture.captureMode", cls, null);
        c = new u15("camerax.core.imageCapture.flashMode", cls, null);
        d = new u15("camerax.core.imageCapture.captureBundle", s7a.class, null);
        e = new u15("camerax.core.imageCapture.bufferFormat", Integer.class, null);
        f = new u15("camerax.core.imageCapture.outputFormat", Integer.class, null);
        g = new u15("camerax.core.imageCapture.imageReaderProxyProvider", f1x.class, null);
        h = new u15("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE, null);
        i = new u15("camerax.core.imageCapture.flashType", cls, null);
        j = new u15("camerax.core.imageCapture.jpegCompressionQuality", cls, null);
        k = new u15("camerax.core.imageCapture.screenFlash", kzw.class, null);
        l = new u15("camerax.core.useCase.isPostviewEnabled", Boolean.class, null);
    }

    public nzw(b780 b780Var) {
        this.f24392a = b780Var;
    }

    @Override // a.qae0
    public final drd a() {
        return this.f24392a;
    }

    @Override // a.h0x
    public final int k() {
        return ((Integer) d(h0x.h0)).intValue();
    }
}
