package org.xplatform.bonus_games.impl.core.presentation.views;

import a.bkx;
import a.l1e0;
import a.twn;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.Iterator;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class BetGameShopDotIndicatorView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f46437a;
    public final Drawable b;
    public final int c;
    public final boolean d;
    public int e;
    public int f;

    /* JADX WARN: Illegal instructions before constructor call */
    public BetGameShopDotIndicatorView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        Drawable drawable = context.getDrawable(R.drawable.bet_game_shop_dot);
        this.f46437a = drawable;
        Drawable drawable2 = context.getDrawable(R.drawable.bet_game_shop_dot_highlight);
        this.b = drawable2;
        this.c = (int) context.getResources().getDimension(R.dimen.space_8);
        this.d = context.getResources().getConfiguration().getLayoutDirection() == 1;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        }
    }

    public final int getCount() {
        return this.e;
    }

    public final int getHighlighted() {
        return this.f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        Rect bounds;
        canvas.getClass();
        int i = this.d ? (this.e - this.f) - 1 : this.f;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        Iterator it = l1e0.o(0, this.e).iterator();
        while (it.hasNext()) {
            int iNextInt = ((bkx) it).nextInt();
            int iSave = canvas.save();
            canvas.translate(paddingLeft, paddingRight);
            Drawable drawable2 = this.f46437a;
            if (iNextInt == i) {
                try {
                    drawable = this.b;
                } catch (Throwable th) {
                    canvas.restoreToCount(iSave);
                    throw th;
                }
            } else {
                drawable = drawable2;
            }
            if (drawable != null) {
                drawable.draw(canvas);
            }
            canvas.restoreToCount(iSave);
            paddingLeft += ((drawable2 == null || (bounds = drawable2.getBounds()) == null) ? 0 : bounds.width()) + this.c;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Drawable drawable = this.f46437a;
        if (drawable != null) {
            int iWidth = drawable.getBounds().width();
            int i3 = this.e;
            setMeasuredDimension(getPaddingRight() + getPaddingLeft() + twn.b(i3, 1, this.c, iWidth * i3), getPaddingBottom() + getPaddingTop() + drawable.getBounds().height());
        }
    }

    public final void setCount(int i) {
        this.e = i;
        requestLayout();
    }

    public final void setHighlighted(int i) {
        this.f = i;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BetGameShopDotIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BetGameShopDotIndicatorView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
