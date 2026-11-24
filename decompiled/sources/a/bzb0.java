package a;

import android.graphics.Bitmap;
import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bzb0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3458a;
    public final /* synthetic */ krs0 b;
    public final /* synthetic */ s45 c;

    public /* synthetic */ bzb0(krs0 krs0Var, s45 s45Var, byte b) {
        this.f3458a = b;
        this.b = krs0Var;
        this.c = s45Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        byte b = this.f3458a;
        s45 s45Var = this.c;
        krs0 krs0Var = this.b;
        switch (b) {
            case 0:
                dzb0 dzb0Var = s45Var.f31589a;
                try {
                    n45 n45Var = (n45) ((xi70) krs0Var.d).b(s45Var);
                    int i = n45Var.c;
                    z1x.t("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: " + i, i == 35 || i == 256 || i == 4101);
                    ((lmv) j120.T()).execute(new oh60(dzb0Var, (Bitmap) ((bst) krs0Var.j).a(n45Var), (byte) 9));
                    return;
                } catch (Exception e) {
                    s45Var.b.close();
                    l8x.Y("ProcessingNode", "process postview input packet failed.", e);
                    return;
                }
            case 1:
                bzb0 bzb0Var = new bzb0(krs0Var, s45Var, (byte) 2);
                Trace.beginSection("CX:processInputPacket");
                try {
                    bzb0Var.run();
                    return;
                } finally {
                    Trace.endSection();
                }
            default:
                dzb0 dzb0Var2 = s45Var.f31589a;
                try {
                    ((r45) krs0Var.c).d.size();
                    dzb0Var2.getClass();
                    ((lmv) j120.T()).execute(new oh60(dzb0Var2, krs0Var.e(s45Var), (byte) 10));
                    return;
                } catch (ozw e2) {
                    ((lmv) j120.T()).execute(new oh60(dzb0Var2, e2, (byte) 11));
                    return;
                } catch (OutOfMemoryError e3) {
                    ((lmv) j120.T()).execute(new oh60(dzb0Var2, new ozw(0, "Processing failed due to low memory.", e3), (byte) 11));
                    return;
                } catch (RuntimeException e4) {
                    ((lmv) j120.T()).execute(new oh60(dzb0Var2, new ozw(0, "Processing failed.", e4), (byte) 11));
                    return;
                }
        }
    }
}
