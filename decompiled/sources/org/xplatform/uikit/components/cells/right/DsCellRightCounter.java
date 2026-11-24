package org.xplatform.uikit.components.cells.right;

import a.bqd0;
import a.hab;
import a.hny;
import a.iab;
import a.jmu0;
import a.qg60;
import a.yum0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.accordion.DsAccordion;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.counter.DsCounter;
import org.xplatform.uikit.components.list_checkbox.DsListCheckBox;

/* JADX INFO: loaded from: classes6.dex */
public final class DsCellRightCounter extends LinearLayout implements hab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iab f47231a;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsCellRightCounter(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet2, R.attr.cellRightCounterStyle);
        LayoutInflater.from(context).inflate(R.layout.cell_right_counter_view, this);
        int i2 = R.id.accordion;
        DsAccordion dsAccordion = (DsAccordion) yum0.f(this, R.id.accordion);
        if (dsAccordion != null) {
            i2 = R.id.button;
            DsButton dsButton = (DsButton) yum0.f(this, R.id.button);
            if (dsButton != null) {
                i2 = R.id.checkbox;
                DsListCheckBox dsListCheckBox = (DsListCheckBox) yum0.f(this, R.id.checkbox);
                if (dsListCheckBox != null) {
                    i2 = R.id.counter;
                    DsCounter dsCounter = (DsCounter) yum0.f(this, R.id.counter);
                    if (dsCounter != null) {
                        i2 = R.id.ivIcon;
                        ImageView imageView = (ImageView) yum0.f(this, R.id.ivIcon);
                        if (imageView != null) {
                            i2 = R.id.space;
                            Space space = (Space) yum0.f(this, R.id.space);
                            if (space != null) {
                                this.f47231a = new iab(this, dsAccordion, dsButton, dsListCheckBox, dsCounter, imageView, space, (byte) 0);
                                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, bqd0.p, R.attr.cellRightCounterStyle, 0);
                                boolean z = typedArrayObtainStyledAttributes.getBoolean(6, false);
                                dsListCheckBox.setVisibility(z ? 0 : 8);
                                if (z) {
                                    dsAccordion.setVisibility(8);
                                    dsButton.setVisibility(8);
                                    imageView.setVisibility(8);
                                }
                                a();
                                boolean z2 = typedArrayObtainStyledAttributes.getBoolean(4, false);
                                dsAccordion.setVisibility(z2 ? 0 : 8);
                                if (z2) {
                                    dsListCheckBox.setVisibility(8);
                                    dsButton.setVisibility(8);
                                    imageView.setVisibility(8);
                                }
                                a();
                                boolean z3 = typedArrayObtainStyledAttributes.getBoolean(5, false);
                                dsButton.setVisibility(z3 ? 0 : 8);
                                if (z3) {
                                    dsListCheckBox.setVisibility(8);
                                    dsAccordion.setVisibility(8);
                                    imageView.setVisibility(8);
                                }
                                a();
                                boolean z4 = typedArrayObtainStyledAttributes.getBoolean(7, false);
                                imageView.setVisibility(z4 ? 0 : 8);
                                if (z4) {
                                    dsListCheckBox.setVisibility(8);
                                    dsAccordion.setVisibility(8);
                                    dsButton.setVisibility(8);
                                }
                                a();
                                setButtonIcon(typedArrayObtainStyledAttributes.getDrawable(0));
                                setCount(Integer.valueOf(typedArrayObtainStyledAttributes.getInt(1, 0)));
                                setIcon(typedArrayObtainStyledAttributes.getDrawable(2));
                                setIconTint(typedArrayObtainStyledAttributes.getColorStateList(3));
                                typedArrayObtainStyledAttributes.recycle();
                                return;
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void setIconTint(ColorStateList colorStateList) {
        ((ImageView) this.f47231a.c).setImageTintList(colorStateList);
    }

    public final void a() {
        iab iabVar = this.f47231a;
        Space space = (Space) iabVar.h;
        int i = 8;
        if (((DsListCheckBox) iabVar.f).getVisibility() == 8 && ((DsAccordion) iabVar.e).getVisibility() == 8 && ((DsButton) iabVar.b).getVisibility() == 8 && ((ImageView) iabVar.c).getVisibility() == 8) {
            i = 0;
        }
        space.setVisibility(i);
    }

    public final void setAccordionExpanded(boolean z) {
        ((DsAccordion) this.f47231a.e).setExpanded(z);
    }

    public final void setButtonIcon(Drawable drawable) {
        AppCompatImageView icon = ((DsButton) this.f47231a.b).getIcon();
        if (icon != null) {
            icon.setImageDrawable(drawable);
        }
    }

    public final void setCheckBoxChecked(boolean z) {
        ((DsListCheckBox) this.f47231a.f).setChecked(z);
        super.setSelected(z);
    }

    public final void setCheckBoxEnabledWithAlpha(boolean z) {
        iab iabVar = this.f47231a;
        ((DsListCheckBox) iabVar.f).setEnabled(z);
        ((DsListCheckBox) iabVar.f).setAlpha(z ? 1.0f : 0.2f);
    }

    public final void setCount(Integer num) {
        ((DsCounter) this.f47231a.g).setCount(num);
    }

    public final void setCounterBackgroundColor(Integer num) {
        ((DsCounter) this.f47231a.g).h(num);
    }

    public final void setCounterColor(int i) {
        ((DsCounter) this.f47231a.g).setTextColor(i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        iab iabVar = this.f47231a;
        ((DsListCheckBox) iabVar.f).setEnabled(z);
        jmu0.b((DsCounter) iabVar.g, z);
        jmu0.b((DsAccordion) iabVar.e, z);
    }

    public final void setIcon(Drawable drawable) {
        ((ImageView) this.f47231a.c).setImageDrawable(drawable);
    }

    public final void setOnAccordionClickListener(View.OnClickListener onClickListener) {
        ((DsAccordion) this.f47231a.e).setOnClickListener(onClickListener);
    }

    public final void setOnButtonClickListener(View.OnClickListener onClickListener) {
        ((DsButton) this.f47231a.b).setOnClickListener(onClickListener);
    }

    public final void setOnCheckBoxCheckedChangeListener(qg60 qg60Var) {
        ((DsListCheckBox) this.f47231a.f).setCheckedChangeListener(qg60Var);
    }

    public final void setOnCheckBoxClickListener(View.OnClickListener onClickListener) {
        ((DsListCheckBox) this.f47231a.f).setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        ((DsListCheckBox) this.f47231a.f).setChecked(z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCellRightCounter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCellRightCounter(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
