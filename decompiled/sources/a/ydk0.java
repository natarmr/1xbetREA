package a;

import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.xplatform.uikit.components.snackbar.DsSnackBarView;

/* JADX INFO: loaded from: classes6.dex */
public final class ydk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSnackBarView f42444a;
    public final Paint b;
    public final ArrayList c;
    public final RectF d;
    public float e;
    public float f;
    public float g;
    public float h;

    public ydk0(DsSnackBarView dsSnackBarView) {
        this.f42444a = dsSnackBarView;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.b = paint;
        this.c = new ArrayList();
        this.d = new RectF();
    }

    public final void a(mjj0 mjj0Var) {
        ArrayList<mjj0> arrayList = this.c;
        arrayList.add(mjj0Var);
        float fMin = 0.0f;
        float fMax = 0.0f;
        float fMin2 = 0.0f;
        float fMax2 = 0.0f;
        for (mjj0 mjj0Var2 : arrayList) {
            float f = mjj0Var2.b / 2.0f;
            float f2 = (-0.0f) - f;
            float f3 = f + 0.0f;
            float f4 = mjj0Var2.f21898a;
            fMin = Math.min(fMin, f2 + 0.0f);
            fMax = Math.max(fMax, f3 + 0.0f);
            fMin2 = Math.min(fMin2, f2 + f4);
            fMax2 = Math.max(fMax2, f3 + f4);
        }
        this.e = -fMin;
        this.g = fMax;
        this.f = -fMin2;
        this.h = fMax2;
        DsSnackBarView dsSnackBarView = this.f42444a;
        if (dsSnackBarView.isAttachedToWindow()) {
            dsSnackBarView.invalidate();
        }
    }
}
