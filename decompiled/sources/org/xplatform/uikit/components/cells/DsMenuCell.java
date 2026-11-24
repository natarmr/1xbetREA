package org.xplatform.uikit.components.cells;

import a.a3e;
import a.a8z;
import a.aim;
import a.bqd0;
import a.hic;
import a.hny;
import a.jab;
import a.jmu0;
import a.k0l;
import a.lrk;
import a.maz;
import a.ndm;
import a.qkm;
import a.ryl;
import a.tw5;
import a.w23;
import a.wej;
import a.wez;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightBanner;

/* JADX INFO: loaded from: classes6.dex */
public final class DsMenuCell extends tw5 {
    public static final /* synthetic */ int g1 = 0;
    public final a8z A;
    public final int B;
    public final int f1;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsMenuCell(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.cellMenuStyle);
        this.A = maz.a(wez.b, new ryl(context, (byte) 10));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.T, R.attr.cellMenuStyle, 0);
        typedArrayObtainStyledAttributes.getClass();
        this.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        this.f1 = typedArrayObtainStyledAttributes.getInt(1, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final ImageView getLoadingPlaceholder() {
        return (ImageView) this.A.getValue();
    }

    @Override // a.tw5, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        KeyEvent.Callback cellRightView = getCellRightView();
        int i = 2;
        if (cellRightView != null) {
            if (cellRightView instanceof DsCellRightBanner) {
                DsCellRightBanner dsCellRightBanner = (DsCellRightBanner) cellRightView;
                if (!dsCellRightBanner.k || dsCellRightBanner.getResources().getConfiguration().screenWidthDp > 375) {
                    dsCellRightBanner.setVisibility(0);
                    int i2 = 0;
                    Class<DsMenuCell> cls = DsMenuCell.class;
                    dsCellRightBanner.setOnLoading$uikit(new wej(0, this, cls, "onLoading", "onLoading()V", i2, (byte) 10));
                    dsCellRightBanner.setOnLoaded$uikit(new k0l(1, this, cls, "onLoaded", "onLoaded(Landroid/graphics/drawable/Drawable;)Z", i2, (byte) 20));
                    dsCellRightBanner.setUpdateAfterSetResource(new lrk(this, dsCellRightBanner, (byte) 28));
                    x(dsCellRightBanner.getDrawable());
                } else {
                    dsCellRightBanner.setOnLoading$uikit(new ndm((byte) 15));
                    dsCellRightBanner.setOnLoaded$uikit(new aim((byte) 3));
                    dsCellRightBanner.setUpdateAfterSetResource(new ndm((byte) 16));
                    dsCellRightBanner.setVisibility(8);
                    View cellMiddleView = getCellMiddleView();
                    if (cellMiddleView != null) {
                        ViewGroup.LayoutParams layoutParams = cellMiddleView.getLayoutParams();
                        if (layoutParams == null) {
                            hny.u("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            return;
                        }
                        a3e a3eVar = (a3e) layoutParams;
                        a3eVar.v = 0;
                        a3eVar.u = -1;
                        a3eVar.setMarginEnd(0);
                        cellMiddleView.setLayoutParams(a3eVar);
                        cellMiddleView.bringToFront();
                    }
                }
            }
            if (cellRightView instanceof jab) {
                ((jab) cellRightView).setLabelMaxLines(2);
            }
        }
        View cellMiddleView2 = getCellMiddleView();
        DsCellMiddleTitle dsCellMiddleTitle = cellMiddleView2 instanceof DsCellMiddleTitle ? (DsCellMiddleTitle) cellMiddleView2 : null;
        if (dsCellMiddleTitle != null) {
            CharSequence subtitle = dsCellMiddleTitle.getSubtitle();
            if (subtitle != null && subtitle.length() != 0) {
                i = 1;
            }
            dsCellMiddleTitle.setTitleMaxLines(i);
            dsCellMiddleTitle.setSubtitleMaxLines(this.f1);
            dsCellMiddleTitle.setSubtitleTextChangeListener$uikit(new qkm(dsCellMiddleTitle));
        }
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        super.setBackgroundTintList(colorStateList);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new w23(this, (byte) 7));
            return;
        }
        View cellLeftView = getCellLeftView();
        DsCellLeftIcon dsCellLeftIcon = cellLeftView instanceof DsCellLeftIcon ? (DsCellLeftIcon) cellLeftView : null;
        if (dsCellLeftIcon != null) {
            dsCellLeftIcon.k.k();
        }
    }

    public final void v(Drawable drawable) {
        removeView(getLoadingPlaceholder());
        View cellLeftView = getCellLeftView();
        if (cellLeftView != null) {
            cellLeftView.setVisibility(0);
        }
        View cellMiddleView = getCellMiddleView();
        if (cellMiddleView != null) {
            cellMiddleView.setVisibility(0);
        }
        View cellRightView = getCellRightView();
        if (cellRightView != null) {
            cellRightView.setVisibility(0);
        }
        x(drawable);
        jmu0.j(this, ColorStateList.valueOf(hic.D(drawable, 0, 0, 7).getPixel(drawable.getLayoutDirection() != 0 ? drawable.getIntrinsicWidth() - 1 : 0, drawable.getIntrinsicHeight() / 2)));
    }

    public final void w() {
        View cellLeftView = getCellLeftView();
        if (cellLeftView != null) {
            cellLeftView.setVisibility(8);
        }
        View cellMiddleView = getCellMiddleView();
        if (cellMiddleView != null) {
            cellMiddleView.setVisibility(8);
        }
        View cellRightView = getCellRightView();
        if (cellRightView != null) {
            cellRightView.setVisibility(8);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_40);
        ImageView loadingPlaceholder = getLoadingPlaceholder();
        a3e a3eVar = new a3e(dimensionPixelSize, dimensionPixelSize);
        a3eVar.i = 0;
        a3eVar.l = 0;
        a3eVar.t = 0;
        a3eVar.v = 0;
        addView(loadingPlaceholder, a3eVar);
    }

    public final void x(Drawable drawable) {
        View cellMiddleView = getCellMiddleView();
        if (cellMiddleView != null) {
            ViewGroup.LayoutParams layoutParams = cellMiddleView.getLayoutParams();
            if (layoutParams == null) {
                hny.u("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            a3e a3eVar = (a3e) layoutParams;
            a3eVar.v = 0;
            a3eVar.u = -1;
            if (a3eVar.getMarginEnd() == 0) {
                a3eVar.setMarginEnd((drawable != null ? drawable.getIntrinsicWidth() : 0) > 0 ? this.B : 0);
            }
            cellMiddleView.setLayoutParams(a3eVar);
            cellMiddleView.bringToFront();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsMenuCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsMenuCell(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
