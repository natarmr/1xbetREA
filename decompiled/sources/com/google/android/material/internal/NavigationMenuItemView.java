package com.google.android.material.internal;

import a.a4n0;
import a.c46;
import a.hz30;
import a.i900;
import a.itf0;
import a.m240;
import a.mvq;
import a.rgu0;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends mvq implements m240 {
    public static final int[] j1 = {R.attr.state_checked};
    public FrameLayout A;
    public hz30 B;
    public ColorStateList f1;
    public boolean g1;
    public Drawable h1;
    public final c46 i1;
    public int v;
    public boolean w;
    public boolean x;
    public final boolean y;
    public final CheckedTextView z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = true;
        c46 c46Var = new c46(this, (byte) 7);
        this.i1 = c46Var;
        setOrientation(0);
        LayoutInflater.from(context).inflate(org.xbet.client1.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(org.xbet.client1.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(org.xbet.client1.R.id.design_menu_item_text);
        this.z = checkedTextView;
        rgu0.o(checkedTextView, c46Var);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(org.xbet.client1.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.A.removeAllViews();
            this.A.addView(view);
        }
    }

    @Override // a.m240
    public final void d(hz30 hz30Var) {
        StateListDrawable stateListDrawable;
        this.B = hz30Var;
        int i = hz30Var.f13889a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(hz30Var.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(org.xbet.client1.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(j1, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(hz30Var.isCheckable());
        setChecked(hz30Var.isChecked());
        setEnabled(hz30Var.isEnabled());
        setTitle(hz30Var.e);
        setIcon(hz30Var.getIcon());
        setActionView(hz30Var.getActionView());
        setContentDescription(hz30Var.q);
        a4n0.l(this, hz30Var.r);
        hz30 hz30Var2 = this.B;
        CharSequence charSequence = hz30Var2.e;
        CheckedTextView checkedTextView = this.z;
        if (charSequence == null && hz30Var2.getIcon() == null && this.B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.A;
            if (frameLayout != null) {
                i900 i900Var = (i900) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) i900Var).width = -1;
                this.A.setLayoutParams(i900Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.A;
        if (frameLayout2 != null) {
            i900 i900Var2 = (i900) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) i900Var2).width = -2;
            this.A.setLayoutParams(i900Var2);
        }
    }

    @Override // a.m240
    public hz30 getItemData() {
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        hz30 hz30Var = this.B;
        if (hz30Var != null && hz30Var.isCheckable() && this.B.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, j1);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.x != z) {
            this.x = z;
            this.i1.h(this.z, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.z;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.g1) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f1);
            }
            int i = this.v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.w) {
            if (this.h1 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = itf0.f15351a;
                Drawable drawable2 = resources.getDrawable(org.xbet.client1.R.drawable.navigation_empty_icon, theme);
                this.h1 = drawable2;
                if (drawable2 != null) {
                    int i2 = this.v;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.h1;
        }
        this.z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1 = colorStateList;
        this.g1 = colorStateList != null;
        hz30 hz30Var = this.B;
        if (hz30Var != null) {
            setIcon(hz30Var.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.w = z;
    }

    public void setTextAppearance(int i) {
        this.z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.z.setText(charSequence);
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }
}
