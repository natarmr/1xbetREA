package org.xplatform.app_update.impl.presentation.update_screen.views.content.dropdowncards;

import a.a3e;
import a.dil;
import a.ewm0;
import a.hxm0;
import a.iun;
import a.pn3;
import a.q7x;
import a.r3d;
import a.r9g;
import a.sj3;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.app_update.impl.presentation.update_screen.views.content.dropdowncards.model.DropDownCard;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46343a;
    public final int b;
    public boolean c;
    public List d;
    public int e;
    public float f;
    public float g;
    public final ArrayList h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context, null, 0);
        context.getClass();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.space_16);
        this.f46343a = dimensionPixelSize;
        this.b = context.getResources().getDimensionPixelSize(R.dimen.space_32);
        this.d = iun.f15405a;
        this.h = new ArrayList();
        setId(R.id.dropDownCardsView);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    public final void a() {
        View childAt;
        ArrayList arrayList;
        if (hxm0.q(this).isEmpty() || !this.c || (childAt = getChildAt(this.e)) == null) {
            return;
        }
        int height = childAt.getHeight();
        int i = this.e;
        int i2 = this.b;
        int i3 = this.f46343a;
        int i4 = height + (i == 0 ? i3 : i2);
        float f = i4;
        if (this.f < f) {
            removeView(childAt);
            a();
            return;
        }
        float f2 = this.g;
        float f3 = i4 + i3;
        int i5 = 2;
        Property property = FrameLayout.ALPHA;
        Property property2 = FrameLayout.TRANSLATION_Y;
        byte b = 0;
        if (f2 >= f3) {
            if (f2 >= f) {
                float top = f2 - f;
                this.g = top;
                this.e = i + 1;
                if (this.i != 0) {
                    top = childAt.getTop();
                }
                this.i = 0;
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(childAt, PropertyValuesHolder.ofFloat((Property<?, Float>) property, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) property2, top - f, this.g));
                objectAnimatorOfPropertyValuesHolder.setStartDelay(1500L);
                objectAnimatorOfPropertyValuesHolder.setDuration(1000L);
                objectAnimatorOfPropertyValuesHolder.setInterpolator(new OvershootInterpolator(1.0f));
                objectAnimatorOfPropertyValuesHolder.setAutoCancel(true);
                objectAnimatorOfPropertyValuesHolder.addListener(new r9g((Object) this, (byte) 2));
                objectAnimatorOfPropertyValuesHolder.start();
                return;
            }
            return;
        }
        List listSubList = hxm0.q(this).subList(0, this.e);
        ArrayList arrayList2 = new ArrayList(r3d.q(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.h;
            if (!zHasNext) {
                break;
            }
            View view = (View) it.next();
            float f4 = this.g;
            byte b2 = b;
            if (f > f4 - i3) {
                this.g = f4 + view.getHeight() + i2;
                this.i = view.getHeight() + i2 + this.i;
                this.e--;
                arrayList.add(view);
                float translationY = view.getTranslationY();
                float f5 = this.f + f;
                float[] fArr = new float[i5];
                fArr[b2] = translationY;
                fArr[1] = f5;
                float[] fArr2 = new float[i5];
                // fill-array-data instruction
                fArr2[0] = 1.0f;
                fArr2[1] = 0.0f;
                ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) property, fArr2), PropertyValuesHolder.ofFloat((Property<?, Float>) property2, fArr));
                if (view.getHeight() < i4 * 2 || i4 < view.getHeight() * i5) {
                    objectAnimatorOfPropertyValuesHolder2.setDuration(1000L);
                }
                objectAnimatorOfPropertyValuesHolder2.setStartDelay(1500L);
                objectAnimatorOfPropertyValuesHolder2.setInterpolator(new OvershootInterpolator(1.0f));
                objectAnimatorOfPropertyValuesHolder2.addListener(new dil(view, b2));
                objectAnimatorOfPropertyValuesHolder2.setAutoCancel(true);
                objectAnimatorOfPropertyValuesHolder2.start();
            } else {
                float translationY2 = view.getTranslationY();
                float translationY3 = view.getTranslationY() + this.i;
                float[] fArr3 = new float[i5];
                fArr3[b2] = translationY2;
                fArr3[1] = translationY3;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr3);
                objectAnimatorOfFloat.setInterpolator(new OvershootInterpolator(1.0f));
                objectAnimatorOfFloat.setDuration(1000L);
                objectAnimatorOfFloat.setStartDelay(1500L);
                objectAnimatorOfFloat.setAutoCancel(true);
                objectAnimatorOfFloat.start();
            }
            arrayList2.add(Unit.f46060a);
            property = property;
            i5 = 2;
            b = 0;
        }
        arrayList.getClass();
        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            removeView((View) it2.next());
            arrayList3.add(Unit.f46060a);
        }
        ewm0.p(this, arrayList);
        arrayList.clear();
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.c || this.f == 0.0f) {
            return;
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (this.c) {
            this.c = false;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f == 0.0f) {
            float f = i4 - i2;
            this.f = f;
            this.g = f;
            a();
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof DropDownCardsView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        DropDownCardsView$SavedState dropDownCardsView$SavedState = (DropDownCardsView$SavedState) parcelable;
        this.c = dropDownCardsView$SavedState.b;
        this.d = dropDownCardsView$SavedState.c;
        this.e = dropDownCardsView$SavedState.d;
        this.f = dropDownCardsView$SavedState.e;
        this.g = dropDownCardsView$SavedState.f;
        this.i = dropDownCardsView$SavedState.g;
        super.onRestoreInstanceState(dropDownCardsView$SavedState.f46342a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new DropDownCardsView$SavedState(super.onSaveInstanceState(), this.c, this.d, this.e, this.f, this.g, this.i);
    }

    public final void setContainerLayoutParams(pn3 pn3Var) {
        pn3Var.getClass();
        a3e a3eVar = new a3e(pn3Var.f27265a, pn3Var.b);
        q7x.G(a3eVar, pn3Var);
        a3eVar.P = getResources().getDimensionPixelSize(R.dimen.size_512);
        setLayoutParams(a3eVar);
    }

    public final void setContent(List<? extends DropDownCard> list) {
        list.getClass();
        if (!hxm0.q(this).isEmpty() || list.isEmpty()) {
            return;
        }
        this.d = list;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (DropDownCard dropDownCard : list) {
            MaterialTextView materialTextView = new MaterialTextView(getContext());
            materialTextView.setId(View.generateViewId());
            materialTextView.setTag("DropDownCardTestTag");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(materialTextView.getContext().getResources().getDimensionPixelSize(R.dimen.drop_down_card_width), -2);
            layoutParams.gravity = dropDownCard instanceof DropDownCard.LeftCard ? 8388611 : 8388613;
            materialTextView.setLayoutParams(layoutParams);
            Drawable drawable = materialTextView.getContext().getDrawable(dropDownCard.getB());
            drawable.getClass();
            VectorDrawable vectorDrawable = (VectorDrawable) drawable;
            Context context = materialTextView.getContext();
            context.getClass();
            sj3.B0(vectorDrawable, context, R.attr.uikitPrimary);
            Drawable drawable2 = materialTextView.getContext().getDrawable(R.drawable.ic_drop_down_card_item);
            drawable2.getClass();
            LayerDrawable layerDrawable = (LayerDrawable) drawable2;
            layerDrawable.setDrawableByLayerId(R.id.drop_down_card_icon, vectorDrawable);
            materialTextView.setBackground(materialTextView.getContext().getDrawable(R.drawable.bg_drop_down_card_item));
            materialTextView.setGravity(16);
            materialTextView.setAlpha(0.0f);
            materialTextView.setEllipsize(TextUtils.TruncateAt.END);
            materialTextView.setTextAppearance(materialTextView.getContext(), R.style.TextStyle_Text_Regular);
            materialTextView.setLayoutDirection(3);
            materialTextView.setTextColor(materialTextView.getContext().getColor(R.color.static_white));
            materialTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(layerDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
            materialTextView.setCompoundDrawablePadding(materialTextView.getContext().getResources().getDimensionPixelSize(R.dimen.space_8));
            materialTextView.setText(dropDownCard.getF46345a());
            arrayList.add(materialTextView);
        }
        ewm0.p(this, arrayList);
    }
}
