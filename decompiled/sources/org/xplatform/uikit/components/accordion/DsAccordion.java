package org.xplatform.uikit.components.accordion;

import a.bqd0;
import a.dc;
import a.jf4;
import a.ktt0;
import a.ngh;
import a.twn;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Unit;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public class DsAccordion extends FrameLayout {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47222a;
    public boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsAccordion(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        dc dcVar = dc.f5825a;
        this.f47222a = 0;
        ngh nghVar = new ngh(this, context, (byte) 23);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.f3024a, i, 0);
        nghVar.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        setClickable(true);
        setFocusable(true);
    }

    public static final Unit a(DsAccordion dsAccordion, Context context, TypedArray typedArray) {
        int i;
        typedArray.getClass();
        dc dcVar = dc.f5825a;
        int i2 = typedArray.getInt(0, 0);
        dsAccordion.f47222a = i2;
        if (i2 == 0) {
            i = R.layout.accordion_view;
        } else if (i2 == 1) {
            i = R.layout.accordion_secondary_view;
        } else {
            if (i2 != 2) {
                jf4.o(twn.m(i2, "Unknown style value: "));
                return null;
            }
            i = R.layout.accordion_clear_view;
        }
        LayoutInflater.from(context).inflate(i, (ViewGroup) dsAccordion, true);
        ImageView imageView = (ImageView) dsAccordion.findViewById(R.id.accordionChevron);
        Integer numL = ktt0.l(typedArray, 2);
        if (numL != null) {
            int iIntValue = numL.intValue();
            imageView.getClass();
            imageView.clearColorFilter();
            imageView.setImageTintList(ColorStateList.valueOf(iIntValue));
        }
        Integer numL2 = ktt0.l(typedArray, 1);
        if (numL2 != null) {
            dsAccordion.setupBackground(numL2.intValue());
        }
        dsAccordion.setExpanded(typedArray.getBoolean(3, dsAccordion.b));
        return Unit.f46060a;
    }

    private final void setupBackground(int i) {
        int i2 = this.f47222a;
        dc dcVar = dc.f5825a;
        if (i2 != 2) {
            View viewFindViewById = findViewById(R.id.background);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(getContext().getResources().getDimension(R.dimen.radius_full));
            gradientDrawable.setColor(i);
            viewFindViewById.setBackground(gradientDrawable);
        }
    }

    public final boolean getExpanded() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrMergeDrawableStates = View.mergeDrawableStates(super.onCreateDrawableState(i + 1), new int[]{this.b ? android.R.attr.state_expanded : -16842920});
        iArrMergeDrawableStates.getClass();
        return iArrMergeDrawableStates;
    }

    public final void setAccordionBackgroundColor(int i) {
        int i2 = this.f47222a;
        dc dcVar = dc.f5825a;
        if (i2 != 2) {
            setupBackground(i);
        }
    }

    public final void setAccordionIconColor(int i) {
        ImageView imageView = (ImageView) findViewById(R.id.accordionChevron);
        imageView.getClass();
        imageView.clearColorFilter();
        imageView.setImageTintList(ColorStateList.valueOf(i));
    }

    public final void setExpanded(boolean z) {
        this.b = z;
        refreshDrawableState();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsAccordion(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsAccordion(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ DsAccordion(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, (i & 4) != 0 ? 0 : R.attr.accordionSecondaryStyle);
    }
}
