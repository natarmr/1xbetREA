package org.xplatform.uikit.components.team_logo;

import a.bqd0;
import a.ktt0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class DsTeamLogo extends LoadableShapeableImageView {
    public ColorStateList f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsTeamLogo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4);
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.o0, 0, 0);
        this.f1 = ktt0.m(1, context, typedArrayObtainStyledAttributes);
        setPlaceholder(typedArrayObtainStyledAttributes.getDrawable(0));
        if (getDrawable() == null) {
            setPlaceholder(getPlaceholder());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void setDrawable(Drawable drawable) {
        boolean z = false;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > intrinsicHeight) {
                intrinsicWidth = intrinsicHeight;
            }
            if (intrinsicWidth > getMaxHeight()) {
                z = true;
            }
        }
        setAdjustViewBounds(z);
        super.setImageDrawable(drawable);
    }

    public final ColorStateList getPlaceholderTint() {
        return this.f1;
    }

    @Override // org.xplatform.uikit.components.views.LoadableShapeableImageView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (drawable == null) {
            setPlaceholder(getPlaceholder());
        } else {
            setDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        setImageDrawable(getContext().getDrawable(i));
    }

    public final void setPlaceholder(int i) {
        setPlaceholder(getContext().getDrawable(i));
    }

    public final void setPlaceholderTint(Integer num) {
        setPlaceholderTint(num != null ? ColorStateList.valueOf(num.intValue()) : null);
    }

    @Override // org.xplatform.uikit.components.views.LoadableShapeableImageView
    public void setPlaceholder(Drawable drawable) {
        super.setPlaceholder(drawable);
        setDrawable(drawable);
    }

    public final void setPlaceholderTint(ColorStateList colorStateList) {
        this.f1 = colorStateList;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsTeamLogo(Context context) {
        this(context, null);
        context.getClass();
    }
}
