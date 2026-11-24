package a;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class is5 extends LinearLayout implements gr5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15287a;
    public final ms5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is5(Context context) {
        super(context, null);
        context.getClass();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_96);
        this.f15287a = dimensionPixelSize;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.size_96);
        ms5 ms5Var = new ms5(context);
        ms5Var.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize2));
        addView(ms5Var);
        this.b = ms5Var;
        setOrientation(1);
        setTag("BannerSquareSNoTitleItemsView");
    }

    @Override // a.gr5
    public final void a(o0x o0xVar, gp5 gp5Var) {
        o0xVar.getClass();
        gp5Var.getClass();
        this.b.a(o0xVar, gp5Var);
    }

    @Override // a.gr5
    public String getLoadedImageUrl() {
        return this.b.getLoadedImageUrl();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f15287a, 1073741824), i2);
    }

    @Override // a.gr5
    public void setDecoratorImage(o0x o0xVar) {
        this.b.setDecoratorImage(o0xVar);
    }

    @Override // a.gr5
    public void setTag(String str) {
        str.getClass();
        this.b.setTag(str);
        invalidate();
    }

    @Override // a.gr5
    public void setTagColor(goo0 goo0Var) {
        this.b.setTagColor(goo0Var);
        invalidate();
    }

    @Override // a.gr5
    public void setTitle(String str) {
        str.getClass();
    }
}
