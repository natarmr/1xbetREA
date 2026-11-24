package org.xplatform.uikit.components.cells.right;

import a.bqd0;
import a.hab;
import a.hny;
import a.vd7;
import a.yum0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes6.dex */
public final class DsCellRightIconAndButton extends LinearLayout implements hab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vd7 f47233a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsCellRightIconAndButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.cell_right_icon_with_button_view, this);
        int i = R.id.button;
        DsButton dsButton = (DsButton) yum0.f(this, R.id.button);
        if (dsButton != null) {
            i = R.id.icon;
            ImageView imageView = (ImageView) yum0.f(this, R.id.icon);
            if (imageView != null) {
                this.f47233a = new vd7(this, dsButton, imageView, (byte) 4);
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.r, 0, 0);
                setIcon(typedArrayObtainStyledAttributes.getDrawable(1));
                setButtonIcon(typedArrayObtainStyledAttributes.getDrawable(0));
                dsButton.setClickable(isClickable());
                imageView.setClickable(isClickable());
                typedArrayObtainStyledAttributes.recycle();
                return;
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final void setButtonIcon(Drawable drawable) {
        AppCompatImageView icon = ((DsButton) this.f47233a.c).getIcon();
        if (icon != null) {
            icon.setImageDrawable(drawable);
        }
    }

    public final void setIcon(Drawable drawable) {
        ((ImageView) this.f47233a.d).setImageDrawable(drawable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCellRightIconAndButton(Context context) {
        this(context, null);
        context.getClass();
    }
}
