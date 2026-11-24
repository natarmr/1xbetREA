package a;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class s8m0 implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x68 f31810a;
    public final /* synthetic */ hie0 b;

    public s8m0(x68 x68Var, hie0 hie0Var) {
        this.f31810a = x68Var;
        this.b = hie0Var;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [a.p8m0] */
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size = imageInfo.getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        final x68 x68Var = this.f31810a;
        a780 a780Var = x68Var.b;
        f7k0 f7k0Var = a780Var.b;
        j1h0 j1h0Var = a780Var.c;
        kuo kuoVar = q1x.b;
        long jZ = u1c.z(width, height, f7k0Var, j1h0Var, (f7k0) qbc.Q(a780Var, kuoVar));
        int i = (int) (jZ >> 32);
        int i2 = (int) (jZ & 4294967295L);
        if (width > 0 && height > 0 && (width != i || height != i2)) {
            a780 a780Var2 = x68Var.b;
            double dA = u1c.A(width, height, i, i2, a780Var2.c, (f7k0) qbc.Q(a780Var2, kuoVar));
            boolean z = dA < 1.0d;
            this.b.f13108a = z;
            if (z || x68Var.b.d == asb0.f1383a) {
                imageDecoder.setTargetSize(si30.a(((double) width) * dA), si30.a(dA * ((double) height)));
            }
        }
        imageDecoder.setOnPartialImageListener(new ImageDecoder.OnPartialImageListener() { // from class: a.p8m0
            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return ((Boolean) qbc.Q(x68Var.b, t1x.f)).booleanValue();
            }
        });
        a780 a780Var3 = x68Var.b;
        imageDecoder.setAllocator(cy2.C(t1x.e(a780Var3)) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!((Boolean) qbc.Q(a780Var3, t1x.h)).booleanValue() ? 1 : 0);
        kuo kuoVar2 = t1x.c;
        if (c0g.c(qbc.Q(a780Var3, kuoVar2)) != null) {
            imageDecoder.setTargetColorSpace(c0g.c(qbc.Q(a780Var3, kuoVar2)));
        }
        imageDecoder.setUnpremultipliedRequired(!((Boolean) qbc.Q(a780Var3, t1x.d)).booleanValue());
    }
}
