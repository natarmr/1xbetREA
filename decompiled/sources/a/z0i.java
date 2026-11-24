package a;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z0i implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43567a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z0i(Object obj, byte b) {
        this.f43567a = b;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Window window;
        View decorView;
        Resources resources;
        DisplayMetrics displayMetrics;
        byte b = this.f43567a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                DSLottieEmptyContainer.d((DSLottieEmptyContainer) obj);
                break;
            case 1:
                ((zly) obj).a1();
                break;
            case 2:
                int i2 = LottieView.o1;
                ((LottieView) obj).F();
                break;
            case 3:
                ymd0 ymd0Var = (ymd0) obj;
                fl70 fl70Var = ymd0.o2;
                Rect rect = new Rect();
                kxq kxqVarB = ymd0Var.B();
                if (kxqVarB != null && (window = kxqVarB.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                    decorView.getWindowVisibleDisplayFrame(rect);
                    Context contextD = ymd0Var.D();
                    if (contextD != null && (resources = contextD.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                        i = displayMetrics.heightPixels;
                    }
                    int i3 = i - rect.bottom;
                    Dialog dialog = ymd0Var.S1;
                    wo8 wo8Var = dialog instanceof wo8 ? (wo8) dialog : null;
                    if (wo8Var != null) {
                        if (wo8Var.g == null) {
                            wo8Var.g();
                        }
                        BottomSheetBehavior bottomSheetBehavior = wo8Var.g;
                        if (bottomSheetBehavior != null) {
                            decorView.post(new vmd0(i3, bottomSheetBehavior, i));
                            break;
                        }
                    }
                }
                break;
            default:
                sbx0 sbx0Var = (sbx0) obj;
                ViewPager2 viewPager2 = (ViewPager2) sbx0Var.c;
                sbx0Var.i(0.0f, viewPager2 != null ? viewPager2.getCurrentItem() : 0);
                break;
        }
    }
}
