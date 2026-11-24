package a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import org.xplatform.ui_core.viewcomponents.layouts.linear.ShimmerLinearLayout;
import org.xplatform.ui_core.viewcomponents.layouts.linear.ShimmerListView;

/* JADX INFO: loaded from: classes6.dex */
public final class iqj0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15212a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ LinearLayout c;

    public /* synthetic */ iqj0(LinearLayout linearLayout, Context context, byte b) {
        this.f15212a = b;
        this.c = linearLayout;
        this.b = context;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        byte b = this.f15212a;
        Context context = this.b;
        LinearLayout linearLayout = this.c;
        int i = 0;
        switch (b) {
            case 0:
                ShimmerLinearLayout shimmerLinearLayout = (ShimmerLinearLayout) linearLayout;
                if (shimmerLinearLayout.getMeasuredWidth() > 0 && shimmerLinearLayout.getMeasuredHeight() > 0) {
                    shimmerLinearLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    Integer num = shimmerLinearLayout.d;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        View viewInflate = LayoutInflater.from(context).inflate(iIntValue, (ViewGroup) null);
                        shimmerLinearLayout.addView(viewInflate);
                        viewInflate.measure(viewInflate.getMeasuredWidth(), viewInflate.getMeasuredHeight());
                        int orientation = shimmerLinearLayout.getOrientation();
                        if (orientation == 0) {
                            int width = ((shimmerLinearLayout.getWidth() - shimmerLinearLayout.getOccupiedWidthSpace()) / viewInflate.getMeasuredWidth()) + 1;
                            while (i < width) {
                                shimmerLinearLayout.addView(LayoutInflater.from(shimmerLinearLayout.getContext()).inflate(iIntValue, (ViewGroup) null));
                                i++;
                            }
                            break;
                        } else if (orientation == 1) {
                            int height = ((shimmerLinearLayout.getHeight() - shimmerLinearLayout.getOccupiedHeightSpace()) / viewInflate.getMeasuredHeight()) + 1;
                            while (i < height) {
                                shimmerLinearLayout.addView(LayoutInflater.from(shimmerLinearLayout.getContext()).inflate(iIntValue, (ViewGroup) null));
                                i++;
                            }
                            break;
                        }
                    }
                }
                break;
            default:
                ShimmerListView shimmerListView = (ShimmerListView) linearLayout;
                if (shimmerListView.getMeasuredWidth() > 0 && shimmerListView.getMeasuredHeight() > 0) {
                    shimmerListView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    Integer num2 = shimmerListView.b;
                    if (num2 != null) {
                        int iIntValue2 = num2.intValue();
                        View viewInflate2 = LayoutInflater.from(context).inflate(iIntValue2, (ViewGroup) null);
                        shimmerListView.addView(viewInflate2);
                        viewInflate2.measure(viewInflate2.getMeasuredWidth(), viewInflate2.getMeasuredHeight());
                        int orientation2 = shimmerListView.getOrientation();
                        if (orientation2 == 0) {
                            int width2 = ((shimmerListView.getWidth() - shimmerListView.getOccupiedWidthSpace()) / viewInflate2.getMeasuredWidth()) + 1;
                            while (i < width2) {
                                shimmerListView.addView(LayoutInflater.from(shimmerListView.getContext()).inflate(iIntValue2, (ViewGroup) null));
                                i++;
                            }
                            break;
                        } else if (orientation2 == 1) {
                            int height2 = ((shimmerListView.getHeight() - shimmerListView.getOccupiedHeightSpace()) / viewInflate2.getMeasuredHeight()) + 1;
                            while (i < height2) {
                                shimmerListView.addView(LayoutInflater.from(shimmerListView.getContext()).inflate(iIntValue2, (ViewGroup) null));
                                i++;
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }
}
