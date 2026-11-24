package a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.camera.view.PreviewView;
import androidx.media3.ui.PlayerControlView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g14 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10491a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g14(Object obj, byte b) {
        this.f10491a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height;
        int height2;
        byte b = this.f10491a;
        Object obj = this.b;
        switch (b) {
            case 0:
                k14 k14Var = (k14) obj;
                if (i != i5 || i3 != i7 || i2 != i6 || i4 != i8) {
                    View view2 = k14Var.f17500a;
                    view.getClass();
                    gq80.l0(view2, view, (View) k14Var.h.get(), k14Var.b, k14Var.c, k14Var.d);
                }
                break;
            case 1:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    view.post(new w1((Object) carouselLayoutManager, (byte) 25));
                }
                break;
            case 2:
                PlayerControlView playerControlView = (PlayerControlView) obj;
                float[] fArr = PlayerControlView.i2;
                int i9 = playerControlView.s;
                PopupWindow popupWindow = playerControlView.r;
                int i10 = i4 - i2;
                int i11 = i8 - i6;
                if ((i3 - i != i7 - i5 || i10 != i11) && popupWindow.isShowing()) {
                    playerControlView.u();
                    popupWindow.update(view, (playerControlView.getWidth() - popupWindow.getWidth()) - i9, (-popupWindow.getHeight()) - i9, -1, -1);
                }
                break;
            case 3:
                n1a0 n1a0Var = (n1a0) obj;
                PlayerControlView playerControlView2 = n1a0Var.f22741a;
                int width = (playerControlView2.getWidth() - playerControlView2.getPaddingLeft()) - playerControlView2.getPaddingRight();
                int height3 = (playerControlView2.getHeight() - playerControlView2.getPaddingBottom()) - playerControlView2.getPaddingTop();
                ViewGroup viewGroup = n1a0Var.d;
                int iC = n1a0.c(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int iMax = Math.max(iC, n1a0.c(n1a0Var.l) + n1a0.c(n1a0Var.j));
                ViewGroup viewGroup2 = n1a0Var.e;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                byte b2 = 2;
                int i12 = (height2 * 2) + paddingBottom;
                byte b3 = 1;
                boolean z = width <= iMax || height3 <= i12;
                if (n1a0Var.B != z) {
                    n1a0Var.B = z;
                    view.post(new j1a0(n1a0Var, b3));
                }
                boolean z2 = i3 - i != i7 - i5;
                if (!n1a0Var.B && z2) {
                    view.post(new j1a0(n1a0Var, b2));
                    break;
                }
                break;
            default:
                PreviewView previewView = (PreviewView) obj;
                int i13 = PreviewView.m;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    previewView.a();
                    ofm0.m();
                    previewView.getViewPort();
                }
                break;
        }
    }
}
