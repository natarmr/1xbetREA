package a;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class dvb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Size f6735a;
    public final FrameLayout b;
    public final n8z c;
    public boolean d = false;

    public dvb0(FrameLayout frameLayout, n8z n8zVar) {
        this.b = frameLayout;
        this.c = n8zVar;
    }

    public abstract View a();

    public abstract Bitmap b();

    public abstract void e(pmn0 pmn0Var, hi hiVar);

    public final void f() {
        View viewA = a();
        if (viewA == null || !this.d) {
            return;
        }
        FrameLayout frameLayout = this.b;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        n8z n8zVar = this.c;
        n8zVar.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            l8x.E0("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (n8zVar.h()) {
            if (viewA instanceof TextureView) {
                ((TextureView) viewA).setTransform(n8zVar.f());
            } else {
                Display display = viewA.getDisplay();
                boolean z = false;
                boolean z2 = (!n8zVar.d || display == null || display.getRotation() == n8zVar.b) ? false : true;
                boolean z3 = n8zVar.d;
                if (!z3) {
                    if ((!z3 ? n8zVar.f23114a : -hp4.K(n8zVar.b)) != 0) {
                        z = true;
                    }
                }
                if (z2 || z) {
                    l8x.X("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF rectFG = n8zVar.g(layoutDirection, size);
            viewA.setPivotX(0.0f);
            viewA.setPivotY(0.0f);
            viewA.setScaleX(rectFG.width() / ((Size) n8zVar.e).getWidth());
            viewA.setScaleY(rectFG.height() / ((Size) n8zVar.e).getHeight());
            viewA.setTranslationX(rectFG.left - viewA.getLeft());
            viewA.setTranslationY(rectFG.top - viewA.getTop());
        }
    }

    public ig00 g() {
        return m3x.c;
    }

    public void c() {
    }

    public void d() {
    }
}
