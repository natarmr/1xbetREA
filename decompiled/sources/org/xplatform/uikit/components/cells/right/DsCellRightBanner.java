package org.xplatform.uikit.components.cells.right;

import a.bqd0;
import a.hab;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.util.AttributeSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.components.views.LoadableImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class DsCellRightBanner extends LoadableImageView implements hab {
    public Function0 j;
    public boolean k;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsCellRightBanner(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.cellRightBannerStyle);
        this.k = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.n, R.attr.cellRightBannerStyle, 0);
        this.k = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean getResponsive() {
        return this.k;
    }

    public final Function0<Unit> getUpdateAfterSetResource() {
        return this.j;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setAutoMirrored(i == 1);
        }
        Drawable drawable2 = getDrawable();
        if (drawable2 != null) {
            drawable2.invalidateSelf();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        Function0 function0 = this.j;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        Function0 function0 = this.j;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.widget.ImageView
    public void setImageIcon(Icon icon) {
        super.setImageIcon(icon);
        Function0 function0 = this.j;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        Function0 function0 = this.j;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        Function0 function0 = this.j;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setResponsive(boolean z) {
        this.k = z;
    }

    public final void setUpdateAfterSetResource(Function0<Unit> function0) {
        this.j = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCellRightBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCellRightBanner(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
