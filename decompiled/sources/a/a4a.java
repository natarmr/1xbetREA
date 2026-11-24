package a;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class a4a extends bnn0 implements Function2 {
    public final /* synthetic */ d4a i;
    public final /* synthetic */ Bitmap j;
    public final /* synthetic */ Rect k;
    public final /* synthetic */ float l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4a(d4a d4aVar, Bitmap bitmap, Rect rect, float f, yje yjeVar) {
        super(2, yjeVar);
        this.i = d4aVar;
        this.j = bitmap;
        this.k = rect;
        this.l = f;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new a4a(this.i, this.j, this.k, this.l, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a4a) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0041  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        Bitmap bitmap = this.j;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        List list = d4a.o;
        d4a d4aVar = this.i;
        Size size = d4aVar.c;
        if (width >= height) {
            size = new Size(size.getHeight(), size.getWidth());
        }
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Rect rect = this.k;
        if (rect.width() + rect.left <= width2) {
            if (rect.height() + rect.top > height2) {
                int i = rect.left + rect.right;
                double d = ((double) width2) / ((double) i);
                double d2 = ((double) height2) / ((double) (rect.top + rect.bottom));
                rect = new Rect(si30.a(((double) rect.left) * d), si30.a(((double) rect.top) * d2), si30.a(((double) rect.right) * d), si30.a(((double) rect.bottom) * d2));
            }
        } else {
            int i2 = rect.left + rect.right;
            double d3 = ((double) width2) / ((double) i2);
            double d4 = ((double) height2) / ((double) (rect.top + rect.bottom));
            rect = new Rect(si30.a(((double) rect.left) * d3), si30.a(((double) rect.top) * d4), si30.a(((double) rect.right) * d3), si30.a(((double) rect.bottom) * d4));
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        bitmapCreateBitmap.getClass();
        bitmap.recycle();
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, size.getWidth(), size.getHeight(), false);
        bitmapCreateScaledBitmap.getClass();
        bitmapCreateBitmap.recycle();
        Matrix matrix = new Matrix();
        if (((ez9) d4aVar.f.getValue()).f8661a == 0) {
            matrix.preScale(-1.0f, 1.0f);
        }
        matrix.preRotate(this.l);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateScaledBitmap, 0, 0, bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight(), matrix, true);
        bitmapCreateBitmap2.getClass();
        bitmapCreateScaledBitmap.recycle();
        return bitmapCreateBitmap2;
    }
}
