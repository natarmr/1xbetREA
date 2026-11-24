package androidx.appcompat.view.menu;

import a.a4n0;
import a.hz30;
import a.m240;
import a.mqd0;
import a.nx30;
import a.ox30;
import a.si;
import a.ti;
import a.zi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements m240, View.OnClickListener, zi {
    public hz30 i;
    public CharSequence j;
    public Drawable k;
    public nx30 l;
    public si m;
    public ti n;
    public boolean o;
    public boolean p;
    public final int q;
    public int r;
    public final int s;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.o = j();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mqd0.c, 0, 0);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.s = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.r = -1;
        setSaveEnabled(false);
    }

    @Override // a.zi
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // a.zi
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.i.getIcon() == null;
    }

    @Override // a.m240
    public final void d(hz30 hz30Var) {
        this.i = hz30Var;
        setIcon(hz30Var.getIcon());
        setTitle(hz30Var.getTitleCondensed());
        setId(hz30Var.f13889a);
        setVisibility(hz30Var.isVisible() ? 0 : 8);
        setEnabled(hz30Var.isEnabled());
        if (hz30Var.hasSubMenu() && this.m == null) {
            this.m = new si(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // a.m240
    public hz30 getItemData() {
        return this.i;
    }

    public final boolean j() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void k() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.j);
        if (this.k != null && ((this.i.y & 4) != 4 || (!this.o && !this.p))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.j : null);
        CharSequence charSequence = this.i.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.i.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.i.r;
        if (TextUtils.isEmpty(charSequence2)) {
            a4n0.l(this, z3 ? null : this.i.e);
        } else {
            a4n0.l(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        nx30 nx30Var = this.l;
        if (nx30Var != null) {
            nx30Var.a(this.i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.o = j();
        k();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.r) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.q;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.k == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.k.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        si siVar;
        if (this.i.hasSubMenu() && (siVar = this.m) != null && siVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.p != z) {
            this.p = z;
            hz30 hz30Var = this.i;
            if (hz30Var != null) {
                ox30 ox30Var = hz30Var.n;
                ox30Var.k = true;
                ox30Var.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.k = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.s;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        k();
    }

    public void setItemInvoker(nx30 nx30Var) {
        this.l = nx30Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.r = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(ti tiVar) {
        this.n = tiVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.j = charSequence;
        k();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }
}
