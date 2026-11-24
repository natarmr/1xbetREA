package org.xplatform.core.presentation.views;

import android.R;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class OneXGamesInputEditText extends TextInputEditText {
    public final Rect j;
    public final int k;

    /* JADX WARN: Illegal instructions before constructor call */
    public OneXGamesInputEditText(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.editTextStyle);
        this.j = new Rect();
        this.k = context.getResources().getDimensionPixelOffset(org.xbet.client1.R.dimen.space_8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View getMyParent() {
        ViewParent parent = getParent();
        while (!(parent instanceof TextInputLayout) && parent != 0) {
            parent = parent.getParent();
        }
        return parent == 0 ? this : (View) parent;
    }

    @Override // com.google.android.material.textfield.TextInputEditText, android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        if (rect != null) {
            View myParent = getMyParent();
            Rect rect2 = this.j;
            myParent.getFocusedRect(rect2);
            int i = rect2.bottom + this.k;
            rect2.bottom = i;
            rect.bottom = i;
        }
    }

    @Override // com.google.android.material.textfield.TextInputEditText, android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        if (rect != null) {
            View myParent = getMyParent();
            Rect rect2 = this.j;
            myParent.getGlobalVisibleRect(rect2, point);
            int i = rect2.bottom + this.k;
            rect2.bottom = i;
            rect.bottom = i;
        }
        return globalVisibleRect;
    }

    @Override // com.google.android.material.textfield.TextInputEditText, android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        boolean zRequestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        View myParent = getMyParent();
        int height = myParent.getHeight();
        int right = myParent.getRight();
        int height2 = myParent.getHeight();
        Rect rect2 = this.j;
        rect2.set(0, height, right, height2);
        myParent.requestRectangleOnScreen(rect2, true);
        return zRequestRectangleOnScreen;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneXGamesInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneXGamesInputEditText(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
