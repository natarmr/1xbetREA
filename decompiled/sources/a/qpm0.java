package a;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class qpm0 extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29127a = 0;
    public final Object b;

    public qpm0(ejd ejdVar) {
        ejdVar.getClass();
        this.b = ejdVar;
    }

    @Override // a.fhe0
    public void f(Rect rect, View view, RecyclerView recyclerView, the0 the0Var) {
        switch (this.f29127a) {
            case 1:
                rect.getClass();
                view.getClass();
                the0Var.getClass();
                int dimensionPixelSize = ((z8s0) this.b).G().getDimensionPixelSize(R.dimen.space_8);
                rect.left = dimensionPixelSize;
                rect.right = dimensionPixelSize;
                rect.bottom = dimensionPixelSize;
                rect.top = dimensionPixelSize;
                break;
            default:
                super.f(rect, view, recyclerView, the0Var);
                break;
        }
    }

    @Override // a.fhe0
    public void h(Canvas canvas, RecyclerView recyclerView, the0 the0Var) {
        int top;
        switch (this.f29127a) {
            case 0:
                Function1 function1 = (Function1) this.b;
                canvas.getClass();
                the0Var.getClass();
                if (recyclerView.getChildCount() != 0) {
                    View childAt = recyclerView.getChildAt(0);
                    int iU = RecyclerView.U(childAt);
                    childAt.getClass();
                    ImageView imageView = (ImageView) childAt.findViewById(R.id.ivDiscipline);
                    if (iU != -1 && imageView != null && imageView.getVisibility() != 8) {
                        int childCount = recyclerView.getChildCount();
                        int i = Integer.MAX_VALUE;
                        for (int i2 = 1; i2 < childCount; i2++) {
                            View childAt2 = recyclerView.getChildAt(i2);
                            int iU2 = RecyclerView.U(childAt2);
                            if (iU2 != -1 && ((Boolean) function1.invoke(Integer.valueOf(iU2))).booleanValue() && ((ImageView) childAt2.findViewById(R.id.ivDiscipline)) != null && (top = (childAt2.getTop() - imageView.getHeight()) - 20) < i) {
                                i = top;
                            }
                        }
                        if (i >= 0) {
                            i = 0;
                        }
                        int childCount2 = recyclerView.getChildCount();
                        for (int i3 = 0; i3 < childCount2; i3++) {
                            View childAt3 = recyclerView.getChildAt(i3);
                            int iU3 = RecyclerView.U(childAt3);
                            ImageView imageView2 = (ImageView) childAt3.findViewById(R.id.ivDiscipline);
                            if (iU3 == iU) {
                                imageView2.setAlpha(0.0f);
                            } else if (((Boolean) function1.invoke(Integer.valueOf(iU3))).booleanValue()) {
                                imageView2.setAlpha(1.0f);
                            }
                        }
                        Integer numValueOf = Integer.valueOf(recyclerView.getLayoutDirection() == 1 ? (recyclerView.getWidth() - recyclerView.getPaddingRight()) - imageView.getWidth() : recyclerView.getPaddingLeft());
                        Integer numValueOf2 = Integer.valueOf(i + 20);
                        int iIntValue = numValueOf.intValue();
                        int iIntValue2 = numValueOf2.intValue();
                        canvas.save();
                        canvas.translate(iIntValue, iIntValue2);
                        imageView.draw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
        }
    }

    public qpm0(z8s0 z8s0Var) {
        this.b = z8s0Var;
    }
}
