package a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes6.dex */
public final class qse extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29254a;
    public final boolean b;
    public final Context c;
    public final int d;
    public final int e;
    public final int f;
    public rse g;
    public Bitmap h;
    public final Paint i;

    public qse(boolean z, boolean z2, Context context) {
        context.getClass();
        this.f29254a = z;
        this.b = z2;
        this.c = context;
        this.d = context.getResources().getDimensionPixelSize(R.dimen.large_horizontal_margin_dynamic);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.size_1);
        this.f = context.getResources().getDimensionPixelSize(R.dimen.space_4);
        this.g = rse.f31027a;
        this.i = new Paint();
    }

    @Override // a.fhe0
    public final void f(Rect rect, View view, RecyclerView recyclerView, the0 the0Var) {
        rse rseVarC;
        int i;
        rect.getClass();
        view.getClass();
        the0Var.getClass();
        super.f(rect, view, recyclerView, the0Var);
        int iU = RecyclerView.U(view);
        if (iU == -1) {
            iU = RecyclerView.V(view);
        }
        if (iU == -1) {
            Log.w(qse.class.getSimpleName(), "No position for item in RecyclerView");
            return;
        }
        xhe0 xhe0VarW = recyclerView.W(view);
        Object objU = xhe0VarW instanceof cp ? ((cp) xhe0VarW).u() : null;
        if (this.f29254a || !(objU instanceof t0m)) {
            rseVarC = rse.f31027a;
            this.g = rseVarC;
        } else {
            rseVarC = ((t0m) objU).c();
            this.g = rseVarC;
        }
        int iOrdinal = rseVarC.ordinal();
        if (iOrdinal != 0) {
            i = iOrdinal != 1 ? 0 : this.e;
        } else {
            i = this.f;
        }
        rect.bottom = i;
    }

    @Override // a.fhe0
    public final void h(Canvas canvas, RecyclerView recyclerView, the0 the0Var) {
        canvas.getClass();
        the0Var.getClass();
        int i = this.d;
        float f = i;
        Context context = this.c;
        Resources resources = context.getResources();
        int i2 = R.dimen.space_16;
        boolean z = this.b;
        boolean z2 = this.f29254a;
        float dimensionPixelSize = f + resources.getDimensionPixelSize((z2 || !z) ? R.dimen.space_16 : R.dimen.space_4);
        if (this.h == null) {
            int width = recyclerView.getWidth() - (i * 2);
            Resources resources2 = context.getResources();
            if (!z2 && z) {
                i2 = R.dimen.space_4;
            }
            int dimensionPixelSize2 = width - (resources2.getDimensionPixelSize(i2) * 2);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dimensionPixelSize2, 1073741824);
            int i3 = this.e;
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            int iOrdinal = this.g.ordinal();
            View kajVar = null;
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    DsSeparator dsSeparator = new DsSeparator(context, null, 6, 0);
                    Context context2 = dsSeparator.getContext();
                    context2.getClass();
                    dsSeparator.setBackgroundColor(m5d.b(R.attr.uikitSeparator, context2));
                    kajVar = dsSeparator;
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return;
                    }
                    kajVar = new kaj(context);
                }
            }
            if (kajVar != null) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize2, i3, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.getClass();
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                kajVar.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                kajVar.layout(0, 0, dimensionPixelSize2, i3);
                kajVar.draw(canvas2);
                this.h = bitmapCreateBitmap;
            }
        }
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            int childCount = recyclerView.getChildCount() - 1;
            for (int i4 = 0; i4 < childCount; i4++) {
                canvas.drawBitmap(bitmap, dimensionPixelSize, recyclerView.getChildAt(i4).getBottom(), this.i);
            }
        }
    }
}
