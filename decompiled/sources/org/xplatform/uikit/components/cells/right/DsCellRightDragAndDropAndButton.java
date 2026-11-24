package org.xplatform.uikit.components.cells.right;

import a.hab;
import a.hny;
import a.vd7;
import a.yum0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes5.dex */
public final class DsCellRightDragAndDropAndButton extends ConstraintLayout implements hab {
    public final vd7 q;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsCellRightDragAndDropAndButton(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.cellRightDragAndDropStyle);
        LayoutInflater.from(context).inflate(R.layout.cell_right_drag_and_drop_and_button_view, this);
        int i2 = R.id.button;
        DsButton dsButton = (DsButton) yum0.f(this, R.id.button);
        if (dsButton != null) {
            i2 = R.id.icon;
            ImageView imageView = (ImageView) yum0.f(this, R.id.icon);
            if (imageView != null) {
                this.q = new vd7(this, dsButton, imageView, (byte) 3);
                return;
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final DsButton getButton() {
        return (DsButton) this.q.c;
    }

    public final View getDragAndDropView() {
        return (ImageView) this.q.d;
    }

    public final void setButtonIcon(int i) {
        ((DsButton) this.q.c).i(i);
    }

    public final void setIconTint(ColorStateList colorStateList) {
        ((ImageView) this.q.d).setImageTintList(colorStateList);
    }

    public final void setIconTint(int i) {
        setIconTint(ColorStateList.valueOf(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCellRightDragAndDropAndButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCellRightDragAndDropAndButton(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
