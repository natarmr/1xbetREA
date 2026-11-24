package org.xplatform.cyber.game.universal.impl.presentation.russianlotto.view;

import a.cck;
import a.hny;
import a.q3d;
import a.rgu0;
import a.tog0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class RussianLottoBarrelsView extends FrameLayout {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46536a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final ArrayList f;
    public final int g;
    public boolean h;

    /* JADX WARN: Illegal instructions before constructor call */
    public RussianLottoBarrelsView(Context context, AttributeSet attributeSet, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        boolean z = context.getResources().getBoolean(R.bool.isTablet);
        this.f46536a = z;
        this.b = context.getResources().getDimensionPixelSize(R.dimen.space_2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.space_4);
        this.c = dimensionPixelSize;
        this.d = context.getResources().getDimensionPixelSize(R.dimen.space_6);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.size_22);
        this.f = new ArrayList();
        this.g = z ? context.getResources().getDisplayMetrics().widthPixels <= 1400 ? 6 : 8 : 12;
        setLayoutDirection(0);
        setPadding(getPaddingLeft(), dimensionPixelSize, getPaddingRight(), dimensionPixelSize);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.d;
        boolean z = this.f46536a;
        int i5 = ((this.e + this.b) * this.g) + (z ? i4 * 2 : 0);
        if (z) {
            setMeasuredDimension(i5, getMeasuredHeight());
        }
        if (!z) {
            i4 = (measuredWidth - i5) / 2;
        }
        setPadding(i4, getPaddingTop(), i4, getPaddingBottom());
    }

    public final void setItems(List<Integer> list) {
        list.getClass();
        if (!this.f46536a) {
            setVisibility(!list.isEmpty() ? 0 : 8);
        }
        boolean z = this.h;
        ArrayList arrayList = this.f;
        boolean z2 = !z ? arrayList.isEmpty() : list.size() - arrayList.size() > 8;
        Iterator<T> it = list.iterator();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            int i6 = this.b;
            if (!zHasNext) {
                if (i2 != 0) {
                    i4++;
                }
                int i7 = (this.c * 2) + ((this.e + i6) * i4);
                if (i7 > getMinimumHeight()) {
                    setMinimumHeight(i7);
                }
                this.h = true;
                return;
            }
            Object next = it.next();
            int i8 = i3 + 1;
            if (i3 < 0) {
                q3d.p();
                throw null;
            }
            int iIntValue = ((Number) next).intValue();
            if (CollectionsKt.W(i3, arrayList) == null) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.synthetic_russian_lotto_barrel_view, (ViewGroup) this, false);
                if (viewInflate == null) {
                    hny.u("rootView");
                    return;
                }
                TextView textView = (TextView) viewInflate;
                cck cckVar = new cck(textView, textView);
                int i9 = (textView.getLayoutParams().width + i6) * i2;
                int i10 = (textView.getLayoutParams().height + i6) * i4;
                textView.setX(i9);
                textView.setY(i10);
                textView.setText(String.valueOf(iIntValue));
                if (z2) {
                    WeakHashMap weakHashMap = rgu0.f30456a;
                    if (textView.isAttachedToWindow()) {
                        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                        alphaAnimation.setStartOffset(((long) i5) * 700);
                        alphaAnimation.setDuration(700L);
                        textView.startAnimation(alphaAnimation);
                    } else {
                        textView.addOnAttachStateChangeListener(new tog0(textView, this, i5));
                    }
                }
                addView(textView);
                arrayList.add(cckVar);
                i5++;
            } else {
                i2 = i2;
            }
            int i11 = i2;
            if (i11 == this.g - 1) {
                i4++;
                i2 = 0;
            } else {
                i2 = i11 + 1;
            }
            i3 = i8;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RussianLottoBarrelsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RussianLottoBarrelsView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
