package a;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public final class jva extends l900 {
    public final /* synthetic */ byte q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jva(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.q = (byte) 0;
    }

    @Override // a.she0
    public PointF a(int i) {
        switch (this.q) {
            case 0:
                return null;
            default:
                return super.a(i);
        }
    }

    @Override // a.l900
    public int i(int i, int i2, int i3, int i4, int i5) {
        switch (this.q) {
            case 2:
                return (i3 - i) + 1;
            default:
                return super.i(i, i2, i3, i4, i5);
        }
    }

    @Override // a.l900
    public int j(View view, int i) {
        switch (this.q) {
            case 0:
                return 0;
            default:
                return super.j(view, i);
        }
    }

    @Override // a.l900
    public int k(View view, int i) {
        switch (this.q) {
            case 0:
                return 0;
            default:
                return super.k(view, i);
        }
    }

    @Override // a.l900
    public float l(DisplayMetrics displayMetrics) {
        switch (this.q) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            case 2:
                return super.l(displayMetrics) * 4.0f;
            default:
                return super.l(displayMetrics);
        }
    }

    @Override // a.l900
    public int n() {
        switch (this.q) {
            case 2:
                return -1;
            default:
                return super.n();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jva(Context context, byte b) {
        super(context);
        this.q = b;
    }
}
