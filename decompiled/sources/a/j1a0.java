package a;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.PlayerControlView;
import java.util.ArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j1a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15724a;
    public final /* synthetic */ n1a0 b;

    public /* synthetic */ j1a0(n1a0 n1a0Var, byte b) {
        this.f15724a = b;
        this.b = n1a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5 A[LOOP:3: B:37:0x00af->B:39:0x00b5, LOOP_END] */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f15724a;
        n1a0 n1a0Var = this.b;
        switch (b) {
            case 0:
                n1a0Var.k();
                break;
            case 1:
                View view = n1a0Var.k;
                ViewGroup viewGroup = n1a0Var.f;
                if (viewGroup != null) {
                    viewGroup.setVisibility(n1a0Var.B ? 0 : 4);
                }
                if (view != null) {
                    int dimensionPixelSize = n1a0Var.f22741a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (n1a0Var.B) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof zxj) {
                        zxj zxjVar = (zxj) view;
                        Rect rect = zxjVar.f45161a;
                        ValueAnimator valueAnimator = zxjVar.h1;
                        if (n1a0Var.B) {
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            zxjVar.j1 = true;
                            zxjVar.i1 = 0.0f;
                            zxjVar.invalidate(rect);
                        } else {
                            byte b2 = n1a0Var.A;
                            if (b2 == 1) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                zxjVar.j1 = false;
                                zxjVar.i1 = 0.0f;
                                zxjVar.invalidate(rect);
                            } else if (b2 != 3) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                zxjVar.j1 = false;
                                zxjVar.i1 = 1.0f;
                                zxjVar.invalidate(rect);
                            }
                        }
                    }
                }
                for (View view2 : n1a0Var.z) {
                    view2.setVisibility((n1a0Var.B && n1a0.j(view2)) ? 4 : 0);
                }
                break;
            case 2:
                ValueAnimator valueAnimator2 = n1a0Var.s;
                View view3 = n1a0Var.l;
                PlayerControlView playerControlView = n1a0Var.f22741a;
                ViewGroup viewGroup2 = n1a0Var.h;
                ViewGroup viewGroup3 = n1a0Var.g;
                if (viewGroup3 != null && viewGroup2 != null) {
                    int width = (playerControlView.getWidth() - playerControlView.getPaddingLeft()) - playerControlView.getPaddingRight();
                    while (viewGroup2.getChildCount() > 1) {
                        int childCount = viewGroup2.getChildCount() - 2;
                        View childAt = viewGroup2.getChildAt(childCount);
                        viewGroup2.removeViewAt(childCount);
                        viewGroup3.addView(childAt, 0);
                    }
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                    int iC = n1a0.c(n1a0Var.j);
                    int childCount2 = viewGroup3.getChildCount() - 1;
                    for (int i = 0; i < childCount2; i++) {
                        iC += n1a0.c(viewGroup3.getChildAt(i));
                    }
                    if (iC > width) {
                        if (view3 != null) {
                            view3.setVisibility(0);
                            iC += n1a0.c(view3);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < childCount2; i2++) {
                            View childAt2 = viewGroup3.getChildAt(i2);
                            iC -= n1a0.c(childAt2);
                            arrayList.add(childAt2);
                            if (iC <= width) {
                                if (!arrayList.isEmpty()) {
                                    viewGroup3.removeViews(0, arrayList.size());
                                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                        viewGroup2.addView((View) arrayList.get(i3), viewGroup2.getChildCount() - 1);
                                    }
                                }
                            }
                            break;
                        }
                        if (!arrayList.isEmpty()) {
                            viewGroup3.removeViews(0, arrayList.size());
                            while (i3 < arrayList.size()) {
                                viewGroup2.addView((View) arrayList.get(i3), viewGroup2.getChildCount() - 1);
                            }
                        }
                        break;
                    } else {
                        ViewGroup viewGroup4 = n1a0Var.i;
                        if (viewGroup4 != null && viewGroup4.getVisibility() == 0 && !valueAnimator2.isStarted()) {
                            n1a0Var.r.cancel();
                            valueAnimator2.start();
                            break;
                        }
                    }
                }
                break;
            case 3:
                n1a0Var.o.start();
                break;
            case 4:
                n1a0Var.n.start();
                break;
            case 5:
                n1a0Var.m.start();
                n1a0Var.e(n1a0Var.v, 2000L);
                break;
            default:
                n1a0Var.i(2);
                break;
        }
    }
}
