package a;

/* JADX INFO: loaded from: classes.dex */
public final class myw implements fpt0, w0x, bcq0 {
    public static final u15 b = new u15("camerax.core.imageAnalysis.backpressureStrategy", fyw.class, null);
    public static final u15 c = new u15("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE, null);
    public static final u15 d = new u15("camerax.core.imageAnalysis.imageReaderProxyProvider", f1x.class, null);
    public static final u15 e = new u15("camerax.core.imageAnalysis.outputImageFormat", iyw.class, null);
    public static final u15 f = new u15("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class, null);
    public static final u15 g = new u15("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b780 f22623a;

    public myw(b780 b780Var) {
        this.f22623a = b780Var;
    }

    @Override // a.qae0
    public final drd a() {
        return this.f22623a;
    }

    @Override // a.h0x
    public final int k() {
        return 35;
    }
}
