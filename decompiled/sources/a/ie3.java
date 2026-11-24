package a;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class ie3 extends of00 implements je3 {
    public CharSequence Y;
    public fe3 Z;
    public final Rect f1;
    public int g1;
    public final /* synthetic */ androidx.appcompat.widget.b h1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie3(androidx.appcompat.widget.b bVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.h1 = bVar;
        this.f1 = new Rect();
        this.o = bVar;
        this.y = true;
        this.z.setFocusable(true);
        this.p = new ge3(this, (byte) 0);
    }

    public final void c() {
        int i;
        xd3 xd3Var = this.z;
        Drawable background = xd3Var.getBackground();
        androidx.appcompat.widget.b bVar = this.h1;
        Rect rect = bVar.h;
        if (background != null) {
            background.getPadding(rect);
            boolean z = cmu0.f4626a;
            i = bVar.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = bVar.getPaddingLeft();
        int paddingRight = bVar.getPaddingRight();
        int width = bVar.getWidth();
        int i2 = bVar.g;
        if (i2 == -2) {
            int iA = bVar.a(this.Z, xd3Var.getBackground());
            int i3 = (bVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i3) {
                iA = i3;
            }
            b(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            b((width - paddingLeft) - paddingRight);
        } else {
            b(i2);
        }
        boolean z2 = cmu0.f4626a;
        this.f = bVar.getLayoutDirection() == 1 ? (((width - paddingRight) - this.e) - this.g1) + i : paddingLeft + this.g1 + i;
    }

    @Override // a.je3
    public final CharSequence i() {
        return this.Y;
    }

    @Override // a.je3
    public final void j(CharSequence charSequence) {
        this.Y = charSequence;
    }

    @Override // a.je3
    public final void l(int i) {
        this.g1 = i;
    }

    @Override // a.je3
    public final void m(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        xd3 xd3Var = this.z;
        boolean zIsShowing = xd3Var.isShowing();
        c();
        xd3Var.setInputMethodMode(2);
        q();
        hil hilVar = this.c;
        byte b = 1;
        hilVar.setChoiceMode(1);
        hilVar.setTextDirection(i);
        hilVar.setTextAlignment(i2);
        androidx.appcompat.widget.b bVar = this.h1;
        int selectedItemPosition = bVar.getSelectedItemPosition();
        hil hilVar2 = this.c;
        if (xd3Var.isShowing() && hilVar2 != null) {
            hilVar2.setListSelectionHidden(false);
            hilVar2.setSelection(selectedItemPosition);
            if (hilVar2.getChoiceMode() != 0) {
                hilVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = bVar.getViewTreeObserver()) == null) {
            return;
        }
        de3 de3Var = new de3(this, b);
        viewTreeObserver.addOnGlobalLayoutListener(de3Var);
        xd3Var.setOnDismissListener(new he3(this, de3Var));
    }

    @Override // a.of00, a.je3
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.Z = (fe3) listAdapter;
    }
}
