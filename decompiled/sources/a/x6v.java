package a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class x6v extends ViewGroup implements u6v {
    public static final /* synthetic */ int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f40383a;
    public View b;
    public final View c;
    public int d;
    public Matrix e;
    public final cle f;

    public x6v(View view) {
        super(view.getContext());
        this.f = new cle(this, (byte) 1);
        this.c = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    @Override // a.u6v
    public final void a(View view, ViewGroup viewGroup) {
        this.f40383a = viewGroup;
        this.b = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = this.c;
        view.setTag(R.id.ghost_view, this);
        view.getViewTreeObserver().addOnPreDrawListener(this.f);
        bmu0.c(view, 4);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view = this.c;
        view.getViewTreeObserver().removeOnPreDrawListener(this.f);
        bmu0.c(view, 0);
        view.setTag(R.id.ghost_view, null);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        q8a.M(canvas, true);
        canvas.setMatrix(this.e);
        View view = this.c;
        bmu0.c(view, 0);
        view.invalidate();
        bmu0.c(view, 4);
        drawChild(canvas, view, getDrawingTime());
        q8a.M(canvas, false);
    }

    @Override // android.view.View, a.u6v
    public final void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.c;
        if (((x6v) view.getTag(R.id.ghost_view)) == this) {
            bmu0.c(view, i == 0 ? 4 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
