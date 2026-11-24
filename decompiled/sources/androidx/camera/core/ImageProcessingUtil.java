package androidx.camera.core;

import a.b1x;
import a.ibe0;
import a.jf4;
import a.l8x;
import a.nyw;
import a.oyw;
import a.v4i0;
import a.z1x;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImageProcessingUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f45331a;

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static b1x a(ibe0 ibe0Var, byte[] bArr) {
        z1x.u(ibe0Var.h() == 256);
        bArr.getClass();
        Surface surface = ibe0Var.getSurface();
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            l8x.X("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        b1x b1xVarB = ibe0Var.b();
        if (b1xVarB == null) {
            l8x.X("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return b1xVarB;
    }

    public static Bitmap b(b1x b1xVar) {
        if (b1xVar.getFormat() != 35) {
            jf4.o("Input image format must be YUV_420_888");
            return null;
        }
        int iJ = b1xVar.j();
        int iF = b1xVar.f();
        int iK = b1xVar.l0()[0].k();
        int iK2 = b1xVar.l0()[1].k();
        int iK3 = b1xVar.l0()[2].k();
        int iJ2 = b1xVar.l0()[0].j();
        int iJ3 = b1xVar.l0()[1].j();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(b1xVar.j(), b1xVar.f(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(b1xVar.l0()[0].i(), iK, b1xVar.l0()[1].i(), iK2, b1xVar.l0()[2].i(), iK3, iJ2, iJ3, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), iJ, iF) == 0) {
            return bitmapCreateBitmap;
        }
        v4i0.p("YUV to RGB conversion failed");
        return null;
    }

    public static oyw c(b1x b1xVar, ibe0 ibe0Var, ByteBuffer byteBuffer, int i) {
        if (b1xVar.getFormat() != 35 || b1xVar.l0().length != 3) {
            l8x.X("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            l8x.X("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        if (nativeConvertAndroid420ToABGR(b1xVar.l0()[0].i(), b1xVar.l0()[0].k(), b1xVar.l0()[1].i(), b1xVar.l0()[1].k(), b1xVar.l0()[2].i(), b1xVar.l0()[2].k(), b1xVar.l0()[0].j(), b1xVar.l0()[1].j(), ibe0Var.getSurface(), byteBuffer, b1xVar.j(), b1xVar.f(), 0, 0, 0, i) != 0) {
            l8x.X("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            l8x.U("ImageProcessingUtil", "Image processing performance profiling, duration: [" + (System.currentTimeMillis() - jCurrentTimeMillis) + "], image count: " + f45331a);
            f45331a = f45331a + 1;
        }
        b1x b1xVarB = ibe0Var.b();
        if (b1xVarB == null) {
            l8x.X("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        oyw oywVar = new oyw(b1xVarB);
        oywVar.a(new nyw(b1xVarB, b1xVar));
        return oywVar;
    }

    public static void d(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static void e(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            l8x.X("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Bitmap bitmap, int i6, int i7, int i8);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
